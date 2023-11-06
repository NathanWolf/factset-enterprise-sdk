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
import InlineResponse2001Categories from './InlineResponse2001Categories';
import InlineResponse2001Instruments from './InlineResponse2001Instruments';
import InlineResponse2001Language from './InlineResponse2001Language';
import InlineResponse2001Types from './InlineResponse2001Types';

/**
 * The InlineResponse2002DataArticles model module.
 * @module model/InlineResponse2002DataArticles
 */
class InlineResponse2002DataArticles {
    /**
     * Constructs a new <code>InlineResponse2002DataArticles</code>.
     * @alias module:model/InlineResponse2002DataArticles
     */
    constructor() { 
        
        InlineResponse2002DataArticles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2002DataArticles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2002DataArticles} obj Optional instance to populate.
     * @return {module:model/InlineResponse2002DataArticles} The populated <code>InlineResponse2002DataArticles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2002DataArticles();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
            if (data.hasOwnProperty('headline')) {
                obj['headline'] = ApiClient.convertToType(data['headline'], 'String');
            }
            if (data.hasOwnProperty('summary')) {
                obj['summary'] = ApiClient.convertToType(data['summary'], 'String');
            }
            if (data.hasOwnProperty('types')) {
                obj['types'] = ApiClient.convertToType(data['types'], [InlineResponse2001Types]);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = InlineResponse2001Language.constructFromObject(data['language']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], [InlineResponse2001Categories]);
            }
            if (data.hasOwnProperty('instruments')) {
                obj['instruments'] = ApiClient.convertToType(data['instruments'], [InlineResponse2001Instruments]);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the news article.
 * @member {String} code
 */
InlineResponse2002DataArticles.prototype['code'] = undefined;

/**
 * Date and time of the news article.
 * @member {String} time
 */
InlineResponse2002DataArticles.prototype['time'] = undefined;

/**
 * Headline of the news article represented as text with HTML entity encoding but without HTML tags.
 * @member {String} headline
 */
InlineResponse2002DataArticles.prototype['headline'] = undefined;

/**
 * Textual summary of the body of the news article or `null` if no summary was provided by the news article distributor.
 * @member {String} summary
 */
InlineResponse2002DataArticles.prototype['summary'] = undefined;

/**
 * Types of news article. See endpoint `/news/article/type/list` for possible values.
 * @member {Array.<module:model/InlineResponse2001Types>} types
 */
InlineResponse2002DataArticles.prototype['types'] = undefined;

/**
 * @member {module:model/InlineResponse2001Language} language
 */
InlineResponse2002DataArticles.prototype['language'] = undefined;

/**
 * Categories related to the news article. See endpoint `/category/list` for possible values.
 * @member {Array.<module:model/InlineResponse2001Categories>} categories
 */
InlineResponse2002DataArticles.prototype['categories'] = undefined;

/**
 * Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.
 * @member {Array.<module:model/InlineResponse2001Instruments>} instruments
 */
InlineResponse2002DataArticles.prototype['instruments'] = undefined;






export default InlineResponse2002DataArticles;

