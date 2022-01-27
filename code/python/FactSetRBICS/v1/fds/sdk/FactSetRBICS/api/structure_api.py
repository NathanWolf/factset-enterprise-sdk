"""
    FactSet RIBCS

    FactSet Revere Business Industry Classification System (RBICS) is a comprehensive structured taxonomy to classify companies by what they primarily do. It delivers a granular view for investors by classifying companies using a bottom-up approach according to the products and services they provide. By combining this approach with a top-level grouping based on companies' behavior similarities and stock co-movement, FactSet RBICS delivers unprecedented precision for 1,400+ sector groups.  RBICS Focus is a six level classification which highlights the companys main business. It is based on the company business line/s that stand for majority of a the revenue that the company generates. Updated monthly. For more details, visit [Online Assitant Page #20710](https://oa.apps.factset.com/pages/20710).   # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetRBICS.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.FactSetRBICS.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.FactSetRBICS.model.error_response import ErrorResponse
from fds.sdk.FactSetRBICS.model.structure_request import StructureRequest
from fds.sdk.FactSetRBICS.model.structure_response import StructureResponse


class StructureApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_rbics_structure_endpoint = _Endpoint(
            settings={
                'response_type': (StructureResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-rbics/v1/structure',
                'operation_id': 'get_rbics_structure',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'rbics_ids',
                    'level',
                    'include_names',
                    'date',
                ],
                'required': [],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'rbics_ids',
                    'level',
                ]
            },
            root_map={
                'validations': {
                    ('rbics_ids',): {

                        'max_items': 2500,
                    },
                    ('level',): {

                        'inclusive_maximum': 6,
                        'inclusive_minimum': 1,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'rbics_ids':
                        ([str],),
                    'level':
                        (int,),
                    'include_names':
                        (bool,),
                    'date':
                        (str,),
                },
                'attribute_map': {
                    'rbics_ids': 'rbicsIds',
                    'level': 'level',
                    'include_names': 'includeNames',
                    'date': 'date',
                },
                'location_map': {
                    'rbics_ids': 'query',
                    'level': 'query',
                    'include_names': 'query',
                    'date': 'query',
                },
                'collection_format_map': {
                    'rbics_ids': 'csv',
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
        self.get_rbics_structure_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (StructureResponse,),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-rbics/v1/structure',
                'operation_id': 'get_rbics_structure_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'structure_request',
                ],
                'required': [
                    'structure_request',
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
                    'structure_request':
                        (StructureRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'structure_request': 'body',
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

    def get_rbics_structure(
        self,
        **kwargs
    ):
        """Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.  # noqa: E501

        Understand the full RBICS Taxonomy Structure through time to help organize your analysis or facilitate the use of RBICS in application development.  Designed to overcome disparate and non-standardized company disclosures, the RBICS taxonomy is a normalized global industry classification consisting of a fourteen-by-six matrix. There are twelve economies with two specialty sectors, each with six incremental detailed layers, resulting in over 1,600 sector groups.  The top-levels' market-defined approach groups companies based on their behavioral similarities and stock price co-movement, while the patented product-based approach used in the lower levels enables the necessary precision to capture the specialty sectors of global markets.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_rbics_structure(async_req=True)
        >>> result = thread.get()


        Keyword Args:
            rbics_ids ([str]): RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested. . [optional]
            level (int): RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, '3' returns all levels 1,2 and 3. To request all levels, request level=6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629| . [optional]
            include_names (bool): Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names.. [optional] if omitted the server will use the default value of True
            date (str): Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.. [optional]
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
            StructureResponse
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
        return self.get_rbics_structure_endpoint.call_with_http_info(**kwargs)

    def get_rbics_structure_for_list(
        self,
        structure_request,
        **kwargs
    ):
        """Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.  # noqa: E501

        Get the full RBICS Taxonomy Structure Ids, Names, and effective periods. POST method is optimal for requesting large lists of `rbicsIds`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_rbics_structure_for_list(structure_request, async_req=True)
        >>> result = thread.get()

        Args:
            structure_request (StructureRequest): Request Body to request a list of RBICS Structure objects.

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
            StructureResponse
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
        kwargs['structure_request'] = \
            structure_request
        return self.get_rbics_structure_for_list_endpoint.call_with_http_info(**kwargs)

