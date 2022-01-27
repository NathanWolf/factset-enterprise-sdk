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
import InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover from './InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover';

/**
 * The InlineResponse2004SimpleMovingAverage model module.
 * @module model/InlineResponse2004SimpleMovingAverage
 * @version 0.9.0
 */
class InlineResponse2004SimpleMovingAverage {
    /**
     * Constructs a new <code>InlineResponse2004SimpleMovingAverage</code>.
     * Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.
     * @alias module:model/InlineResponse2004SimpleMovingAverage
     */
    constructor() { 
        
        InlineResponse2004SimpleMovingAverage.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004SimpleMovingAverage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004SimpleMovingAverage} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004SimpleMovingAverage} The populated <code>InlineResponse2004SimpleMovingAverage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004SimpleMovingAverage();

            if (data.hasOwnProperty('days20')) {
                obj['days20'] = ApiClient.convertToType(data['days20'], 'Number');
            }
            if (data.hasOwnProperty('days50')) {
                obj['days50'] = ApiClient.convertToType(data['days50'], 'Number');
            }
            if (data.hasOwnProperty('days200')) {
                obj['days200'] = ApiClient.convertToType(data['days200'], 'Number');
            }
            if (data.hasOwnProperty('tradingDaysSinceCrossover')) {
                obj['tradingDaysSinceCrossover'] = InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover.constructFromObject(data['tradingDaysSinceCrossover']);
            }
        }
        return obj;
    }


}

/**
 * 20 trading days.
 * @member {Number} days20
 */
InlineResponse2004SimpleMovingAverage.prototype['days20'] = undefined;

/**
 * 50 trading days.
 * @member {Number} days50
 */
InlineResponse2004SimpleMovingAverage.prototype['days50'] = undefined;

/**
 * 200 trading days.
 * @member {Number} days200
 */
InlineResponse2004SimpleMovingAverage.prototype['days200'] = undefined;

/**
 * @member {module:model/InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover} tradingDaysSinceCrossover
 */
InlineResponse2004SimpleMovingAverage.prototype['tradingDaysSinceCrossover'] = undefined;






export default InlineResponse2004SimpleMovingAverage;

