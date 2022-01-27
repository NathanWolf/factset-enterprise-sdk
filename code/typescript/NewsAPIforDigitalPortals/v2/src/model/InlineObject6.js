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
import NewsPublisherSearchByNameData from './NewsPublisherSearchByNameData';
import NewsPublisherSearchByNameMeta from './NewsPublisherSearchByNameMeta';

/**
 * The InlineObject6 model module.
 * @module model/InlineObject6
 * @version 0.9.0
 */
class InlineObject6 {
    /**
     * Constructs a new <code>InlineObject6</code>.
     * @alias module:model/InlineObject6
     * @param data {module:model/NewsPublisherSearchByNameData} 
     */
    constructor(data) { 
        
        InlineObject6.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>InlineObject6</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject6} obj Optional instance to populate.
     * @return {module:model/InlineObject6} The populated <code>InlineObject6</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject6();

            if (data.hasOwnProperty('data')) {
                obj['data'] = NewsPublisherSearchByNameData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = NewsPublisherSearchByNameMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/NewsPublisherSearchByNameData} data
 */
InlineObject6.prototype['data'] = undefined;

/**
 * @member {module:model/NewsPublisherSearchByNameMeta} meta
 */
InlineObject6.prototype['meta'] = undefined;






export default InlineObject6;

