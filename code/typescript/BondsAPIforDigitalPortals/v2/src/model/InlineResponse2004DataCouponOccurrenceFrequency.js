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
 * The InlineResponse2004DataCouponOccurrenceFrequency model module.
 * @module model/InlineResponse2004DataCouponOccurrenceFrequency
 * @version 0.10.0
 */
class InlineResponse2004DataCouponOccurrenceFrequency {
    /**
     * Constructs a new <code>InlineResponse2004DataCouponOccurrenceFrequency</code>.
     * @alias module:model/InlineResponse2004DataCouponOccurrenceFrequency
     */
    constructor() { 
        
        InlineResponse2004DataCouponOccurrenceFrequency.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataCouponOccurrenceFrequency</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataCouponOccurrenceFrequency} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataCouponOccurrenceFrequency} The populated <code>InlineResponse2004DataCouponOccurrenceFrequency</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataCouponOccurrenceFrequency();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a frequency.
 * @member {Number} id
 */
InlineResponse2004DataCouponOccurrenceFrequency.prototype['id'] = undefined;

/**
 * Name of the frequency.
 * @member {String} name
 */
InlineResponse2004DataCouponOccurrenceFrequency.prototype['name'] = undefined;

/**
 * Number of notations.
 * @member {Number} count
 */
InlineResponse2004DataCouponOccurrenceFrequency.prototype['count'] = undefined;






export default InlineResponse2004DataCouponOccurrenceFrequency;

