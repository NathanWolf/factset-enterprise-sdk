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
 * The InlineResponse2003Data model module.
 * @module model/InlineResponse2003Data
 * @version 0.9.2
 */
class InlineResponse2003Data {
    /**
     * Constructs a new <code>InlineResponse2003Data</code>.
     * Subsample data for the notation.
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

            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('subsample')) {
                obj['subsample'] = ApiClient.convertToType(data['subsample'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Quality of the price.
 * @member {module:model/InlineResponse2003Data.QualityEnum} quality
 */
InlineResponse2003Data.prototype['quality'] = undefined;

/**
 * Single summary record. The record consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute `valueUnit` in endpoint `/prices/get`, except for price type yield, where the `valueUnit` is always `percent` (id=258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty.
 * @member {Array.<Number>} subsample
 */
InlineResponse2003Data.prototype['subsample'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2003Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY"
};



export default InlineResponse2003Data;

