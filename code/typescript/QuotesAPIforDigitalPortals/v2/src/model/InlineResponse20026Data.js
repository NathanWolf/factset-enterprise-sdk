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
 * The InlineResponse20026Data model module.
 * @module model/InlineResponse20026Data
 * @version 0.9.0
 */
class InlineResponse20026Data {
    /**
     * Constructs a new <code>InlineResponse20026Data</code>.
     * @alias module:model/InlineResponse20026Data
     */
    constructor() { 
        
        InlineResponse20026Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20026Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20026Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20026Data} The populated <code>InlineResponse20026Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20026Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of an alternative unit.
 * @member {Number} id
 */
InlineResponse20026Data.prototype['id'] = undefined;

/**
 * Code of the alternative unit.
 * @member {String} code
 */
InlineResponse20026Data.prototype['code'] = undefined;

/**
 * Name of the alternative unit.
 * @member {String} name
 */
InlineResponse20026Data.prototype['name'] = undefined;






export default InlineResponse20026Data;

