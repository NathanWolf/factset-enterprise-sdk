"""
    Funds API For Digital Portals

    Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.  # noqa: E501

    The version of the OpenAPI document: 2
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FundsAPIforDigitalPortals.model_utils import (  # noqa: F401
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
from fds.sdk.FundsAPIforDigitalPortals.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee12b import InlineResponse2004ShareClassFee12b
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_administration import InlineResponse2004ShareClassFeeAdministration
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_all_in import InlineResponse2004ShareClassFeeAllIn
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_custodian_bank import InlineResponse2004ShareClassFeeCustodianBank
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_distribution import InlineResponse2004ShareClassFeeDistribution
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_handling import InlineResponse2004ShareClassFeeHandling
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_initial import InlineResponse2004ShareClassFeeInitial
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_management import InlineResponse2004ShareClassFeeManagement
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_ongoing import InlineResponse2004ShareClassFeeOngoing
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_performance import InlineResponse2004ShareClassFeePerformance
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_redemption import InlineResponse2004ShareClassFeeRedemption
    from fds.sdk.FundsAPIforDigitalPortals.model.inline_response2004_share_class_fee_switching import InlineResponse2004ShareClassFeeSwitching
    globals()['InlineResponse2004ShareClassFee12b'] = InlineResponse2004ShareClassFee12b
    globals()['InlineResponse2004ShareClassFeeAdministration'] = InlineResponse2004ShareClassFeeAdministration
    globals()['InlineResponse2004ShareClassFeeAllIn'] = InlineResponse2004ShareClassFeeAllIn
    globals()['InlineResponse2004ShareClassFeeCustodianBank'] = InlineResponse2004ShareClassFeeCustodianBank
    globals()['InlineResponse2004ShareClassFeeDistribution'] = InlineResponse2004ShareClassFeeDistribution
    globals()['InlineResponse2004ShareClassFeeHandling'] = InlineResponse2004ShareClassFeeHandling
    globals()['InlineResponse2004ShareClassFeeInitial'] = InlineResponse2004ShareClassFeeInitial
    globals()['InlineResponse2004ShareClassFeeManagement'] = InlineResponse2004ShareClassFeeManagement
    globals()['InlineResponse2004ShareClassFeeOngoing'] = InlineResponse2004ShareClassFeeOngoing
    globals()['InlineResponse2004ShareClassFeePerformance'] = InlineResponse2004ShareClassFeePerformance
    globals()['InlineResponse2004ShareClassFeeRedemption'] = InlineResponse2004ShareClassFeeRedemption
    globals()['InlineResponse2004ShareClassFeeSwitching'] = InlineResponse2004ShareClassFeeSwitching


class InlineResponse2004ShareClassFee(ModelNormal):
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
            'ongoing': (InlineResponse2004ShareClassFeeOngoing,),  # noqa: E501
            'all_in': (InlineResponse2004ShareClassFeeAllIn,),  # noqa: E501
            'performance': (InlineResponse2004ShareClassFeePerformance,),  # noqa: E501
            'management': (InlineResponse2004ShareClassFeeManagement,),  # noqa: E501
            'initial': (InlineResponse2004ShareClassFeeInitial,),  # noqa: E501
            'distribution': (InlineResponse2004ShareClassFeeDistribution,),  # noqa: E501
            'administration': (InlineResponse2004ShareClassFeeAdministration,),  # noqa: E501
            'handling': (InlineResponse2004ShareClassFeeHandling,),  # noqa: E501
            'redemption': (InlineResponse2004ShareClassFeeRedemption,),  # noqa: E501
            'custodian_bank': (InlineResponse2004ShareClassFeeCustodianBank,),  # noqa: E501
            '_12b': (InlineResponse2004ShareClassFee12b,),  # noqa: E501
            'switching': (InlineResponse2004ShareClassFeeSwitching,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'ongoing': 'ongoing',  # noqa: E501
        'all_in': 'allIn',  # noqa: E501
        'performance': 'performance',  # noqa: E501
        'management': 'management',  # noqa: E501
        'initial': 'initial',  # noqa: E501
        'distribution': 'distribution',  # noqa: E501
        'administration': 'administration',  # noqa: E501
        'handling': 'handling',  # noqa: E501
        'redemption': 'redemption',  # noqa: E501
        'custodian_bank': 'custodianBank',  # noqa: E501
        '_12b': '12b',  # noqa: E501
        'switching': 'switching',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """InlineResponse2004ShareClassFee - a model defined in OpenAPI

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
            ongoing (InlineResponse2004ShareClassFeeOngoing): [optional]  # noqa: E501
            all_in (InlineResponse2004ShareClassFeeAllIn): [optional]  # noqa: E501
            performance (InlineResponse2004ShareClassFeePerformance): [optional]  # noqa: E501
            management (InlineResponse2004ShareClassFeeManagement): [optional]  # noqa: E501
            initial (InlineResponse2004ShareClassFeeInitial): [optional]  # noqa: E501
            distribution (InlineResponse2004ShareClassFeeDistribution): [optional]  # noqa: E501
            administration (InlineResponse2004ShareClassFeeAdministration): [optional]  # noqa: E501
            handling (InlineResponse2004ShareClassFeeHandling): [optional]  # noqa: E501
            redemption (InlineResponse2004ShareClassFeeRedemption): [optional]  # noqa: E501
            custodian_bank (InlineResponse2004ShareClassFeeCustodianBank): [optional]  # noqa: E501
            _12b (InlineResponse2004ShareClassFee12b): [optional]  # noqa: E501
            switching (InlineResponse2004ShareClassFeeSwitching): [optional]  # noqa: E501
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
        """InlineResponse2004ShareClassFee - a model defined in OpenAPI

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
            ongoing (InlineResponse2004ShareClassFeeOngoing): [optional]  # noqa: E501
            all_in (InlineResponse2004ShareClassFeeAllIn): [optional]  # noqa: E501
            performance (InlineResponse2004ShareClassFeePerformance): [optional]  # noqa: E501
            management (InlineResponse2004ShareClassFeeManagement): [optional]  # noqa: E501
            initial (InlineResponse2004ShareClassFeeInitial): [optional]  # noqa: E501
            distribution (InlineResponse2004ShareClassFeeDistribution): [optional]  # noqa: E501
            administration (InlineResponse2004ShareClassFeeAdministration): [optional]  # noqa: E501
            handling (InlineResponse2004ShareClassFeeHandling): [optional]  # noqa: E501
            redemption (InlineResponse2004ShareClassFeeRedemption): [optional]  # noqa: E501
            custodian_bank (InlineResponse2004ShareClassFeeCustodianBank): [optional]  # noqa: E501
            _12b (InlineResponse2004ShareClassFee12b): [optional]  # noqa: E501
            switching (InlineResponse2004ShareClassFeeSwitching): [optional]  # noqa: E501
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
