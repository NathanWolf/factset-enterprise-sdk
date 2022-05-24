"""
    Stocks API For Digital Portals

    The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.  # noqa: E501

    The version of the OpenAPI document: 2
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.StocksAPIforDigitalPortals.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from fds.sdk.StocksAPIforDigitalPortals.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_dividend_yield import InlineResponse200RatiosDividendYield
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_enterprise_value_ebit import InlineResponse200RatiosEnterpriseValueEbit
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_enterprise_value_ebita import InlineResponse200RatiosEnterpriseValueEbita
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_enterprise_value_ebitda import InlineResponse200RatiosEnterpriseValueEbitda
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_enterprise_value_free_cash_flow import InlineResponse200RatiosEnterpriseValueFreeCashFlow
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_enterprise_value_sales import InlineResponse200RatiosEnterpriseValueSales
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_price_book_value import InlineResponse200RatiosPriceBookValue
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_price_cash_flow import InlineResponse200RatiosPriceCashFlow
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_price_earnings import InlineResponse200RatiosPriceEarnings
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_price_earnings_growth import InlineResponse200RatiosPriceEarningsGrowth
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_price_free_cash_flow import InlineResponse200RatiosPriceFreeCashFlow
    from fds.sdk.StocksAPIforDigitalPortals.model.inline_response200_ratios_price_sales import InlineResponse200RatiosPriceSales
    globals()['InlineResponse200RatiosDividendYield'] = InlineResponse200RatiosDividendYield
    globals()['InlineResponse200RatiosEnterpriseValueEbit'] = InlineResponse200RatiosEnterpriseValueEbit
    globals()['InlineResponse200RatiosEnterpriseValueEbita'] = InlineResponse200RatiosEnterpriseValueEbita
    globals()['InlineResponse200RatiosEnterpriseValueEbitda'] = InlineResponse200RatiosEnterpriseValueEbitda
    globals()['InlineResponse200RatiosEnterpriseValueFreeCashFlow'] = InlineResponse200RatiosEnterpriseValueFreeCashFlow
    globals()['InlineResponse200RatiosEnterpriseValueSales'] = InlineResponse200RatiosEnterpriseValueSales
    globals()['InlineResponse200RatiosPriceBookValue'] = InlineResponse200RatiosPriceBookValue
    globals()['InlineResponse200RatiosPriceCashFlow'] = InlineResponse200RatiosPriceCashFlow
    globals()['InlineResponse200RatiosPriceEarnings'] = InlineResponse200RatiosPriceEarnings
    globals()['InlineResponse200RatiosPriceEarningsGrowth'] = InlineResponse200RatiosPriceEarningsGrowth
    globals()['InlineResponse200RatiosPriceFreeCashFlow'] = InlineResponse200RatiosPriceFreeCashFlow
    globals()['InlineResponse200RatiosPriceSales'] = InlineResponse200RatiosPriceSales


class InlineResponse200Ratios(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'price_sales': (InlineResponse200RatiosPriceSales,),  # noqa: E501
            'price_earnings': (InlineResponse200RatiosPriceEarnings,),  # noqa: E501
            'price_earnings_growth': (InlineResponse200RatiosPriceEarningsGrowth,),  # noqa: E501
            'price_book_value': (InlineResponse200RatiosPriceBookValue,),  # noqa: E501
            'price_cash_flow': (InlineResponse200RatiosPriceCashFlow,),  # noqa: E501
            'price_free_cash_flow': (InlineResponse200RatiosPriceFreeCashFlow,),  # noqa: E501
            'dividend_yield': (InlineResponse200RatiosDividendYield,),  # noqa: E501
            'enterprise_value_ebit': (InlineResponse200RatiosEnterpriseValueEbit,),  # noqa: E501
            'enterprise_value_ebita': (InlineResponse200RatiosEnterpriseValueEbita,),  # noqa: E501
            'enterprise_value_ebitda': (InlineResponse200RatiosEnterpriseValueEbitda,),  # noqa: E501
            'enterprise_value_sales': (InlineResponse200RatiosEnterpriseValueSales,),  # noqa: E501
            'enterprise_value_free_cash_flow': (InlineResponse200RatiosEnterpriseValueFreeCashFlow,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'price_sales': 'priceSales',  # noqa: E501
        'price_earnings': 'priceEarnings',  # noqa: E501
        'price_earnings_growth': 'priceEarningsGrowth',  # noqa: E501
        'price_book_value': 'priceBookValue',  # noqa: E501
        'price_cash_flow': 'priceCashFlow',  # noqa: E501
        'price_free_cash_flow': 'priceFreeCashFlow',  # noqa: E501
        'dividend_yield': 'dividendYield',  # noqa: E501
        'enterprise_value_ebit': 'enterpriseValueEbit',  # noqa: E501
        'enterprise_value_ebita': 'enterpriseValueEbita',  # noqa: E501
        'enterprise_value_ebitda': 'enterpriseValueEbitda',  # noqa: E501
        'enterprise_value_sales': 'enterpriseValueSales',  # noqa: E501
        'enterprise_value_free_cash_flow': 'enterpriseValueFreeCashFlow',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """InlineResponse200Ratios - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            price_sales (InlineResponse200RatiosPriceSales): [optional]  # noqa: E501
            price_earnings (InlineResponse200RatiosPriceEarnings): [optional]  # noqa: E501
            price_earnings_growth (InlineResponse200RatiosPriceEarningsGrowth): [optional]  # noqa: E501
            price_book_value (InlineResponse200RatiosPriceBookValue): [optional]  # noqa: E501
            price_cash_flow (InlineResponse200RatiosPriceCashFlow): [optional]  # noqa: E501
            price_free_cash_flow (InlineResponse200RatiosPriceFreeCashFlow): [optional]  # noqa: E501
            dividend_yield (InlineResponse200RatiosDividendYield): [optional]  # noqa: E501
            enterprise_value_ebit (InlineResponse200RatiosEnterpriseValueEbit): [optional]  # noqa: E501
            enterprise_value_ebita (InlineResponse200RatiosEnterpriseValueEbita): [optional]  # noqa: E501
            enterprise_value_ebitda (InlineResponse200RatiosEnterpriseValueEbitda): [optional]  # noqa: E501
            enterprise_value_sales (InlineResponse200RatiosEnterpriseValueSales): [optional]  # noqa: E501
            enterprise_value_free_cash_flow (InlineResponse200RatiosEnterpriseValueFreeCashFlow): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """InlineResponse200Ratios - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            price_sales (InlineResponse200RatiosPriceSales): [optional]  # noqa: E501
            price_earnings (InlineResponse200RatiosPriceEarnings): [optional]  # noqa: E501
            price_earnings_growth (InlineResponse200RatiosPriceEarningsGrowth): [optional]  # noqa: E501
            price_book_value (InlineResponse200RatiosPriceBookValue): [optional]  # noqa: E501
            price_cash_flow (InlineResponse200RatiosPriceCashFlow): [optional]  # noqa: E501
            price_free_cash_flow (InlineResponse200RatiosPriceFreeCashFlow): [optional]  # noqa: E501
            dividend_yield (InlineResponse200RatiosDividendYield): [optional]  # noqa: E501
            enterprise_value_ebit (InlineResponse200RatiosEnterpriseValueEbit): [optional]  # noqa: E501
            enterprise_value_ebita (InlineResponse200RatiosEnterpriseValueEbita): [optional]  # noqa: E501
            enterprise_value_ebitda (InlineResponse200RatiosEnterpriseValueEbitda): [optional]  # noqa: E501
            enterprise_value_sales (InlineResponse200RatiosEnterpriseValueSales): [optional]  # noqa: E501
            enterprise_value_free_cash_flow (InlineResponse200RatiosEnterpriseValueFreeCashFlow): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
