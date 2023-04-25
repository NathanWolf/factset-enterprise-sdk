"""
    FactSet Concordance API

       The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p>   # noqa: E501

    The version of the OpenAPI document: 2.6.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetConcordance.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetConcordance.exceptions import ApiAttributeError



class PeopleTaskStatus(ModelNormal):
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
        ('status',): {
            'None': None,
            'PENDING': "PENDING",
            'IN_PROGRESS': "IN_PROGRESS",
            'SUCCESS': "SUCCESS",
            'FAILURE': "FAILURE",
            'BAD_REQUEST': "BAD_REQUEST",
            'ABORTED': "ABORTED",
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
            'client_id_column': (str, none_type,),  # noqa: E501
            'decision_rate': (int, none_type,),  # noqa: E501
            'entity_column': (str, none_type,),  # noqa: E501
            'first_name_column': (str, none_type,),  # noqa: E501
            'has_result': (bool, none_type,),  # noqa: E501
            'input_count': (int, none_type,),  # noqa: E501
            'input_file': (str, none_type,),  # noqa: E501
            'last_name_column': (str, none_type,),  # noqa: E501
            'mapped_count': (int, none_type,),  # noqa: E501
            'unmapped_count': (int, none_type,),  # noqa: E501
            'try_count': (int, none_type,),  # noqa: E501
            'message': (str, none_type,),  # noqa: E501
            'middle_name_column': (str, none_type,),  # noqa: E501
            'person_name_column': (str, none_type,),  # noqa: E501
            'priority_column': (str, none_type,),  # noqa: E501
            'process_start_time': (datetime, none_type,),  # noqa: E501
            'process_duration': (float, none_type,),  # noqa: E501
            'error': (str, none_type,),  # noqa: E501
            'error_title': (str, none_type,),  # noqa: E501
            'indeterminate_count': (int, none_type,),  # noqa: E501
            'salutation_column': (str, none_type,),  # noqa: E501
            'status': (str, none_type,),  # noqa: E501
            'suffix_column': (str, none_type,),  # noqa: E501
            'task_action': (str, none_type,),  # noqa: E501
            'task_id': (int, none_type,),  # noqa: E501
            'task_name': (str, none_type,),  # noqa: E501
            'task_submit_time': (datetime, none_type,),  # noqa: E501
            'universe_id': (int, none_type,),  # noqa: E501
            'universe_name': (str, none_type,),  # noqa: E501
            'user_full_name': (str, none_type,),  # noqa: E501
            'user_serial': (str, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'client_id_column': 'clientIdColumn',  # noqa: E501
        'decision_rate': 'decisionRate',  # noqa: E501
        'entity_column': 'entityColumn',  # noqa: E501
        'first_name_column': 'firstNameColumn',  # noqa: E501
        'has_result': 'hasResult',  # noqa: E501
        'input_count': 'inputCount',  # noqa: E501
        'input_file': 'inputFile',  # noqa: E501
        'last_name_column': 'lastNameColumn',  # noqa: E501
        'mapped_count': 'mappedCount',  # noqa: E501
        'unmapped_count': 'unmappedCount',  # noqa: E501
        'try_count': 'tryCount',  # noqa: E501
        'message': 'message',  # noqa: E501
        'middle_name_column': 'middleNameColumn',  # noqa: E501
        'person_name_column': 'personNameColumn',  # noqa: E501
        'priority_column': 'priorityColumn',  # noqa: E501
        'process_start_time': 'processStartTime',  # noqa: E501
        'process_duration': 'processDuration',  # noqa: E501
        'error': 'error',  # noqa: E501
        'error_title': 'errorTitle',  # noqa: E501
        'indeterminate_count': 'indeterminateCount',  # noqa: E501
        'salutation_column': 'salutationColumn',  # noqa: E501
        'status': 'status',  # noqa: E501
        'suffix_column': 'suffixColumn',  # noqa: E501
        'task_action': 'taskAction',  # noqa: E501
        'task_id': 'taskId',  # noqa: E501
        'task_name': 'taskName',  # noqa: E501
        'task_submit_time': 'taskSubmitTime',  # noqa: E501
        'universe_id': 'universeId',  # noqa: E501
        'universe_name': 'universeName',  # noqa: E501
        'user_full_name': 'userFullName',  # noqa: E501
        'user_serial': 'userSerial',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """PeopleTaskStatus - a model defined in OpenAPI

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
            client_id_column (str, none_type): Name of the column in the input file that contains a unique identifier supplied by the user.. [optional]  # noqa: E501
            decision_rate (int, none_type): Percentage of mapped entities in the Input File.. [optional]  # noqa: E501
            entity_column (str, none_type): Name of the column of the entity. . [optional]  # noqa: E501
            first_name_column (str, none_type): Name of the column in the input file that contains the first name.. [optional]  # noqa: E501
            has_result (bool, none_type): Whether the result is available.. [optional]  # noqa: E501
            input_count (int, none_type): Number of records in the Input File.. [optional]  # noqa: E501
            input_file (str, none_type): The input file is posted as a file object in the form. . [optional]  # noqa: E501
            last_name_column (str, none_type): Name of the column in the input file that contains the first name. . [optional]  # noqa: E501
            mapped_count (int, none_type): Number of records with status of MAPPED the Input File.. [optional]  # noqa: E501
            unmapped_count (int, none_type): Number of records with status of UNMAPPED the Input File.. [optional]  # noqa: E501
            try_count (int, none_type): Number of tries made so far for the request.. [optional]  # noqa: E501
            message (str, none_type): Textual message for the status.. [optional]  # noqa: E501
            middle_name_column (str, none_type): Name of the column in the input file that contains the middle name. . [optional]  # noqa: E501
            person_name_column (str, none_type): Name of the column in the input file that contains the person name. . [optional]  # noqa: E501
            priority_column (str, none_type): Name of the column in the input file that contains the priority. . [optional]  # noqa: E501
            process_start_time (datetime, none_type): Process start time in UTC.. [optional]  # noqa: E501
            process_duration (float, none_type): Process duration in seconds.. [optional]  # noqa: E501
            error (str, none_type): [optional]  # noqa: E501
            error_title (str, none_type): [optional]  # noqa: E501
            indeterminate_count (int, none_type): Number of records with status of INDETERMINATE the Input File.. [optional]  # noqa: E501
            salutation_column (str, none_type): Name of the column in the input file that contains the person's salutation. . [optional]  # noqa: E501
            status (str, none_type): Status of the Concordance Task. If the value is \"SUCCESS\", you can move to the subsequent /entity-decisions endpoint to retrieve the results.. [optional]  # noqa: E501
            suffix_column (str, none_type): Name of the column in the input file that contains the person's suffix. . [optional]  # noqa: E501
            task_action (str, none_type): Action status for the Concordance Task process.. [optional]  # noqa: E501
            task_id (int, none_type): Identifier denoting a specific Concordance task submitted by the user.. [optional]  # noqa: E501
            task_name (str, none_type): User-defined name for the task used to name the output file.. [optional]  # noqa: E501
            task_submit_time (datetime, none_type): Time the Task was submitted in UTC.. [optional]  # noqa: E501
            universe_id (int, none_type): The universe identifier. [optional]  # noqa: E501
            universe_name (str, none_type): Full name of the person associated with the `userSerial`. . [optional]  # noqa: E501
            user_full_name (str, none_type): Full name of the person associated with the `userSerial`. . [optional]  # noqa: E501
            user_serial (str, none_type): user-serial of the person who initiated the entity task.. [optional]  # noqa: E501
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
        """PeopleTaskStatus - a model defined in OpenAPI

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
            client_id_column (str, none_type): Name of the column in the input file that contains a unique identifier supplied by the user.. [optional]  # noqa: E501
            decision_rate (int, none_type): Percentage of mapped entities in the Input File.. [optional]  # noqa: E501
            entity_column (str, none_type): Name of the column of the entity. . [optional]  # noqa: E501
            first_name_column (str, none_type): Name of the column in the input file that contains the first name.. [optional]  # noqa: E501
            has_result (bool, none_type): Whether the result is available.. [optional]  # noqa: E501
            input_count (int, none_type): Number of records in the Input File.. [optional]  # noqa: E501
            input_file (str, none_type): The input file is posted as a file object in the form. . [optional]  # noqa: E501
            last_name_column (str, none_type): Name of the column in the input file that contains the first name. . [optional]  # noqa: E501
            mapped_count (int, none_type): Number of records with status of MAPPED the Input File.. [optional]  # noqa: E501
            unmapped_count (int, none_type): Number of records with status of UNMAPPED the Input File.. [optional]  # noqa: E501
            try_count (int, none_type): Number of tries made so far for the request.. [optional]  # noqa: E501
            message (str, none_type): Textual message for the status.. [optional]  # noqa: E501
            middle_name_column (str, none_type): Name of the column in the input file that contains the middle name. . [optional]  # noqa: E501
            person_name_column (str, none_type): Name of the column in the input file that contains the person name. . [optional]  # noqa: E501
            priority_column (str, none_type): Name of the column in the input file that contains the priority. . [optional]  # noqa: E501
            process_start_time (datetime, none_type): Process start time in UTC.. [optional]  # noqa: E501
            process_duration (float, none_type): Process duration in seconds.. [optional]  # noqa: E501
            error (str, none_type): [optional]  # noqa: E501
            error_title (str, none_type): [optional]  # noqa: E501
            indeterminate_count (int, none_type): Number of records with status of INDETERMINATE the Input File.. [optional]  # noqa: E501
            salutation_column (str, none_type): Name of the column in the input file that contains the person's salutation. . [optional]  # noqa: E501
            status (str, none_type): Status of the Concordance Task. If the value is \"SUCCESS\", you can move to the subsequent /entity-decisions endpoint to retrieve the results.. [optional]  # noqa: E501
            suffix_column (str, none_type): Name of the column in the input file that contains the person's suffix. . [optional]  # noqa: E501
            task_action (str, none_type): Action status for the Concordance Task process.. [optional]  # noqa: E501
            task_id (int, none_type): Identifier denoting a specific Concordance task submitted by the user.. [optional]  # noqa: E501
            task_name (str, none_type): User-defined name for the task used to name the output file.. [optional]  # noqa: E501
            task_submit_time (datetime, none_type): Time the Task was submitted in UTC.. [optional]  # noqa: E501
            universe_id (int, none_type): The universe identifier. [optional]  # noqa: E501
            universe_name (str, none_type): Full name of the person associated with the `userSerial`. . [optional]  # noqa: E501
            user_full_name (str, none_type): Full name of the person associated with the `userSerial`. . [optional]  # noqa: E501
            user_serial (str, none_type): user-serial of the person who initiated the entity task.. [optional]  # noqa: E501
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
