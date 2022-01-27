/**
 * IRN API v1
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ContactCustomFieldOptionDto model module.
 * @module model/ContactCustomFieldOptionDto
 * @version 0.9.0
 */
class ContactCustomFieldOptionDto {
    /**
     * Constructs a new <code>ContactCustomFieldOptionDto</code>.
     * @alias module:model/ContactCustomFieldOptionDto
     */
    constructor() { 
        
        ContactCustomFieldOptionDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactCustomFieldOptionDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactCustomFieldOptionDto} obj Optional instance to populate.
     * @return {module:model/ContactCustomFieldOptionDto} The populated <code>ContactCustomFieldOptionDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactCustomFieldOptionDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('order')) {
                obj['order'] = ApiClient.convertToType(data['order'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
ContactCustomFieldOptionDto.prototype['id'] = undefined;

/**
 * @member {String} name
 */
ContactCustomFieldOptionDto.prototype['name'] = undefined;

/**
 * @member {Number} order
 */
ContactCustomFieldOptionDto.prototype['order'] = undefined;






export default ContactCustomFieldOptionDto;

