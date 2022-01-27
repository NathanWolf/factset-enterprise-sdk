/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import IndexHistory from './IndexHistory';

/**
 * The IndexHistoryResponse model module.
 * @module model/IndexHistoryResponse
 * @version 0.9.0
 */
class IndexHistoryResponse {
    /**
     * Constructs a new <code>IndexHistoryResponse</code>.
     * @alias module:model/IndexHistoryResponse
     */
    constructor() { 
        
        IndexHistoryResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IndexHistoryResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IndexHistoryResponse} obj Optional instance to populate.
     * @return {module:model/IndexHistoryResponse} The populated <code>IndexHistoryResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IndexHistoryResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [IndexHistory]);
            }
        }
        return obj;
    }


}

/**
 * Array of Index History response objects. 
 * @member {Array.<module:model/IndexHistory>} data
 */
IndexHistoryResponse.prototype['data'] = undefined;






export default IndexHistoryResponse;

