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

/**
 * The NotationCrossReferenceListByInstrumentDataFilterValueUnits model module.
 * @module model/NotationCrossReferenceListByInstrumentDataFilterValueUnits
 * @version 0.9.0
 */
class NotationCrossReferenceListByInstrumentDataFilterValueUnits {
    /**
     * Constructs a new <code>NotationCrossReferenceListByInstrumentDataFilterValueUnits</code>.
     * Filter for specific value units.
     * @alias module:model/NotationCrossReferenceListByInstrumentDataFilterValueUnits
     */
    constructor() { 
        
        NotationCrossReferenceListByInstrumentDataFilterValueUnits.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NotationCrossReferenceListByInstrumentDataFilterValueUnits</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationCrossReferenceListByInstrumentDataFilterValueUnits} obj Optional instance to populate.
     * @return {module:model/NotationCrossReferenceListByInstrumentDataFilterValueUnits} The populated <code>NotationCrossReferenceListByInstrumentDataFilterValueUnits</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationCrossReferenceListByInstrumentDataFilterValueUnits();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * List of value unit ids.
 * @member {Array.<Number>} ids
 */
NotationCrossReferenceListByInstrumentDataFilterValueUnits.prototype['ids'] = undefined;






export default NotationCrossReferenceListByInstrumentDataFilterValueUnits;

