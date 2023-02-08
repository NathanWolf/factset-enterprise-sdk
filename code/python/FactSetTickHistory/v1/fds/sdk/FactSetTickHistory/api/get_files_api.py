"""
    TickHistory

    TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.  # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetTickHistory.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetTickHistory.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetTickHistory.exceptions import ApiException
from fds.sdk.FactSetTickHistory.model.get_files_response import GetFilesResponse
from fds.sdk.FactSetTickHistory.model.get_files_status import GetFilesStatus





class GetFilesApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.v1_get_files_get_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (GetFilesResponse,), 400: (GetFilesStatus,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/get-files',
                'operation_id': 'v1_get_files_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'request_id',
                    'pagination_limit',
                    'pagination_offset',
                ],
                'required': [
                    'request_id',
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
                    'request_id':
                        (str,),
                    'pagination_limit':
                        (int,),
                    'pagination_offset':
                        (int,),
                },
                'attribute_map': {
                    'request_id': 'requestId',
                    'pagination_limit': '_paginationLimit',
                    'pagination_offset': '_paginationOffset',
                },
                'location_map': {
                    'request_id': 'query',
                    'pagination_limit': 'query',
                    'pagination_offset': 'query',
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


    def v1_get_files_get(
        self,
        request_id,
        **kwargs
    ) -> GetFilesResponse:
        """Returns the files from tickhistory endpoint for the specified date range  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            request_id (str): RequestId returned by request-files endpoint to poll and collect results of the query

        Keyword Args:
            pagination_limit (int): Specifies the maximum number of results to return per response page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
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
            GetFilesResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['request_id'] = \
            request_id
        return self.v1_get_files_get_endpoint.call_with_http_info(**kwargs)

    def v1_get_files_get_with_http_info(
        self,
        request_id,
        **kwargs
    ) -> typing.Tuple[GetFilesResponse, int, typing.MutableMapping]:
        """Returns the files from tickhistory endpoint for the specified date range  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            request_id (str): RequestId returned by request-files endpoint to poll and collect results of the query

        Keyword Args:
            pagination_limit (int): Specifies the maximum number of results to return per response page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
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
            GetFilesResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['request_id'] = \
            request_id
        return self.v1_get_files_get_endpoint.call_with_http_info(**kwargs)

    def v1_get_files_get_async(
        self,
        request_id,
        **kwargs
    ) -> "ApplyResult[GetFilesResponse]":
        """Returns the files from tickhistory endpoint for the specified date range  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            request_id (str): RequestId returned by request-files endpoint to poll and collect results of the query

        Keyword Args:
            pagination_limit (int): Specifies the maximum number of results to return per response page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
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
            ApplyResult[GetFilesResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['request_id'] = \
            request_id
        return self.v1_get_files_get_endpoint.call_with_http_info(**kwargs)

    def v1_get_files_get_with_http_info_async(
        self,
        request_id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[GetFilesResponse, int, typing.MutableMapping]]":
        """Returns the files from tickhistory endpoint for the specified date range  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            request_id (str): RequestId returned by request-files endpoint to poll and collect results of the query

        Keyword Args:
            pagination_limit (int): Specifies the maximum number of results to return per response page. [optional] if omitted the server will use the default value of 20
            pagination_offset (int): Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. [optional] if omitted the server will use the default value of 0
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
            ApplyResult[(GetFilesResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['request_id'] = \
            request_id
        return self.v1_get_files_get_endpoint.call_with_http_info(**kwargs)


