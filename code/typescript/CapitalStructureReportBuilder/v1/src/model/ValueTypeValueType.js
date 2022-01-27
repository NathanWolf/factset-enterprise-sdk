/**
 * FactSet Capital Structure Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ValueTypeValueType model module.
 * @module model/ValueTypeValueType
 * @version 0.9.0
 */
class ValueTypeValueType {
    /**
     * Constructs a new <code>ValueTypeValueType</code>.
     * Describes how to interpret numbers
     * @alias module:model/ValueTypeValueType
     */
    constructor() { 
        
        ValueTypeValueType.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ValueTypeValueType</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValueTypeValueType} obj Optional instance to populate.
     * @return {module:model/ValueTypeValueType} The populated <code>ValueTypeValueType</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValueTypeValueType();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ValueTypeValueType.ValueEnum} value
 */
ValueTypeValueType.prototype['value'] = undefined;





/**
 * Allowed values for the <code>value</code> property.
 * @enum {String}
 * @readonly
 */
ValueTypeValueType['ValueEnum'] = {

    /**
     * value: "PERCENTAGE"
     * @const
     */
    "PERCENTAGE": "PERCENTAGE",

    /**
     * value: "RATIO"
     * @const
     */
    "RATIO": "RATIO",

    /**
     * value: "TREND"
     * @const
     */
    "TREND": "TREND",

    /**
     * value: "RANGE"
     * @const
     */
    "RANGE": "RANGE"
};



export default ValueTypeValueType;

