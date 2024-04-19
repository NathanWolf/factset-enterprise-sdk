"""
    FactSet SCIM API

    FactSet's SCIM API implementation.  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.ProcuretoPayAPISCIM.model_utils import (  # noqa: F401
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
from fds.sdk.ProcuretoPayAPISCIM.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.ProcuretoPayAPISCIM.model.firm_description_resource_reference import FirmDescriptionResourceReference
    from fds.sdk.ProcuretoPayAPISCIM.model.location_resource_company_agreement_urls import LocationResourceCompanyAgreementUrls
    from fds.sdk.ProcuretoPayAPISCIM.model.location_resource_meta import LocationResourceMeta
    from fds.sdk.ProcuretoPayAPISCIM.model.location_resource_reference import LocationResourceReference
    globals()['FirmDescriptionResourceReference'] = FirmDescriptionResourceReference
    globals()['LocationResourceCompanyAgreementUrls'] = LocationResourceCompanyAgreementUrls
    globals()['LocationResourceMeta'] = LocationResourceMeta
    globals()['LocationResourceReference'] = LocationResourceReference


class LocationResource(ModelNormal):
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
            'name': (str,),  # noqa: E501
            'schemas': ([str],),  # noqa: E501
            'id': (str,),  # noqa: E501
            'external_id': (str,),  # noqa: E501
            'description': (str,),  # noqa: E501
            'address1': (str,),  # noqa: E501
            'address2': (str,),  # noqa: E501
            'address3': (str,),  # noqa: E501
            'locality': (str,),  # noqa: E501
            'region': (str,),  # noqa: E501
            'postal_code': (str,),  # noqa: E501
            'country': (str,),  # noqa: E501
            'phone_number': (str,),  # noqa: E501
            'firm_description': (bool, date, datetime, dict, float, int, list, str, none_type,),  # noqa: E501
            'email_domains': ([str],),  # noqa: E501
            'partner_asserted_entity_id': (str,),  # noqa: E501
            'company_agreement_urls': ([LocationResourceCompanyAgreementUrls],),  # noqa: E501
            'managed_locations': ([LocationResourceReference],),  # noqa: E501
            'managing_location': (bool, date, datetime, dict, float, int, list, str, none_type,),  # noqa: E501
            'main_location': (bool, date, datetime, dict, float, int, list, str, none_type,),  # noqa: E501
            'usernames': ([str],),  # noqa: E501
            'meta': (LocationResourceMeta,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'name': 'name',  # noqa: E501
        'schemas': 'schemas',  # noqa: E501
        'id': 'id',  # noqa: E501
        'external_id': 'externalId',  # noqa: E501
        'description': 'description',  # noqa: E501
        'address1': 'address1',  # noqa: E501
        'address2': 'address2',  # noqa: E501
        'address3': 'address3',  # noqa: E501
        'locality': 'locality',  # noqa: E501
        'region': 'region',  # noqa: E501
        'postal_code': 'postalCode',  # noqa: E501
        'country': 'country',  # noqa: E501
        'phone_number': 'phoneNumber',  # noqa: E501
        'firm_description': 'firmDescription',  # noqa: E501
        'email_domains': 'emailDomains',  # noqa: E501
        'partner_asserted_entity_id': 'partnerAssertedEntityId',  # noqa: E501
        'company_agreement_urls': 'companyAgreementUrls',  # noqa: E501
        'managed_locations': 'managedLocations',  # noqa: E501
        'managing_location': 'managingLocation',  # noqa: E501
        'main_location': 'mainLocation',  # noqa: E501
        'usernames': 'usernames',  # noqa: E501
        'meta': 'meta',  # noqa: E501
    }

    read_only_vars = {
        'id',  # noqa: E501
        'phone_number',  # noqa: E501
        'usernames',  # noqa: E501
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, name, *args, **kwargs):  # noqa: E501
        """LocationResource - a model defined in OpenAPI

        Args:
            name (str): Name of the location.

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
            schemas ([str]): [optional]  # noqa: E501
            id (str): [optional]  # noqa: E501
            external_id (str): An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client's FactSet username.. [optional]  # noqa: E501
            description (str): Description of the location.. [optional]  # noqa: E501
            address1 (str): First line of location's address.. [optional]  # noqa: E501
            address2 (str): Second line of location's address.. [optional]  # noqa: E501
            address3 (str): Third line of location's address.. [optional]  # noqa: E501
            locality (str): City of location.. [optional]  # noqa: E501
            region (str): State or province of location.. [optional]  # noqa: E501
            postal_code (str): Postal code of location.. [optional]  # noqa: E501
            country (str): Country of location.. [optional]  # noqa: E501
            phone_number (str): Phone number of location.. [optional]  # noqa: E501
            firm_description (bool, date, datetime, dict, float, int, list, str, none_type): [optional]  # noqa: E501
            email_domains ([str]): The domain names that are valid for use with email addresses associated with users in this location.. [optional]  # noqa: E501
            partner_asserted_entity_id (str): Identifier assigned to the Corporate Entity. Value is provided as \"fsymEntityId\" from FactSet's Symbology API.. [optional]  # noqa: E501
            company_agreement_urls ([LocationResourceCompanyAgreementUrls]): Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.. [optional]  # noqa: E501
            managed_locations ([LocationResourceReference]): Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.. [optional]  # noqa: E501
            managing_location (bool, date, datetime, dict, float, int, list, str, none_type): FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated.. [optional]  # noqa: E501
            main_location (bool, date, datetime, dict, float, int, list, str, none_type): The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet's CRM systems.. [optional]  # noqa: E501
            usernames ([str]): The FactSet usernames that are valid for users in this location.. [optional]  # noqa: E501
            meta (LocationResourceMeta): [optional]  # noqa: E501
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

        self.name = name
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
    def __init__(self, name, *args, **kwargs):  # noqa: E501
        """LocationResource - a model defined in OpenAPI

        Args:
            name (str): Name of the location.

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
            schemas ([str]): [optional]  # noqa: E501
            id (str): [optional]  # noqa: E501
            external_id (str): An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client's FactSet username.. [optional]  # noqa: E501
            description (str): Description of the location.. [optional]  # noqa: E501
            address1 (str): First line of location's address.. [optional]  # noqa: E501
            address2 (str): Second line of location's address.. [optional]  # noqa: E501
            address3 (str): Third line of location's address.. [optional]  # noqa: E501
            locality (str): City of location.. [optional]  # noqa: E501
            region (str): State or province of location.. [optional]  # noqa: E501
            postal_code (str): Postal code of location.. [optional]  # noqa: E501
            country (str): Country of location.. [optional]  # noqa: E501
            phone_number (str): Phone number of location.. [optional]  # noqa: E501
            firm_description (bool, date, datetime, dict, float, int, list, str, none_type): [optional]  # noqa: E501
            email_domains ([str]): The domain names that are valid for use with email addresses associated with users in this location.. [optional]  # noqa: E501
            partner_asserted_entity_id (str): Identifier assigned to the Corporate Entity. Value is provided as \"fsymEntityId\" from FactSet's Symbology API.. [optional]  # noqa: E501
            company_agreement_urls ([LocationResourceCompanyAgreementUrls]): Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.. [optional]  # noqa: E501
            managed_locations ([LocationResourceReference]): Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.. [optional]  # noqa: E501
            managing_location (bool, date, datetime, dict, float, int, list, str, none_type): FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated.. [optional]  # noqa: E501
            main_location (bool, date, datetime, dict, float, int, list, str, none_type): The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet's CRM systems.. [optional]  # noqa: E501
            usernames ([str]): The FactSet usernames that are valid for users in this location.. [optional]  # noqa: E501
            meta (LocationResourceMeta): [optional]  # noqa: E501
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

        self.name = name
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
