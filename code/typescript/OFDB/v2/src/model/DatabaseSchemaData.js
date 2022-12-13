/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DatabaseSchemaData model module.
 * @module model/DatabaseSchemaData
 */
class DatabaseSchemaData {
    /**
     * Constructs a new <code>DatabaseSchemaData</code>.
     * @alias module:model/DatabaseSchemaData
     */
    constructor() { 
        
        DatabaseSchemaData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DatabaseSchemaData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DatabaseSchemaData} obj Optional instance to populate.
     * @return {module:model/DatabaseSchemaData} The populated <code>DatabaseSchemaData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DatabaseSchemaData();

            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('fields')) {
                obj['fields'] = ApiClient.convertToType(data['fields'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} path
 */
DatabaseSchemaData.prototype['path'] = undefined;

/**
 * @member {String} description
 */
DatabaseSchemaData.prototype['description'] = undefined;

/**
 * @member {Array.<Object>} fields
 */
DatabaseSchemaData.prototype['fields'] = undefined;






export default DatabaseSchemaData;

