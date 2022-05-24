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
import StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean from './StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean';

/**
 * The StockNotationScreenerSearchDataRatios1PriceBookValue model module.
 * @module model/StockNotationScreenerSearchDataRatios1PriceBookValue
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataRatios1PriceBookValue {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataRatios1PriceBookValue</code>.
     * Ratio of the price, divided by the book value per share.
     * @alias module:model/StockNotationScreenerSearchDataRatios1PriceBookValue
     */
    constructor() { 
        
        StockNotationScreenerSearchDataRatios1PriceBookValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataRatios1PriceBookValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataRatios1PriceBookValue} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataRatios1PriceBookValue} The populated <code>StockNotationScreenerSearchDataRatios1PriceBookValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataRatios1PriceBookValue();

            if (data.hasOwnProperty('mean')) {
                obj['mean'] = StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean.constructFromObject(data['mean']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceEarningsGrowthMean} mean
 */
StockNotationScreenerSearchDataRatios1PriceBookValue.prototype['mean'] = undefined;






export default StockNotationScreenerSearchDataRatios1PriceBookValue;

