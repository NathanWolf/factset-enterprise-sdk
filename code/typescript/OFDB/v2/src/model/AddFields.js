/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AddFields model module.
 * @module model/AddFields
 */
class AddFields {
    /**
     * Constructs a new <code>AddFields</code>.
     * @alias module:model/AddFields
     */
    constructor() { 
        
        AddFields.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AddFields</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AddFields} obj Optional instance to populate.
     * @return {module:model/AddFields} The populated <code>AddFields</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AddFields();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<Object>} data
 */
AddFields.prototype['data'] = undefined;






export default AddFields;

