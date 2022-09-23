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
* Enum class Periodicity.
* @enum {}
* @readonly
*/
export default class Periodicity {
    
        /**
         * value: "LTM"
         * @const
         */
        "LTM" = "LTM";

    
        /**
         * value: "LTMA"
         * @const
         */
        "LTMA" = "LTMA";

    
        /**
         * value: "STMA"
         * @const
         */
        "STMA" = "STMA";

    
        /**
         * value: "NTMA"
         * @const
         */
        "NTMA" = "NTMA";

    
        /**
         * value: "0"
         * @const
         */
        "0" = "0";

    
        /**
         * value: "1"
         * @const
         */
        "1" = "1";

    
        /**
         * value: "2"
         * @const
         */
        "2" = "2";

    
        /**
         * value: "QTR"
         * @const
         */
        "QTR" = "QTR";

    

    /**
    * Returns a <code>Periodicity</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/Periodicity} The enum <code>Periodicity</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

