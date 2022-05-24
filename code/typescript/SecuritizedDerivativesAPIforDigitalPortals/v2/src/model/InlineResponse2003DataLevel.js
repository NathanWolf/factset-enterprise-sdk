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
 * The InlineResponse2003DataLevel model module.
 * @module model/InlineResponse2003DataLevel
 * @version 0.10.0
 */
class InlineResponse2003DataLevel {
    /**
     * Constructs a new <code>InlineResponse2003DataLevel</code>.
     * Level (e.g. price or index value) of the underlying used for calculation.
     * @alias module:model/InlineResponse2003DataLevel
     */
    constructor() { 
        
        InlineResponse2003DataLevel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003DataLevel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003DataLevel} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003DataLevel} The populated <code>InlineResponse2003DataLevel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003DataLevel();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Date and time.
 * @member {String} time
 */
InlineResponse2003DataLevel.prototype['time'] = undefined;

/**
 * Level value. See attribute `underlyings.valueUnit` for the unit.
 * @member {Number} value
 */
InlineResponse2003DataLevel.prototype['value'] = undefined;






export default InlineResponse2003DataLevel;

