# flake8: noqa

"""
    FactSet Funds API

    FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return    # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "1.0.3"

# import ApiClient
from fds.sdk.FactSetFunds.api_client import ApiClient

# import Configuration
from fds.sdk.FactSetFunds.configuration import Configuration

# import exceptions
from fds.sdk.FactSetFunds.exceptions import OpenApiException
from fds.sdk.FactSetFunds.exceptions import ApiAttributeError
from fds.sdk.FactSetFunds.exceptions import ApiTypeError
from fds.sdk.FactSetFunds.exceptions import ApiValueError
from fds.sdk.FactSetFunds.exceptions import ApiKeyError
from fds.sdk.FactSetFunds.exceptions import ApiException
