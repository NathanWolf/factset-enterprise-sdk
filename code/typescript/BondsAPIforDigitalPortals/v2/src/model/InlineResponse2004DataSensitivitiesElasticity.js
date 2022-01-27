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
 * The InlineResponse2004DataSensitivitiesElasticity model module.
 * @module model/InlineResponse2004DataSensitivitiesElasticity
 * @version 0.9.0
 */
class InlineResponse2004DataSensitivitiesElasticity {
    /**
     * Constructs a new <code>InlineResponse2004DataSensitivitiesElasticity</code>.
     * Yield elasticity, which is the ratio of the percentage change of the debt instrument&#39;s price for a one percent change (relatively, not nominally) of the prevailing market interest rate.
     * @alias module:model/InlineResponse2004DataSensitivitiesElasticity
     */
    constructor() { 
        
        InlineResponse2004DataSensitivitiesElasticity.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataSensitivitiesElasticity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataSensitivitiesElasticity} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataSensitivitiesElasticity} The populated <code>InlineResponse2004DataSensitivitiesElasticity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataSensitivitiesElasticity();

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
InlineResponse2004DataSensitivitiesElasticity.prototype['minimum'] = undefined;

/**
 * Maximum value.
 * @member {Number} maximum
 */
InlineResponse2004DataSensitivitiesElasticity.prototype['maximum'] = undefined;






export default InlineResponse2004DataSensitivitiesElasticity;

