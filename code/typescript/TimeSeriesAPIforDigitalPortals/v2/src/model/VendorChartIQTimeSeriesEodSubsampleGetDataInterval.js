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
 * The VendorChartIQTimeSeriesEodSubsampleGetDataInterval model module.
 * @module model/VendorChartIQTimeSeriesEodSubsampleGetDataInterval
 * @version 0.9.2
 */
class VendorChartIQTimeSeriesEodSubsampleGetDataInterval {
    /**
     * Constructs a new <code>VendorChartIQTimeSeriesEodSubsampleGetDataInterval</code>.
     * Non-empty interval of days specifying a single subsample period. The starting point &#x60;start&#x60; of the single subsample is usually the attribute &#x60;range.end&#x60; of a previously received &#x60;/vendor/chartIQ/timeSeries/eod/subsample/list&#x60; request. A valid range is between 1900-01-01 and a day that is less than or equal to the maximum allowed day determined from the delay period (if any). The ending point &#x60;end&#x60; may exceed the maximally entitled date range.
     * @alias module:model/VendorChartIQTimeSeriesEodSubsampleGetDataInterval
     * @param start {Date} The starting point of the interval (inclusive). 
     * @param end {Date} The ending point of the interval (exclusive).
     */
    constructor(start, end) { 
        
        VendorChartIQTimeSeriesEodSubsampleGetDataInterval.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>VendorChartIQTimeSeriesEodSubsampleGetDataInterval</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VendorChartIQTimeSeriesEodSubsampleGetDataInterval} obj Optional instance to populate.
     * @return {module:model/VendorChartIQTimeSeriesEodSubsampleGetDataInterval} The populated <code>VendorChartIQTimeSeriesEodSubsampleGetDataInterval</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VendorChartIQTimeSeriesEodSubsampleGetDataInterval();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Date');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the interval (inclusive). 
 * @member {Date} start
 */
VendorChartIQTimeSeriesEodSubsampleGetDataInterval.prototype['start'] = undefined;

/**
 * The ending point of the interval (exclusive).
 * @member {Date} end
 */
VendorChartIQTimeSeriesEodSubsampleGetDataInterval.prototype['end'] = undefined;






export default VendorChartIQTimeSeriesEodSubsampleGetDataInterval;

