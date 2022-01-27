/**
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CurrencyCodeCurrencyCode from './CurrencyCodeCurrencyCode';

/**
 * The CurrencyCode model module.
 * @module model/CurrencyCode
 * @version 0.9.0
 */
class CurrencyCode {
    /**
     * Constructs a new <code>CurrencyCode</code>.
     * @alias module:model/CurrencyCode
     */
    constructor() { 
        
        CurrencyCode.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurrencyCode</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurrencyCode} obj Optional instance to populate.
     * @return {module:model/CurrencyCode} The populated <code>CurrencyCode</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurrencyCode();

            if (data.hasOwnProperty('currencyCode')) {
                obj['currencyCode'] = CurrencyCodeCurrencyCode.constructFromObject(data['currencyCode']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CurrencyCodeCurrencyCode} currencyCode
 */
CurrencyCode.prototype['currencyCode'] = undefined;






export default CurrencyCode;

