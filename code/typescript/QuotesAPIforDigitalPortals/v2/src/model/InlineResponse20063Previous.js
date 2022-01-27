/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20063Previous model module.
 * @module model/InlineResponse20063Previous
 * @version 0.9.0
 */
class InlineResponse20063Previous {
    /**
     * Constructs a new <code>InlineResponse20063Previous</code>.
     * Previous rating.
     * @alias module:model/InlineResponse20063Previous
     */
    constructor() { 
        
        InlineResponse20063Previous.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20063Previous</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20063Previous} obj Optional instance to populate.
     * @return {module:model/InlineResponse20063Previous} The populated <code>InlineResponse20063Previous</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20063Previous();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('grade')) {
                obj['grade'] = ApiClient.convertToType(data['grade'], 'String');
            }
            if (data.hasOwnProperty('rank')) {
                obj['rank'] = ApiClient.convertToType(data['rank'], 'Number');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the rating grade.
 * @member {Number} id
 */
InlineResponse20063Previous.prototype['id'] = undefined;

/**
 * Rating grade.
 * @member {String} grade
 */
InlineResponse20063Previous.prototype['grade'] = undefined;

/**
 * Rank of the rating grade according to the sort order of the rating system.
 * @member {Number} rank
 */
InlineResponse20063Previous.prototype['rank'] = undefined;

/**
 * Date on which the instrument was rated.
 * @member {Date} date
 */
InlineResponse20063Previous.prototype['date'] = undefined;






export default InlineResponse20063Previous;

