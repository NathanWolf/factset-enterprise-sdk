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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority from './SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection from './SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket
 * @version 0.10.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket</code>.
     * Market-related notation selection. See endpoint &#x60;/basic/market/list&#x60; for valid values.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket();

            if (data.hasOwnProperty('selection')) {
                obj['selection'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.constructFromObject(data['selection']);
            }
            if (data.hasOwnProperty('priority')) {
                obj['priority'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority.constructFromObject(data['priority']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection} selection
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.prototype['selection'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority} priority
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.prototype['priority'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket;

