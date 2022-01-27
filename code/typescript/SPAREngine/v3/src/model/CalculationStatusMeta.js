/**
 * SPAR Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CalculationUnitStatusMeta from './CalculationUnitStatusMeta';

/**
 * The CalculationStatusMeta model module.
 * @module model/CalculationStatusMeta
 * @version 0.9.0
 */
class CalculationStatusMeta {
    /**
     * Constructs a new <code>CalculationStatusMeta</code>.
     * @alias module:model/CalculationStatusMeta
     */
    constructor() { 
        
        CalculationStatusMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CalculationStatusMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationStatusMeta} obj Optional instance to populate.
     * @return {module:model/CalculationStatusMeta} The populated <code>CalculationStatusMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationStatusMeta();

            if (data.hasOwnProperty('units')) {
                obj['units'] = ApiClient.convertToType(data['units'], {'String': CalculationUnitStatusMeta});
            }
        }
        return obj;
    }


}

/**
 * Meta of calculation units in batch.
 * @member {Object.<String, module:model/CalculationUnitStatusMeta>} units
 */
CalculationStatusMeta.prototype['units'] = undefined;






export default CalculationStatusMeta;

