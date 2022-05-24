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
 * The InlineResponse20080LatestPerformanceIntraday model module.
 * @module model/InlineResponse20080LatestPerformanceIntraday
 * @version 0.9.2
 */
class InlineResponse20080LatestPerformanceIntraday {
    /**
     * Constructs a new <code>InlineResponse20080LatestPerformanceIntraday</code>.
     * Performance of the most recent price calculated against the latest price which has occurred before the start of the current trading day.
     * @alias module:model/InlineResponse20080LatestPerformanceIntraday
     */
    constructor() { 
        
        InlineResponse20080LatestPerformanceIntraday.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20080LatestPerformanceIntraday</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20080LatestPerformanceIntraday} obj Optional instance to populate.
     * @return {module:model/InlineResponse20080LatestPerformanceIntraday} The populated <code>InlineResponse20080LatestPerformanceIntraday</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20080LatestPerformanceIntraday();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = ApiClient.convertToType(data['absolute'], 'Number');
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = ApiClient.convertToType(data['relative'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Absolute value. See attribute `valueUnit` for its unit.
 * @member {Number} absolute
 */
InlineResponse20080LatestPerformanceIntraday.prototype['absolute'] = undefined;

/**
 * Relative value.
 * @member {Number} relative
 */
InlineResponse20080LatestPerformanceIntraday.prototype['relative'] = undefined;






export default InlineResponse20080LatestPerformanceIntraday;

