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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum from './SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum from './SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted</code>.
     * Value range of the weekly theta calculated using a (hypothetical) cover ratio of 1:1.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum} minimum
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted.prototype['minimum'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum} maximum
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted.prototype['maximum'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted;

