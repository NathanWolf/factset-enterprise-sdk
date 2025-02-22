"""
    Open:Risk API

    Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.  # noqa: E501

    The version of the OpenAPI document: 1.24.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.OpenRisk.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.OpenRisk.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.OpenRisk.exceptions import ApiException
from fds.sdk.OpenRisk.model.calculate_from_holdings_request_body import CalculateFromHoldingsRequestBody
from fds.sdk.OpenRisk.model.error_response import ErrorResponse
from fds.sdk.OpenRisk.model.generate_id_mapping_request_body import GenerateIDMappingRequestBody
from fds.sdk.OpenRisk.model.inline_response2003 import InlineResponse2003
from fds.sdk.OpenRisk.model.inline_response2004 import InlineResponse2004





class OperationsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.calculate_from_holdings_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (InlineResponse2003,), 400: (ErrorResponse,), 401: (str,), 403: (ErrorResponse,), 404: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/linear/{version}/calculate/from-holdings',
                'operation_id': 'calculate_from_holdings',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'version',
                    'calculate_from_holdings_request_body',
                ],
                'required': [
                    'version',
                    'calculate_from_holdings_request_body',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'version',
                ]
            },
            root_map={
                'validations': {
                    ('version',): {

                        'min_length': 1,
                        'regex': {
                            'pattern': r'^(?:v?(?:(?:[0-9]+|[Xx*])(?:\.(?:[0-9]+|[Xx*])){0,2}))$',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'version':
                        (str,),
                    'calculate_from_holdings_request_body':
                        (CalculateFromHoldingsRequestBody,),
                },
                'attribute_map': {
                    'version': 'version',
                },
                'location_map': {
                    'version': 'path',
                    'calculate_from_holdings_request_body': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json',
                    'text/plain'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client
        )

        self.generate_id_mapping_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (InlineResponse2004,), 400: (ErrorResponse,), 403: (ErrorResponse,), 404: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/linear/{version}/generate/id-mapping',
                'operation_id': 'generate_id_mapping',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'version',
                    'generate_id_mapping_request_body',
                ],
                'required': [
                    'version',
                    'generate_id_mapping_request_body',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'version',
                ]
            },
            root_map={
                'validations': {
                    ('version',): {

                        'min_length': 1,
                        'regex': {
                            'pattern': r'^(?:v?(?:(?:[0-9]+|[Xx*])(?:\.(?:[0-9]+|[Xx*])){0,2}))$',  # noqa: E501
                        },
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'version':
                        (str,),
                    'generate_id_mapping_request_body':
                        (GenerateIDMappingRequestBody,),
                },
                'attribute_map': {
                    'version': 'version',
                },
                'location_map': {
                    'version': 'path',
                    'generate_id_mapping_request_body': 'body',
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


    def calculate_from_holdings(
        self,
        version,
        calculate_from_holdings_request_body,
        **kwargs
    ) -> InlineResponse2003:
        """Calculate risk statistics  # noqa: E501

        Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            calculate_from_holdings_request_body (CalculateFromHoldingsRequestBody):

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
            InlineResponse2003
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['version'] = \
            version
        kwargs['calculate_from_holdings_request_body'] = \
            calculate_from_holdings_request_body
        return self.calculate_from_holdings_endpoint.call_with_http_info(**kwargs)

    def calculate_from_holdings_with_http_info(
        self,
        version,
        calculate_from_holdings_request_body,
        **kwargs
    ) -> typing.Tuple[InlineResponse2003, int, typing.MutableMapping]:
        """Calculate risk statistics  # noqa: E501

        Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            calculate_from_holdings_request_body (CalculateFromHoldingsRequestBody):

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
            InlineResponse2003
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['version'] = \
            version
        kwargs['calculate_from_holdings_request_body'] = \
            calculate_from_holdings_request_body
        return self.calculate_from_holdings_endpoint.call_with_http_info(**kwargs)

    def calculate_from_holdings_async(
        self,
        version,
        calculate_from_holdings_request_body,
        **kwargs
    ) -> "ApplyResult[InlineResponse2003]":
        """Calculate risk statistics  # noqa: E501

        Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            calculate_from_holdings_request_body (CalculateFromHoldingsRequestBody):

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
            ApplyResult[InlineResponse2003]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['version'] = \
            version
        kwargs['calculate_from_holdings_request_body'] = \
            calculate_from_holdings_request_body
        return self.calculate_from_holdings_endpoint.call_with_http_info(**kwargs)

    def calculate_from_holdings_with_http_info_async(
        self,
        version,
        calculate_from_holdings_request_body,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[InlineResponse2003, int, typing.MutableMapping]]":
        """Calculate risk statistics  # noqa: E501

        Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            calculate_from_holdings_request_body (CalculateFromHoldingsRequestBody):

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
            ApplyResult[(InlineResponse2003, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['version'] = \
            version
        kwargs['calculate_from_holdings_request_body'] = \
            calculate_from_holdings_request_body
        return self.calculate_from_holdings_endpoint.call_with_http_info(**kwargs)


    def generate_id_mapping(
        self,
        version,
        generate_id_mapping_request_body,
        **kwargs
    ) -> InlineResponse2004:
        """Generate risk model ID mapping  # noqa: E501

        Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            generate_id_mapping_request_body (GenerateIDMappingRequestBody):

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
            InlineResponse2004
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['version'] = \
            version
        kwargs['generate_id_mapping_request_body'] = \
            generate_id_mapping_request_body
        return self.generate_id_mapping_endpoint.call_with_http_info(**kwargs)

    def generate_id_mapping_with_http_info(
        self,
        version,
        generate_id_mapping_request_body,
        **kwargs
    ) -> typing.Tuple[InlineResponse2004, int, typing.MutableMapping]:
        """Generate risk model ID mapping  # noqa: E501

        Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            generate_id_mapping_request_body (GenerateIDMappingRequestBody):

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
            InlineResponse2004
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['version'] = \
            version
        kwargs['generate_id_mapping_request_body'] = \
            generate_id_mapping_request_body
        return self.generate_id_mapping_endpoint.call_with_http_info(**kwargs)

    def generate_id_mapping_async(
        self,
        version,
        generate_id_mapping_request_body,
        **kwargs
    ) -> "ApplyResult[InlineResponse2004]":
        """Generate risk model ID mapping  # noqa: E501

        Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            generate_id_mapping_request_body (GenerateIDMappingRequestBody):

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
            ApplyResult[InlineResponse2004]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['version'] = \
            version
        kwargs['generate_id_mapping_request_body'] = \
            generate_id_mapping_request_body
        return self.generate_id_mapping_endpoint.call_with_http_info(**kwargs)

    def generate_id_mapping_with_http_info_async(
        self,
        version,
        generate_id_mapping_request_body,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[InlineResponse2004, int, typing.MutableMapping]]":
        """Generate risk model ID mapping  # noqa: E501

        Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            version (str): Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
            generate_id_mapping_request_body (GenerateIDMappingRequestBody):

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
            ApplyResult[(InlineResponse2004, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['version'] = \
            version
        kwargs['generate_id_mapping_request_body'] = \
            generate_id_mapping_request_body
        return self.generate_id_mapping_endpoint.call_with_http_info(**kwargs)


