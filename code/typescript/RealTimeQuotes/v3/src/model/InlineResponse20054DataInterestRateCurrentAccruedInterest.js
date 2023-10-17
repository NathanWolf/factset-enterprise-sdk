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

/**
 * The InlineResponse20054DataInterestRateCurrentAccruedInterest model module.
 * @module model/InlineResponse20054DataInterestRateCurrentAccruedInterest
 */
class InlineResponse20054DataInterestRateCurrentAccruedInterest {
    /**
     * Constructs a new <code>InlineResponse20054DataInterestRateCurrentAccruedInterest</code>.
     * Accrued interest, i.e. interest earned but not yet received (realized). The interest starts accruing at the beginning of a coupon period and reaches the declared value (see attribute &#x60;interestRate.current.value&#x60;) for that period at its end. For the start and end date of a coupon period see endpoint &#x60;/instrument/coupon/list&#x60;, attribute &#x60;coupons.period&#x60;.
     * @alias module:model/InlineResponse20054DataInterestRateCurrentAccruedInterest
     */
    constructor() { 
        
        InlineResponse20054DataInterestRateCurrentAccruedInterest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20054DataInterestRateCurrentAccruedInterest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20054DataInterestRateCurrentAccruedInterest} obj Optional instance to populate.
     * @return {module:model/InlineResponse20054DataInterestRateCurrentAccruedInterest} The populated <code>InlineResponse20054DataInterestRateCurrentAccruedInterest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20054DataInterestRateCurrentAccruedInterest();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = ApiClient.convertToType(data['absolute'], 'Number');
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = ApiClient.convertToType(data['relative'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Monetary value of the accrued interest. The attribute is available only for instruments with a declared nominal value, e.g. securitized derivatives.
 * @member {Number} absolute
 */
InlineResponse20054DataInterestRateCurrentAccruedInterest.prototype['absolute'] = undefined;

/**
 * Accrued interest.
 * @member {Number} relative
 */
InlineResponse20054DataInterestRateCurrentAccruedInterest.prototype['relative'] = undefined;






export default InlineResponse20054DataInterestRateCurrentAccruedInterest;

