/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation</code>.
     * Barrier observation modality; applicable to the following barrier types: &#x60;knockIn&#x60;, &#x60;knockOut&#x60;, &#x60;lockIn&#x60;, and &#x60;lockOut&#x60;.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Type of the barrier observation.
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation.TypeEnum} type
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation['TypeEnum'] = {

    /**
     * value: "continuous"
     * @const
     */
    "continuous": "continuous",

    /**
     * value: "eod"
     * @const
     */
    "eod": "eod"
};



export default SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation;

