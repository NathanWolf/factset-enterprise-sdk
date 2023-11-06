/**
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals), [time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PostNewsArticleSearchByTextRequestDataLanguage model module.
 * @module model/PostNewsArticleSearchByTextRequestDataLanguage
 */
class PostNewsArticleSearchByTextRequestDataLanguage {
    /**
     * Constructs a new <code>PostNewsArticleSearchByTextRequestDataLanguage</code>.
     * Languages of the news article. A news article is found if one of the specified languages matches. See endpoint &#x60;/basic/language/list&#x60; for valid values.
     * @alias module:model/PostNewsArticleSearchByTextRequestDataLanguage
     */
    constructor() { 
        
        PostNewsArticleSearchByTextRequestDataLanguage.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNewsArticleSearchByTextRequestDataLanguage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsArticleSearchByTextRequestDataLanguage} obj Optional instance to populate.
     * @return {module:model/PostNewsArticleSearchByTextRequestDataLanguage} The populated <code>PostNewsArticleSearchByTextRequestDataLanguage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsArticleSearchByTextRequestDataLanguage();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Identifiers of the languages.
 * @member {Array.<Number>} ids
 */
PostNewsArticleSearchByTextRequestDataLanguage.prototype['ids'] = undefined;






export default PostNewsArticleSearchByTextRequestDataLanguage;

