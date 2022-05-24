"""
    IRN API v1

    Allows users to extract, create, update and configure IRN data.  # noqa: E501

    The version of the OpenAPI document: 1
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.IRNNotes.model_utils import (  # noqa: F401
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
from fds.sdk.IRNNotes.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.IRNNotes.model.create_body_dto import CreateBodyDto
    from fds.sdk.IRNNotes.model.create_custom_field_value_dto import CreateCustomFieldValueDto
    from fds.sdk.IRNNotes.model.related_records_dto import RelatedRecordsDto
    from fds.sdk.IRNNotes.model.user_serial_dto import UserSerialDto
    globals()['CreateBodyDto'] = CreateBodyDto
    globals()['CreateCustomFieldValueDto'] = CreateCustomFieldValueDto
    globals()['RelatedRecordsDto'] = RelatedRecordsDto
    globals()['UserSerialDto'] = UserSerialDto


class CreateNoteDto(ModelNormal):
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
        ('title',): {
            'max_length': 255,
            'min_length': 0,
        },
        ('link',): {
            'max_length': 255,
            'min_length': 0,
        },
        ('related_symbols',): {
            'max_items': 100,
        },
    }

    additional_properties_type = None

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
            'author': (UserSerialDto,),  # noqa: E501
            'date': (str,),  # noqa: E501
            'title': (str, none_type,),  # noqa: E501
            'identifier': (str, none_type,),  # noqa: E501
            'subject_id': (str, none_type,),  # noqa: E501
            'recommendation_id': (str, none_type,),  # noqa: E501
            'sentiment_id': (str, none_type,),  # noqa: E501
            'body': (CreateBodyDto,),  # noqa: E501
            'source': (str, none_type,),  # noqa: E501
            'link': (str, none_type,),  # noqa: E501
            'related_symbols': ([str], none_type,),  # noqa: E501
            'related_contacts': ([str], none_type,),  # noqa: E501
            'related_records': (RelatedRecordsDto,),  # noqa: E501
            'custom_field_values': ([CreateCustomFieldValueDto], none_type,),  # noqa: E501
            'is_personal': (bool,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'author': 'Author',  # noqa: E501
        'date': 'Date',  # noqa: E501
        'title': 'Title',  # noqa: E501
        'identifier': 'Identifier',  # noqa: E501
        'subject_id': 'SubjectId',  # noqa: E501
        'recommendation_id': 'RecommendationId',  # noqa: E501
        'sentiment_id': 'SentimentId',  # noqa: E501
        'body': 'Body',  # noqa: E501
        'source': 'Source',  # noqa: E501
        'link': 'Link',  # noqa: E501
        'related_symbols': 'RelatedSymbols',  # noqa: E501
        'related_contacts': 'RelatedContacts',  # noqa: E501
        'related_records': 'RelatedRecords',  # noqa: E501
        'custom_field_values': 'CustomFieldValues',  # noqa: E501
        'is_personal': 'IsPersonal',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, author, date, *args, **kwargs):  # noqa: E501
        """CreateNoteDto - a model defined in OpenAPI

        Args:
            author (UserSerialDto):
            date (str):

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
            title (str, none_type): [optional]  # noqa: E501
            identifier (str, none_type): [optional]  # noqa: E501
            subject_id (str, none_type): [optional]  # noqa: E501
            recommendation_id (str, none_type): [optional]  # noqa: E501
            sentiment_id (str, none_type): [optional]  # noqa: E501
            body (CreateBodyDto): [optional]  # noqa: E501
            source (str, none_type): [optional]  # noqa: E501
            link (str, none_type): [optional]  # noqa: E501
            related_symbols ([str], none_type): [optional]  # noqa: E501
            related_contacts ([str], none_type): [optional]  # noqa: E501
            related_records (RelatedRecordsDto): [optional]  # noqa: E501
            custom_field_values ([CreateCustomFieldValueDto], none_type): [optional]  # noqa: E501
            is_personal (bool): [optional] if omitted the server will use the default value of False  # noqa: E501
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

        self.author = author
        self.date = date
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
    def __init__(self, author, date, *args, **kwargs):  # noqa: E501
        """CreateNoteDto - a model defined in OpenAPI

        Args:
            author (UserSerialDto):
            date (str):

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
            title (str, none_type): [optional]  # noqa: E501
            identifier (str, none_type): [optional]  # noqa: E501
            subject_id (str, none_type): [optional]  # noqa: E501
            recommendation_id (str, none_type): [optional]  # noqa: E501
            sentiment_id (str, none_type): [optional]  # noqa: E501
            body (CreateBodyDto): [optional]  # noqa: E501
            source (str, none_type): [optional]  # noqa: E501
            link (str, none_type): [optional]  # noqa: E501
            related_symbols ([str], none_type): [optional]  # noqa: E501
            related_contacts ([str], none_type): [optional]  # noqa: E501
            related_records (RelatedRecordsDto): [optional]  # noqa: E501
            custom_field_values ([CreateCustomFieldValueDto], none_type): [optional]  # noqa: E501
            is_personal (bool): [optional] if omitted the server will use the default value of False  # noqa: E501
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

        self.author = author
        self.date = date
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
