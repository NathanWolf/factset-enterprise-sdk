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
 * The InlineResponse20031DataLevel model module.
 * @module model/InlineResponse20031DataLevel
 * @version 0.9.0
 */
class InlineResponse20031DataLevel {
    /**
     * Constructs a new <code>InlineResponse20031DataLevel</code>.
     * Category level.
     * @alias module:model/InlineResponse20031DataLevel
     */
    constructor() { 
        
        InlineResponse20031DataLevel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20031DataLevel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20031DataLevel} obj Optional instance to populate.
     * @return {module:model/InlineResponse20031DataLevel} The populated <code>InlineResponse20031DataLevel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20031DataLevel();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the category level.
 * @member {Number} id
 */
InlineResponse20031DataLevel.prototype['id'] = undefined;

/**
 * Name of the category level.
 * @member {String} name
 */
InlineResponse20031DataLevel.prototype['name'] = undefined;

/**
 * Number of the category level starting with 1, indicating the distance to the root of the category hierarchy.
 * @member {Number} number
 */
InlineResponse20031DataLevel.prototype['number'] = undefined;






export default InlineResponse20031DataLevel;

