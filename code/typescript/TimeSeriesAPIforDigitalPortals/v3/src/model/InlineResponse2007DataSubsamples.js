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
 * The InlineResponse2007DataSubsamples model module.
 * @module model/InlineResponse2007DataSubsamples
 * @version 0.10.0
 */
class InlineResponse2007DataSubsamples {
    /**
     * Constructs a new <code>InlineResponse2007DataSubsamples</code>.
     * @alias module:model/InlineResponse2007DataSubsamples
     */
    constructor() { 
        
        InlineResponse2007DataSubsamples.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataSubsamples</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataSubsamples} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataSubsamples} The populated <code>InlineResponse2007DataSubsamples</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataSubsamples();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('first')) {
                obj['first'] = ApiClient.convertToType(data['first'], 'Number');
            }
            if (data.hasOwnProperty('last')) {
                obj['last'] = ApiClient.convertToType(data['last'], 'Number');
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = ApiClient.convertToType(data['low'], 'Number');
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = ApiClient.convertToType(data['high'], 'Number');
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
 * Date of the start of the subsample.
 * @member {Date} date
 */
InlineResponse2007DataSubsamples.prototype['date'] = undefined;

/**
 * First price of the subsample.
 * @member {Number} first
 */
InlineResponse2007DataSubsamples.prototype['first'] = undefined;

/**
 * Last price of the subsample.
 * @member {Number} last
 */
InlineResponse2007DataSubsamples.prototype['last'] = undefined;

/**
 * Lowest price of the subsample.
 * @member {Number} low
 */
InlineResponse2007DataSubsamples.prototype['low'] = undefined;

/**
 * Highest price of the subsample.
 * @member {Number} high
 */
InlineResponse2007DataSubsamples.prototype['high'] = undefined;

/**
 * Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.
 * @member {Number} tradingVolume
 */
InlineResponse2007DataSubsamples.prototype['tradingVolume'] = undefined;

/**
 * Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute `currency` in endpoint `/prices/get` for its unit.
 * @member {Number} tradingValue
 */
InlineResponse2007DataSubsamples.prototype['tradingValue'] = undefined;






export default InlineResponse2007DataSubsamples;

