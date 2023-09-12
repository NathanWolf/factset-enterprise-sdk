/**
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SearchResponseMetaPagination model module.
 * @module model/SearchResponseMetaPagination
 */
class SearchResponseMetaPagination {
    /**
     * Constructs a new <code>SearchResponseMetaPagination</code>.
     * @alias module:model/SearchResponseMetaPagination
     */
    constructor() { 
        
        SearchResponseMetaPagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SearchResponseMetaPagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchResponseMetaPagination} obj Optional instance to populate.
     * @return {module:model/SearchResponseMetaPagination} The populated <code>SearchResponseMetaPagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchResponseMetaPagination();

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
 * @member {Number} total
 */
SearchResponseMetaPagination.prototype['total'] = undefined;

/**
 * @member {Boolean} isEstimatedTotal
 */
SearchResponseMetaPagination.prototype['isEstimatedTotal'] = undefined;






export default SearchResponseMetaPagination;

