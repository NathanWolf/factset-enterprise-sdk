/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CursorBasedPaginationOutputObjectWithoutTotal model module.
 * @module model/CursorBasedPaginationOutputObjectWithoutTotal
 * @version 0.9.2
 */
class CursorBasedPaginationOutputObjectWithoutTotal {
    /**
     * Constructs a new <code>CursorBasedPaginationOutputObjectWithoutTotal</code>.
     * Pagination attributes for the cursor-based pagination strategy; a total element count is not supported.
     * @alias module:model/CursorBasedPaginationOutputObjectWithoutTotal
     * @param next {String} Cursor position to use in the attribute `pagination.cursor` to retrieve the next page of results, if any, otherwise null.
     * @param previous {String} Cursor position to use in the attribute `pagination.cursor` to retrieve the previous page of results, if any, otherwise null.
     */
    constructor(next, previous) { 
        
        CursorBasedPaginationOutputObjectWithoutTotal.initialize(this, next, previous);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, next, previous) { 
        obj['next'] = next;
        obj['previous'] = previous;
    }

    /**
     * Constructs a <code>CursorBasedPaginationOutputObjectWithoutTotal</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CursorBasedPaginationOutputObjectWithoutTotal} obj Optional instance to populate.
     * @return {module:model/CursorBasedPaginationOutputObjectWithoutTotal} The populated <code>CursorBasedPaginationOutputObjectWithoutTotal</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CursorBasedPaginationOutputObjectWithoutTotal();

            if (data.hasOwnProperty('next')) {
                obj['next'] = ApiClient.convertToType(data['next'], 'String');
            }
            if (data.hasOwnProperty('previous')) {
                obj['previous'] = ApiClient.convertToType(data['previous'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Cursor position to use in the attribute `pagination.cursor` to retrieve the next page of results, if any, otherwise null.
 * @member {String} next
 */
CursorBasedPaginationOutputObjectWithoutTotal.prototype['next'] = undefined;

/**
 * Cursor position to use in the attribute `pagination.cursor` to retrieve the previous page of results, if any, otherwise null.
 * @member {String} previous
 */
CursorBasedPaginationOutputObjectWithoutTotal.prototype['previous'] = undefined;






export default CursorBasedPaginationOutputObjectWithoutTotal;

