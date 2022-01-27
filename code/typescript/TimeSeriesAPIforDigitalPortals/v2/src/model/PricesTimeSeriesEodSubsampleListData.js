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
import VendorChartIQTimeSeriesEodListDataAdjustments from './VendorChartIQTimeSeriesEodListDataAdjustments';

/**
 * The PricesTimeSeriesEodSubsampleListData model module.
 * @module model/PricesTimeSeriesEodSubsampleListData
 * @version 0.9.0
 */
class PricesTimeSeriesEodSubsampleListData {
    /**
     * Constructs a new <code>PricesTimeSeriesEodSubsampleListData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/PricesTimeSeriesEodSubsampleListData
     * @param id {String} Identifier of the notation.
     * @param intervals {Array.<Date>} Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n <= d < day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day.
     */
    constructor(id, intervals) { 
        
        PricesTimeSeriesEodSubsampleListData.initialize(this, id, intervals);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, intervals) { 
        obj['id'] = id;
        obj['intervals'] = intervals;
    }

    /**
     * Constructs a <code>PricesTimeSeriesEodSubsampleListData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PricesTimeSeriesEodSubsampleListData} obj Optional instance to populate.
     * @return {module:model/PricesTimeSeriesEodSubsampleListData} The populated <code>PricesTimeSeriesEodSubsampleListData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PricesTimeSeriesEodSubsampleListData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('intervals')) {
                obj['intervals'] = ApiClient.convertToType(data['intervals'], ['Date']);
            }
            if (data.hasOwnProperty('adjustments')) {
                obj['adjustments'] = VendorChartIQTimeSeriesEodListDataAdjustments.constructFromObject(data['adjustments']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
PricesTimeSeriesEodSubsampleListData.prototype['id'] = undefined;

/**
 * Type of the price as configured for the customer.
 * @member {module:model/PricesTimeSeriesEodSubsampleListData.TypeEnum} type
 * @default 'trade'
 */
PricesTimeSeriesEodSubsampleListData.prototype['type'] = 'trade';

/**
 * Quality of the price.
 * @member {module:model/PricesTimeSeriesEodSubsampleListData.QualityEnum} quality
 * @default 'DLY'
 */
PricesTimeSeriesEodSubsampleListData.prototype['quality'] = 'DLY';

/**
 * Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n <= d < day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day.
 * @member {Array.<Date>} intervals
 */
PricesTimeSeriesEodSubsampleListData.prototype['intervals'] = undefined;

/**
 * @member {module:model/VendorChartIQTimeSeriesEodListDataAdjustments} adjustments
 */
PricesTimeSeriesEodSubsampleListData.prototype['adjustments'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
PricesTimeSeriesEodSubsampleListData['TypeEnum'] = {

    /**
     * value: "trade"
     * @const
     */
    "trade": "trade",

    /**
     * value: "bid"
     * @const
     */
    "bid": "bid",

    /**
     * value: "ask"
     * @const
     */
    "ask": "ask",

    /**
     * value: "yield"
     * @const
     */
    "yield": "yield",

    /**
     * value: "estimate"
     * @const
     */
    "estimate": "estimate"
};


/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
PricesTimeSeriesEodSubsampleListData['QualityEnum'] = {

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD",

    /**
     * value: "BST"
     * @const
     */
    "BST": "BST"
};



export default PricesTimeSeriesEodSubsampleListData;

