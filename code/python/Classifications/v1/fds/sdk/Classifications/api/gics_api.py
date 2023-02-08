"""
    Classifications API

    The Classifications API gives access to various Industry Classifications for a given list of securities. Beginning first with GICS Direct, the service will then expand to offering NAICS, SIC, RBICS, and more.    # noqa: E501

    The version of the OpenAPI document: 1.0.1
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.Classifications.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.Classifications.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.Classifications.exceptions import ApiException
from fds.sdk.Classifications.model.error_response import ErrorResponse
from fds.sdk.Classifications.model.gics_request import GicsRequest
from fds.sdk.Classifications.model.gics_response import GicsResponse





class GICSApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_gics_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (GicsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/classifications/v1/gics',
                'operation_id': 'get_gics',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'start_date',
                    'end_date',
                    'frequency',
                    'calendar',
                ],
                'required': [
                    'ids',
                ],
                'nullable': [
                ],
                'enum': [
                    'frequency',
                    'calendar',
                ],
                'validation': [
                    'ids',
                ]
            },
            root_map={
                'validations': {
                    ('ids',): {

                        'max_items': 1000,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                    ('frequency',): {

                        "D": "D",
                        "W": "W",
                        "M": "M",
                        "AM": "AM",
                        "CQ": "CQ",
                        "AY": "AY",
                        "CY": "CY"
                    },
                    ('calendar',): {

                        "FIVEDAY": "FIVEDAY",
                        "SEVENDAY": "SEVENDAY"
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
                    'calendar':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'frequency': 'frequency',
                    'calendar': 'calendar',
                },
                'location_map': {
                    'ids': 'query',
                    'start_date': 'query',
                    'end_date': 'query',
                    'frequency': 'query',
                    'calendar': 'query',
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

        self.post_gics_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (GicsResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/classifications/v1/gics',
                'operation_id': 'post_gics',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'gics_request',
                ],
                'required': [
                    'gics_request',
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
                    'gics_request':
                        (GicsRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'gics_request': 'body',
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


    def get_gics(
        self,
        ids,
        **kwargs
    ) -> GicsResponse:
        """Gets the GICS Direct Classifications  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            ids ([str]): The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): Requested start date expressed in YYYY-MM-DD format.. [optional]
            end_date (str): Requested End Date for Range expressed in YYYY-MM-DD format.. [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. . [optional] if omitted the server will use the default value of "M"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            GicsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_gics_endpoint.call_with_http_info(**kwargs)

    def get_gics_with_http_info(
        self,
        ids,
        **kwargs
    ) -> typing.Tuple[GicsResponse, int, typing.MutableMapping]:
        """Gets the GICS Direct Classifications  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            ids ([str]): The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): Requested start date expressed in YYYY-MM-DD format.. [optional]
            end_date (str): Requested End Date for Range expressed in YYYY-MM-DD format.. [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. . [optional] if omitted the server will use the default value of "M"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            GicsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_gics_endpoint.call_with_http_info(**kwargs)

    def get_gics_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[GicsResponse]":
        """Gets the GICS Direct Classifications  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            ids ([str]): The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): Requested start date expressed in YYYY-MM-DD format.. [optional]
            end_date (str): Requested End Date for Range expressed in YYYY-MM-DD format.. [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. . [optional] if omitted the server will use the default value of "M"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            ApplyResult[GicsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_gics_endpoint.call_with_http_info(**kwargs)

    def get_gics_with_http_info_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[GicsResponse, int, typing.MutableMapping]]":
        """Gets the GICS Direct Classifications  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            ids ([str]): The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

        Keyword Args:
            start_date (str): Requested start date expressed in YYYY-MM-DD format.. [optional]
            end_date (str): Requested End Date for Range expressed in YYYY-MM-DD format.. [optional]
            frequency (str): Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year. . [optional] if omitted the server will use the default value of "M"
            calendar (str): Calendar of data returned. SEVENDAY includes weekends.. [optional] if omitted the server will use the default value of "FIVEDAY"
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
            ApplyResult[(GicsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_gics_endpoint.call_with_http_info(**kwargs)


    def post_gics(
        self,
        gics_request,
        **kwargs
    ) -> GicsResponse:
        """Returns the GICS classifications for the requested 'ids' and date range.  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            gics_request (GicsRequest): Requests GICS Classifications for the given identifier and date range.

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
            GicsResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['gics_request'] = \
            gics_request
        return self.post_gics_endpoint.call_with_http_info(**kwargs)

    def post_gics_with_http_info(
        self,
        gics_request,
        **kwargs
    ) -> typing.Tuple[GicsResponse, int, typing.MutableMapping]:
        """Returns the GICS classifications for the requested 'ids' and date range.  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            gics_request (GicsRequest): Requests GICS Classifications for the given identifier and date range.

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
            GicsResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['gics_request'] = \
            gics_request
        return self.post_gics_endpoint.call_with_http_info(**kwargs)

    def post_gics_async(
        self,
        gics_request,
        **kwargs
    ) -> "ApplyResult[GicsResponse]":
        """Returns the GICS classifications for the requested 'ids' and date range.  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            gics_request (GicsRequest): Requests GICS Classifications for the given identifier and date range.

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
            ApplyResult[GicsResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['gics_request'] = \
            gics_request
        return self.post_gics_endpoint.call_with_http_info(**kwargs)

    def post_gics_with_http_info_async(
        self,
        gics_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[GicsResponse, int, typing.MutableMapping]]":
        """Returns the GICS classifications for the requested 'ids' and date range.  # noqa: E501

        Gets the **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](https://www.spglobal.com/spdji/en/landing/topic/gics/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.*   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            gics_request (GicsRequest): Requests GICS Classifications for the given identifier and date range.

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
            ApplyResult[(GicsResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['gics_request'] = \
            gics_request
        return self.post_gics_endpoint.call_with_http_info(**kwargs)


