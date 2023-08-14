"""
    FactSet People API

    The FactSet People API exposes FactSet data for individuals and their jobs.   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetPeople.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetPeople.exceptions import ApiAttributeError



class CompanyCompensation(ModelNormal):
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
            'name': (str, none_type,),  # noqa: E501
            'person_id': (str, none_type,),  # noqa: E501
            'title': (str, none_type,),  # noqa: E501
            'salary': (float, none_type,),  # noqa: E501
            'bonus': (float, none_type,),  # noqa: E501
            'stock_awards': (float, none_type,),  # noqa: E501
            'options_awards': (float, none_type,),  # noqa: E501
            'other_compensation': (float, none_type,),  # noqa: E501
            'total_compensation': (float, none_type,),  # noqa: E501
            'non_equity_incentive_plan_comp': (float, none_type,),  # noqa: E501
            'non_qualified_comp_earnings': (float, none_type,),  # noqa: E501
            'compensation_year': (str, none_type,),  # noqa: E501
            'request_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'name': 'name',  # noqa: E501
        'person_id': 'personId',  # noqa: E501
        'title': 'title',  # noqa: E501
        'salary': 'salary',  # noqa: E501
        'bonus': 'bonus',  # noqa: E501
        'stock_awards': 'stockAwards',  # noqa: E501
        'options_awards': 'optionsAwards',  # noqa: E501
        'other_compensation': 'otherCompensation',  # noqa: E501
        'total_compensation': 'totalCompensation',  # noqa: E501
        'non_equity_incentive_plan_comp': 'nonEquityIncentivePlanComp',  # noqa: E501
        'non_qualified_comp_earnings': 'nonQualifiedCompEarnings',  # noqa: E501
        'compensation_year': 'compensationYear',  # noqa: E501
        'request_id': 'requestId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """CompanyCompensation - a model defined in OpenAPI

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
            name (str, none_type): FactSet Name of the person. [optional]  # noqa: E501
            person_id (str, none_type): Factset Entity Identifier for the Person. [optional]  # noqa: E501
            title (str, none_type): The requested Position Title. [optional]  # noqa: E501
            salary (float, none_type): Salary of the person. Expressed in USD and raw units.. [optional]  # noqa: E501
            bonus (float, none_type): Bonus of the executive during the fiscal year. Expressed in USD and raw units.. [optional]  # noqa: E501
            stock_awards (float, none_type): Stock awards for the person. Expressed in USD and raw units.. [optional]  # noqa: E501
            options_awards (float, none_type): Option Awards for the person. Expressed in USD and raw units.. [optional]  # noqa: E501
            other_compensation (float, none_type): All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units.. [optional]  # noqa: E501
            total_compensation (float, none_type): The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units.. [optional]  # noqa: E501
            non_equity_incentive_plan_comp (float, none_type): All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units.. [optional]  # noqa: E501
            non_qualified_comp_earnings (float, none_type): All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units.. [optional]  # noqa: E501
            compensation_year (str, none_type): The most recent year of compensation is expressed as 'YYYY' as opposed to 'YYYY-MM-DD' format.. [optional]  # noqa: E501
            request_id (str): Original identifier used for the request.. [optional]  # noqa: E501
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
        """CompanyCompensation - a model defined in OpenAPI

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
            name (str, none_type): FactSet Name of the person. [optional]  # noqa: E501
            person_id (str, none_type): Factset Entity Identifier for the Person. [optional]  # noqa: E501
            title (str, none_type): The requested Position Title. [optional]  # noqa: E501
            salary (float, none_type): Salary of the person. Expressed in USD and raw units.. [optional]  # noqa: E501
            bonus (float, none_type): Bonus of the executive during the fiscal year. Expressed in USD and raw units.. [optional]  # noqa: E501
            stock_awards (float, none_type): Stock awards for the person. Expressed in USD and raw units.. [optional]  # noqa: E501
            options_awards (float, none_type): Option Awards for the person. Expressed in USD and raw units.. [optional]  # noqa: E501
            other_compensation (float, none_type): All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units.. [optional]  # noqa: E501
            total_compensation (float, none_type): The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units.. [optional]  # noqa: E501
            non_equity_incentive_plan_comp (float, none_type): All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units.. [optional]  # noqa: E501
            non_qualified_comp_earnings (float, none_type): All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units.. [optional]  # noqa: E501
            compensation_year (str, none_type): The most recent year of compensation is expressed as 'YYYY' as opposed to 'YYYY-MM-DD' format.. [optional]  # noqa: E501
            request_id (str): Original identifier used for the request.. [optional]  # noqa: E501
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
