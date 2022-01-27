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
 * The VendorChartIQTimeSeriesEodListDataAdjustments model module.
 * @module model/VendorChartIQTimeSeriesEodListDataAdjustments
 * @version 0.9.0
 */
class VendorChartIQTimeSeriesEodListDataAdjustments {
    /**
     * Constructs a new <code>VendorChartIQTimeSeriesEodListDataAdjustments</code>.
     * Adjustments values returned.
     * @alias module:model/VendorChartIQTimeSeriesEodListDataAdjustments
     */
    constructor() { 
        
        VendorChartIQTimeSeriesEodListDataAdjustments.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VendorChartIQTimeSeriesEodListDataAdjustments</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VendorChartIQTimeSeriesEodListDataAdjustments} obj Optional instance to populate.
     * @return {module:model/VendorChartIQTimeSeriesEodListDataAdjustments} The populated <code>VendorChartIQTimeSeriesEodListDataAdjustments</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VendorChartIQTimeSeriesEodListDataAdjustments();

            if (data.hasOwnProperty('payout')) {
                obj['payout'] = ApiClient.convertToType(data['payout'], 'Boolean');
            }
            if (data.hasOwnProperty('split')) {
                obj['split'] = ApiClient.convertToType(data['split'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Adjustments are applied for corporate action effects due to dividends, payouts, or other cash disbursements.
 * @member {Boolean} payout
 * @default false
 */
VendorChartIQTimeSeriesEodListDataAdjustments.prototype['payout'] = false;

/**
 * Adjustments are applied for corporate action effects due to the notation having a split, a reverse split, or a similar factor-based corporate action.
 * @member {Boolean} split
 * @default true
 */
VendorChartIQTimeSeriesEodListDataAdjustments.prototype['split'] = true;






export default VendorChartIQTimeSeriesEodListDataAdjustments;

