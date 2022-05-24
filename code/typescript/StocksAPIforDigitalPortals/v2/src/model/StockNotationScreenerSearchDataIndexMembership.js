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
 * The StockNotationScreenerSearchDataIndexMembership model module.
 * @module model/StockNotationScreenerSearchDataIndexMembership
 * @version 0.9.2
 */
class StockNotationScreenerSearchDataIndexMembership {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataIndexMembership</code>.
     * List of indices of which a stock is a constituent. The list restricts the request to return only those stocks that are a constituent of one of the specified indices.
     * @alias module:model/StockNotationScreenerSearchDataIndexMembership
     */
    constructor() { 
        
        StockNotationScreenerSearchDataIndexMembership.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataIndexMembership</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataIndexMembership} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataIndexMembership} The populated <code>StockNotationScreenerSearchDataIndexMembership</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataIndexMembership();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * List of index instrument identifiers.
 * @member {Array.<String>} ids
 */
StockNotationScreenerSearchDataIndexMembership.prototype['ids'] = undefined;






export default StockNotationScreenerSearchDataIndexMembership;

