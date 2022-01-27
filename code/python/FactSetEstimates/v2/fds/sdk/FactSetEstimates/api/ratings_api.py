"""
    FactSet Estimates

    Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market.   # noqa: E501

    The version of the OpenAPI document: 2.3.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetEstimates.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetEstimates.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetEstimates.model.consensus_ratings_request import ConsensusRatingsRequest
from fds.sdk.FactSetEstimates.model.consensus_ratings_response import ConsensusRatingsResponse
from fds.sdk.FactSetEstimates.model.detail_ratings_request import DetailRatingsRequest
from fds.sdk.FactSetEstimates.model.detail_ratings_response import DetailRatingsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse


class RatingsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_consensus_ratings_endpoint = _Endpoint(
            settings={
                'response_type': (ConsensusRatingsResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-estimates/v2/consensus-ratings',
                'operation_id': 'get_consensus_ratings',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'start_date',
                    'end_date',
                    'frequency',
                ],
                'required': [
                    'ids',
                ],
                'nullable': [
                ],
                'enum': [
                    'frequency',
                ],
                'validation': [
                    'ids',
                ]
            },
            root_map={
                'validations': {
                    ('ids',): {

                        'max_items': 3000,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                    ('frequency',): {

                        "D": "D",
                        "W": "W",
                        "AM": "AM",
                        "AQ": "AQ",
                        "AY": "AY"
                    },
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                    'frequency':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'frequency': 'frequency',
                },
                'location_map': {
                    'ids': 'query',
                    'start_date': 'query',
                    'end_date': 'query',
                    'frequency': 'query',
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
        self.get_consensus_ratings_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (ConsensusRatingsResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-estimates/v2/consensus-ratings',
                'operation_id': 'get_consensus_ratings_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'consensus_ratings_request',
                ],
                'required': [
                    'consensus_ratings_request',
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
                    'consensus_ratings_request':
                        (ConsensusRatingsRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'consensus_ratings_request': 'body',
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
        self.get_detail_ratings_endpoint = _Endpoint(
            settings={
                'response_type': (DetailRatingsResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-estimates/v2/detail-ratings',
                'operation_id': 'get_detail_ratings',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'start_date',
                    'end_date',
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

                        'max_items': 3000,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                },
                'location_map': {
                    'ids': 'query',
                    'start_date': 'query',
                    'end_date': 'query',
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
        self.get_detail_ratings_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (DetailRatingsResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-estimates/v2/detail-ratings',
                'operation_id': 'get_detail_ratings_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'detail_ratings_request',
                ],
                'required': [
                    'detail_ratings_request',
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
                    'detail_ratings_request':
                        (DetailRatingsRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'detail_ratings_request': 'body',
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

    def get_consensus_ratings(
        self,
        ids,
        **kwargs
    ):
        """Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.  # noqa: E501

        Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_consensus_ratings(ids, async_req=True)
        >>> result = thread.get()

        Args:
            ids ([str]): Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 

        Keyword Args:
            start_date (str): Start date for point in time of estimates expressed in YYYY-MM-DD format.. [optional]
            end_date (str): End date for point in time of estimates expressed in YYYY-MM-DD format.. [optional]
            frequency (str): Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  . [optional] if omitted the server will use the default value of "D"
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
            ConsensusRatingsResponse
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
        kwargs['ids'] = \
            ids
        return self.get_consensus_ratings_endpoint.call_with_http_info(**kwargs)

    def get_consensus_ratings_for_list(
        self,
        consensus_ratings_request,
        **kwargs
    ):
        """Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.  # noqa: E501

        Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_consensus_ratings_for_list(consensus_ratings_request, async_req=True)
        >>> result = thread.get()

        Args:
            consensus_ratings_request (ConsensusRatingsRequest): Request object for Estimate Data Items.

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
            ConsensusRatingsResponse
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
        kwargs['consensus_ratings_request'] = \
            consensus_ratings_request
        return self.get_consensus_ratings_for_list_endpoint.call_with_http_info(**kwargs)

    def get_detail_ratings(
        self,
        ids,
        **kwargs
    ):
        """Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.  # noqa: E501

        Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p>   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_detail_ratings(ids, async_req=True)
        >>> result = thread.get()

        Args:
            ids ([str]): Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 

        Keyword Args:
            start_date (str): Start date for point in time of estimates expressed in YYYY-MM-DD format.. [optional]
            end_date (str): End date for point in time of estimates expressed in YYYY-MM-DD format.. [optional]
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
            DetailRatingsResponse
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
        kwargs['ids'] = \
            ids
        return self.get_detail_ratings_endpoint.call_with_http_info(**kwargs)

    def get_detail_ratings_for_list(
        self,
        detail_ratings_request,
        **kwargs
    ):
        """Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.  # noqa: E501

        Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p>   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_detail_ratings_for_list(detail_ratings_request, async_req=True)
        >>> result = thread.get()

        Args:
            detail_ratings_request (DetailRatingsRequest): Request object for Detail Reatings Data Items.

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
            DetailRatingsResponse
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
        kwargs['detail_ratings_request'] = \
            detail_ratings_request
        return self.get_detail_ratings_for_list_endpoint.call_with_http_info(**kwargs)

