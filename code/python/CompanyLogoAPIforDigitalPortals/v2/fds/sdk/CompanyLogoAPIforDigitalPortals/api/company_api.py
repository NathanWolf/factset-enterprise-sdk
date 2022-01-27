"""
    Prime Developer Trial

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: v1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

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
        self.get_company_logo_get_by_instrument_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse200,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/company/logo/getByInstrument',
                'operation_id': 'get_company_logo_get_by_instrument',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'id',
                    'attributes',
                ],
                'required': [
                    'id',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'attributes',
                ]
            },
            root_map={
                'validations': {
                    ('attributes',): {

                        'max_items': 50,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'id':
                        (str,),
                    'attributes':
                        ([str],),
                },
                'attribute_map': {
                    'id': 'id',
                    'attributes': '_attributes',
                },
                'location_map': {
                    'id': 'query',
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

    def get_company_logo_get_by_instrument(
        self,
        id,
        **kwargs
    ):
        """URLs of company logos.  # noqa: E501

        URLs of transparent company logos in different sizes. A small square logo is 31x31 pixels. A small rectangular logo has a maximum width of 88 pixels and a maximum height of 31 pixels. A medium or large logo has the size of the small logo scaled up by 200% and 300% respectively. A vector logo can be rendered at any size.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_company_logo_get_by_instrument(id, async_req=True)
        >>> result = thread.get()

        Args:
            id (str): Identifier of an instrument.

        Keyword Args:
            attributes ([str]): Limit the attributes returned in the response to the specified set.. [optional]
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
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
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            InlineResponse200
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['id'] = \
            id
        return self.get_company_logo_get_by_instrument_endpoint.call_with_http_info(**kwargs)

