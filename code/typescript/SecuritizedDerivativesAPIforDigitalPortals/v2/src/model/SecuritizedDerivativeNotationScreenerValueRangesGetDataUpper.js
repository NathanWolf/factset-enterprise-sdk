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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel from './SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper</code>.
     * Parameters related to the upper bound.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper();

            if (data.hasOwnProperty('level')) {
                obj['level'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel.constructFromObject(data['level']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel} level
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper.prototype['level'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper;

