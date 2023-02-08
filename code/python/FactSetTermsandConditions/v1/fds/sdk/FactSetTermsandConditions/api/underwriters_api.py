"""
    FactSet Terms & Conditions API

    The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetTermsandConditions.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetTermsandConditions.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetTermsandConditions.exceptions import ApiException
from fds.sdk.FactSetTermsandConditions.model.error_response import ErrorResponse
from fds.sdk.FactSetTermsandConditions.model.lead_underwriters_response import LeadUnderwritersResponse
from fds.sdk.FactSetTermsandConditions.model.terms_and_conditions_scalar_request import TermsAndConditionsScalarRequest





class UnderwritersApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_lead_underwriters_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (LeadUnderwritersResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-terms-and-conditions/v1/lead-underwriters',
                'operation_id': 'get_lead_underwriters',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                ],
                'required': [
                    'ids',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'ids',
                ]
            },
            root_map={
                'validations': {
                    ('ids',): {

                        'max_items': 250,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                },
                'attribute_map': {
                    'ids': 'ids',
                },
                'location_map': {
                    'ids': 'query',
                },
                'collection_format_map': {
                    'ids': 'csv',
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

        self.get_lead_underwriters_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (LeadUnderwritersResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-terms-and-conditions/v1/lead-underwriters',
                'operation_id': 'get_lead_underwriters_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'terms_and_conditions_scalar_request',
                ],
                'required': [
                    'terms_and_conditions_scalar_request',
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
                    'terms_and_conditions_scalar_request':
                        (TermsAndConditionsScalarRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'terms_and_conditions_scalar_request': 'body',
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


    def get_lead_underwriters(
        self,
        ids,
        **kwargs
    ) -> LeadUnderwritersResponse:
        """Return Lead Underwriters for a Fixed Income security.  # noqa: E501

        Returns Lead Underwriters for the Fixed Income security.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            ids ([str]): List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

        Keyword Args:
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
            LeadUnderwritersResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_lead_underwriters_endpoint.call_with_http_info(**kwargs)

    def get_lead_underwriters_with_http_info(
        self,
        ids,
        **kwargs
    ) -> typing.Tuple[LeadUnderwritersResponse, int, typing.MutableMapping]:
        """Return Lead Underwriters for a Fixed Income security.  # noqa: E501

        Returns Lead Underwriters for the Fixed Income security.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            ids ([str]): List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

        Keyword Args:
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
            LeadUnderwritersResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_lead_underwriters_endpoint.call_with_http_info(**kwargs)

    def get_lead_underwriters_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[LeadUnderwritersResponse]":
        """Return Lead Underwriters for a Fixed Income security.  # noqa: E501

        Returns Lead Underwriters for the Fixed Income security.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            ids ([str]): List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

        Keyword Args:
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
            ApplyResult[LeadUnderwritersResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_lead_underwriters_endpoint.call_with_http_info(**kwargs)

    def get_lead_underwriters_with_http_info_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[LeadUnderwritersResponse, int, typing.MutableMapping]]":
        """Return Lead Underwriters for a Fixed Income security.  # noqa: E501

        Returns Lead Underwriters for the Fixed Income security.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            ids ([str]): List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

        Keyword Args:
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
            ApplyResult[(LeadUnderwritersResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_lead_underwriters_endpoint.call_with_http_info(**kwargs)


    def get_lead_underwriters_for_list(
        self,
        terms_and_conditions_scalar_request,
        **kwargs
    ) -> LeadUnderwritersResponse:
        """Return Lead Underwriters for a list of Fixed Income securities.  # noqa: E501

        Returns Lead Underwriters for a list of Fixed Income securities.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            terms_and_conditions_scalar_request (TermsAndConditionsScalarRequest): Request object for Fixed Income Lead Underwriters.

        Keyword Args:
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
            LeadUnderwritersResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['terms_and_conditions_scalar_request'] = \
            terms_and_conditions_scalar_request
        return self.get_lead_underwriters_for_list_endpoint.call_with_http_info(**kwargs)

    def get_lead_underwriters_for_list_with_http_info(
        self,
        terms_and_conditions_scalar_request,
        **kwargs
    ) -> typing.Tuple[LeadUnderwritersResponse, int, typing.MutableMapping]:
        """Return Lead Underwriters for a list of Fixed Income securities.  # noqa: E501

        Returns Lead Underwriters for a list of Fixed Income securities.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            terms_and_conditions_scalar_request (TermsAndConditionsScalarRequest): Request object for Fixed Income Lead Underwriters.

        Keyword Args:
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
            LeadUnderwritersResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['terms_and_conditions_scalar_request'] = \
            terms_and_conditions_scalar_request
        return self.get_lead_underwriters_for_list_endpoint.call_with_http_info(**kwargs)

    def get_lead_underwriters_for_list_async(
        self,
        terms_and_conditions_scalar_request,
        **kwargs
    ) -> "ApplyResult[LeadUnderwritersResponse]":
        """Return Lead Underwriters for a list of Fixed Income securities.  # noqa: E501

        Returns Lead Underwriters for a list of Fixed Income securities.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            terms_and_conditions_scalar_request (TermsAndConditionsScalarRequest): Request object for Fixed Income Lead Underwriters.

        Keyword Args:
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
            ApplyResult[LeadUnderwritersResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['terms_and_conditions_scalar_request'] = \
            terms_and_conditions_scalar_request
        return self.get_lead_underwriters_for_list_endpoint.call_with_http_info(**kwargs)

    def get_lead_underwriters_for_list_with_http_info_async(
        self,
        terms_and_conditions_scalar_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[LeadUnderwritersResponse, int, typing.MutableMapping]]":
        """Return Lead Underwriters for a list of Fixed Income securities.  # noqa: E501

        Returns Lead Underwriters for a list of Fixed Income securities.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            terms_and_conditions_scalar_request (TermsAndConditionsScalarRequest): Request object for Fixed Income Lead Underwriters.

        Keyword Args:
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
            ApplyResult[(LeadUnderwritersResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['terms_and_conditions_scalar_request'] = \
            terms_and_conditions_scalar_request
        return self.get_lead_underwriters_for_list_endpoint.call_with_http_info(**kwargs)


