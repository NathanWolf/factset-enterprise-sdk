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

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation</code>.
     * Date range of the valuation date.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation
     * @param start {Date} The starting point of the date range (inclusive), or `null` to indicate that the date range extends indefinitely into the past.
     * @param end {Date} The ending point of the date range (inclusive), or `null` to indicate that the date range extends indefinitely into the future.
     */
    constructor(start, end) { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Date');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the date range (inclusive), or `null` to indicate that the date range extends indefinitely into the past.
 * @member {Date} start
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation.prototype['start'] = undefined;

/**
 * The ending point of the date range (inclusive), or `null` to indicate that the date range extends indefinitely into the future.
 * @member {Date} end
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation.prototype['end'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleValuation;

