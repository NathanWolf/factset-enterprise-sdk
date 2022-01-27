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
import CreateBodyDto from './CreateBodyDto';
import CreateCustomFieldValueDto from './CreateCustomFieldValueDto';
import RelatedRecordsDto from './RelatedRecordsDto';
import UserSerialDto from './UserSerialDto';

/**
 * The UpdateNoteDto model module.
 * @module model/UpdateNoteDto
 * @version 0.9.0
 */
class UpdateNoteDto {
    /**
     * Constructs a new <code>UpdateNoteDto</code>.
     * @alias module:model/UpdateNoteDto
     */
    constructor() { 
        
        UpdateNoteDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateNoteDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateNoteDto} obj Optional instance to populate.
     * @return {module:model/UpdateNoteDto} The populated <code>UpdateNoteDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateNoteDto();

            if (data.hasOwnProperty('author')) {
                obj['author'] = UserSerialDto.constructFromObject(data['author']);
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('recommendationId')) {
                obj['recommendationId'] = ApiClient.convertToType(data['recommendationId'], 'String');
            }
            if (data.hasOwnProperty('sentimentId')) {
                obj['sentimentId'] = ApiClient.convertToType(data['sentimentId'], 'String');
            }
            if (data.hasOwnProperty('body')) {
                obj['body'] = CreateBodyDto.constructFromObject(data['body']);
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
            if (data.hasOwnProperty('relatedSymbols')) {
                obj['relatedSymbols'] = ApiClient.convertToType(data['relatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('relatedContacts')) {
                obj['relatedContacts'] = ApiClient.convertToType(data['relatedContacts'], ['String']);
            }
            if (data.hasOwnProperty('relatedRecords')) {
                obj['relatedRecords'] = RelatedRecordsDto.constructFromObject(data['relatedRecords']);
            }
            if (data.hasOwnProperty('customFieldValues')) {
                obj['customFieldValues'] = ApiClient.convertToType(data['customFieldValues'], [CreateCustomFieldValueDto]);
            }
            if (data.hasOwnProperty('isPersonal')) {
                obj['isPersonal'] = ApiClient.convertToType(data['isPersonal'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UserSerialDto} author
 */
UpdateNoteDto.prototype['author'] = undefined;

/**
 * @member {String} title
 */
UpdateNoteDto.prototype['title'] = undefined;

/**
 * @member {String} recommendationId
 */
UpdateNoteDto.prototype['recommendationId'] = undefined;

/**
 * @member {String} sentimentId
 */
UpdateNoteDto.prototype['sentimentId'] = undefined;

/**
 * @member {module:model/CreateBodyDto} body
 */
UpdateNoteDto.prototype['body'] = undefined;

/**
 * @member {String} source
 */
UpdateNoteDto.prototype['source'] = undefined;

/**
 * @member {String} link
 */
UpdateNoteDto.prototype['link'] = undefined;

/**
 * @member {Array.<String>} relatedSymbols
 */
UpdateNoteDto.prototype['relatedSymbols'] = undefined;

/**
 * @member {Array.<String>} relatedContacts
 */
UpdateNoteDto.prototype['relatedContacts'] = undefined;

/**
 * @member {module:model/RelatedRecordsDto} relatedRecords
 */
UpdateNoteDto.prototype['relatedRecords'] = undefined;

/**
 * @member {Array.<module:model/CreateCustomFieldValueDto>} customFieldValues
 */
UpdateNoteDto.prototype['customFieldValues'] = undefined;

/**
 * @member {Boolean} isPersonal
 */
UpdateNoteDto.prototype['isPersonal'] = undefined;






export default UpdateNoteDto;

