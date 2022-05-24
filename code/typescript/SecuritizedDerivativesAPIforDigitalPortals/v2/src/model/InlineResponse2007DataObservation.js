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
import InlineResponse2007DataObservationPeriod from './InlineResponse2007DataObservationPeriod';

/**
 * The InlineResponse2007DataObservation model module.
 * @module model/InlineResponse2007DataObservation
 * @version 0.10.0
 */
class InlineResponse2007DataObservation {
    /**
     * Constructs a new <code>InlineResponse2007DataObservation</code>.
     * Barrier observation modality of the condition.
     * @alias module:model/InlineResponse2007DataObservation
     */
    constructor() { 
        
        InlineResponse2007DataObservation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataObservation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataObservation} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataObservation} The populated <code>InlineResponse2007DataObservation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataObservation();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('period')) {
                obj['period'] = InlineResponse2007DataObservationPeriod.constructFromObject(data['period']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the type of observation during the observation period.
 * @member {module:model/InlineResponse2007DataObservation.TypeEnum} type
 */
InlineResponse2007DataObservation.prototype['type'] = undefined;

/**
 * @member {module:model/InlineResponse2007DataObservationPeriod} period
 */
InlineResponse2007DataObservation.prototype['period'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2007DataObservation['TypeEnum'] = {

    /**
     * value: "continuous"
     * @const
     */
    "continuous": "continuous",

    /**
     * value: "eod"
     * @const
     */
    "eod": "eod"
};



export default InlineResponse2007DataObservation;

