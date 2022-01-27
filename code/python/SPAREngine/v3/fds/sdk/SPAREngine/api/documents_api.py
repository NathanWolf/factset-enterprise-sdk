"""
    SPAR Engine API

    Allow clients to fetch Analytics through APIs.  # noqa: E501

    The version of the OpenAPI document: 3
    Contact: analytics.api.support@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.SPAREngine.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.SPAREngine.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.SPAREngine.model.client_error_response import ClientErrorResponse
from fds.sdk.SPAREngine.model.document_directories_root import DocumentDirectoriesRoot


class DocumentsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_spar3_documents_endpoint = _Endpoint(
            settings={
                'response_type': (DocumentDirectoriesRoot,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/analytics/engines/spar/v3/documents/{path}',
                'operation_id': 'get_spar3_documents',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'path',
                ],
                'required': [
                    'path',
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
                    'path':
                        (str,),
                },
                'attribute_map': {
                    'path': 'path',
                },
                'location_map': {
                    'path': 'path',
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

    def get_spar3_documents(
        self,
        path="Client:folder1/folder2",
        **kwargs
    ):
        """Gets SPAR3 documents and sub-directories in a directory  # noqa: E501

        This endpoint looks up all SPAR3 documents and sub-directories in a given directory.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_spar3_documents(path="Client:folder1/folder2", async_req=True)
        >>> result = thread.get()

        Args:
            path (str): The directory to get the documents in. defaults to "Client:folder1/folder2", must be one of ["Client:folder1/folder2"]

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
            DocumentDirectoriesRoot
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
        kwargs['path'] = \
            path
        return self.get_spar3_documents_endpoint.call_with_http_info(**kwargs)

