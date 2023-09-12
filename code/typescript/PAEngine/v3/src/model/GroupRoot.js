/**
 * PA Engine API
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
import Group from './Group';

/**
 * The GroupRoot model module.
 * @module model/GroupRoot
 */
class GroupRoot {
    /**
     * Constructs a new <code>GroupRoot</code>.
     * @alias module:model/GroupRoot
     * @param data {Object.<String, module:model/Group>} 
     */
    constructor(data) { 
        
        GroupRoot.initialize(this, data);
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
     * Constructs a <code>GroupRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GroupRoot} obj Optional instance to populate.
     * @return {module:model/GroupRoot} The populated <code>GroupRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GroupRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': Group});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/Group>} data
 */
GroupRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
GroupRoot.prototype['meta'] = undefined;






export default GroupRoot;

