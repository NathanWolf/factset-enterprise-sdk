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
import StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean from './StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean';

/**
 * The StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow model module.
 * @module model/StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow</code>.
     * Cash flow per share, which is the ratio of the net operating cash flow, divided by the shares outstanding.
     * @alias module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow
     */
    constructor() { 
        
        StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow} The populated <code>StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow();

            if (data.hasOwnProperty('mean')) {
                obj['mean'] = StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean.constructFromObject(data['mean']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean} mean
 */
StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow.prototype['mean'] = undefined;






export default StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareCashFlow;

