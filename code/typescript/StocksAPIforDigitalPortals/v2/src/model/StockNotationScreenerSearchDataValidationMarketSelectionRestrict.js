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
 * The StockNotationScreenerSearchDataValidationMarketSelectionRestrict model module.
 * @module model/StockNotationScreenerSearchDataValidationMarketSelectionRestrict
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataValidationMarketSelectionRestrict {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataValidationMarketSelectionRestrict</code>.
     * Specifies the markets from which a notation may originate.
     * @alias module:model/StockNotationScreenerSearchDataValidationMarketSelectionRestrict
     */
    constructor() { 
        
        StockNotationScreenerSearchDataValidationMarketSelectionRestrict.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataValidationMarketSelectionRestrict</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataValidationMarketSelectionRestrict} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataValidationMarketSelectionRestrict} The populated <code>StockNotationScreenerSearchDataValidationMarketSelectionRestrict</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataValidationMarketSelectionRestrict();

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
StockNotationScreenerSearchDataValidationMarketSelectionRestrict.prototype['ids'] = undefined;






export default StockNotationScreenerSearchDataValidationMarketSelectionRestrict;

