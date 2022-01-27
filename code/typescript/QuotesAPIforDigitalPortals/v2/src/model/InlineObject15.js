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
import BasicBackgroundTextTypeListMeta from './BasicBackgroundTextTypeListMeta';
import InstrumentRatingGradeListData from './InstrumentRatingGradeListData';

/**
 * The InlineObject15 model module.
 * @module model/InlineObject15
 * @version 0.9.0
 */
class InlineObject15 {
    /**
     * Constructs a new <code>InlineObject15</code>.
     * @alias module:model/InlineObject15
     */
    constructor() { 
        
        InlineObject15.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject15</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject15} obj Optional instance to populate.
     * @return {module:model/InlineObject15} The populated <code>InlineObject15</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject15();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InstrumentRatingGradeListData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = BasicBackgroundTextTypeListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InstrumentRatingGradeListData} data
 */
InlineObject15.prototype['data'] = undefined;

/**
 * @member {module:model/BasicBackgroundTextTypeListMeta} meta
 */
InlineObject15.prototype['meta'] = undefined;






export default InlineObject15;

