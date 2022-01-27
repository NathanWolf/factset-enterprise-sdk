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
 * The InlineResponse2007DataCalculationLevel model module.
 * @module model/InlineResponse2007DataCalculationLevel
 * @version 0.9.0
 */
class InlineResponse2007DataCalculationLevel {
    /**
     * Constructs a new <code>InlineResponse2007DataCalculationLevel</code>.
     * Details of the underlying regarding the calculation of the barrier key figures, see object &#x60;distance&#x60;.
     * @alias module:model/InlineResponse2007DataCalculationLevel
     */
    constructor() { 
        
        InlineResponse2007DataCalculationLevel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataCalculationLevel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataCalculationLevel} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataCalculationLevel} The populated <code>InlineResponse2007DataCalculationLevel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataCalculationLevel();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Level of the underlying used for calculation.
 * @member {Number} value
 */
InlineResponse2007DataCalculationLevel.prototype['value'] = undefined;

/**
 * Date and time of the level of the underlying used for calculation.
 * @member {String} time
 */
InlineResponse2007DataCalculationLevel.prototype['time'] = undefined;






export default InlineResponse2007DataCalculationLevel;

