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
 * @version 0.20.0
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

            if (data.hasOwnProperty('Author')) {
                obj['Author'] = UserSerialDto.constructFromObject(data['Author']);
            }
            if (data.hasOwnProperty('Title')) {
                obj['Title'] = ApiClient.convertToType(data['Title'], 'String');
            }
            if (data.hasOwnProperty('SubjectId')) {
                obj['SubjectId'] = ApiClient.convertToType(data['SubjectId'], 'String');
            }
            if (data.hasOwnProperty('NoteDate')) {
                obj['NoteDate'] = ApiClient.convertToType(data['NoteDate'], 'String');
            }
            if (data.hasOwnProperty('RecommendationId')) {
                obj['RecommendationId'] = ApiClient.convertToType(data['RecommendationId'], 'String');
            }
            if (data.hasOwnProperty('SentimentId')) {
                obj['SentimentId'] = ApiClient.convertToType(data['SentimentId'], 'String');
            }
            if (data.hasOwnProperty('Body')) {
                obj['Body'] = CreateBodyDto.constructFromObject(data['Body']);
            }
            if (data.hasOwnProperty('Source')) {
                obj['Source'] = ApiClient.convertToType(data['Source'], 'String');
            }
            if (data.hasOwnProperty('Link')) {
                obj['Link'] = ApiClient.convertToType(data['Link'], 'String');
            }
            if (data.hasOwnProperty('RelatedSymbols')) {
                obj['RelatedSymbols'] = ApiClient.convertToType(data['RelatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('RelatedContacts')) {
                obj['RelatedContacts'] = ApiClient.convertToType(data['RelatedContacts'], ['String']);
            }
            if (data.hasOwnProperty('RelatedRecords')) {
                obj['RelatedRecords'] = RelatedRecordsDto.constructFromObject(data['RelatedRecords']);
            }
            if (data.hasOwnProperty('CustomFieldValues')) {
                obj['CustomFieldValues'] = ApiClient.convertToType(data['CustomFieldValues'], [CreateCustomFieldValueDto]);
            }
            if (data.hasOwnProperty('IsPersonal')) {
                obj['IsPersonal'] = ApiClient.convertToType(data['IsPersonal'], 'Boolean');
            }
            if (data.hasOwnProperty('Identifier')) {
                obj['Identifier'] = ApiClient.convertToType(data['Identifier'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UserSerialDto} Author
 */
UpdateNoteDto.prototype['Author'] = undefined;

/**
 * @member {String} Title
 */
UpdateNoteDto.prototype['Title'] = undefined;

/**
 * @member {String} SubjectId
 */
UpdateNoteDto.prototype['SubjectId'] = undefined;

/**
 * @member {String} NoteDate
 */
UpdateNoteDto.prototype['NoteDate'] = undefined;

/**
 * @member {String} RecommendationId
 */
UpdateNoteDto.prototype['RecommendationId'] = undefined;

/**
 * @member {String} SentimentId
 */
UpdateNoteDto.prototype['SentimentId'] = undefined;

/**
 * @member {module:model/CreateBodyDto} Body
 */
UpdateNoteDto.prototype['Body'] = undefined;

/**
 * @member {String} Source
 */
UpdateNoteDto.prototype['Source'] = undefined;

/**
 * @member {String} Link
 */
UpdateNoteDto.prototype['Link'] = undefined;

/**
 * @member {Array.<String>} RelatedSymbols
 */
UpdateNoteDto.prototype['RelatedSymbols'] = undefined;

/**
 * @member {Array.<String>} RelatedContacts
 */
UpdateNoteDto.prototype['RelatedContacts'] = undefined;

/**
 * @member {module:model/RelatedRecordsDto} RelatedRecords
 */
UpdateNoteDto.prototype['RelatedRecords'] = undefined;

/**
 * @member {Array.<module:model/CreateCustomFieldValueDto>} CustomFieldValues
 */
UpdateNoteDto.prototype['CustomFieldValues'] = undefined;

/**
 * @member {Boolean} IsPersonal
 */
UpdateNoteDto.prototype['IsPersonal'] = undefined;

/**
 * @member {String} Identifier
 */
UpdateNoteDto.prototype['Identifier'] = undefined;






export default UpdateNoteDto;

