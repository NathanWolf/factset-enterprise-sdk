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
import ContactCustomFieldFormulaDto from './ContactCustomFieldFormulaDto';
import ContactCustomFieldOptionSaveDto from './ContactCustomFieldOptionSaveDto';
import ContactCustomFieldType from './ContactCustomFieldType';

/**
 * The ContactCustomFieldSaveDto model module.
 * @module model/ContactCustomFieldSaveDto
 */
class ContactCustomFieldSaveDto {
    /**
     * Constructs a new <code>ContactCustomFieldSaveDto</code>.
     * @alias module:model/ContactCustomFieldSaveDto
     * @param code {String} 
     * @param name {String} 
     * @param type {module:model/ContactCustomFieldType} 
     * @param isHidden {Boolean} 
     * @param isMandatory {Boolean} 
     */
    constructor(code, name, type, isHidden, isMandatory) { 
        
        ContactCustomFieldSaveDto.initialize(this, code, name, type, isHidden, isMandatory);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, code, name, type, isHidden, isMandatory) { 
        obj['code'] = code;
        obj['name'] = name;
        obj['type'] = type;
        obj['isHidden'] = isHidden || false;
        obj['isMandatory'] = isMandatory || false;
    }

    /**
     * Constructs a <code>ContactCustomFieldSaveDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactCustomFieldSaveDto} obj Optional instance to populate.
     * @return {module:model/ContactCustomFieldSaveDto} The populated <code>ContactCustomFieldSaveDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactCustomFieldSaveDto();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ContactCustomFieldType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('isMandatory')) {
                obj['isMandatory'] = ApiClient.convertToType(data['isMandatory'], 'Boolean');
            }
            if (data.hasOwnProperty('fieldFormula')) {
                obj['fieldFormula'] = ContactCustomFieldFormulaDto.constructFromObject(data['fieldFormula']);
            }
            if (data.hasOwnProperty('contactCustomFieldOptions')) {
                obj['contactCustomFieldOptions'] = ApiClient.convertToType(data['contactCustomFieldOptions'], [ContactCustomFieldOptionSaveDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} code
 */
ContactCustomFieldSaveDto.prototype['code'] = undefined;

/**
 * @member {String} name
 */
ContactCustomFieldSaveDto.prototype['name'] = undefined;

/**
 * @member {module:model/ContactCustomFieldType} type
 */
ContactCustomFieldSaveDto.prototype['type'] = undefined;

/**
 * @member {Boolean} isHidden
 * @default false
 */
ContactCustomFieldSaveDto.prototype['isHidden'] = false;

/**
 * @member {Boolean} isMandatory
 * @default false
 */
ContactCustomFieldSaveDto.prototype['isMandatory'] = false;

/**
 * @member {module:model/ContactCustomFieldFormulaDto} fieldFormula
 */
ContactCustomFieldSaveDto.prototype['fieldFormula'] = undefined;

/**
 * @member {Array.<module:model/ContactCustomFieldOptionSaveDto>} contactCustomFieldOptions
 */
ContactCustomFieldSaveDto.prototype['contactCustomFieldOptions'] = undefined;






export default ContactCustomFieldSaveDto;

