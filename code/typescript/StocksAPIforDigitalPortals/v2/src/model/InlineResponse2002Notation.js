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
import InlineResponse2002NotationInstrument from './InlineResponse2002NotationInstrument';

/**
 * The InlineResponse2002Notation model module.
 * @module model/InlineResponse2002Notation
 * @version 0.9.2
 */
class InlineResponse2002Notation {
    /**
     * Constructs a new <code>InlineResponse2002Notation</code>.
     * Notation of the benchmark.
     * @alias module:model/InlineResponse2002Notation
     */
    constructor() { 
        
        InlineResponse2002Notation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2002Notation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2002Notation} obj Optional instance to populate.
     * @return {module:model/InlineResponse2002Notation} The populated <code>InlineResponse2002Notation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2002Notation();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse2002NotationInstrument.constructFromObject(data['instrument']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse2002Notation.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse2002NotationInstrument} instrument
 */
InlineResponse2002Notation.prototype['instrument'] = undefined;






export default InlineResponse2002Notation;

