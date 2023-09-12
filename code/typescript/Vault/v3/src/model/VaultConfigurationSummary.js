/**
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The VaultConfigurationSummary model module.
 * @module model/VaultConfigurationSummary
 */
class VaultConfigurationSummary {
    /**
     * Constructs a new <code>VaultConfigurationSummary</code>.
     * @alias module:model/VaultConfigurationSummary
     */
    constructor() { 
        
        VaultConfigurationSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VaultConfigurationSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VaultConfigurationSummary} obj Optional instance to populate.
     * @return {module:model/VaultConfigurationSummary} The populated <code>VaultConfigurationSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VaultConfigurationSummary();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Configuration name.
 * @member {String} name
 */
VaultConfigurationSummary.prototype['name'] = undefined;






export default VaultConfigurationSummary;

