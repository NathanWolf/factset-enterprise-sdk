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
 * The TeamConfigDto model module.
 * @module model/TeamConfigDto
 * @version 0.20.0
 */
class TeamConfigDto {
    /**
     * Constructs a new <code>TeamConfigDto</code>.
     * @alias module:model/TeamConfigDto
     */
    constructor() { 
        
        TeamConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TeamConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TeamConfigDto} obj Optional instance to populate.
     * @return {module:model/TeamConfigDto} The populated <code>TeamConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TeamConfigDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Code')) {
                obj['Code'] = ApiClient.convertToType(data['Code'], 'String');
            }
            if (data.hasOwnProperty('DefaultSubjectId')) {
                obj['DefaultSubjectId'] = ApiClient.convertToType(data['DefaultSubjectId'], 'String');
            }
            if (data.hasOwnProperty('UserIds')) {
                obj['UserIds'] = ApiClient.convertToType(data['UserIds'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
TeamConfigDto.prototype['Id'] = undefined;

/**
 * @member {String} Name
 */
TeamConfigDto.prototype['Name'] = undefined;

/**
 * @member {String} Code
 */
TeamConfigDto.prototype['Code'] = undefined;

/**
 * @member {String} DefaultSubjectId
 */
TeamConfigDto.prototype['DefaultSubjectId'] = undefined;

/**
 * @member {Array.<String>} UserIds
 */
TeamConfigDto.prototype['UserIds'] = undefined;






export default TeamConfigDto;

