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
import InlineResponse2001Data from './InlineResponse2001Data';
import InlineResponse2001Meta from './InlineResponse2001Meta';

/**
 * The InlineResponse2001 model module.
 * @module model/InlineResponse2001
 * @version 0.10.0
 */
class InlineResponse2001 {
    /**
     * Constructs a new <code>InlineResponse2001</code>.
     * @alias module:model/InlineResponse2001
     */
    constructor() { 
        
        InlineResponse2001.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001} The populated <code>InlineResponse2001</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [InlineResponse2001Data]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse2001Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of alerts.
 * @member {Array.<module:model/InlineResponse2001Data>} data
 */
InlineResponse2001.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse2001Meta} meta
 */
InlineResponse2001.prototype['meta'] = undefined;






export default InlineResponse2001;

