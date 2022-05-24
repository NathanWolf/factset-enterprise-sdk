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
 * The InlineResponse200DataActiveRange model module.
 * @module model/InlineResponse200DataActiveRange
 * @version 0.10.0
 */
class InlineResponse200DataActiveRange {
    /**
     * Constructs a new <code>InlineResponse200DataActiveRange</code>.
     * Time range during which the recommendation list is, was, or will be active.
     * @alias module:model/InlineResponse200DataActiveRange
     * @param start {String} The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.
     * @param end {String} The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
     */
    constructor(start, end) { 
        
        InlineResponse200DataActiveRange.initialize(this, start, end);
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
     * Constructs a <code>InlineResponse200DataActiveRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataActiveRange} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataActiveRange} The populated <code>InlineResponse200DataActiveRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataActiveRange();

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
 * The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.
 * @member {String} start
 */
InlineResponse200DataActiveRange.prototype['start'] = undefined;

/**
 * The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
 * @member {String} end
 */
InlineResponse200DataActiveRange.prototype['end'] = undefined;






export default InlineResponse200DataActiveRange;

