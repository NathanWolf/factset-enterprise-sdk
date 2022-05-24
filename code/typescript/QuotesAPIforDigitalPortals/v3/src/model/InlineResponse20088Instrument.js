/**
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
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
import InlineResponse20038DataCategories from './InlineResponse20038DataCategories';
import InlineResponse20088InstrumentNsin from './InlineResponse20088InstrumentNsin';

/**
 * The InlineResponse20088Instrument model module.
 * @module model/InlineResponse20088Instrument
 * @version 0.10.0
 */
class InlineResponse20088Instrument {
    /**
     * Constructs a new <code>InlineResponse20088Instrument</code>.
     * Instrument data of the notation.
     * @alias module:model/InlineResponse20088Instrument
     */
    constructor() { 
        
        InlineResponse20088Instrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20088Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20088Instrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse20088Instrument} The populated <code>InlineResponse20088Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20088Instrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse20088InstrumentNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('assetClass')) {
                obj['assetClass'] = ApiClient.convertToType(data['assetClass'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], [InlineResponse20038DataCategories]);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument of the notation.
 * @member {String} id
 */
InlineResponse20088Instrument.prototype['id'] = undefined;

/**
 * Asset class-unspecific name in English.
 * @member {String} name
 */
InlineResponse20088Instrument.prototype['name'] = undefined;

/**
 * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
 * @member {String} isin
 */
InlineResponse20088Instrument.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse20088InstrumentNsin} nsin
 */
InlineResponse20088Instrument.prototype['nsin'] = undefined;

/**
 * Name of the asset class of the instrument. Possible values are listed in the enumeration in the parameter description.
 * @member {String} assetClass
 */
InlineResponse20088Instrument.prototype['assetClass'] = undefined;

/**
 * Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18).
 * @member {Array.<module:model/InlineResponse20038DataCategories>} type
 */
InlineResponse20088Instrument.prototype['type'] = undefined;






export default InlineResponse20088Instrument;

