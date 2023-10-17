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
import InlineResponse20086Status from './InlineResponse20086Status';
import InlineResponse20089DataCurrency from './InlineResponse20089DataCurrency';
import InlineResponse20089DataValueUnit from './InlineResponse20089DataValueUnit';
import InlineResponse20090Accumulated from './InlineResponse20090Accumulated';
import InlineResponse20090First from './InlineResponse20090First';
import InlineResponse20090High from './InlineResponse20090High';
import InlineResponse20090Latest from './InlineResponse20090Latest';
import InlineResponse20090Low from './InlineResponse20090Low';
import InlineResponse20090Market from './InlineResponse20090Market';
import InlineResponse20090PreviousClose from './InlineResponse20090PreviousClose';

/**
 * The InlineResponse20090Data model module.
 * @module model/InlineResponse20090Data
 */
class InlineResponse20090Data {
    /**
     * Constructs a new <code>InlineResponse20090Data</code>.
     * @alias module:model/InlineResponse20090Data
     */
    constructor() { 
        
        InlineResponse20090Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20090Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20090Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20090Data} The populated <code>InlineResponse20090Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20090Data();

            if (data.hasOwnProperty('idNotation')) {
                obj['idNotation'] = ApiClient.convertToType(data['idNotation'], 'String');
            }
            if (data.hasOwnProperty('sourceIdentifier')) {
                obj['sourceIdentifier'] = ApiClient.convertToType(data['sourceIdentifier'], 'String');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20089DataValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse20089DataCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20090Market.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('latest')) {
                obj['latest'] = InlineResponse20090Latest.constructFromObject(data['latest']);
            }
            if (data.hasOwnProperty('first')) {
                obj['first'] = InlineResponse20090First.constructFromObject(data['first']);
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = InlineResponse20090Low.constructFromObject(data['low']);
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = InlineResponse20090High.constructFromObject(data['high']);
            }
            if (data.hasOwnProperty('previousClose')) {
                obj['previousClose'] = InlineResponse20090PreviousClose.constructFromObject(data['previousClose']);
            }
            if (data.hasOwnProperty('accumulated')) {
                obj['accumulated'] = InlineResponse20090Accumulated.constructFromObject(data['accumulated']);
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = InlineResponse20086Status.constructFromObject(data['status']);
            }
        }
        return obj;
    }


}

/**
 * MDG identifier of the listing.
 * @member {String} idNotation
 */
InlineResponse20090Data.prototype['idNotation'] = undefined;

/**
 * Identifier used in the request.
 * @member {String} sourceIdentifier
 */
InlineResponse20090Data.prototype['sourceIdentifier'] = undefined;

/**
 * @member {module:model/InlineResponse20089DataValueUnit} valueUnit
 */
InlineResponse20090Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20089DataCurrency} currency
 */
InlineResponse20090Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse20090Market} market
 */
InlineResponse20090Data.prototype['market'] = undefined;

/**
 * Quality of the price.
 * @member {module:model/InlineResponse20090Data.QualityEnum} quality
 */
InlineResponse20090Data.prototype['quality'] = undefined;

/**
 * @member {module:model/InlineResponse20090Latest} latest
 */
InlineResponse20090Data.prototype['latest'] = undefined;

/**
 * @member {module:model/InlineResponse20090First} first
 */
InlineResponse20090Data.prototype['first'] = undefined;

/**
 * @member {module:model/InlineResponse20090Low} low
 */
InlineResponse20090Data.prototype['low'] = undefined;

/**
 * @member {module:model/InlineResponse20090High} high
 */
InlineResponse20090Data.prototype['high'] = undefined;

/**
 * @member {module:model/InlineResponse20090PreviousClose} previousClose
 */
InlineResponse20090Data.prototype['previousClose'] = undefined;

/**
 * @member {module:model/InlineResponse20090Accumulated} accumulated
 */
InlineResponse20090Data.prototype['accumulated'] = undefined;

/**
 * @member {module:model/InlineResponse20086Status} status
 */
InlineResponse20090Data.prototype['status'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20090Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default InlineResponse20090Data;

