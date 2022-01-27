/**
 * FactSet Capital Structure Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InterimStatusInterimStatus from './InterimStatusInterimStatus';

/**
 * The InterimStatus model module.
 * @module model/InterimStatus
 * @version 0.9.0
 */
class InterimStatus {
    /**
     * Constructs a new <code>InterimStatus</code>.
     * @alias module:model/InterimStatus
     */
    constructor() { 
        
        InterimStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InterimStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InterimStatus} obj Optional instance to populate.
     * @return {module:model/InterimStatus} The populated <code>InterimStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InterimStatus();

            if (data.hasOwnProperty('interimStatus')) {
                obj['interimStatus'] = InterimStatusInterimStatus.constructFromObject(data['interimStatus']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InterimStatusInterimStatus} interimStatus
 */
InterimStatus.prototype['interimStatus'] = undefined;






export default InterimStatus;

