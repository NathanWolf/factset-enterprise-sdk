"""
    OFDB API

    OFDB API  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.OFDB.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.OFDB.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.OFDB.exceptions import ApiException
from fds.sdk.OFDB.model.inline_response202 import InlineResponse202
from fds.sdk.OFDB.model.inline_response400 import InlineResponse400
from fds.sdk.OFDB.model.inline_response403 import InlineResponse403
from fds.sdk.OFDB.model.inline_response404 import InlineResponse404
from fds.sdk.OFDB.model.inline_response406 import InlineResponse406
from fds.sdk.OFDB.model.inline_response429 import InlineResponse429





class DeleteApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.delete_date_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 202: (InlineResponse202,), 400: (InlineResponse400,), 403: (InlineResponse403,), 404: (InlineResponse404,), 406: (InlineResponse406,), 429: (InlineResponse429,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/database/{path}/dates/{date}',
                'operation_id': 'delete_date',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                    'date',
                ],
                'required': [
                    'path',
                    'date',
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
                    'path':
                        (str,),
                    'date':
                        (int,),
                },
                'attribute_map': {
                    'path': 'path',
                    'date': 'date',
                },
                'location_map': {
                    'path': 'path',
                    'date': 'path',
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

        self.delete_date_from_symbol_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 202: (InlineResponse202,), 400: (InlineResponse400,), 403: (InlineResponse403,), 404: (InlineResponse404,), 406: (InlineResponse406,), 429: (InlineResponse429,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/database/{path}/dates/{date}/symbols/{symbol}',
                'operation_id': 'delete_date_from_symbol',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                    'date',
                    'symbol',
                ],
                'required': [
                    'path',
                    'date',
                    'symbol',
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
                    'path':
                        (str,),
                    'date':
                        (int,),
                    'symbol':
                        (str,),
                },
                'attribute_map': {
                    'path': 'path',
                    'date': 'date',
                    'symbol': 'symbol',
                },
                'location_map': {
                    'path': 'path',
                    'date': 'path',
                    'symbol': 'path',
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

        self.delete_symbol_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 202: (InlineResponse202,), 400: (InlineResponse400,), 403: (InlineResponse403,), 404: (InlineResponse404,), 406: (InlineResponse406,), 429: (InlineResponse429,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/database/{path}/symbols/{symbol}',
                'operation_id': 'delete_symbol',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                    'symbol',
                ],
                'required': [
                    'path',
                    'symbol',
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
                    'path':
                        (str,),
                    'symbol':
                        (str,),
                },
                'attribute_map': {
                    'path': 'path',
                    'symbol': 'symbol',
                },
                'location_map': {
                    'path': 'path',
                    'symbol': 'path',
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


    def delete_date(
        self,
        path,
        date,
        **kwargs
    ) -> InlineResponse202:
        """delete_date  # noqa: E501

        Deletes all data specific to the date in 3d database(OFDB). This includes all the symbols related to that date  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format

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
            InlineResponse202
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        return self.delete_date_endpoint.call_with_http_info(**kwargs)

    def delete_date_with_http_info(
        self,
        path,
        date,
        **kwargs
    ) -> typing.Tuple[InlineResponse202, int, typing.MutableMapping]:
        """delete_date  # noqa: E501

        Deletes all data specific to the date in 3d database(OFDB). This includes all the symbols related to that date  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format

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
            InlineResponse202
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        return self.delete_date_endpoint.call_with_http_info(**kwargs)

    def delete_date_async(
        self,
        path,
        date,
        **kwargs
    ) -> "ApplyResult[InlineResponse202]":
        """delete_date  # noqa: E501

        Deletes all data specific to the date in 3d database(OFDB). This includes all the symbols related to that date  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format

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
            ApplyResult[InlineResponse202]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        return self.delete_date_endpoint.call_with_http_info(**kwargs)

    def delete_date_with_http_info_async(
        self,
        path,
        date,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[InlineResponse202, int, typing.MutableMapping]]":
        """delete_date  # noqa: E501

        Deletes all data specific to the date in 3d database(OFDB). This includes all the symbols related to that date  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format

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
            ApplyResult[(InlineResponse202, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        return self.delete_date_endpoint.call_with_http_info(**kwargs)


    def delete_date_from_symbol(
        self,
        path,
        date,
        symbol,
        **kwargs
    ) -> InlineResponse202:
        """delete_date_from_symbol  # noqa: E501

        Deletes data specific to the symbol and date from a 3d database(OFDB).  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format
            symbol (str): Symbol with in the ofdb

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
            InlineResponse202
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        kwargs['symbol'] = \
            symbol
        return self.delete_date_from_symbol_endpoint.call_with_http_info(**kwargs)

    def delete_date_from_symbol_with_http_info(
        self,
        path,
        date,
        symbol,
        **kwargs
    ) -> typing.Tuple[InlineResponse202, int, typing.MutableMapping]:
        """delete_date_from_symbol  # noqa: E501

        Deletes data specific to the symbol and date from a 3d database(OFDB).  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format
            symbol (str): Symbol with in the ofdb

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
            InlineResponse202
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        kwargs['symbol'] = \
            symbol
        return self.delete_date_from_symbol_endpoint.call_with_http_info(**kwargs)

    def delete_date_from_symbol_async(
        self,
        path,
        date,
        symbol,
        **kwargs
    ) -> "ApplyResult[InlineResponse202]":
        """delete_date_from_symbol  # noqa: E501

        Deletes data specific to the symbol and date from a 3d database(OFDB).  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format
            symbol (str): Symbol with in the ofdb

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
            ApplyResult[InlineResponse202]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        kwargs['symbol'] = \
            symbol
        return self.delete_date_from_symbol_endpoint.call_with_http_info(**kwargs)

    def delete_date_from_symbol_with_http_info_async(
        self,
        path,
        date,
        symbol,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[InlineResponse202, int, typing.MutableMapping]]":
        """delete_date_from_symbol  # noqa: E501

        Deletes data specific to the symbol and date from a 3d database(OFDB).  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            date (int): Date in YYYYMMDD format
            symbol (str): Symbol with in the ofdb

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
            ApplyResult[(InlineResponse202, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        kwargs['date'] = \
            date
        kwargs['symbol'] = \
            symbol
        return self.delete_date_from_symbol_endpoint.call_with_http_info(**kwargs)


    def delete_symbol(
        self,
        path,
        symbol,
        **kwargs
    ) -> InlineResponse202:
        """delete_symbol  # noqa: E501

        Deletes all data specific to the symbol in both 2d and 3d database(OFDB). This includes all the dates related to that symbols in 3d database(OFDB)  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): Encode database path
            symbol (str): Symbol with in the ofdb

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
            InlineResponse202
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        kwargs['symbol'] = \
            symbol
        return self.delete_symbol_endpoint.call_with_http_info(**kwargs)

    def delete_symbol_with_http_info(
        self,
        path,
        symbol,
        **kwargs
    ) -> typing.Tuple[InlineResponse202, int, typing.MutableMapping]:
        """delete_symbol  # noqa: E501

        Deletes all data specific to the symbol in both 2d and 3d database(OFDB). This includes all the dates related to that symbols in 3d database(OFDB)  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): Encode database path
            symbol (str): Symbol with in the ofdb

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
            InlineResponse202
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        kwargs['symbol'] = \
            symbol
        return self.delete_symbol_endpoint.call_with_http_info(**kwargs)

    def delete_symbol_async(
        self,
        path,
        symbol,
        **kwargs
    ) -> "ApplyResult[InlineResponse202]":
        """delete_symbol  # noqa: E501

        Deletes all data specific to the symbol in both 2d and 3d database(OFDB). This includes all the dates related to that symbols in 3d database(OFDB)  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            symbol (str): Symbol with in the ofdb

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
            ApplyResult[InlineResponse202]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        kwargs['symbol'] = \
            symbol
        return self.delete_symbol_endpoint.call_with_http_info(**kwargs)

    def delete_symbol_with_http_info_async(
        self,
        path,
        symbol,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[InlineResponse202, int, typing.MutableMapping]]":
        """delete_symbol  # noqa: E501

        Deletes all data specific to the symbol in both 2d and 3d database(OFDB). This includes all the dates related to that symbols in 3d database(OFDB)  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            symbol (str): Symbol with in the ofdb

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
            ApplyResult[(InlineResponse202, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        kwargs['symbol'] = \
            symbol
        return self.delete_symbol_endpoint.call_with_http_info(**kwargs)


