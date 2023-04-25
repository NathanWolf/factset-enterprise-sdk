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



class PeopleMatch(ModelNormal):
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
        ('map_status',): {
            'None': None,
            'MAPPED': "MAPPED",
            'UNMAPPED': "UNMAPPED",
            'INDETERMINATE': "INDETERMINATE",
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
            'task_id': (int, none_type,),  # noqa: E501
            'active_role': (str, none_type,),  # noqa: E501
            'client_entity': (str, none_type,),  # noqa: E501
            'client_first_name': (str, none_type,),  # noqa: E501
            'client_last_name': (str, none_type,),  # noqa: E501
            'client_middle_name': (str, none_type,),  # noqa: E501
            'client_salutation': (str, none_type,),  # noqa: E501
            'client_suffix': (str, none_type,),  # noqa: E501
            'client_priority': (str, none_type,),  # noqa: E501
            'client_person_name': (str, none_type,),  # noqa: E501
            'first_name': (str, none_type,),  # noqa: E501
            'person_id': (str, none_type,),  # noqa: E501
            'last_name': (str, none_type,),  # noqa: E501
            'middle_name': (str, none_type,),  # noqa: E501
            'suffix': (str, none_type,),  # noqa: E501
            'salutation': (str, none_type,),  # noqa: E501
            'person_name': (str, none_type,),  # noqa: E501
            'email': (str, none_type,),  # noqa: E501
            'client_id': (str, none_type,),  # noqa: E501
            'entity': (str, none_type,),  # noqa: E501
            'map_status': (str, none_type,),  # noqa: E501
            'match_flag': (str, none_type,),  # noqa: E501
            'name_match_source': (str, none_type,),  # noqa: E501
            'name_match_string': (str, none_type,),  # noqa: E501
            'row_index': (int, none_type,),  # noqa: E501
            'similarity_score': (float, none_type,),  # noqa: E501
            'title': (str, none_type,),  # noqa: E501
            'universe_id': (int, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'task_id': 'taskId',  # noqa: E501
        'active_role': 'activeRole',  # noqa: E501
        'client_entity': 'clientEntity',  # noqa: E501
        'client_first_name': 'clientFirstName',  # noqa: E501
        'client_last_name': 'clientLastName',  # noqa: E501
        'client_middle_name': 'clientMiddleName',  # noqa: E501
        'client_salutation': 'clientSalutation',  # noqa: E501
        'client_suffix': 'clientSuffix',  # noqa: E501
        'client_priority': 'clientPriority',  # noqa: E501
        'client_person_name': 'clientPersonName',  # noqa: E501
        'first_name': 'firstName',  # noqa: E501
        'person_id': 'personId',  # noqa: E501
        'last_name': 'lastName',  # noqa: E501
        'middle_name': 'middleName',  # noqa: E501
        'suffix': 'suffix',  # noqa: E501
        'salutation': 'salutation',  # noqa: E501
        'person_name': 'personName',  # noqa: E501
        'email': 'email',  # noqa: E501
        'client_id': 'clientId',  # noqa: E501
        'entity': 'entity',  # noqa: E501
        'map_status': 'mapStatus',  # noqa: E501
        'match_flag': 'matchFlag',  # noqa: E501
        'name_match_source': 'nameMatchSource',  # noqa: E501
        'name_match_string': 'nameMatchString',  # noqa: E501
        'row_index': 'rowIndex',  # noqa: E501
        'similarity_score': 'similarityScore',  # noqa: E501
        'title': 'title',  # noqa: E501
        'universe_id': 'universeId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """PeopleMatch - a model defined in OpenAPI

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
            task_id (int, none_type): Identifier denoting a specific Concordance task submitted by the user. This value will be null for /people-match endpoint responses and is only available when using the \"Bulk\" workflow. . [optional]  # noqa: E501
            active_role (str, none_type): This tells whether the person is now active in the entity. [optional]  # noqa: E501
            client_entity (str, none_type): The entity for which the person is working. . [optional]  # noqa: E501
            client_first_name (str, none_type): First Name provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_last_name (str, none_type): Last Name provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_middle_name (str, none_type): Middle Name provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_salutation (str, none_type): Salutation provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_suffix (str, none_type): Suffix provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_priority (str, none_type): Priority provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_person_name (str, none_type): The person name as provided in request.. [optional]  # noqa: E501
            first_name (str, none_type): The first name of the client.. [optional]  # noqa: E501
            person_id (str, none_type): The id of the person.. [optional]  # noqa: E501
            last_name (str, none_type): The last name of the person.. [optional]  # noqa: E501
            middle_name (str, none_type): The middle name of the client.. [optional]  # noqa: E501
            suffix (str, none_type): The suffix in the name of the person. [optional]  # noqa: E501
            salutation (str, none_type): Title of a person's name. [optional]  # noqa: E501
            person_name (str, none_type): Full name of the person matched. [optional]  # noqa: E501
            email (str, none_type): Email of the person. [optional]  # noqa: E501
            client_id (str, none_type): User defined person id provided when matched with FactSet person.. [optional]  # noqa: E501
            entity (str, none_type): Full name corresponding to the matched entity.. [optional]  # noqa: E501
            map_status (str, none_type): Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. . [optional]  # noqa: E501
            match_flag (str, none_type): Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. . [optional]  # noqa: E501
            name_match_source (str, none_type): Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. . [optional]  # noqa: E501
            name_match_string (str, none_type): String on which the Concordance algorithm mapped the submitted entity.. [optional]  # noqa: E501
            row_index (int, none_type): Country name corresponding to the location of the matched entity. [optional]  # noqa: E501
            similarity_score (float, none_type): Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. . [optional]  # noqa: E501
            title (str, none_type): The title that the person is holding.. [optional]  # noqa: E501
            universe_id (int, none_type): The universe identifier. [optional]  # noqa: E501
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
        """PeopleMatch - a model defined in OpenAPI

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
            task_id (int, none_type): Identifier denoting a specific Concordance task submitted by the user. This value will be null for /people-match endpoint responses and is only available when using the \"Bulk\" workflow. . [optional]  # noqa: E501
            active_role (str, none_type): This tells whether the person is now active in the entity. [optional]  # noqa: E501
            client_entity (str, none_type): The entity for which the person is working. . [optional]  # noqa: E501
            client_first_name (str, none_type): First Name provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_last_name (str, none_type): Last Name provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_middle_name (str, none_type): Middle Name provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_salutation (str, none_type): Salutation provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_suffix (str, none_type): Suffix provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_priority (str, none_type): Priority provided in the input file which is used in the `people-task` endpoint. [optional]  # noqa: E501
            client_person_name (str, none_type): The person name as provided in request.. [optional]  # noqa: E501
            first_name (str, none_type): The first name of the client.. [optional]  # noqa: E501
            person_id (str, none_type): The id of the person.. [optional]  # noqa: E501
            last_name (str, none_type): The last name of the person.. [optional]  # noqa: E501
            middle_name (str, none_type): The middle name of the client.. [optional]  # noqa: E501
            suffix (str, none_type): The suffix in the name of the person. [optional]  # noqa: E501
            salutation (str, none_type): Title of a person's name. [optional]  # noqa: E501
            person_name (str, none_type): Full name of the person matched. [optional]  # noqa: E501
            email (str, none_type): Email of the person. [optional]  # noqa: E501
            client_id (str, none_type): User defined person id provided when matched with FactSet person.. [optional]  # noqa: E501
            entity (str, none_type): Full name corresponding to the matched entity.. [optional]  # noqa: E501
            map_status (str, none_type): Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. . [optional]  # noqa: E501
            match_flag (str, none_type): Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. . [optional]  # noqa: E501
            name_match_source (str, none_type): Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. . [optional]  # noqa: E501
            name_match_string (str, none_type): String on which the Concordance algorithm mapped the submitted entity.. [optional]  # noqa: E501
            row_index (int, none_type): Country name corresponding to the location of the matched entity. [optional]  # noqa: E501
            similarity_score (float, none_type): Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. . [optional]  # noqa: E501
            title (str, none_type): The title that the person is holding.. [optional]  # noqa: E501
            universe_id (int, none_type): The universe identifier. [optional]  # noqa: E501
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
