# flake8: noqa

"""
    Global Filings API

     The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The reference endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.20.0"

# import ApiClient
from fds.sdk.GlobalFilings.api_client import ApiClient

# import Configuration
from fds.sdk.GlobalFilings.configuration import Configuration

# import exceptions
from fds.sdk.GlobalFilings.exceptions import OpenApiException
from fds.sdk.GlobalFilings.exceptions import ApiAttributeError
from fds.sdk.GlobalFilings.exceptions import ApiTypeError
from fds.sdk.GlobalFilings.exceptions import ApiValueError
from fds.sdk.GlobalFilings.exceptions import ApiKeyError
from fds.sdk.GlobalFilings.exceptions import ApiException
