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
 * The InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity model module.
 * @module model/InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity
 * @version 0.9.2
 */
class InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity {
    /**
     * Constructs a new <code>InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity</code>.
     * Return on equity (ROE), which is the ratio of the net income, divided by the total shareholders&#39; equity.
     * @alias module:model/InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity
     */
    constructor() { 
        
        InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity} The populated <code>InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity();

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
InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity.prototype['mean'] = undefined;






export default InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity;

