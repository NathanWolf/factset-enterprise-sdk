"""
    Investment Banking Office Refresh API

    Service for refreshing models with refreshable FactSet objects (e.g., =FDS codes)  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.InvestmentBankingOfficeRefresh.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.InvestmentBankingOfficeRefresh.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.InvestmentBankingOfficeRefresh.exceptions import ApiException
from fds.sdk.InvestmentBankingOfficeRefresh.model.errors import Errors
from fds.sdk.InvestmentBankingOfficeRefresh.model.job_status import JobStatus



class GetFileByIdResponseWrapper:
    def __init__(self, status_code: int, response: object):
        """
        This constructor initializes the new GetFileByIdResponseWrapper
        to status_code, response

        Args:
            response (object): Raw response
            status_code (int): Http status code of the response
        """

        self.status_code = status_code
        self.response = response

    def get_status_code(self) -> int:
        """
        Returns: Http status code of the response
        """
        return self.status_code

    def get_response(self) -> object:
        """
        Returns: Raw Object response
        """
        return self.response

    def get_response_200(self) -> file_type:
        """
        Raises: ApiException: Invalid response getter called.

        Returns: Expected response; body will contain calculated file
        """
        if self.status_code != 200:
            raise ApiException(
                status=500,
                reason="Invalid response getter called. get_response_200 can't return a " + self.status_code + " response"
            )
        return self.response

    def get_response_202(self) -> JobStatus:
        """
        Raises: ApiException: Invalid response getter called.

        Returns: Accepted (resource not ready yet)
        """
        if self.status_code != 202:
            raise ApiException(
                status=500,
                reason="Invalid response getter called. get_response_202 can't return a " + self.status_code + " response"
            )
        return self.response




class ModelRefreshApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_file_by_id_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (file_type,), 202: (JobStatus,), 400: (Errors,), 404: (Errors,), 429: (Errors,), 500: (Errors,),  },
                  GetFileByIdResponseWrapper
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/refresh/{id}',
                'operation_id': 'get_file_by_id',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'id',
                    'output_file_name',
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
                    'output_file_name':
                        (str,),
                },
                'attribute_map': {
                    'id': 'id',
                    'output_file_name': 'outputFileName',
                },
                'location_map': {
                    'id': 'path',
                    'output_file_name': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet',
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

        self.get_status_by_id_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 201: (JobStatus,), 202: (JobStatus,), 400: (Errors,), 404: (Errors,), 429: (Errors,), 500: (Errors,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/refresh/{id}/status',
                'operation_id': 'get_status_by_id',
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

        self.post_workbook_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 202: (JobStatus,), 400: (Errors,), 429: (Errors,), 500: (Errors,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/refresh',
                'operation_id': 'post_workbook',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'body',
                    'now_handling_enabled',
                    'refresh_auto_filters',
                    'resize_arrays',
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
                        (file_type,),
                    'now_handling_enabled':
                        (bool,),
                    'refresh_auto_filters':
                        (bool,),
                    'resize_arrays':
                        (bool,),
                },
                'attribute_map': {
                    'now_handling_enabled': 'nowHandlingEnabled',
                    'refresh_auto_filters': 'refreshAutoFilters',
                    'resize_arrays': 'resizeArrays',
                },
                'location_map': {
                    'body': 'body',
                    'now_handling_enabled': 'query',
                    'refresh_auto_filters': 'query',
                    'resize_arrays': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
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


    def get_file_by_id(
        self,
        id,
        **kwargs
    ) -> GetFileByIdResponseWrapper:
        """Retrieve a calculated file by resource ID.  # noqa: E501

        If the requested job is complete, the calculated file will be returned.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str): Resource ID

        Keyword Args:
            output_file_name (str): Optional name for returned output file as set in the Content-Disposition response header.. [optional]
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
            GetFileByIdResponseWrapper
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.get_file_by_id_endpoint.call_with_http_info(**kwargs)

    def get_file_by_id_with_http_info(
        self,
        id,
        **kwargs
    ) -> typing.Tuple[GetFileByIdResponseWrapper, int, typing.MutableMapping]:
        """Retrieve a calculated file by resource ID.  # noqa: E501

        If the requested job is complete, the calculated file will be returned.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str): Resource ID

        Keyword Args:
            output_file_name (str): Optional name for returned output file as set in the Content-Disposition response header.. [optional]
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
            GetFileByIdResponseWrapper
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.get_file_by_id_endpoint.call_with_http_info(**kwargs)

    def get_file_by_id_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[GetFileByIdResponseWrapper]":
        """Retrieve a calculated file by resource ID.  # noqa: E501

        If the requested job is complete, the calculated file will be returned.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str): Resource ID

        Keyword Args:
            output_file_name (str): Optional name for returned output file as set in the Content-Disposition response header.. [optional]
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
            ApplyResult[GetFileByIdResponseWrapper]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.get_file_by_id_endpoint.call_with_http_info(**kwargs)

    def get_file_by_id_with_http_info_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[GetFileByIdResponseWrapper, int, typing.MutableMapping]]":
        """Retrieve a calculated file by resource ID.  # noqa: E501

        If the requested job is complete, the calculated file will be returned.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str): Resource ID

        Keyword Args:
            output_file_name (str): Optional name for returned output file as set in the Content-Disposition response header.. [optional]
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
            ApplyResult[(GetFileByIdResponseWrapper, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.get_file_by_id_endpoint.call_with_http_info(**kwargs)


    def get_status_by_id(
        self,
        id,
        **kwargs
    ) -> JobStatus:
        """Get the status of the refresh job with the given resource ID  # noqa: E501

        Check the status of the given job by ID  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str): Resource ID

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
            JobStatus
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.get_status_by_id_endpoint.call_with_http_info(**kwargs)

    def get_status_by_id_with_http_info(
        self,
        id,
        **kwargs
    ) -> typing.Tuple[JobStatus, int, typing.MutableMapping]:
        """Get the status of the refresh job with the given resource ID  # noqa: E501

        Check the status of the given job by ID  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str): Resource ID

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
            JobStatus
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.get_status_by_id_endpoint.call_with_http_info(**kwargs)

    def get_status_by_id_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[JobStatus]":
        """Get the status of the refresh job with the given resource ID  # noqa: E501

        Check the status of the given job by ID  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str): Resource ID

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
            ApplyResult[JobStatus]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.get_status_by_id_endpoint.call_with_http_info(**kwargs)

    def get_status_by_id_with_http_info_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[JobStatus, int, typing.MutableMapping]]":
        """Get the status of the refresh job with the given resource ID  # noqa: E501

        Check the status of the given job by ID  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str): Resource ID

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
            ApplyResult[(JobStatus, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.get_status_by_id_endpoint.call_with_http_info(**kwargs)


    def post_workbook(
        self,
        body,
        **kwargs
    ) -> JobStatus:
        """Upload a model  # noqa: E501

        Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            body (file_type):

        Keyword Args:
            now_handling_enabled (bool): Option to handle =NOW codes.. [optional]
            refresh_auto_filters (bool): Option to refresh codes in autofilters.. [optional]
            resize_arrays (bool): Option to resize arrays. [optional]
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
            JobStatus
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['body'] = \
            body
        return self.post_workbook_endpoint.call_with_http_info(**kwargs)

    def post_workbook_with_http_info(
        self,
        body,
        **kwargs
    ) -> typing.Tuple[JobStatus, int, typing.MutableMapping]:
        """Upload a model  # noqa: E501

        Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            body (file_type):

        Keyword Args:
            now_handling_enabled (bool): Option to handle =NOW codes.. [optional]
            refresh_auto_filters (bool): Option to refresh codes in autofilters.. [optional]
            resize_arrays (bool): Option to resize arrays. [optional]
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
            JobStatus
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['body'] = \
            body
        return self.post_workbook_endpoint.call_with_http_info(**kwargs)

    def post_workbook_async(
        self,
        body,
        **kwargs
    ) -> "ApplyResult[JobStatus]":
        """Upload a model  # noqa: E501

        Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            body (file_type):

        Keyword Args:
            now_handling_enabled (bool): Option to handle =NOW codes.. [optional]
            refresh_auto_filters (bool): Option to refresh codes in autofilters.. [optional]
            resize_arrays (bool): Option to resize arrays. [optional]
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
            ApplyResult[JobStatus]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['body'] = \
            body
        return self.post_workbook_endpoint.call_with_http_info(**kwargs)

    def post_workbook_with_http_info_async(
        self,
        body,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[JobStatus, int, typing.MutableMapping]]":
        """Upload a model  # noqa: E501

        Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            body (file_type):

        Keyword Args:
            now_handling_enabled (bool): Option to handle =NOW codes.. [optional]
            refresh_auto_filters (bool): Option to refresh codes in autofilters.. [optional]
            resize_arrays (bool): Option to resize arrays. [optional]
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
            ApplyResult[(JobStatus, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['body'] = \
            body
        return self.post_workbook_endpoint.call_with_http_info(**kwargs)


