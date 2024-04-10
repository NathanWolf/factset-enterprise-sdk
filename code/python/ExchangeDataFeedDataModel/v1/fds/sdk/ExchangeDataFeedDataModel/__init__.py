# flake8: noqa

"""
    Exchange DataFeed Data Model API

    FactSet’s Exchange DataFeed products provide access to consolidated real-time and delayed global exchange data. Proprietary technology normalizes over 250 global venues, 18+ million instruments, and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. Innovative technology ensures reliability and provides scalability that allows clients to make requests based on a symbol list or an exchange. Reduce development time by powering proprietary and third-party applications with exchange data from a unified data model. <p>The Exchange DataFeed Data Model API provides mappings for enumerations used in our Real-Time DataFeed products and should be used in conjunction with the DataFeed Data Model documentation available for each product. <p>The initial beta version of this API is limited to include mapping tables for the product codes only.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.20.8"

# import ApiClient
from fds.sdk.ExchangeDataFeedDataModel.api_client import ApiClient

# import Configuration
from fds.sdk.ExchangeDataFeedDataModel.configuration import Configuration

# import exceptions
from fds.sdk.ExchangeDataFeedDataModel.exceptions import OpenApiException
from fds.sdk.ExchangeDataFeedDataModel.exceptions import ApiAttributeError
from fds.sdk.ExchangeDataFeedDataModel.exceptions import ApiTypeError
from fds.sdk.ExchangeDataFeedDataModel.exceptions import ApiValueError
from fds.sdk.ExchangeDataFeedDataModel.exceptions import ApiKeyError
from fds.sdk.ExchangeDataFeedDataModel.exceptions import ApiException
