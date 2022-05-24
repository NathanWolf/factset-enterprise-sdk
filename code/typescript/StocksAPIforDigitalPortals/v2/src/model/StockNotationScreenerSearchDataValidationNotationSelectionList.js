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
import StockNotationScreenerSearchDataValidationNotationSelectionListExclude from './StockNotationScreenerSearchDataValidationNotationSelectionListExclude';
import StockNotationScreenerSearchDataValidationNotationSelectionListRestrict from './StockNotationScreenerSearchDataValidationNotationSelectionListRestrict';

/**
 * The StockNotationScreenerSearchDataValidationNotationSelectionList model module.
 * @module model/StockNotationScreenerSearchDataValidationNotationSelectionList
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataValidationNotationSelectionList {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataValidationNotationSelectionList</code>.
     * Notation-level restriction or exclusion.
     * @alias module:model/StockNotationScreenerSearchDataValidationNotationSelectionList
     */
    constructor() { 
        
        StockNotationScreenerSearchDataValidationNotationSelectionList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataValidationNotationSelectionList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataValidationNotationSelectionList} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataValidationNotationSelectionList} The populated <code>StockNotationScreenerSearchDataValidationNotationSelectionList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataValidationNotationSelectionList();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = StockNotationScreenerSearchDataValidationNotationSelectionListRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = StockNotationScreenerSearchDataValidationNotationSelectionListExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationNotationSelectionListRestrict} restrict
 */
StockNotationScreenerSearchDataValidationNotationSelectionList.prototype['restrict'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationNotationSelectionListExclude} exclude
 */
StockNotationScreenerSearchDataValidationNotationSelectionList.prototype['exclude'] = undefined;






export default StockNotationScreenerSearchDataValidationNotationSelectionList;

