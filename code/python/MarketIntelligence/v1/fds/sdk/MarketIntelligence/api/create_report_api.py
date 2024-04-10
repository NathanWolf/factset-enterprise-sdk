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
from fds.sdk.MarketIntelligence.model.miapi_post_request import MIAPIPostRequest
from fds.sdk.MarketIntelligence.model.post_response_info import PostResponseInfo





class CreateReportApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.create_post_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (PostResponseInfo,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/create',
                'operation_id': 'create_post',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'miapi_post_request',
                ],
                'required': [
                    'miapi_post_request',
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
                    'miapi_post_request':
                        (MIAPIPostRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'miapi_post_request': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
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


    def create_post(
        self,
        miapi_post_request,
        **kwargs
    ) -> PostResponseInfo:
        """Create new report templates including portfolio or market news and data.  # noqa: E501

        Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            miapi_post_request (MIAPIPostRequest):

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
            PostResponseInfo
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['miapi_post_request'] = \
            miapi_post_request
        return self.create_post_endpoint.call_with_http_info(**kwargs)

    def create_post_with_http_info(
        self,
        miapi_post_request,
        **kwargs
    ) -> typing.Tuple[PostResponseInfo, int, typing.MutableMapping]:
        """Create new report templates including portfolio or market news and data.  # noqa: E501

        Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            miapi_post_request (MIAPIPostRequest):

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
            PostResponseInfo
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['miapi_post_request'] = \
            miapi_post_request
        return self.create_post_endpoint.call_with_http_info(**kwargs)

    def create_post_async(
        self,
        miapi_post_request,
        **kwargs
    ) -> "ApplyResult[PostResponseInfo]":
        """Create new report templates including portfolio or market news and data.  # noqa: E501

        Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            miapi_post_request (MIAPIPostRequest):

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
            ApplyResult[PostResponseInfo]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['miapi_post_request'] = \
            miapi_post_request
        return self.create_post_endpoint.call_with_http_info(**kwargs)

    def create_post_with_http_info_async(
        self,
        miapi_post_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[PostResponseInfo, int, typing.MutableMapping]]":
        """Create new report templates including portfolio or market news and data.  # noqa: E501

        Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            miapi_post_request (MIAPIPostRequest):

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
            ApplyResult[(PostResponseInfo, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['miapi_post_request'] = \
            miapi_post_request
        return self.create_post_endpoint.call_with_http_info(**kwargs)


