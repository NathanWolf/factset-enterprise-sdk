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
import OptimizerInputsCompositeConstituent from './OptimizerInputsCompositeConstituent';

/**
 * The OptimizerInputsCompositeAsset model module.
 * @module model/OptimizerInputsCompositeAsset
 * @version 0.20.0
 */
class OptimizerInputsCompositeAsset {
    /**
     * Constructs a new <code>OptimizerInputsCompositeAsset</code>.
     * @alias module:model/OptimizerInputsCompositeAsset
     */
    constructor() { 
        
        OptimizerInputsCompositeAsset.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsCompositeAsset</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsCompositeAsset} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsCompositeAsset} The populated <code>OptimizerInputsCompositeAsset</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsCompositeAsset();

            if (data.hasOwnProperty('constituents')) {
                obj['constituents'] = ApiClient.convertToType(data['constituents'], [OptimizerInputsCompositeConstituent]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/OptimizerInputsCompositeConstituent>} constituents
 */
OptimizerInputsCompositeAsset.prototype['constituents'] = undefined;






export default OptimizerInputsCompositeAsset;

