/**
 * PA Engine API
 * Allow clients to fetch PA Engine Analytics through APIs.
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
 * The Group model module.
 * @module model/Group
 * @version 0.8.2
 */
class Group {
    /**
     * Constructs a new <code>Group</code>.
     * @alias module:model/Group
     */
    constructor() { 
        
        Group.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Group</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Group} obj Optional instance to populate.
     * @return {module:model/Group} The populated <code>Group</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Group();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('directory')) {
                obj['directory'] = ApiClient.convertToType(data['directory'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Group Name
 * @member {String} name
 */
Group.prototype['name'] = undefined;

/**
 * Group Directory
 * @member {String} directory
 */
Group.prototype['directory'] = undefined;

/**
 * Group Category
 * @member {String} category
 */
Group.prototype['category'] = undefined;






export default Group;

