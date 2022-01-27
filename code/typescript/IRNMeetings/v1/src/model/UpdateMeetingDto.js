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
import ReferenceAttendeeDto from './ReferenceAttendeeDto';
import RelatedRecordsDto from './RelatedRecordsDto';

/**
 * The UpdateMeetingDto model module.
 * @module model/UpdateMeetingDto
 * @version 0.9.0
 */
class UpdateMeetingDto {
    /**
     * Constructs a new <code>UpdateMeetingDto</code>.
     * @alias module:model/UpdateMeetingDto
     * @param title {String} 
     * @param identifier {String} 
     * @param start {String} 
     * @param end {String} 
     */
    constructor(title, identifier, start, end) { 
        
        UpdateMeetingDto.initialize(this, title, identifier, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, title, identifier, start, end) { 
        obj['title'] = title;
        obj['identifier'] = identifier;
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>UpdateMeetingDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateMeetingDto} obj Optional instance to populate.
     * @return {module:model/UpdateMeetingDto} The populated <code>UpdateMeetingDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateMeetingDto();

            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
            if (data.hasOwnProperty('locations')) {
                obj['locations'] = ApiClient.convertToType(data['locations'], ['String']);
            }
            if (data.hasOwnProperty('organizer')) {
                obj['organizer'] = ApiClient.convertToType(data['organizer'], 'String');
            }
            if (data.hasOwnProperty('organizerId')) {
                obj['organizerId'] = ApiClient.convertToType(data['organizerId'], 'String');
            }
            if (data.hasOwnProperty('attendees')) {
                obj['attendees'] = ApiClient.convertToType(data['attendees'], [ReferenceAttendeeDto]);
            }
            if (data.hasOwnProperty('alertAttendees')) {
                obj['alertAttendees'] = ApiClient.convertToType(data['alertAttendees'], 'Boolean');
            }
            if (data.hasOwnProperty('alertAuthor')) {
                obj['alertAuthor'] = ApiClient.convertToType(data['alertAuthor'], 'Boolean');
            }
            if (data.hasOwnProperty('relatedRecords')) {
                obj['relatedRecords'] = RelatedRecordsDto.constructFromObject(data['relatedRecords']);
            }
            if (data.hasOwnProperty('relatedContacts')) {
                obj['relatedContacts'] = ApiClient.convertToType(data['relatedContacts'], ['String']);
            }
            if (data.hasOwnProperty('relatedSymbols')) {
                obj['relatedSymbols'] = ApiClient.convertToType(data['relatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('body')) {
                obj['body'] = CreateBodyDto.constructFromObject(data['body']);
            }
            if (data.hasOwnProperty('customFieldValues')) {
                obj['customFieldValues'] = ApiClient.convertToType(data['customFieldValues'], [CreateCustomFieldValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} title
 */
UpdateMeetingDto.prototype['title'] = undefined;

/**
 * @member {String} identifier
 */
UpdateMeetingDto.prototype['identifier'] = undefined;

/**
 * @member {String} start
 */
UpdateMeetingDto.prototype['start'] = undefined;

/**
 * @member {String} end
 */
UpdateMeetingDto.prototype['end'] = undefined;

/**
 * @member {Array.<String>} locations
 */
UpdateMeetingDto.prototype['locations'] = undefined;

/**
 * @member {String} organizer
 */
UpdateMeetingDto.prototype['organizer'] = undefined;

/**
 * @member {String} organizerId
 */
UpdateMeetingDto.prototype['organizerId'] = undefined;

/**
 * @member {Array.<module:model/ReferenceAttendeeDto>} attendees
 */
UpdateMeetingDto.prototype['attendees'] = undefined;

/**
 * @member {Boolean} alertAttendees
 * @default false
 */
UpdateMeetingDto.prototype['alertAttendees'] = false;

/**
 * @member {Boolean} alertAuthor
 * @default false
 */
UpdateMeetingDto.prototype['alertAuthor'] = false;

/**
 * @member {module:model/RelatedRecordsDto} relatedRecords
 */
UpdateMeetingDto.prototype['relatedRecords'] = undefined;

/**
 * @member {Array.<String>} relatedContacts
 */
UpdateMeetingDto.prototype['relatedContacts'] = undefined;

/**
 * @member {Array.<String>} relatedSymbols
 */
UpdateMeetingDto.prototype['relatedSymbols'] = undefined;

/**
 * @member {module:model/CreateBodyDto} body
 */
UpdateMeetingDto.prototype['body'] = undefined;

/**
 * @member {Array.<module:model/CreateCustomFieldValueDto>} customFieldValues
 */
UpdateMeetingDto.prototype['customFieldValues'] = undefined;






export default UpdateMeetingDto;

