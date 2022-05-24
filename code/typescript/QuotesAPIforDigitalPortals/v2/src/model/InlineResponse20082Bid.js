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

/**
 * The InlineResponse20082Bid model module.
 * @module model/InlineResponse20082Bid
 * @version 0.9.2
 */
class InlineResponse20082Bid {
    /**
     * Constructs a new <code>InlineResponse20082Bid</code>.
     * Most recent bid price of the trading day.
     * @alias module:model/InlineResponse20082Bid
     */
    constructor() { 
        
        InlineResponse20082Bid.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20082Bid</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20082Bid} obj Optional instance to populate.
     * @return {module:model/InlineResponse20082Bid} The populated <code>InlineResponse20082Bid</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20082Bid();

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
InlineResponse20082Bid.prototype['time'] = undefined;

/**
 * Price value. See attribute `valueUnit` for its unit.
 * @member {Number} price
 */
InlineResponse20082Bid.prototype['price'] = undefined;

/**
 * Quote condition. Possible values depend on the values delivered by the supplier of the price information.
 * @member {String} quoteCondition
 */
InlineResponse20082Bid.prototype['quoteCondition'] = undefined;

/**
 * Number of units (e.g. shares) solicited.
 * @member {Number} tradingVolume
 */
InlineResponse20082Bid.prototype['tradingVolume'] = undefined;

/**
 * Monetary equivalent (cash value) of the offer. See attribute `currency` for its unit.
 * @member {Number} tradingValue
 */
InlineResponse20082Bid.prototype['tradingValue'] = undefined;






export default InlineResponse20082Bid;

