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
import BasicValueUnitCurrencyMainListDataFilter from './BasicValueUnitCurrencyMainListDataFilter';

/**
 * The BasicValueUnitCurrencyMainListData model module.
 * @module model/BasicValueUnitCurrencyMainListData
 * @version 0.9.0
 */
class BasicValueUnitCurrencyMainListData {
    /**
     * Constructs a new <code>BasicValueUnitCurrencyMainListData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/BasicValueUnitCurrencyMainListData
     */
    constructor() { 
        
        BasicValueUnitCurrencyMainListData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicValueUnitCurrencyMainListData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicValueUnitCurrencyMainListData} obj Optional instance to populate.
     * @return {module:model/BasicValueUnitCurrencyMainListData} The populated <code>BasicValueUnitCurrencyMainListData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicValueUnitCurrencyMainListData();

            if (data.hasOwnProperty('filter')) {
                obj['filter'] = BasicValueUnitCurrencyMainListDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BasicValueUnitCurrencyMainListDataFilter} filter
 */
BasicValueUnitCurrencyMainListData.prototype['filter'] = undefined;






export default BasicValueUnitCurrencyMainListData;

