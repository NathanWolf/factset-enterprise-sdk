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
 * The StockNotationRankingIntradayListDataInstrumentRestrictionList model module.
 * @module model/StockNotationRankingIntradayListDataInstrumentRestrictionList
 * @version 0.9.2
 */
class StockNotationRankingIntradayListDataInstrumentRestrictionList {
    /**
     * Constructs a new <code>StockNotationRankingIntradayListDataInstrumentRestrictionList</code>.
     * Instrument-level restriction. If present, the result contains only stocks that are a member of at least one of the provided lists.
     * @alias module:model/StockNotationRankingIntradayListDataInstrumentRestrictionList
     */
    constructor() { 
        
        StockNotationRankingIntradayListDataInstrumentRestrictionList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationRankingIntradayListDataInstrumentRestrictionList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationRankingIntradayListDataInstrumentRestrictionList} obj Optional instance to populate.
     * @return {module:model/StockNotationRankingIntradayListDataInstrumentRestrictionList} The populated <code>StockNotationRankingIntradayListDataInstrumentRestrictionList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationRankingIntradayListDataInstrumentRestrictionList();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * List of identifiers of restriction lists.
 * @member {Array.<Number>} ids
 */
StockNotationRankingIntradayListDataInstrumentRestrictionList.prototype['ids'] = undefined;






export default StockNotationRankingIntradayListDataInstrumentRestrictionList;

