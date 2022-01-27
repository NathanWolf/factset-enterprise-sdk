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
 * The InlineResponse20089TradingValueAverage model module.
 * @module model/InlineResponse20089TradingValueAverage
 * @version 0.9.0
 */
class InlineResponse20089TradingValueAverage {
    /**
     * Constructs a new <code>InlineResponse20089TradingValueAverage</code>.
     * Arithmetic mean of the trading value for a given time range.
     * @alias module:model/InlineResponse20089TradingValueAverage
     */
    constructor() { 
        
        InlineResponse20089TradingValueAverage.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20089TradingValueAverage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20089TradingValueAverage} obj Optional instance to populate.
     * @return {module:model/InlineResponse20089TradingValueAverage} The populated <code>InlineResponse20089TradingValueAverage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20089TradingValueAverage();

            if (data.hasOwnProperty('days30')) {
                obj['days30'] = ApiClient.convertToType(data['days30'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * 30 trading days.
 * @member {Number} days30
 */
InlineResponse20089TradingValueAverage.prototype['days30'] = undefined;






export default InlineResponse20089TradingValueAverage;

