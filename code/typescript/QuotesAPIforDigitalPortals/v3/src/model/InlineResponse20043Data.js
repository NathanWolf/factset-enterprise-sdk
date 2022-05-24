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
import InlineResponse20036Fsym from './InlineResponse20036Fsym';
import InlineResponse20042DataAssetClass from './InlineResponse20042DataAssetClass';
import InlineResponse20042DataNsin from './InlineResponse20042DataNsin';
import InlineResponse20042DataType from './InlineResponse20042DataType';

/**
 * The InlineResponse20043Data model module.
 * @module model/InlineResponse20043Data
 * @version 0.10.0
 */
class InlineResponse20043Data {
    /**
     * Constructs a new <code>InlineResponse20043Data</code>.
     * Set of basic data for the instrument.
     * @alias module:model/InlineResponse20043Data
     */
    constructor() { 
        
        InlineResponse20043Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20043Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20043Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20043Data} The populated <code>InlineResponse20043Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20043Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortName')) {
                obj['shortName'] = ApiClient.convertToType(data['shortName'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse20042DataNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20036Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('assetClass')) {
                obj['assetClass'] = InlineResponse20042DataAssetClass.constructFromObject(data['assetClass']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], [InlineResponse20042DataType]);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20043Data.prototype['id'] = undefined;

/**
 * Name of the instrument.
 * @member {String} name
 */
InlineResponse20043Data.prototype['name'] = undefined;

/**
 * Short name of the instrument.
 * @member {String} shortName
 */
InlineResponse20043Data.prototype['shortName'] = undefined;

/**
 * International Securities Identification Number of the instrument.
 * @member {String} isin
 */
InlineResponse20043Data.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse20042DataNsin} nsin
 */
InlineResponse20043Data.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse20036Fsym} fsym
 */
InlineResponse20043Data.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse20042DataAssetClass} assetClass
 */
InlineResponse20043Data.prototype['assetClass'] = undefined;

/**
 * Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18).
 * @member {Array.<module:model/InlineResponse20042DataType>} type
 */
InlineResponse20043Data.prototype['type'] = undefined;






export default InlineResponse20043Data;

