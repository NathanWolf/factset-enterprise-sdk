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
import InlineResponse20085Data from './InlineResponse20085Data';
import InlineResponse20085Meta from './InlineResponse20085Meta';

/**
 * The InlineResponse20085 model module.
 * @module model/InlineResponse20085
 * @version 0.9.2
 */
class InlineResponse20085 {
    /**
     * Constructs a new <code>InlineResponse20085</code>.
     * @alias module:model/InlineResponse20085
     */
    constructor() { 
        
        InlineResponse20085.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20085</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20085} obj Optional instance to populate.
     * @return {module:model/InlineResponse20085} The populated <code>InlineResponse20085</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20085();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InlineResponse20085Data.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse20085Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20085Data} data
 */
InlineResponse20085.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse20085Meta} meta
 */
InlineResponse20085.prototype['meta'] = undefined;






export default InlineResponse20085;

