"""
    IRN API v1

    Allows users to extract, create, update and configure IRN data.  # noqa: E501

    The version of the OpenAPI document: 1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.IRNMeetings.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.IRNMeetings.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.IRNMeetings.model.attachment_summary_dto import AttachmentSummaryDto
from fds.sdk.IRNMeetings.model.comment_dto import CommentDto
from fds.sdk.IRNMeetings.model.comment_summary_dto import CommentSummaryDto
from fds.sdk.IRNMeetings.model.create_comment_dto import CreateCommentDto
from fds.sdk.IRNMeetings.model.new_item_dto import NewItemDto
from fds.sdk.IRNMeetings.model.operation import Operation
from fds.sdk.IRNMeetings.model.problem_details import ProblemDetails


class CommentsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.create_comment_endpoint = _Endpoint(
            settings={
                'response_type': (NewItemDto,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments',
                'operation_id': 'create_comment',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'create_comment_dto',
                ],
                'required': [
                    'meeting_id',
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
                    'meeting_id':
                        (str,),
                    'create_comment_dto':
                        (CreateCommentDto,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'create_comment_dto': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json-patch+json',
                    'application/json',
                    'text/json',
                    'application/*+json'
                ]
            },
            api_client=api_client
        )
        self.create_comment_attachment_endpoint = _Endpoint(
            settings={
                'response_type': (NewItemDto,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments/{commentId}/attachments',
                'operation_id': 'create_comment_attachment',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'comment_id',
                    'file',
                ],
                'required': [
                    'meeting_id',
                    'comment_id',
                    'file',
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
                    'meeting_id':
                        (str,),
                    'comment_id':
                        (str,),
                    'file':
                        (file_type,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                    'comment_id': 'commentId',
                    'file': 'file',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'comment_id': 'path',
                    'file': 'form',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'multipart/form-data'
                ]
            },
            api_client=api_client
        )
        self.delete_comment_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments/{commentId}',
                'operation_id': 'delete_comment',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'comment_id',
                ],
                'required': [
                    'meeting_id',
                    'comment_id',
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
                    'meeting_id':
                        (str,),
                    'comment_id':
                        (str,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                    'comment_id': 'commentId',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'comment_id': 'path',
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
        self.download_comment_attachment_for_comment_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments/{commentId}/attachments/{attachmentId}/download',
                'operation_id': 'download_comment_attachment_for_comment',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'comment_id',
                    'attachment_id',
                ],
                'required': [
                    'meeting_id',
                    'comment_id',
                    'attachment_id',
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
                    'meeting_id':
                        (str,),
                    'comment_id':
                        (str,),
                    'attachment_id':
                        (str,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                    'comment_id': 'commentId',
                    'attachment_id': 'attachmentId',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'comment_id': 'path',
                    'attachment_id': 'path',
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
        self.get_comment_endpoint = _Endpoint(
            settings={
                'response_type': (CommentDto,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments/{commentId}',
                'operation_id': 'get_comment',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'comment_id',
                ],
                'required': [
                    'meeting_id',
                    'comment_id',
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
                    'meeting_id':
                        (str,),
                    'comment_id':
                        (str,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                    'comment_id': 'commentId',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'comment_id': 'path',
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
        self.get_comment_attachments_endpoint = _Endpoint(
            settings={
                'response_type': ([AttachmentSummaryDto],),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments/{commentId}/attachments',
                'operation_id': 'get_comment_attachments',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'comment_id',
                ],
                'required': [
                    'meeting_id',
                    'comment_id',
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
                    'meeting_id':
                        (str,),
                    'comment_id':
                        (str,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                    'comment_id': 'commentId',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'comment_id': 'path',
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
        self.get_comments_endpoint = _Endpoint(
            settings={
                'response_type': ([CommentSummaryDto],),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments',
                'operation_id': 'get_comments',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                ],
                'required': [
                    'meeting_id',
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
                    'meeting_id':
                        (str,),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                },
                'location_map': {
                    'meeting_id': 'path',
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
        self.patch_comment_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/meetings/{meetingId}/comments/{commentId}',
                'operation_id': 'patch_comment',
                'http_method': 'PATCH',
                'servers': None,
            },
            params_map={
                'all': [
                    'meeting_id',
                    'comment_id',
                    'operation',
                ],
                'required': [
                    'meeting_id',
                    'comment_id',
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
                    'meeting_id':
                        (str,),
                    'comment_id':
                        (str,),
                    'operation':
                        ([Operation],),
                },
                'attribute_map': {
                    'meeting_id': 'meetingId',
                    'comment_id': 'commentId',
                },
                'location_map': {
                    'meeting_id': 'path',
                    'comment_id': 'path',
                    'operation': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json-patch+json',
                    'application/json',
                    'text/json',
                    'application/*+json'
                ]
            },
            api_client=api_client
        )

    def create_comment(
        self,
        meeting_id,
        **kwargs
    ):
        """Create a comment to a Meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_comment(meeting_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):

        Keyword Args:
            create_comment_dto (CreateCommentDto): [optional]
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
            NewItemDto
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
        kwargs['meeting_id'] = \
            meeting_id
        return self.create_comment_endpoint.call_with_http_info(**kwargs)

    def create_comment_attachment(
        self,
        meeting_id,
        comment_id,
        file,
        **kwargs
    ):
        """Create a comment attachment to a Meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_comment_attachment(meeting_id, comment_id, file, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):
            comment_id (str):
            file (file_type):

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
            NewItemDto
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
        kwargs['meeting_id'] = \
            meeting_id
        kwargs['comment_id'] = \
            comment_id
        kwargs['file'] = \
            file
        return self.create_comment_attachment_endpoint.call_with_http_info(**kwargs)

    def delete_comment(
        self,
        meeting_id,
        comment_id,
        **kwargs
    ):
        """Delete a Comment from a Meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_comment(meeting_id, comment_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):
            comment_id (str):

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
            None
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
        kwargs['meeting_id'] = \
            meeting_id
        kwargs['comment_id'] = \
            comment_id
        return self.delete_comment_endpoint.call_with_http_info(**kwargs)

    def download_comment_attachment_for_comment(
        self,
        meeting_id,
        comment_id,
        attachment_id,
        **kwargs
    ):
        """Download single attachment detail of a comment belonging to a meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.download_comment_attachment_for_comment(meeting_id, comment_id, attachment_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):
            comment_id (str):
            attachment_id (str):

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
            None
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
        kwargs['meeting_id'] = \
            meeting_id
        kwargs['comment_id'] = \
            comment_id
        kwargs['attachment_id'] = \
            attachment_id
        return self.download_comment_attachment_for_comment_endpoint.call_with_http_info(**kwargs)

    def get_comment(
        self,
        meeting_id,
        comment_id,
        **kwargs
    ):
        """Get details of a comment belonging to a meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_comment(meeting_id, comment_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):
            comment_id (str):

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
            CommentDto
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
        kwargs['meeting_id'] = \
            meeting_id
        kwargs['comment_id'] = \
            comment_id
        return self.get_comment_endpoint.call_with_http_info(**kwargs)

    def get_comment_attachments(
        self,
        meeting_id,
        comment_id,
        **kwargs
    ):
        """Get attachments summary of a comment belonging to a meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_comment_attachments(meeting_id, comment_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):
            comment_id (str):

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
            [AttachmentSummaryDto]
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
        kwargs['meeting_id'] = \
            meeting_id
        kwargs['comment_id'] = \
            comment_id
        return self.get_comment_attachments_endpoint.call_with_http_info(**kwargs)

    def get_comments(
        self,
        meeting_id,
        **kwargs
    ):
        """Get all comments for a meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_comments(meeting_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):

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
            [CommentSummaryDto]
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
        kwargs['meeting_id'] = \
            meeting_id
        return self.get_comments_endpoint.call_with_http_info(**kwargs)

    def patch_comment(
        self,
        meeting_id,
        comment_id,
        **kwargs
    ):
        """Edit a comment for a meeting  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.patch_comment(meeting_id, comment_id, async_req=True)
        >>> result = thread.get()

        Args:
            meeting_id (str):
            comment_id (str):

        Keyword Args:
            operation ([Operation]): [optional]
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
            None
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
        kwargs['meeting_id'] = \
            meeting_id
        kwargs['comment_id'] = \
            comment_id
        return self.patch_comment_endpoint.call_with_http_info(**kwargs)

