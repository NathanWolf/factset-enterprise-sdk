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
import InlineResponse20072DataHigh from './InlineResponse20072DataHigh';
import InlineResponse20072DataLow from './InlineResponse20072DataLow';
import InlineResponse20072DataPerformance from './InlineResponse20072DataPerformance';

/**
 * The InlineResponse20074Data model module.
 * @module model/InlineResponse20074Data
 * @version 0.9.2
 */
class InlineResponse20074Data {
    /**
     * Constructs a new <code>InlineResponse20074Data</code>.
     * EOD key figures.
     * @alias module:model/InlineResponse20074Data
     */
    constructor() { 
        
        InlineResponse20074Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20074Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20074Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20074Data} The populated <code>InlineResponse20074Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20074Data();

            if (data.hasOwnProperty('referenceDate')) {
                obj['referenceDate'] = ApiClient.convertToType(data['referenceDate'], 'Date');
            }
            if (data.hasOwnProperty('performance')) {
                obj['performance'] = InlineResponse20072DataPerformance.constructFromObject(data['performance']);
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = InlineResponse20072DataHigh.constructFromObject(data['high']);
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = InlineResponse20072DataLow.constructFromObject(data['low']);
            }
            if (data.hasOwnProperty('tradingVolume')) {
                obj['tradingVolume'] = ApiClient.convertToType(data['tradingVolume'], 'Number');
            }
            if (data.hasOwnProperty('volatility')) {
                obj['volatility'] = ApiClient.convertToType(data['volatility'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Reference date of the time range.
 * @member {Date} referenceDate
 */
InlineResponse20074Data.prototype['referenceDate'] = undefined;

/**
 * @member {module:model/InlineResponse20072DataPerformance} performance
 */
InlineResponse20074Data.prototype['performance'] = undefined;

/**
 * @member {module:model/InlineResponse20072DataHigh} high
 */
InlineResponse20074Data.prototype['high'] = undefined;

/**
 * @member {module:model/InlineResponse20072DataLow} low
 */
InlineResponse20074Data.prototype['low'] = undefined;

/**
 * Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive).
 * @member {Number} tradingVolume
 */
InlineResponse20074Data.prototype['tradingVolume'] = undefined;

/**
 * Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.
 * @member {Number} volatility
 */
InlineResponse20074Data.prototype['volatility'] = undefined;






export default InlineResponse20074Data;

