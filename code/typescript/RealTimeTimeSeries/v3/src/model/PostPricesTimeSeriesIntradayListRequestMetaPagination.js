/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
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
 * The PostPricesTimeSeriesIntradayListRequestMetaPagination model module.
 * @module model/PostPricesTimeSeriesIntradayListRequestMetaPagination
 */
class PostPricesTimeSeriesIntradayListRequestMetaPagination {
    /**
     * Constructs a new <code>PostPricesTimeSeriesIntradayListRequestMetaPagination</code>.
     * Pagination attributes for the cursor-based pagination strategy.
     * @alias module:model/PostPricesTimeSeriesIntradayListRequestMetaPagination
     */
    constructor() { 
        
        PostPricesTimeSeriesIntradayListRequestMetaPagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostPricesTimeSeriesIntradayListRequestMetaPagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostPricesTimeSeriesIntradayListRequestMetaPagination} obj Optional instance to populate.
     * @return {module:model/PostPricesTimeSeriesIntradayListRequestMetaPagination} The populated <code>PostPricesTimeSeriesIntradayListRequestMetaPagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostPricesTimeSeriesIntradayListRequestMetaPagination();

            if (data.hasOwnProperty('cursor')) {
                obj['cursor'] = ApiClient.convertToType(data['cursor'], 'String');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default).
 * @member {String} cursor
 */
PostPricesTimeSeriesIntradayListRequestMetaPagination.prototype['cursor'] = undefined;

/**
 * Non-negative maximum number of entries to return.
 * @member {Number} limit
 * @default 20
 */
PostPricesTimeSeriesIntradayListRequestMetaPagination.prototype['limit'] = 20;






export default PostPricesTimeSeriesIntradayListRequestMetaPagination;

