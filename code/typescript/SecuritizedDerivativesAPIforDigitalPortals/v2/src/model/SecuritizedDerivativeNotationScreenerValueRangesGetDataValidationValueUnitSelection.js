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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionExclude from './SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionExclude';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionRestrict from './SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionRestrict';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection</code>.
     * Value unit selection.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionRestrict} restrict
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection.prototype['restrict'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelectionExclude} exclude
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection.prototype['exclude'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationValueUnitSelection;

