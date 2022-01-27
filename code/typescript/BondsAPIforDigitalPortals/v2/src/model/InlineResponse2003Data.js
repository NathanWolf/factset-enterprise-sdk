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
import InlineResponse2003Fsym from './InlineResponse2003Fsym';
import InlineResponse2003Instrument from './InlineResponse2003Instrument';
import InlineResponse2003Market from './InlineResponse2003Market';
import InlineResponse2003Nsin from './InlineResponse2003Nsin';
import InlineResponse2003Sensitivities from './InlineResponse2003Sensitivities';
import InlineResponse2003TradedValue from './InlineResponse2003TradedValue';
import InlineResponse2003ValueUnit from './InlineResponse2003ValueUnit';
import InlineResponse2003Yield from './InlineResponse2003Yield';

/**
 * The InlineResponse2003Data model module.
 * @module model/InlineResponse2003Data
 * @version 0.9.0
 */
class InlineResponse2003Data {
    /**
     * Constructs a new <code>InlineResponse2003Data</code>.
     * @alias module:model/InlineResponse2003Data
     */
    constructor() { 
        
        InlineResponse2003Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003Data} The populated <code>InlineResponse2003Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse2003ValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse2003Market.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse2003Nsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse2003Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse2003Instrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('yield')) {
                obj['yield'] = InlineResponse2003Yield.constructFromObject(data['yield']);
            }
            if (data.hasOwnProperty('macaulayDuration')) {
                obj['macaulayDuration'] = ApiClient.convertToType(data['macaulayDuration'], 'Number');
            }
            if (data.hasOwnProperty('sensitivities')) {
                obj['sensitivities'] = InlineResponse2003Sensitivities.constructFromObject(data['sensitivities']);
            }
            if (data.hasOwnProperty('tradedValue')) {
                obj['tradedValue'] = InlineResponse2003TradedValue.constructFromObject(data['tradedValue']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse2003Data.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse2003ValueUnit} valueUnit
 */
InlineResponse2003Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse2003Market} market
 */
InlineResponse2003Data.prototype['market'] = undefined;

/**
 * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
 * @member {String} symbol
 */
InlineResponse2003Data.prototype['symbol'] = undefined;

/**
 * @member {module:model/InlineResponse2003Nsin} nsin
 */
InlineResponse2003Data.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse2003Fsym} fsym
 */
InlineResponse2003Data.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse2003Instrument} instrument
 */
InlineResponse2003Data.prototype['instrument'] = undefined;

/**
 * @member {module:model/InlineResponse2003Yield} yield
 */
InlineResponse2003Data.prototype['yield'] = undefined;

/**
 * Macaulay duration, which is the average period (in years) of capital commitment.
 * @member {Number} macaulayDuration
 */
InlineResponse2003Data.prototype['macaulayDuration'] = undefined;

/**
 * @member {module:model/InlineResponse2003Sensitivities} sensitivities
 */
InlineResponse2003Data.prototype['sensitivities'] = undefined;

/**
 * @member {module:model/InlineResponse2003TradedValue} tradedValue
 */
InlineResponse2003Data.prototype['tradedValue'] = undefined;






export default InlineResponse2003Data;

