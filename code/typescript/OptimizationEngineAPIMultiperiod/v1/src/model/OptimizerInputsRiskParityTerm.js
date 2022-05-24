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
import OptimizerInputsEObjectiveRiskTypeEnum from './OptimizerInputsEObjectiveRiskTypeEnum';

/**
 * The OptimizerInputsRiskParityTerm model module.
 * @module model/OptimizerInputsRiskParityTerm
 * @version 0.20.0
 */
class OptimizerInputsRiskParityTerm {
    /**
     * Constructs a new <code>OptimizerInputsRiskParityTerm</code>.
     * @alias module:model/OptimizerInputsRiskParityTerm
     */
    constructor() { 
        
        OptimizerInputsRiskParityTerm.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsRiskParityTerm</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsRiskParityTerm} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsRiskParityTerm} The populated <code>OptimizerInputsRiskParityTerm</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsRiskParityTerm();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('risk_type')) {
                obj['risk_type'] = OptimizerInputsEObjectiveRiskTypeEnum.constructFromObject(data['risk_type']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsRiskParityTerm.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsEObjectiveRiskTypeEnum} risk_type
 */
OptimizerInputsRiskParityTerm.prototype['risk_type'] = undefined;






export default OptimizerInputsRiskParityTerm;

