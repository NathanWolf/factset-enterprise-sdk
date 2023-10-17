/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2008DataTimezone from './InlineResponse2008DataTimezone';
import InlineResponse2009Country from './InlineResponse2009Country';
import InlineResponse2009Group from './InlineResponse2009Group';
import InlineResponse2009Type from './InlineResponse2009Type';

/**
 * The InlineResponse2009Data model module.
 * @module model/InlineResponse2009Data
 */
class InlineResponse2009Data {
    /**
     * Constructs a new <code>InlineResponse2009Data</code>.
     * @alias module:model/InlineResponse2009Data
     */
    constructor() { 
        
        InlineResponse2009Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2009Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2009Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2009Data} The populated <code>InlineResponse2009Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2009Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortName')) {
                obj['shortName'] = ApiClient.convertToType(data['shortName'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Boolean');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = InlineResponse2009Country.constructFromObject(data['country']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = InlineResponse2009Type.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('group')) {
                obj['group'] = InlineResponse2009Group.constructFromObject(data['group']);
            }
            if (data.hasOwnProperty('timezone')) {
                obj['timezone'] = InlineResponse2008DataTimezone.constructFromObject(data['timezone']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the market.
 * @member {Number} id
 */
InlineResponse2009Data.prototype['id'] = undefined;

/**
 * Name of the market.
 * @member {String} name
 */
InlineResponse2009Data.prototype['name'] = undefined;

/**
 * Short name of the market.
 * @member {String} shortName
 */
InlineResponse2009Data.prototype['shortName'] = undefined;

/**
 * Indicates whether the market exists.
 * @member {Boolean} active
 */
InlineResponse2009Data.prototype['active'] = undefined;

/**
 * @member {module:model/InlineResponse2009Country} country
 */
InlineResponse2009Data.prototype['country'] = undefined;

/**
 * @member {module:model/InlineResponse2009Type} type
 */
InlineResponse2009Data.prototype['type'] = undefined;

/**
 * @member {module:model/InlineResponse2009Group} group
 */
InlineResponse2009Data.prototype['group'] = undefined;

/**
 * @member {module:model/InlineResponse2008DataTimezone} timezone
 */
InlineResponse2009Data.prototype['timezone'] = undefined;






export default InlineResponse2009Data;

