/**
 * FactSet Ownership API
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
 * The DescriptionDescription model module.
 * @module model/DescriptionDescription
 * @version 0.20.0
 */
class DescriptionDescription {
    /**
     * Constructs a new <code>DescriptionDescription</code>.
     * Text describing the data
     * @alias module:model/DescriptionDescription
     */
    constructor() { 
        
        DescriptionDescription.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DescriptionDescription</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DescriptionDescription} obj Optional instance to populate.
     * @return {module:model/DescriptionDescription} The populated <code>DescriptionDescription</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DescriptionDescription();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} value
 */
DescriptionDescription.prototype['value'] = undefined;






export default DescriptionDescription;

