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
 * The Factors model module.
 * @module model/Factors
 * @version 0.9.0
 */
class Factors {
    /**
     * Constructs a new <code>Factors</code>.
     * @alias module:model/Factors
     * @extends Object
     * @param requestId {String} Identifier that was used for the request.
     * @param fsymId {String} Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security’s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
     * @param date {Date} The as of date of the factors in YYYY-MM-DD format.
     */
    constructor(requestId, fsymId, date) { 
        
        Factors.initialize(this, requestId, fsymId, date);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, requestId, fsymId, date) { 
        obj['requestId'] = requestId;
        obj['fsymId'] = fsymId;
        obj['date'] = date;
    }

    /**
     * Constructs a <code>Factors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Factors} obj Optional instance to populate.
     * @return {module:model/Factors} The populated <code>Factors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Factors();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Factors.prototype['requestId'] = undefined;

/**
 * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security’s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
Factors.prototype['fsymId'] = undefined;

/**
 * The as of date of the factors in YYYY-MM-DD format.
 * @member {Date} date
 */
Factors.prototype['date'] = undefined;






export default Factors;

