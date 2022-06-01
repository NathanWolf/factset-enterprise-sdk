/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UserResource from './UserResource';

/**
 * The UserResourceList model module.
 * @module model/UserResourceList
 * @version 0.20.1
 */
class UserResourceList {
    /**
     * Constructs a new <code>UserResourceList</code>.
     * @alias module:model/UserResourceList
     */
    constructor() { 
        
        UserResourceList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UserResourceList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserResourceList} obj Optional instance to populate.
     * @return {module:model/UserResourceList} The populated <code>UserResourceList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserResourceList();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('totalResults')) {
                obj['totalResults'] = ApiClient.convertToType(data['totalResults'], 'Number');
            }
            if (data.hasOwnProperty('Resources')) {
                obj['Resources'] = ApiClient.convertToType(data['Resources'], [UserResource]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} schemas
 */
UserResourceList.prototype['schemas'] = undefined;

/**
 * @member {Number} totalResults
 */
UserResourceList.prototype['totalResults'] = undefined;

/**
 * @member {Array.<module:model/UserResource>} Resources
 */
UserResourceList.prototype['Resources'] = undefined;






export default UserResourceList;

