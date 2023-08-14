/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CalculationMeta from './CalculationMeta';
import PACalculationParameters from './PACalculationParameters';

/**
 * The PACalculationParametersRoot model module.
 * @module model/PACalculationParametersRoot
 */
class PACalculationParametersRoot {
    /**
     * Constructs a new <code>PACalculationParametersRoot</code>.
     * @alias module:model/PACalculationParametersRoot
     */
    constructor() { 
        
        PACalculationParametersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PACalculationParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PACalculationParametersRoot} obj Optional instance to populate.
     * @return {module:model/PACalculationParametersRoot} The populated <code>PACalculationParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PACalculationParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': PACalculationParameters});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = CalculationMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of calculation parameters.
 * @member {Object.<String, module:model/PACalculationParameters>} data
 */
PACalculationParametersRoot.prototype['data'] = undefined;

/**
 * @member {module:model/CalculationMeta} meta
 */
PACalculationParametersRoot.prototype['meta'] = undefined;






export default PACalculationParametersRoot;

