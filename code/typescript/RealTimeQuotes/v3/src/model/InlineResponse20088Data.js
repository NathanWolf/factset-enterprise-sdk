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
import InlineResponse20088DataMarket from './InlineResponse20088DataMarket';
import InlineResponse20088DataRegional from './InlineResponse20088DataRegional';

/**
 * The InlineResponse20088Data model module.
 * @module model/InlineResponse20088Data
 */
class InlineResponse20088Data {
    /**
     * Constructs a new <code>InlineResponse20088Data</code>.
     * @alias module:model/InlineResponse20088Data
     */
    constructor() { 
        
        InlineResponse20088Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20088Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20088Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20088Data} The populated <code>InlineResponse20088Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20088Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('suspended')) {
                obj['suspended'] = ApiClient.convertToType(data['suspended'], 'Boolean');
            }
            if (data.hasOwnProperty('tradingStatus')) {
                obj['tradingStatus'] = ApiClient.convertToType(data['tradingStatus'], 'String');
            }
            if (data.hasOwnProperty('priceDelay')) {
                obj['priceDelay'] = ApiClient.convertToType(data['priceDelay'], 'Number');
            }
            if (data.hasOwnProperty('tickSize')) {
                obj['tickSize'] = ApiClient.convertToType(data['tickSize'], 'Number');
            }
            if (data.hasOwnProperty('lotSize')) {
                obj['lotSize'] = ApiClient.convertToType(data['lotSize'], 'Number');
            }
            if (data.hasOwnProperty('tradeImbalance')) {
                obj['tradeImbalance'] = ApiClient.convertToType(data['tradeImbalance'], 'Number');
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20088DataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('regional')) {
                obj['regional'] = InlineResponse20088DataRegional.constructFromObject(data['regional']);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse20088Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse20088Data.prototype['sourceIdentifier'] = undefined;

/**
 * Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute `market.isOpen`.
 * @member {Boolean} suspended
 */
InlineResponse20088Data.prototype['suspended'] = undefined;

/**
 * Market-specific code of the trading status and/or the suspension of the notation.
 * @member {String} tradingStatus
 */
InlineResponse20088Data.prototype['tradingStatus'] = undefined;

/**
 * Exchange-imposed delay in seconds for delayed-quality tick data.
 * @member {Number} priceDelay
 */
InlineResponse20088Data.prototype['priceDelay'] = undefined;

/**
 * The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint `/notation/get` for the value unit of the `tickSize` for this notation.
 * @member {Number} tickSize
 */
InlineResponse20088Data.prototype['tickSize'] = undefined;

/**
 * The minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value.
 * @member {Number} lotSize
 */
InlineResponse20088Data.prototype['lotSize'] = undefined;

/**
 * Trade imbalance after the previous closed auction. A positive value indicates that more buy orders have been placed for the security; a negative value indicates more sell orders.
 * @member {Number} tradeImbalance
 */
InlineResponse20088Data.prototype['tradeImbalance'] = undefined;

/**
 * @member {module:model/InlineResponse20088DataMarket} market
 */
InlineResponse20088Data.prototype['market'] = undefined;

/**
 * @member {module:model/InlineResponse20088DataRegional} regional
 */
InlineResponse20088Data.prototype['regional'] = undefined;






export default InlineResponse20088Data;

