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
import InlineResponse20055DataValidity from './InlineResponse20055DataValidity';

/**
 * The InlineResponse20058Data model module.
 * @module model/InlineResponse20058Data
 * @version 0.9.0
 */
class InlineResponse20058Data {
    /**
     * Constructs a new <code>InlineResponse20058Data</code>.
     * @alias module:model/InlineResponse20058Data
     */
    constructor() { 
        
        InlineResponse20058Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20058Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20058Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20058Data} The populated <code>InlineResponse20058Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20058Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('validity')) {
                obj['validity'] = InlineResponse20055DataValidity.constructFromObject(data['validity']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20058Data.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20055DataValidity} validity
 */
InlineResponse20058Data.prototype['validity'] = undefined;






export default InlineResponse20058Data;

