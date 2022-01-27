"""
    ID Lookup API

    The Factset Identifier Lookup API provides the ability to search for various identifier types based on keyword. The API returns tickers, entity names and other identifiers that Factset supports. In addition, the API offers filters that allows users to refine the results.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.IDLookup.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.IDLookup.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.IDLookup.model.error_response import ErrorResponse
from fds.sdk.IDLookup.model.lookup_request import LookupRequest
from fds.sdk.IDLookup.model.lookup_response import LookupResponse


class FactSetIDLookupApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.search_companyname_endpoint = _Endpoint(
            settings={
                'response_type': (LookupResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/idsearch',
                'operation_id': 'search_companyname',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'lookup_request',
                ],
                'required': [
                    'lookup_request',
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
                    'lookup_request':
                        (LookupRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'lookup_request': 'body',
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

    def search_companyname(
        self,
        lookup_request,
        **kwargs
    ):
        """Search funtionality to return tickers, company names and unique identifiers for FactSet data  # noqa: E501

        Service will accept request in JSON formatted request body. The request is sent by passing a query which is an array conitaining search query objects with parameters. The parameters contain search term and filters defined by the end user. This would display a specific set of identifiers based on the request.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.search_companyname(lookup_request, async_req=True)
        >>> result = thread.get()

        Args:
            lookup_request (LookupRequest): Post body to lookup any FactSet identifiers

        Keyword Args:
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
            LookupResponse
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
        kwargs['lookup_request'] = \
            lookup_request
        return self.search_companyname_endpoint.call_with_http_info(**kwargs)

