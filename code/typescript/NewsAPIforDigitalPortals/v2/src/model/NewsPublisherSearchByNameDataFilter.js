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
import NewsPublisherSearchByNameDataFilterDelivery from './NewsPublisherSearchByNameDataFilterDelivery';
import NewsPublisherSearchByNameDataFilterDistributor from './NewsPublisherSearchByNameDataFilterDistributor';

/**
 * The NewsPublisherSearchByNameDataFilter model module.
 * @module model/NewsPublisherSearchByNameDataFilter
 * @version 0.10.0
 */
class NewsPublisherSearchByNameDataFilter {
    /**
     * Constructs a new <code>NewsPublisherSearchByNameDataFilter</code>.
     * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
     * @alias module:model/NewsPublisherSearchByNameDataFilter
     */
    constructor() { 
        
        NewsPublisherSearchByNameDataFilter.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NewsPublisherSearchByNameDataFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NewsPublisherSearchByNameDataFilter} obj Optional instance to populate.
     * @return {module:model/NewsPublisherSearchByNameDataFilter} The populated <code>NewsPublisherSearchByNameDataFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NewsPublisherSearchByNameDataFilter();

            if (data.hasOwnProperty('distributor')) {
                obj['distributor'] = NewsPublisherSearchByNameDataFilterDistributor.constructFromObject(data['distributor']);
            }
            if (data.hasOwnProperty('delivery')) {
                obj['delivery'] = NewsPublisherSearchByNameDataFilterDelivery.constructFromObject(data['delivery']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/NewsPublisherSearchByNameDataFilterDistributor} distributor
 */
NewsPublisherSearchByNameDataFilter.prototype['distributor'] = undefined;

/**
 * @member {module:model/NewsPublisherSearchByNameDataFilterDelivery} delivery
 */
NewsPublisherSearchByNameDataFilter.prototype['delivery'] = undefined;






export default NewsPublisherSearchByNameDataFilter;

