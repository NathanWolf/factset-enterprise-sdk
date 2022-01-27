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
 * The InlineResponse2007DataRangeLowerLevel model module.
 * @module model/InlineResponse2007DataRangeLowerLevel
 * @version 0.9.0
 */
class InlineResponse2007DataRangeLowerLevel {
    /**
     * Constructs a new <code>InlineResponse2007DataRangeLowerLevel</code>.
     * Level of the lower bound.
     * @alias module:model/InlineResponse2007DataRangeLowerLevel
     */
    constructor() { 
        
        InlineResponse2007DataRangeLowerLevel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataRangeLowerLevel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataRangeLowerLevel} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataRangeLowerLevel} The populated <code>InlineResponse2007DataRangeLowerLevel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataRangeLowerLevel();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = ApiClient.convertToType(data['absolute'], 'Number');
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = ApiClient.convertToType(data['relative'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Level in absolute terms.
 * @member {Number} absolute
 */
InlineResponse2007DataRangeLowerLevel.prototype['absolute'] = undefined;

/**
 * Level relative to the underlying level on the issue date of the securitized derivative.
 * @member {Number} relative
 */
InlineResponse2007DataRangeLowerLevel.prototype['relative'] = undefined;






export default InlineResponse2007DataRangeLowerLevel;

