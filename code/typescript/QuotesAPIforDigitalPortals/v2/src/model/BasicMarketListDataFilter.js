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
import BasicMarketListDataFilterMarkets from './BasicMarketListDataFilterMarkets';

/**
 * The BasicMarketListDataFilter model module.
 * @module model/BasicMarketListDataFilter
 * @version 0.9.2
 */
class BasicMarketListDataFilter {
    /**
     * Constructs a new <code>BasicMarketListDataFilter</code>.
     * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
     * @alias module:model/BasicMarketListDataFilter
     */
    constructor() { 
        
        BasicMarketListDataFilter.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BasicMarketListDataFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BasicMarketListDataFilter} obj Optional instance to populate.
     * @return {module:model/BasicMarketListDataFilter} The populated <code>BasicMarketListDataFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BasicMarketListDataFilter();

            if (data.hasOwnProperty('markets')) {
                obj['markets'] = BasicMarketListDataFilterMarkets.constructFromObject(data['markets']);
            }
            if (data.hasOwnProperty('onlyActive')) {
                obj['onlyActive'] = ApiClient.convertToType(data['onlyActive'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BasicMarketListDataFilterMarkets} markets
 */
BasicMarketListDataFilter.prototype['markets'] = undefined;

/**
 * Indicates whether the market exists.
 * @member {Boolean} onlyActive
 * @default true
 */
BasicMarketListDataFilter.prototype['onlyActive'] = true;






export default BasicMarketListDataFilter;

