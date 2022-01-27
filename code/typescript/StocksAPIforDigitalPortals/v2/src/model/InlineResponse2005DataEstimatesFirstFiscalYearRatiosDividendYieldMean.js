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
 * The InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean model module.
 * @module model/InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean
 * @version 0.9.0
 */
class InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean {
    /**
     * Constructs a new <code>InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean</code>.
     * Value range of the mean value.
     * @alias module:model/InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean
     */
    constructor() { 
        
        InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean} The populated <code>InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = ApiClient.convertToType(data['minimum'], 'Number');
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = ApiClient.convertToType(data['maximum'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Minimum value.
 * @member {Number} minimum
 */
InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean.prototype['minimum'] = undefined;

/**
 * Maximum value.
 * @member {Number} maximum
 */
InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean.prototype['maximum'] = undefined;






export default InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYieldMean;

