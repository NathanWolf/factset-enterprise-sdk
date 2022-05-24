/**
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigurationAccount from './ConfigurationAccount';

/**
 * The VaultConfiguration model module.
 * @module model/VaultConfiguration
 * @version 0.20.0
 */
class VaultConfiguration {
    /**
     * Constructs a new <code>VaultConfiguration</code>.
     * @alias module:model/VaultConfiguration
     */
    constructor() { 
        
        VaultConfiguration.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VaultConfiguration</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VaultConfiguration} obj Optional instance to populate.
     * @return {module:model/VaultConfiguration} The populated <code>VaultConfiguration</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VaultConfiguration();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], {'String': ConfigurationAccount});
            }
        }
        return obj;
    }


}

/**
 * Configuration name.
 * @member {String} name
 */
VaultConfiguration.prototype['name'] = undefined;

/**
 * @member {Object.<String, module:model/ConfigurationAccount>} accounts
 */
VaultConfiguration.prototype['accounts'] = undefined;






export default VaultConfiguration;

