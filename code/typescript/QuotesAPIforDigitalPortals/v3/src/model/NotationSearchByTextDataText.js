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

/**
 * The NotationSearchByTextDataText model module.
 * @module model/NotationSearchByTextDataText
 * @version 0.10.0
 */
class NotationSearchByTextDataText {
    /**
     * Constructs a new <code>NotationSearchByTextDataText</code>.
     * Text-related parameters.
     * @alias module:model/NotationSearchByTextDataText
     * @param value {String} Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\". If only two characters are submitted, the search is executed as an exact search.
     */
    constructor(value) { 
        
        NotationSearchByTextDataText.initialize(this, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, value) { 
        obj['value'] = value;
    }

    /**
     * Constructs a <code>NotationSearchByTextDataText</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationSearchByTextDataText} obj Optional instance to populate.
     * @return {module:model/NotationSearchByTextDataText} The populated <code>NotationSearchByTextDataText</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationSearchByTextDataText();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * List of attributes to be searched in. The value `allEntitled` cannot appear with any other value.
 * @member {Array.<module:model/NotationSearchByTextDataText.AttributesEnum>} attributes
 */
NotationSearchByTextDataText.prototype['attributes'] = undefined;

/**
 * Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\". If only two characters are submitted, the search is executed as an exact search.
 * @member {String} value
 */
NotationSearchByTextDataText.prototype['value'] = undefined;





/**
 * Allowed values for the <code>attributes</code> property.
 * @enum {String}
 * @readonly
 */
NotationSearchByTextDataText['AttributesEnum'] = {

    /**
     * value: "allEntitled"
     * @const
     */
    "allEntitled": "allEntitled",

    /**
     * value: "isin"
     * @const
     */
    "isin": "isin",

    /**
     * value: "wkn"
     * @const
     */
    "wkn": "wkn",

    /**
     * value: "valor"
     * @const
     */
    "valor": "valor",

    /**
     * value: "sedol"
     * @const
     */
    "sedol": "sedol",

    /**
     * value: "cusip"
     * @const
     */
    "cusip": "cusip",

    /**
     * value: "symbol"
     * @const
     */
    "symbol": "symbol",

    /**
     * value: "longName"
     * @const
     */
    "longName": "longName",

    /**
     * value: "shortName"
     * @const
     */
    "shortName": "shortName"
};



export default NotationSearchByTextDataText;

