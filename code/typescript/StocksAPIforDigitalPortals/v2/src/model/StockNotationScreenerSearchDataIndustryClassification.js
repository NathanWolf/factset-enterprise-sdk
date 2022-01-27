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
import StockNotationScreenerSearchDataIndustryClassificationExclude from './StockNotationScreenerSearchDataIndustryClassificationExclude';
import StockNotationScreenerSearchDataIndustryClassificationRestrict from './StockNotationScreenerSearchDataIndustryClassificationRestrict';

/**
 * The StockNotationScreenerSearchDataIndustryClassification model module.
 * @module model/StockNotationScreenerSearchDataIndustryClassification
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataIndustryClassification {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataIndustryClassification</code>.
     * Industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS), see endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for valid values.
     * @alias module:model/StockNotationScreenerSearchDataIndustryClassification
     */
    constructor() { 
        
        StockNotationScreenerSearchDataIndustryClassification.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataIndustryClassification</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataIndustryClassification} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataIndustryClassification} The populated <code>StockNotationScreenerSearchDataIndustryClassification</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataIndustryClassification();

            if (data.hasOwnProperty('restrict')) {
                obj['restrict'] = StockNotationScreenerSearchDataIndustryClassificationRestrict.constructFromObject(data['restrict']);
            }
            if (data.hasOwnProperty('exclude')) {
                obj['exclude'] = StockNotationScreenerSearchDataIndustryClassificationExclude.constructFromObject(data['exclude']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataIndustryClassificationRestrict} restrict
 */
StockNotationScreenerSearchDataIndustryClassification.prototype['restrict'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataIndustryClassificationExclude} exclude
 */
StockNotationScreenerSearchDataIndustryClassification.prototype['exclude'] = undefined;






export default StockNotationScreenerSearchDataIndustryClassification;

