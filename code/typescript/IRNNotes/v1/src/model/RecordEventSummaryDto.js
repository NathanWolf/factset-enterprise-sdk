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
 * The RecordEventSummaryDto model module.
 * @module model/RecordEventSummaryDto
 * @version 0.20.0
 */
class RecordEventSummaryDto {
    /**
     * Constructs a new <code>RecordEventSummaryDto</code>.
     * @alias module:model/RecordEventSummaryDto
     */
    constructor() { 
        
        RecordEventSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecordEventSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecordEventSummaryDto} obj Optional instance to populate.
     * @return {module:model/RecordEventSummaryDto} The populated <code>RecordEventSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecordEventSummaryDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Type')) {
                obj['Type'] = ApiClient.convertToType(data['Type'], 'String');
            }
            if (data.hasOwnProperty('CreatedAt')) {
                obj['CreatedAt'] = ApiClient.convertToType(data['CreatedAt'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
RecordEventSummaryDto.prototype['Id'] = undefined;

/**
 * @member {String} Type
 */
RecordEventSummaryDto.prototype['Type'] = undefined;

/**
 * @member {String} CreatedAt
 */
RecordEventSummaryDto.prototype['CreatedAt'] = undefined;






export default RecordEventSummaryDto;

