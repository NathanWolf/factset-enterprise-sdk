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
import InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency from './InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency';
import InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit from './InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit';
import InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda from './InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda';
import InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare from './InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare';

/**
 * The InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates model module.
 * @module model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates
 * @version 0.9.2
 */
class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates {
    /**
     * Constructs a new <code>InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates</code>.
     * Currency-dependent estimates. If no currency has been selected (see parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60;) the currency in which the analysts report is used.
     * @alias module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates
     */
    constructor() { 
        
        InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates} The populated <code>InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('ebit')) {
                obj['ebit'] = InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit.constructFromObject(data['ebit']);
            }
            if (data.hasOwnProperty('ebitda')) {
                obj['ebitda'] = InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda.constructFromObject(data['ebitda']);
            }
            if (data.hasOwnProperty('perShare')) {
                obj['perShare'] = InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.constructFromObject(data['perShare']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency} currency
 */
InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit} ebit
 */
InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.prototype['ebit'] = undefined;

/**
 * @member {module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda} ebitda
 */
InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.prototype['ebitda'] = undefined;

/**
 * @member {module:model/InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare} perShare
 */
InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.prototype['perShare'] = undefined;






export default InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates;

