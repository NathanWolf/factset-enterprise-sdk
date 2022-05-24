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
 * The DebtInstrumentIssuerSearchDataName model module.
 * @module model/DebtInstrumentIssuerSearchDataName
 * @version 0.10.0
 */
class DebtInstrumentIssuerSearchDataName {
    /**
     * Constructs a new <code>DebtInstrumentIssuerSearchDataName</code>.
     * Issuer name.
     * @alias module:model/DebtInstrumentIssuerSearchDataName
     */
    constructor() { 
        
        DebtInstrumentIssuerSearchDataName.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentIssuerSearchDataName</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentIssuerSearchDataName} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentIssuerSearchDataName} The populated <code>DebtInstrumentIssuerSearchDataName</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentIssuerSearchDataName();

            if (data.hasOwnProperty('searchValue')) {
                obj['searchValue'] = ApiClient.convertToType(data['searchValue'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Text string to be searched for.
 * @member {String} searchValue
 */
DebtInstrumentIssuerSearchDataName.prototype['searchValue'] = undefined;






export default DebtInstrumentIssuerSearchDataName;

