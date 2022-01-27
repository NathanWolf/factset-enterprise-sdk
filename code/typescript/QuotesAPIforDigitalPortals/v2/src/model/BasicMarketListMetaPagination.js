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
 * The BasicMarketListMetaPagination model module.
 * @module model/BasicMarketListMetaPagination
 * @version 0.9.0
 */
class BasicMarketListMetaPagination {
    /**
     * Constructs a new <code>BasicMarketListMetaPagination</code>.
     * Pagination attributes for the offset-based pagination strategy.
     * @alias module:model/BasicMarketListMetaPagination
     */
    constructor() { 
        
        BasicMarketListMetaPagination.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicMarketListMetaPagination</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicMarketListMetaPagination} obj Optional instance to populate.
     * @return {module:model/BasicMarketListMetaPagination} The populated <code>BasicMarketListMetaPagination</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicMarketListMetaPagination();

            if (data.hasOwnProperty('offset')) {
                obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
            }
            if (data.hasOwnProperty('limit')) {
                obj['limit'] = ApiClient.convertToType(data['limit'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Non-negative number of entries to skip, or 0 (default).
 * @member {Number} offset
 */
BasicMarketListMetaPagination.prototype['offset'] = undefined;

/**
 * Non-negative maximum number of entries to return.
 * @member {Number} limit
 */
BasicMarketListMetaPagination.prototype['limit'] = undefined;






export default BasicMarketListMetaPagination;

