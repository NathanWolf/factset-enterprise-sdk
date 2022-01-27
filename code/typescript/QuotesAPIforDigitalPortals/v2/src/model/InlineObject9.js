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
import InstrumentBackgroundTextTypeListData from './InstrumentBackgroundTextTypeListData';
import InstrumentBackgroundTextTypeListMeta from './InstrumentBackgroundTextTypeListMeta';

/**
 * The InlineObject9 model module.
 * @module model/InlineObject9
 * @version 0.9.0
 */
class InlineObject9 {
    /**
     * Constructs a new <code>InlineObject9</code>.
     * @alias module:model/InlineObject9
     */
    constructor() { 
        
        InlineObject9.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject9</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject9} obj Optional instance to populate.
     * @return {module:model/InlineObject9} The populated <code>InlineObject9</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject9();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InstrumentBackgroundTextTypeListData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InstrumentBackgroundTextTypeListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InstrumentBackgroundTextTypeListData} data
 */
InlineObject9.prototype['data'] = undefined;

/**
 * @member {module:model/InstrumentBackgroundTextTypeListMeta} meta
 */
InlineObject9.prototype['meta'] = undefined;






export default InlineObject9;

