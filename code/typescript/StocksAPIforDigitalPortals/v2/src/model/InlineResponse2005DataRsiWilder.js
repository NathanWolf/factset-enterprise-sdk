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
import InlineResponse2005DataRsiWilderDays14 from './InlineResponse2005DataRsiWilderDays14';

/**
 * The InlineResponse2005DataRsiWilder model module.
 * @module model/InlineResponse2005DataRsiWilder
 * @version 0.9.2
 */
class InlineResponse2005DataRsiWilder {
    /**
     * Constructs a new <code>InlineResponse2005DataRsiWilder</code>.
     * Value range of the relative strength index (RSI) by Wilder for different time ranges. This is the ratio of the smoothed moving averages of the upwards and downwards daily returns over the given period, normalized to the range between 0 and 100. The RSI by Wilder measures the magnitude of the price changes in a given time period evaluating whether an asset is overbought or oversold and deriving a respective sell or buy signal.
     * @alias module:model/InlineResponse2005DataRsiWilder
     */
    constructor() { 
        
        InlineResponse2005DataRsiWilder.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataRsiWilder</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataRsiWilder} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataRsiWilder} The populated <code>InlineResponse2005DataRsiWilder</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataRsiWilder();

            if (data.hasOwnProperty('days14')) {
                obj['days14'] = InlineResponse2005DataRsiWilderDays14.constructFromObject(data['days14']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataRsiWilderDays14} days14
 */
InlineResponse2005DataRsiWilder.prototype['days14'] = undefined;






export default InlineResponse2005DataRsiWilder;

