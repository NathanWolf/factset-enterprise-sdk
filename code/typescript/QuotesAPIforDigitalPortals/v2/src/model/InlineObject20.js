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
import InstrumentBackgroundTextTypeListMeta from './InstrumentBackgroundTextTypeListMeta';
import NotationCrossReferenceFactSetIdentifierListByInstrumentData from './NotationCrossReferenceFactSetIdentifierListByInstrumentData';

/**
 * The InlineObject20 model module.
 * @module model/InlineObject20
 * @version 0.9.2
 */
class InlineObject20 {
    /**
     * Constructs a new <code>InlineObject20</code>.
     * @alias module:model/InlineObject20
     * @param data {module:model/NotationCrossReferenceFactSetIdentifierListByInstrumentData} 
     */
    constructor(data) { 
        
        InlineObject20.initialize(this, data);
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
     * Constructs a <code>InlineObject20</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject20} obj Optional instance to populate.
     * @return {module:model/InlineObject20} The populated <code>InlineObject20</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject20();

            if (data.hasOwnProperty('data')) {
                obj['data'] = NotationCrossReferenceFactSetIdentifierListByInstrumentData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InstrumentBackgroundTextTypeListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/NotationCrossReferenceFactSetIdentifierListByInstrumentData} data
 */
InlineObject20.prototype['data'] = undefined;

/**
 * @member {module:model/InstrumentBackgroundTextTypeListMeta} meta
 */
InlineObject20.prototype['meta'] = undefined;






export default InlineObject20;

