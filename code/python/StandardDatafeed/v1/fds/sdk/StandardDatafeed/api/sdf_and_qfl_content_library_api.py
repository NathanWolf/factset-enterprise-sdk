"""
    SDF Download API

    The Standard DataFeed (SDF) Download API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader Application. This API provides an alternative for users who are unable to utilize the Loader application due to following reasons:   - Inability to install 3rd party executables due to Corporate Security policies     - Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed   - Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution     This API allows users to retrieve maximum of latest 30 days of data     Additional parameters are available to filter requests to get the exact files users are looking for.    QFL data is delivered through Content API & Bulk Data API (SDF API)  - Content API : Provides direct access to FactSet-hosted QFL data.  Suitable for interactive, ad hoc QFL requests.  Constraints on large extracts.  Costs are based on consumption, i.e. more calls can result in more costs.  - Bulk Data API : Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).  # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Contact: teammustang@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.StandardDatafeed.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.StandardDatafeed.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.StandardDatafeed.exceptions import ApiException
from fds.sdk.StandardDatafeed.model.list_files200_response import ListFiles200Response
from fds.sdk.StandardDatafeed.model.list_files400_response import ListFiles400Response





class SDFAndQFLContentLibraryApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_v1_list_files_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (ListFiles200Response,), 400: (ListFiles400Response,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/list-files',
                'operation_id': 'get_v1_list_files',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'schema',
                    'bundle',
                    'type',
                    'start_date',
                    'end_date',
                    'pagination_limit',
                    'pagination_offset',
                    'sort',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                    'type',
                    'sort',
                ],
                'validation': [
                    'pagination_limit',
                ]
            },
            root_map={
                'validations': {
                    ('pagination_limit',): {

                        'inclusive_maximum': 500,
                    },
                },
                'allowed_values': {
                    ('type',): {

                        "FULL": "full",
                        "DELTA": "delta"
                    },
                    ('sort',): {

                        "STARTDATE": "startDate"
                    },
                },
                'openapi_types': {
                    'schema':
                        (str,),
                    'bundle':
                        (str,),
                    'type':
                        (str,),
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                    'pagination_limit':
                        (int,),
                    'pagination_offset':
                        (int,),
                    'sort':
                        (str,),
                },
                'attribute_map': {
                    'schema': 'schema',
                    'bundle': 'bundle',
                    'type': 'type',
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'pagination_limit': '_paginationLimit',
                    'pagination_offset': '_paginationOffset',
                    'sort': '_sort',
                },
                'location_map': {
                    'schema': 'query',
                    'bundle': 'query',
                    'type': 'query',
                    'start_date': 'query',
                    'end_date': 'query',
                    'pagination_limit': 'query',
                    'pagination_offset': 'query',
                    'sort': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )


    @staticmethod
    def apply_kwargs_defaults(kwargs, return_http_data_only, async_req):
        kwargs["async_req"] = async_req
        kwargs["_return_http_data_only"] = return_http_data_only
        kwargs["_preload_content"] = kwargs.get("_preload_content", True)
        kwargs["_request_timeout"] = kwargs.get("_request_timeout", None)
        kwargs["_check_input_type"] = kwargs.get("_check_input_type", True)
        kwargs["_check_return_type"] = kwargs.get("_check_return_type", True)
        kwargs["_spec_property_naming"] = kwargs.get("_spec_property_naming", False)
        kwargs["_content_type"] = kwargs.get("_content_type")
        kwargs["_host_index"] = kwargs.get("_host_index")


    def get_v1_list_files(
        self,
        **kwargs
    ) -> ListFiles200Response:
        """get_v1_list_files  # noqa: E501

        This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only


        Keyword Args:
            schema (str): schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** . [optional]
            bundle (str): bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups. [optional]
            type (str): file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**. [optional]
            start_date (str): The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday. [optional]
            end_date (str): The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today. [optional]
            pagination_limit (int): Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
            sort (str): Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. [optional] if omitted the server will use the default value of "startDate"
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            ListFiles200Response
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        return self.get_v1_list_files_endpoint.call_with_http_info(**kwargs)

    def get_v1_list_files_with_http_info(
        self,
        **kwargs
    ) -> typing.Tuple[ListFiles200Response, int, typing.MutableMapping]:
        """get_v1_list_files  # noqa: E501

        This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers


        Keyword Args:
            schema (str): schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** . [optional]
            bundle (str): bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups. [optional]
            type (str): file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**. [optional]
            start_date (str): The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday. [optional]
            end_date (str): The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today. [optional]
            pagination_limit (int): Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
            sort (str): Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. [optional] if omitted the server will use the default value of "startDate"
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            ListFiles200Response
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        return self.get_v1_list_files_endpoint.call_with_http_info(**kwargs)

    def get_v1_list_files_async(
        self,
        **kwargs
    ) -> "ApplyResult[ListFiles200Response]":
        """get_v1_list_files  # noqa: E501

        This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult


        Keyword Args:
            schema (str): schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** . [optional]
            bundle (str): bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups. [optional]
            type (str): file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**. [optional]
            start_date (str): The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday. [optional]
            end_date (str): The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today. [optional]
            pagination_limit (int): Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
            sort (str): Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. [optional] if omitted the server will use the default value of "startDate"
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            ApplyResult[ListFiles200Response]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        return self.get_v1_list_files_endpoint.call_with_http_info(**kwargs)

    def get_v1_list_files_with_http_info_async(
        self,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[ListFiles200Response, int, typing.MutableMapping]]":
        """get_v1_list_files  # noqa: E501

        This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult


        Keyword Args:
            schema (str): schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** . [optional]
            bundle (str): bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups. [optional]
            type (str): file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**. [optional]
            start_date (str): The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday. [optional]
            end_date (str): The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today. [optional]
            pagination_limit (int): Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
            sort (str): Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. [optional] if omitted the server will use the default value of "startDate"
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _spec_property_naming (bool): True if the variable names in the input data
                are serialized names, as specified in the OpenAPI document.
                False if the variable names in the input data
                are pythonic names, e.g. snake case (default)
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
        Returns:
            ApplyResult[(ListFiles200Response, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        return self.get_v1_list_files_endpoint.call_with_http_info(**kwargs)


