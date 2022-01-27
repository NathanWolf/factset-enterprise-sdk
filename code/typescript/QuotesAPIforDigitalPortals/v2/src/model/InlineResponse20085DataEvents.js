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
import InlineResponse20085DataType from './InlineResponse20085DataType';

/**
 * The InlineResponse20085DataEvents model module.
 * @module model/InlineResponse20085DataEvents
 * @version 0.9.0
 */
class InlineResponse20085DataEvents {
    /**
     * Constructs a new <code>InlineResponse20085DataEvents</code>.
     * @alias module:model/InlineResponse20085DataEvents
     */
    constructor() { 
        
        InlineResponse20085DataEvents.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20085DataEvents</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20085DataEvents} obj Optional instance to populate.
     * @return {module:model/InlineResponse20085DataEvents} The populated <code>InlineResponse20085DataEvents</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20085DataEvents();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = InlineResponse20085DataType.constructFromObject(data['type']);
            }
        }
        return obj;
    }


}

/**
 * Date and time of the event.
 * @member {String} time
 */
InlineResponse20085DataEvents.prototype['time'] = undefined;

/**
 * @member {module:model/InlineResponse20085DataType} type
 */
InlineResponse20085DataEvents.prototype['type'] = undefined;






export default InlineResponse20085DataEvents;

