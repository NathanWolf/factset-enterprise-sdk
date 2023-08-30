# flake8: noqa

"""
    Classifications API

    The Classifications API gives access to various Industry Classifications for a given list of securities. Beginning first with GICS Direct, the service will then expand to offering NAICS, SIC, RBICS, and more.    # noqa: E501

    The version of the OpenAPI document: 1.0.1
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.6"

# import ApiClient
from fds.sdk.Classifications.api_client import ApiClient

# import Configuration
from fds.sdk.Classifications.configuration import Configuration

# import exceptions
from fds.sdk.Classifications.exceptions import OpenApiException
from fds.sdk.Classifications.exceptions import ApiAttributeError
from fds.sdk.Classifications.exceptions import ApiTypeError
from fds.sdk.Classifications.exceptions import ApiValueError
from fds.sdk.Classifications.exceptions import ApiKeyError
from fds.sdk.Classifications.exceptions import ApiException
