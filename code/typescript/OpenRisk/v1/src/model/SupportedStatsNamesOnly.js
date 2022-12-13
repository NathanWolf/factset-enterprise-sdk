/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SupportedStatsNamesOnly model module.
 * @module model/SupportedStatsNamesOnly
 */
class SupportedStatsNamesOnly {
    /**
     * Constructs a new <code>SupportedStatsNamesOnly</code>.
     * @alias module:model/SupportedStatsNamesOnly
     * @param data {Array.<String>} Contains the names of all available risk statistics. In the event 'data' field is empty, no stats are available at all.
     */
    constructor(data) { 
        
        SupportedStatsNamesOnly.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>SupportedStatsNamesOnly</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SupportedStatsNamesOnly} obj Optional instance to populate.
     * @return {module:model/SupportedStatsNamesOnly} The populated <code>SupportedStatsNamesOnly</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SupportedStatsNamesOnly();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Contains the names of all available risk statistics. In the event 'data' field is empty, no stats are available at all.
 * @member {Array.<String>} data
 */
SupportedStatsNamesOnly.prototype['data'] = undefined;






export default SupportedStatsNamesOnly;

