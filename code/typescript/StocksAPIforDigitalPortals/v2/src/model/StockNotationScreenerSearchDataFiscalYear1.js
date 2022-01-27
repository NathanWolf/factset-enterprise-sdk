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
 * The StockNotationScreenerSearchDataFiscalYear1 model module.
 * @module model/StockNotationScreenerSearchDataFiscalYear1
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataFiscalYear1 {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataFiscalYear1</code>.
     * Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Either must be at most two years in the future.
     * @alias module:model/StockNotationScreenerSearchDataFiscalYear1
     */
    constructor() { 
        
        StockNotationScreenerSearchDataFiscalYear1.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataFiscalYear1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataFiscalYear1} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataFiscalYear1} The populated <code>StockNotationScreenerSearchDataFiscalYear1</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataFiscalYear1();

            if (data.hasOwnProperty('yearEnd')) {
                obj['yearEnd'] = ApiClient.convertToType(data['yearEnd'], 'Number');
            }
            if (data.hasOwnProperty('year')) {
                obj['year'] = ApiClient.convertToType(data['year'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Calendar year of the ending date of the fiscal year.
 * @member {Number} yearEnd
 */
StockNotationScreenerSearchDataFiscalYear1.prototype['yearEnd'] = undefined;

/**
 * Derived fiscal year.
 * @member {Number} year
 */
StockNotationScreenerSearchDataFiscalYear1.prototype['year'] = undefined;






export default StockNotationScreenerSearchDataFiscalYear1;

