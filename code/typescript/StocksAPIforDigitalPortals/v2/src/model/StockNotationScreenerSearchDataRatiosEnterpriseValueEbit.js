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
import StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum from './StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum';
import StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum from './StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum';

/**
 * The StockNotationScreenerSearchDataRatiosEnterpriseValueEbit model module.
 * @module model/StockNotationScreenerSearchDataRatiosEnterpriseValueEbit
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataRatiosEnterpriseValueEbit {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataRatiosEnterpriseValueEbit</code>.
     * Value range for the ratio of the enterprise value, divided by the EBIT.
     * @alias module:model/StockNotationScreenerSearchDataRatiosEnterpriseValueEbit
     */
    constructor() { 
        
        StockNotationScreenerSearchDataRatiosEnterpriseValueEbit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataRatiosEnterpriseValueEbit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataRatiosEnterpriseValueEbit} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataRatiosEnterpriseValueEbit} The populated <code>StockNotationScreenerSearchDataRatiosEnterpriseValueEbit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataRatiosEnterpriseValueEbit();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum} minimum
 */
StockNotationScreenerSearchDataRatiosEnterpriseValueEbit.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum} maximum
 */
StockNotationScreenerSearchDataRatiosEnterpriseValueEbit.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataRatiosEnterpriseValueEbit;

