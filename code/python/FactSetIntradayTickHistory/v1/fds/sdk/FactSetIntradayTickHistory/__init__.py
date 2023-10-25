# flake8: noqa

"""
    Tick History

     <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>     # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.21.8"

# import ApiClient
from fds.sdk.FactSetIntradayTickHistory.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetIntradayTickHistory.configuration import Configuration

# import exceptions
from fds.sdk.FactSetIntradayTickHistory.exceptions import OpenApiException
from fds.sdk.FactSetIntradayTickHistory.exceptions import ApiAttributeError
from fds.sdk.FactSetIntradayTickHistory.exceptions import ApiTypeError
from fds.sdk.FactSetIntradayTickHistory.exceptions import ApiValueError
from fds.sdk.FactSetIntradayTickHistory.exceptions import ApiKeyError
from fds.sdk.FactSetIntradayTickHistory.exceptions import ApiException
