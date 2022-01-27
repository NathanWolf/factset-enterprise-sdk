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
import NotationCrossReferenceListByInstrumentDataFilter from './NotationCrossReferenceListByInstrumentDataFilter';

/**
 * The NotationCrossReferenceListByInstrumentData model module.
 * @module model/NotationCrossReferenceListByInstrumentData
 * @version 0.9.0
 */
class NotationCrossReferenceListByInstrumentData {
    /**
     * Constructs a new <code>NotationCrossReferenceListByInstrumentData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/NotationCrossReferenceListByInstrumentData
     * @param id {String} Identifier of an instrument.
     */
    constructor(id) { 
        
        NotationCrossReferenceListByInstrumentData.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>NotationCrossReferenceListByInstrumentData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationCrossReferenceListByInstrumentData} obj Optional instance to populate.
     * @return {module:model/NotationCrossReferenceListByInstrumentData} The populated <code>NotationCrossReferenceListByInstrumentData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationCrossReferenceListByInstrumentData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = NotationCrossReferenceListByInstrumentDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of an instrument.
 * @member {String} id
 */
NotationCrossReferenceListByInstrumentData.prototype['id'] = undefined;

/**
 * @member {module:model/NotationCrossReferenceListByInstrumentDataFilter} filter
 */
NotationCrossReferenceListByInstrumentData.prototype['filter'] = undefined;






export default NotationCrossReferenceListByInstrumentData;

