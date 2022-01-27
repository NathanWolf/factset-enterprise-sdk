/**
 * IRN API v1
 * Allows users to create, update and configure IRN data.
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
 * The SubjectSummaryDto model module.
 * @module model/SubjectSummaryDto
 * @version 0.9.0
 */
class SubjectSummaryDto {
    /**
     * Constructs a new <code>SubjectSummaryDto</code>.
     * @alias module:model/SubjectSummaryDto
     */
    constructor() { 
        
        SubjectSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SubjectSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SubjectSummaryDto} obj Optional instance to populate.
     * @return {module:model/SubjectSummaryDto} The populated <code>SubjectSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubjectSummaryDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('identifierType')) {
                obj['identifierType'] = ApiClient.convertToType(data['identifierType'], 'String');
            }
            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
SubjectSummaryDto.prototype['id'] = undefined;

/**
 * @member {String} name
 */
SubjectSummaryDto.prototype['name'] = undefined;

/**
 * @member {String} code
 */
SubjectSummaryDto.prototype['code'] = undefined;

/**
 * @member {String} identifierType
 */
SubjectSummaryDto.prototype['identifierType'] = undefined;

/**
 * @member {Boolean} isHidden
 */
SubjectSummaryDto.prototype['isHidden'] = undefined;






export default SubjectSummaryDto;

