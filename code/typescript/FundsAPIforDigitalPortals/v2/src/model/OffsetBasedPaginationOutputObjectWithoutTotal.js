/**
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
 * The OffsetBasedPaginationOutputObjectWithoutTotal model module.
 * @module model/OffsetBasedPaginationOutputObjectWithoutTotal
 * @version 0.10.0
 */
class OffsetBasedPaginationOutputObjectWithoutTotal {
    /**
     * Constructs a new <code>OffsetBasedPaginationOutputObjectWithoutTotal</code>.
     * Pagination attributes for the offset-based pagination strategy; a total element count is not supported.
     * @alias module:model/OffsetBasedPaginationOutputObjectWithoutTotal
     * @param hasNext {Boolean} Flag indicating that a subsequent request with the same parameters, except that the parameter `pagination.offset` is incremented by `pagination.limit`, would yield additional results.
     */
    constructor(hasNext) { 
        
        OffsetBasedPaginationOutputObjectWithoutTotal.initialize(this, hasNext);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, hasNext) { 
        obj['hasNext'] = hasNext;
    }

    /**
     * Constructs a <code>OffsetBasedPaginationOutputObjectWithoutTotal</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OffsetBasedPaginationOutputObjectWithoutTotal} obj Optional instance to populate.
     * @return {module:model/OffsetBasedPaginationOutputObjectWithoutTotal} The populated <code>OffsetBasedPaginationOutputObjectWithoutTotal</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OffsetBasedPaginationOutputObjectWithoutTotal();

            if (data.hasOwnProperty('hasNext')) {
                obj['hasNext'] = ApiClient.convertToType(data['hasNext'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Flag indicating that a subsequent request with the same parameters, except that the parameter `pagination.offset` is incremented by `pagination.limit`, would yield additional results.
 * @member {Boolean} hasNext
 */
OffsetBasedPaginationOutputObjectWithoutTotal.prototype['hasNext'] = undefined;






export default OffsetBasedPaginationOutputObjectWithoutTotal;

