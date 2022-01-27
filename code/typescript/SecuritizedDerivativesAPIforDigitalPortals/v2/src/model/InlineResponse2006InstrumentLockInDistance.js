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
 * The InlineResponse2006InstrumentLockInDistance model module.
 * @module model/InlineResponse2006InstrumentLockInDistance
 * @version 0.9.0
 */
class InlineResponse2006InstrumentLockInDistance {
    /**
     * Constructs a new <code>InlineResponse2006InstrumentLockInDistance</code>.
     * Distance of the current underlying level to the lock-in.
     * @alias module:model/InlineResponse2006InstrumentLockInDistance
     */
    constructor() { 
        
        InlineResponse2006InstrumentLockInDistance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006InstrumentLockInDistance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006InstrumentLockInDistance} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006InstrumentLockInDistance} The populated <code>InlineResponse2006InstrumentLockInDistance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006InstrumentLockInDistance();

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
 * Distance in absolute terms.
 * @member {Number} absolute
 */
InlineResponse2006InstrumentLockInDistance.prototype['absolute'] = undefined;

/**
 * Distance relative to the current underlying level.
 * @member {Number} relative
 */
InlineResponse2006InstrumentLockInDistance.prototype['relative'] = undefined;






export default InlineResponse2006InstrumentLockInDistance;

