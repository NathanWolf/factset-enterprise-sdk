/**
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ScaleScale model module.
 * @module model/ScaleScale
 * @version 0.20.0
 */
class ScaleScale {
    /**
     * Constructs a new <code>ScaleScale</code>.
     * Integer power of 10 to which numbers have been scaled. For example: 6 implies millions. Default is 0. 
     * @alias module:model/ScaleScale
     */
    constructor() { 
        
        ScaleScale.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScaleScale</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScaleScale} obj Optional instance to populate.
     * @return {module:model/ScaleScale} The populated <code>ScaleScale</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScaleScale();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} value
 */
ScaleScale.prototype['value'] = undefined;






export default ScaleScale;

