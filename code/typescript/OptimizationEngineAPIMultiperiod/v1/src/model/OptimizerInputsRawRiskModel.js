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
import OptimizerInputsRawRiskModelSimulations from './OptimizerInputsRawRiskModelSimulations';

/**
 * The OptimizerInputsRawRiskModel model module.
 * @module model/OptimizerInputsRawRiskModel
 * @version 0.20.0
 */
class OptimizerInputsRawRiskModel {
    /**
     * Constructs a new <code>OptimizerInputsRawRiskModel</code>.
     * @alias module:model/OptimizerInputsRawRiskModel
     */
    constructor() { 
        
        OptimizerInputsRawRiskModel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsRawRiskModel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsRawRiskModel} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsRawRiskModel} The populated <code>OptimizerInputsRawRiskModel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsRawRiskModel();

            if (data.hasOwnProperty('simulations')) {
                obj['simulations'] = ApiClient.convertToType(data['simulations'], [OptimizerInputsRawRiskModelSimulations]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/OptimizerInputsRawRiskModelSimulations>} simulations
 */
OptimizerInputsRawRiskModel.prototype['simulations'] = undefined;






export default OptimizerInputsRawRiskModel;

