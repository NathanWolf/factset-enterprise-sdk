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
 * The InlineResponse20011Volatility model module.
 * @module model/InlineResponse20011Volatility
 * @version 0.10.0
 */
class InlineResponse20011Volatility {
    /**
     * Constructs a new <code>InlineResponse20011Volatility</code>.
     * Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year for different time ranges.
     * @alias module:model/InlineResponse20011Volatility
     */
    constructor() { 
        
        InlineResponse20011Volatility.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20011Volatility</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20011Volatility} obj Optional instance to populate.
     * @return {module:model/InlineResponse20011Volatility} The populated <code>InlineResponse20011Volatility</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20011Volatility();

            if (data.hasOwnProperty('week1')) {
                obj['week1'] = ApiClient.convertToType(data['week1'], 'Number');
            }
            if (data.hasOwnProperty('month1')) {
                obj['month1'] = ApiClient.convertToType(data['month1'], 'Number');
            }
            if (data.hasOwnProperty('months3')) {
                obj['months3'] = ApiClient.convertToType(data['months3'], 'Number');
            }
            if (data.hasOwnProperty('months6')) {
                obj['months6'] = ApiClient.convertToType(data['months6'], 'Number');
            }
            if (data.hasOwnProperty('year1')) {
                obj['year1'] = ApiClient.convertToType(data['year1'], 'Number');
            }
            if (data.hasOwnProperty('years3')) {
                obj['years3'] = ApiClient.convertToType(data['years3'], 'Number');
            }
            if (data.hasOwnProperty('years5')) {
                obj['years5'] = ApiClient.convertToType(data['years5'], 'Number');
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = ApiClient.convertToType(data['yearToDate'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * One week.
 * @member {Number} week1
 */
InlineResponse20011Volatility.prototype['week1'] = undefined;

/**
 * One month.
 * @member {Number} month1
 */
InlineResponse20011Volatility.prototype['month1'] = undefined;

/**
 * Three months.
 * @member {Number} months3
 */
InlineResponse20011Volatility.prototype['months3'] = undefined;

/**
 * Six months.
 * @member {Number} months6
 */
InlineResponse20011Volatility.prototype['months6'] = undefined;

/**
 * One year.
 * @member {Number} year1
 */
InlineResponse20011Volatility.prototype['year1'] = undefined;

/**
 * Three years.
 * @member {Number} years3
 */
InlineResponse20011Volatility.prototype['years3'] = undefined;

/**
 * Five years.
 * @member {Number} years5
 */
InlineResponse20011Volatility.prototype['years5'] = undefined;

/**
 * Year-to-date.
 * @member {Number} yearToDate
 */
InlineResponse20011Volatility.prototype['yearToDate'] = undefined;






export default InlineResponse20011Volatility;

