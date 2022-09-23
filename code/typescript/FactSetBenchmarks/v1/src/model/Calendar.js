/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class Calendar.
* @enum {}
* @readonly
*/
export default class Calendar {
    
        /**
         * value: "FIVEDAY"
         * @const
         */
        "FIVEDAY" = "FIVEDAY";

    
        /**
         * value: "SEVENDAY"
         * @const
         */
        "SEVENDAY" = "SEVENDAY";

    

    /**
    * Returns a <code>Calendar</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Calendar} The enum <code>Calendar</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

