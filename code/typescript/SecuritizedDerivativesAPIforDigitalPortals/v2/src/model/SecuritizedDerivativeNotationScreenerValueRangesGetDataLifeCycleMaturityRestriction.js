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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate from './SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays from './SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction</code>.
     * The maturity can be restricted by using one of the parameters &#x60;date&#x60; or &#x60;remainingTermDays&#x60; but not both at the same time. If a maturity restriction is set, perpetual instruments, i.e. such that do not mature, are not included in the result unless the parameter &#x60;perpetual&#x60; is set to &#x60;include&#x60;.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction();

            if (data.hasOwnProperty('date')) {
                obj['date'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate.constructFromObject(data['date']);
            }
            if (data.hasOwnProperty('remainingTermDays')) {
                obj['remainingTermDays'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays.constructFromObject(data['remainingTermDays']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate} date
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction.prototype['date'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays} remainingTermDays
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction.prototype['remainingTermDays'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction;

