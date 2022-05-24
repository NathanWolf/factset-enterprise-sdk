/**
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
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

/**
 * The InlineResponse20055DataValidity model module.
 * @module model/InlineResponse20055DataValidity
 * @version 0.10.0
 */
class InlineResponse20055DataValidity {
    /**
     * Constructs a new <code>InlineResponse20055DataValidity</code>.
     * Time range that this translation is valid for.
     * @alias module:model/InlineResponse20055DataValidity
     * @param start {String} The starting point of the time range (inclusive).
     * @param end {String} The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
     */
    constructor(start, end) { 
        
        InlineResponse20055DataValidity.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>InlineResponse20055DataValidity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20055DataValidity} obj Optional instance to populate.
     * @return {module:model/InlineResponse20055DataValidity} The populated <code>InlineResponse20055DataValidity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20055DataValidity();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the time range (inclusive).
 * @member {String} start
 */
InlineResponse20055DataValidity.prototype['start'] = undefined;

/**
 * The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
 * @member {String} end
 */
InlineResponse20055DataValidity.prototype['end'] = undefined;






export default InlineResponse20055DataValidity;

