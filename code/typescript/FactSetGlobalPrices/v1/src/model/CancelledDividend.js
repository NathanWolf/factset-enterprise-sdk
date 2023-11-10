/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class CancelledDividend.
* @enum {}
* @readonly
*/
export default class CancelledDividend {
    
        /**
         * value: "include"
         * @const
         */
        "include" = "include";

    
        /**
         * value: "exclude"
         * @const
         */
        "exclude" = "exclude";

    

    /**
    * Returns a <code>CancelledDividend</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/CancelledDividend} The enum <code>CancelledDividend</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

