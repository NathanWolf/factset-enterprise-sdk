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
import InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear from './InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity';

/**
 * The InlineResponse2005DataReportedKeyFiguresThirdFiscalYear model module.
 * @module model/InlineResponse2005DataReportedKeyFiguresThirdFiscalYear
 * @version 0.9.0
 */
class InlineResponse2005DataReportedKeyFiguresThirdFiscalYear {
    /**
     * Constructs a new <code>InlineResponse2005DataReportedKeyFiguresThirdFiscalYear</code>.
     * Value ranges of the most distant fiscal year that has been requested. Available only if the parameters used in the request refer to data from three fiscals year.
     * @alias module:model/InlineResponse2005DataReportedKeyFiguresThirdFiscalYear
     */
    constructor() { 
        
        InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataReportedKeyFiguresThirdFiscalYear</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataReportedKeyFiguresThirdFiscalYear} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataReportedKeyFiguresThirdFiscalYear} The populated <code>InlineResponse2005DataReportedKeyFiguresThirdFiscalYear</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataReportedKeyFiguresThirdFiscalYear();

            if (data.hasOwnProperty('fiscalYear')) {
                obj['fiscalYear'] = InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear.constructFromObject(data['fiscalYear']);
            }
            if (data.hasOwnProperty('currencyDependentKeyFigures')) {
                obj['currencyDependentKeyFigures'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.constructFromObject(data['currencyDependentKeyFigures']);
            }
            if (data.hasOwnProperty('ebitMargin')) {
                obj['ebitMargin'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin.constructFromObject(data['ebitMargin']);
            }
            if (data.hasOwnProperty('ebitdaMargin')) {
                obj['ebitdaMargin'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin.constructFromObject(data['ebitdaMargin']);
            }
            if (data.hasOwnProperty('netIncomeMargin')) {
                obj['netIncomeMargin'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin.constructFromObject(data['netIncomeMargin']);
            }
            if (data.hasOwnProperty('grossIncomeMargin')) {
                obj['grossIncomeMargin'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin.constructFromObject(data['grossIncomeMargin']);
            }
            if (data.hasOwnProperty('operatingMargin')) {
                obj['operatingMargin'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin.constructFromObject(data['operatingMargin']);
            }
            if (data.hasOwnProperty('returnOnAssets')) {
                obj['returnOnAssets'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets.constructFromObject(data['returnOnAssets']);
            }
            if (data.hasOwnProperty('returnOnEquity')) {
                obj['returnOnEquity'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity.constructFromObject(data['returnOnEquity']);
            }
            if (data.hasOwnProperty('ratios')) {
                obj['ratios'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios.constructFromObject(data['ratios']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear} fiscalYear
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['fiscalYear'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures} currencyDependentKeyFigures
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['currencyDependentKeyFigures'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin} ebitMargin
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['ebitMargin'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin} ebitdaMargin
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['ebitdaMargin'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin} netIncomeMargin
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['netIncomeMargin'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin} grossIncomeMargin
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['grossIncomeMargin'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin} operatingMargin
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['operatingMargin'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets} returnOnAssets
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['returnOnAssets'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity} returnOnEquity
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['returnOnEquity'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios} ratios
 */
InlineResponse2005DataReportedKeyFiguresThirdFiscalYear.prototype['ratios'] = undefined;






export default InlineResponse2005DataReportedKeyFiguresThirdFiscalYear;

