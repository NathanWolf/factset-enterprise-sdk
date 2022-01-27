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
import StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum from './StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum';
import StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum from './StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum';

/**
 * The StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays model module.
 * @module model/StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays</code>.
     * Value range for the number of trading days.
     * @alias module:model/StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays
     */
    constructor() { 
        
        StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays} The populated <code>StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMinimum} minimum
 */
StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDaysMaximum} maximum
 */
StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50NumberDays;

