# flake8: noqa

"""
    Foreign Exchange Rates API

    Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p>   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.7"

# import ApiClient
from fds.sdk.ForeignExchangeRate.api_client import ApiClient

# import Configuration
from fds.sdk.ForeignExchangeRate.configuration import Configuration

# import exceptions
from fds.sdk.ForeignExchangeRate.exceptions import OpenApiException
from fds.sdk.ForeignExchangeRate.exceptions import ApiAttributeError
from fds.sdk.ForeignExchangeRate.exceptions import ApiTypeError
from fds.sdk.ForeignExchangeRate.exceptions import ApiValueError
from fds.sdk.ForeignExchangeRate.exceptions import ApiKeyError
from fds.sdk.ForeignExchangeRate.exceptions import ApiException
