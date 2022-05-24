/**
 * QRE API
 * TBD
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CalculationStatus model module.
 * @module model/CalculationStatus
 * @version 0.20.0
 */
class CalculationStatus {
    /**
     * Constructs a new <code>CalculationStatus</code>.
     * @alias module:model/CalculationStatus
     */
    constructor() { 
        
        CalculationStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CalculationStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationStatus} obj Optional instance to populate.
     * @return {module:model/CalculationStatus} The populated <code>CalculationStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationStatus();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The unique ID for this calculation
 * @member {String} id
 */
CalculationStatus.prototype['id'] = undefined;

/**
 * @member {module:model/CalculationStatus.StatusEnum} status
 */
CalculationStatus.prototype['status'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
CalculationStatus['StatusEnum'] = {

    /**
     * value: "pending"
     * @const
     */
    "pending": "pending",

    /**
     * value: "failed"
     * @const
     */
    "failed": "failed",

    /**
     * value: "completed"
     * @const
     */
    "completed": "completed"
};



export default CalculationStatus;

