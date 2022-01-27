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
import InterimMatDateChgInterimMatDateChg from './InterimMatDateChgInterimMatDateChg';

/**
 * The InterimMatDateChg model module.
 * @module model/InterimMatDateChg
 * @version 0.9.0
 */
class InterimMatDateChg {
    /**
     * Constructs a new <code>InterimMatDateChg</code>.
     * @alias module:model/InterimMatDateChg
     */
    constructor() { 
        
        InterimMatDateChg.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InterimMatDateChg</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InterimMatDateChg} obj Optional instance to populate.
     * @return {module:model/InterimMatDateChg} The populated <code>InterimMatDateChg</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InterimMatDateChg();

            if (data.hasOwnProperty('interimMatDateChg')) {
                obj['interimMatDateChg'] = InterimMatDateChgInterimMatDateChg.constructFromObject(data['interimMatDateChg']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InterimMatDateChgInterimMatDateChg} interimMatDateChg
 */
InterimMatDateChg.prototype['interimMatDateChg'] = undefined;






export default InterimMatDateChg;

