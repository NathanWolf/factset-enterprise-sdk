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
import OptimizerInputsQuantRiskModel from './OptimizerInputsQuantRiskModel';
import OptimizerInputsRawRiskModel from './OptimizerInputsRawRiskModel';
import OptimizerInputsSimulatedRiskModel from './OptimizerInputsSimulatedRiskModel';

/**
 * The OptimizerInputsRiskModel model module.
 * @module model/OptimizerInputsRiskModel
 * @version 0.20.0
 */
class OptimizerInputsRiskModel {
    /**
     * Constructs a new <code>OptimizerInputsRiskModel</code>.
     * @alias module:model/OptimizerInputsRiskModel
     */
    constructor() { 
        
        OptimizerInputsRiskModel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsRiskModel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsRiskModel} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsRiskModel} The populated <code>OptimizerInputsRiskModel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsRiskModel();

            if (data.hasOwnProperty('simulated_risk_model')) {
                obj['simulated_risk_model'] = OptimizerInputsSimulatedRiskModel.constructFromObject(data['simulated_risk_model']);
            }
            if (data.hasOwnProperty('quant_risk_model')) {
                obj['quant_risk_model'] = OptimizerInputsQuantRiskModel.constructFromObject(data['quant_risk_model']);
            }
            if (data.hasOwnProperty('raw_model')) {
                obj['raw_model'] = OptimizerInputsRawRiskModel.constructFromObject(data['raw_model']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerInputsSimulatedRiskModel} simulated_risk_model
 */
OptimizerInputsRiskModel.prototype['simulated_risk_model'] = undefined;

/**
 * @member {module:model/OptimizerInputsQuantRiskModel} quant_risk_model
 */
OptimizerInputsRiskModel.prototype['quant_risk_model'] = undefined;

/**
 * @member {module:model/OptimizerInputsRawRiskModel} raw_model
 */
OptimizerInputsRiskModel.prototype['raw_model'] = undefined;






export default OptimizerInputsRiskModel;

