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
import InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures from './InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures';
import InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear from './InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear';
import InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios from './InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios';

/**
 * The InlineResponse2004ReportedKeyFiguresThirdFiscalYear model module.
 * @module model/InlineResponse2004ReportedKeyFiguresThirdFiscalYear
 * @version 0.9.0
 */
class InlineResponse2004ReportedKeyFiguresThirdFiscalYear {
    /**
     * Constructs a new <code>InlineResponse2004ReportedKeyFiguresThirdFiscalYear</code>.
     * Data of the most distant fiscal year that has been requested. Available only if the parameters used in the request refer to data from three fiscals year.
     * @alias module:model/InlineResponse2004ReportedKeyFiguresThirdFiscalYear
     */
    constructor() { 
        
        InlineResponse2004ReportedKeyFiguresThirdFiscalYear.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004ReportedKeyFiguresThirdFiscalYear</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004ReportedKeyFiguresThirdFiscalYear} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004ReportedKeyFiguresThirdFiscalYear} The populated <code>InlineResponse2004ReportedKeyFiguresThirdFiscalYear</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004ReportedKeyFiguresThirdFiscalYear();

            if (data.hasOwnProperty('fiscalYear')) {
                obj['fiscalYear'] = InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear.constructFromObject(data['fiscalYear']);
            }
            if (data.hasOwnProperty('currencyDependentKeyFigures')) {
                obj['currencyDependentKeyFigures'] = InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.constructFromObject(data['currencyDependentKeyFigures']);
            }
            if (data.hasOwnProperty('ebitMargin')) {
                obj['ebitMargin'] = ApiClient.convertToType(data['ebitMargin'], 'Number');
            }
            if (data.hasOwnProperty('ebitdaMargin')) {
                obj['ebitdaMargin'] = ApiClient.convertToType(data['ebitdaMargin'], 'Number');
            }
            if (data.hasOwnProperty('netIncomeMargin')) {
                obj['netIncomeMargin'] = ApiClient.convertToType(data['netIncomeMargin'], 'Number');
            }
            if (data.hasOwnProperty('grossIncomeMargin')) {
                obj['grossIncomeMargin'] = ApiClient.convertToType(data['grossIncomeMargin'], 'Number');
            }
            if (data.hasOwnProperty('operatingMargin')) {
                obj['operatingMargin'] = ApiClient.convertToType(data['operatingMargin'], 'Number');
            }
            if (data.hasOwnProperty('returnOnAssets')) {
                obj['returnOnAssets'] = ApiClient.convertToType(data['returnOnAssets'], 'Number');
            }
            if (data.hasOwnProperty('returnOnEquity')) {
                obj['returnOnEquity'] = ApiClient.convertToType(data['returnOnEquity'], 'Number');
            }
            if (data.hasOwnProperty('ratios')) {
                obj['ratios'] = InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios.constructFromObject(data['ratios']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear} fiscalYear
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['fiscalYear'] = undefined;

/**
 * @member {module:model/InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures} currencyDependentKeyFigures
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['currencyDependentKeyFigures'] = undefined;

/**
 * EBIT margin, which is the ratio of the EBIT, divided by the total sales revenue.
 * @member {Number} ebitMargin
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['ebitMargin'] = undefined;

/**
 * EBITDA margin, which is the ratio of the EBITDA, divided by the total sales revenue.
 * @member {Number} ebitdaMargin
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['ebitdaMargin'] = undefined;

/**
 * Net income margin, which is the ratio of the net income, divided by the total sales revenue.
 * @member {Number} netIncomeMargin
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['netIncomeMargin'] = undefined;

/**
 * Gross income margin, which is the ratio of the gross income, divided by the total sales revenue.
 * @member {Number} grossIncomeMargin
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['grossIncomeMargin'] = undefined;

/**
 * Operating margin, which is the ratio of the operating income, divided by the sales revenue.
 * @member {Number} operatingMargin
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['operatingMargin'] = undefined;

/**
 * Return on assets (ROA), which is the ratio of the net income, divided by the two-fiscal-year average of the total assets.
 * @member {Number} returnOnAssets
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['returnOnAssets'] = undefined;

/**
 * Return on equity (ROE), which is the ratio of the net income, divided by the two-fiscal-year average of the total shareholders' equity.
 * @member {Number} returnOnEquity
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['returnOnEquity'] = undefined;

/**
 * @member {module:model/InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios} ratios
 */
InlineResponse2004ReportedKeyFiguresThirdFiscalYear.prototype['ratios'] = undefined;






export default InlineResponse2004ReportedKeyFiguresThirdFiscalYear;

