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
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbitda from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbitda';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresMarketCapitalization from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresMarketCapitalization';
import InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare from './InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare';

/**
 * The InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures model module.
 * @module model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures
 * @version 0.9.2
 */
class InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures {
    /**
     * Constructs a new <code>InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures</code>.
     * Value ranges of the currency-dependent figures. Not available if a currency has not been specified.
     * @alias module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures
     */
    constructor() { 
        
        InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures} The populated <code>InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('marketCapitalization')) {
                obj['marketCapitalization'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresMarketCapitalization.constructFromObject(data['marketCapitalization']);
            }
            if (data.hasOwnProperty('ebit')) {
                obj['ebit'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit.constructFromObject(data['ebit']);
            }
            if (data.hasOwnProperty('ebitda')) {
                obj['ebitda'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbitda.constructFromObject(data['ebitda']);
            }
            if (data.hasOwnProperty('perShare')) {
                obj['perShare'] = InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.constructFromObject(data['perShare']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency} currency
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresMarketCapitalization} marketCapitalization
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.prototype['marketCapitalization'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbit} ebit
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.prototype['ebit'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresEbitda} ebitda
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.prototype['ebitda'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare} perShare
 */
InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures.prototype['perShare'] = undefined;






export default InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures;

