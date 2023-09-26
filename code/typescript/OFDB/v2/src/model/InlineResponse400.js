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
import InlineResponse400Errors from './InlineResponse400Errors';

/**
 * The InlineResponse400 model module.
 * @module model/InlineResponse400
 */
class InlineResponse400 {
    /**
     * Constructs a new <code>InlineResponse400</code>.
     * @alias module:model/InlineResponse400
     */
    constructor() { 
        
        InlineResponse400.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse400</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse400} obj Optional instance to populate.
     * @return {module:model/InlineResponse400} The populated <code>InlineResponse400</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse400();

            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [InlineResponse400Errors]);
            }
        }
        return obj;
    }


}

/**
 * An array containing errors
 * @member {Array.<module:model/InlineResponse400Errors>} errors
 */
InlineResponse400.prototype['errors'] = undefined;






export default InlineResponse400;

