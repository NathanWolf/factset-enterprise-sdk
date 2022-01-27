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
 * The InlineResponse2005DataConstantLeverage model module.
 * @module model/InlineResponse2005DataConstantLeverage
 * @version 0.9.0
 */
class InlineResponse2005DataConstantLeverage {
    /**
     * Constructs a new <code>InlineResponse2005DataConstantLeverage</code>.
     * @alias module:model/InlineResponse2005DataConstantLeverage
     */
    constructor() { 
        
        InlineResponse2005DataConstantLeverage.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataConstantLeverage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataConstantLeverage} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataConstantLeverage} The populated <code>InlineResponse2005DataConstantLeverage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataConstantLeverage();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Constant leverage.
 * @member {Number} value
 */
InlineResponse2005DataConstantLeverage.prototype['value'] = undefined;

/**
 * Number of notations.
 * @member {Number} count
 */
InlineResponse2005DataConstantLeverage.prototype['count'] = undefined;






export default InlineResponse2005DataConstantLeverage;

