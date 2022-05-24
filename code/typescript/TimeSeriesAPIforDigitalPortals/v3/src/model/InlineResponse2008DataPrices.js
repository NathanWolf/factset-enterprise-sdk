/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
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
 * The InlineResponse2008DataPrices model module.
 * @module model/InlineResponse2008DataPrices
 * @version 0.10.0
 */
class InlineResponse2008DataPrices {
    /**
     * Constructs a new <code>InlineResponse2008DataPrices</code>.
     * @alias module:model/InlineResponse2008DataPrices
     */
    constructor() { 
        
        InlineResponse2008DataPrices.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2008DataPrices</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2008DataPrices} obj Optional instance to populate.
     * @return {module:model/InlineResponse2008DataPrices} The populated <code>InlineResponse2008DataPrices</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2008DataPrices();

            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('quoteCondition')) {
                obj['quoteCondition'] = ApiClient.convertToType(data['quoteCondition'], 'String');
            }
            if (data.hasOwnProperty('tradingVolume')) {
                obj['tradingVolume'] = ApiClient.convertToType(data['tradingVolume'], 'Number');
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = ApiClient.convertToType(data['tradingValue'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Date and time.
 * @member {String} time
 */
InlineResponse2008DataPrices.prototype['time'] = undefined;

/**
 * Price value. See attribute `valueUnit` in endpoint `/prices/get` for its unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).
 * @member {Number} price
 */
InlineResponse2008DataPrices.prototype['price'] = undefined;

/**
 * Quote condition. Possible values depend on the values delivered by the supplier of the price information.
 * @member {String} quoteCondition
 */
InlineResponse2008DataPrices.prototype['quoteCondition'] = undefined;

/**
 * Number of units (e.g. shares) traded, offered (price type ask), solicited (price type bid), or empty (price type yield).
 * @member {Number} tradingVolume
 */
InlineResponse2008DataPrices.prototype['tradingVolume'] = undefined;

/**
 * Monetary equivalent (cash value) of the trade. See attribute `currency` in endpoint `/prices/get` for its unit. Empty for price type yield.
 * @member {Number} tradingValue
 */
InlineResponse2008DataPrices.prototype['tradingValue'] = undefined;






export default InlineResponse2008DataPrices;

