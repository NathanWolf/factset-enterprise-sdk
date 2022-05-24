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
import InlineResponse2005DataCurrentInterestRateTypes from './InlineResponse2005DataCurrentInterestRateTypes';
import InlineResponse2005DataCurrentInterestRateValue from './InlineResponse2005DataCurrentInterestRateValue';

/**
 * The InlineResponse2005DataCurrentInterestRate model module.
 * @module model/InlineResponse2005DataCurrentInterestRate
 * @version 0.10.0
 */
class InlineResponse2005DataCurrentInterestRate {
    /**
     * Constructs a new <code>InlineResponse2005DataCurrentInterestRate</code>.
     * Values and value ranges related to the current interest rate.
     * @alias module:model/InlineResponse2005DataCurrentInterestRate
     */
    constructor() { 
        
        InlineResponse2005DataCurrentInterestRate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataCurrentInterestRate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataCurrentInterestRate} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataCurrentInterestRate} The populated <code>InlineResponse2005DataCurrentInterestRate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataCurrentInterestRate();

            if (data.hasOwnProperty('types')) {
                obj['types'] = ApiClient.convertToType(data['types'], [InlineResponse2005DataCurrentInterestRateTypes]);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = InlineResponse2005DataCurrentInterestRateValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * Values of the type of the interest rate.
 * @member {Array.<module:model/InlineResponse2005DataCurrentInterestRateTypes>} types
 */
InlineResponse2005DataCurrentInterestRate.prototype['types'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataCurrentInterestRateValue} value
 */
InlineResponse2005DataCurrentInterestRate.prototype['value'] = undefined;






export default InlineResponse2005DataCurrentInterestRate;

