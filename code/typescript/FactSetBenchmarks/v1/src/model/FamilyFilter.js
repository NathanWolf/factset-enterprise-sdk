/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class FamilyFilter.
* @enum {}
* @readonly
*/
export default class FamilyFilter {
    
        /**
         * value: "CHINA_HK_INDICES"
         * @const
         */
        "CHINA_HK_INDICES" = "CHINA_HK_INDICES";

    
        /**
         * value: "DOW_JONES"
         * @const
         */
        "DOW_JONES" = "DOW_JONES";

    
        /**
         * value: "FACTSET_MARKET_INDICES"
         * @const
         */
        "FACTSET_MARKET_INDICES" = "FACTSET_MARKET_INDICES";

    
        /**
         * value: "FTSE"
         * @const
         */
        "FTSE" = "FTSE";

    
        /**
         * value: "GLOBAL_INDICES"
         * @const
         */
        "GLOBAL_INDICES" = "GLOBAL_INDICES";

    
        /**
         * value: "MSCI"
         * @const
         */
        "MSCI" = "MSCI";

    
        /**
         * value: "RUSSELL"
         * @const
         */
        "RUSSELL" = "RUSSELL";

    
        /**
         * value: "SP"
         * @const
         */
        "SP" = "SP";

    
        /**
         * value: "STOXX"
         * @const
         */
        "STOXX" = "STOXX";

    
        /**
         * value: "TOPIX"
         * @const
         */
        "TOPIX" = "TOPIX";

    

    /**
    * Returns a <code>FamilyFilter</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/FamilyFilter} The enum <code>FamilyFilter</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

