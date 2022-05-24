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
import InlineResponse20033Meta from './InlineResponse20033Meta';
import InlineResponse20058Data from './InlineResponse20058Data';

/**
 * The InlineResponse20058 model module.
 * @module model/InlineResponse20058
 * @version 0.9.2
 */
class InlineResponse20058 {
    /**
     * Constructs a new <code>InlineResponse20058</code>.
     * @alias module:model/InlineResponse20058
     */
    constructor() { 
        
        InlineResponse20058.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20058</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20058} obj Optional instance to populate.
     * @return {module:model/InlineResponse20058} The populated <code>InlineResponse20058</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20058();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [InlineResponse20058Data]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse20033Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of instruments.
 * @member {Array.<module:model/InlineResponse20058Data>} data
 */
InlineResponse20058.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse20033Meta} meta
 */
InlineResponse20058.prototype['meta'] = undefined;






export default InlineResponse20058;

