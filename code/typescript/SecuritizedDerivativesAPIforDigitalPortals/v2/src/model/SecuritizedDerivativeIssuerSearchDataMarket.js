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
 * The SecuritizedDerivativeIssuerSearchDataMarket model module.
 * @module model/SecuritizedDerivativeIssuerSearchDataMarket
 * @version 0.10.0
 */
class SecuritizedDerivativeIssuerSearchDataMarket {
    /**
     * Constructs a new <code>SecuritizedDerivativeIssuerSearchDataMarket</code>.
     * List of markets where securitized derivatives are traded. Only issuers that have issued at least one securitized derivative traded on a market in the provided list are returned.
     * @alias module:model/SecuritizedDerivativeIssuerSearchDataMarket
     */
    constructor() { 
        
        SecuritizedDerivativeIssuerSearchDataMarket.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeIssuerSearchDataMarket</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeIssuerSearchDataMarket} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeIssuerSearchDataMarket} The populated <code>SecuritizedDerivativeIssuerSearchDataMarket</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeIssuerSearchDataMarket();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * List of market identifiers. See endpoint `/basic/market/list` for valid values.
 * @member {Array.<Number>} ids
 */
SecuritizedDerivativeIssuerSearchDataMarket.prototype['ids'] = undefined;






export default SecuritizedDerivativeIssuerSearchDataMarket;

