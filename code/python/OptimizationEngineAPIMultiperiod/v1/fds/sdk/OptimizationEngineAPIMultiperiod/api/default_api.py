"""
    fpo_mp_input

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401
from multiprocessing.pool import ApplyResult
import typing

from fds.sdk.OptimizationEngineAPIMultiperiod.api_client import ApiClient, Endpoint as _Endpoint
from fds.sdk.OptimizationEngineAPIMultiperiod.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from fds.sdk.OptimizationEngineAPIMultiperiod.exceptions import ApiException
from fds.sdk.OptimizationEngineAPIMultiperiod.model.optimizer_inputs_multi_period_input import OptimizerInputsMultiPeriodInput
from fds.sdk.OptimizationEngineAPIMultiperiod.model.optimizer_outputs_multi_period_output import OptimizerOutputsMultiPeriodOutput





class DefaultApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.mpo_v1_optimize_fpo_post_endpoint = _Endpoint(
            settings={
                'response_type': (
                  { 200: (OptimizerOutputsMultiPeriodOutput,),  },
                  None
                ),
                'auth': [
                    'FactSetApiKey',
                    'FactSetOAuth2'
                ],
                'endpoint_path': '/mpo/v1/optimizeFPO',
                'operation_id': 'mpo_v1_optimize_fpo_post',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'multi_period_input',
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
                    'multi_period_input':
                        (OptimizerInputsMultiPeriodInput,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'multi_period_input': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/x-protobuf'
                ],
                'content_type': [
                    'application/x-protobuf'
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

    def mpo_v1_optimize_fpo_post(
        self,
        **kwargs
    ) -> OptimizerOutputsMultiPeriodOutput:
        """mpo_v1_optimize_fpo_post  # noqa: E501

        This method makes a synchronous HTTP request. Returns the http data only


        Keyword Args:
            multi_period_input (OptimizerInputsMultiPeriodInput): Multiperiod protobuf input. [optional]
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
            OptimizerOutputsMultiPeriodOutput
                Response Object
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=False)
        return self.mpo_v1_optimize_fpo_post_endpoint.call_with_http_info(**kwargs)

    def mpo_v1_optimize_fpo_post_with_http_info(
        self,
        **kwargs
    ) -> typing.Tuple[OptimizerOutputsMultiPeriodOutput, int, typing.MutableMapping]:
        """mpo_v1_optimize_fpo_post  # noqa: E501

        This method makes a synchronous HTTP request. Returns http data, http status and headers


        Keyword Args:
            multi_period_input (OptimizerInputsMultiPeriodInput): Multiperiod protobuf input. [optional]
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
            OptimizerOutputsMultiPeriodOutput
                Response Object
            int
                Http Status Code
            dict
                Dictionary of the response headers
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=False)
        return self.mpo_v1_optimize_fpo_post_endpoint.call_with_http_info(**kwargs)

    def mpo_v1_optimize_fpo_post_async(
        self,
        **kwargs
    ) -> "ApplyResult[OptimizerOutputsMultiPeriodOutput]":
        """mpo_v1_optimize_fpo_post  # noqa: E501

        This method makes a asynchronous HTTP request. Returns the http data, wrapped in ApplyResult


        Keyword Args:
            multi_period_input (OptimizerInputsMultiPeriodInput): Multiperiod protobuf input. [optional]
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
            ApplyResult[OptimizerOutputsMultiPeriodOutput]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=True, async_req=True)
        return self.mpo_v1_optimize_fpo_post_endpoint.call_with_http_info(**kwargs)

    def mpo_v1_optimize_fpo_post_with_http_info_async(
        self,
        **kwargs
    ) -> "ApplyResult[typing.Tuple[OptimizerOutputsMultiPeriodOutput, int, typing.MutableMapping]]":
        """mpo_v1_optimize_fpo_post  # noqa: E501

        This method makes a asynchronous HTTP request. Returns http data, http status and headers, wrapped in ApplyResult


        Keyword Args:
            multi_period_input (OptimizerInputsMultiPeriodInput): Multiperiod protobuf input. [optional]
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
            ApplyResult[(OptimizerOutputsMultiPeriodOutput, int, typing.Dict)]
        """
        self.apply_kwargs_defaults(kwargs=kwargs, return_http_data_only=False, async_req=True)
        return self.mpo_v1_optimize_fpo_post_endpoint.call_with_http_info(**kwargs)

