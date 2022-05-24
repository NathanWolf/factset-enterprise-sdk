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
import WatchlistCreateMeta from './WatchlistCreateMeta';
import WatchlistPositionModifyData from './WatchlistPositionModifyData';

/**
 * The InlineObject5 model module.
 * @module model/InlineObject5
 * @version 0.9.2
 */
class InlineObject5 {
    /**
     * Constructs a new <code>InlineObject5</code>.
     * @alias module:model/InlineObject5
     */
    constructor() { 
        
        InlineObject5.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject5</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject5} obj Optional instance to populate.
     * @return {module:model/InlineObject5} The populated <code>InlineObject5</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject5();

            if (data.hasOwnProperty('data')) {
                obj['data'] = WatchlistPositionModifyData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = WatchlistCreateMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/WatchlistPositionModifyData} data
 */
InlineObject5.prototype['data'] = undefined;

/**
 * @member {module:model/WatchlistCreateMeta} meta
 */
InlineObject5.prototype['meta'] = undefined;






export default InlineObject5;

