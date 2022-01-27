/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import InlineResponse20048Data from './InlineResponse20048Data';
import InlineResponse200Meta from './InlineResponse200Meta';

/**
 * The InlineResponse20049 model module.
 * @module model/InlineResponse20049
 * @version 0.9.0
 */
class InlineResponse20049 {
    /**
     * Constructs a new <code>InlineResponse20049</code>.
     * @alias module:model/InlineResponse20049
     */
    constructor() { 
        
        InlineResponse20049.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20049</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20049} obj Optional instance to populate.
     * @return {module:model/InlineResponse20049} The populated <code>InlineResponse20049</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20049();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [InlineResponse20048Data]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * Compliance properties of the instrument, sorted by increasing identifier value.
 * @member {Array.<module:model/InlineResponse20048Data>} data
 */
InlineResponse20049.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20049.prototype['meta'] = undefined;






export default InlineResponse20049;

