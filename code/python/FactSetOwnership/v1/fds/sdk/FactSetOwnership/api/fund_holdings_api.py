"""
    FactSet Ownership API

    FactSet’s Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p>   # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetOwnership.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetOwnership.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetOwnership.exceptions import ApiException
from fds.sdk.FactSetOwnership.model.error_response import ErrorResponse
from fds.sdk.FactSetOwnership.model.fund_holdings_request import FundHoldingsRequest
from fds.sdk.FactSetOwnership.model.fund_holdings_response import FundHoldingsResponse





class FundHoldingsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_ownership_holdings_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (FundHoldingsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-ownership/v1/fund-holdings',
                'operation_id': 'get_ownership_holdings',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'date',
                    'topn',
                    'asset_type',
                    'currency',
                ],
                'required': [
                    'ids',
                ],
                'nullable': [
                ],
                'enum': [
                    'asset_type',
                ],
                'validation': [
                    'ids',
                ]
            },
            root_map={
                'validations': {
                    ('ids',): {

                        'max_items': 10,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                    ('asset_type',): {

                        "ALL": "ALL",
                        "EQ": "EQ",
                        "FI": "FI"
                    },
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                    'date':
                        (str,),
                    'topn':
                        (str,),
                    'asset_type':
                        (str,),
                    'currency':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'date': 'date',
                    'topn': 'topn',
                    'asset_type': 'assetType',
                    'currency': 'currency',
                },
                'location_map': {
                    'ids': 'query',
                    'date': 'query',
                    'topn': 'query',
                    'asset_type': 'query',
                    'currency': 'query',
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

        self.post_ownership_holdings_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (FundHoldingsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-ownership/v1/fund-holdings',
                'operation_id': 'post_ownership_holdings',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'fund_holdings_request',
                ],
                'required': [
                    'fund_holdings_request',
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
                    'fund_holdings_request':
                        (FundHoldingsRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'fund_holdings_request': 'body',
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


    def get_ownership_holdings(
        self,
        ids,
        **kwargs
    ) -> FundHoldingsResponse:
        """Get underlying holdings information for a requested fund identifer.  # noqa: E501

        Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            ids ([str]): List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>

        Keyword Args:
            date (str): Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.. [optional]
            topn (str): Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.. [optional] if omitted the server will use the default value of "ALL"
            asset_type (str): Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL . [optional] if omitted the server will use the default value of "EQ"
            currency (str): Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).. [optional]
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
            FundHoldingsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_ownership_holdings_endpoint.call_with_http_info(**kwargs)

    def get_ownership_holdings_with_http_info(
        self,
        ids,
        **kwargs
    ) -> typing.Tuple[FundHoldingsResponse, int, typing.MutableMapping]:
        """Get underlying holdings information for a requested fund identifer.  # noqa: E501

        Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            ids ([str]): List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>

        Keyword Args:
            date (str): Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.. [optional]
            topn (str): Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.. [optional] if omitted the server will use the default value of "ALL"
            asset_type (str): Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL . [optional] if omitted the server will use the default value of "EQ"
            currency (str): Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).. [optional]
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
            FundHoldingsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_ownership_holdings_endpoint.call_with_http_info(**kwargs)

    def get_ownership_holdings_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[FundHoldingsResponse]":
        """Get underlying holdings information for a requested fund identifer.  # noqa: E501

        Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            ids ([str]): List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>

        Keyword Args:
            date (str): Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.. [optional]
            topn (str): Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.. [optional] if omitted the server will use the default value of "ALL"
            asset_type (str): Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL . [optional] if omitted the server will use the default value of "EQ"
            currency (str): Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).. [optional]
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
            ApplyResult[FundHoldingsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_ownership_holdings_endpoint.call_with_http_info(**kwargs)

    def get_ownership_holdings_with_http_info_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[FundHoldingsResponse, int, typing.MutableMapping]]":
        """Get underlying holdings information for a requested fund identifer.  # noqa: E501

        Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            ids ([str]): List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>

        Keyword Args:
            date (str): Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.. [optional]
            topn (str): Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.. [optional] if omitted the server will use the default value of "ALL"
            asset_type (str): Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL . [optional] if omitted the server will use the default value of "EQ"
            currency (str): Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).. [optional]
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
            ApplyResult[(FundHoldingsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_ownership_holdings_endpoint.call_with_http_info(**kwargs)


    def post_ownership_holdings(
        self,
        fund_holdings_request,
        **kwargs
    ) -> FundHoldingsResponse:
        """Get holdings for a list of funds.  # noqa: E501

        Gets Holding information for a long list of Fund objects.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            fund_holdings_request (FundHoldingsRequest): Requesting Underlying Holdings for a list of Fund Identifiers.

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
            FundHoldingsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['fund_holdings_request'] = \
            fund_holdings_request
        return self.post_ownership_holdings_endpoint.call_with_http_info(**kwargs)

    def post_ownership_holdings_with_http_info(
        self,
        fund_holdings_request,
        **kwargs
    ) -> typing.Tuple[FundHoldingsResponse, int, typing.MutableMapping]:
        """Get holdings for a list of funds.  # noqa: E501

        Gets Holding information for a long list of Fund objects.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            fund_holdings_request (FundHoldingsRequest): Requesting Underlying Holdings for a list of Fund Identifiers.

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
            FundHoldingsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['fund_holdings_request'] = \
            fund_holdings_request
        return self.post_ownership_holdings_endpoint.call_with_http_info(**kwargs)

    def post_ownership_holdings_async(
        self,
        fund_holdings_request,
        **kwargs
    ) -> "ApplyResult[FundHoldingsResponse]":
        """Get holdings for a list of funds.  # noqa: E501

        Gets Holding information for a long list of Fund objects.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            fund_holdings_request (FundHoldingsRequest): Requesting Underlying Holdings for a list of Fund Identifiers.

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
            ApplyResult[FundHoldingsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['fund_holdings_request'] = \
            fund_holdings_request
        return self.post_ownership_holdings_endpoint.call_with_http_info(**kwargs)

    def post_ownership_holdings_with_http_info_async(
        self,
        fund_holdings_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[FundHoldingsResponse, int, typing.MutableMapping]]":
        """Get holdings for a list of funds.  # noqa: E501

        Gets Holding information for a long list of Fund objects.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            fund_holdings_request (FundHoldingsRequest): Requesting Underlying Holdings for a list of Fund Identifiers.

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
            ApplyResult[(FundHoldingsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['fund_holdings_request'] = \
            fund_holdings_request
        return self.post_ownership_holdings_endpoint.call_with_http_info(**kwargs)


