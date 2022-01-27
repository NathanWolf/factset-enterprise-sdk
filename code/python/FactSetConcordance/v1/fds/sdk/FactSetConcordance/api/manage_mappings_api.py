"""
    FactSet Concordance API

    The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p>   # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetConcordance.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetConcordance.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetConcordance.model.entity_mapping_request import EntityMappingRequest
from fds.sdk.FactSetConcordance.model.entity_response import EntityResponse
from fds.sdk.FactSetConcordance.model.entity_universe_response import EntityUniverseResponse
from fds.sdk.FactSetConcordance.model.error_response import ErrorResponse


class ManageMappingsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_entity_universe_endpoint = _Endpoint(
            settings={
                'response_type': (EntityUniverseResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-concordance/v1/entity-universe',
                'operation_id': 'get_entity_universe',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'client_id',
                    'map_status',
                    'offset',
                    'limit',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                    'map_status',
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                    ('map_status',): {

                        "MAPPED": "MAPPED",
                        "UNMAPPED": "UNMAPPED",
                        "INDETERMINATE": "INDETERMINATE"
                    },
                },
                'openapi_types': {
                    'client_id':
                        ([str],),
                    'map_status':
                        ([str],),
                    'offset':
                        (int,),
                    'limit':
                        (int,),
                },
                'attribute_map': {
                    'client_id': 'clientId',
                    'map_status': 'mapStatus',
                    'offset': 'offset',
                    'limit': 'limit',
                },
                'location_map': {
                    'client_id': 'query',
                    'map_status': 'query',
                    'offset': 'query',
                    'limit': 'query',
                },
                'collection_format_map': {
                    'client_id': 'csv',
                    'map_status': 'multi',
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
        self.save_entity_mapping_endpoint = _Endpoint(
            settings={
                'response_type': (EntityResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-concordance/v1/entity-mapping',
                'operation_id': 'save_entity_mapping',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'entity_mapping_request',
                ],
                'required': [
                    'entity_mapping_request',
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
                    'entity_mapping_request':
                        (EntityMappingRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'entity_mapping_request': 'body',
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

    def get_entity_universe(
        self,
        **kwargs
    ):
        """View Universe for the requesting user.  # noqa: E501

        Retrieves all entity mappings' history made by the current user, or for a list of clientIds.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_entity_universe(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            client_id ([str]): Filter by the clientId(s) created by the user in a previous mapping. . [optional]
            map_status ([str]): Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. . [optional]
            offset (int): Starting row for records to return or rows to skip.. [optional] if omitted the server will use the default value of 0
            limit (int): Limits the number of records in the response.. [optional]
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
            EntityUniverseResponse
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
        return self.get_entity_universe_endpoint.call_with_http_info(**kwargs)

    def save_entity_mapping(
        self,
        entity_mapping_request,
        **kwargs
    ):
        """Saves a single-mapping specified by the client.  # noqa: E501

        Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.save_entity_mapping(entity_mapping_request, async_req=True)
        >>> result = thread.get()

        Args:
            entity_mapping_request (EntityMappingRequest): A request to create a single mapping.

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
            EntityResponse
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
        kwargs['entity_mapping_request'] = \
            entity_mapping_request
        return self.save_entity_mapping_endpoint.call_with_http_info(**kwargs)

