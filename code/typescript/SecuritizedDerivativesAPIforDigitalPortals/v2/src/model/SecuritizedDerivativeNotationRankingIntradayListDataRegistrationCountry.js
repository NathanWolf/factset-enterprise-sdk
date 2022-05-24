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
 * The SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry model module.
 * @module model/SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry</code>.
     * Only securitized derivatives registered for trading in a country in the provided list are returned.
     * @alias module:model/SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry
     */
    constructor() { 
        
        SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry} The populated <code>SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * List of country identifiers. See endpoint `/basic/region/country/list` for valid values.
 * @member {Array.<Number>} ids
 */
SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.prototype['ids'] = undefined;






export default SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry;

