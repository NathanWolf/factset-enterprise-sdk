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
import StockNotationScreenerSearchDataRsiWilderDays14 from './StockNotationScreenerSearchDataRsiWilderDays14';

/**
 * The StockNotationScreenerSearchDataRsiWilder model module.
 * @module model/StockNotationScreenerSearchDataRsiWilder
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataRsiWilder {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataRsiWilder</code>.
     * Relative strength index (RSI) by Wilder for different time ranges. This is the ratio of smoothed moving averages of the upwards and downwards daily returns over the given period, normalized to the range between 0 and 100. The RSI by Wilder measures the magnitude of the price changes in a given time period evaluating whether an asset is overbought or oversold and deriving a respective sell or buy signal.
     * @alias module:model/StockNotationScreenerSearchDataRsiWilder
     */
    constructor() { 
        
        StockNotationScreenerSearchDataRsiWilder.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataRsiWilder</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataRsiWilder} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataRsiWilder} The populated <code>StockNotationScreenerSearchDataRsiWilder</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataRsiWilder();

            if (data.hasOwnProperty('days14')) {
                obj['days14'] = StockNotationScreenerSearchDataRsiWilderDays14.constructFromObject(data['days14']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataRsiWilderDays14} days14
 */
StockNotationScreenerSearchDataRsiWilder.prototype['days14'] = undefined;






export default StockNotationScreenerSearchDataRsiWilder;

