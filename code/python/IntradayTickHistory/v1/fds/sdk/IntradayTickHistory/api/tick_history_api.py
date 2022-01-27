"""
    Tick History

     <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>     # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.IntradayTickHistory.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.IntradayTickHistory.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.IntradayTickHistory.model.tickhistory_response import TickhistoryResponse


class TickHistoryApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_tick_history_endpoint = _Endpoint(
            settings={
                'response_type': (TickhistoryResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/TickHistory/history',
                'operation_id': 'get_tick_history',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'id',
                    'req_id',
                    'format',
                    'fields',
                    'sd',
                    'ed',
                    'st',
                    'et',
                    'interval',
                    'include_request',
                    'dataset',
                ],
                'required': [
                    'id',
                ],
                'nullable': [
                ],
                'enum': [
                    'format',
                    'interval',
                    'include_request',
                    'dataset',
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                    ('format',): {

                        "XML": "XML",
                        "JSON": "JSON",
                        "CSV": "CSV",
                        "CSV_NO_HEADER": "CSV_NO_HEADER"
                    },
                    ('interval',): {

                        "0": "0",
                        "1S": "1S",
                        "5S": "5S",
                        "10S": "10S",
                        "15S": "15S",
                        "30S": "30S",
                        "1M": "1M",
                        "2M": "2M",
                        "5M": "5M",
                        "10M": "10M",
                        "15M": "15M",
                        "30M": "30M",
                        "1H": "1H"
                    },
                    ('include_request',): {

                        "TRUE": "true",
                        "T": "T",
                        "FALSE": "false",
                        "F": "F"
                    },
                    ('dataset',): {

                        "EMPTY": "",
                        "CHARTING": "charting"
                    },
                },
                'openapi_types': {
                    'id':
                        (str,),
                    'req_id':
                        (str,),
                    'format':
                        (str,),
                    'fields':
                        (str,),
                    'sd':
                        (str,),
                    'ed':
                        (str,),
                    'st':
                        (str,),
                    'et':
                        (str,),
                    'interval':
                        (str,),
                    'include_request':
                        (str,),
                    'dataset':
                        (str,),
                },
                'attribute_map': {
                    'id': 'id',
                    'req_id': 'req_id',
                    'format': 'format',
                    'fields': 'fields',
                    'sd': 'sd',
                    'ed': 'ed',
                    'st': 'st',
                    'et': 'et',
                    'interval': 'interval',
                    'include_request': 'include_request',
                    'dataset': 'dataset',
                },
                'location_map': {
                    'id': 'query',
                    'req_id': 'query',
                    'format': 'query',
                    'fields': 'query',
                    'sd': 'query',
                    'ed': 'query',
                    'st': 'query',
                    'et': 'query',
                    'interval': 'query',
                    'include_request': 'query',
                    'dataset': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json',
                    'application/xml',
                    'text/csv'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

    def get_tick_history(
        self,
        id,
        **kwargs
    ):
        """Tick History service returns trade data and associated quotes for a client specified interval and time period  # noqa: E501

        When using an HTTP GET request, the seach criteria is sent via the query string in the URL. Please make sure that all requests contain a date within the past trailing year. Fields are added using ampersands, with enumerations seperated by commas. <p>**Try it Out** - references a sandbox environment to simulate live reponses. Available `id` is limited to BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA. Current day data is not available.</p>  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_tick_history(id, async_req=True)
        >>> result = thread.get()

        Args:
            id (str): Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.<P>**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA

        Keyword Args:
            req_id (str): Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.. [optional]
            format (str): The format of the output file. **TRY IT OUT** Choose from JSON, CSV, CSV_NO_HEADER. [optional] if omitted the server will use the default value of "XML"
            fields (str): All available fields. This is a comma-seperated list (no spaces). See definitions for details. Default is all fields when left blank.. [optional]
            sd (str): This is the start date for the Snapshot History. Requests should be made in the format **YYYYMMDD**. Default is current business day. Field can be sd or date. **TRY IT OUT** Cannot use current day.. [optional]
            ed (str): This is the end date for teh Snapshot History. Requests should be made in the format **YYYYMMDD**. If the period requested is larger than Max. Days requested, results will be limited to the Max Days starting at sd/date. Defautl is sd or date. **TRY IT OUT** Cannot use current day.. [optional]
            st (str): Requested start time. This is the start time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day.. [optional] if omitted the server will use the default value of "040000"
            et (str): Requested end time. This is the end time for the snapshot history requested. Requests should be made in a **HHMMSSS** format. Range from 000000 - 235959. **TRY IT OUT** Cannot use current day.. [optional] if omitted the server will use the default value of "200000"
            interval (str): Requested time interval. This is the interval the data is returned from the service. Possible values from 1 Second (1S) to 1 Hour (1H). A maximum of 10 Tick History Requests and a maximum of 100,000 rows of data may be made in any one-minute period. Additional subsctiption is available to access 20 requests/200,000 rows of data per minute. Contact your FactSet team for details.. [optional] if omitted the server will use the default value of "1M"
            include_request (str): Flag to include request id and key in the CSV output.. [optional] if omitted the server will use the default value of "false"
            dataset (str): Decides what type of trades to return, default is all trades and quotes, alternatively charting can be selected which will filter out unofficial trades.. [optional]
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
            TickhistoryResponse
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
        return self.get_tick_history_endpoint.call_with_http_info(**kwargs)

