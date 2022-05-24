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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceAbsolute from './SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceAbsolute';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceRelative from './SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceRelative';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance</code>.
     * Distance from the underlying level to the break even point.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceAbsolute.constructFromObject(data['absolute']);
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceRelative.constructFromObject(data['relative']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceAbsolute} absolute
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance.prototype['absolute'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistanceRelative} relative
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance.prototype['relative'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEvenDistance;

