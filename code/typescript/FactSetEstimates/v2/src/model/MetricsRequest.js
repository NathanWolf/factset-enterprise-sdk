/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Category from './Category';
import Subcategory from './Subcategory';

/**
 * The MetricsRequest model module.
 * @module model/MetricsRequest
 * @version 0.20.0
 */
class MetricsRequest {
    /**
     * Constructs a new <code>MetricsRequest</code>.
     * Metrics Request Body
     * @alias module:model/MetricsRequest
     */
    constructor() { 
        
        MetricsRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MetricsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MetricsRequest} obj Optional instance to populate.
     * @return {module:model/MetricsRequest} The populated <code>MetricsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MetricsRequest();

            if (data.hasOwnProperty('category')) {
                obj['category'] = Category.constructFromObject(data['category']);
            }
            if (data.hasOwnProperty('subcategory')) {
                obj['subcategory'] = Subcategory.constructFromObject(data['subcategory']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Category} category
 */
MetricsRequest.prototype['category'] = undefined;

/**
 * @member {module:model/Subcategory} subcategory
 */
MetricsRequest.prototype['subcategory'] = undefined;






export default MetricsRequest;

