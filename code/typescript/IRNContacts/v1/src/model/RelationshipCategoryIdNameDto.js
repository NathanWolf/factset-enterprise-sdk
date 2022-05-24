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
 * The RelationshipCategoryIdNameDto model module.
 * @module model/RelationshipCategoryIdNameDto
 * @version 0.20.0
 */
class RelationshipCategoryIdNameDto {
    /**
     * Constructs a new <code>RelationshipCategoryIdNameDto</code>.
     * @alias module:model/RelationshipCategoryIdNameDto
     */
    constructor() { 
        
        RelationshipCategoryIdNameDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RelationshipCategoryIdNameDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelationshipCategoryIdNameDto} obj Optional instance to populate.
     * @return {module:model/RelationshipCategoryIdNameDto} The populated <code>RelationshipCategoryIdNameDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelationshipCategoryIdNameDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
RelationshipCategoryIdNameDto.prototype['Id'] = undefined;

/**
 * @member {String} Name
 */
RelationshipCategoryIdNameDto.prototype['Name'] = undefined;






export default RelationshipCategoryIdNameDto;

