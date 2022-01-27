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
 * The InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings model module.
 * @module model/InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings
 * @version 0.9.0
 */
class InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings {
    /**
     * Constructs a new <code>InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings</code>.
     * Ratio of the price, divided by the earnings per share.
     * @alias module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings
     */
    constructor() { 
        
        InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings} The populated <code>InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings();

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
InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings.prototype['mean'] = undefined;






export default InlineResponse2004EstimatesFirstFiscalYearRatiosPriceEarnings;

