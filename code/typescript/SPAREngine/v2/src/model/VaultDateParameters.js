/**
 * SPAR Engine API
 * Allow clients to fetch SPAR Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The VaultDateParameters model module.
 * @module model/VaultDateParameters
 * @version 0.8.2
 */
class VaultDateParameters {
    /**
     * Constructs a new <code>VaultDateParameters</code>.
     * The date parameters for Vault calculation
     * @alias module:model/VaultDateParameters
     * @param enddate {String} Calculation's end date.
     * @param frequency {String} Calculation's frequency.
     */
    constructor(enddate, frequency) { 
        
        VaultDateParameters.initialize(this, enddate, frequency);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, enddate, frequency) { 
        obj['enddate'] = enddate;
        obj['frequency'] = frequency;
    }

    /**
     * Constructs a <code>VaultDateParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VaultDateParameters} obj Optional instance to populate.
     * @return {module:model/VaultDateParameters} The populated <code>VaultDateParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VaultDateParameters();

            if (data.hasOwnProperty('startdate')) {
                obj['startdate'] = ApiClient.convertToType(data['startdate'], 'String');
            }
            if (data.hasOwnProperty('enddate')) {
                obj['enddate'] = ApiClient.convertToType(data['enddate'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = ApiClient.convertToType(data['frequency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Calculation's start date.
 * @member {String} startdate
 */
VaultDateParameters.prototype['startdate'] = undefined;

/**
 * Calculation's end date.
 * @member {String} enddate
 */
VaultDateParameters.prototype['enddate'] = undefined;

/**
 * Calculation's frequency.
 * @member {String} frequency
 */
VaultDateParameters.prototype['frequency'] = undefined;






export default VaultDateParameters;

