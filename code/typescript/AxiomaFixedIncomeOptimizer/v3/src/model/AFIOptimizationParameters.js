/**
 * AFI Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AFIOptimizerStrategy from './AFIOptimizerStrategy';
import Optimization from './Optimization';
import OptimizerAccount from './OptimizerAccount';
import OptimizerOutputTypes from './OptimizerOutputTypes';

/**
 * The AFIOptimizationParameters model module.
 * @module model/AFIOptimizationParameters
 * @version 0.9.0
 */
class AFIOptimizationParameters {
    /**
     * Constructs a new <code>AFIOptimizationParameters</code>.
     * @alias module:model/AFIOptimizationParameters
     * @param strategy {module:model/AFIOptimizerStrategy} 
     * @param outputTypes {module:model/OptimizerOutputTypes} 
     */
    constructor(strategy, outputTypes) { 
        
        AFIOptimizationParameters.initialize(this, strategy, outputTypes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, strategy, outputTypes) { 
        obj['strategy'] = strategy;
        obj['outputTypes'] = outputTypes;
    }

    /**
     * Constructs a <code>AFIOptimizationParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AFIOptimizationParameters} obj Optional instance to populate.
     * @return {module:model/AFIOptimizationParameters} The populated <code>AFIOptimizationParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AFIOptimizationParameters();

            if (data.hasOwnProperty('strategy')) {
                obj['strategy'] = AFIOptimizerStrategy.constructFromObject(data['strategy']);
            }
            if (data.hasOwnProperty('account')) {
                obj['account'] = OptimizerAccount.constructFromObject(data['account']);
            }
            if (data.hasOwnProperty('optimization')) {
                obj['optimization'] = Optimization.constructFromObject(data['optimization']);
            }
            if (data.hasOwnProperty('outputTypes')) {
                obj['outputTypes'] = OptimizerOutputTypes.constructFromObject(data['outputTypes']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/AFIOptimizerStrategy} strategy
 */
AFIOptimizationParameters.prototype['strategy'] = undefined;

/**
 * @member {module:model/OptimizerAccount} account
 */
AFIOptimizationParameters.prototype['account'] = undefined;

/**
 * @member {module:model/Optimization} optimization
 */
AFIOptimizationParameters.prototype['optimization'] = undefined;

/**
 * @member {module:model/OptimizerOutputTypes} outputTypes
 */
AFIOptimizationParameters.prototype['outputTypes'] = undefined;






export default AFIOptimizationParameters;

