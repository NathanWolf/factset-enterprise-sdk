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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude from './SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict from './SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection</code>.
     * Market selection.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict} restrict
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.prototype['restrict'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude} exclude
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.prototype['exclude'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection;

