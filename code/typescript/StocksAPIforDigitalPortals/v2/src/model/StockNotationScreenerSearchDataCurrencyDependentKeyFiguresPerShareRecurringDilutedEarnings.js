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
 * The StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings model module.
 * @module model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings</code>.
     * Value range for the recurring (excluding extraordinary items) diluted earnings per share, which is the ratio of the net income excluding extraordinary items, divided by the diluted shares outstanding. An extraordinary item is an atypical and infrequent gain or loss due to an unforeseeable event.
     * @alias module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings
     */
    constructor() { 
        
        StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings} The populated <code>StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings();

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
StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum} maximum
 */
StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataCurrencyDependentKeyFiguresPerShareRecurringDilutedEarnings;

