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
from fds.sdk.OFDB.model.add_dates import AddDates
from fds.sdk.OFDB.model.add_fields import AddFields
from fds.sdk.OFDB.model.add_symbols import AddSymbols
from fds.sdk.OFDB.model.inline_response202 import InlineResponse202
from fds.sdk.OFDB.model.inline_response400 import InlineResponse400
from fds.sdk.OFDB.model.inline_response403 import InlineResponse403
from fds.sdk.OFDB.model.inline_response404 import InlineResponse404
from fds.sdk.OFDB.model.inline_response406 import InlineResponse406
from fds.sdk.OFDB.model.inline_response413 import InlineResponse413
from fds.sdk.OFDB.model.inline_response429 import InlineResponse429
from fds.sdk.OFDB.model.success_post_response import SuccessPostResponse





class AddApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.add_dates_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 201: (SuccessPostResponse,), 202: (InlineResponse202,), 400: (InlineResponse400,), 403: (InlineResponse403,), 404: (InlineResponse404,), 406: (InlineResponse406,), 413: (InlineResponse413,), 429: (InlineResponse429,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/database/{path}/dates',
                'operation_id': 'add_dates',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                    'add_dates',
                ],
                'required': [
                    'path',
                    'add_dates',
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
                    'add_dates':
                        (AddDates,),
                },
                'attribute_map': {
                    'path': 'path',
                },
                'location_map': {
                    'path': 'path',
                    'add_dates': 'body',
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

        self.add_fields_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 201: (SuccessPostResponse,), 202: (InlineResponse202,), 400: (InlineResponse400,), 403: (InlineResponse403,), 404: (InlineResponse404,), 406: (InlineResponse406,), 429: (InlineResponse429,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/database/{path}/fields',
                'operation_id': 'add_fields',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                    'add_fields',
                ],
                'required': [
                    'path',
                    'add_fields',
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
                    'add_fields':
                        (AddFields,),
                },
                'attribute_map': {
                    'path': 'path',
                },
                'location_map': {
                    'path': 'path',
                    'add_fields': 'body',
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

        self.add_symbols_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 201: (SuccessPostResponse,), 202: (InlineResponse202,), 400: (InlineResponse400,), 403: (InlineResponse403,), 404: (InlineResponse404,), 406: (InlineResponse406,), 413: (InlineResponse413,), 429: (InlineResponse429,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/database/{path}/symbols',
                'operation_id': 'add_symbols',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                    'add_symbols',
                ],
                'required': [
                    'path',
                    'add_symbols',
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
                    'add_symbols':
                        (AddSymbols,),
                },
                'attribute_map': {
                    'path': 'path',
                },
                'location_map': {
                    'path': 'path',
                    'add_symbols': 'body',
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


    def add_dates(
        self,
        path,
        add_dates,
        **kwargs
    ) -> SuccessPostResponse:
        """add_dates  # noqa: E501

        Creates a new date with single/multiple symbols for a 3d database(OFDB).  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): Encode database path
            add_dates (AddDates): Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

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
            SuccessPostResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        kwargs['add_dates'] = \
            add_dates
        return self.add_dates_endpoint.call_with_http_info(**kwargs)

    def add_dates_with_http_info(
        self,
        path,
        add_dates,
        **kwargs
    ) -> typing.Tuple[SuccessPostResponse, int, typing.MutableMapping]:
        """add_dates  # noqa: E501

        Creates a new date with single/multiple symbols for a 3d database(OFDB).  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): Encode database path
            add_dates (AddDates): Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

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
            SuccessPostResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        kwargs['add_dates'] = \
            add_dates
        return self.add_dates_endpoint.call_with_http_info(**kwargs)

    def add_dates_async(
        self,
        path,
        add_dates,
        **kwargs
    ) -> "ApplyResult[SuccessPostResponse]":
        """add_dates  # noqa: E501

        Creates a new date with single/multiple symbols for a 3d database(OFDB).  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            add_dates (AddDates): Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

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
            ApplyResult[SuccessPostResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        kwargs['add_dates'] = \
            add_dates
        return self.add_dates_endpoint.call_with_http_info(**kwargs)

    def add_dates_with_http_info_async(
        self,
        path,
        add_dates,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[SuccessPostResponse, int, typing.MutableMapping]]":
        """add_dates  # noqa: E501

        Creates a new date with single/multiple symbols for a 3d database(OFDB).  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            add_dates (AddDates): Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

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
            ApplyResult[(SuccessPostResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        kwargs['add_dates'] = \
            add_dates
        return self.add_dates_endpoint.call_with_http_info(**kwargs)


    def add_fields(
        self,
        path,
        add_fields,
        **kwargs
    ) -> SuccessPostResponse:
        """add_fields  # noqa: E501

        Allows users to add fields to existing OFDBs  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): Encode database path
            add_fields (AddFields): Data for creating fields in the database.

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
            SuccessPostResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        kwargs['add_fields'] = \
            add_fields
        return self.add_fields_endpoint.call_with_http_info(**kwargs)

    def add_fields_with_http_info(
        self,
        path,
        add_fields,
        **kwargs
    ) -> typing.Tuple[SuccessPostResponse, int, typing.MutableMapping]:
        """add_fields  # noqa: E501

        Allows users to add fields to existing OFDBs  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): Encode database path
            add_fields (AddFields): Data for creating fields in the database.

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
            SuccessPostResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        kwargs['add_fields'] = \
            add_fields
        return self.add_fields_endpoint.call_with_http_info(**kwargs)

    def add_fields_async(
        self,
        path,
        add_fields,
        **kwargs
    ) -> "ApplyResult[SuccessPostResponse]":
        """add_fields  # noqa: E501

        Allows users to add fields to existing OFDBs  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            add_fields (AddFields): Data for creating fields in the database.

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
            ApplyResult[SuccessPostResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        kwargs['add_fields'] = \
            add_fields
        return self.add_fields_endpoint.call_with_http_info(**kwargs)

    def add_fields_with_http_info_async(
        self,
        path,
        add_fields,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[SuccessPostResponse, int, typing.MutableMapping]]":
        """add_fields  # noqa: E501

        Allows users to add fields to existing OFDBs  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            add_fields (AddFields): Data for creating fields in the database.

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
            ApplyResult[(SuccessPostResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        kwargs['add_fields'] = \
            add_fields
        return self.add_fields_endpoint.call_with_http_info(**kwargs)


    def add_symbols(
        self,
        path,
        add_symbols,
        **kwargs
    ) -> SuccessPostResponse:
        """add_symbols  # noqa: E501

        Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            path (str): Encode database path
            add_symbols (AddSymbols): Data for creating symbol in the database

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
            SuccessPostResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['path'] = \
            path
        kwargs['add_symbols'] = \
            add_symbols
        return self.add_symbols_endpoint.call_with_http_info(**kwargs)

    def add_symbols_with_http_info(
        self,
        path,
        add_symbols,
        **kwargs
    ) -> typing.Tuple[SuccessPostResponse, int, typing.MutableMapping]:
        """add_symbols  # noqa: E501

        Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            path (str): Encode database path
            add_symbols (AddSymbols): Data for creating symbol in the database

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
            SuccessPostResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['path'] = \
            path
        kwargs['add_symbols'] = \
            add_symbols
        return self.add_symbols_endpoint.call_with_http_info(**kwargs)

    def add_symbols_async(
        self,
        path,
        add_symbols,
        **kwargs
    ) -> "ApplyResult[SuccessPostResponse]":
        """add_symbols  # noqa: E501

        Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            add_symbols (AddSymbols): Data for creating symbol in the database

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
            ApplyResult[SuccessPostResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['path'] = \
            path
        kwargs['add_symbols'] = \
            add_symbols
        return self.add_symbols_endpoint.call_with_http_info(**kwargs)

    def add_symbols_with_http_info_async(
        self,
        path,
        add_symbols,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[SuccessPostResponse, int, typing.MutableMapping]]":
        """add_symbols  # noqa: E501

        Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            path (str): Encode database path
            add_symbols (AddSymbols): Data for creating symbol in the database

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
            ApplyResult[(SuccessPostResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['path'] = \
            path
        kwargs['add_symbols'] = \
            add_symbols
        return self.add_symbols_endpoint.call_with_http_info(**kwargs)


