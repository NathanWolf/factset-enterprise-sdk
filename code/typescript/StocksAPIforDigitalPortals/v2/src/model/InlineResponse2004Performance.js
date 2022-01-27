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
import InlineResponse2004PerformanceEndOfDay from './InlineResponse2004PerformanceEndOfDay';

/**
 * The InlineResponse2004Performance model module.
 * @module model/InlineResponse2004Performance
 * @version 0.9.0
 */
class InlineResponse2004Performance {
    /**
     * Constructs a new <code>InlineResponse2004Performance</code>.
     * Relative performance for different time ranges.
     * @alias module:model/InlineResponse2004Performance
     */
    constructor() { 
        
        InlineResponse2004Performance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Performance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Performance} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Performance} The populated <code>InlineResponse2004Performance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Performance();

            if (data.hasOwnProperty('intraday')) {
                obj['intraday'] = ApiClient.convertToType(data['intraday'], 'Number');
            }
            if (data.hasOwnProperty('endOfDay')) {
                obj['endOfDay'] = InlineResponse2004PerformanceEndOfDay.constructFromObject(data['endOfDay']);
            }
        }
        return obj;
    }


}

/**
 * Intraday relative performance. That is the difference of a notation's most recent price from the current trading day against the most recent EOD closing price.
 * @member {Number} intraday
 */
InlineResponse2004Performance.prototype['intraday'] = undefined;

/**
 * @member {module:model/InlineResponse2004PerformanceEndOfDay} endOfDay
 */
InlineResponse2004Performance.prototype['endOfDay'] = undefined;






export default InlineResponse2004Performance;

