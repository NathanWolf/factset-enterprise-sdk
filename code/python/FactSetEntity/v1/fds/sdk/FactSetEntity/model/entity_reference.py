"""
    FactSet Entity API

    Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.   # noqa: E501

    The version of the OpenAPI document: 1.4.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetEntity.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetEntity.exceptions import ApiAttributeError



class EntityReference(ModelNormal):
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
            'fsym_id': (str, none_type,),  # noqa: E501
            'entity_proper_name': (str, none_type,),  # noqa: E501
            'fsym_entity_id': (str, none_type,),  # noqa: E501
            'ultimate_parent_id': (str, none_type,),  # noqa: E501
            'ultimate_parent_name': (str, none_type,),  # noqa: E501
            'credit_parent_id': (str, none_type,),  # noqa: E501
            'parent_equity_id': (str, none_type,),  # noqa: E501
            'private_entity_flag': (int, none_type,),  # noqa: E501
            'public_entity_flag': (int, none_type,),  # noqa: E501
            'security_type': (str, none_type,),  # noqa: E501
            'website': (str, none_type,),  # noqa: E501
            'incorporation_date': (date, none_type,),  # noqa: E501
            'country_of_risk': (str, none_type,),  # noqa: E501
            'incorporation_country': (str, none_type,),  # noqa: E501
            'business_description': (str, none_type,),  # noqa: E501
            'phone': (str, none_type,),  # noqa: E501
            'headquarters_street': (str, none_type,),  # noqa: E501
            'headquarters_city': (str, none_type,),  # noqa: E501
            'headquarters_state': (str, none_type,),  # noqa: E501
            'headquarters_zip': (str, none_type,),  # noqa: E501
            'headquarters_country': (str, none_type,),  # noqa: E501
            'email_ir': (str, none_type,),  # noqa: E501
            'website_ir': (str, none_type,),  # noqa: E501
            'request_id': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'fsym_id': 'fsymId',  # noqa: E501
        'entity_proper_name': 'entityProperName',  # noqa: E501
        'fsym_entity_id': 'fsymEntityId',  # noqa: E501
        'ultimate_parent_id': 'ultimateParentId',  # noqa: E501
        'ultimate_parent_name': 'ultimateParentName',  # noqa: E501
        'credit_parent_id': 'creditParentId',  # noqa: E501
        'parent_equity_id': 'parentEquityId',  # noqa: E501
        'private_entity_flag': 'privateEntityFlag',  # noqa: E501
        'public_entity_flag': 'publicEntityFlag',  # noqa: E501
        'security_type': 'securityType',  # noqa: E501
        'website': 'website',  # noqa: E501
        'incorporation_date': 'incorporationDate',  # noqa: E501
        'country_of_risk': 'countryOfRisk',  # noqa: E501
        'incorporation_country': 'incorporationCountry',  # noqa: E501
        'business_description': 'businessDescription',  # noqa: E501
        'phone': 'phone',  # noqa: E501
        'headquarters_street': 'headquartersStreet',  # noqa: E501
        'headquarters_city': 'headquartersCity',  # noqa: E501
        'headquarters_state': 'headquartersState',  # noqa: E501
        'headquarters_zip': 'headquartersZip',  # noqa: E501
        'headquarters_country': 'headquartersCountry',  # noqa: E501
        'email_ir': 'emailIR',  # noqa: E501
        'website_ir': 'websiteIR',  # noqa: E501
        'request_id': 'requestId',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """EntityReference - a model defined in OpenAPI

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
            fsym_id (str, none_type): Unique FactSet-generated identifier representing an entity for the current entity identifier (-E). [optional]  # noqa: E501
            entity_proper_name (str, none_type): Name that the entity is commonly referred to as, normalized and in proper case.. [optional]  # noqa: E501
            fsym_entity_id (str, none_type): Unique FactSet-generated identifier representing an entity. [optional]  # noqa: E501
            ultimate_parent_id (str, none_type): The ultimate parent id of the entity.. [optional]  # noqa: E501
            ultimate_parent_name (str, none_type): Name that the ultimate parent entity is commonly referred to as, normalized and in proper case.\". [optional]  # noqa: E501
            credit_parent_id (str, none_type): The credit parent id in which issues debt instruments. The credit parent differs from the ultimate parent if the ultimate parent does not inherit the credit risk associated with an issuer's debt offerings. Credit Parent's are not Assigned to the Extinct Issues, Governments, Asset-Backed Securities, Trusts, Foundations, Private Equity, Venture Capital, Hedge Funds, or Mutual Funds. FactSet assigns credit parents based on the following methodology - * If an issuer (entity A) is considered a direct subsidiary of another entity (entity B), where the parent entity (entity B) has a 100% controlling interest in the issuer (entity A), then the parent entity (entity B) is considered the credit parent. * If an operating business is purchased as a portfolio company/operating company (entity A) by a group of private equity firms that establish a holding company (entity B) structure to reflect the collective ownership, and the portfolio company/operating company (entity A) issues debt as part of acquisition financing, then the portfolio company/operating company (entity A) is deemed to be the credit parent, not the holding company (entity B). * An issuer must have active debt. . [optional]  # noqa: E501
            parent_equity_id (str, none_type): The regional parent equity listing id.. [optional]  # noqa: E501
            private_entity_flag (int, none_type): Returns 1 if the entity is a Private Company, otherwise, 0.. [optional]  # noqa: E501
            public_entity_flag (int, none_type): Returns 1 if the entity is a Public Company, otherwise, 0.. [optional]  # noqa: E501
            security_type (str, none_type): Security type of the identifier, For descriptions of the each security type, visit [OA 15776](https://my.apps.factset.com/oa/pages/15776). [optional]  # noqa: E501
            website (str, none_type): Web page address for the entity. [optional]  # noqa: E501
            incorporation_date (date, none_type): Year the entity was incorporated in YYYY-MM-DD format.. [optional]  # noqa: E501
            country_of_risk (str, none_type): Entity's Country of Risk. FactSet has a determined methodology for assigning a country of risk to public and private entities, based on the following - * Country of Headquarters * Country of Incorporation * Country of Primary Exchange (the country where most liquid equity listings trade) . [optional]  # noqa: E501
            incorporation_country (str, none_type): ISO Country code where the entity is incorporated. [optional]  # noqa: E501
            business_description (str, none_type): Extended business description for the requested entity.. [optional]  # noqa: E501
            phone (str, none_type): The entity's international phone number.. [optional]  # noqa: E501
            headquarters_street (str, none_type): The entity's headquarters street address.. [optional]  # noqa: E501
            headquarters_city (str, none_type): The entity's headquarters street address.. [optional]  # noqa: E501
            headquarters_state (str, none_type): Abbreviated State of company headquarters.. [optional]  # noqa: E501
            headquarters_zip (str, none_type): Zip/Postal Code for entity's headquarters.. [optional]  # noqa: E501
            headquarters_country (str, none_type): Abbreviated (ISO) Country of headquarters.. [optional]  # noqa: E501
            email_ir (str, none_type): Email Address of the Investor Relations Contact. [optional]  # noqa: E501
            website_ir (str, none_type): Website or Page for the Entity's Investor Relations team.. [optional]  # noqa: E501
            request_id (str): Identifier used in \"ids\" parameter.  When list of identifiers used, they will be parsed and resolved individually.. [optional]  # noqa: E501
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
        """EntityReference - a model defined in OpenAPI

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
            fsym_id (str, none_type): Unique FactSet-generated identifier representing an entity for the current entity identifier (-E). [optional]  # noqa: E501
            entity_proper_name (str, none_type): Name that the entity is commonly referred to as, normalized and in proper case.. [optional]  # noqa: E501
            fsym_entity_id (str, none_type): Unique FactSet-generated identifier representing an entity. [optional]  # noqa: E501
            ultimate_parent_id (str, none_type): The ultimate parent id of the entity.. [optional]  # noqa: E501
            ultimate_parent_name (str, none_type): Name that the ultimate parent entity is commonly referred to as, normalized and in proper case.\". [optional]  # noqa: E501
            credit_parent_id (str, none_type): The credit parent id in which issues debt instruments. The credit parent differs from the ultimate parent if the ultimate parent does not inherit the credit risk associated with an issuer's debt offerings. Credit Parent's are not Assigned to the Extinct Issues, Governments, Asset-Backed Securities, Trusts, Foundations, Private Equity, Venture Capital, Hedge Funds, or Mutual Funds. FactSet assigns credit parents based on the following methodology - * If an issuer (entity A) is considered a direct subsidiary of another entity (entity B), where the parent entity (entity B) has a 100% controlling interest in the issuer (entity A), then the parent entity (entity B) is considered the credit parent. * If an operating business is purchased as a portfolio company/operating company (entity A) by a group of private equity firms that establish a holding company (entity B) structure to reflect the collective ownership, and the portfolio company/operating company (entity A) issues debt as part of acquisition financing, then the portfolio company/operating company (entity A) is deemed to be the credit parent, not the holding company (entity B). * An issuer must have active debt. . [optional]  # noqa: E501
            parent_equity_id (str, none_type): The regional parent equity listing id.. [optional]  # noqa: E501
            private_entity_flag (int, none_type): Returns 1 if the entity is a Private Company, otherwise, 0.. [optional]  # noqa: E501
            public_entity_flag (int, none_type): Returns 1 if the entity is a Public Company, otherwise, 0.. [optional]  # noqa: E501
            security_type (str, none_type): Security type of the identifier, For descriptions of the each security type, visit [OA 15776](https://my.apps.factset.com/oa/pages/15776). [optional]  # noqa: E501
            website (str, none_type): Web page address for the entity. [optional]  # noqa: E501
            incorporation_date (date, none_type): Year the entity was incorporated in YYYY-MM-DD format.. [optional]  # noqa: E501
            country_of_risk (str, none_type): Entity's Country of Risk. FactSet has a determined methodology for assigning a country of risk to public and private entities, based on the following - * Country of Headquarters * Country of Incorporation * Country of Primary Exchange (the country where most liquid equity listings trade) . [optional]  # noqa: E501
            incorporation_country (str, none_type): ISO Country code where the entity is incorporated. [optional]  # noqa: E501
            business_description (str, none_type): Extended business description for the requested entity.. [optional]  # noqa: E501
            phone (str, none_type): The entity's international phone number.. [optional]  # noqa: E501
            headquarters_street (str, none_type): The entity's headquarters street address.. [optional]  # noqa: E501
            headquarters_city (str, none_type): The entity's headquarters street address.. [optional]  # noqa: E501
            headquarters_state (str, none_type): Abbreviated State of company headquarters.. [optional]  # noqa: E501
            headquarters_zip (str, none_type): Zip/Postal Code for entity's headquarters.. [optional]  # noqa: E501
            headquarters_country (str, none_type): Abbreviated (ISO) Country of headquarters.. [optional]  # noqa: E501
            email_ir (str, none_type): Email Address of the Investor Relations Contact. [optional]  # noqa: E501
            website_ir (str, none_type): Website or Page for the Entity's Investor Relations team.. [optional]  # noqa: E501
            request_id (str): Identifier used in \"ids\" parameter.  When list of identifiers used, they will be parsed and resolved individually.. [optional]  # noqa: E501
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
