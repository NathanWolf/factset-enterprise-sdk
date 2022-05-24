/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The BenchmarkConstituent model module.
 * @module model/BenchmarkConstituent
 * @version 0.20.0
 */
class BenchmarkConstituent {
    /**
     * Constructs a new <code>BenchmarkConstituent</code>.
     * @alias module:model/BenchmarkConstituent
     */
    constructor() { 
        
        BenchmarkConstituent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BenchmarkConstituent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BenchmarkConstituent} obj Optional instance to populate.
     * @return {module:model/BenchmarkConstituent} The populated <code>BenchmarkConstituent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BenchmarkConstituent();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('fsymSecurityId')) {
                obj['fsymSecurityId'] = ApiClient.convertToType(data['fsymSecurityId'], 'String');
            }
            if (data.hasOwnProperty('fsymRegionalId')) {
                obj['fsymRegionalId'] = ApiClient.convertToType(data['fsymRegionalId'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('weightClose')) {
                obj['weightClose'] = ApiClient.convertToType(data['weightClose'], 'Number');
            }
            if (data.hasOwnProperty('adjHolding')) {
                obj['adjHolding'] = ApiClient.convertToType(data['adjHolding'], 'Number');
            }
            if (data.hasOwnProperty('unadjHolding')) {
                obj['unadjHolding'] = ApiClient.convertToType(data['unadjHolding'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('adjMarketValue')) {
                obj['adjMarketValue'] = ApiClient.convertToType(data['adjMarketValue'], 'Number');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Benchmark Id
 * @member {String} fsymId
 */
BenchmarkConstituent.prototype['fsymId'] = undefined;

/**
 * Date of weight and shares.
 * @member {Date} date
 */
BenchmarkConstituent.prototype['date'] = undefined;

/**
 * FactSet Security Identifier (-S). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD).
 * @member {String} fsymSecurityId
 */
BenchmarkConstituent.prototype['fsymSecurityId'] = undefined;

/**
 * FactSet Regional Identifier (-R). If Cash or Generic Id holding, response will just pass through generic id (e.g. CASH_USD).
 * @member {String} fsymRegionalId
 */
BenchmarkConstituent.prototype['fsymRegionalId'] = undefined;

/**
 * Currency code for prices.
 * @member {String} currency
 */
BenchmarkConstituent.prototype['currency'] = undefined;

/**
 * Weight of Security in benchmark (percent).
 * @member {Number} weightClose
 */
BenchmarkConstituent.prototype['weightClose'] = undefined;

/**
 * Shares held adjusted. Units in Millions.
 * @member {Number} adjHolding
 */
BenchmarkConstituent.prototype['adjHolding'] = undefined;

/**
 * Shares held unadjusted. Units in Millions.
 * @member {Number} unadjHolding
 */
BenchmarkConstituent.prototype['unadjHolding'] = undefined;

/**
 * Price of shares held.
 * @member {Number} price
 */
BenchmarkConstituent.prototype['price'] = undefined;

/**
 * Market value adjusted. Market Value represented in Millions.
 * @member {Number} adjMarketValue
 */
BenchmarkConstituent.prototype['adjMarketValue'] = undefined;

/**
 * Identifier specified in the request
 * @member {String} requestId
 */
BenchmarkConstituent.prototype['requestId'] = undefined;






export default BenchmarkConstituent;

