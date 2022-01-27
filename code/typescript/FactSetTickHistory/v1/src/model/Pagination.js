/**
 * TickHistory
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Pagination model module.
 * @module model/Pagination
 * @version 0.9.0
 */
class Pagination {
    /**
     * Constructs a new <code>Pagination</code>.
     * List of pagination objects
     * @alias module:model/Pagination
     */
    constructor() { 
        
        Pagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Pagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Pagination} obj Optional instance to populate.
     * @return {module:model/Pagination} The populated <code>Pagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Pagination();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
            if (data.hasOwnProperty('is EstimatedTotal')) {
                obj['is EstimatedTotal'] = ApiClient.convertToType(data['is EstimatedTotal'], 'Boolean');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
            if (data.hasOwnProperty('offset')) {
                obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Total number of files the API returns for a particular query
 * @member {Number} total
 */
Pagination.prototype['total'] = undefined;

/**
 * Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to  “False” as the API should always return the exact count
 * @member {Boolean} is EstimatedTotal
 */
Pagination.prototype['is EstimatedTotal'] = undefined;

/**
 * Number of results returned per page
 * @member {Number} limit
 */
Pagination.prototype['limit'] = undefined;

/**
 * The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results
 * @member {Number} offset
 */
Pagination.prototype['offset'] = undefined;






export default Pagination;

