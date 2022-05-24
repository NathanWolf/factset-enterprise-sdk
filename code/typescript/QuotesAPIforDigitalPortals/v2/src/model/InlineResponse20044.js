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
import InlineResponse20044Data from './InlineResponse20044Data';
import InlineResponse200Meta from './InlineResponse200Meta';

/**
 * The InlineResponse20044 model module.
 * @module model/InlineResponse20044
 * @version 0.9.2
 */
class InlineResponse20044 {
    /**
     * Constructs a new <code>InlineResponse20044</code>.
     * @alias module:model/InlineResponse20044
     */
    constructor() { 
        
        InlineResponse20044.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20044</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20044} obj Optional instance to populate.
     * @return {module:model/InlineResponse20044} The populated <code>InlineResponse20044</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20044();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [InlineResponse20044Data]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * Background texts of the instrument, sorted by increasing type identifier value.
 * @member {Array.<module:model/InlineResponse20044Data>} data
 */
InlineResponse20044.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20044.prototype['meta'] = undefined;






export default InlineResponse20044;

