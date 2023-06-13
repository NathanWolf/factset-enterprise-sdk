/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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
 * The ContactCustomFieldOptionValueDto model module.
 * @module model/ContactCustomFieldOptionValueDto
 */
class ContactCustomFieldOptionValueDto {
    /**
     * Constructs a new <code>ContactCustomFieldOptionValueDto</code>.
     * @alias module:model/ContactCustomFieldOptionValueDto
     */
    constructor() { 
        
        ContactCustomFieldOptionValueDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactCustomFieldOptionValueDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactCustomFieldOptionValueDto} obj Optional instance to populate.
     * @return {module:model/ContactCustomFieldOptionValueDto} The populated <code>ContactCustomFieldOptionValueDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactCustomFieldOptionValueDto();

            if (data.hasOwnProperty('optionId')) {
                obj['optionId'] = ApiClient.convertToType(data['optionId'], 'String');
            }
            if (data.hasOwnProperty('optionName')) {
                obj['optionName'] = ApiClient.convertToType(data['optionName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} optionId
 */
ContactCustomFieldOptionValueDto.prototype['optionId'] = undefined;

/**
 * @member {String} optionName
 */
ContactCustomFieldOptionValueDto.prototype['optionName'] = undefined;






export default ContactCustomFieldOptionValueDto;

