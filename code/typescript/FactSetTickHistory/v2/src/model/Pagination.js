/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
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
            if (data.hasOwnProperty('isEstimatedTotal')) {
                obj['isEstimatedTotal'] = ApiClient.convertToType(data['isEstimatedTotal'], 'Boolean');
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
 * Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to False as the API should always return the exact count
 * @member {Boolean} isEstimatedTotal
 */
Pagination.prototype['isEstimatedTotal'] = undefined;






export default Pagination;

