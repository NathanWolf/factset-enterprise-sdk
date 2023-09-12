/**
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import QuantCalculationMeta from './QuantCalculationMeta';
import QuantCalculationParameters from './QuantCalculationParameters';

/**
 * The QuantCalculationParametersRoot model module.
 * @module model/QuantCalculationParametersRoot
 */
class QuantCalculationParametersRoot {
    /**
     * Constructs a new <code>QuantCalculationParametersRoot</code>.
     * @alias module:model/QuantCalculationParametersRoot
     */
    constructor() { 
        
        QuantCalculationParametersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>QuantCalculationParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuantCalculationParametersRoot} obj Optional instance to populate.
     * @return {module:model/QuantCalculationParametersRoot} The populated <code>QuantCalculationParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuantCalculationParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': QuantCalculationParameters});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = QuantCalculationMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * List of calculation parameters.
 * @member {Object.<String, module:model/QuantCalculationParameters>} data
 */
QuantCalculationParametersRoot.prototype['data'] = undefined;

/**
 * @member {module:model/QuantCalculationMeta} meta
 */
QuantCalculationParametersRoot.prototype['meta'] = undefined;






export default QuantCalculationParametersRoot;

