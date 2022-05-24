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
import InlineResponse20031DataParentLevel from './InlineResponse20031DataParentLevel';

/**
 * The InlineResponse20031DataParent model module.
 * @module model/InlineResponse20031DataParent
 * @version 0.9.2
 */
class InlineResponse20031DataParent {
    /**
     * Constructs a new <code>InlineResponse20031DataParent</code>.
     * Parent category. The attributes of the parent category are &#x60;null&#x60; if this category is on the first level.
     * @alias module:model/InlineResponse20031DataParent
     */
    constructor() { 
        
        InlineResponse20031DataParent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20031DataParent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20031DataParent} obj Optional instance to populate.
     * @return {module:model/InlineResponse20031DataParent} The populated <code>InlineResponse20031DataParent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20031DataParent();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = InlineResponse20031DataParentLevel.constructFromObject(data['level']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the category.
 * @member {Number} id
 */
InlineResponse20031DataParent.prototype['id'] = undefined;

/**
 * Name of the category.
 * @member {String} name
 */
InlineResponse20031DataParent.prototype['name'] = undefined;

/**
 * @member {module:model/InlineResponse20031DataParentLevel} level
 */
InlineResponse20031DataParent.prototype['level'] = undefined;






export default InlineResponse20031DataParent;

