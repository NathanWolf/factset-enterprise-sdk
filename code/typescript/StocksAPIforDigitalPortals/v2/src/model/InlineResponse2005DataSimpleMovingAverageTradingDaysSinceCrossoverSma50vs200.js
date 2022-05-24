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
import InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down from './InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down';
import InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up from './InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up';

/**
 * The InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 model module.
 * @module model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200
 * @version 0.9.2
 */
class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 {
    /**
     * Constructs a new <code>InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200</code>.
     * Value ranges of the number of trading days since a crossover of the SMA 50 and the SMA 200.
     * @alias module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200
     */
    constructor() { 
        
        InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200} The populated <code>InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200();

            if (data.hasOwnProperty('up')) {
                obj['up'] = InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up.constructFromObject(data['up']);
            }
            if (data.hasOwnProperty('down')) {
                obj['down'] = InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down.constructFromObject(data['down']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up} up
 */
InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.prototype['up'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down} down
 */
InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.prototype['down'] = undefined;






export default InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200;

