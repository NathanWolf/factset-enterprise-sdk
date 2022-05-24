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
import InlineResponse2006DataSubsample from './InlineResponse2006DataSubsample';

/**
 * The InlineResponse2006Data model module.
 * @module model/InlineResponse2006Data
 * @version 0.9.2
 */
class InlineResponse2006Data {
    /**
     * Constructs a new <code>InlineResponse2006Data</code>.
     * Subsample data for the notation.
     * @alias module:model/InlineResponse2006Data
     */
    constructor() { 
        
        InlineResponse2006Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006Data} The populated <code>InlineResponse2006Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006Data();

            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('subsample')) {
                obj['subsample'] = InlineResponse2006DataSubsample.constructFromObject(data['subsample']);
            }
        }
        return obj;
    }


}

/**
 * Quality of the price.
 * @member {module:model/InlineResponse2006Data.QualityEnum} quality
 */
InlineResponse2006Data.prototype['quality'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataSubsample} subsample
 */
InlineResponse2006Data.prototype['subsample'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2006Data['QualityEnum'] = {

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default InlineResponse2006Data;

