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
import InlineResponse2007DataBarrierTypeConditions from './InlineResponse2007DataBarrierTypeConditions';
import InlineResponse2007DataUnderlyings from './InlineResponse2007DataUnderlyings';

/**
 * The InlineResponse2007Data model module.
 * @module model/InlineResponse2007Data
 * @version 0.9.0
 */
class InlineResponse2007Data {
    /**
     * Constructs a new <code>InlineResponse2007Data</code>.
     * Underlying data, barrier conditions, and related cash flows.
     * @alias module:model/InlineResponse2007Data
     */
    constructor() { 
        
        InlineResponse2007Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007Data} The populated <code>InlineResponse2007Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007Data();

            if (data.hasOwnProperty('underlyings')) {
                obj['underlyings'] = ApiClient.convertToType(data['underlyings'], [InlineResponse2007DataUnderlyings]);
            }
            if (data.hasOwnProperty('barrierTypeConditions')) {
                obj['barrierTypeConditions'] = ApiClient.convertToType(data['barrierTypeConditions'], [InlineResponse2007DataBarrierTypeConditions]);
            }
        }
        return obj;
    }


}

/**
 * Information regarding the underlying(s) of the securitized derivative.
 * @member {Array.<module:model/InlineResponse2007DataUnderlyings>} underlyings
 */
InlineResponse2007Data.prototype['underlyings'] = undefined;

/**
 * Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any.
 * @member {Array.<module:model/InlineResponse2007DataBarrierTypeConditions>} barrierTypeConditions
 */
InlineResponse2007Data.prototype['barrierTypeConditions'] = undefined;






export default InlineResponse2007Data;

