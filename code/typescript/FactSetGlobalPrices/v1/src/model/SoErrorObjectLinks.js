/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SoErrorObjectLinks model module.
 * @module model/SoErrorObjectLinks
 */
class SoErrorObjectLinks {
    /**
     * Constructs a new <code>SoErrorObjectLinks</code>.
     * The Endpoint path {package}/version/{endpoint}
     * @alias module:model/SoErrorObjectLinks
     */
    constructor() { 
        
        SoErrorObjectLinks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SoErrorObjectLinks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SoErrorObjectLinks} obj Optional instance to populate.
     * @return {module:model/SoErrorObjectLinks} The populated <code>SoErrorObjectLinks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SoErrorObjectLinks();

            if (data.hasOwnProperty('about')) {
                obj['about'] = ApiClient.convertToType(data['about'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Details.
 * @member {String} about
 */
SoErrorObjectLinks.prototype['about'] = undefined;






export default SoErrorObjectLinks;

