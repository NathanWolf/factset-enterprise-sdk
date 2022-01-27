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

/**
 * The LibraryRequest model module.
 * @module model/LibraryRequest
 * @version 0.9.0
 */
class LibraryRequest {
    /**
     * Constructs a new <code>LibraryRequest</code>.
     * Request object for requesting factors.
     * @alias module:model/LibraryRequest
     */
    constructor() { 
        
        LibraryRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LibraryRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LibraryRequest} obj Optional instance to populate.
     * @return {module:model/LibraryRequest} The populated <code>LibraryRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryRequest();

            if (data.hasOwnProperty('factors')) {
                obj['factors'] = ApiClient.convertToType(data['factors'], ['String']);
            }
            if (data.hasOwnProperty('factorGroups')) {
                obj['factorGroups'] = ApiClient.convertToType(data['factorGroups'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * List of Factors. 
 * @member {Array.<String>} factors
 */
LibraryRequest.prototype['factors'] = undefined;

/**
 * List of Factor Groupings to return all factors within the group. 
 * @member {Array.<String>} factorGroups
 */
LibraryRequest.prototype['factorGroups'] = undefined;






export default LibraryRequest;

