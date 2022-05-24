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
import InlineResponse2006InstrumentKnockOutObservation from './InlineResponse2006InstrumentKnockOutObservation';
import InlineResponse2006InstrumentLockOutDistance from './InlineResponse2006InstrumentLockOutDistance';

/**
 * The InlineResponse2006InstrumentLockOut model module.
 * @module model/InlineResponse2006InstrumentLockOut
 * @version 0.10.0
 */
class InlineResponse2006InstrumentLockOut {
    /**
     * Constructs a new <code>InlineResponse2006InstrumentLockOut</code>.
     * Lock-out of the securitized derivative.
     * @alias module:model/InlineResponse2006InstrumentLockOut
     */
    constructor() { 
        
        InlineResponse2006InstrumentLockOut.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006InstrumentLockOut</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006InstrumentLockOut} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006InstrumentLockOut} The populated <code>InlineResponse2006InstrumentLockOut</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006InstrumentLockOut();

            if (data.hasOwnProperty('observation')) {
                obj['observation'] = InlineResponse2006InstrumentKnockOutObservation.constructFromObject(data['observation']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('distance')) {
                obj['distance'] = InlineResponse2006InstrumentLockOutDistance.constructFromObject(data['distance']);
            }
            if (data.hasOwnProperty('cashFlow')) {
                obj['cashFlow'] = ApiClient.convertToType(data['cashFlow'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2006InstrumentKnockOutObservation} observation
 */
InlineResponse2006InstrumentLockOut.prototype['observation'] = undefined;

/**
 * Value of the lock-out.
 * @member {Number} value
 */
InlineResponse2006InstrumentLockOut.prototype['value'] = undefined;

/**
 * @member {module:model/InlineResponse2006InstrumentLockOutDistance} distance
 */
InlineResponse2006InstrumentLockOut.prototype['distance'] = undefined;

/**
 * Cash flow amount.
 * @member {Number} cashFlow
 */
InlineResponse2006InstrumentLockOut.prototype['cashFlow'] = undefined;






export default InlineResponse2006InstrumentLockOut;

