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
import StockNotationRankingIntradayListDataCompany from './StockNotationRankingIntradayListDataCompany';
import StockNotationRankingIntradayListDataCurrency from './StockNotationRankingIntradayListDataCurrency';
import StockNotationRankingIntradayListDataIndexMembership from './StockNotationRankingIntradayListDataIndexMembership';
import StockNotationRankingIntradayListDataIndustryClassification from './StockNotationRankingIntradayListDataIndustryClassification';
import StockNotationRankingIntradayListDataInstrumentRestrictionList from './StockNotationRankingIntradayListDataInstrumentRestrictionList';
import StockNotationRankingIntradayListDataMarket from './StockNotationRankingIntradayListDataMarket';
import StockNotationRankingIntradayListDataNotationRestrictionList from './StockNotationRankingIntradayListDataNotationRestrictionList';
import StockNotationRankingIntradayListDataPrices from './StockNotationRankingIntradayListDataPrices';

/**
 * The StockNotationRankingIntradayListData model module.
 * @module model/StockNotationRankingIntradayListData
 * @version 0.9.0
 */
class StockNotationRankingIntradayListData {
    /**
     * Constructs a new <code>StockNotationRankingIntradayListData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/StockNotationRankingIntradayListData
     */
    constructor() { 
        
        StockNotationRankingIntradayListData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationRankingIntradayListData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationRankingIntradayListData} obj Optional instance to populate.
     * @return {module:model/StockNotationRankingIntradayListData} The populated <code>StockNotationRankingIntradayListData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationRankingIntradayListData();

            if (data.hasOwnProperty('prices')) {
                obj['prices'] = StockNotationRankingIntradayListDataPrices.constructFromObject(data['prices']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = StockNotationRankingIntradayListDataCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = StockNotationRankingIntradayListDataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('instrumentRestrictionList')) {
                obj['instrumentRestrictionList'] = StockNotationRankingIntradayListDataInstrumentRestrictionList.constructFromObject(data['instrumentRestrictionList']);
            }
            if (data.hasOwnProperty('notationRestrictionList')) {
                obj['notationRestrictionList'] = StockNotationRankingIntradayListDataNotationRestrictionList.constructFromObject(data['notationRestrictionList']);
            }
            if (data.hasOwnProperty('industryClassification')) {
                obj['industryClassification'] = StockNotationRankingIntradayListDataIndustryClassification.constructFromObject(data['industryClassification']);
            }
            if (data.hasOwnProperty('company')) {
                obj['company'] = StockNotationRankingIntradayListDataCompany.constructFromObject(data['company']);
            }
            if (data.hasOwnProperty('indexMembership')) {
                obj['indexMembership'] = StockNotationRankingIntradayListDataIndexMembership.constructFromObject(data['indexMembership']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationRankingIntradayListDataPrices} prices
 */
StockNotationRankingIntradayListData.prototype['prices'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataCurrency} currency
 */
StockNotationRankingIntradayListData.prototype['currency'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataMarket} market
 */
StockNotationRankingIntradayListData.prototype['market'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataInstrumentRestrictionList} instrumentRestrictionList
 */
StockNotationRankingIntradayListData.prototype['instrumentRestrictionList'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataNotationRestrictionList} notationRestrictionList
 */
StockNotationRankingIntradayListData.prototype['notationRestrictionList'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataIndustryClassification} industryClassification
 */
StockNotationRankingIntradayListData.prototype['industryClassification'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataCompany} company
 */
StockNotationRankingIntradayListData.prototype['company'] = undefined;

/**
 * @member {module:model/StockNotationRankingIntradayListDataIndexMembership} indexMembership
 */
StockNotationRankingIntradayListData.prototype['indexMembership'] = undefined;






export default StockNotationRankingIntradayListData;

