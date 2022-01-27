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
import DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum from './DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum';
import DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum from './DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum';

/**
 * The DebtInstrumentNotationScreenerSearchDataYieldCurrent model module.
 * @module model/DebtInstrumentNotationScreenerSearchDataYieldCurrent
 * @version 0.9.0
 */
class DebtInstrumentNotationScreenerSearchDataYieldCurrent {
    /**
     * Constructs a new <code>DebtInstrumentNotationScreenerSearchDataYieldCurrent</code>.
     * Value range for the current yield, which is the next annual interest payment divided by the price. If the coupon period is different than a year, the interest payment is annualized.
     * @alias module:model/DebtInstrumentNotationScreenerSearchDataYieldCurrent
     */
    constructor() { 
        
        DebtInstrumentNotationScreenerSearchDataYieldCurrent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentNotationScreenerSearchDataYieldCurrent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentNotationScreenerSearchDataYieldCurrent} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentNotationScreenerSearchDataYieldCurrent} The populated <code>DebtInstrumentNotationScreenerSearchDataYieldCurrent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentNotationScreenerSearchDataYieldCurrent();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum} minimum
 */
DebtInstrumentNotationScreenerSearchDataYieldCurrent.prototype['minimum'] = undefined;

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum} maximum
 */
DebtInstrumentNotationScreenerSearchDataYieldCurrent.prototype['maximum'] = undefined;






export default DebtInstrumentNotationScreenerSearchDataYieldCurrent;

