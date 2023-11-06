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
 * The OffsetBasedPaginationOutputObject model module.
 * @module model/OffsetBasedPaginationOutputObject
 */
class OffsetBasedPaginationOutputObject {
    /**
     * Constructs a new <code>OffsetBasedPaginationOutputObject</code>.
     * Pagination attributes for the offset-based pagination strategy.
     * @alias module:model/OffsetBasedPaginationOutputObject
     * @param total {Number} Total number of entries in the result set.
     * @param isEstimatedTotal {Boolean} Flag indicating that the value of \"total\" is estimated.
     */
    constructor(total, isEstimatedTotal) { 
        
        OffsetBasedPaginationOutputObject.initialize(this, total, isEstimatedTotal);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, total, isEstimatedTotal) { 
        obj['total'] = total;
        obj['isEstimatedTotal'] = isEstimatedTotal;
    }

    /**
     * Constructs a <code>OffsetBasedPaginationOutputObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OffsetBasedPaginationOutputObject} obj Optional instance to populate.
     * @return {module:model/OffsetBasedPaginationOutputObject} The populated <code>OffsetBasedPaginationOutputObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OffsetBasedPaginationOutputObject();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
            if (data.hasOwnProperty('isEstimatedTotal')) {
                obj['isEstimatedTotal'] = ApiClient.convertToType(data['isEstimatedTotal'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Total number of entries in the result set.
 * @member {Number} total
 */
OffsetBasedPaginationOutputObject.prototype['total'] = undefined;

/**
 * Flag indicating that the value of \"total\" is estimated.
 * @member {Boolean} isEstimatedTotal
 */
OffsetBasedPaginationOutputObject.prototype['isEstimatedTotal'] = undefined;






export default OffsetBasedPaginationOutputObject;

