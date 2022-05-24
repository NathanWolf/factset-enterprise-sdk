/**
 * ModelAccounts API
 * Allow clients to fetch ModelAccounts Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ModelAccountFields from './ModelAccountFields';

/**
 * The ModelAccountFieldsRoot model module.
 * @module model/ModelAccountFieldsRoot
 * @version 0.20.0
 */
class ModelAccountFieldsRoot {
    /**
     * Constructs a new <code>ModelAccountFieldsRoot</code>.
     * @alias module:model/ModelAccountFieldsRoot
     * @param data {module:model/ModelAccountFields} 
     */
    constructor(data) { 
        
        ModelAccountFieldsRoot.initialize(this, data);
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
     * Constructs a <code>ModelAccountFieldsRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ModelAccountFieldsRoot} obj Optional instance to populate.
     * @return {module:model/ModelAccountFieldsRoot} The populated <code>ModelAccountFieldsRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ModelAccountFieldsRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ModelAccountFields.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], {'String': 'String'});
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ModelAccountFields} data
 */
ModelAccountFieldsRoot.prototype['data'] = undefined;

/**
 * @member {Object.<String, String>} meta
 */
ModelAccountFieldsRoot.prototype['meta'] = undefined;






export default ModelAccountFieldsRoot;

