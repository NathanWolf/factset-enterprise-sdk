/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import VendorChartIQTimeSeriesEodListData from './VendorChartIQTimeSeriesEodListData';
import VendorChartIQTimeSeriesEodListMeta from './VendorChartIQTimeSeriesEodListMeta';

/**
 * The InlineObject5 model module.
 * @module model/InlineObject5
 * @version 0.10.0
 */
class InlineObject5 {
    /**
     * Constructs a new <code>InlineObject5</code>.
     * @alias module:model/InlineObject5
     * @param data {module:model/VendorChartIQTimeSeriesEodListData} 
     */
    constructor(data) { 
        
        InlineObject5.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>InlineObject5</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject5} obj Optional instance to populate.
     * @return {module:model/InlineObject5} The populated <code>InlineObject5</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject5();

            if (data.hasOwnProperty('data')) {
                obj['data'] = VendorChartIQTimeSeriesEodListData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = VendorChartIQTimeSeriesEodListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/VendorChartIQTimeSeriesEodListData} data
 */
InlineObject5.prototype['data'] = undefined;

/**
 * @member {module:model/VendorChartIQTimeSeriesEodListMeta} meta
 */
InlineObject5.prototype['meta'] = undefined;






export default InlineObject5;

