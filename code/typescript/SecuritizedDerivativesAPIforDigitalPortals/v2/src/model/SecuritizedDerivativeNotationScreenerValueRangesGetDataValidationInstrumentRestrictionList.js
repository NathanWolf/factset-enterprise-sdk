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
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList</code>.
     * Instrument-level restriction. If present, the result contains only securitized derivatives that are a member of at least one of the provided lists.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * List of identifieres of restriction lists.
 * @member {Array.<Number>} ids
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList.prototype['ids'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationInstrumentRestrictionList;

