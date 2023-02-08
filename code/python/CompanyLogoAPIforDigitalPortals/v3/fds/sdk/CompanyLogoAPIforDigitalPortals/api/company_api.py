"""
    Company Logo API For Digital Portals

    Consume FactSet-collected company logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Functional APIs.  # noqa: E501

    The version of the OpenAPI document: 2
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.CompanyLogoAPIforDigitalPortals.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.CompanyLogoAPIforDigitalPortals.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.CompanyLogoAPIforDigitalPortals.exceptions import ApiException
from fds.sdk.CompanyLogoAPIforDigitalPortals.model.inline_response200 import InlineResponse200





class CompanyApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_company_logo_get_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (InlineResponse200,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/company/logo/get',
                'operation_id': 'get_company_logo_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'identifier',
                    'identifier_type',
                    'format',
                    'attributes',
                ],
                'required': [
                    'identifier',
                    'identifier_type',
                ],
                'nullable': [
                ],
                'enum': [
                    'identifier_type',
                    'format',
                ],
                'validation': [
                    'identifier',
                    'attributes',
                ]
            },
            root_map={
                'validations': {
                    ('identifier',): {
                        'max_length': 50,
                        'min_length': 4,
                        'regex': {
                            'pattern': r'^(([0-9A-Z]{6}-[SLR])|([0-9A-Z.]{1,47}-[A-Z]{2,4})|([0-9]{1,20}))$',  # noqa: E501
                        },
                    },
                    ('attributes',): {

                        'max_items': 50,
                    },
                },
                'allowed_values': {
                    ('identifier_type',): {

                        "IDINSTRUMENT": "idInstrument",
                        "TICKEREXCHANGE": "tickerExchange"
                    },
                    ('format',): {

                        "RECTANGULAR": "rectangular",
                        "SQUARE": "square"
                    },
                },
                'openapi_types': {
                    'identifier':
                        (str,),
                    'identifier_type':
                        (str,),
                    'format':
                        (str,),
                    'attributes':
                        ([str],),
                },
                'attribute_map': {
                    'identifier': 'identifier',
                    'identifier_type': 'identifierType',
                    'format': 'format',
                    'attributes': '_attributes',
                },
                'location_map': {
                    'identifier': 'query',
                    'identifier_type': 'query',
                    'format': 'query',
                    'attributes': 'query',
                },
                'collection_format_map': {
                    'attributes': 'csv',
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


    def get_company_logo_get(
        self,
        identifier,
        identifier_type,
        **kwargs
    ) -> InlineResponse200:
        """List of URLs of company logos.  # noqa: E501

        List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            identifier (str): Identifier that resolves to a company. 
            identifier_type (str): The type of the identifier.

        Keyword Args:
            format (str): Format of the logos.. [optional] if omitted the server will use the default value of "rectangular"
            attributes ([str]): Limit the attributes returned in the response to the specified set.. [optional]
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
            InlineResponse200
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['identifier'] = \
            identifier
        kwargs['identifier_type'] = \
            identifier_type
        return self.get_company_logo_get_endpoint.call_with_http_info(**kwargs)

    def get_company_logo_get_with_http_info(
        self,
        identifier,
        identifier_type,
        **kwargs
    ) -> typing.Tuple[InlineResponse200, int, typing.MutableMapping]:
        """List of URLs of company logos.  # noqa: E501

        List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            identifier (str): Identifier that resolves to a company. 
            identifier_type (str): The type of the identifier.

        Keyword Args:
            format (str): Format of the logos.. [optional] if omitted the server will use the default value of "rectangular"
            attributes ([str]): Limit the attributes returned in the response to the specified set.. [optional]
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
            InlineResponse200
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['identifier'] = \
            identifier
        kwargs['identifier_type'] = \
            identifier_type
        return self.get_company_logo_get_endpoint.call_with_http_info(**kwargs)

    def get_company_logo_get_async(
        self,
        identifier,
        identifier_type,
        **kwargs
    ) -> "ApplyResult[InlineResponse200]":
        """List of URLs of company logos.  # noqa: E501

        List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            identifier (str): Identifier that resolves to a company. 
            identifier_type (str): The type of the identifier.

        Keyword Args:
            format (str): Format of the logos.. [optional] if omitted the server will use the default value of "rectangular"
            attributes ([str]): Limit the attributes returned in the response to the specified set.. [optional]
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
            ApplyResult[InlineResponse200]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['identifier'] = \
            identifier
        kwargs['identifier_type'] = \
            identifier_type
        return self.get_company_logo_get_endpoint.call_with_http_info(**kwargs)

    def get_company_logo_get_with_http_info_async(
        self,
        identifier,
        identifier_type,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[InlineResponse200, int, typing.MutableMapping]]":
        """List of URLs of company logos.  # noqa: E501

        List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            identifier (str): Identifier that resolves to a company. 
            identifier_type (str): The type of the identifier.

        Keyword Args:
            format (str): Format of the logos.. [optional] if omitted the server will use the default value of "rectangular"
            attributes ([str]): Limit the attributes returned in the response to the specified set.. [optional]
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
            ApplyResult[(InlineResponse200, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['identifier'] = \
            identifier
        kwargs['identifier_type'] = \
            identifier_type
        return self.get_company_logo_get_endpoint.call_with_http_info(**kwargs)


