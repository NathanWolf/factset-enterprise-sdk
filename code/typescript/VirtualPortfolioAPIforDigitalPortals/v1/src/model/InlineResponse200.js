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
import InlineResponse201Meta from './InlineResponse201Meta';

/**
 * The InlineResponse200 model module.
 * @module model/InlineResponse200
 * @version 0.9.2
 */
class InlineResponse200 {
    /**
     * Constructs a new <code>InlineResponse200</code>.
     * @alias module:model/InlineResponse200
     */
    constructor() { 
        
        InlineResponse200.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200} obj Optional instance to populate.
     * @return {module:model/InlineResponse200} The populated <code>InlineResponse200</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], Object);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse201Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * This member is always empty.
 * @member {Object} data
 */
InlineResponse200.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse201Meta} meta
 */
InlineResponse200.prototype['meta'] = undefined;






export default InlineResponse200;

