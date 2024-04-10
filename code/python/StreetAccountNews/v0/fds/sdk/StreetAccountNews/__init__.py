# flake8: noqa

"""
    StreetAccount News API

    The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Company Filters, Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.  **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Request Files, Check Status, and Get Files.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.  # noqa: E501

    The version of the OpenAPI document: 0.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.20.3"

# import ApiClient
from fds.sdk.StreetAccountNews.api_client import ApiClient

# import Configuration
from fds.sdk.StreetAccountNews.configuration import Configuration

# import exceptions
from fds.sdk.StreetAccountNews.exceptions import OpenApiException
from fds.sdk.StreetAccountNews.exceptions import ApiAttributeError
from fds.sdk.StreetAccountNews.exceptions import ApiTypeError
from fds.sdk.StreetAccountNews.exceptions import ApiValueError
from fds.sdk.StreetAccountNews.exceptions import ApiKeyError
from fds.sdk.StreetAccountNews.exceptions import ApiException
