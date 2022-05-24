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
 * The StockNotationRankingIntradayListDataPrices model module.
 * @module model/StockNotationRankingIntradayListDataPrices
 * @version 0.9.2
 */
class StockNotationRankingIntradayListDataPrices {
    /**
     * Constructs a new <code>StockNotationRankingIntradayListDataPrices</code>.
     * Price-related parameters.
     * @alias module:model/StockNotationRankingIntradayListDataPrices
     */
    constructor() { 
        
        StockNotationRankingIntradayListDataPrices.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationRankingIntradayListDataPrices</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationRankingIntradayListDataPrices} obj Optional instance to populate.
     * @return {module:model/StockNotationRankingIntradayListDataPrices} The populated <code>StockNotationRankingIntradayListDataPrices</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationRankingIntradayListDataPrices();

            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Quality of the trade-related attributes, see attributes `trade` and `accumulated` in the response.
 * @member {module:model/StockNotationRankingIntradayListDataPrices.QualityEnum} quality
 * @default 'DLY'
 */
StockNotationRankingIntradayListDataPrices.prototype['quality'] = 'DLY';





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
StockNotationRankingIntradayListDataPrices['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY"
};



export default StockNotationRankingIntradayListDataPrices;

