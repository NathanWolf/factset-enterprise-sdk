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
import InlineResponse20079DataAccumulated from './InlineResponse20079DataAccumulated';
import InlineResponse20079DataCurrency from './InlineResponse20079DataCurrency';
import InlineResponse20079DataFirst from './InlineResponse20079DataFirst';
import InlineResponse20079DataHigh from './InlineResponse20079DataHigh';
import InlineResponse20079DataLatest from './InlineResponse20079DataLatest';
import InlineResponse20079DataLow from './InlineResponse20079DataLow';
import InlineResponse20079DataMarket from './InlineResponse20079DataMarket';
import InlineResponse20079DataPreviousClose from './InlineResponse20079DataPreviousClose';
import InlineResponse20079DataValueUnit from './InlineResponse20079DataValueUnit';

/**
 * The InlineResponse20079Data model module.
 * @module model/InlineResponse20079Data
 * @version 0.9.2
 */
class InlineResponse20079Data {
    /**
     * Constructs a new <code>InlineResponse20079Data</code>.
     * Set of price related data for the notation.
     * @alias module:model/InlineResponse20079Data
     */
    constructor() { 
        
        InlineResponse20079Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20079Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20079Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20079Data} The populated <code>InlineResponse20079Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20079Data();

            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20079DataValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse20079DataCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20079DataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('latest')) {
                obj['latest'] = InlineResponse20079DataLatest.constructFromObject(data['latest']);
            }
            if (data.hasOwnProperty('first')) {
                obj['first'] = InlineResponse20079DataFirst.constructFromObject(data['first']);
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = InlineResponse20079DataLow.constructFromObject(data['low']);
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = InlineResponse20079DataHigh.constructFromObject(data['high']);
            }
            if (data.hasOwnProperty('previousClose')) {
                obj['previousClose'] = InlineResponse20079DataPreviousClose.constructFromObject(data['previousClose']);
            }
            if (data.hasOwnProperty('accumulated')) {
                obj['accumulated'] = InlineResponse20079DataAccumulated.constructFromObject(data['accumulated']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20079DataValueUnit} valueUnit
 */
InlineResponse20079Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataCurrency} currency
 */
InlineResponse20079Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataMarket} market
 */
InlineResponse20079Data.prototype['market'] = undefined;

/**
 * Quality of the price.
 * @member {module:model/InlineResponse20079Data.QualityEnum} quality
 */
InlineResponse20079Data.prototype['quality'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataLatest} latest
 */
InlineResponse20079Data.prototype['latest'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataFirst} first
 */
InlineResponse20079Data.prototype['first'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataLow} low
 */
InlineResponse20079Data.prototype['low'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataHigh} high
 */
InlineResponse20079Data.prototype['high'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataPreviousClose} previousClose
 */
InlineResponse20079Data.prototype['previousClose'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataAccumulated} accumulated
 */
InlineResponse20079Data.prototype['accumulated'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20079Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default InlineResponse20079Data;

