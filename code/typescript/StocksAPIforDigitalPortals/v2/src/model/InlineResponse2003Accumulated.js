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
 * The InlineResponse2003Accumulated model module.
 * @module model/InlineResponse2003Accumulated
 * @version 0.9.2
 */
class InlineResponse2003Accumulated {
    /**
     * Constructs a new <code>InlineResponse2003Accumulated</code>.
     * Summary data accumulated over all trades of the current trading day.
     * @alias module:model/InlineResponse2003Accumulated
     */
    constructor() { 
        
        InlineResponse2003Accumulated.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003Accumulated</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003Accumulated} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003Accumulated} The populated <code>InlineResponse2003Accumulated</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003Accumulated();

            if (data.hasOwnProperty('numberTrades')) {
                obj['numberTrades'] = ApiClient.convertToType(data['numberTrades'], 'Number');
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
 * Number of trades.
 * @member {Number} numberTrades
 */
InlineResponse2003Accumulated.prototype['numberTrades'] = undefined;

/**
 * Number of shares traded.
 * @member {Number} tradingVolume
 */
InlineResponse2003Accumulated.prototype['tradingVolume'] = undefined;

/**
 * Monetary equivalent (cash value) of the trades. See attribute `currency` for its currency.
 * @member {Number} tradingValue
 */
InlineResponse2003Accumulated.prototype['tradingValue'] = undefined;






export default InlineResponse2003Accumulated;

