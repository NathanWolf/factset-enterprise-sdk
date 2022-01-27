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
import DescriptionDescription from './DescriptionDescription';

/**
 * The Description model module.
 * @module model/Description
 * @version 0.9.0
 */
class Description {
    /**
     * Constructs a new <code>Description</code>.
     * @alias module:model/Description
     */
    constructor() { 
        
        Description.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Description</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Description} obj Optional instance to populate.
     * @return {module:model/Description} The populated <code>Description</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Description();

            if (data.hasOwnProperty('description')) {
                obj['description'] = DescriptionDescription.constructFromObject(data['description']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DescriptionDescription} description
 */
Description.prototype['description'] = undefined;






export default Description;

