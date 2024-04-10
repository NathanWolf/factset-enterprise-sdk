"""
    IRN API v1

    Allows users to extract, create, update and configure IRN data.  # noqa: E501

    The version of the OpenAPI document: 1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

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
from fds.sdk.IRNNotes.exceptions import ApiException
from fds.sdk.IRNNotes.model.event_snippet_dto import EventSnippetDto
from fds.sdk.IRNNotes.model.note_event_dto import NoteEventDto
from fds.sdk.IRNNotes.model.problem_details import ProblemDetails
from fds.sdk.IRNNotes.model.record_event_summary_dto import RecordEventSummaryDto





class EventsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_all_events_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: ([EventSnippetDto],),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/events',
                'operation_id': 'get_all_events',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'start_date',
                    'end_date',
                    'types',
                ],
                'required': [
                    'start_date',
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
                    'start_date':
                        (str,),
                    'end_date':
                        (str,),
                    'types':
                        ([str],),
                },
                'attribute_map': {
                    'start_date': 'startDate',
                    'end_date': 'endDate',
                    'types': 'types',
                },
                'location_map': {
                    'start_date': 'query',
                    'end_date': 'query',
                    'types': 'query',
                },
                'collection_format_map': {
                    'types': 'multi',
                }
            },
            headers_map={
                'accept': [
                    'text/plain',
                    'application/json',
                    'text/json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

        self.get_events_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: ([RecordEventSummaryDto],), 404: (ProblemDetails,), 0: (ProblemDetails,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes/{noteId}/events',
                'operation_id': 'get_events',
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

        self.get_record_event_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (NoteEventDto,), 403: (ProblemDetails,), 404: (ProblemDetails,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/notes/{noteId}/events/{recordEventId}',
                'operation_id': 'get_record_event',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'note_id',
                    'record_event_id',
                ],
                'required': [
                    'note_id',
                    'record_event_id',
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
                    'record_event_id':
                        (str,),
                },
                'attribute_map': {
                    'note_id': 'noteId',
                    'record_event_id': 'recordEventId',
                },
                'location_map': {
                    'note_id': 'path',
                    'record_event_id': 'path',
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


    def get_all_events(
        self,
        start_date,
        **kwargs
    ) -> typing.List[EventSnippetDto]:
        """Get all the record events in the specified date range filtered on the given types  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            start_date (str): StartDate

        Keyword Args:
            end_date (str): EndDate. [optional]
            types ([str]): Set of event types to filter on. [optional]
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
            typing.List[EventSnippetDto]
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['start_date'] = \
            start_date
        return self.get_all_events_endpoint.call_with_http_info(**kwargs)

    def get_all_events_with_http_info(
        self,
        start_date,
        **kwargs
    ) -> typing.Tuple[typing.List[EventSnippetDto], int, typing.MutableMapping]:
        """Get all the record events in the specified date range filtered on the given types  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            start_date (str): StartDate

        Keyword Args:
            end_date (str): EndDate. [optional]
            types ([str]): Set of event types to filter on. [optional]
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
            typing.List[EventSnippetDto]
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['start_date'] = \
            start_date
        return self.get_all_events_endpoint.call_with_http_info(**kwargs)

    def get_all_events_async(
        self,
        start_date,
        **kwargs
    ) -> "ApplyResult[typing.List[EventSnippetDto]]":
        """Get all the record events in the specified date range filtered on the given types  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            start_date (str): StartDate

        Keyword Args:
            end_date (str): EndDate. [optional]
            types ([str]): Set of event types to filter on. [optional]
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
            ApplyResult[typing.List[EventSnippetDto]]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['start_date'] = \
            start_date
        return self.get_all_events_endpoint.call_with_http_info(**kwargs)

    def get_all_events_with_http_info_async(
        self,
        start_date,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[typing.List[EventSnippetDto], int, typing.MutableMapping]]":
        """Get all the record events in the specified date range filtered on the given types  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            start_date (str): StartDate

        Keyword Args:
            end_date (str): EndDate. [optional]
            types ([str]): Set of event types to filter on. [optional]
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
            ApplyResult[(typing.List[EventSnippetDto], int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['start_date'] = \
            start_date
        return self.get_all_events_endpoint.call_with_http_info(**kwargs)


    def get_events(
        self,
        note_id,
        **kwargs
    ) -> typing.List[RecordEventSummaryDto]:
        """Get all the record events that belong to a note  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            note_id (str): Note Id

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
            typing.List[RecordEventSummaryDto]
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['note_id'] = \
            note_id
        return self.get_events_endpoint.call_with_http_info(**kwargs)

    def get_events_with_http_info(
        self,
        note_id,
        **kwargs
    ) -> typing.Tuple[typing.List[RecordEventSummaryDto], int, typing.MutableMapping]:
        """Get all the record events that belong to a note  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            note_id (str): Note Id

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
            typing.List[RecordEventSummaryDto]
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['note_id'] = \
            note_id
        return self.get_events_endpoint.call_with_http_info(**kwargs)

    def get_events_async(
        self,
        note_id,
        **kwargs
    ) -> "ApplyResult[typing.List[RecordEventSummaryDto]]":
        """Get all the record events that belong to a note  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            note_id (str): Note Id

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
            ApplyResult[typing.List[RecordEventSummaryDto]]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['note_id'] = \
            note_id
        return self.get_events_endpoint.call_with_http_info(**kwargs)

    def get_events_with_http_info_async(
        self,
        note_id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[typing.List[RecordEventSummaryDto], int, typing.MutableMapping]]":
        """Get all the record events that belong to a note  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            note_id (str): Note Id

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
            ApplyResult[(typing.List[RecordEventSummaryDto], int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['note_id'] = \
            note_id
        return self.get_events_endpoint.call_with_http_info(**kwargs)


    def get_record_event(
        self,
        note_id,
        record_event_id,
        **kwargs
    ) -> NoteEventDto:
        """Get details of a record event of a note  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            note_id (str): Note Id
            record_event_id (str): Record Event Id

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
            NoteEventDto
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['note_id'] = \
            note_id
        kwargs['record_event_id'] = \
            record_event_id
        return self.get_record_event_endpoint.call_with_http_info(**kwargs)

    def get_record_event_with_http_info(
        self,
        note_id,
        record_event_id,
        **kwargs
    ) -> typing.Tuple[NoteEventDto, int, typing.MutableMapping]:
        """Get details of a record event of a note  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            note_id (str): Note Id
            record_event_id (str): Record Event Id

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
            NoteEventDto
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['note_id'] = \
            note_id
        kwargs['record_event_id'] = \
            record_event_id
        return self.get_record_event_endpoint.call_with_http_info(**kwargs)

    def get_record_event_async(
        self,
        note_id,
        record_event_id,
        **kwargs
    ) -> "ApplyResult[NoteEventDto]":
        """Get details of a record event of a note  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            note_id (str): Note Id
            record_event_id (str): Record Event Id

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
            ApplyResult[NoteEventDto]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['note_id'] = \
            note_id
        kwargs['record_event_id'] = \
            record_event_id
        return self.get_record_event_endpoint.call_with_http_info(**kwargs)

    def get_record_event_with_http_info_async(
        self,
        note_id,
        record_event_id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[NoteEventDto, int, typing.MutableMapping]]":
        """Get details of a record event of a note  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            note_id (str): Note Id
            record_event_id (str): Record Event Id

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
            ApplyResult[(NoteEventDto, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['note_id'] = \
            note_id
        kwargs['record_event_id'] = \
            record_event_id
        return self.get_record_event_endpoint.call_with_http_info(**kwargs)


