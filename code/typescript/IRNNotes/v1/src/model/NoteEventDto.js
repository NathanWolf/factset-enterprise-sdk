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
import RecordChangeDto from './RecordChangeDto';

/**
 * The NoteEventDto model module.
 * @module model/NoteEventDto
 * @version 0.9.0
 */
class NoteEventDto {
    /**
     * Constructs a new <code>NoteEventDto</code>.
     * @alias module:model/NoteEventDto
     */
    constructor() { 
        
        NoteEventDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NoteEventDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NoteEventDto} obj Optional instance to populate.
     * @return {module:model/NoteEventDto} The populated <code>NoteEventDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NoteEventDto();

            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], 'String');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
            if (data.hasOwnProperty('changeList')) {
                obj['changeList'] = ApiClient.convertToType(data['changeList'], [RecordChangeDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} createdAt
 */
NoteEventDto.prototype['createdAt'] = undefined;

/**
 * @member {String} type
 */
NoteEventDto.prototype['type'] = undefined;

/**
 * @member {String} user
 */
NoteEventDto.prototype['user'] = undefined;

/**
 * @member {String} comment
 */
NoteEventDto.prototype['comment'] = undefined;

/**
 * @member {Array.<module:model/RecordChangeDto>} changeList
 */
NoteEventDto.prototype['changeList'] = undefined;






export default NoteEventDto;

