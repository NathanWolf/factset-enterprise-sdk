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
import InlineResponse20086Data from './InlineResponse20086Data';
import InlineResponse200Meta from './InlineResponse200Meta';

/**
 * The InlineResponse20086 model module.
 * @module model/InlineResponse20086
 * @version 0.9.2
 */
class InlineResponse20086 {
    /**
     * Constructs a new <code>InlineResponse20086</code>.
     * @alias module:model/InlineResponse20086
     */
    constructor() { 
        
        InlineResponse20086.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20086</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20086} obj Optional instance to populate.
     * @return {module:model/InlineResponse20086} The populated <code>InlineResponse20086</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20086();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [InlineResponse20086Data]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of trading schedule event types.
 * @member {Array.<module:model/InlineResponse20086Data>} data
 */
InlineResponse20086.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20086.prototype['meta'] = undefined;






export default InlineResponse20086;

