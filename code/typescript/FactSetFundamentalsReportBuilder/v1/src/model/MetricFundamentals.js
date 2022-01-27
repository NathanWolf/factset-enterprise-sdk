/**
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import MetricFundamentalsMetricFundamentals from './MetricFundamentalsMetricFundamentals';

/**
 * The MetricFundamentals model module.
 * @module model/MetricFundamentals
 * @version 0.9.0
 */
class MetricFundamentals {
    /**
     * Constructs a new <code>MetricFundamentals</code>.
     * @alias module:model/MetricFundamentals
     */
    constructor() { 
        
        MetricFundamentals.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MetricFundamentals</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MetricFundamentals} obj Optional instance to populate.
     * @return {module:model/MetricFundamentals} The populated <code>MetricFundamentals</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MetricFundamentals();

            if (data.hasOwnProperty('metricFundamentals')) {
                obj['metricFundamentals'] = MetricFundamentalsMetricFundamentals.constructFromObject(data['metricFundamentals']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/MetricFundamentalsMetricFundamentals} metricFundamentals
 */
MetricFundamentals.prototype['metricFundamentals'] = undefined;






export default MetricFundamentals;

