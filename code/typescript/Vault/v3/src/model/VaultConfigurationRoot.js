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
import VaultConfiguration from './VaultConfiguration';

/**
 * The VaultConfigurationRoot model module.
 * @module model/VaultConfigurationRoot
 * @version 0.20.0
 */
class VaultConfigurationRoot {
    /**
     * Constructs a new <code>VaultConfigurationRoot</code>.
     * @alias module:model/VaultConfigurationRoot
     * @param data {module:model/VaultConfiguration} 
     */
    constructor(data) { 
        
        VaultConfigurationRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>VaultConfigurationRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VaultConfigurationRoot} obj Optional instance to populate.
     * @return {module:model/VaultConfigurationRoot} The populated <code>VaultConfigurationRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VaultConfigurationRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = VaultConfiguration.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/VaultConfiguration} data
 */
VaultConfigurationRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
VaultConfigurationRoot.prototype['meta'] = undefined;






export default VaultConfigurationRoot;

