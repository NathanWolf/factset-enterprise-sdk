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
 * The InlineResponse2004Exercise model module.
 * @module model/InlineResponse2004Exercise
 * @version 0.9.0
 */
class InlineResponse2004Exercise {
    /**
     * Constructs a new <code>InlineResponse2004Exercise</code>.
     * Exercise data of the securitized derivative.
     * @alias module:model/InlineResponse2004Exercise
     */
    constructor() { 
        
        InlineResponse2004Exercise.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Exercise</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Exercise} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Exercise} The populated <code>InlineResponse2004Exercise</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Exercise();

            if (data.hasOwnProperty('right')) {
                obj['right'] = ApiClient.convertToType(data['right'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Exercise right.
 * @member {module:model/InlineResponse2004Exercise.RightEnum} right
 */
InlineResponse2004Exercise.prototype['right'] = undefined;





/**
 * Allowed values for the <code>right</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2004Exercise['RightEnum'] = {

    /**
     * value: "put"
     * @const
     */
    "put": "put",

    /**
     * value: "call"
     * @const
     */
    "call": "call"
};



export default InlineResponse2004Exercise;

