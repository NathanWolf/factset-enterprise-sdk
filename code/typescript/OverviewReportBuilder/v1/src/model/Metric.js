/**
 * FactSet Overview Report Builder API
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
import MetricMetric from './MetricMetric';

/**
 * The Metric model module.
 * @module model/Metric
 * @version 0.20.0
 */
class Metric {
    /**
     * Constructs a new <code>Metric</code>.
     * @alias module:model/Metric
     */
    constructor() { 
        
        Metric.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Metric</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Metric} obj Optional instance to populate.
     * @return {module:model/Metric} The populated <code>Metric</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Metric();

            if (data.hasOwnProperty('metric')) {
                obj['metric'] = MetricMetric.constructFromObject(data['metric']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/MetricMetric} metric
 */
Metric.prototype['metric'] = undefined;






export default Metric;

