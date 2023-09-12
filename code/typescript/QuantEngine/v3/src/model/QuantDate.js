/**
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The QuantDate model module.
 * @module model/QuantDate
 */
class QuantDate {
    /**
     * Constructs a new <code>QuantDate</code>.
     * @alias module:model/QuantDate
     * @param source {module:model/QuantDate.SourceEnum} 
     * @param frequency {String} 
     * @param calendar {String} 
     */
    constructor(source, frequency, calendar) { 
        
        QuantDate.initialize(this, source, frequency, calendar);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, source, frequency, calendar) { 
        obj['source'] = source;
        obj['frequency'] = frequency;
        obj['calendar'] = calendar;
    }

    /**
     * Constructs a <code>QuantDate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuantDate} obj Optional instance to populate.
     * @return {module:model/QuantDate} The populated <code>QuantDate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuantDate();

            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = ApiClient.convertToType(data['frequency'], 'String');
            }
            if (data.hasOwnProperty('calendar')) {
                obj['calendar'] = ApiClient.convertToType(data['calendar'], 'String');
            }
            if (data.hasOwnProperty('overrideUniversalScreenCalendar')) {
                obj['overrideUniversalScreenCalendar'] = ApiClient.convertToType(data['overrideUniversalScreenCalendar'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/QuantDate.SourceEnum} source
 */
QuantDate.prototype['source'] = undefined;

/**
 * @member {String} frequency
 */
QuantDate.prototype['frequency'] = undefined;

/**
 * @member {String} calendar
 */
QuantDate.prototype['calendar'] = undefined;

/**
 * @member {Boolean} overrideUniversalScreenCalendar
 */
QuantDate.prototype['overrideUniversalScreenCalendar'] = undefined;





/**
 * Allowed values for the <code>source</code> property.
 * @enum {String}
 * @readonly
 */
QuantDate['SourceEnum'] = {

    /**
     * value: "FdsDate"
     * @const
     */
    "FdsDate": "FdsDate",

    /**
     * value: "DateList"
     * @const
     */
    "DateList": "DateList"
};



export default QuantDate;

