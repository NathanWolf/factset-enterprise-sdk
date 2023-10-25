# flake8: noqa

"""
    Price Alerting API For Digital Portals

    The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.  A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.  When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com.   # noqa: E501

    The version of the OpenAPI document: 3.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


__version__ = "0.11.1"

# import ApiClient
from fds.sdk.RealTimePriceAlerting.api_client import ApiClient

# import Configuration
from fds.sdk.RealTimePriceAlerting.configuration import Configuration

# import exceptions
from fds.sdk.RealTimePriceAlerting.exceptions import OpenApiException
from fds.sdk.RealTimePriceAlerting.exceptions import ApiAttributeError
from fds.sdk.RealTimePriceAlerting.exceptions import ApiTypeError
from fds.sdk.RealTimePriceAlerting.exceptions import ApiValueError
from fds.sdk.RealTimePriceAlerting.exceptions import ApiKeyError
from fds.sdk.RealTimePriceAlerting.exceptions import ApiException
