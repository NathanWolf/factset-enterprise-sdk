"""
    IRN API v1

    Allows users to extract, create, update and configure IRN data.  # noqa: E501

    The version of the OpenAPI document: 1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.IRNNotes.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.IRNNotes.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.IRNNotes.model.create_note_dto import CreateNoteDto
from fds.sdk.IRNNotes.model.new_item_dto import NewItemDto
from fds.sdk.IRNNotes.model.note_dto import NoteDto
from fds.sdk.IRNNotes.model.note_summary_dto import NoteSummaryDto
from fds.sdk.IRNNotes.model.problem_details import ProblemDetails
from fds.sdk.IRNNotes.model.update_note_dto import UpdateNoteDto


class NotesApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.create_note_endpoint = _Endpoint(
            settings={
                'response_type': (NewItemDto,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes',
                'operation_id': 'create_note',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'x_irn_contributor_username',
                    'x_irn_contributor_serial',
                    'create_note_dto',
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
                    'x_irn_contributor_username':
                        (str,),
                    'x_irn_contributor_serial':
                        (str,),
                    'create_note_dto':
                        (CreateNoteDto,),
                },
                'attribute_map': {
                    'x_irn_contributor_username': 'X-IRN-Contributor-Username',
                    'x_irn_contributor_serial': 'X-IRN-Contributor-Serial',
                },
                'location_map': {
                    'x_irn_contributor_username': 'header',
                    'x_irn_contributor_serial': 'header',
                    'create_note_dto': 'body',
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
        self.delete_note_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes/{noteId}',
                'operation_id': 'delete_note',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'note_id',
                ],
                'required': [
                    'note_id',
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
                    'note_id':
                        (str,),
                },
                'attribute_map': {
                    'note_id': 'noteId',
                },
                'location_map': {
                    'note_id': 'path',
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
        self.get_note_endpoint = _Endpoint(
            settings={
                'response_type': (NoteDto,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes/{noteId}',
                'operation_id': 'get_note',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'note_id',
                ],
                'required': [
                    'note_id',
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
                    'note_id':
                        (str,),
                },
                'attribute_map': {
                    'note_id': 'noteId',
                },
                'location_map': {
                    'note_id': 'path',
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
        self.get_notes_endpoint = _Endpoint(
            settings={
                'response_type': ([NoteSummaryDto],),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes',
                'operation_id': 'get_notes',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'start',
                    'end',
                    'identifiers',
                    'authors',
                    'subjects',
                    'recommendations',
                    'sentiments',
                    'limit',
                    'offset',
                    'modified_since',
                    'filter_on_related_symbols',
                    'x_irn_include_deleted',
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
                    'start':
                        (str,),
                    'end':
                        (str,),
                    'identifiers':
                        ([str],),
                    'authors':
                        ([str],),
                    'subjects':
                        ([str],),
                    'recommendations':
                        ([str],),
                    'sentiments':
                        ([str],),
                    'limit':
                        (int,),
                    'offset':
                        (int,),
                    'modified_since':
                        (str,),
                    'filter_on_related_symbols':
                        (bool,),
                    'x_irn_include_deleted':
                        (bool,),
                },
                'attribute_map': {
                    'start': 'start',
                    'end': 'end',
                    'identifiers': 'identifiers',
                    'authors': 'authors',
                    'subjects': 'subjects',
                    'recommendations': 'recommendations',
                    'sentiments': 'sentiments',
                    'limit': 'limit',
                    'offset': 'offset',
                    'modified_since': 'modifiedSince',
                    'filter_on_related_symbols': 'filterOnRelatedSymbols',
                    'x_irn_include_deleted': 'X-IRN-Include-Deleted',
                },
                'location_map': {
                    'start': 'query',
                    'end': 'query',
                    'identifiers': 'query',
                    'authors': 'query',
                    'subjects': 'query',
                    'recommendations': 'query',
                    'sentiments': 'query',
                    'limit': 'query',
                    'offset': 'query',
                    'modified_since': 'query',
                    'filter_on_related_symbols': 'query',
                    'x_irn_include_deleted': 'header',
                },
                'collection_format_map': {
                    'identifiers': 'multi',
                    'authors': 'multi',
                    'subjects': 'multi',
                    'recommendations': 'multi',
                    'sentiments': 'multi',
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
        self.update_note_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes/{noteId}',
                'operation_id': 'update_note',
                'http_method': 'PUT',
                'servers': None,
            },
            params_map={
                'all': [
                    'note_id',
                    'update_note_dto',
                ],
                'required': [
                    'note_id',
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
                    'note_id':
                        (str,),
                    'update_note_dto':
                        (UpdateNoteDto,),
                },
                'attribute_map': {
                    'note_id': 'noteId',
                },
                'location_map': {
                    'note_id': 'path',
                    'update_note_dto': 'body',
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

    def create_note(
        self,
        **kwargs
    ):
        """Create a note  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.create_note(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            x_irn_contributor_username (str): [optional]
            x_irn_contributor_serial (str): [optional]
            create_note_dto (CreateNoteDto): [optional]
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
        return self.create_note_endpoint.call_with_http_info(**kwargs)

    def delete_note(
        self,
        note_id,
        **kwargs
    ):
        """Delete a Note  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_note(note_id, async_req=True)
        >>> result = thread.get()

        Args:
            note_id (str):

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
        kwargs['note_id'] = \
            note_id
        return self.delete_note_endpoint.call_with_http_info(**kwargs)

    def get_note(
        self,
        note_id,
        **kwargs
    ):
        """Get details of a note  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_note(note_id, async_req=True)
        >>> result = thread.get()

        Args:
            note_id (str): Note Id

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
            NoteDto
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
        kwargs['note_id'] = \
            note_id
        return self.get_note_endpoint.call_with_http_info(**kwargs)

    def get_notes(
        self,
        **kwargs
    ):
        """Get all the notes in the specified date range filtered on the given identifiers  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_notes(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            start (str): StartDate. [optional]
            end (str): EndDate. [optional]
            identifiers ([str]): Set of identifiers to filter on. [optional]
            authors ([str]): Set of authors to filter on. [optional]
            subjects ([str]): Set of subjects to filter on. [optional]
            recommendations ([str]): Set of recommendations to filter on. [optional]
            sentiments ([str]): Set of sentiments to filter on. [optional]
            limit (int): Limit on the number of notes retrieved. [optional]
            offset (int): Fetch notes after the offset. [optional]
            modified_since (str): Only return notes which have been modified or created since a particular time. [optional]
            filter_on_related_symbols (bool): Include notes whose related symbols match the identifier filter. [optional] if omitted the server will use the default value of False
            x_irn_include_deleted (bool): [optional] if omitted the server will use the default value of False
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
            [NoteSummaryDto]
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
        return self.get_notes_endpoint.call_with_http_info(**kwargs)

    def update_note(
        self,
        note_id,
        **kwargs
    ):
        """Update a note  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_note(note_id, async_req=True)
        >>> result = thread.get()

        Args:
            note_id (str): Note Id

        Keyword Args:
            update_note_dto (UpdateNoteDto): Note details to update. [optional]
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
        kwargs['note_id'] = \
            note_id
        return self.update_note_endpoint.call_with_http_info(**kwargs)

