/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import PostBasicMarketListRequestMetaPagination from './PostBasicMarketListRequestMetaPagination';

/**
 * The PostNotationSelectionListMembersListRequestMeta model module.
 * @module model/PostNotationSelectionListMembersListRequestMeta
 */
class PostNotationSelectionListMembersListRequestMeta {
    /**
     * Constructs a new <code>PostNotationSelectionListMembersListRequestMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PostNotationSelectionListMembersListRequestMeta
     */
    constructor() { 
        
        PostNotationSelectionListMembersListRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostNotationSelectionListMembersListRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostNotationSelectionListMembersListRequestMeta} obj Optional instance to populate.
     * @return {module:model/PostNotationSelectionListMembersListRequestMeta} The populated <code>PostNotationSelectionListMembersListRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostNotationSelectionListMembersListRequestMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = ApiClient.convertToType(data['language'], 'String');
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], ['String']);
            }
            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = PostBasicMarketListRequestMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
PostNotationSelectionListMembersListRequestMeta.prototype['attributes'] = undefined;

/**
 * ISO 639-1 code of the language.
 * @member {String} language
 */
PostNotationSelectionListMembersListRequestMeta.prototype['language'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 6 (possibly prefixed) attribute name(s) is allowed.
 * @member {Array.<module:model/PostNotationSelectionListMembersListRequestMeta.SortEnum>} sort
 */
PostNotationSelectionListMembersListRequestMeta.prototype['sort'] = undefined;

/**
 * @member {module:model/PostBasicMarketListRequestMetaPagination} pagination
 */
PostNotationSelectionListMembersListRequestMeta.prototype['pagination'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
PostNotationSelectionListMembersListRequestMeta['SortEnum'] = {

    /**
     * value: "market.name"
     * @const
     */
    "market.name": "market.name",

    /**
     * value: "-market.name"
     * @const
     */
    "-market.name": "-market.name",

    /**
     * value: "valueUnit.name"
     * @const
     */
    "valueUnit.name": "valueUnit.name",

    /**
     * value: "-valueUnit.name"
     * @const
     */
    "-valueUnit.name": "-valueUnit.name",

    /**
     * value: "instrument.name.default.long"
     * @const
     */
    "instrument.name.default.long": "instrument.name.default.long",

    /**
     * value: "-instrument.name.default.long"
     * @const
     */
    "-instrument.name.default.long": "-instrument.name.default.long",

    /**
     * value: "instrument.name.default.short"
     * @const
     */
    "instrument.name.default.short": "instrument.name.default.short",

    /**
     * value: "-instrument.name.default.short"
     * @const
     */
    "-instrument.name.default.short": "-instrument.name.default.short",

    /**
     * value: "instrument.name.assetClassSpecific.long"
     * @const
     */
    "instrument.name.assetClassSpecific.long": "instrument.name.assetClassSpecific.long",

    /**
     * value: "-instrument.name.assetClassSpecific.long"
     * @const
     */
    "-instrument.name.assetClassSpecific.long": "-instrument.name.assetClassSpecific.long",

    /**
     * value: "instrument.name.assetClassSpecific.short"
     * @const
     */
    "instrument.name.assetClassSpecific.short": "instrument.name.assetClassSpecific.short",

    /**
     * value: "-instrument.name.assetClassSpecific.short"
     * @const
     */
    "-instrument.name.assetClassSpecific.short": "-instrument.name.assetClassSpecific.short"
};



export default PostNotationSelectionListMembersListRequestMeta;

