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
 * The InlineResponse2004DataRange model module.
 * @module model/InlineResponse2004DataRange
 * @version 0.9.2
 */
class InlineResponse2004DataRange {
    /**
     * Constructs a new <code>InlineResponse2004DataRange</code>.
     * Time range for the returned time series.
     * @alias module:model/InlineResponse2004DataRange
     * @param start {String} The starting point of the time range (inclusive).
     * @param end {String} The ending point of the time range (exclusive).
     */
    constructor(start, end) { 
        
        InlineResponse2004DataRange.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>InlineResponse2004DataRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataRange} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataRange} The populated <code>InlineResponse2004DataRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataRange();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the time range (inclusive).
 * @member {String} start
 */
InlineResponse2004DataRange.prototype['start'] = undefined;

/**
 * The ending point of the time range (exclusive).
 * @member {String} end
 */
InlineResponse2004DataRange.prototype['end'] = undefined;






export default InlineResponse2004DataRange;

