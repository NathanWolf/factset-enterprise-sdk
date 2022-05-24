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
import OptimizerInputsAsset from './OptimizerInputsAsset';
import OptimizerInputsCompositeAsset from './OptimizerInputsCompositeAsset';
import OptimizerInputsDerivative from './OptimizerInputsDerivative';

/**
 * The OptimizerInputsTotalUniverse model module.
 * @module model/OptimizerInputsTotalUniverse
 * @version 0.20.0
 */
class OptimizerInputsTotalUniverse {
    /**
     * Constructs a new <code>OptimizerInputsTotalUniverse</code>.
     * @alias module:model/OptimizerInputsTotalUniverse
     */
    constructor() { 
        
        OptimizerInputsTotalUniverse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsTotalUniverse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsTotalUniverse} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsTotalUniverse} The populated <code>OptimizerInputsTotalUniverse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsTotalUniverse();

            if (data.hasOwnProperty('assets')) {
                obj['assets'] = ApiClient.convertToType(data['assets'], [OptimizerInputsAsset]);
            }
            if (data.hasOwnProperty('composite_assets')) {
                obj['composite_assets'] = OptimizerInputsCompositeAsset.constructFromObject(data['composite_assets']);
            }
            if (data.hasOwnProperty('derivatives')) {
                obj['derivatives'] = OptimizerInputsDerivative.constructFromObject(data['derivatives']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/OptimizerInputsAsset>} assets
 */
OptimizerInputsTotalUniverse.prototype['assets'] = undefined;

/**
 * @member {module:model/OptimizerInputsCompositeAsset} composite_assets
 */
OptimizerInputsTotalUniverse.prototype['composite_assets'] = undefined;

/**
 * @member {module:model/OptimizerInputsDerivative} derivatives
 */
OptimizerInputsTotalUniverse.prototype['derivatives'] = undefined;






export default OptimizerInputsTotalUniverse;

