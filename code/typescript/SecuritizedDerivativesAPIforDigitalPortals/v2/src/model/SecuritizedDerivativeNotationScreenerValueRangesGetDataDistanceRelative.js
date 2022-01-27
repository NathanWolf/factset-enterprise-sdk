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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum from './SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum from './SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative</code>.
     * Value range of the distance in relative terms.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum} minimum
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative.prototype['minimum'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum} maximum
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative.prototype['maximum'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative;

