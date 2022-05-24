/**
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UnitsUnits from './UnitsUnits';

/**
 * The Units model module.
 * @module model/Units
 * @version 0.20.0
 */
class Units {
    /**
     * Constructs a new <code>Units</code>.
     * @alias module:model/Units
     */
    constructor() { 
        
        Units.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Units</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Units} obj Optional instance to populate.
     * @return {module:model/Units} The populated <code>Units</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Units();

            if (data.hasOwnProperty('units')) {
                obj['units'] = UnitsUnits.constructFromObject(data['units']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UnitsUnits} units
 */
Units.prototype['units'] = undefined;






export default Units;

