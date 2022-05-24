/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
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
 * The VermilionGroupResourceMeta model module.
 * @module model/VermilionGroupResourceMeta
 * @version 0.20.0
 */
class VermilionGroupResourceMeta {
    /**
     * Constructs a new <code>VermilionGroupResourceMeta</code>.
     * @alias module:model/VermilionGroupResourceMeta
     */
    constructor() { 
        
        VermilionGroupResourceMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VermilionGroupResourceMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VermilionGroupResourceMeta} obj Optional instance to populate.
     * @return {module:model/VermilionGroupResourceMeta} The populated <code>VermilionGroupResourceMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VermilionGroupResourceMeta();

            if (data.hasOwnProperty('resourceType')) {
                obj['resourceType'] = ApiClient.convertToType(data['resourceType'], 'String');
            }
            if (data.hasOwnProperty('location')) {
                obj['location'] = ApiClient.convertToType(data['location'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} resourceType
 */
VermilionGroupResourceMeta.prototype['resourceType'] = undefined;

/**
 * @member {String} location
 */
VermilionGroupResourceMeta.prototype['location'] = undefined;






export default VermilionGroupResourceMeta;

