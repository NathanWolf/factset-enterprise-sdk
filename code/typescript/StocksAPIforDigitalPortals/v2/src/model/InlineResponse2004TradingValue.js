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
import InlineResponse2004TradingValueAverage from './InlineResponse2004TradingValueAverage';

/**
 * The InlineResponse2004TradingValue model module.
 * @module model/InlineResponse2004TradingValue
 * @version 0.9.0
 */
class InlineResponse2004TradingValue {
    /**
     * Constructs a new <code>InlineResponse2004TradingValue</code>.
     * Sum of the cash flow for all transactions of a notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price.
     * @alias module:model/InlineResponse2004TradingValue
     */
    constructor() { 
        
        InlineResponse2004TradingValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004TradingValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004TradingValue} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004TradingValue} The populated <code>InlineResponse2004TradingValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004TradingValue();

            if (data.hasOwnProperty('average')) {
                obj['average'] = InlineResponse2004TradingValueAverage.constructFromObject(data['average']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004TradingValueAverage} average
 */
InlineResponse2004TradingValue.prototype['average'] = undefined;






export default InlineResponse2004TradingValue;

