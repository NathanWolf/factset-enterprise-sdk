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
import ContactIdNameDto from './ContactIdNameDto';
import RelationshipCategoryIdNameDto from './RelationshipCategoryIdNameDto';
import RelationshipIdNameDto from './RelationshipIdNameDto';
import RelationshipSymbolSummaryDto from './RelationshipSymbolSummaryDto';

/**
 * The ContactRelationshipDto model module.
 * @module model/ContactRelationshipDto
 * @version 0.20.0
 */
class ContactRelationshipDto {
    /**
     * Constructs a new <code>ContactRelationshipDto</code>.
     * @alias module:model/ContactRelationshipDto
     */
    constructor() { 
        
        ContactRelationshipDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ContactRelationshipDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ContactRelationshipDto} obj Optional instance to populate.
     * @return {module:model/ContactRelationshipDto} The populated <code>ContactRelationshipDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ContactRelationshipDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('RelationshipCategory')) {
                obj['RelationshipCategory'] = RelationshipCategoryIdNameDto.constructFromObject(data['RelationshipCategory']);
            }
            if (data.hasOwnProperty('Relationship')) {
                obj['Relationship'] = RelationshipIdNameDto.constructFromObject(data['Relationship']);
            }
            if (data.hasOwnProperty('Contact')) {
                obj['Contact'] = ContactIdNameDto.constructFromObject(data['Contact']);
            }
            if (data.hasOwnProperty('Symbol')) {
                obj['Symbol'] = RelationshipSymbolSummaryDto.constructFromObject(data['Symbol']);
            }
            if (data.hasOwnProperty('IsCurrent')) {
                obj['IsCurrent'] = ApiClient.convertToType(data['IsCurrent'], 'Boolean');
            }
            if (data.hasOwnProperty('Start')) {
                obj['Start'] = ApiClient.convertToType(data['Start'], 'Date');
            }
            if (data.hasOwnProperty('End')) {
                obj['End'] = ApiClient.convertToType(data['End'], 'Date');
            }
            if (data.hasOwnProperty('Title')) {
                obj['Title'] = ApiClient.convertToType(data['Title'], 'String');
            }
            if (data.hasOwnProperty('Comment')) {
                obj['Comment'] = ApiClient.convertToType(data['Comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
ContactRelationshipDto.prototype['Id'] = undefined;

/**
 * @member {module:model/RelationshipCategoryIdNameDto} RelationshipCategory
 */
ContactRelationshipDto.prototype['RelationshipCategory'] = undefined;

/**
 * @member {module:model/RelationshipIdNameDto} Relationship
 */
ContactRelationshipDto.prototype['Relationship'] = undefined;

/**
 * @member {module:model/ContactIdNameDto} Contact
 */
ContactRelationshipDto.prototype['Contact'] = undefined;

/**
 * @member {module:model/RelationshipSymbolSummaryDto} Symbol
 */
ContactRelationshipDto.prototype['Symbol'] = undefined;

/**
 * @member {Boolean} IsCurrent
 */
ContactRelationshipDto.prototype['IsCurrent'] = undefined;

/**
 * @member {Date} Start
 */
ContactRelationshipDto.prototype['Start'] = undefined;

/**
 * @member {Date} End
 */
ContactRelationshipDto.prototype['End'] = undefined;

/**
 * @member {String} Title
 */
ContactRelationshipDto.prototype['Title'] = undefined;

/**
 * @member {String} Comment
 */
ContactRelationshipDto.prototype['Comment'] = undefined;






export default ContactRelationshipDto;

