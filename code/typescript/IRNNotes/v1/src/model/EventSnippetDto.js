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
 * The EventSnippetDto model module.
 * @module model/EventSnippetDto
 * @version 0.20.0
 */
class EventSnippetDto {
    /**
     * Constructs a new <code>EventSnippetDto</code>.
     * @alias module:model/EventSnippetDto
     */
    constructor() { 
        
        EventSnippetDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EventSnippetDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventSnippetDto} obj Optional instance to populate.
     * @return {module:model/EventSnippetDto} The populated <code>EventSnippetDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventSnippetDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('NoteId')) {
                obj['NoteId'] = ApiClient.convertToType(data['NoteId'], 'String');
            }
            if (data.hasOwnProperty('MeetingId')) {
                obj['MeetingId'] = ApiClient.convertToType(data['MeetingId'], 'String');
            }
            if (data.hasOwnProperty('CreatedAt')) {
                obj['CreatedAt'] = ApiClient.convertToType(data['CreatedAt'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
EventSnippetDto.prototype['Id'] = undefined;

/**
 * @member {String} Type
 */
EventSnippetDto.prototype['Type'] = undefined;

/**
 * @member {String} NoteId
 */
EventSnippetDto.prototype['NoteId'] = undefined;

/**
 * @member {String} MeetingId
 */
EventSnippetDto.prototype['MeetingId'] = undefined;

/**
 * @member {Date} CreatedAt
 */
EventSnippetDto.prototype['CreatedAt'] = undefined;






export default EventSnippetDto;

