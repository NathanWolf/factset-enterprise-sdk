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
import DebtInstrumentNotationScreenerSearchData from './DebtInstrumentNotationScreenerSearchData';
import DebtInstrumentNotationScreenerSearchMeta from './DebtInstrumentNotationScreenerSearchMeta';

/**
 * The InlineObject1 model module.
 * @module model/InlineObject1
 * @version 0.9.0
 */
class InlineObject1 {
    /**
     * Constructs a new <code>InlineObject1</code>.
     * @alias module:model/InlineObject1
     */
    constructor() { 
        
        InlineObject1.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject1} obj Optional instance to populate.
     * @return {module:model/InlineObject1} The populated <code>InlineObject1</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject1();

            if (data.hasOwnProperty('data')) {
                obj['data'] = DebtInstrumentNotationScreenerSearchData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = DebtInstrumentNotationScreenerSearchMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchData} data
 */
InlineObject1.prototype['data'] = undefined;

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchMeta} meta
 */
InlineObject1.prototype['meta'] = undefined;






export default InlineObject1;

