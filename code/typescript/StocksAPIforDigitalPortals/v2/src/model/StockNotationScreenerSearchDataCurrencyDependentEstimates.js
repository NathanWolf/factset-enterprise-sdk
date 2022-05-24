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
import StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency from './StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency';
import StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit from './StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit';
import StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda from './StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda';
import StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare from './StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare';

/**
 * The StockNotationScreenerSearchDataCurrencyDependentEstimates model module.
 * @module model/StockNotationScreenerSearchDataCurrencyDependentEstimates
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataCurrencyDependentEstimates {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataCurrencyDependentEstimates</code>.
     * Currency-dependent estimates. Selection of a currency is required to use these parameters.
     * @alias module:model/StockNotationScreenerSearchDataCurrencyDependentEstimates
     * @param currency {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency} 
     */
    constructor(currency) { 
        
        StockNotationScreenerSearchDataCurrencyDependentEstimates.initialize(this, currency);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, currency) { 
        obj['currency'] = currency;
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataCurrencyDependentEstimates</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimates} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimates} The populated <code>StockNotationScreenerSearchDataCurrencyDependentEstimates</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataCurrencyDependentEstimates();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('ebit')) {
                obj['ebit'] = StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit.constructFromObject(data['ebit']);
            }
            if (data.hasOwnProperty('ebitda')) {
                obj['ebitda'] = StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda.constructFromObject(data['ebitda']);
            }
            if (data.hasOwnProperty('perShare')) {
                obj['perShare'] = StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare.constructFromObject(data['perShare']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency} currency
 */
StockNotationScreenerSearchDataCurrencyDependentEstimates.prototype['currency'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit} ebit
 */
StockNotationScreenerSearchDataCurrencyDependentEstimates.prototype['ebit'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda} ebitda
 */
StockNotationScreenerSearchDataCurrencyDependentEstimates.prototype['ebitda'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare} perShare
 */
StockNotationScreenerSearchDataCurrencyDependentEstimates.prototype['perShare'] = undefined;






export default StockNotationScreenerSearchDataCurrencyDependentEstimates;

