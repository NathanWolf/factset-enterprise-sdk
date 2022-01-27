"""
    Prime Developer Trial

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: v1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.TimeSeriesAPIforDigitalPortals.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.TimeSeriesAPIforDigitalPortals.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object4 import InlineObject4
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object5 import InlineObject5
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object6 import InlineObject6
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object7 import InlineObject7
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object8 import InlineObject8
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response20010 import InlineResponse20010
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2005 import InlineResponse2005
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2006 import InlineResponse2006
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2007 import InlineResponse2007
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2008 import InlineResponse2008
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2009 import InlineResponse2009


class PricesApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_prices_time_series_intraday_subsample_get_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse2009,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/prices/timeSeries/intraday/subsample/get',
                'operation_id': 'get_prices_time_series_intraday_subsample_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'id',
                    '_from',
                    'type',
                    'quality',
                    'granularity',
                    'attributes',
                ],
                'required': [
                    'id',
                    '_from',
                ],
                'nullable': [
                ],
                'enum': [
                    'type',
                    'quality',
                    'granularity',
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
                    ('type',): {

                        "TRADE": "trade",
                        "BID": "bid",
                        "ASK": "ask",
                        "YIELD": "yield"
                    },
                    ('quality',): {

                        "RLT": "RLT",
                        "DLY": "DLY",
                        "BST": "BST"
                    },
                    ('granularity',): {

                        "1S": "1s",
                        "5S": "5s",
                        "10S": "10s",
                        "30S": "30s",
                        "1M": "1m",
                        "5M": "5m",
                        "10M": "10m",
                        "15M": "15m",
                        "30M": "30m",
                        "1H": "1h"
                    },
                },
                'openapi_types': {
                    'id':
                        (str,),
                    '_from':
                        (str,),
                    'type':
                        (str,),
                    'quality':
                        (str,),
                    'granularity':
                        (str,),
                    'attributes':
                        ([str],),
                },
                'attribute_map': {
                    'id': 'id',
                    '_from': 'from',
                    'type': 'type',
                    'quality': 'quality',
                    'granularity': 'granularity',
                    'attributes': '_attributes',
                },
                'location_map': {
                    'id': 'query',
                    '_from': 'query',
                    'type': 'query',
                    'quality': 'query',
                    'granularity': 'query',
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
        self.post_prices_time_series_eod_list_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse2005,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/prices/timeSeries/eod/list',
                'operation_id': 'post_prices_time_series_eod_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'body',
                ],
                'required': [
                    'body',
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
                    'body':
                        (InlineObject4,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'body': 'body',
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
        self.post_prices_time_series_eod_subsample_get_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse2006,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/prices/timeSeries/eod/subsample/get',
                'operation_id': 'post_prices_time_series_eod_subsample_get',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'body',
                ],
                'required': [
                    'body',
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
                    'body':
                        (InlineObject5,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'body': 'body',
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
        self.post_prices_time_series_eod_subsample_list_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse2007,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/prices/timeSeries/eod/subsample/list',
                'operation_id': 'post_prices_time_series_eod_subsample_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'body',
                ],
                'required': [
                    'body',
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
                    'body':
                        (InlineObject6,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'body': 'body',
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
        self.post_prices_time_series_intraday_list_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse2008,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/prices/timeSeries/intraday/list',
                'operation_id': 'post_prices_time_series_intraday_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'body',
                ],
                'required': [
                    'body',
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
                    'body':
                        (InlineObject7,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'body': 'body',
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
        self.post_prices_time_series_intraday_subsample_list_endpoint = _Endpoint(
            settings={
                'response_type': (InlineResponse20010,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/prices/timeSeries/intraday/subsample/list',
                'operation_id': 'post_prices_time_series_intraday_subsample_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'body',
                ],
                'required': [
                    'body',
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
                    'body':
                        (InlineObject8,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'body': 'body',
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

    def get_prices_time_series_intraday_subsample_get(
        self,
        id,
        _from,
        **kwargs
    ):
        """Single subsample intraday data for a notation.  # noqa: E501

        Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_prices_time_series_intraday_subsample_get(id, _from, async_req=True)
        >>> result = thread.get()

        Args:
            id (str): Identifier of the notation.
            _from (str): Date and time of the start point of the subsample (inclusive). `from` must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed.

        Keyword Args:
            type (str): Type of the price as configured for the customer.. [optional] if omitted the server will use the default value of "trade"
            quality (str): Quality of the price.. [optional] if omitted the server will use the default value of "DLY"
            granularity (str): Subsample granularities suitable for intraday data.. [optional] if omitted the server will use the default value of "1h"
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
            InlineResponse2009
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
        kwargs['_from'] = \
            _from
        return self.get_prices_time_series_intraday_subsample_get_endpoint.call_with_http_info(**kwargs)

    def post_prices_time_series_eod_list(
        self,
        body,
        **kwargs
    ):
        """End-of-day time series data for a notation.  # noqa: E501

        End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.post_prices_time_series_eod_list(body, async_req=True)
        >>> result = thread.get()

        Args:
            body (InlineObject4):

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
            InlineResponse2005
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
        kwargs['body'] = \
            body
        return self.post_prices_time_series_eod_list_endpoint.call_with_http_info(**kwargs)

    def post_prices_time_series_eod_subsample_get(
        self,
        body,
        **kwargs
    ):
        """Single subsample end-of-day data for a notation.  # noqa: E501

        Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.post_prices_time_series_eod_subsample_get(body, async_req=True)
        >>> result = thread.get()

        Args:
            body (InlineObject5):

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
            InlineResponse2006
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
        kwargs['body'] = \
            body
        return self.post_prices_time_series_eod_subsample_get_endpoint.call_with_http_info(**kwargs)

    def post_prices_time_series_eod_subsample_list(
        self,
        body,
        **kwargs
    ):
        """Subsampled end-of-day time series data for a notation.  # noqa: E501

        Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.post_prices_time_series_eod_subsample_list(body, async_req=True)
        >>> result = thread.get()

        Args:
            body (InlineObject6):

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
            InlineResponse2007
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
        kwargs['body'] = \
            body
        return self.post_prices_time_series_eod_subsample_list_endpoint.call_with_http_info(**kwargs)

    def post_prices_time_series_intraday_list(
        self,
        body,
        **kwargs
    ):
        """Intraday time series data for a notation.  # noqa: E501

        Intraday time series data for a notation.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.post_prices_time_series_intraday_list(body, async_req=True)
        >>> result = thread.get()

        Args:
            body (InlineObject7):

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
            InlineResponse2008
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
        kwargs['body'] = \
            body
        return self.post_prices_time_series_intraday_list_endpoint.call_with_http_info(**kwargs)

    def post_prices_time_series_intraday_subsample_list(
        self,
        body,
        **kwargs
    ):
        """Subsampled intraday time series data for a notation.  # noqa: E501

        Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.post_prices_time_series_intraday_subsample_list(body, async_req=True)
        >>> result = thread.get()

        Args:
            body (InlineObject8):

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
            InlineResponse20010
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
        kwargs['body'] = \
            body
        return self.post_prices_time_series_intraday_subsample_list_endpoint.call_with_http_info(**kwargs)

