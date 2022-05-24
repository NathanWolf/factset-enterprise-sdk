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
import OptimizerInputsEAlphaUnitTypeEnum from './OptimizerInputsEAlphaUnitTypeEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsExpectedReturn model module.
 * @module model/OptimizerInputsExpectedReturn
 * @version 0.20.0
 */
class OptimizerInputsExpectedReturn {
    /**
     * Constructs a new <code>OptimizerInputsExpectedReturn</code>.
     * @alias module:model/OptimizerInputsExpectedReturn
     */
    constructor() { 
        
        OptimizerInputsExpectedReturn.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsExpectedReturn</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsExpectedReturn} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsExpectedReturn} The populated <code>OptimizerInputsExpectedReturn</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsExpectedReturn();

            if (data.hasOwnProperty('alpha')) {
                obj['alpha'] = OptimizerInputsValue.constructFromObject(data['alpha']);
            }
            if (data.hasOwnProperty('alpha_unit')) {
                obj['alpha_unit'] = OptimizerInputsEAlphaUnitTypeEnum.constructFromObject(data['alpha_unit']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerInputsValue} alpha
 */
OptimizerInputsExpectedReturn.prototype['alpha'] = undefined;

/**
 * @member {module:model/OptimizerInputsEAlphaUnitTypeEnum} alpha_unit
 */
OptimizerInputsExpectedReturn.prototype['alpha_unit'] = undefined;






export default OptimizerInputsExpectedReturn;

