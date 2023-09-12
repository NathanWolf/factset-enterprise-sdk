/**
 * SPAR Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PaginationInfo model module.
 * @module model/PaginationInfo
 */
class PaginationInfo {
    /**
     * Constructs a new <code>PaginationInfo</code>.
     * @alias module:model/PaginationInfo
     */
    constructor() { 
        
        PaginationInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaginationInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaginationInfo} obj Optional instance to populate.
     * @return {module:model/PaginationInfo} The populated <code>PaginationInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaginationInfo();

            if (data.hasOwnProperty('pageNumber')) {
                obj['pageNumber'] = ApiClient.convertToType(data['pageNumber'], 'Number');
            }
            if (data.hasOwnProperty('pageSize')) {
                obj['pageSize'] = ApiClient.convertToType(data['pageSize'], 'Number');
            }
            if (data.hasOwnProperty('totalPages')) {
                obj['totalPages'] = ApiClient.convertToType(data['totalPages'], 'Number');
            }
            if (data.hasOwnProperty('totalCalculations')) {
                obj['totalCalculations'] = ApiClient.convertToType(data['totalCalculations'], 'Number');
            }
            if (data.hasOwnProperty('nextPage')) {
                obj['nextPage'] = ApiClient.convertToType(data['nextPage'], 'String');
            }
            if (data.hasOwnProperty('previousPage')) {
                obj['previousPage'] = ApiClient.convertToType(data['previousPage'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} pageNumber
 */
PaginationInfo.prototype['pageNumber'] = undefined;

/**
 * @member {Number} pageSize
 */
PaginationInfo.prototype['pageSize'] = undefined;

/**
 * @member {Number} totalPages
 */
PaginationInfo.prototype['totalPages'] = undefined;

/**
 * @member {Number} totalCalculations
 */
PaginationInfo.prototype['totalCalculations'] = undefined;

/**
 * @member {String} nextPage
 */
PaginationInfo.prototype['nextPage'] = undefined;

/**
 * @member {String} previousPage
 */
PaginationInfo.prototype['previousPage'] = undefined;






export default PaginationInfo;

