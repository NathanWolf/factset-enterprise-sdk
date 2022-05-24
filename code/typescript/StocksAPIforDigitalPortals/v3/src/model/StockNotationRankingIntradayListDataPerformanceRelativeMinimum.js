/**
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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

/**
 * The StockNotationRankingIntradayListDataPerformanceRelativeMinimum model module.
 * @module model/StockNotationRankingIntradayListDataPerformanceRelativeMinimum
 * @version 0.10.0
 */
class StockNotationRankingIntradayListDataPerformanceRelativeMinimum {
    /**
     * Constructs a new <code>StockNotationRankingIntradayListDataPerformanceRelativeMinimum</code>.
     * The minimum of the range, or &#x60;null&#x60; to indicate that there is no minimum.
     * @alias module:model/StockNotationRankingIntradayListDataPerformanceRelativeMinimum
     * @param value {Number} The minimum value.
     */
    constructor(value) { 
        
        StockNotationRankingIntradayListDataPerformanceRelativeMinimum.initialize(this, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, value) { 
        obj['value'] = value;
    }

    /**
     * Constructs a <code>StockNotationRankingIntradayListDataPerformanceRelativeMinimum</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationRankingIntradayListDataPerformanceRelativeMinimum} obj Optional instance to populate.
     * @return {module:model/StockNotationRankingIntradayListDataPerformanceRelativeMinimum} The populated <code>StockNotationRankingIntradayListDataPerformanceRelativeMinimum</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationRankingIntradayListDataPerformanceRelativeMinimum();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('inclusive')) {
                obj['inclusive'] = ApiClient.convertToType(data['inclusive'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * The minimum value.
 * @member {Number} value
 */
StockNotationRankingIntradayListDataPerformanceRelativeMinimum.prototype['value'] = undefined;

/**
 * Indicates whether the minimum value is included in the range or not.
 * @member {Boolean} inclusive
 * @default true
 */
StockNotationRankingIntradayListDataPerformanceRelativeMinimum.prototype['inclusive'] = true;






export default StockNotationRankingIntradayListDataPerformanceRelativeMinimum;

