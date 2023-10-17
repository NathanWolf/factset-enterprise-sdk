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
import InlineResponse20062DataTargetMarketRiskToleranceGermany from './InlineResponse20062DataTargetMarketRiskToleranceGermany';
import InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating from './InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating';
import InlineResponse20062DataTargetMarketRiskToleranceSpain from './InlineResponse20062DataTargetMarketRiskToleranceSpain';
import InlineResponse20062DataTargetMarketRiskToleranceSri from './InlineResponse20062DataTargetMarketRiskToleranceSri';
import InlineResponse20062DataTargetMarketRiskToleranceSrri from './InlineResponse20062DataTargetMarketRiskToleranceSrri';

/**
 * The InlineResponse20062DataTargetMarketRiskTolerance model module.
 * @module model/InlineResponse20062DataTargetMarketRiskTolerance
 */
class InlineResponse20062DataTargetMarketRiskTolerance {
    /**
     * Constructs a new <code>InlineResponse20062DataTargetMarketRiskTolerance</code>.
     * Quantifies the risk associated with the product by assigning a rating using an appropriate risk rating system.
     * @alias module:model/InlineResponse20062DataTargetMarketRiskTolerance
     */
    constructor() { 
        
        InlineResponse20062DataTargetMarketRiskTolerance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataTargetMarketRiskTolerance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataTargetMarketRiskTolerance} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataTargetMarketRiskTolerance} The populated <code>InlineResponse20062DataTargetMarketRiskTolerance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataTargetMarketRiskTolerance();

            if (data.hasOwnProperty('sri')) {
                obj['sri'] = InlineResponse20062DataTargetMarketRiskToleranceSri.constructFromObject(data['sri']);
            }
            if (data.hasOwnProperty('srri')) {
                obj['srri'] = InlineResponse20062DataTargetMarketRiskToleranceSrri.constructFromObject(data['srri']);
            }
            if (data.hasOwnProperty('internalRiskRating')) {
                obj['internalRiskRating'] = InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating.constructFromObject(data['internalRiskRating']);
            }
            if (data.hasOwnProperty('spain')) {
                obj['spain'] = InlineResponse20062DataTargetMarketRiskToleranceSpain.constructFromObject(data['spain']);
            }
            if (data.hasOwnProperty('germany')) {
                obj['germany'] = InlineResponse20062DataTargetMarketRiskToleranceGermany.constructFromObject(data['germany']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRiskToleranceSri} sri
 */
InlineResponse20062DataTargetMarketRiskTolerance.prototype['sri'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRiskToleranceSrri} srri
 */
InlineResponse20062DataTargetMarketRiskTolerance.prototype['srri'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating} internalRiskRating
 */
InlineResponse20062DataTargetMarketRiskTolerance.prototype['internalRiskRating'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRiskToleranceSpain} spain
 */
InlineResponse20062DataTargetMarketRiskTolerance.prototype['spain'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketRiskToleranceGermany} germany
 */
InlineResponse20062DataTargetMarketRiskTolerance.prototype['germany'] = undefined;






export default InlineResponse20062DataTargetMarketRiskTolerance;

