/**
 * FactSet Capital Structure Report Builder API
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
import CurrencySymbolCurrencySymbol from './CurrencySymbolCurrencySymbol';

/**
 * The CurrencySymbol model module.
 * @module model/CurrencySymbol
 * @version 0.9.0
 */
class CurrencySymbol {
    /**
     * Constructs a new <code>CurrencySymbol</code>.
     * @alias module:model/CurrencySymbol
     */
    constructor() { 
        
        CurrencySymbol.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CurrencySymbol</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CurrencySymbol} obj Optional instance to populate.
     * @return {module:model/CurrencySymbol} The populated <code>CurrencySymbol</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CurrencySymbol();

            if (data.hasOwnProperty('currencySymbol')) {
                obj['currencySymbol'] = CurrencySymbolCurrencySymbol.constructFromObject(data['currencySymbol']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CurrencySymbolCurrencySymbol} currencySymbol
 */
CurrencySymbol.prototype['currencySymbol'] = undefined;






export default CurrencySymbol;

