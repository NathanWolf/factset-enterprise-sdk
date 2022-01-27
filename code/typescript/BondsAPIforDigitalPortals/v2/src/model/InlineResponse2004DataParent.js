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
 * The InlineResponse2004DataParent model module.
 * @module model/InlineResponse2004DataParent
 * @version 0.9.0
 */
class InlineResponse2004DataParent {
    /**
     * Constructs a new <code>InlineResponse2004DataParent</code>.
     * Parent category or &#x60;null&#x60; if this category is on the first level.
     * @alias module:model/InlineResponse2004DataParent
     */
    constructor() { 
        
        InlineResponse2004DataParent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataParent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataParent} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataParent} The populated <code>InlineResponse2004DataParent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataParent();

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
InlineResponse2004DataParent.prototype['id'] = undefined;






export default InlineResponse2004DataParent;

