/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20046NotationFsym from './InlineResponse20046NotationFsym';
import InlineResponse20068DataMarket from './InlineResponse20068DataMarket';
import InlineResponse20093Nsin from './InlineResponse20093Nsin';
import InlineResponse20094Instrument from './InlineResponse20094Instrument';
import InlineResponse20094TradingValue from './InlineResponse20094TradingValue';
import InlineResponse20094ValueUnit from './InlineResponse20094ValueUnit';

/**
 * The InlineResponse20094Data model module.
 * @module model/InlineResponse20094Data
 */
class InlineResponse20094Data {
    /**
     * Constructs a new <code>InlineResponse20094Data</code>.
     * @alias module:model/InlineResponse20094Data
     */
    constructor() { 
        
        InlineResponse20094Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20094Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20094Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20094Data} The populated <code>InlineResponse20094Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20094Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20094ValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20068DataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse20093Nsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20046NotationFsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse20094Instrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = InlineResponse20094TradingValue.constructFromObject(data['tradingValue']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of a notation.
 * @member {String} id
 */
InlineResponse20094Data.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20094ValueUnit} valueUnit
 */
InlineResponse20094Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20068DataMarket} market
 */
InlineResponse20094Data.prototype['market'] = undefined;

/**
 * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
 * @member {String} symbol
 */
InlineResponse20094Data.prototype['symbol'] = undefined;

/**
 * @member {module:model/InlineResponse20093Nsin} nsin
 */
InlineResponse20094Data.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse20046NotationFsym} fsym
 */
InlineResponse20094Data.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse20094Instrument} instrument
 */
InlineResponse20094Data.prototype['instrument'] = undefined;

/**
 * @member {module:model/InlineResponse20094TradingValue} tradingValue
 */
InlineResponse20094Data.prototype['tradingValue'] = undefined;






export default InlineResponse20094Data;

