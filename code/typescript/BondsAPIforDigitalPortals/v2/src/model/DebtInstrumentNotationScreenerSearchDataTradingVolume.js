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
import DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc from './DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc';

/**
 * The DebtInstrumentNotationScreenerSearchDataTradingVolume model module.
 * @module model/DebtInstrumentNotationScreenerSearchDataTradingVolume
 * @version 0.10.0
 */
class DebtInstrumentNotationScreenerSearchDataTradingVolume {
    /**
     * Constructs a new <code>DebtInstrumentNotationScreenerSearchDataTradingVolume</code>.
     * Parameters regarding the trading volume. The issuer of a debt instrument may define a minimum trading volume, and an increment over that minimum, per market place and for the over-the-counter (e.g. interbank) trade. Orders that do not match the defined volumes cannot be (fully) executed. The currency is the currency of denomination, thus the parameter &#x60;issue.volume.currency.restrict.ids&#x60; must be set to exactly one currency in order to use this parameter.
     * @alias module:model/DebtInstrumentNotationScreenerSearchDataTradingVolume
     */
    constructor() { 
        
        DebtInstrumentNotationScreenerSearchDataTradingVolume.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentNotationScreenerSearchDataTradingVolume</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentNotationScreenerSearchDataTradingVolume} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentNotationScreenerSearchDataTradingVolume} The populated <code>DebtInstrumentNotationScreenerSearchDataTradingVolume</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentNotationScreenerSearchDataTradingVolume();

            if (data.hasOwnProperty('otc')) {
                obj['otc'] = DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc.constructFromObject(data['otc']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc} otc
 */
DebtInstrumentNotationScreenerSearchDataTradingVolume.prototype['otc'] = undefined;






export default DebtInstrumentNotationScreenerSearchDataTradingVolume;

