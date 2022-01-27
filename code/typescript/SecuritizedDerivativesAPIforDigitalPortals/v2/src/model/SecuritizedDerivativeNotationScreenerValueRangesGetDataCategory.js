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
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory</code>.
     * Only securitized derivatives that belong to at least one category in the provided list will  be returned.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * List of category identifiers. See endpoint `/category/listBySystem` for category systems 18 and 23 for valid values.
 * @member {Array.<Number>} ids
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory.prototype['ids'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory;

