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
import InlineResponse20034DataLevel from './InlineResponse20034DataLevel';
import InlineResponse20034DataParent from './InlineResponse20034DataParent';

/**
 * The InlineResponse20034DataCategories model module.
 * @module model/InlineResponse20034DataCategories
 * @version 0.10.0
 */
class InlineResponse20034DataCategories {
    /**
     * Constructs a new <code>InlineResponse20034DataCategories</code>.
     * @alias module:model/InlineResponse20034DataCategories
     */
    constructor() { 
        
        InlineResponse20034DataCategories.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20034DataCategories</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20034DataCategories} obj Optional instance to populate.
     * @return {module:model/InlineResponse20034DataCategories} The populated <code>InlineResponse20034DataCategories</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20034DataCategories();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Boolean');
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = InlineResponse20034DataLevel.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('parent')) {
                obj['parent'] = InlineResponse20034DataParent.constructFromObject(data['parent']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the category.
 * @member {Number} id
 */
InlineResponse20034DataCategories.prototype['id'] = undefined;

/**
 * Code commonly used for this category.
 * @member {String} code
 */
InlineResponse20034DataCategories.prototype['code'] = undefined;

/**
 * Name of the category.
 * @member {String} name
 */
InlineResponse20034DataCategories.prototype['name'] = undefined;

/**
 * Description of the category.
 * @member {String} description
 */
InlineResponse20034DataCategories.prototype['description'] = undefined;

/**
 * Indicates whether this category is active.
 * @member {Boolean} active
 */
InlineResponse20034DataCategories.prototype['active'] = undefined;

/**
 * @member {module:model/InlineResponse20034DataLevel} level
 */
InlineResponse20034DataCategories.prototype['level'] = undefined;

/**
 * @member {module:model/InlineResponse20034DataParent} parent
 */
InlineResponse20034DataCategories.prototype['parent'] = undefined;






export default InlineResponse20034DataCategories;

