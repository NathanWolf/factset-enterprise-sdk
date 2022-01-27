"""
    IRN API v1

    Allows users to create, update and configure IRN data.  # noqa: E501

    The version of the OpenAPI document: 1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.IRNContacts.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.IRNContacts.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.IRNContacts.model.contact_custom_field_dto import ContactCustomFieldDto
from fds.sdk.IRNContacts.model.contact_custom_field_list_dto import ContactCustomFieldListDto
from fds.sdk.IRNContacts.model.contact_custom_field_save_dto import ContactCustomFieldSaveDto
from fds.sdk.IRNContacts.model.operation import Operation
from fds.sdk.IRNContacts.model.problem_details import ProblemDetails


class ContactCustomFieldsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.v1_contact_custom_fields_contact_custom_field_id_delete_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/contact-custom-fields/{contactCustomFieldId}',
                'operation_id': 'v1_contact_custom_fields_contact_custom_field_id_delete',
                'http_method': 'DELETE',
                'servers': None,
            },
            params_map={
                'all': [
                    'contact_custom_field_id',
                ],
                'required': [
                    'contact_custom_field_id',
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
                    'contact_custom_field_id':
                        (str,),
                },
                'attribute_map': {
                    'contact_custom_field_id': 'contactCustomFieldId',
                },
                'location_map': {
                    'contact_custom_field_id': 'path',
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
        self.v1_contact_custom_fields_contact_custom_field_id_get_endpoint = _Endpoint(
            settings={
                'response_type': (ContactCustomFieldDto,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/contact-custom-fields/{contactCustomFieldId}',
                'operation_id': 'v1_contact_custom_fields_contact_custom_field_id_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'contact_custom_field_id',
                ],
                'required': [
                    'contact_custom_field_id',
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
                    'contact_custom_field_id':
                        (str,),
                },
                'attribute_map': {
                    'contact_custom_field_id': 'contactCustomFieldId',
                },
                'location_map': {
                    'contact_custom_field_id': 'path',
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
        self.v1_contact_custom_fields_contact_custom_field_id_patch_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/contact-custom-fields/{contactCustomFieldId}',
                'operation_id': 'v1_contact_custom_fields_contact_custom_field_id_patch',
                'http_method': 'PATCH',
                'servers': None,
            },
            params_map={
                'all': [
                    'contact_custom_field_id',
                    'operation',
                ],
                'required': [
                    'contact_custom_field_id',
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
                    'contact_custom_field_id':
                        (str,),
                    'operation':
                        ([Operation],),
                },
                'attribute_map': {
                    'contact_custom_field_id': 'contactCustomFieldId',
                },
                'location_map': {
                    'contact_custom_field_id': 'path',
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
        self.v1_contact_custom_fields_get_endpoint = _Endpoint(
            settings={
                'response_type': ([ContactCustomFieldDto],),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/contact-custom-fields',
                'operation_id': 'v1_contact_custom_fields_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
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
                },
                'attribute_map': {
                },
                'location_map': {
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
        self.v1_contact_custom_fields_post_endpoint = _Endpoint(
            settings={
                'response_type': (str,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/contact-custom-fields',
                'operation_id': 'v1_contact_custom_fields_post',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'contact_custom_field_save_dto',
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
                    'contact_custom_field_save_dto':
                        (ContactCustomFieldSaveDto,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'contact_custom_field_save_dto': 'body',
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
        self.v1_contact_custom_fields_reorder_post_endpoint = _Endpoint(
            settings={
                'response_type': None,
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/v1/contact-custom-fields/reorder',
                'operation_id': 'v1_contact_custom_fields_reorder_post',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'contact_custom_field_list_dto',
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
                    'contact_custom_field_list_dto':
                        (ContactCustomFieldListDto,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'contact_custom_field_list_dto': 'body',
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

    def v1_contact_custom_fields_contact_custom_field_id_delete(
        self,
        contact_custom_field_id,
        **kwargs
    ):
        """Delete a contact custom field  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.v1_contact_custom_fields_contact_custom_field_id_delete(contact_custom_field_id, async_req=True)
        >>> result = thread.get()

        Args:
            contact_custom_field_id (str): contactCustomFieldId to delete associated record

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
        kwargs['contact_custom_field_id'] = \
            contact_custom_field_id
        return self.v1_contact_custom_fields_contact_custom_field_id_delete_endpoint.call_with_http_info(**kwargs)

    def v1_contact_custom_fields_contact_custom_field_id_get(
        self,
        contact_custom_field_id,
        **kwargs
    ):
        """Get a specific Contact custom field's details  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.v1_contact_custom_fields_contact_custom_field_id_get(contact_custom_field_id, async_req=True)
        >>> result = thread.get()

        Args:
            contact_custom_field_id (str): contactCustomFieldId to get associated record

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
            ContactCustomFieldDto
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
        kwargs['contact_custom_field_id'] = \
            contact_custom_field_id
        return self.v1_contact_custom_fields_contact_custom_field_id_get_endpoint.call_with_http_info(**kwargs)

    def v1_contact_custom_fields_contact_custom_field_id_patch(
        self,
        contact_custom_field_id,
        **kwargs
    ):
        """Edit a contact custom field  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.v1_contact_custom_fields_contact_custom_field_id_patch(contact_custom_field_id, async_req=True)
        >>> result = thread.get()

        Args:
            contact_custom_field_id (str): contactCustomFieldId to update associated record

        Keyword Args:
            operation ([Operation]): contactCustomFieldUpdateDto object to update. [optional]
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
        kwargs['contact_custom_field_id'] = \
            contact_custom_field_id
        return self.v1_contact_custom_fields_contact_custom_field_id_patch_endpoint.call_with_http_info(**kwargs)

    def v1_contact_custom_fields_get(
        self,
        **kwargs
    ):
        """Get all the contact custom fields  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.v1_contact_custom_fields_get(async_req=True)
        >>> result = thread.get()


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
            [ContactCustomFieldDto]
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
        return self.v1_contact_custom_fields_get_endpoint.call_with_http_info(**kwargs)

    def v1_contact_custom_fields_post(
        self,
        **kwargs
    ):
        """Create a contact custom field  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.v1_contact_custom_fields_post(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            contact_custom_field_save_dto (ContactCustomFieldSaveDto): ContactCustomFieldSaveDto object to save. [optional]
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
            str
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
        return self.v1_contact_custom_fields_post_endpoint.call_with_http_info(**kwargs)

    def v1_contact_custom_fields_reorder_post(
        self,
        **kwargs
    ):
        """Reorder contact custom fields  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.v1_contact_custom_fields_reorder_post(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            contact_custom_field_list_dto (ContactCustomFieldListDto): List of Guid. [optional]
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
        return self.v1_contact_custom_fields_reorder_post_endpoint.call_with_http_info(**kwargs)

