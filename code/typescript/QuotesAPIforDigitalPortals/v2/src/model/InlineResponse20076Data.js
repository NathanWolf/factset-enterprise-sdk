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
 * The InlineResponse20076Data model module.
 * @module model/InlineResponse20076Data
 * @version 0.9.2
 */
class InlineResponse20076Data {
    /**
     * Constructs a new <code>InlineResponse20076Data</code>.
     * EOD key figures.
     * @alias module:model/InlineResponse20076Data
     */
    constructor() { 
        
        InlineResponse20076Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20076Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20076Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20076Data} The populated <code>InlineResponse20076Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20076Data();

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
InlineResponse20076Data.prototype['referenceDate'] = undefined;

/**
 * @member {module:model/InlineResponse20072DataPerformance} performance
 */
InlineResponse20076Data.prototype['performance'] = undefined;

/**
 * @member {module:model/InlineResponse20072DataHigh} high
 */
InlineResponse20076Data.prototype['high'] = undefined;

/**
 * @member {module:model/InlineResponse20072DataLow} low
 */
InlineResponse20076Data.prototype['low'] = undefined;

/**
 * Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.
 * @member {Number} volatility
 */
InlineResponse20076Data.prototype['volatility'] = undefined;






export default InlineResponse20076Data;

