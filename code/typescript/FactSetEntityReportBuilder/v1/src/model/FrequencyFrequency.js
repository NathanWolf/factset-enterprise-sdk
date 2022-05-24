/**
 * FactSet Entity Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FrequencyFrequency model module.
 * @module model/FrequencyFrequency
 * @version 0.20.0
 */
class FrequencyFrequency {
    /**
     * Constructs a new <code>FrequencyFrequency</code>.
     * String with frequency of a data series. Allowed values: - \&quot;D\&quot; (daily) - \&quot;W\&quot; (weekly) - \&quot;AW\&quot; (actual weekly) - \&quot;M\&quot; (monthly) - \&quot;AM\&quot; (actual monthly) - \&quot;Q\&quot; (quarterly) - \&quot;FQ\&quot; (fiscal quarterly) - \&quot;CQ\&quot; (calendar quarterly) - \&quot;AQ\&quot; (actual quarterly) - \&quot;Y\&quot; (yearly) - \&quot;FY\&quot; (fiscal yearly) - \&quot;CY\&quot; (calendar yearly) - \&quot;AY\&quot; (actual yearly) - \&quot;MTD\&quot; (month-to-date) - \&quot;QTD\&quot; (quarter-to-date) - \&quot;YTD\&quot; (year-to-date) - \&quot;FYTD\&quot; (fiscal-year-to-date) - \&quot;CYTD\&quot; (calendar-year-to-date) 
     * @alias module:model/FrequencyFrequency
     */
    constructor() { 
        
        FrequencyFrequency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FrequencyFrequency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FrequencyFrequency} obj Optional instance to populate.
     * @return {module:model/FrequencyFrequency} The populated <code>FrequencyFrequency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FrequencyFrequency();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FrequencyFrequency.ValueEnum} value
 */
FrequencyFrequency.prototype['value'] = undefined;





/**
 * Allowed values for the <code>value</code> property.
 * @enum {String}
 * @readonly
 */
FrequencyFrequency['ValueEnum'] = {

    /**
     * value: "D"
     * @const
     */
    "D": "D",

    /**
     * value: "W"
     * @const
     */
    "W": "W",

    /**
     * value: "AW"
     * @const
     */
    "AW": "AW",

    /**
     * value: "M"
     * @const
     */
    "M": "M",

    /**
     * value: "AM"
     * @const
     */
    "AM": "AM",

    /**
     * value: "Q"
     * @const
     */
    "Q": "Q",

    /**
     * value: "FQ"
     * @const
     */
    "FQ": "FQ",

    /**
     * value: "CQ"
     * @const
     */
    "CQ": "CQ",

    /**
     * value: "AQ"
     * @const
     */
    "AQ": "AQ",

    /**
     * value: "Y"
     * @const
     */
    "Y": "Y",

    /**
     * value: "FY"
     * @const
     */
    "FY": "FY",

    /**
     * value: "CY"
     * @const
     */
    "CY": "CY",

    /**
     * value: "AY"
     * @const
     */
    "AY": "AY",

    /**
     * value: "MTD"
     * @const
     */
    "MTD": "MTD",

    /**
     * value: "QTD"
     * @const
     */
    "QTD": "QTD",

    /**
     * value: "YTD"
     * @const
     */
    "YTD": "YTD",

    /**
     * value: "FYTD"
     * @const
     */
    "FYTD": "FYTD",

    /**
     * value: "CYTD"
     * @const
     */
    "CYTD": "CYTD"
};



export default FrequencyFrequency;

