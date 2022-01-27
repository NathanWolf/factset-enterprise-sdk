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
import AFIOptimizationParameters from './AFIOptimizationParameters';

/**
 * The AFIOptimizationParametersRoot model module.
 * @module model/AFIOptimizationParametersRoot
 * @version 0.9.0
 */
class AFIOptimizationParametersRoot {
    /**
     * Constructs a new <code>AFIOptimizationParametersRoot</code>.
     * @alias module:model/AFIOptimizationParametersRoot
     */
    constructor() { 
        
        AFIOptimizationParametersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AFIOptimizationParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AFIOptimizationParametersRoot} obj Optional instance to populate.
     * @return {module:model/AFIOptimizationParametersRoot} The populated <code>AFIOptimizationParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AFIOptimizationParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = AFIOptimizationParameters.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/AFIOptimizationParameters} data
 */
AFIOptimizationParametersRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
AFIOptimizationParametersRoot.prototype['meta'] = undefined;






export default AFIOptimizationParametersRoot;

