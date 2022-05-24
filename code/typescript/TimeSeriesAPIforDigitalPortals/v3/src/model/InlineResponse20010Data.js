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
import InlineResponse20010DataSubsamples from './InlineResponse20010DataSubsamples';
import InlineResponse2004DataRange from './InlineResponse2004DataRange';

/**
 * The InlineResponse20010Data model module.
 * @module model/InlineResponse20010Data
 * @version 0.10.0
 */
class InlineResponse20010Data {
    /**
     * Constructs a new <code>InlineResponse20010Data</code>.
     * Subsampled time series data for the notation.
     * @alias module:model/InlineResponse20010Data
     */
    constructor() { 
        
        InlineResponse20010Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20010Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20010Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20010Data} The populated <code>InlineResponse20010Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20010Data();

            if (data.hasOwnProperty('range')) {
                obj['range'] = InlineResponse2004DataRange.constructFromObject(data['range']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('subsamples')) {
                obj['subsamples'] = ApiClient.convertToType(data['subsamples'], [InlineResponse20010DataSubsamples]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004DataRange} range
 */
InlineResponse20010Data.prototype['range'] = undefined;

/**
 * Quality of the price.
 * @member {module:model/InlineResponse20010Data.QualityEnum} quality
 */
InlineResponse20010Data.prototype['quality'] = undefined;

/**
 * List of summary records. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).
 * @member {Array.<module:model/InlineResponse20010DataSubsamples>} subsamples
 */
InlineResponse20010Data.prototype['subsamples'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20010Data['QualityEnum'] = {

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



export default InlineResponse20010Data;

