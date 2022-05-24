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
 * The InlineResponse2004DataSensitivitiesBasePointValue model module.
 * @module model/InlineResponse2004DataSensitivitiesBasePointValue
 * @version 0.10.0
 */
class InlineResponse2004DataSensitivitiesBasePointValue {
    /**
     * Constructs a new <code>InlineResponse2004DataSensitivitiesBasePointValue</code>.
     * Base point value, which is the change of the debt instrument&#39;s price for a one base point change (nominally, not relatively) of the prevailing market interest rate. One base point is equivalent to 0.01 percent (1/100 of a percent). The unit of the base point value is the value unit of the notation (see attribute &#x60;valueUnit&#x60;). Not available, if the parameter &#x60;validation.valueUnit.restrict.ids&#x60; has not been set to a single value unit.
     * @alias module:model/InlineResponse2004DataSensitivitiesBasePointValue
     */
    constructor() { 
        
        InlineResponse2004DataSensitivitiesBasePointValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataSensitivitiesBasePointValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataSensitivitiesBasePointValue} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataSensitivitiesBasePointValue} The populated <code>InlineResponse2004DataSensitivitiesBasePointValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataSensitivitiesBasePointValue();

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
InlineResponse2004DataSensitivitiesBasePointValue.prototype['minimum'] = undefined;

/**
 * Maximum value.
 * @member {Number} maximum
 */
InlineResponse2004DataSensitivitiesBasePointValue.prototype['maximum'] = undefined;






export default InlineResponse2004DataSensitivitiesBasePointValue;

