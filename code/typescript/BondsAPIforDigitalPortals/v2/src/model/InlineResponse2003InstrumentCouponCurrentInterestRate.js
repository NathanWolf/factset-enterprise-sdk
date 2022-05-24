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
import InlineResponse2003InstrumentCouponCurrentInterestRateType from './InlineResponse2003InstrumentCouponCurrentInterestRateType';

/**
 * The InlineResponse2003InstrumentCouponCurrentInterestRate model module.
 * @module model/InlineResponse2003InstrumentCouponCurrentInterestRate
 * @version 0.10.0
 */
class InlineResponse2003InstrumentCouponCurrentInterestRate {
    /**
     * Constructs a new <code>InlineResponse2003InstrumentCouponCurrentInterestRate</code>.
     * Details of the current coupon period.
     * @alias module:model/InlineResponse2003InstrumentCouponCurrentInterestRate
     */
    constructor() { 
        
        InlineResponse2003InstrumentCouponCurrentInterestRate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003InstrumentCouponCurrentInterestRate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003InstrumentCouponCurrentInterestRate} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003InstrumentCouponCurrentInterestRate} The populated <code>InlineResponse2003InstrumentCouponCurrentInterestRate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003InstrumentCouponCurrentInterestRate();

            if (data.hasOwnProperty('type')) {
                obj['type'] = InlineResponse2003InstrumentCouponCurrentInterestRateType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2003InstrumentCouponCurrentInterestRateType} type
 */
InlineResponse2003InstrumentCouponCurrentInterestRate.prototype['type'] = undefined;

/**
 * Value of the interest rate; annualized if the payment frequency is not \"annually\". See endpoint `/instrument/coupon/keyData/get` for details regarding the current period.
 * @member {Number} value
 */
InlineResponse2003InstrumentCouponCurrentInterestRate.prototype['value'] = undefined;






export default InlineResponse2003InstrumentCouponCurrentInterestRate;

