"""
    Prime Developer Trial

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: v1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.BondsAPIforDigitalPortals.model_utils import (  # noqa: F401
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
from fds.sdk.BondsAPIforDigitalPortals.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_categorization import InlineResponse2004DataCategorization
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_compliance import InlineResponse2004DataCompliance
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_coupon import InlineResponse2004DataCoupon
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_issue import InlineResponse2004DataIssue
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_issuer import InlineResponse2004DataIssuer
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_life_cycle import InlineResponse2004DataLifeCycle
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_life_cycle_maturity_perpetual import InlineResponse2004DataLifeCycleMaturityPerpetual
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_macaulay_duration import InlineResponse2004DataMacaulayDuration
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_market import InlineResponse2004DataMarket
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_rating_system1 import InlineResponse2004DataRatingSystem1
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_rating_system2 import InlineResponse2004DataRatingSystem2
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_sensitivities import InlineResponse2004DataSensitivities
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_traded_value import InlineResponse2004DataTradedValue
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_trading_volume import InlineResponse2004DataTradingVolume
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_value_unit import InlineResponse2004DataValueUnit
    from fds.sdk.BondsAPIforDigitalPortals.model.inline_response2004_data_yield import InlineResponse2004DataYield
    globals()['InlineResponse2004DataCategorization'] = InlineResponse2004DataCategorization
    globals()['InlineResponse2004DataCompliance'] = InlineResponse2004DataCompliance
    globals()['InlineResponse2004DataCoupon'] = InlineResponse2004DataCoupon
    globals()['InlineResponse2004DataIssue'] = InlineResponse2004DataIssue
    globals()['InlineResponse2004DataIssuer'] = InlineResponse2004DataIssuer
    globals()['InlineResponse2004DataLifeCycle'] = InlineResponse2004DataLifeCycle
    globals()['InlineResponse2004DataLifeCycleMaturityPerpetual'] = InlineResponse2004DataLifeCycleMaturityPerpetual
    globals()['InlineResponse2004DataMacaulayDuration'] = InlineResponse2004DataMacaulayDuration
    globals()['InlineResponse2004DataMarket'] = InlineResponse2004DataMarket
    globals()['InlineResponse2004DataRatingSystem1'] = InlineResponse2004DataRatingSystem1
    globals()['InlineResponse2004DataRatingSystem2'] = InlineResponse2004DataRatingSystem2
    globals()['InlineResponse2004DataSensitivities'] = InlineResponse2004DataSensitivities
    globals()['InlineResponse2004DataTradedValue'] = InlineResponse2004DataTradedValue
    globals()['InlineResponse2004DataTradingVolume'] = InlineResponse2004DataTradingVolume
    globals()['InlineResponse2004DataValueUnit'] = InlineResponse2004DataValueUnit
    globals()['InlineResponse2004DataYield'] = InlineResponse2004DataYield


class InlineResponse2004Data(ModelNormal):
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
            'total_count': (float,),  # noqa: E501
            'value_unit': ([InlineResponse2004DataValueUnit],),  # noqa: E501
            'market': ([InlineResponse2004DataMarket],),  # noqa: E501
            'categorization': ([InlineResponse2004DataCategorization],),  # noqa: E501
            'life_cycle': (InlineResponse2004DataLifeCycle,),  # noqa: E501
            'subordinated': ([InlineResponse2004DataLifeCycleMaturityPerpetual],),  # noqa: E501
            'rating_system1': (InlineResponse2004DataRatingSystem1,),  # noqa: E501
            'rating_system2': (InlineResponse2004DataRatingSystem2,),  # noqa: E501
            'issuer': (InlineResponse2004DataIssuer,),  # noqa: E501
            'issue': (InlineResponse2004DataIssue,),  # noqa: E501
            'trading_volume': (InlineResponse2004DataTradingVolume,),  # noqa: E501
            'compliance': (InlineResponse2004DataCompliance,),  # noqa: E501
            'coupon': (InlineResponse2004DataCoupon,),  # noqa: E501
            '_yield': (InlineResponse2004DataYield,),  # noqa: E501
            'macaulay_duration': (InlineResponse2004DataMacaulayDuration,),  # noqa: E501
            'sensitivities': (InlineResponse2004DataSensitivities,),  # noqa: E501
            'traded_value': (InlineResponse2004DataTradedValue,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'total_count': 'totalCount',  # noqa: E501
        'value_unit': 'valueUnit',  # noqa: E501
        'market': 'market',  # noqa: E501
        'categorization': 'categorization',  # noqa: E501
        'life_cycle': 'lifeCycle',  # noqa: E501
        'subordinated': 'subordinated',  # noqa: E501
        'rating_system1': 'ratingSystem1',  # noqa: E501
        'rating_system2': 'ratingSystem2',  # noqa: E501
        'issuer': 'issuer',  # noqa: E501
        'issue': 'issue',  # noqa: E501
        'trading_volume': 'tradingVolume',  # noqa: E501
        'compliance': 'compliance',  # noqa: E501
        'coupon': 'coupon',  # noqa: E501
        '_yield': 'yield',  # noqa: E501
        'macaulay_duration': 'macaulayDuration',  # noqa: E501
        'sensitivities': 'sensitivities',  # noqa: E501
        'traded_value': 'tradedValue',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """InlineResponse2004Data - a model defined in OpenAPI

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
            total_count (float): Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges.. [optional]  # noqa: E501
            value_unit ([InlineResponse2004DataValueUnit]): List of value unit identifiers. See endpoint `/basic/valueUnit/list` for possible values.. [optional]  # noqa: E501
            market ([InlineResponse2004DataMarket]): List of market identifiers. See endpoint `/basic/market/list` for possible values.. [optional]  # noqa: E501
            categorization ([InlineResponse2004DataCategorization]): Lists of categories of the debt instruments' categorization. Starting with the most coarse level (one), for each level of the category system, the list of categories of the debt instruments, matching the parameters, is returned. See endpoint `/category/listBySystem` with `id=18` for possible values.. [optional]  # noqa: E501
            life_cycle (InlineResponse2004DataLifeCycle): [optional]  # noqa: E501
            subordinated ([InlineResponse2004DataLifeCycleMaturityPerpetual]): Indicates whether subordinated and non-subordinated are among the results. In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.. [optional]  # noqa: E501
            rating_system1 (InlineResponse2004DataRatingSystem1): [optional]  # noqa: E501
            rating_system2 (InlineResponse2004DataRatingSystem2): [optional]  # noqa: E501
            issuer (InlineResponse2004DataIssuer): [optional]  # noqa: E501
            issue (InlineResponse2004DataIssue): [optional]  # noqa: E501
            trading_volume (InlineResponse2004DataTradingVolume): [optional]  # noqa: E501
            compliance (InlineResponse2004DataCompliance): [optional]  # noqa: E501
            coupon (InlineResponse2004DataCoupon): [optional]  # noqa: E501
            _yield (InlineResponse2004DataYield): [optional]  # noqa: E501
            macaulay_duration (InlineResponse2004DataMacaulayDuration): [optional]  # noqa: E501
            sensitivities (InlineResponse2004DataSensitivities): [optional]  # noqa: E501
            traded_value (InlineResponse2004DataTradedValue): [optional]  # noqa: E501
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
        """InlineResponse2004Data - a model defined in OpenAPI

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
            total_count (float): Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges.. [optional]  # noqa: E501
            value_unit ([InlineResponse2004DataValueUnit]): List of value unit identifiers. See endpoint `/basic/valueUnit/list` for possible values.. [optional]  # noqa: E501
            market ([InlineResponse2004DataMarket]): List of market identifiers. See endpoint `/basic/market/list` for possible values.. [optional]  # noqa: E501
            categorization ([InlineResponse2004DataCategorization]): Lists of categories of the debt instruments' categorization. Starting with the most coarse level (one), for each level of the category system, the list of categories of the debt instruments, matching the parameters, is returned. See endpoint `/category/listBySystem` with `id=18` for possible values.. [optional]  # noqa: E501
            life_cycle (InlineResponse2004DataLifeCycle): [optional]  # noqa: E501
            subordinated ([InlineResponse2004DataLifeCycleMaturityPerpetual]): Indicates whether subordinated and non-subordinated are among the results. In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.. [optional]  # noqa: E501
            rating_system1 (InlineResponse2004DataRatingSystem1): [optional]  # noqa: E501
            rating_system2 (InlineResponse2004DataRatingSystem2): [optional]  # noqa: E501
            issuer (InlineResponse2004DataIssuer): [optional]  # noqa: E501
            issue (InlineResponse2004DataIssue): [optional]  # noqa: E501
            trading_volume (InlineResponse2004DataTradingVolume): [optional]  # noqa: E501
            compliance (InlineResponse2004DataCompliance): [optional]  # noqa: E501
            coupon (InlineResponse2004DataCoupon): [optional]  # noqa: E501
            _yield (InlineResponse2004DataYield): [optional]  # noqa: E501
            macaulay_duration (InlineResponse2004DataMacaulayDuration): [optional]  # noqa: E501
            sensitivities (InlineResponse2004DataSensitivities): [optional]  # noqa: E501
            traded_value (InlineResponse2004DataTradedValue): [optional]  # noqa: E501
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
