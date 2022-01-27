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
 * The InlineResponse20039DataLevels model module.
 * @module model/InlineResponse20039DataLevels
 * @version 0.9.0
 */
class InlineResponse20039DataLevels {
    /**
     * Constructs a new <code>InlineResponse20039DataLevels</code>.
     * @alias module:model/InlineResponse20039DataLevels
     */
    constructor() { 
        
        InlineResponse20039DataLevels.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20039DataLevels</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20039DataLevels} obj Optional instance to populate.
     * @return {module:model/InlineResponse20039DataLevels} The populated <code>InlineResponse20039DataLevels</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20039DataLevels();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
            if (data.hasOwnProperty('hasLeafCategories')) {
                obj['hasLeafCategories'] = ApiClient.convertToType(data['hasLeafCategories'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the level.
 * @member {Number} id
 */
InlineResponse20039DataLevels.prototype['id'] = undefined;

/**
 * Name of the level.
 * @member {String} name
 */
InlineResponse20039DataLevels.prototype['name'] = undefined;

/**
 * Number of the category level, starting with 1.
 * @member {Number} number
 */
InlineResponse20039DataLevels.prototype['number'] = undefined;

/**
 * Indicates whether the category level has leaf categories.
 * @member {Boolean} hasLeafCategories
 */
InlineResponse20039DataLevels.prototype['hasLeafCategories'] = undefined;






export default InlineResponse20039DataLevels;

