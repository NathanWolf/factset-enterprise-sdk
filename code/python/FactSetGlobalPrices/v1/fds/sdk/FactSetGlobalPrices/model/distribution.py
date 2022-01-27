"""
    FactSet Global Prices API

    The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p>   # noqa: E501

    The version of the OpenAPI document: 1.0.1
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetGlobalPrices.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetGlobalPrices.exceptions import ApiAttributeError



class Distribution(ModelNormal):
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
        ('event_type_code',): {
            'DVS': "DVS",
            'DVSS': "DVSS",
            'BNS': "BNS",
            'BNSS': "BNSS",
            'SPO': "SPO",
            'DSR': "DSR",
        },
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
            'event_id': (str,),  # noqa: E501
            'event_type_code': (str,),  # noqa: E501
            'event_type_desc': (str,),  # noqa: E501
            'announcement_date': (str,),  # noqa: E501
            'record_date': (str,),  # noqa: E501
            'pay_date': (str,),  # noqa: E501
            'effective_date': (str,),  # noqa: E501
            'adj_factor': (float,),  # noqa: E501
            'adj_factor_combined': (float,),  # noqa: E501
            'amt_def_trading_adj': (float,),  # noqa: E501
            'amt_def_trading_unadj': (float,),  # noqa: E501
            'currency': (str,),  # noqa: E501
            'dist_pct': (float,),  # noqa: E501
            'dist_old_term': (float,),  # noqa: E501
            'dist_new_term': (float,),  # noqa: E501
            'rights_issue_price': (float,),  # noqa: E501
            'rights_issue_currency': (str,),  # noqa: E501
            'short_desc': (str,),  # noqa: E501
            'request_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'fsym_id': 'fsymId',  # noqa: E501
        'event_id': 'eventId',  # noqa: E501
        'event_type_code': 'eventTypeCode',  # noqa: E501
        'event_type_desc': 'eventTypeDesc',  # noqa: E501
        'announcement_date': 'announcementDate',  # noqa: E501
        'record_date': 'recordDate',  # noqa: E501
        'pay_date': 'payDate',  # noqa: E501
        'effective_date': 'effectiveDate',  # noqa: E501
        'adj_factor': 'adjFactor',  # noqa: E501
        'adj_factor_combined': 'adjFactorCombined',  # noqa: E501
        'amt_def_trading_adj': 'amtDefTradingAdj',  # noqa: E501
        'amt_def_trading_unadj': 'amtDefTradingUnadj',  # noqa: E501
        'currency': 'currency',  # noqa: E501
        'dist_pct': 'distPct',  # noqa: E501
        'dist_old_term': 'distOldTerm',  # noqa: E501
        'dist_new_term': 'distNewTerm',  # noqa: E501
        'rights_issue_price': 'rightsIssuePrice',  # noqa: E501
        'rights_issue_currency': 'rightsIssueCurrency',  # noqa: E501
        'short_desc': 'shortDesc',  # noqa: E501
        'request_id': 'requestId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """Distribution - a model defined in OpenAPI

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
            event_id (str): FactSet identifier that uniquely identifies the Event.. [optional]  # noqa: E501
            event_type_code (str): Corporate Actions Event type code.. [optional]  # noqa: E501
            event_type_desc (str): Corporate Actions Event type description.. [optional]  # noqa: E501
            announcement_date (str): Date Event was announced in YYYY-MM-DD format.. [optional]  # noqa: E501
            record_date (str): Date of Record for distribution in YYYY-MM-DD format.. [optional]  # noqa: E501
            pay_date (str): Date of Payment for distribution in YYYY-MM-DD format.. [optional]  # noqa: E501
            effective_date (str): Effective Date or Ex-Date of distribution in YYYY-MM-DD format.. [optional]  # noqa: E501
            adj_factor (float): Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split. . [optional]  # noqa: E501
            adj_factor_combined (float): Combined adjustment factor for all distribution events on that day.. [optional]  # noqa: E501
            amt_def_trading_adj (float): Default Amount - Trading Currency, Split Adjusted. [optional]  # noqa: E501
            amt_def_trading_unadj (float): Default Amount - Trading Currency, Unadjusted. [optional]  # noqa: E501
            currency (str): Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).. [optional]  # noqa: E501
            dist_pct (float): Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.. [optional]  # noqa: E501
            dist_old_term (float): Component of distribution ratio -  Number of shares held.. [optional]  # noqa: E501
            dist_new_term (float): Component of distribution ratio -  Number of shares received.. [optional]  # noqa: E501
            rights_issue_price (float): Description. [optional]  # noqa: E501
            rights_issue_currency (str): Description. [optional]  # noqa: E501
            short_desc (str): Textual description identifying the event.. [optional]  # noqa: E501
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
        """Distribution - a model defined in OpenAPI

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
            event_id (str): FactSet identifier that uniquely identifies the Event.. [optional]  # noqa: E501
            event_type_code (str): Corporate Actions Event type code.. [optional]  # noqa: E501
            event_type_desc (str): Corporate Actions Event type description.. [optional]  # noqa: E501
            announcement_date (str): Date Event was announced in YYYY-MM-DD format.. [optional]  # noqa: E501
            record_date (str): Date of Record for distribution in YYYY-MM-DD format.. [optional]  # noqa: E501
            pay_date (str): Date of Payment for distribution in YYYY-MM-DD format.. [optional]  # noqa: E501
            effective_date (str): Effective Date or Ex-Date of distribution in YYYY-MM-DD format.. [optional]  # noqa: E501
            adj_factor (float): Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split. . [optional]  # noqa: E501
            adj_factor_combined (float): Combined adjustment factor for all distribution events on that day.. [optional]  # noqa: E501
            amt_def_trading_adj (float): Default Amount - Trading Currency, Split Adjusted. [optional]  # noqa: E501
            amt_def_trading_unadj (float): Default Amount - Trading Currency, Unadjusted. [optional]  # noqa: E501
            currency (str): Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).. [optional]  # noqa: E501
            dist_pct (float): Distribution percentage of the event  (i.e. 10%). Typical for stock distributions.. [optional]  # noqa: E501
            dist_old_term (float): Component of distribution ratio -  Number of shares held.. [optional]  # noqa: E501
            dist_new_term (float): Component of distribution ratio -  Number of shares received.. [optional]  # noqa: E501
            rights_issue_price (float): Description. [optional]  # noqa: E501
            rights_issue_currency (str): Description. [optional]  # noqa: E501
            short_desc (str): Textual description identifying the event.. [optional]  # noqa: E501
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
