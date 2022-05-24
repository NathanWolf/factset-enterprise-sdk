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
 * The StockNotationScreenerSearchDataValidationMarketSelectionExclude model module.
 * @module model/StockNotationScreenerSearchDataValidationMarketSelectionExclude
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataValidationMarketSelectionExclude {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataValidationMarketSelectionExclude</code>.
     * Specifies the markets from which a notation may not originate.
     * @alias module:model/StockNotationScreenerSearchDataValidationMarketSelectionExclude
     */
    constructor() { 
        
        StockNotationScreenerSearchDataValidationMarketSelectionExclude.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataValidationMarketSelectionExclude</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataValidationMarketSelectionExclude} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataValidationMarketSelectionExclude} The populated <code>StockNotationScreenerSearchDataValidationMarketSelectionExclude</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataValidationMarketSelectionExclude();

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
StockNotationScreenerSearchDataValidationMarketSelectionExclude.prototype['ids'] = undefined;






export default StockNotationScreenerSearchDataValidationMarketSelectionExclude;

