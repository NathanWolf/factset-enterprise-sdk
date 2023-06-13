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
import CustomFieldValueDto from './CustomFieldValueDto';
import RelatedRecordsDto from './RelatedRecordsDto';

/**
 * The NoteDto model module.
 * @module model/NoteDto
 */
class NoteDto {
    /**
     * Constructs a new <code>NoteDto</code>.
     * @alias module:model/NoteDto
     */
    constructor() { 
        
        NoteDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NoteDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NoteDto} obj Optional instance to populate.
     * @return {module:model/NoteDto} The populated <code>NoteDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NoteDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
            if (data.hasOwnProperty('authorId')) {
                obj['authorId'] = ApiClient.convertToType(data['authorId'], 'String');
            }
            if (data.hasOwnProperty('contributorId')) {
                obj['contributorId'] = ApiClient.convertToType(data['contributorId'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('relatedSymbols')) {
                obj['relatedSymbols'] = ApiClient.convertToType(data['relatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('subjectId')) {
                obj['subjectId'] = ApiClient.convertToType(data['subjectId'], 'String');
            }
            if (data.hasOwnProperty('recommendationId')) {
                obj['recommendationId'] = ApiClient.convertToType(data['recommendationId'], 'String');
            }
            if (data.hasOwnProperty('sentimentId')) {
                obj['sentimentId'] = ApiClient.convertToType(data['sentimentId'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
            if (data.hasOwnProperty('body')) {
                obj['body'] = ApiClient.convertToType(data['body'], 'String');
            }
            if (data.hasOwnProperty('isPersonal')) {
                obj['isPersonal'] = ApiClient.convertToType(data['isPersonal'], 'Boolean');
            }
            if (data.hasOwnProperty('state')) {
                obj['state'] = ApiClient.convertToType(data['state'], 'String');
            }
            if (data.hasOwnProperty('approvalStatus')) {
                obj['approvalStatus'] = ApiClient.convertToType(data['approvalStatus'], 'String');
            }
            if (data.hasOwnProperty('averageRating')) {
                obj['averageRating'] = ApiClient.convertToType(data['averageRating'], 'Number');
            }
            if (data.hasOwnProperty('relatedRecords')) {
                obj['relatedRecords'] = RelatedRecordsDto.constructFromObject(data['relatedRecords']);
            }
            if (data.hasOwnProperty('relatedContacts')) {
                obj['relatedContacts'] = ApiClient.convertToType(data['relatedContacts'], ['String']);
            }
            if (data.hasOwnProperty('customFields')) {
                obj['customFields'] = ApiClient.convertToType(data['customFields'], [CustomFieldValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
NoteDto.prototype['id'] = undefined;

/**
 * @member {String} date
 */
NoteDto.prototype['date'] = undefined;

/**
 * @member {String} createdAt
 */
NoteDto.prototype['createdAt'] = undefined;

/**
 * @member {String} authorId
 */
NoteDto.prototype['authorId'] = undefined;

/**
 * @member {String} contributorId
 */
NoteDto.prototype['contributorId'] = undefined;

/**
 * @member {String} title
 */
NoteDto.prototype['title'] = undefined;

/**
 * @member {String} identifier
 */
NoteDto.prototype['identifier'] = undefined;

/**
 * @member {Array.<String>} relatedSymbols
 */
NoteDto.prototype['relatedSymbols'] = undefined;

/**
 * @member {String} subjectId
 */
NoteDto.prototype['subjectId'] = undefined;

/**
 * @member {String} recommendationId
 */
NoteDto.prototype['recommendationId'] = undefined;

/**
 * @member {String} sentimentId
 */
NoteDto.prototype['sentimentId'] = undefined;

/**
 * @member {String} source
 */
NoteDto.prototype['source'] = undefined;

/**
 * @member {String} link
 */
NoteDto.prototype['link'] = undefined;

/**
 * @member {String} body
 */
NoteDto.prototype['body'] = undefined;

/**
 * @member {Boolean} isPersonal
 */
NoteDto.prototype['isPersonal'] = undefined;

/**
 * @member {String} state
 */
NoteDto.prototype['state'] = undefined;

/**
 * @member {String} approvalStatus
 */
NoteDto.prototype['approvalStatus'] = undefined;

/**
 * @member {Number} averageRating
 */
NoteDto.prototype['averageRating'] = undefined;

/**
 * @member {module:model/RelatedRecordsDto} relatedRecords
 */
NoteDto.prototype['relatedRecords'] = undefined;

/**
 * @member {Array.<String>} relatedContacts
 */
NoteDto.prototype['relatedContacts'] = undefined;

/**
 * @member {Array.<module:model/CustomFieldValueDto>} customFields
 */
NoteDto.prototype['customFields'] = undefined;






export default NoteDto;

