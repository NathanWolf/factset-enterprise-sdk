"""
    Market Intelligence

    Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.MarketIntelligence.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.MarketIntelligence.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.MarketIntelligence.exceptions import ApiException
from fds.sdk.MarketIntelligence.model.fetch_report_poll_id import FetchReportPollID





class RetrieveRefreshedReportApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_data_report_id_get_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (FetchReportPollID,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/get-data/{report_id}',
                'operation_id': 'get_data_report_id_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'report_id',
                ],
                'required': [
                    'report_id',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'report_id':
                        (str,),
                },
                'attribute_map': {
                    'report_id': 'report_id',
                },
                'location_map': {
                    'report_id': 'path',
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


    def get_data_report_id_get(
        self,
        report_id,
        **kwargs
    ) -> FetchReportPollID:
        """Retrieve data for desired report.  # noqa: E501

        Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            report_id (str): example: 65ba6dd63fb366464646426d0b

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            FetchReportPollID
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['report_id'] = \
            report_id
        return self.get_data_report_id_get_endpoint.call_with_http_info(**kwargs)

    def get_data_report_id_get_with_http_info(
        self,
        report_id,
        **kwargs
    ) -> typing.Tuple[FetchReportPollID, int, typing.MutableMapping]:
        """Retrieve data for desired report.  # noqa: E501

        Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            report_id (str): example: 65ba6dd63fb366464646426d0b

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            FetchReportPollID
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['report_id'] = \
            report_id
        return self.get_data_report_id_get_endpoint.call_with_http_info(**kwargs)

    def get_data_report_id_get_async(
        self,
        report_id,
        **kwargs
    ) -> "ApplyResult[FetchReportPollID]":
        """Retrieve data for desired report.  # noqa: E501

        Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            report_id (str): example: 65ba6dd63fb366464646426d0b

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[FetchReportPollID]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['report_id'] = \
            report_id
        return self.get_data_report_id_get_endpoint.call_with_http_info(**kwargs)

    def get_data_report_id_get_with_http_info_async(
        self,
        report_id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[FetchReportPollID, int, typing.MutableMapping]]":
        """Retrieve data for desired report.  # noqa: E501

        Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            report_id (str): example: 65ba6dd63fb366464646426d0b

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[(FetchReportPollID, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['report_id'] = \
            report_id
        return self.get_data_report_id_get_endpoint.call_with_http_info(**kwargs)


