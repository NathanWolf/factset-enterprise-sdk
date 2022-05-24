/**
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsFactorExposureAttributes model module.
 * @module model/OptimizerInputsFactorExposureAttributes
 * @version 0.20.0
 */
class OptimizerInputsFactorExposureAttributes {
    /**
     * Constructs a new <code>OptimizerInputsFactorExposureAttributes</code>.
     * @alias module:model/OptimizerInputsFactorExposureAttributes
     */
    constructor() { 
        
        OptimizerInputsFactorExposureAttributes.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsFactorExposureAttributes</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsFactorExposureAttributes} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsFactorExposureAttributes} The populated <code>OptimizerInputsFactorExposureAttributes</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsFactorExposureAttributes();

            if (data.hasOwnProperty('min')) {
                obj['min'] = OptimizerInputsValue.constructFromObject(data['min']);
            }
            if (data.hasOwnProperty('max')) {
                obj['max'] = OptimizerInputsValue.constructFromObject(data['max']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerInputsValue} min
 */
OptimizerInputsFactorExposureAttributes.prototype['min'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max
 */
OptimizerInputsFactorExposureAttributes.prototype['max'] = undefined;






export default OptimizerInputsFactorExposureAttributes;

