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
 * @version 0.20.0
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

            if (data.hasOwnProperty('CreatedAt')) {
                obj['CreatedAt'] = ApiClient.convertToType(data['CreatedAt'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('User')) {
                obj['User'] = ApiClient.convertToType(data['User'], 'String');
            }
            if (data.hasOwnProperty('Comment')) {
                obj['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
            }
            if (data.hasOwnProperty('ChangeList')) {
                obj['ChangeList'] = ApiClient.convertToType(data['ChangeList'], [RecordChangeDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} CreatedAt
 */
NoteEventDto.prototype['CreatedAt'] = undefined;

/**
 * @member {String} Type
 */
NoteEventDto.prototype['Type'] = undefined;

/**
 * @member {String} User
 */
NoteEventDto.prototype['User'] = undefined;

/**
 * @member {String} Comment
 */
NoteEventDto.prototype['Comment'] = undefined;

/**
 * @member {Array.<module:model/RecordChangeDto>} ChangeList
 */
NoteEventDto.prototype['ChangeList'] = undefined;






export default NoteEventDto;

