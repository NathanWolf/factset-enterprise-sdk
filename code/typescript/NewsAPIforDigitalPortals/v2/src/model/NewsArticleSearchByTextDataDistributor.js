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
 * The NewsArticleSearchByTextDataDistributor model module.
 * @module model/NewsArticleSearchByTextDataDistributor
 * @version 0.10.0
 */
class NewsArticleSearchByTextDataDistributor {
    /**
     * Constructs a new <code>NewsArticleSearchByTextDataDistributor</code>.
     * Distributors of the news article. A news article is found if one of the specified distributors matches. See endpoint &#x60;/news/distributor/list&#x60; for valid values.
     * @alias module:model/NewsArticleSearchByTextDataDistributor
     */
    constructor() { 
        
        NewsArticleSearchByTextDataDistributor.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NewsArticleSearchByTextDataDistributor</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NewsArticleSearchByTextDataDistributor} obj Optional instance to populate.
     * @return {module:model/NewsArticleSearchByTextDataDistributor} The populated <code>NewsArticleSearchByTextDataDistributor</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewsArticleSearchByTextDataDistributor();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Identifiers of the distributors.
 * @member {Array.<Number>} ids
 */
NewsArticleSearchByTextDataDistributor.prototype['ids'] = undefined;






export default NewsArticleSearchByTextDataDistributor;

