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
 * The RecommendationSettingsDto model module.
 * @module model/RecommendationSettingsDto
 */
class RecommendationSettingsDto {
    /**
     * Constructs a new <code>RecommendationSettingsDto</code>.
     * @alias module:model/RecommendationSettingsDto
     */
    constructor() { 
        
        RecommendationSettingsDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecommendationSettingsDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecommendationSettingsDto} obj Optional instance to populate.
     * @return {module:model/RecommendationSettingsDto} The populated <code>RecommendationSettingsDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecommendationSettingsDto();

            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('isMandatory')) {
                obj['isMandatory'] = ApiClient.convertToType(data['isMandatory'], 'Boolean');
            }
            if (data.hasOwnProperty('usePrevious')) {
                obj['usePrevious'] = ApiClient.convertToType(data['usePrevious'], 'Boolean');
            }
            if (data.hasOwnProperty('defaultId')) {
                obj['defaultId'] = ApiClient.convertToType(data['defaultId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} isHidden
 */
RecommendationSettingsDto.prototype['isHidden'] = undefined;

/**
 * @member {Boolean} isMandatory
 */
RecommendationSettingsDto.prototype['isMandatory'] = undefined;

/**
 * @member {Boolean} usePrevious
 */
RecommendationSettingsDto.prototype['usePrevious'] = undefined;

/**
 * @member {String} defaultId
 */
RecommendationSettingsDto.prototype['defaultId'] = undefined;






export default RecommendationSettingsDto;

