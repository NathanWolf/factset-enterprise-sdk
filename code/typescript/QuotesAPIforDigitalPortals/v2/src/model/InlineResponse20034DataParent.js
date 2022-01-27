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

/**
 * The InlineResponse20034DataParent model module.
 * @module model/InlineResponse20034DataParent
 * @version 0.9.0
 */
class InlineResponse20034DataParent {
    /**
     * Constructs a new <code>InlineResponse20034DataParent</code>.
     * Parent category. The attributes of the parent category are &#x60;null&#x60; if this category is on the first level.
     * @alias module:model/InlineResponse20034DataParent
     */
    constructor() { 
        
        InlineResponse20034DataParent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20034DataParent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20034DataParent} obj Optional instance to populate.
     * @return {module:model/InlineResponse20034DataParent} The populated <code>InlineResponse20034DataParent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20034DataParent();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the category.
 * @member {Number} id
 */
InlineResponse20034DataParent.prototype['id'] = undefined;






export default InlineResponse20034DataParent;

