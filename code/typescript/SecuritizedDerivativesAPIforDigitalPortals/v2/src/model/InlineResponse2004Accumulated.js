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
import InlineResponse2004AccumulatedCurrency from './InlineResponse2004AccumulatedCurrency';

/**
 * The InlineResponse2004Accumulated model module.
 * @module model/InlineResponse2004Accumulated
 * @version 0.9.0
 */
class InlineResponse2004Accumulated {
    /**
     * Constructs a new <code>InlineResponse2004Accumulated</code>.
     * Summary data accumulated over all trades of the current trading day.
     * @alias module:model/InlineResponse2004Accumulated
     */
    constructor() { 
        
        InlineResponse2004Accumulated.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Accumulated</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Accumulated} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Accumulated} The populated <code>InlineResponse2004Accumulated</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Accumulated();

            if (data.hasOwnProperty('numberTrades')) {
                obj['numberTrades'] = ApiClient.convertToType(data['numberTrades'], 'Number');
            }
            if (data.hasOwnProperty('tradingVolume')) {
                obj['tradingVolume'] = ApiClient.convertToType(data['tradingVolume'], 'Number');
            }
            if (data.hasOwnProperty('tradingValue')) {
                obj['tradingValue'] = ApiClient.convertToType(data['tradingValue'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2004AccumulatedCurrency.constructFromObject(data['currency']);
            }
        }
        return obj;
    }


}

/**
 * Number of trades.
 * @member {Number} numberTrades
 */
InlineResponse2004Accumulated.prototype['numberTrades'] = undefined;

/**
 * Number of units (e.g. shares) traded. For securitized derivatives quoted in percent (attribute `valueUnit.id=258`), this field represents the nominal trading volume; see attribute currency for its unit.
 * @member {Number} tradingVolume
 */
InlineResponse2004Accumulated.prototype['tradingVolume'] = undefined;

/**
 * Monetary equivalent (cash value) of the trades. See attribute `currency` for its unit.
 * @member {Number} tradingValue
 */
InlineResponse2004Accumulated.prototype['tradingValue'] = undefined;

/**
 * @member {module:model/InlineResponse2004AccumulatedCurrency} currency
 */
InlineResponse2004Accumulated.prototype['currency'] = undefined;






export default InlineResponse2004Accumulated;

