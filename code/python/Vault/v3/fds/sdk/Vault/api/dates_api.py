"""
    Vault API

    Allow clients to fetch Analytics through APIs.  # noqa: E501

    The version of the OpenAPI document: v3
    Contact: analytics.api.support@factset.com
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
from fds.sdk.Vault.model.date_parameters_summary_root import DateParametersSummaryRoot





class DatesApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.convert_vault_dates_to_absolute_format_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (DateParametersSummaryRoot,), 400: (ClientErrorResponse,), 404: (ClientErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/vault/v3/dates',
                'operation_id': 'convert_vault_dates_to_absolute_format',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'enddate',
                    'componentid',
                    'account',
                    'startdate',
                ],
                'required': [
                    'enddate',
                    'componentid',
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
                    'enddate':
                        (str,),
                    'componentid':
                        (str,),
                    'account':
                        (str,),
                    'startdate':
                        (str,),
                },
                'attribute_map': {
                    'enddate': 'enddate',
                    'componentid': 'componentid',
                    'account': 'account',
                    'startdate': 'startdate',
                },
                'location_map': {
                    'enddate': 'query',
                    'componentid': 'query',
                    'account': 'query',
                    'startdate': 'query',
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

    def convert_vault_dates_to_absolute_format(
        self,
        enddate,
        componentid,
        account,
        **kwargs
    ) -> DateParametersSummaryRoot:
        """Convert Vault dates to absolute format  # noqa: E501

        This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the 'API Documentation' section in the developer portal.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            enddate (str): End Date
            componentid (str): Vault Component Id
            account (str): Account

        Keyword Args:
            startdate (str): Start Date. [optional]
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
            DateParametersSummaryRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['enddate'] = \
            enddate
        kwargs['componentid'] = \
            componentid
        kwargs['account'] = \
            account
        return self.convert_vault_dates_to_absolute_format_endpoint.call_with_http_info(**kwargs)

    def convert_vault_dates_to_absolute_format_with_http_info(
        self,
        enddate,
        componentid,
        account,
        **kwargs
    ) -> typing.Tuple[DateParametersSummaryRoot, int, typing.MutableMapping]:
        """Convert Vault dates to absolute format  # noqa: E501

        This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the 'API Documentation' section in the developer portal.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            enddate (str): End Date
            componentid (str): Vault Component Id
            account (str): Account

        Keyword Args:
            startdate (str): Start Date. [optional]
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
            DateParametersSummaryRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['enddate'] = \
            enddate
        kwargs['componentid'] = \
            componentid
        kwargs['account'] = \
            account
        return self.convert_vault_dates_to_absolute_format_endpoint.call_with_http_info(**kwargs)

    def convert_vault_dates_to_absolute_format_async(
        self,
        enddate,
        componentid,
        account,
        **kwargs
    ) -> "ApplyResult[DateParametersSummaryRoot]":
        """Convert Vault dates to absolute format  # noqa: E501

        This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the 'API Documentation' section in the developer portal.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            enddate (str): End Date
            componentid (str): Vault Component Id
            account (str): Account

        Keyword Args:
            startdate (str): Start Date. [optional]
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
            ApplyResult[DateParametersSummaryRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['enddate'] = \
            enddate
        kwargs['componentid'] = \
            componentid
        kwargs['account'] = \
            account
        return self.convert_vault_dates_to_absolute_format_endpoint.call_with_http_info(**kwargs)

    def convert_vault_dates_to_absolute_format_with_http_info_async(
        self,
        enddate,
        componentid,
        account,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[DateParametersSummaryRoot, int, typing.MutableMapping]]":
        """Convert Vault dates to absolute format  # noqa: E501

        This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the 'API Documentation' section in the developer portal.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            enddate (str): End Date
            componentid (str): Vault Component Id
            account (str): Account

        Keyword Args:
            startdate (str): Start Date. [optional]
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
            ApplyResult[(DateParametersSummaryRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['enddate'] = \
            enddate
        kwargs['componentid'] = \
            componentid
        kwargs['account'] = \
            account
        return self.convert_vault_dates_to_absolute_format_endpoint.call_with_http_info(**kwargs)

