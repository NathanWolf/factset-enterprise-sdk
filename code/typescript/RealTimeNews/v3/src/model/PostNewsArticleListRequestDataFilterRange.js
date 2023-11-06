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
 * The PostNewsArticleListRequestDataFilterRange model module.
 * @module model/PostNewsArticleListRequestDataFilterRange
 */
class PostNewsArticleListRequestDataFilterRange {
    /**
     * Constructs a new <code>PostNewsArticleListRequestDataFilterRange</code>.
     * Time range for matching the news article&#39;s date. At most one of the attributes &#x60;start&#x60; or &#x60;end&#x60; may be &#x60;null&#x60;.
     * @alias module:model/PostNewsArticleListRequestDataFilterRange
     * @param start {String} The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.
     * @param end {String} The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
     */
    constructor(start, end) { 
        
        PostNewsArticleListRequestDataFilterRange.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>PostNewsArticleListRequestDataFilterRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsArticleListRequestDataFilterRange} obj Optional instance to populate.
     * @return {module:model/PostNewsArticleListRequestDataFilterRange} The populated <code>PostNewsArticleListRequestDataFilterRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsArticleListRequestDataFilterRange();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.
 * @member {String} start
 */
PostNewsArticleListRequestDataFilterRange.prototype['start'] = undefined;

/**
 * The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
 * @member {String} end
 */
PostNewsArticleListRequestDataFilterRange.prototype['end'] = undefined;






export default PostNewsArticleListRequestDataFilterRange;

