"""
    Vault API

    Allow clients to fetch Vault Analytics through APIs.  # noqa: E501

    The version of the OpenAPI document: 2
    Contact: analytics.api.support@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.Vault.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.Vault.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.Vault.model.vault_configuration import VaultConfiguration
from fds.sdk.Vault.model.vault_configuration_summary import VaultConfigurationSummary


class ConfigurationsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_vault_configuration_by_id_endpoint = _Endpoint(
            settings={
                'response_type': (VaultConfiguration,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/lookups/v2/engines/vault/configurations/{id}',
                'operation_id': 'get_vault_configuration_by_id',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'id',
                ],
                'required': [
                    'id',
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
                    'id':
                        (str,),
                },
                'attribute_map': {
                    'id': 'id',
                },
                'location_map': {
                    'id': 'path',
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
        self.get_vault_configurations_endpoint = _Endpoint(
            settings={
                'response_type': ({str: (VaultConfigurationSummary,)},),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/lookups/v2/engines/vault/configurations',
                'operation_id': 'get_vault_configurations',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'account',
                ],
                'required': [
                    'account',
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
                    'account':
                        (str,),
                },
                'attribute_map': {
                    'account': 'account',
                },
                'location_map': {
                    'account': 'query',
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

    def get_vault_configuration_by_id(
        self,
        id="E522DF7D-C286-4EF1-AE34-0AA104AF602F",
        **kwargs
    ):
        """Get Vault configuration by id  # noqa: E501

        This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_vault_configuration_by_id(id="E522DF7D-C286-4EF1-AE34-0AA104AF602F", async_req=True)
        >>> result = thread.get()

        Args:
            id (str): Vault configuration id to get the details of. defaults to "E522DF7D-C286-4EF1-AE34-0AA104AF602F", must be one of ["E522DF7D-C286-4EF1-AE34-0AA104AF602F"]

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
            VaultConfiguration
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
        return self.get_vault_configuration_by_id_endpoint.call_with_http_info(**kwargs)

    def get_vault_configurations(
        self,
        account="Client:Foo/Bar/myaccount.acct",
        **kwargs
    ):
        """Get Vault configurations  # noqa: E501

        This endpoint returns all the Vault configurations saved in the provided account.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_vault_configurations(account="Client:Foo/Bar/myaccount.acct", async_req=True)
        >>> result = thread.get()

        Args:
            account (str): Required account query parameter to filter configurations for a specific account. defaults to "Client:Foo/Bar/myaccount.acct", must be one of ["Client:Foo/Bar/myaccount.acct"]

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
            {str: (VaultConfigurationSummary,)}
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
        kwargs['account'] = \
            account
        return self.get_vault_configurations_endpoint.call_with_http_info(**kwargs)

