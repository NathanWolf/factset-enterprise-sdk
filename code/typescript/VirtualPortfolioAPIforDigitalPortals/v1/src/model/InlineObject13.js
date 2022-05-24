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
import PortfolioCreateMeta from './PortfolioCreateMeta';
import WatchlistPositionDeleteData from './WatchlistPositionDeleteData';

/**
 * The InlineObject13 model module.
 * @module model/InlineObject13
 * @version 0.9.2
 */
class InlineObject13 {
    /**
     * Constructs a new <code>InlineObject13</code>.
     * @alias module:model/InlineObject13
     */
    constructor() { 
        
        InlineObject13.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject13</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject13} obj Optional instance to populate.
     * @return {module:model/InlineObject13} The populated <code>InlineObject13</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject13();

            if (data.hasOwnProperty('data')) {
                obj['data'] = WatchlistPositionDeleteData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = PortfolioCreateMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/WatchlistPositionDeleteData} data
 */
InlineObject13.prototype['data'] = undefined;

/**
 * @member {module:model/PortfolioCreateMeta} meta
 */
InlineObject13.prototype['meta'] = undefined;






export default InlineObject13;

