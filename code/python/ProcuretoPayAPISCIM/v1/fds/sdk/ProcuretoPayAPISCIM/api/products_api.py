"""
    FactSet SCIM API

    FactSet's SCIM API implementation.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.ProcuretoPayAPISCIM.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.ProcuretoPayAPISCIM.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.ProcuretoPayAPISCIM.exceptions import ApiException
from fds.sdk.ProcuretoPayAPISCIM.model.error import Error
from fds.sdk.ProcuretoPayAPISCIM.model.product_resource import ProductResource
from fds.sdk.ProcuretoPayAPISCIM.model.product_resource_list import ProductResourceList





class ProductsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        self.products_get_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (ProductResourceList,), 400: (Error,), 401: (Error,), 403: (Error,), 500: (Error,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/Products',
                'operation_id': 'products_get',
                'http_method': 'GET',
                'servers': None,
            },
            params_map={
                'all': [
                    'filter',
                    'start_index',
                    'count',
                    'attributes',
                    'excluded_attributes',
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
                    'filter':
                        (str,),
                    'start_index':
                        (int,),
                    'count':
                        (int,),
                    'attributes':
                        (str,),
                    'excluded_attributes':
                        (str,),
                },
                'attribute_map': {
                    'filter': 'filter',
                    'start_index': 'startIndex',
                    'count': 'count',
                    'attributes': 'attributes',
                    'excluded_attributes': 'excludedAttributes',
                },
                'location_map': {
                    'filter': 'query',
                    'start_index': 'query',
                    'count': 'query',
                    'attributes': 'query',
                    'excluded_attributes': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/scim+json'
                ],
                'content_type': [],
            },
            api_client=api_client
        )

        self.products_id_get_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (ProductResource,), 401: (Error,), 403: (Error,), 404: (Error,), 500: (Error,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/Products/{id}',
                'operation_id': 'products_id_get',
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
                    'application/scim+json'
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


    def products_get(
        self,
        **kwargs
    ) -> ProductResourceList:
        """Get a list of products.  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only


        Keyword Args:
            filter (str): Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings.. [optional]
            start_index (int): Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.. [optional]
            count (int): Maximum resource count. The server will not return more resources than this value, although it may return fewer.. [optional]
            attributes (str): Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.. [optional]
            excluded_attributes (str): Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.. [optional]
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
            ProductResourceList
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        return self.products_get_endpoint.call_with_http_info(**kwargs)

    def products_get_with_http_info(
        self,
        **kwargs
    ) -> typing.Tuple[ProductResourceList, int, typing.MutableMapping]:
        """Get a list of products.  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers


        Keyword Args:
            filter (str): Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings.. [optional]
            start_index (int): Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.. [optional]
            count (int): Maximum resource count. The server will not return more resources than this value, although it may return fewer.. [optional]
            attributes (str): Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.. [optional]
            excluded_attributes (str): Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.. [optional]
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
            ProductResourceList
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        return self.products_get_endpoint.call_with_http_info(**kwargs)

    def products_get_async(
        self,
        **kwargs
    ) -> "ApplyResult[ProductResourceList]":
        """Get a list of products.  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult


        Keyword Args:
            filter (str): Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings.. [optional]
            start_index (int): Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.. [optional]
            count (int): Maximum resource count. The server will not return more resources than this value, although it may return fewer.. [optional]
            attributes (str): Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.. [optional]
            excluded_attributes (str): Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.. [optional]
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
            ApplyResult[ProductResourceList]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        return self.products_get_endpoint.call_with_http_info(**kwargs)

    def products_get_with_http_info_async(
        self,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[ProductResourceList, int, typing.MutableMapping]]":
        """Get a list of products.  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult


        Keyword Args:
            filter (str): Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings.. [optional]
            start_index (int): Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.. [optional]
            count (int): Maximum resource count. The server will not return more resources than this value, although it may return fewer.. [optional]
            attributes (str): Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.. [optional]
            excluded_attributes (str): Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.. [optional]
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
            ApplyResult[(ProductResourceList, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        return self.products_get_endpoint.call_with_http_info(**kwargs)


    def products_id_get(
        self,
        id,
        **kwargs
    ) -> ProductResource:
        """Get a product.  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only

        Args:
            id (str): ID of resource.

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
            ProductResource
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        kwargs['id'] = \
            id
        return self.products_id_get_endpoint.call_with_http_info(**kwargs)

    def products_id_get_with_http_info(
        self,
        id,
        **kwargs
    ) -> typing.Tuple[ProductResource, int, typing.MutableMapping]:
        """Get a product.  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers

        Args:
            id (str): ID of resource.

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
            ProductResource
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        kwargs['id'] = \
            id
        return self.products_id_get_endpoint.call_with_http_info(**kwargs)

    def products_id_get_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[ProductResource]":
        """Get a product.  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult

        Args:
            id (str): ID of resource.

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
            ApplyResult[ProductResource]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        kwargs['id'] = \
            id
        return self.products_id_get_endpoint.call_with_http_info(**kwargs)

    def products_id_get_with_http_info_async(
        self,
        id,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[ProductResource, int, typing.MutableMapping]]":
        """Get a product.  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult

        Args:
            id (str): ID of resource.

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
            ApplyResult[(ProductResource, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        kwargs['id'] = \
            id
        return self.products_id_get_endpoint.call_with_http_info(**kwargs)


