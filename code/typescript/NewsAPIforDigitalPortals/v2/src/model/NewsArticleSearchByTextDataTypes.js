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
 * The NewsArticleSearchByTextDataTypes model module.
 * @module model/NewsArticleSearchByTextDataTypes
 * @version 0.9.0
 */
class NewsArticleSearchByTextDataTypes {
    /**
     * Constructs a new <code>NewsArticleSearchByTextDataTypes</code>.
     * Types of the news article. A news article is found if one or more of the specified news article types match. See endpoint &#x60;/news/article/type/list&#x60; for valid values.
     * @alias module:model/NewsArticleSearchByTextDataTypes
     */
    constructor() { 
        
        NewsArticleSearchByTextDataTypes.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NewsArticleSearchByTextDataTypes</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NewsArticleSearchByTextDataTypes} obj Optional instance to populate.
     * @return {module:model/NewsArticleSearchByTextDataTypes} The populated <code>NewsArticleSearchByTextDataTypes</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewsArticleSearchByTextDataTypes();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Identifiers of the article types.
 * @member {Array.<Number>} ids
 */
NewsArticleSearchByTextDataTypes.prototype['ids'] = undefined;






export default NewsArticleSearchByTextDataTypes;

