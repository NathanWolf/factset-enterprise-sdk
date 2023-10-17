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
import InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit from './InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit';

/**
 * The InlineResponse20062DataCostsAndChargesExAnteOngoingCosts model module.
 * @module model/InlineResponse20062DataCostsAndChargesExAnteOngoingCosts
 */
class InlineResponse20062DataCostsAndChargesExAnteOngoingCosts {
    /**
     * Constructs a new <code>InlineResponse20062DataCostsAndChargesExAnteOngoingCosts</code>.
     * Annualized ex ante ongoing cost of the investment product. This cost includes the management fee and the distribution fee. A research fee could also be included here if applicable and not already included in the transaction cost.
     * @alias module:model/InlineResponse20062DataCostsAndChargesExAnteOngoingCosts
     */
    constructor() { 
        
        InlineResponse20062DataCostsAndChargesExAnteOngoingCosts.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataCostsAndChargesExAnteOngoingCosts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataCostsAndChargesExAnteOngoingCosts} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataCostsAndChargesExAnteOngoingCosts} The populated <code>InlineResponse20062DataCostsAndChargesExAnteOngoingCosts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataCostsAndChargesExAnteOngoingCosts();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit.constructFromObject(data['valueUnit']);
            }
        }
        return obj;
    }


}

/**
 * Value of the attribute.
 * @member {Number} value
 */
InlineResponse20062DataCostsAndChargesExAnteOngoingCosts.prototype['value'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit} valueUnit
 */
InlineResponse20062DataCostsAndChargesExAnteOngoingCosts.prototype['valueUnit'] = undefined;






export default InlineResponse20062DataCostsAndChargesExAnteOngoingCosts;

