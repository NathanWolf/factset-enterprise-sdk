/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PACalculationGroup model module.
 * @module model/PACalculationGroup
 */
class PACalculationGroup {
    /**
     * Constructs a new <code>PACalculationGroup</code>.
     * @alias module:model/PACalculationGroup
     */
    constructor() { 
        
        PACalculationGroup.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PACalculationGroup</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PACalculationGroup} obj Optional instance to populate.
     * @return {module:model/PACalculationGroup} The populated <code>PACalculationGroup</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PACalculationGroup();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = ApiClient.convertToType(data['frequency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet-defined or User-defined Group identifier.
 * @member {String} id
 */
PACalculationGroup.prototype['id'] = undefined;

/**
 * Grouping frequency
 * @member {String} frequency
 */
PACalculationGroup.prototype['frequency'] = undefined;






export default PACalculationGroup;

