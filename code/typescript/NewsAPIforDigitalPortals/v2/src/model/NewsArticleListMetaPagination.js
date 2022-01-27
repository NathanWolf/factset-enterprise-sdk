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
 * The NewsArticleListMetaPagination model module.
 * @module model/NewsArticleListMetaPagination
 * @version 0.9.0
 */
class NewsArticleListMetaPagination {
    /**
     * Constructs a new <code>NewsArticleListMetaPagination</code>.
     * Pagination attributes for the cursor-based pagination strategy.
     * @alias module:model/NewsArticleListMetaPagination
     */
    constructor() { 
        
        NewsArticleListMetaPagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NewsArticleListMetaPagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NewsArticleListMetaPagination} obj Optional instance to populate.
     * @return {module:model/NewsArticleListMetaPagination} The populated <code>NewsArticleListMetaPagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewsArticleListMetaPagination();

            if (data.hasOwnProperty('cursor')) {
                obj['cursor'] = ApiClient.convertToType(data['cursor'], 'String');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default).
 * @member {String} cursor
 */
NewsArticleListMetaPagination.prototype['cursor'] = undefined;

/**
 * Non-negative maximum number of entries to return.
 * @member {Number} limit
 */
NewsArticleListMetaPagination.prototype['limit'] = undefined;






export default NewsArticleListMetaPagination;

