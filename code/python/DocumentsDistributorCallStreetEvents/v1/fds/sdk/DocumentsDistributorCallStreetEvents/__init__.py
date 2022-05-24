# flake8: noqa

"""
    Documents Distributor - CallStreet Events

    CallStreet Events contains all the Documents Distributor APIs that provide events data such as Events Audio and Near Real-Time Transcripts  The  Events Audio API provides access to all audio recordings to various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.  # noqa: E501

    The version of the OpenAPI document: 3.0.0
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.20.0"

# import ApiClient
from fds.sdk.DocumentsDistributorCallStreetEvents.api_client import ApiClient

# import Configuration
from fds.sdk.DocumentsDistributorCallStreetEvents.configuration import Configuration

# import exceptions
from fds.sdk.DocumentsDistributorCallStreetEvents.exceptions import OpenApiException
from fds.sdk.DocumentsDistributorCallStreetEvents.exceptions import ApiAttributeError
from fds.sdk.DocumentsDistributorCallStreetEvents.exceptions import ApiTypeError
from fds.sdk.DocumentsDistributorCallStreetEvents.exceptions import ApiValueError
from fds.sdk.DocumentsDistributorCallStreetEvents.exceptions import ApiKeyError
from fds.sdk.DocumentsDistributorCallStreetEvents.exceptions import ApiException
