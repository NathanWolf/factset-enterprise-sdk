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
import PricesTimeSeriesIntradayListMetaPagination from './PricesTimeSeriesIntradayListMetaPagination';

/**
 * The PricesTimeSeriesIntradayListMeta model module.
 * @module model/PricesTimeSeriesIntradayListMeta
 * @version 0.9.0
 */
class PricesTimeSeriesIntradayListMeta {
    /**
     * Constructs a new <code>PricesTimeSeriesIntradayListMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/PricesTimeSeriesIntradayListMeta
     */
    constructor() { 
        
        PricesTimeSeriesIntradayListMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PricesTimeSeriesIntradayListMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PricesTimeSeriesIntradayListMeta} obj Optional instance to populate.
     * @return {module:model/PricesTimeSeriesIntradayListMeta} The populated <code>PricesTimeSeriesIntradayListMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PricesTimeSeriesIntradayListMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = PricesTimeSeriesIntradayListMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
PricesTimeSeriesIntradayListMeta.prototype['attributes'] = undefined;

/**
 * @member {module:model/PricesTimeSeriesIntradayListMetaPagination} pagination
 */
PricesTimeSeriesIntradayListMeta.prototype['pagination'] = undefined;






export default PricesTimeSeriesIntradayListMeta;

