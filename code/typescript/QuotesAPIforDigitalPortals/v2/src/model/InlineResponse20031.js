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
import InlineResponse20031Data from './InlineResponse20031Data';
import InlineResponse200Meta from './InlineResponse200Meta';

/**
 * The InlineResponse20031 model module.
 * @module model/InlineResponse20031
 * @version 0.9.2
 */
class InlineResponse20031 {
    /**
     * Constructs a new <code>InlineResponse20031</code>.
     * @alias module:model/InlineResponse20031
     */
    constructor() { 
        
        InlineResponse20031.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20031</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20031} obj Optional instance to populate.
     * @return {module:model/InlineResponse20031} The populated <code>InlineResponse20031</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20031();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InlineResponse20031Data.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20031Data} data
 */
InlineResponse20031.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20031.prototype['meta'] = undefined;






export default InlineResponse20031;

