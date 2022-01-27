/**
 * FactSet Quant Factor Library API
 * The FactSet FactSet Quant Factor Library (QFL) API helps to detect investment themes across global equity markets, incorporate ideas into your portfolio construction process, and transform raw data into actionable intelligence. Over 2000+ items spanning Factor Groups in-   * Classification and Reference Data - Asset Data, Country, Industry, and Size   * Market - Liquidity, Market Sensitivity, Momentum, Technical, Volatility   * Core Fundamentals - Efficiency, Growth, Management, Profitability, Quality, Solvency, Value   * Macro and Cross Asset - Commodity, FX Sensitivity, Debt, Economic   * Alternative - Analyst Sentiment, Corporate Governance, Crowding, Insider Activity. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Frequency from './Frequency';

/**
 * The FactorsRequest model module.
 * @module model/FactorsRequest
 * @version 0.9.0
 */
class FactorsRequest {
    /**
     * Constructs a new <code>FactorsRequest</code>.
     * Request object for requesting factors.
     * @alias module:model/FactorsRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param factors {Array.<String>} List of Factors. 
     * @param startDate {String} The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
     * @param endDate {String} The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate. 
     */
    constructor(ids, factors, startDate, endDate) { 
        
        FactorsRequest.initialize(this, ids, factors, startDate, endDate);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, factors, startDate, endDate) { 
        obj['ids'] = ids;
        obj['factors'] = factors;
        obj['startDate'] = startDate;
        obj['endDate'] = endDate;
    }

    /**
     * Constructs a <code>FactorsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactorsRequest} obj Optional instance to populate.
     * @return {module:model/FactorsRequest} The populated <code>FactorsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactorsRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('factors')) {
                obj['factors'] = ApiClient.convertToType(data['factors'], ['String']);
            }
            if (data.hasOwnProperty('factorGroups')) {
                obj['factorGroups'] = ApiClient.convertToType(data['factorGroups'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
        }
        return obj;
    }


}

/**
 * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
 * @member {Array.<String>} ids
 */
FactorsRequest.prototype['ids'] = undefined;

/**
 * List of Factors. 
 * @member {Array.<String>} factors
 */
FactorsRequest.prototype['factors'] = undefined;

/**
 * List of Factor Groupings to return all factors within the group. 
 * @member {Array.<String>} factorGroups
 */
FactorsRequest.prototype['factorGroups'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} startDate
 */
FactorsRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. **NOTE:** The input endDate must come AFTER the input startDate. 
 * @member {String} endDate
 */
FactorsRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
FactorsRequest.prototype['frequency'] = undefined;






export default FactorsRequest;

