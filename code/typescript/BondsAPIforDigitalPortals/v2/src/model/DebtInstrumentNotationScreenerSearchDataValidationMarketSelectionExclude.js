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
 * The DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude model module.
 * @module model/DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude
 * @version 0.9.0
 */
class DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude {
    /**
     * Constructs a new <code>DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude</code>.
     * Specifies the markets from which a notation may not originate.
     * @alias module:model/DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude
     */
    constructor() { 
        
        DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude} The populated <code>DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Set of market identifiers.
 * @member {Array.<Number>} ids
 */
DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude.prototype['ids'] = undefined;






export default DebtInstrumentNotationScreenerSearchDataValidationMarketSelectionExclude;

