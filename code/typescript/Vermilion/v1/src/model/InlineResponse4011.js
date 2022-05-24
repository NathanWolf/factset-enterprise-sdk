/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
 * The InlineResponse4011 model module.
 * @module model/InlineResponse4011
 * @version 0.9.0
 */
class InlineResponse4011 {
    /**
     * Constructs a new <code>InlineResponse4011</code>.
     * @alias module:model/InlineResponse4011
     */
    constructor() { 
        
        InlineResponse4011.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse4011</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse4011} obj Optional instance to populate.
     * @return {module:model/InlineResponse4011} The populated <code>InlineResponse4011</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse4011();

            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<Object>} errors
 */
InlineResponse4011.prototype['errors'] = undefined;






export default InlineResponse4011;

