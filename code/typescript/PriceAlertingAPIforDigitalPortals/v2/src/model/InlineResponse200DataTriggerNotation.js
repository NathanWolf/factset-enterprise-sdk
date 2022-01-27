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
 * The InlineResponse200DataTriggerNotation model module.
 * @module model/InlineResponse200DataTriggerNotation
 * @version 0.9.0
 */
class InlineResponse200DataTriggerNotation {
    /**
     * Constructs a new <code>InlineResponse200DataTriggerNotation</code>.
     * Notation data of the trigger.
     * @alias module:model/InlineResponse200DataTriggerNotation
     */
    constructor() { 
        
        InlineResponse200DataTriggerNotation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataTriggerNotation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataTriggerNotation} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataTriggerNotation} The populated <code>InlineResponse200DataTriggerNotation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataTriggerNotation();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse200DataTriggerNotation.prototype['id'] = undefined;






export default InlineResponse200DataTriggerNotation;

