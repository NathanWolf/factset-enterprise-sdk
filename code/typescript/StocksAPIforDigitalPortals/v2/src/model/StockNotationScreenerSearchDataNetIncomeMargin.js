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
import StockNotationScreenerSearchDataEbitMarginMaximum from './StockNotationScreenerSearchDataEbitMarginMaximum';
import StockNotationScreenerSearchDataEbitMarginMinimum from './StockNotationScreenerSearchDataEbitMarginMinimum';

/**
 * The StockNotationScreenerSearchDataNetIncomeMargin model module.
 * @module model/StockNotationScreenerSearchDataNetIncomeMargin
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataNetIncomeMargin {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataNetIncomeMargin</code>.
     * Value range for the net income margin, which is the ratio of the net income, divided by the total sales revenue.
     * @alias module:model/StockNotationScreenerSearchDataNetIncomeMargin
     */
    constructor() { 
        
        StockNotationScreenerSearchDataNetIncomeMargin.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataNetIncomeMargin</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataNetIncomeMargin} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataNetIncomeMargin} The populated <code>StockNotationScreenerSearchDataNetIncomeMargin</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataNetIncomeMargin();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = StockNotationScreenerSearchDataEbitMarginMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = StockNotationScreenerSearchDataEbitMarginMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataEbitMarginMinimum} minimum
 */
StockNotationScreenerSearchDataNetIncomeMargin.prototype['minimum'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataEbitMarginMaximum} maximum
 */
StockNotationScreenerSearchDataNetIncomeMargin.prototype['maximum'] = undefined;






export default StockNotationScreenerSearchDataNetIncomeMargin;

