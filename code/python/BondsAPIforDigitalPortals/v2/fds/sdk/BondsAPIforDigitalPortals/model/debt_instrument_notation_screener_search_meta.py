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
)
from ..model_utils import OpenApiModel
from fds.sdk.BondsAPIforDigitalPortals.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.BondsAPIforDigitalPortals.model.attributes_member import AttributesMember
    from fds.sdk.BondsAPIforDigitalPortals.model.debt_instrument_notation_screener_search_meta_pagination import DebtInstrumentNotationScreenerSearchMetaPagination
    from fds.sdk.BondsAPIforDigitalPortals.model.language_member import LanguageMember
    globals()['AttributesMember'] = AttributesMember
    globals()['DebtInstrumentNotationScreenerSearchMetaPagination'] = DebtInstrumentNotationScreenerSearchMetaPagination
    globals()['LanguageMember'] = LanguageMember


class DebtInstrumentNotationScreenerSearchMeta(ModelNormal):
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
        ('sort',): {
            'VALUEUNIT.CODE': "valueUnit.code",
            '-VALUEUNIT.CODE': "-valueUnit.code",
            'MARKET.NAME': "market.name",
            '-MARKET.NAME': "-market.name",
            'SYMBOL': "symbol",
            '-SYMBOL': "-symbol",
            'INSTRUMENT.NAME': "instrument.name",
            '-INSTRUMENT.NAME': "-instrument.name",
            'INSTRUMENT.SHORTNAME': "instrument.shortName",
            '-INSTRUMENT.SHORTNAME': "-instrument.shortName",
            'INSTRUMENT.CATEGORIZATION.LEVEL1.NAME': "instrument.categorization.level1.name",
            '-INSTRUMENT.CATEGORIZATION.LEVEL1.NAME': "-instrument.categorization.level1.name",
            'INSTRUMENT.CATEGORIZATION.LEVEL2.NAME': "instrument.categorization.level2.name",
            '-INSTRUMENT.CATEGORIZATION.LEVEL2.NAME': "-instrument.categorization.level2.name",
            'INSTRUMENT.CATEGORIZATION.LEVEL3.NAME': "instrument.categorization.level3.name",
            '-INSTRUMENT.CATEGORIZATION.LEVEL3.NAME': "-instrument.categorization.level3.name",
            'INSTRUMENT.LIFECYCLE.ISSUE': "instrument.lifeCycle.issue",
            '-INSTRUMENT.LIFECYCLE.ISSUE': "-instrument.lifeCycle.issue",
            'INSTRUMENT.LIFECYCLE.MATURITY.DATE': "instrument.lifeCycle.maturity.date",
            '-INSTRUMENT.LIFECYCLE.MATURITY.DATE': "-instrument.lifeCycle.maturity.date",
            'INSTRUMENT.LIFECYCLE.MATURITY.REMAININGTERMYEARS': "instrument.lifeCycle.maturity.remainingTermYears",
            '-INSTRUMENT.LIFECYCLE.MATURITY.REMAININGTERMYEARS': "-instrument.lifeCycle.maturity.remainingTermYears",
            'INSTRUMENT.LIFECYCLE.MATURITY.PERPETUAL': "instrument.lifeCycle.maturity.perpetual",
            '-INSTRUMENT.LIFECYCLE.MATURITY.PERPETUAL': "-instrument.lifeCycle.maturity.perpetual",
            'INSTRUMENT.LIFECYCLE.CALLABLE': "instrument.lifeCycle.callable",
            '-INSTRUMENT.LIFECYCLE.CALLABLE': "-instrument.lifeCycle.callable",
            'INSTRUMENT.SUBORDINATED': "instrument.subordinated",
            '-INSTRUMENT.SUBORDINATED': "-instrument.subordinated",
            'INSTRUMENT.RATINGSYSTEM1.RATING.GRADE': "instrument.ratingSystem1.rating.grade",
            '-INSTRUMENT.RATINGSYSTEM1.RATING.GRADE': "-instrument.ratingSystem1.rating.grade",
            'INSTRUMENT.RATINGSYSTEM2.RATING.GRADE': "instrument.ratingSystem2.rating.grade",
            '-INSTRUMENT.RATINGSYSTEM2.RATING.GRADE': "-instrument.ratingSystem2.rating.grade",
            'INSTRUMENT.ISSUER.NAME': "instrument.issuer.name",
            '-INSTRUMENT.ISSUER.NAME': "-instrument.issuer.name",
            'INSTRUMENT.ISSUER.COUNTRY.NAME': "instrument.issuer.country.name",
            '-INSTRUMENT.ISSUER.COUNTRY.NAME': "-instrument.issuer.country.name",
            'INSTRUMENT.ISSUE.VOLUME.CURRENCY.ISOCODE': "instrument.issue.volume.currency.isoCode",
            '-INSTRUMENT.ISSUE.VOLUME.CURRENCY.ISOCODE': "-instrument.issue.volume.currency.isoCode",
            'INSTRUMENT.TRADINGVOLUME.OTC.MINIMUM': "instrument.tradingVolume.otc.minimum",
            '-INSTRUMENT.TRADINGVOLUME.OTC.MINIMUM': "-instrument.tradingVolume.otc.minimum",
            'INSTRUMENT.COMPLIANCE.GERMANY.TRUSTEEELIGIBLE': "instrument.compliance.germany.trusteeEligible",
            '-INSTRUMENT.COMPLIANCE.GERMANY.TRUSTEEELIGIBLE': "-instrument.compliance.germany.trusteeEligible",
            'INSTRUMENT.COUPON.OCCURRENCE.FREQUENCY.NAME': "instrument.coupon.occurrence.frequency.name",
            '-INSTRUMENT.COUPON.OCCURRENCE.FREQUENCY.NAME': "-instrument.coupon.occurrence.frequency.name",
            'INSTRUMENT.COUPON.CURRENTINTERESTRATE.TYPE.NAME': "instrument.coupon.currentInterestRate.type.name",
            '-INSTRUMENT.COUPON.CURRENTINTERESTRATE.TYPE.NAME': "-instrument.coupon.currentInterestRate.type.name",
            'INSTRUMENT.COUPON.CURRENTINTERESTRATE.VALUE': "instrument.coupon.currentInterestRate.value",
            '-INSTRUMENT.COUPON.CURRENTINTERESTRATE.VALUE': "-instrument.coupon.currentInterestRate.value",
            'YIELD.CURRENT': "yield.current",
            '-YIELD.CURRENT': "-yield.current",
            'YIELD.TOMATURITY': "yield.toMaturity",
            '-YIELD.TOMATURITY': "-yield.toMaturity",
            'YIELD.SPREAD': "yield.spread",
            '-YIELD.SPREAD': "-yield.spread",
            'MACAULAYDURATION': "macaulayDuration",
            '-MACAULAYDURATION': "-macaulayDuration",
            'SENSITIVITIES.BASEPOINTVALUE': "sensitivities.basePointValue",
            '-SENSITIVITIES.BASEPOINTVALUE': "-sensitivities.basePointValue",
            'SENSITIVITIES.MODIFIEDDURATION': "sensitivities.modifiedDuration",
            '-SENSITIVITIES.MODIFIEDDURATION': "-sensitivities.modifiedDuration",
            'SENSITIVITIES.ELASTICITY': "sensitivities.elasticity",
            '-SENSITIVITIES.ELASTICITY': "-sensitivities.elasticity",
            'SENSITIVITIES.CONVEXITY': "sensitivities.convexity",
            '-SENSITIVITIES.CONVEXITY': "-sensitivities.convexity",
            'TRADEDVALUE.DAYS30.SUM': "tradedValue.days30.sum",
            '-TRADEDVALUE.DAYS30.SUM': "-tradedValue.days30.sum",
            'TRADEDVALUE.DAYS30.AVERAGE': "tradedValue.days30.average",
            '-TRADEDVALUE.DAYS30.AVERAGE': "-tradedValue.days30.average",
        },
    }

    validations = {
        ('sort',): {
            'max_items': 10,
        },
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
            'attributes': (AttributesMember,),  # noqa: E501
            'language': (LanguageMember,),  # noqa: E501
            'sort': ([str],),  # noqa: E501
            'pagination': (DebtInstrumentNotationScreenerSearchMetaPagination,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'attributes': 'attributes',  # noqa: E501
        'language': 'language',  # noqa: E501
        'sort': 'sort',  # noqa: E501
        'pagination': 'pagination',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """DebtInstrumentNotationScreenerSearchMeta - a model defined in OpenAPI

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
            attributes (AttributesMember): [optional]  # noqa: E501
            language (LanguageMember): [optional]  # noqa: E501
            sort ([str]): Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.. [optional]  # noqa: E501
            pagination (DebtInstrumentNotationScreenerSearchMetaPagination): [optional]  # noqa: E501
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
        """DebtInstrumentNotationScreenerSearchMeta - a model defined in OpenAPI

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
            attributes (AttributesMember): [optional]  # noqa: E501
            language (LanguageMember): [optional]  # noqa: E501
            sort ([str]): Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.. [optional]  # noqa: E501
            pagination (DebtInstrumentNotationScreenerSearchMetaPagination): [optional]  # noqa: E501
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
