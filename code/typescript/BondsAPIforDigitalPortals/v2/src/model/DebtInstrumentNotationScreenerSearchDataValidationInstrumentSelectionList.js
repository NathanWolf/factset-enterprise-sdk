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
import DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude from './DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude';
import DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict from './DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict';

/**
 * The DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList model module.
 * @module model/DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList
 * @version 0.9.0
 */
class DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList {
    /**
     * Constructs a new <code>DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList</code>.
     * Instrument-level restriction or exclusion.
     * @alias module:model/DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList
     */
    constructor() { 
        
        DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList} The populated <code>DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict} restrict
 */
DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList.prototype['restrict'] = undefined;

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude} exclude
 */
DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList.prototype['exclude'] = undefined;






export default DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList;

