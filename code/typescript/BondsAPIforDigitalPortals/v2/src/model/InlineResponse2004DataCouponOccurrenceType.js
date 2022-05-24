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
 * The InlineResponse2004DataCouponOccurrenceType model module.
 * @module model/InlineResponse2004DataCouponOccurrenceType
 * @version 0.10.0
 */
class InlineResponse2004DataCouponOccurrenceType {
    /**
     * Constructs a new <code>InlineResponse2004DataCouponOccurrenceType</code>.
     * @alias module:model/InlineResponse2004DataCouponOccurrenceType
     */
    constructor() { 
        
        InlineResponse2004DataCouponOccurrenceType.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataCouponOccurrenceType</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataCouponOccurrenceType} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataCouponOccurrenceType} The populated <code>InlineResponse2004DataCouponOccurrenceType</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataCouponOccurrenceType();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Attribute value.
 * @member {module:model/InlineResponse2004DataCouponOccurrenceType.ValueEnum} value
 */
InlineResponse2004DataCouponOccurrenceType.prototype['value'] = undefined;

/**
 * Number of notations.
 * @member {Number} count
 */
InlineResponse2004DataCouponOccurrenceType.prototype['count'] = undefined;





/**
 * Allowed values for the <code>value</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2004DataCouponOccurrenceType['ValueEnum'] = {

    /**
     * value: "never"
     * @const
     */
    "never": "never",

    /**
     * value: "once"
     * @const
     */
    "once": "once",

    /**
     * value: "repeated"
     * @const
     */
    "repeated": "repeated"
};



export default InlineResponse2004DataCouponOccurrenceType;

