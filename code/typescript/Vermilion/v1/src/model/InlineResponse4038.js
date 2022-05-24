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
 * The InlineResponse4038 model module.
 * @module model/InlineResponse4038
 * @version 0.9.0
 */
class InlineResponse4038 {
    /**
     * Constructs a new <code>InlineResponse4038</code>.
     * @alias module:model/InlineResponse4038
     */
    constructor() { 
        
        InlineResponse4038.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse4038</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse4038} obj Optional instance to populate.
     * @return {module:model/InlineResponse4038} The populated <code>InlineResponse4038</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse4038();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], 'String');
            }
            if (data.hasOwnProperty('detail')) {
                obj['detail'] = ApiClient.convertToType(data['detail'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} schemas
 */
InlineResponse4038.prototype['schemas'] = undefined;

/**
 * @member {String} detail
 */
InlineResponse4038.prototype['detail'] = undefined;

/**
 * @member {String} status
 */
InlineResponse4038.prototype['status'] = undefined;






export default InlineResponse4038;

