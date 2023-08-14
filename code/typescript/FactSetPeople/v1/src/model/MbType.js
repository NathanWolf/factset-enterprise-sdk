/**
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class MbType.
* @enum {}
* @readonly
*/
export default class MbType {
    
        /**
         * value: "MB"
         * @const
         */
        "MB" = "MB";

    
        /**
         * value: "MGMT"
         * @const
         */
        "MGMT" = "MGMT";

    
        /**
         * value: "BRD"
         * @const
         */
        "BRD" = "BRD";

    

    /**
    * Returns a <code>MbType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MbType} The enum <code>MbType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

