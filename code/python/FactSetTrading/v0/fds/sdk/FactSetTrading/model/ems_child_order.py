"""
    EMS API

    Allow clients to trade orders.  # noqa: E501

    The version of the OpenAPI document: 0.3.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from fds.sdk.FactSetTrading.model_utils import (  # noqa: F401
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
from fds.sdk.FactSetTrading.exceptions import ApiAttributeError


def lazy_import():
    from fds.sdk.FactSetTrading.model.parent_id import ParentId
    from fds.sdk.FactSetTrading.model.time_in_force import TimeInForce
    globals()['ParentId'] = ParentId
    globals()['TimeInForce'] = TimeInForce


class EMSChildOrder(ModelNormal):
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
        ('order_type',): {
            'MARKET': "market",
            'LIMIT': "limit",
            'STOP': "stop",
            'STOPLIMIT': "stopLimit",
            'MARKETONCLOSE': "marketOnClose",
            'LIMITORBETTER': "limitOrBetter",
        },
        ('side',): {
            'None': None,
            'BUY': "buy",
            'SELL': "sell",
            'BUYMINUS': "buyMinus",
            'SELLPLUS': "sellPlus",
            'SELLSHORT': "sellShort",
            'SELLSHORTEXEMPT': "sellShortExempt",
        },
        ('handling_instructions',): {
            'None': None,
            'AUTOORDERPRIVATE': "autoOrderPrivate",
            'AUTOORDERPUBLIC': "autoOrderPublic",
            'BESTEXECUTION': "bestExecution",
        },
        ('settlement_type',): {
            'None': None,
            'REGULAR': "regular",
            'CASH': "cash",
            'NEXTDAY': "nextDay",
            'TPLUS2': "tPlus2",
            'TPLUS3': "tPlus3",
            'TPLUS4': "tPlus4",
            'FUTURE': "future",
            'WHENISSUED': "whenIssued",
            'SELLERSOPTION': "sellersOption",
            'TPLUS5': "tPlus5",
        },
        ('execution_instructions',): {
            'None': None,
            'NOTHELD': "notHeld",
            'WORK': "work",
            'GOALONG': "goAlong",
            'OVERTHEDAY': "overTheDay",
            'HELD': "held",
            'PARTICIPATEDONOTINITIATE': "participateDoNotInitiate",
            'STRICTSCALE': "strictScale",
            'TRYTOSCALE': "tryToScale",
            'STAYONBIDSIDE': "stayOnBidSide",
            'STAYONOFFERSIDE': "stayOnOfferSide",
            'NOCROSS': "noCross",
            'OKTOCROSS': "okToCross",
            'CALLFIRST': "callFirst",
            'PERCENTOFVOLUME': "percentOfVolume",
            'DONOTINCREASE': "doNotIncrease",
            'DONOTREDUCE': "doNotReduce",
            'ALLORNONE': "allOrNone",
            'REINSTATEONSYSTEMFAILURE': "reinstateOnSystemFailure",
            'INSTITUTIONSONLY': "institutionsOnly",
            'REINSTATEONTRADINGHALT': "reinstateOnTradingHalt",
            'CANCELONTRADINGHALT': "cancelOnTradingHalt",
            'LASTPEG': "lastPeg",
            'MIDPRICEPEG': "midPricePeg",
            'NONNEGOTIABLE': "nonNegotiable",
            'OPENINGPEG': "openingPeg",
            'MARKETPEG': "marketPeg",
            'CANCELONSYSTEMFAILURE': "cancelOnSystemFailure",
            'PRIMARYPEG': "primaryPeg",
            'SUSPEND': "suspend",
            'FIXEDPEGTOLOCALBESTBID': "fixedPegToLocalBestBid",
            'CUSTOMERDISPLAYINSTRUCTION': "customerDisplayInstruction",
            'NETTING': "netting",
            'PEGTOVWAP': "pegToVWAP",
            'TRADEALONG': "tradeAlong",
            'TRYTOSTOP': "tryToStop",
            'CANCELIFNOTBEST': "cancelIfNotBest",
            'TRAILINGSTOPPEG': "trailingStopPeg",
            'STRICTLIMIT': "strictLimit",
            'IGNOREPRICEVALIDITYCHECKS': "ignorePriceValidityChecks",
            'PEGTOLIMITPRICE': "pegToLimitPrice",
            'WORKTOTARGETSTRATEGY': "workToTargetStrategy",
            'INTERMARKETSWEEP': "intermarketSweep",
            'EXTERNALROUTINGALLOWED': "externalRoutingAllowed",
            'EXTERNALROUTINGNOTALLOWED': "externalRoutingNotAllowed",
            'IMBALANCEONLY': "imbalanceOnly",
            'SINGLEEXECUTIONREQUESTEDFORBLOCKTRADE': "singleExecutionRequestedForBlockTrade",
            'BESTEXECUTION': "bestExecution",
        },
    }

    validations = {
        ('order_quantity',): {
            'inclusive_minimum': 0,
        },
        ('text',): {
            'max_length': 250,
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
            'parent_id': (ParentId,),  # noqa: E501
            'order_type': (str,),  # noqa: E501
            'order_quantity': (float,),  # noqa: E501
            'destination': (str,),  # noqa: E501
            'side': (str, none_type,),  # noqa: E501
            'price': (float, none_type,),  # noqa: E501
            'time_in_force': (TimeInForce,),  # noqa: E501
            'handling_instructions': (str, none_type,),  # noqa: E501
            'ex_destination': (str, none_type,),  # noqa: E501
            'stop_price': (float, none_type,),  # noqa: E501
            'max_floor': (float, none_type,),  # noqa: E501
            'min_quantity': (float, none_type,),  # noqa: E501
            'settlement_type': (str, none_type,),  # noqa: E501
            'settlement_date': (str, none_type,),  # noqa: E501
            'execution_instructions': (str, none_type,),  # noqa: E501
            'locate_required': (bool, none_type,),  # noqa: E501
            'text': (str, none_type,),  # noqa: E501
            'profile': (str, none_type,),  # noqa: E501
            'user_defined_fields': ({str: (str,)}, none_type,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'parent_id': 'parentId',  # noqa: E501
        'order_type': 'orderType',  # noqa: E501
        'order_quantity': 'orderQuantity',  # noqa: E501
        'destination': 'destination',  # noqa: E501
        'side': 'side',  # noqa: E501
        'price': 'price',  # noqa: E501
        'time_in_force': 'timeInForce',  # noqa: E501
        'handling_instructions': 'handlingInstructions',  # noqa: E501
        'ex_destination': 'exDestination',  # noqa: E501
        'stop_price': 'stopPrice',  # noqa: E501
        'max_floor': 'maxFloor',  # noqa: E501
        'min_quantity': 'minQuantity',  # noqa: E501
        'settlement_type': 'settlementType',  # noqa: E501
        'settlement_date': 'settlementDate',  # noqa: E501
        'execution_instructions': 'executionInstructions',  # noqa: E501
        'locate_required': 'locateRequired',  # noqa: E501
        'text': 'text',  # noqa: E501
        'profile': 'profile',  # noqa: E501
        'user_defined_fields': 'userDefinedFields',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, parent_id, order_type, order_quantity, destination, *args, **kwargs):  # noqa: E501
        """EMSChildOrder - a model defined in OpenAPI

        Args:
            parent_id (ParentId):
            order_type (str): Type of the order
            order_quantity (float): Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.
            destination (str): Represents the designated venue or location to which an order is intended to be routed.

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
            side (str, none_type): Side of the order.If the parent order side is 'buy', valid values are 'buy' or 'buyMinus'. If the parent order side is 'sell', valid values are 'sell' or 'sellPlus'. [optional]  # noqa: E501
            price (float, none_type): Order price per share.. [optional]  # noqa: E501
            time_in_force (TimeInForce): [optional]  # noqa: E501
            handling_instructions (str, none_type): Instructions for order handling on Broker trading floor.. [optional]  # noqa: E501
            ex_destination (str, none_type): Execution destination as defined by institution when order is entered.. [optional] if omitted the server will use the default value of "America Stock Exchange"  # noqa: E501
            stop_price (float, none_type): Stop-loss price to buy/sell stock at market.. [optional]  # noqa: E501
            max_floor (float, none_type): Maximum number of shares within an order to be shown on the exchange floor at any given time.. [optional]  # noqa: E501
            min_quantity (float, none_type): Minimum quantity of an order to be executed.. [optional]  # noqa: E501
            settlement_type (str, none_type): Order settlement period. [optional]  # noqa: E501
            settlement_date (str, none_type): Specific date of trade settlement in YYYYMMDD format.. [optional]  # noqa: E501
            execution_instructions (str, none_type): Instructions for order handling on exchange trading floor.. [optional]  # noqa: E501
            locate_required (bool, none_type): Indicates whether the broker is to locate the stock in conjunction with a short sell order.. [optional]  # noqa: E501
            text (str, none_type): Free format text string.. [optional]  # noqa: E501
            profile (str, none_type): A name given to broker algo. [optional]  # noqa: E501
            user_defined_fields ({str: (str,)}, none_type): User defined fields. [optional]  # noqa: E501
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

        self.parent_id = parent_id
        self.order_type = order_type
        self.order_quantity = order_quantity
        self.destination = destination
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
    def __init__(self, parent_id, order_type, order_quantity, destination, *args, **kwargs):  # noqa: E501
        """EMSChildOrder - a model defined in OpenAPI

        Args:
            parent_id (ParentId):
            order_type (str): Type of the order
            order_quantity (float): Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.
            destination (str): Represents the designated venue or location to which an order is intended to be routed.

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
            side (str, none_type): Side of the order.If the parent order side is 'buy', valid values are 'buy' or 'buyMinus'. If the parent order side is 'sell', valid values are 'sell' or 'sellPlus'. [optional]  # noqa: E501
            price (float, none_type): Order price per share.. [optional]  # noqa: E501
            time_in_force (TimeInForce): [optional]  # noqa: E501
            handling_instructions (str, none_type): Instructions for order handling on Broker trading floor.. [optional]  # noqa: E501
            ex_destination (str, none_type): Execution destination as defined by institution when order is entered.. [optional] if omitted the server will use the default value of "America Stock Exchange"  # noqa: E501
            stop_price (float, none_type): Stop-loss price to buy/sell stock at market.. [optional]  # noqa: E501
            max_floor (float, none_type): Maximum number of shares within an order to be shown on the exchange floor at any given time.. [optional]  # noqa: E501
            min_quantity (float, none_type): Minimum quantity of an order to be executed.. [optional]  # noqa: E501
            settlement_type (str, none_type): Order settlement period. [optional]  # noqa: E501
            settlement_date (str, none_type): Specific date of trade settlement in YYYYMMDD format.. [optional]  # noqa: E501
            execution_instructions (str, none_type): Instructions for order handling on exchange trading floor.. [optional]  # noqa: E501
            locate_required (bool, none_type): Indicates whether the broker is to locate the stock in conjunction with a short sell order.. [optional]  # noqa: E501
            text (str, none_type): Free format text string.. [optional]  # noqa: E501
            profile (str, none_type): A name given to broker algo. [optional]  # noqa: E501
            user_defined_fields ({str: (str,)}, none_type): User defined fields. [optional]  # noqa: E501
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

        self.parent_id = parent_id
        self.order_type = order_type
        self.order_quantity = order_quantity
        self.destination = destination
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
