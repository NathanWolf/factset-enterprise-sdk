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
 * The InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit model module.
 * @module model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit
 * @version 0.9.0
 */
class InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit {
    /**
     * Constructs a new <code>InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit</code>.
     * Ratio of the enterprise value, divided by the EBIT.
     * @alias module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit
     */
    constructor() { 
        
        InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit} The populated <code>InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit();

            if (data.hasOwnProperty('mean')) {
                obj['mean'] = ApiClient.convertToType(data['mean'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Mean value.
 * @member {Number} mean
 */
InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit.prototype['mean'] = undefined;






export default InlineResponse2004EstimatesFirstFiscalYearRatiosEnterpriseValueEbit;

