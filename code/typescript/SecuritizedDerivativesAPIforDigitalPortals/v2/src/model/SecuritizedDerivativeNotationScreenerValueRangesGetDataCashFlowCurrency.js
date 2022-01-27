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
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency</code>.
     * Main currency of the cash flows. A cash flow is a payout dependent on whether or not the underlying level, e.g. a stock&#39;s price, will reach a given threshold, called barrier, at a given time.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the currency. See endpoint `/basic/valueUnit/currency/main/list` for valid values.
 * @member {Number} id
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency.prototype['id'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency;

