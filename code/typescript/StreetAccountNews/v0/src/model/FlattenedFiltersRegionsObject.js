/**
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FlattenedFiltersRegionsObject model module.
 * @module model/FlattenedFiltersRegionsObject
 */
class FlattenedFiltersRegionsObject {
    /**
     * Constructs a new <code>FlattenedFiltersRegionsObject</code>.
     * @alias module:model/FlattenedFiltersRegionsObject
     */
    constructor() { 
        
        FlattenedFiltersRegionsObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FlattenedFiltersRegionsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FlattenedFiltersRegionsObject} obj Optional instance to populate.
     * @return {module:model/FlattenedFiltersRegionsObject} The populated <code>FlattenedFiltersRegionsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FlattenedFiltersRegionsObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
FlattenedFiltersRegionsObject.prototype['name'] = undefined;

/**
 * @member {Array.<Number>} value
 */
FlattenedFiltersRegionsObject.prototype['value'] = undefined;






export default FlattenedFiltersRegionsObject;

