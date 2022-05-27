/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class ErrorCode.
* @enum {}
* @readonly
*/
export default class ErrorCode {
    
        /**
         * value: "notAuthenticated"
         * @const
         */
        "notAuthenticated" = "notAuthenticated";

    
        /**
         * value: "notAuthorized"
         * @const
         */
        "notAuthorized" = "notAuthorized";

    
        /**
         * value: "notFound"
         * @const
         */
        "notFound" = "notFound";

    
        /**
         * value: "endpointNotFound"
         * @const
         */
        "endpointNotFound" = "endpointNotFound";

    
        /**
         * value: "parameterError"
         * @const
         */
        "parameterError" = "parameterError";

    
        /**
         * value: "genericServerError"
         * @const
         */
        "genericServerError" = "genericServerError";

    
        /**
         * value: "resourceGone"
         * @const
         */
        "resourceGone" = "resourceGone";

    
        /**
         * value: "quantityLimitsExceeded"
         * @const
         */
        "quantityLimitsExceeded" = "quantityLimitsExceeded";

    
        /**
         * value: "universal_screening_parameterError"
         * @const
         */
        "universal_screening_parameterError" = "universal_screening_parameterError";

    
        /**
         * value: "universal_screening_parameterWarning"
         * @const
         */
        "universal_screening_parameterWarning" = "universal_screening_parameterWarning";

    

    /**
    * Returns a <code>ErrorCode</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ErrorCode} The enum <code>ErrorCode</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

