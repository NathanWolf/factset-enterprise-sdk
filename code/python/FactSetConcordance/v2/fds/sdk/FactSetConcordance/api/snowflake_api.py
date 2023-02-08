"""
    FactSet Concordance API

    The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p>   # noqa: E501

    The version of the OpenAPI document: 2.5.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

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
from fds.sdk.FactSetConcordance.exceptions import ApiException
from fds.sdk.FactSetConcordance.model.snowflake_entity_match_request import SnowflakeEntityMatchRequest
from fds.sdk.FactSetConcordance.model.snowflake_entity_match_response import SnowflakeEntityMatchResponse





class SnowflakeApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.get_snowflake_entity_match_for_list_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (SnowflakeEntityMatchResponse,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/factset-concordance/v2/snowflake-entity-match',
                'operation_id': 'get_snowflake_entity_match_for_list',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'snowflake_entity_match_request',
                ],
                'required': [
                    'snowflake_entity_match_request',
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
                    'snowflake_entity_match_request':
                        (SnowflakeEntityMatchRequest,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'snowflake_entity_match_request': 'body',
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


    def get_snowflake_entity_match_for_list(
        self,
        snowflake_entity_match_request,
        **kwargs
    ) -> SnowflakeEntityMatchResponse:
        """Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.  # noqa: E501

        Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.*   # noqa: E501
        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            snowflake_entity_match_request (SnowflakeEntityMatchRequest): A request to match an entity name and its attributes within Snowflake.

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
            SnowflakeEntityMatchResponse
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['snowflake_entity_match_request'] = \
            snowflake_entity_match_request
        return self.get_snowflake_entity_match_for_list_endpoint.call_with_http_info(**kwargs)

    def get_snowflake_entity_match_for_list_with_http_info(
        self,
        snowflake_entity_match_request,
        **kwargs
    ) -> typing.Tuple[SnowflakeEntityMatchResponse, int, typing.MutableMapping]:
        """Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.  # noqa: E501

        Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.*   # noqa: E501
        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            snowflake_entity_match_request (SnowflakeEntityMatchRequest): A request to match an entity name and its attributes within Snowflake.

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
            SnowflakeEntityMatchResponse
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['snowflake_entity_match_request'] = \
            snowflake_entity_match_request
        return self.get_snowflake_entity_match_for_list_endpoint.call_with_http_info(**kwargs)

    def get_snowflake_entity_match_for_list_async(
        self,
        snowflake_entity_match_request,
        **kwargs
    ) -> "ApplyResult[SnowflakeEntityMatchResponse]":
        """Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.  # noqa: E501

        Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.*   # noqa: E501
        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            snowflake_entity_match_request (SnowflakeEntityMatchRequest): A request to match an entity name and its attributes within Snowflake.

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
            ApplyResult[SnowflakeEntityMatchResponse]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['snowflake_entity_match_request'] = \
            snowflake_entity_match_request
        return self.get_snowflake_entity_match_for_list_endpoint.call_with_http_info(**kwargs)

    def get_snowflake_entity_match_for_list_with_http_info_async(
        self,
        snowflake_entity_match_request,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[SnowflakeEntityMatchResponse, int, typing.MutableMapping]]":
        """Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.  # noqa: E501

        Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.*   # noqa: E501
        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            snowflake_entity_match_request (SnowflakeEntityMatchRequest): A request to match an entity name and its attributes within Snowflake.

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
            ApplyResult[(SnowflakeEntityMatchResponse, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['snowflake_entity_match_request'] = \
            snowflake_entity_match_request
        return self.get_snowflake_entity_match_for_list_endpoint.call_with_http_info(**kwargs)


