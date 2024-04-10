"""
    Issue Tracker API

    This API is used to file issues  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.IssueTracker.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.IssueTracker.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.IssueTracker.exceptions import ApiException
from fds.sdk.IssueTracker.model.comment_request import CommentRequest
from fds.sdk.IssueTracker.model.error_response import ErrorResponse
from fds.sdk.IssueTracker.model.id_response import IdResponse
from fds.sdk.IssueTracker.model.issue import Issue
from fds.sdk.IssueTracker.model.issue_request import IssueRequest





class IssueApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_issue_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (Issue,), 404: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/issues/{id}',
                'operation_id': 'get_issue',
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

        self.post_issue_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 201: (IdResponse,), 400: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/issues',
                'operation_id': 'post_issue',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'issue_request',
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
                    'issue_request':
                        (IssueRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'issue_request': 'body',
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

        self.post_reply_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 201: (IdResponse,), 400: (ErrorResponse,), 500: (ErrorResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/issues/{id}/comments',
                'operation_id': 'post_reply',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'id',
                    'comment_request',
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
                    'comment_request':
                        (CommentRequest,),
                },
                'attribute_map': {
                    'id': 'id',
                },
                'location_map': {
                    'id': 'path',
                    'comment_request': 'body',
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


    def get_issue(
        self,
        id,
        **kwargs
    ) -> Issue:
        """Get the matched issue details  # noqa: E501

        Retrieve the information of the client with the matching issue Id.  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str):   ID of Issue Tracker issue

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            Issue
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.get_issue_endpoint.call_with_http_info(**kwargs)

    def get_issue_with_http_info(
        self,
        id,
        **kwargs
    ) -> typing.Tuple[Issue, int, typing.MutableMapping]:
        """Get the matched issue details  # noqa: E501

        Retrieve the information of the client with the matching issue Id.  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str):   ID of Issue Tracker issue

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            Issue
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.get_issue_endpoint.call_with_http_info(**kwargs)

    def get_issue_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[Issue]":
        """Get the matched issue details  # noqa: E501

        Retrieve the information of the client with the matching issue Id.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str):   ID of Issue Tracker issue

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[Issue]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.get_issue_endpoint.call_with_http_info(**kwargs)

    def get_issue_with_http_info_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[Issue, int, typing.MutableMapping]]":
        """Get the matched issue details  # noqa: E501

        Retrieve the information of the client with the matching issue Id.  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str):   ID of Issue Tracker issue

        Keyword Args:
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[(Issue, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.get_issue_endpoint.call_with_http_info(**kwargs)


    def post_issue(
        self,
        **kwargs
    ) -> IdResponse:
        """Creates a Issue Tracker issue  # noqa: E501

        Creates a new issue in Issue Tracker  # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only


        Keyword Args:
            issue_request (IssueRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            IdResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        return self.post_issue_endpoint.call_with_http_info(**kwargs)

    def post_issue_with_http_info(
        self,
        **kwargs
    ) -> typing.Tuple[IdResponse, int, typing.MutableMapping]:
        """Creates a Issue Tracker issue  # noqa: E501

        Creates a new issue in Issue Tracker  # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers


        Keyword Args:
            issue_request (IssueRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            IdResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        return self.post_issue_endpoint.call_with_http_info(**kwargs)

    def post_issue_async(
        self,
        **kwargs
    ) -> "ApplyResult[IdResponse]":
        """Creates a Issue Tracker issue  # noqa: E501

        Creates a new issue in Issue Tracker  # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult


        Keyword Args:
            issue_request (IssueRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[IdResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        return self.post_issue_endpoint.call_with_http_info(**kwargs)

    def post_issue_with_http_info_async(
        self,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[IdResponse, int, typing.MutableMapping]]":
        """Creates a Issue Tracker issue  # noqa: E501

        Creates a new issue in Issue Tracker  # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult


        Keyword Args:
            issue_request (IssueRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[(IdResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        return self.post_issue_endpoint.call_with_http_info(**kwargs)


    def post_reply(
        self,
        id,
        **kwargs
    ) -> IdResponse:
        """post comment to Issue Tracker issue  # noqa: E501

        Reply to the existing matched issue   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str): ID of Issue Tracker issue

        Keyword Args:
            comment_request (CommentRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            IdResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.post_reply_endpoint.call_with_http_info(**kwargs)

    def post_reply_with_http_info(
        self,
        id,
        **kwargs
    ) -> typing.Tuple[IdResponse, int, typing.MutableMapping]:
        """post comment to Issue Tracker issue  # noqa: E501

        Reply to the existing matched issue   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str): ID of Issue Tracker issue

        Keyword Args:
            comment_request (CommentRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            IdResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.post_reply_endpoint.call_with_http_info(**kwargs)

    def post_reply_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[IdResponse]":
        """post comment to Issue Tracker issue  # noqa: E501

        Reply to the existing matched issue   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str): ID of Issue Tracker issue

        Keyword Args:
            comment_request (CommentRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[IdResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.post_reply_endpoint.call_with_http_info(**kwargs)

    def post_reply_with_http_info_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[IdResponse, int, typing.MutableMapping]]":
        """post comment to Issue Tracker issue  # noqa: E501

        Reply to the existing matched issue   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str): ID of Issue Tracker issue

        Keyword Args:
            comment_request (CommentRequest): [optional]
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True. NOTE: if this API returns a file, it is the responsibility
                of the caller to close the file stream.
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
            ApplyResult[(IdResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.post_reply_endpoint.call_with_http_info(**kwargs)


