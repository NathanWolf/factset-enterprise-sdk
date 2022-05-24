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
import SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum from './SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum';
import SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum from './SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized</code>.
     * Value range of the annualized maximum yield relative to the ask price.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum} minimum
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized.prototype['minimum'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum} maximum
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized.prototype['maximum'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYieldAnnualized;

