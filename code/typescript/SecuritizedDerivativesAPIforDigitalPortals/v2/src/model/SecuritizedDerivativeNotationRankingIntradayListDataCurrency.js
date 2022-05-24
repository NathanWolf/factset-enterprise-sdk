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
 * The SecuritizedDerivativeNotationRankingIntradayListDataCurrency model module.
 * @module model/SecuritizedDerivativeNotationRankingIntradayListDataCurrency
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationRankingIntradayListDataCurrency {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationRankingIntradayListDataCurrency</code>.
     * Main currency of the trading value and volume for securitized derivatives quoted in percent. The parameter ensures the consistency and comparability of the trading value and trading volume for such securitized derivatives. For securitized derivatives not quoted in percent, the currency and the value unit, see parameter &#x60;valueUnit&#x60;, are identical, thus it is not neccessary to specify the currency if the value unit has been specified.
     * @alias module:model/SecuritizedDerivativeNotationRankingIntradayListDataCurrency
     */
    constructor() { 
        
        SecuritizedDerivativeNotationRankingIntradayListDataCurrency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationRankingIntradayListDataCurrency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationRankingIntradayListDataCurrency} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationRankingIntradayListDataCurrency} The populated <code>SecuritizedDerivativeNotationRankingIntradayListDataCurrency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationRankingIntradayListDataCurrency();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the main currency. See endpoint `/basic/valueUnit/currency/main/list` for valid values.
 * @member {Number} id
 */
SecuritizedDerivativeNotationRankingIntradayListDataCurrency.prototype['id'] = undefined;






export default SecuritizedDerivativeNotationRankingIntradayListDataCurrency;

