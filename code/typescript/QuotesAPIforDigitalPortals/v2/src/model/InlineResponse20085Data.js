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
import InlineResponse20085DataEvents from './InlineResponse20085DataEvents';
import InlineResponse20085DataRange from './InlineResponse20085DataRange';

/**
 * The InlineResponse20085Data model module.
 * @module model/InlineResponse20085Data
 * @version 0.9.0
 */
class InlineResponse20085Data {
    /**
     * Constructs a new <code>InlineResponse20085Data</code>.
     * List of trading schedule events for a notation.
     * @alias module:model/InlineResponse20085Data
     */
    constructor() { 
        
        InlineResponse20085Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20085Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20085Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20085Data} The populated <code>InlineResponse20085Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20085Data();

            if (data.hasOwnProperty('range')) {
                obj['range'] = InlineResponse20085DataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('events')) {
                obj['events'] = ApiClient.convertToType(data['events'], [InlineResponse20085DataEvents]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20085DataRange} range
 */
InlineResponse20085Data.prototype['range'] = undefined;

/**
 * List of trading schedule events.
 * @member {Array.<module:model/InlineResponse20085DataEvents>} events
 */
InlineResponse20085Data.prototype['events'] = undefined;






export default InlineResponse20085Data;

