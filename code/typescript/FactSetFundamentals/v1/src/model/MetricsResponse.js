/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Metric from './Metric';

/**
 * The MetricsResponse model module.
 * @module model/MetricsResponse
 * @version 0.9.0
 */
class MetricsResponse {
    /**
     * Constructs a new <code>MetricsResponse</code>.
     * @alias module:model/MetricsResponse
     */
    constructor() { 
        
        MetricsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MetricsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MetricsResponse} obj Optional instance to populate.
     * @return {module:model/MetricsResponse} The populated <code>MetricsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MetricsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Metric]);
            }
        }
        return obj;
    }


}

/**
 * Array of metric objects representing the metrics that can be requested from the fundamentals APIs. 
 * @member {Array.<module:model/Metric>} data
 */
MetricsResponse.prototype['data'] = undefined;






export default MetricsResponse;

