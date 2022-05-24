/**
 * Publisher API
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CalculationStatusSummary model module.
 * @module model/CalculationStatusSummary
 * @version 0.8.2
 */
class CalculationStatusSummary {
    /**
     * Constructs a new <code>CalculationStatusSummary</code>.
     * @alias module:model/CalculationStatusSummary
     */
    constructor() { 
        
        CalculationStatusSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CalculationStatusSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CalculationStatusSummary} obj Optional instance to populate.
     * @return {module:model/CalculationStatusSummary} The populated <code>CalculationStatusSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CalculationStatusSummary();

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('units')) {
                obj['units'] = ApiClient.convertToType(data['units'], 'Number');
            }
            if (data.hasOwnProperty('requestTime')) {
                obj['requestTime'] = ApiClient.convertToType(data['requestTime'], 'Date');
            }
            if (data.hasOwnProperty('lastPollTime')) {
                obj['lastPollTime'] = ApiClient.convertToType(data['lastPollTime'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The status of the calculation.
 * @member {module:model/CalculationStatusSummary.StatusEnum} status
 */
CalculationStatusSummary.prototype['status'] = undefined;

/**
 * Number of calculation units in batch.
 * @member {Number} units
 */
CalculationStatusSummary.prototype['units'] = undefined;

/**
 * Request time of calculation.
 * @member {Date} requestTime
 */
CalculationStatusSummary.prototype['requestTime'] = undefined;

/**
 * Last poll time of calculation.
 * @member {Date} lastPollTime
 */
CalculationStatusSummary.prototype['lastPollTime'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
CalculationStatusSummary['StatusEnum'] = {

    /**
     * value: "Queued"
     * @const
     */
    "Queued": "Queued",

    /**
     * value: "Executing"
     * @const
     */
    "Executing": "Executing",

    /**
     * value: "Completed"
     * @const
     */
    "Completed": "Completed",

    /**
     * value: "Cancelled"
     * @const
     */
    "Cancelled": "Cancelled"
};



export default CalculationStatusSummary;

