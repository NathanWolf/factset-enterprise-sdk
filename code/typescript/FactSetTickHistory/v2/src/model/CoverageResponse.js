/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CoverageTickHistory from './CoverageTickHistory';

/**
 * The CoverageResponse model module.
 * @module model/CoverageResponse
 */
class CoverageResponse {
    /**
     * Constructs a new <code>CoverageResponse</code>.
     * Returns coverage for Level1 Data
     * @alias module:model/CoverageResponse
     */
    constructor() { 
        
        CoverageResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CoverageResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CoverageResponse} obj Optional instance to populate.
     * @return {module:model/CoverageResponse} The populated <code>CoverageResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CoverageResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [CoverageTickHistory]);
            }
        }
        return obj;
    }


}

/**
 * Returns Coverage Response
 * @member {Array.<module:model/CoverageTickHistory>} data
 */
CoverageResponse.prototype['data'] = undefined;






export default CoverageResponse;

