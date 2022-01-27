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
import InlineResponse2005DataRangeKnockOutUpperValue from './InlineResponse2005DataRangeKnockOutUpperValue';

/**
 * The InlineResponse2005DataRangeKnockOutUpper model module.
 * @module model/InlineResponse2005DataRangeKnockOutUpper
 * @version 0.9.0
 */
class InlineResponse2005DataRangeKnockOutUpper {
    /**
     * Constructs a new <code>InlineResponse2005DataRangeKnockOutUpper</code>.
     * Upper bound of the range knock-out.
     * @alias module:model/InlineResponse2005DataRangeKnockOutUpper
     */
    constructor() { 
        
        InlineResponse2005DataRangeKnockOutUpper.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataRangeKnockOutUpper</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataRangeKnockOutUpper} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataRangeKnockOutUpper} The populated <code>InlineResponse2005DataRangeKnockOutUpper</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataRangeKnockOutUpper();

            if (data.hasOwnProperty('value')) {
                obj['value'] = InlineResponse2005DataRangeKnockOutUpperValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataRangeKnockOutUpperValue} value
 */
InlineResponse2005DataRangeKnockOutUpper.prototype['value'] = undefined;






export default InlineResponse2005DataRangeKnockOutUpper;

