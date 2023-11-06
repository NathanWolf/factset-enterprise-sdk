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
import PostNewsArticleListByInstrumentRequestData from './PostNewsArticleListByInstrumentRequestData';
import PostNewsArticleListRequestMeta from './PostNewsArticleListRequestMeta';

/**
 * The PostNewsArticleListByInstrumentRequest model module.
 * @module model/PostNewsArticleListByInstrumentRequest
 */
class PostNewsArticleListByInstrumentRequest {
    /**
     * Constructs a new <code>PostNewsArticleListByInstrumentRequest</code>.
     * Request Body
     * @alias module:model/PostNewsArticleListByInstrumentRequest
     * @param data {module:model/PostNewsArticleListByInstrumentRequestData} 
     */
    constructor(data) { 
        
        PostNewsArticleListByInstrumentRequest.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>PostNewsArticleListByInstrumentRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNewsArticleListByInstrumentRequest} obj Optional instance to populate.
     * @return {module:model/PostNewsArticleListByInstrumentRequest} The populated <code>PostNewsArticleListByInstrumentRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNewsArticleListByInstrumentRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = PostNewsArticleListByInstrumentRequestData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = PostNewsArticleListRequestMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PostNewsArticleListByInstrumentRequestData} data
 */
PostNewsArticleListByInstrumentRequest.prototype['data'] = undefined;

/**
 * @member {module:model/PostNewsArticleListRequestMeta} meta
 */
PostNewsArticleListByInstrumentRequest.prototype['meta'] = undefined;






export default PostNewsArticleListByInstrumentRequest;

