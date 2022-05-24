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
 * The RelationshipSaveDto model module.
 * @module model/RelationshipSaveDto
 * @version 0.20.0
 */
class RelationshipSaveDto {
    /**
     * Constructs a new <code>RelationshipSaveDto</code>.
     * @alias module:model/RelationshipSaveDto
     * @param relationshipCategoryId {String} 
     * @param hideDates {Boolean} 
     * @param hideComment {Boolean} 
     * @param hideCompany {Boolean} 
     */
    constructor(relationshipCategoryId, hideDates, hideComment, hideCompany) { 
        
        RelationshipSaveDto.initialize(this, relationshipCategoryId, hideDates, hideComment, hideCompany);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, relationshipCategoryId, hideDates, hideComment, hideCompany) { 
        obj['RelationshipCategoryId'] = relationshipCategoryId;
        obj['HideDates'] = hideDates || false;
        obj['HideComment'] = hideComment || false;
        obj['HideCompany'] = hideCompany || false;
    }

    /**
     * Constructs a <code>RelationshipSaveDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelationshipSaveDto} obj Optional instance to populate.
     * @return {module:model/RelationshipSaveDto} The populated <code>RelationshipSaveDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelationshipSaveDto();

            if (data.hasOwnProperty('RelationshipCategoryId')) {
                obj['RelationshipCategoryId'] = ApiClient.convertToType(data['RelationshipCategoryId'], 'String');
            }
            if (data.hasOwnProperty('RelationshipCode')) {
                obj['RelationshipCode'] = ApiClient.convertToType(data['RelationshipCode'], 'String');
            }
            if (data.hasOwnProperty('BidirectionalName')) {
                obj['BidirectionalName'] = ApiClient.convertToType(data['BidirectionalName'], 'String');
            }
            if (data.hasOwnProperty('LeftToRightName')) {
                obj['LeftToRightName'] = ApiClient.convertToType(data['LeftToRightName'], 'String');
            }
            if (data.hasOwnProperty('RightToLeftName')) {
                obj['RightToLeftName'] = ApiClient.convertToType(data['RightToLeftName'], 'String');
            }
            if (data.hasOwnProperty('HideDates')) {
                obj['HideDates'] = ApiClient.convertToType(data['HideDates'], 'Boolean');
            }
            if (data.hasOwnProperty('HideComment')) {
                obj['HideComment'] = ApiClient.convertToType(data['HideComment'], 'Boolean');
            }
            if (data.hasOwnProperty('HideCompany')) {
                obj['HideCompany'] = ApiClient.convertToType(data['HideCompany'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} RelationshipCategoryId
 */
RelationshipSaveDto.prototype['RelationshipCategoryId'] = undefined;

/**
 * @member {String} RelationshipCode
 */
RelationshipSaveDto.prototype['RelationshipCode'] = undefined;

/**
 * @member {String} BidirectionalName
 */
RelationshipSaveDto.prototype['BidirectionalName'] = undefined;

/**
 * @member {String} LeftToRightName
 */
RelationshipSaveDto.prototype['LeftToRightName'] = undefined;

/**
 * @member {String} RightToLeftName
 */
RelationshipSaveDto.prototype['RightToLeftName'] = undefined;

/**
 * @member {Boolean} HideDates
 * @default false
 */
RelationshipSaveDto.prototype['HideDates'] = false;

/**
 * @member {Boolean} HideComment
 * @default false
 */
RelationshipSaveDto.prototype['HideComment'] = false;

/**
 * @member {Boolean} HideCompany
 * @default false
 */
RelationshipSaveDto.prototype['HideCompany'] = false;






export default RelationshipSaveDto;

