/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse200DataTriggerPrice model module.
 * @module model/InlineResponse200DataTriggerPrice
 * @version 0.10.0
 */
class InlineResponse200DataTriggerPrice {
    /**
     * Constructs a new <code>InlineResponse200DataTriggerPrice</code>.
     * Price data of the trigger.
     * @alias module:model/InlineResponse200DataTriggerPrice
     */
    constructor() { 
        
        InlineResponse200DataTriggerPrice.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataTriggerPrice</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataTriggerPrice} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataTriggerPrice} The populated <code>InlineResponse200DataTriggerPrice</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataTriggerPrice();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Type of the price as configured for the customer.
 * @member {module:model/InlineResponse200DataTriggerPrice.TypeEnum} type
 */
InlineResponse200DataTriggerPrice.prototype['type'] = undefined;

/**
 * Price quality of the trigger.
 * @member {module:model/InlineResponse200DataTriggerPrice.QualityEnum} quality
 */
InlineResponse200DataTriggerPrice.prototype['quality'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse200DataTriggerPrice['TypeEnum'] = {

    /**
     * value: "trade"
     * @const
     */
    "trade": "trade",

    /**
     * value: "bid"
     * @const
     */
    "bid": "bid",

    /**
     * value: "ask"
     * @const
     */
    "ask": "ask"
};


/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse200DataTriggerPrice['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default InlineResponse200DataTriggerPrice;

