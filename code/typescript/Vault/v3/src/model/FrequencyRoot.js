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
import Frequency from './Frequency';

/**
 * The FrequencyRoot model module.
 * @module model/FrequencyRoot
 * @version 0.9.0
 */
class FrequencyRoot {
    /**
     * Constructs a new <code>FrequencyRoot</code>.
     * @alias module:model/FrequencyRoot
     * @param data {Object.<String, module:model/Frequency>} 
     */
    constructor(data) { 
        
        FrequencyRoot.initialize(this, data);
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
     * Constructs a <code>FrequencyRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FrequencyRoot} obj Optional instance to populate.
     * @return {module:model/FrequencyRoot} The populated <code>FrequencyRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FrequencyRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': Frequency});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/Frequency>} data
 */
FrequencyRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
FrequencyRoot.prototype['meta'] = undefined;






export default FrequencyRoot;

