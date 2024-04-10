"""
    Vault API

    Allow clients to fetch Analytics through APIs.  # noqa: E501

    The version of the OpenAPI document: 3.14.1
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

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
from fds.sdk.Vault.exceptions import ApiException
from fds.sdk.Vault.model.client_error_response import ClientErrorResponse
from fds.sdk.Vault.model.vault_configuration_root import VaultConfigurationRoot
from fds.sdk.Vault.model.vault_configuration_summary_root import VaultConfigurationSummaryRoot





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
                'response_type': (
                  { 200: (VaultConfigurationRoot,), 400: (ClientErrorResponse,), 404: (ClientErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/vault/v3/configurations/{id}',
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
                'response_type': (
                  { 200: (VaultConfigurationSummaryRoot,), 400: (ClientErrorResponse,), 404: (ClientErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/vault/v3/configurations',
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


    def get_vault_configuration_by_id(
        self,
        id,
        **kwargs
    ) -> VaultConfigurationRoot:
        """Get Vault configuration by id  # noqa: E501

        This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str): Vault configuration id to get the details of

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
            VaultConfigurationRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.get_vault_configuration_by_id_endpoint.call_with_http_info(**kwargs)

    def get_vault_configuration_by_id_with_http_info(
        self,
        id,
        **kwargs
    ) -> typing.Tuple[VaultConfigurationRoot, int, typing.MutableMapping]:
        """Get Vault configuration by id  # noqa: E501

        This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str): Vault configuration id to get the details of

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
            VaultConfigurationRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.get_vault_configuration_by_id_endpoint.call_with_http_info(**kwargs)

    def get_vault_configuration_by_id_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[VaultConfigurationRoot]":
        """Get Vault configuration by id  # noqa: E501

        This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str): Vault configuration id to get the details of

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
            ApplyResult[VaultConfigurationRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.get_vault_configuration_by_id_endpoint.call_with_http_info(**kwargs)

    def get_vault_configuration_by_id_with_http_info_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[VaultConfigurationRoot, int, typing.MutableMapping]]":
        """Get Vault configuration by id  # noqa: E501

        This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str): Vault configuration id to get the details of

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
            ApplyResult[(VaultConfigurationRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.get_vault_configuration_by_id_endpoint.call_with_http_info(**kwargs)


    def get_vault_configurations(
        self,
        account,
        **kwargs
    ) -> VaultConfigurationSummaryRoot:
        """Get Vault configurations  # noqa: E501

        This endpoint returns all the Vault configurations saved in the provided account.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            account (str): Required account query parameter to filter configurations for a specific account

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
            VaultConfigurationSummaryRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['account'] = \
            account
        return self.get_vault_configurations_endpoint.call_with_http_info(**kwargs)

    def get_vault_configurations_with_http_info(
        self,
        account,
        **kwargs
    ) -> typing.Tuple[VaultConfigurationSummaryRoot, int, typing.MutableMapping]:
        """Get Vault configurations  # noqa: E501

        This endpoint returns all the Vault configurations saved in the provided account.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            account (str): Required account query parameter to filter configurations for a specific account

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
            VaultConfigurationSummaryRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['account'] = \
            account
        return self.get_vault_configurations_endpoint.call_with_http_info(**kwargs)

    def get_vault_configurations_async(
        self,
        account,
        **kwargs
    ) -> "ApplyResult[VaultConfigurationSummaryRoot]":
        """Get Vault configurations  # noqa: E501

        This endpoint returns all the Vault configurations saved in the provided account.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            account (str): Required account query parameter to filter configurations for a specific account

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
            ApplyResult[VaultConfigurationSummaryRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['account'] = \
            account
        return self.get_vault_configurations_endpoint.call_with_http_info(**kwargs)

    def get_vault_configurations_with_http_info_async(
        self,
        account,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[VaultConfigurationSummaryRoot, int, typing.MutableMapping]]":
        """Get Vault configurations  # noqa: E501

        This endpoint returns all the Vault configurations saved in the provided account.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            account (str): Required account query parameter to filter configurations for a specific account

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
            ApplyResult[(VaultConfigurationSummaryRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['account'] = \
            account
        return self.get_vault_configurations_endpoint.call_with_http_info(**kwargs)


