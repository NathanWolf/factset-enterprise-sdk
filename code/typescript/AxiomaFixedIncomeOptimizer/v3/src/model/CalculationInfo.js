/**
 * AFI Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CalculationInfo model module.
 * @module model/CalculationInfo
 * @version 0.20.0
 */
class CalculationInfo {
    /**
     * Constructs a new <code>CalculationInfo</code>.
     * @alias module:model/CalculationInfo
     */
    constructor() { 
        
        CalculationInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CalculationInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationInfo} obj Optional instance to populate.
     * @return {module:model/CalculationInfo} The populated <code>CalculationInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationInfo();

            if (data.hasOwnProperty('calculationId')) {
                obj['calculationId'] = ApiClient.convertToType(data['calculationId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Calculation identifier
 * @member {String} calculationId
 */
CalculationInfo.prototype['calculationId'] = undefined;






export default CalculationInfo;

