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
 * The NewsArticleSearchByTextDataCategories model module.
 * @module model/NewsArticleSearchByTextDataCategories
 * @version 0.10.0
 */
class NewsArticleSearchByTextDataCategories {
    /**
     * Constructs a new <code>NewsArticleSearchByTextDataCategories</code>.
     * Categories of the news article. A news article is found if one or more of the specified categories match. Use a category system of type news with endpoint /category/listBySystem for valid values.
     * @alias module:model/NewsArticleSearchByTextDataCategories
     */
    constructor() { 
        
        NewsArticleSearchByTextDataCategories.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NewsArticleSearchByTextDataCategories</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NewsArticleSearchByTextDataCategories} obj Optional instance to populate.
     * @return {module:model/NewsArticleSearchByTextDataCategories} The populated <code>NewsArticleSearchByTextDataCategories</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewsArticleSearchByTextDataCategories();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Identifiers of the categories.
 * @member {Array.<Number>} ids
 */
NewsArticleSearchByTextDataCategories.prototype['ids'] = undefined;






export default NewsArticleSearchByTextDataCategories;

