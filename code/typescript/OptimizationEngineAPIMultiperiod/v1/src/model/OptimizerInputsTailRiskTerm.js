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
import OptimizerInputsEObjectiveTermDirectionEnum from './OptimizerInputsEObjectiveTermDirectionEnum';
import OptimizerInputsTailRiskMeasureEnum from './OptimizerInputsTailRiskMeasureEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsTailRiskTerm model module.
 * @module model/OptimizerInputsTailRiskTerm
 * @version 0.20.0
 */
class OptimizerInputsTailRiskTerm {
    /**
     * Constructs a new <code>OptimizerInputsTailRiskTerm</code>.
     * @alias module:model/OptimizerInputsTailRiskTerm
     */
    constructor() { 
        
        OptimizerInputsTailRiskTerm.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsTailRiskTerm</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsTailRiskTerm} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsTailRiskTerm} The populated <code>OptimizerInputsTailRiskTerm</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsTailRiskTerm();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('multiplier')) {
                obj['multiplier'] = OptimizerInputsValue.constructFromObject(data['multiplier']);
            }
            if (data.hasOwnProperty('direction')) {
                obj['direction'] = OptimizerInputsEObjectiveTermDirectionEnum.constructFromObject(data['direction']);
            }
            if (data.hasOwnProperty('risk_measure')) {
                obj['risk_measure'] = OptimizerInputsTailRiskMeasureEnum.constructFromObject(data['risk_measure']);
            }
            if (data.hasOwnProperty('confidence_level')) {
                obj['confidence_level'] = ApiClient.convertToType(data['confidence_level'], 'Number');
            }
            if (data.hasOwnProperty('use_centered_etl')) {
                obj['use_centered_etl'] = ApiClient.convertToType(data['use_centered_etl'], 'Boolean');
            }
            if (data.hasOwnProperty('active_risk')) {
                obj['active_risk'] = ApiClient.convertToType(data['active_risk'], 'Boolean');
            }
            if (data.hasOwnProperty('benchmark_index')) {
                obj['benchmark_index'] = ApiClient.convertToType(data['benchmark_index'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsTailRiskTerm.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} multiplier
 */
OptimizerInputsTailRiskTerm.prototype['multiplier'] = undefined;

/**
 * @member {module:model/OptimizerInputsEObjectiveTermDirectionEnum} direction
 */
OptimizerInputsTailRiskTerm.prototype['direction'] = undefined;

/**
 * @member {module:model/OptimizerInputsTailRiskMeasureEnum} risk_measure
 */
OptimizerInputsTailRiskTerm.prototype['risk_measure'] = undefined;

/**
 * @member {Number} confidence_level
 */
OptimizerInputsTailRiskTerm.prototype['confidence_level'] = undefined;

/**
 * @member {Boolean} use_centered_etl
 */
OptimizerInputsTailRiskTerm.prototype['use_centered_etl'] = undefined;

/**
 * @member {Boolean} active_risk
 */
OptimizerInputsTailRiskTerm.prototype['active_risk'] = undefined;

/**
 * @member {Number} benchmark_index
 */
OptimizerInputsTailRiskTerm.prototype['benchmark_index'] = undefined;






export default OptimizerInputsTailRiskTerm;

