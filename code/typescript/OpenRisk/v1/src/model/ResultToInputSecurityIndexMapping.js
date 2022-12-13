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
 * The ResultToInputSecurityIndexMapping model module.
 * @module model/ResultToInputSecurityIndexMapping
 */
class ResultToInputSecurityIndexMapping {
    /**
     * Constructs a new <code>ResultToInputSecurityIndexMapping</code>.
     * For each input holding from the request, a list of indices aligned to the security dimension of the results arrays and the &#x60;labels.security.ids&#x60; array. These 0-based index values key into the input holding&#39;s IDs. Values less than 0 indicate result index not originating from corresponding holding.
     * @alias module:model/ResultToInputSecurityIndexMapping
     * @param portfolio {Array.<Number>} 
     */
    constructor(portfolio) { 
        
        ResultToInputSecurityIndexMapping.initialize(this, portfolio);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, portfolio) { 
        obj['portfolio'] = portfolio;
    }

    /**
     * Constructs a <code>ResultToInputSecurityIndexMapping</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResultToInputSecurityIndexMapping} obj Optional instance to populate.
     * @return {module:model/ResultToInputSecurityIndexMapping} The populated <code>ResultToInputSecurityIndexMapping</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResultToInputSecurityIndexMapping();

            if (data.hasOwnProperty('portfolio')) {
                obj['portfolio'] = ApiClient.convertToType(data['portfolio'], ['Number']);
            }
            if (data.hasOwnProperty('benchmark')) {
                obj['benchmark'] = ApiClient.convertToType(data['benchmark'], ['Number']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = ApiClient.convertToType(data['market'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<Number>} portfolio
 */
ResultToInputSecurityIndexMapping.prototype['portfolio'] = undefined;

/**
 * @member {Array.<Number>} benchmark
 */
ResultToInputSecurityIndexMapping.prototype['benchmark'] = undefined;

/**
 * @member {Array.<Number>} market
 */
ResultToInputSecurityIndexMapping.prototype['market'] = undefined;






export default ResultToInputSecurityIndexMapping;

