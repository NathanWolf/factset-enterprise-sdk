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
import InlineResponse20031DataLevel from './InlineResponse20031DataLevel';
import InlineResponse20031DataParent from './InlineResponse20031DataParent';

/**
 * The InlineResponse20032DataCategories model module.
 * @module model/InlineResponse20032DataCategories
 */
class InlineResponse20032DataCategories {
    /**
     * Constructs a new <code>InlineResponse20032DataCategories</code>.
     * @alias module:model/InlineResponse20032DataCategories
     */
    constructor() { 
        
        InlineResponse20032DataCategories.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20032DataCategories</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20032DataCategories} obj Optional instance to populate.
     * @return {module:model/InlineResponse20032DataCategories} The populated <code>InlineResponse20032DataCategories</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20032DataCategories();

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
                obj['level'] = InlineResponse20031DataLevel.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('parent')) {
                obj['parent'] = InlineResponse20031DataParent.constructFromObject(data['parent']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the category.
 * @member {Number} id
 */
InlineResponse20032DataCategories.prototype['id'] = undefined;

/**
 * Code commonly used for this category.
 * @member {String} code
 */
InlineResponse20032DataCategories.prototype['code'] = undefined;

/**
 * Name of the category.
 * @member {String} name
 */
InlineResponse20032DataCategories.prototype['name'] = undefined;

/**
 * Description of the category.
 * @member {String} description
 */
InlineResponse20032DataCategories.prototype['description'] = undefined;

/**
 * Indicates whether this category is active.
 * @member {Boolean} active
 */
InlineResponse20032DataCategories.prototype['active'] = undefined;

/**
 * @member {module:model/InlineResponse20031DataLevel} level
 */
InlineResponse20032DataCategories.prototype['level'] = undefined;

/**
 * @member {module:model/InlineResponse20031DataParent} parent
 */
InlineResponse20032DataCategories.prototype['parent'] = undefined;






export default InlineResponse20032DataCategories;

