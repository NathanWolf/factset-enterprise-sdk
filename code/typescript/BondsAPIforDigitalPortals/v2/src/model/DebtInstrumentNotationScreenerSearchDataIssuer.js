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
import DebtInstrumentNotationScreenerSearchDataIssuerCountry from './DebtInstrumentNotationScreenerSearchDataIssuerCountry';
import DebtInstrumentNotationScreenerSearchDataIssuerSelection from './DebtInstrumentNotationScreenerSearchDataIssuerSelection';

/**
 * The DebtInstrumentNotationScreenerSearchDataIssuer model module.
 * @module model/DebtInstrumentNotationScreenerSearchDataIssuer
 * @version 0.10.0
 */
class DebtInstrumentNotationScreenerSearchDataIssuer {
    /**
     * Constructs a new <code>DebtInstrumentNotationScreenerSearchDataIssuer</code>.
     * Parameters related to the issuer.
     * @alias module:model/DebtInstrumentNotationScreenerSearchDataIssuer
     */
    constructor() { 
        
        DebtInstrumentNotationScreenerSearchDataIssuer.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentNotationScreenerSearchDataIssuer</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentNotationScreenerSearchDataIssuer} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentNotationScreenerSearchDataIssuer} The populated <code>DebtInstrumentNotationScreenerSearchDataIssuer</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentNotationScreenerSearchDataIssuer();

            if (data.hasOwnProperty('selection')) {
                obj['selection'] = DebtInstrumentNotationScreenerSearchDataIssuerSelection.constructFromObject(data['selection']);
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = DebtInstrumentNotationScreenerSearchDataIssuerCountry.constructFromObject(data['country']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataIssuerSelection} selection
 */
DebtInstrumentNotationScreenerSearchDataIssuer.prototype['selection'] = undefined;

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataIssuerCountry} country
 */
DebtInstrumentNotationScreenerSearchDataIssuer.prototype['country'] = undefined;






export default DebtInstrumentNotationScreenerSearchDataIssuer;

