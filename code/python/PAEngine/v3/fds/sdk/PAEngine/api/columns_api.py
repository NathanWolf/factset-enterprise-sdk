"""
    PA Engine API

    Allow clients to fetch Analytics through APIs.  # noqa: E501

    The version of the OpenAPI document: 3
    Contact: analytics.api.support@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.PAEngine.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.PAEngine.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.PAEngine.exceptions import ApiException
from fds.sdk.PAEngine.model.client_error_response import ClientErrorResponse
from fds.sdk.PAEngine.model.column_root import ColumnRoot
from fds.sdk.PAEngine.model.column_summary_root import ColumnSummaryRoot





class ColumnsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_pa_column_by_id_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (ColumnRoot,), 400: (ClientErrorResponse,), 404: (ClientErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/pa/v3/columns/{id}',
                'operation_id': 'get_pa_column_by_id',
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
        self.get_pa_columns_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (ColumnSummaryRoot,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/pa/v3/columns',
                'operation_id': 'get_pa_columns',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'name',
                    'category',
                    'directory',
                ],
                'required': [],
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
                    'name':
                        (str,),
                    'category':
                        (str,),
                    'directory':
                        (str,),
                },
                'attribute_map': {
                    'name': 'name',
                    'category': 'category',
                    'directory': 'directory',
                },
                'location_map': {
                    'name': 'query',
                    'category': 'query',
                    'directory': 'query',
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

    def get_pa_column_by_id(
        self,
        id="2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5",
        **kwargs
    ) -> ColumnRoot:
        """Get PA column settings  # noqa: E501

        This endpoint returns the default settings of a PA column.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str): Unique identifier for a column. defaults to "2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5", must be one of ["2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5"]

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
            ColumnRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.get_pa_column_by_id_endpoint.call_with_http_info(**kwargs)

    def get_pa_column_by_id_with_http_info(
        self,
        id="2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5",
        **kwargs
    ) -> typing.Tuple[ColumnRoot, int, typing.MutableMapping]:
        """Get PA column settings  # noqa: E501

        This endpoint returns the default settings of a PA column.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str): Unique identifier for a column. defaults to "2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5", must be one of ["2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5"]

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
            ColumnRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.get_pa_column_by_id_endpoint.call_with_http_info(**kwargs)

    def get_pa_column_by_id_async(
        self,
        id="2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5",
        **kwargs
    ) -> "ApplyResult[ColumnRoot]":
        """Get PA column settings  # noqa: E501

        This endpoint returns the default settings of a PA column.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str): Unique identifier for a column. defaults to "2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5", must be one of ["2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5"]

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
            ApplyResult[ColumnRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.get_pa_column_by_id_endpoint.call_with_http_info(**kwargs)

    def get_pa_column_by_id_with_http_info_async(
        self,
        id="2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5",
        **kwargs
    ) -> "ApplyResult[typing.Tuple[ColumnRoot, int, typing.MutableMapping]]":
        """Get PA column settings  # noqa: E501

        This endpoint returns the default settings of a PA column.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str): Unique identifier for a column. defaults to "2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5", must be one of ["2B729FA4EQAEA58B330055A5D064FC4FA32491DAF9D169C3DAD9793880F5"]

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
            ApplyResult[(ColumnRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.get_pa_column_by_id_endpoint.call_with_http_info(**kwargs)

    def get_pa_columns(
        self,
        **kwargs
    ) -> ColumnSummaryRoot:
        """Get PA columns  # noqa: E501

        This endpoint lists all the PA columns that can be applied to a calculation.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only


        Keyword Args:
            name (str): Column name. [optional] if omitted the server will use the default value of ""
            category (str): Column category. [optional] if omitted the server will use the default value of ""
            directory (str): The directory to get the columns in. [optional] if omitted the server will use the default value of ""
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
            ColumnSummaryRoot
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        return self.get_pa_columns_endpoint.call_with_http_info(**kwargs)

    def get_pa_columns_with_http_info(
        self,
        **kwargs
    ) -> typing.Tuple[ColumnSummaryRoot, int, typing.MutableMapping]:
        """Get PA columns  # noqa: E501

        This endpoint lists all the PA columns that can be applied to a calculation.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers


        Keyword Args:
            name (str): Column name. [optional] if omitted the server will use the default value of ""
            category (str): Column category. [optional] if omitted the server will use the default value of ""
            directory (str): The directory to get the columns in. [optional] if omitted the server will use the default value of ""
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
            ColumnSummaryRoot
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        return self.get_pa_columns_endpoint.call_with_http_info(**kwargs)

    def get_pa_columns_async(
        self,
        **kwargs
    ) -> "ApplyResult[ColumnSummaryRoot]":
        """Get PA columns  # noqa: E501

        This endpoint lists all the PA columns that can be applied to a calculation.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult


        Keyword Args:
            name (str): Column name. [optional] if omitted the server will use the default value of ""
            category (str): Column category. [optional] if omitted the server will use the default value of ""
            directory (str): The directory to get the columns in. [optional] if omitted the server will use the default value of ""
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
            ApplyResult[ColumnSummaryRoot]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        return self.get_pa_columns_endpoint.call_with_http_info(**kwargs)

    def get_pa_columns_with_http_info_async(
        self,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[ColumnSummaryRoot, int, typing.MutableMapping]]":
        """Get PA columns  # noqa: E501

        This endpoint lists all the PA columns that can be applied to a calculation.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult


        Keyword Args:
            name (str): Column name. [optional] if omitted the server will use the default value of ""
            category (str): Column category. [optional] if omitted the server will use the default value of ""
            directory (str): The directory to get the columns in. [optional] if omitted the server will use the default value of ""
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
            ApplyResult[(ColumnSummaryRoot, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        return self.get_pa_columns_endpoint.call_with_http_info(**kwargs)

