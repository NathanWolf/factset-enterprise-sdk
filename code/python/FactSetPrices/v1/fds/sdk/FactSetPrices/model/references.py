"""
    FactSet Prices API

    Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p>   # noqa: E501

    The version of the OpenAPI document: 1.2.1
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetPrices.model_utils import (  # noqa: F401
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
)
from ..model_utils import OpenApiModel
from fds.sdk.FactSetPrices.exceptions import ApiAttributeError



class References(ModelNormal):
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
        return {
            'fsym_id': (str,),  # noqa: E501
            'name': (str,),  # noqa: E501
            'sec_type': (str,),  # noqa: E501
            'sec_type_code': (str,),  # noqa: E501
            'sec_type_code_det': (str,),  # noqa: E501
            'currency': (str,),  # noqa: E501
            'country': (str,),  # noqa: E501
            'primary_exchange': (str,),  # noqa: E501
            'exchange_country': (str,),  # noqa: E501
            'local_index': (str,),  # noqa: E501
            'next_trading_holiday_date': (date,),  # noqa: E501
            'first_date': (date,),  # noqa: E501
            'last_date': (date,),  # noqa: E501
            'request_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'fsym_id': 'fsymId',  # noqa: E501
        'name': 'name',  # noqa: E501
        'sec_type': 'secType',  # noqa: E501
        'sec_type_code': 'secTypeCode',  # noqa: E501
        'sec_type_code_det': 'secTypeCodeDet',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'country': 'country',  # noqa: E501
        'primary_exchange': 'primaryExchange',  # noqa: E501
        'exchange_country': 'exchangeCountry',  # noqa: E501
        'local_index': 'localIndex',  # noqa: E501
        'next_trading_holiday_date': 'nextTradingHolidayDate',  # noqa: E501
        'first_date': 'firstDate',  # noqa: E501
        'last_date': 'lastDate',  # noqa: E501
        'request_id': 'requestId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """References - a model defined in OpenAPI

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
            fsym_id (str): Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.. [optional]  # noqa: E501
            name (str): The name of the security.. [optional]  # noqa: E501
            sec_type (str): Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).. [optional]  # noqa: E501
            sec_type_code (str): General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).. [optional]  # noqa: E501
            sec_type_code_det (str): Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).. [optional]  # noqa: E501
            currency (str): Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).. [optional]  # noqa: E501
            country (str): Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*.. [optional]  # noqa: E501
            primary_exchange (str): Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610).. [optional]  # noqa: E501
            exchange_country (str): Returns the location of the exchange where the company's stock is traded.. [optional]  # noqa: E501
            local_index (str): The Local Index ID for the company's home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698).. [optional]  # noqa: E501
            next_trading_holiday_date (date): The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397).. [optional]  # noqa: E501
            first_date (date): The Security's Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details.. [optional]  # noqa: E501
            last_date (date): Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing.. [optional]  # noqa: E501
            request_id (str): Identifier that was used for the request.. [optional]  # noqa: E501
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
        """References - a model defined in OpenAPI

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
            fsym_id (str): Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.. [optional]  # noqa: E501
            name (str): The name of the security.. [optional]  # noqa: E501
            sec_type (str): Security Type Description. For more details, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).. [optional]  # noqa: E501
            sec_type_code (str): General Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).. [optional]  # noqa: E501
            sec_type_code_det (str): Detailed Security Type Code. For more details regarding what the code represents, visit [Online Assistant Page #10149](https://oa.apps.factset.com/pages/10149).. [optional]  # noqa: E501
            currency (str): Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).. [optional]  # noqa: E501
            country (str): Country Name. Returns the country where the security is *traded* from the North American Pricing database. Therefore, for securities covered by the North American Pricing database, will return either UNITED STATES. or CANADA. For securities covered by the Global Pricing database, the item returns the country where the company is *incorporated*.. [optional]  # noqa: E501
            primary_exchange (str): Primary Exchange Name. For more details, visit [Online Assistant Page #16610](https://oa.apps.factset.com/pages/16610).. [optional]  # noqa: E501
            exchange_country (str): Returns the location of the exchange where the company's stock is traded.. [optional]  # noqa: E501
            local_index (str): The Local Index ID for the company's home country benchmark. For more details, visit [Online Assistant Page #10698](https://oa.apps.factset.com/pages/10698).. [optional]  # noqa: E501
            next_trading_holiday_date (date): The Next Trading Holiday. For more details regarding Global Trading Holiday Schedules, visit [Online Assistant Page #10397](https://oa.apps.factset.com/pages/10397).. [optional]  # noqa: E501
            first_date (date): The Security's Date of First Trade. It will return the first date that the FactSet Pricing database began to cover the security and it may not coincide with the actual IPO date. Pricing information for this security will not be available before the date returned. For more details.. [optional]  # noqa: E501
            last_date (date): Date of Last Trade.  It will return the last date that the FactSet Pricing database as a record for this security listing.. [optional]  # noqa: E501
            request_id (str): Identifier that was used for the request.. [optional]  # noqa: E501
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
