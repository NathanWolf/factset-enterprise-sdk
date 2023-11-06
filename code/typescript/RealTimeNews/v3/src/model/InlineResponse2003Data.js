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
import InlineResponse2001Data from './InlineResponse2001Data';
import InlineResponse2003DataIdentifiers from './InlineResponse2003DataIdentifiers';

/**
 * The InlineResponse2003Data model module.
 * @module model/InlineResponse2003Data
 */
class InlineResponse2003Data {
    /**
     * Constructs a new <code>InlineResponse2003Data</code>.
     * News articles for instruments that are constituents of the given indices.
     * @alias module:model/InlineResponse2003Data
     */
    constructor() { 
        
        InlineResponse2003Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003Data} The populated <code>InlineResponse2003Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003Data();

            if (data.hasOwnProperty('identifiers')) {
                obj['identifiers'] = ApiClient.convertToType(data['identifiers'], [InlineResponse2003DataIdentifiers]);
            }
            if (data.hasOwnProperty('articles')) {
                obj['articles'] = ApiClient.convertToType(data['articles'], [InlineResponse2001Data]);
            }
        }
        return obj;
    }


}

/**
 * List of identifiers that resolve to index notations, and their type.
 * @member {Array.<module:model/InlineResponse2003DataIdentifiers>} identifiers
 */
InlineResponse2003Data.prototype['identifiers'] = undefined;

/**
 * News articles that match the filter criteria ordered by descending article time.
 * @member {Array.<module:model/InlineResponse2001Data>} articles
 */
InlineResponse2003Data.prototype['articles'] = undefined;






export default InlineResponse2003Data;

