"""
    FactSet Entity API

    Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.   # noqa: E501

    The version of the OpenAPI document: 1.4.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.FactSetEntity.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetEntity.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetEntity.exceptions import ApiException
from fds.sdk.FactSetEntity.model.credit_parent_request import CreditParentRequest
from fds.sdk.FactSetEntity.model.credit_parent_response import CreditParentResponse
from fds.sdk.FactSetEntity.model.error_response import ErrorResponse





class HistoricalCreditParentApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_hist_cred_parent_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (CreditParentResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-entity/v1/hist-credit-parent',
                'operation_id': 'get_hist_cred_parent',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'ids',
                    'as_of_date',
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

                        'max_items': 50,
                        'min_items': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'ids':
                        ([str],),
                    'as_of_date':
                        (str,),
                },
                'attribute_map': {
                    'ids': 'ids',
                    'as_of_date': 'asOfDate',
                },
                'location_map': {
                    'ids': 'query',
                    'as_of_date': 'query',
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

        self.post_hist_cred_parent_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (CreditParentResponse,), 400: (ErrorResponse,), 401: (ErrorResponse,), 403: (ErrorResponse,), 415: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-entity/v1/hist-credit-parent',
                'operation_id': 'post_hist_cred_parent',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'credit_parent_request',
                ],
                'required': [
                    'credit_parent_request',
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
                    'credit_parent_request':
                        (CreditParentRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'credit_parent_request': 'body',
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


    def get_hist_cred_parent(
        self,
        ids,
        **kwargs
    ) -> CreditParentResponse:
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            ids ([str]): The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

        Keyword Args:
            as_of_date (str): The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned. . [optional]
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
            CreditParentResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_hist_cred_parent_endpoint.call_with_http_info(**kwargs)

    def get_hist_cred_parent_with_http_info(
        self,
        ids,
        **kwargs
    ) -> typing.Tuple[CreditParentResponse, int, typing.MutableMapping]:
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            ids ([str]): The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

        Keyword Args:
            as_of_date (str): The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned. . [optional]
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
            CreditParentResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['ids'] = \
            ids
        return self.get_hist_cred_parent_endpoint.call_with_http_info(**kwargs)

    def get_hist_cred_parent_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[CreditParentResponse]":
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            ids ([str]): The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

        Keyword Args:
            as_of_date (str): The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned. . [optional]
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
            ApplyResult[CreditParentResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_hist_cred_parent_endpoint.call_with_http_info(**kwargs)

    def get_hist_cred_parent_with_http_info_async(
        self,
        ids,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[CreditParentResponse, int, typing.MutableMapping]]":
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            ids ([str]): The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

        Keyword Args:
            as_of_date (str): The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned. . [optional]
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
            ApplyResult[(CreditParentResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['ids'] = \
            ids
        return self.get_hist_cred_parent_endpoint.call_with_http_info(**kwargs)


    def post_hist_cred_parent(
        self,
        credit_parent_request,
        **kwargs
    ) -> CreditParentResponse:
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            credit_parent_request (CreditParentRequest): Request Body to request a list of credit parent objects.

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
            CreditParentResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['credit_parent_request'] = \
            credit_parent_request
        return self.post_hist_cred_parent_endpoint.call_with_http_info(**kwargs)

    def post_hist_cred_parent_with_http_info(
        self,
        credit_parent_request,
        **kwargs
    ) -> typing.Tuple[CreditParentResponse, int, typing.MutableMapping]:
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            credit_parent_request (CreditParentRequest): Request Body to request a list of credit parent objects.

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
            CreditParentResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['credit_parent_request'] = \
            credit_parent_request
        return self.post_hist_cred_parent_endpoint.call_with_http_info(**kwargs)

    def post_hist_cred_parent_async(
        self,
        credit_parent_request,
        **kwargs
    ) -> "ApplyResult[CreditParentResponse]":
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            credit_parent_request (CreditParentRequest): Request Body to request a list of credit parent objects.

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
            ApplyResult[CreditParentResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['credit_parent_request'] = \
            credit_parent_request
        return self.post_hist_cred_parent_endpoint.call_with_http_info(**kwargs)

    def post_hist_cred_parent_with_http_info_async(
        self,
        credit_parent_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[CreditParentResponse, int, typing.MutableMapping]]":
        """Returns historical credit parents for the requested id(s).  # noqa: E501

        Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            credit_parent_request (CreditParentRequest): Request Body to request a list of credit parent objects.

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
            ApplyResult[(CreditParentResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['credit_parent_request'] = \
            credit_parent_request
        return self.post_hist_cred_parent_endpoint.call_with_http_info(**kwargs)


