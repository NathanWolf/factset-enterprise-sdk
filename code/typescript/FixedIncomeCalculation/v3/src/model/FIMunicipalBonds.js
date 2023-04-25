/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FIMunicipalBonds model module.
 * @module model/FIMunicipalBonds
 */
class FIMunicipalBonds {
    /**
     * Constructs a new <code>FIMunicipalBonds</code>.
     * @alias module:model/FIMunicipalBonds
     */
    constructor() { 
        
        FIMunicipalBonds.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIMunicipalBonds</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIMunicipalBonds} obj Optional instance to populate.
     * @return {module:model/FIMunicipalBonds} The populated <code>FIMunicipalBonds</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIMunicipalBonds();

            if (data.hasOwnProperty('ignoreSinkingFund')) {
                obj['ignoreSinkingFund'] = ApiClient.convertToType(data['ignoreSinkingFund'], 'Boolean');
            }
            if (data.hasOwnProperty('useAnticipatedSinkSchedule')) {
                obj['useAnticipatedSinkSchedule'] = ApiClient.convertToType(data['useAnticipatedSinkSchedule'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Ignore Sinking Fund Schedule
 * @member {Boolean} ignoreSinkingFund
 */
FIMunicipalBonds.prototype['ignoreSinkingFund'] = undefined;

/**
 * Anticipate Sink Schedule
 * @member {Boolean} useAnticipatedSinkSchedule
 */
FIMunicipalBonds.prototype['useAnticipatedSinkSchedule'] = undefined;






export default FIMunicipalBonds;

