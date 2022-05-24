/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Fundamental from './Fundamental';

/**
 * The FundamentalsResponse model module.
 * @module model/FundamentalsResponse
 * @version 0.20.0
 */
class FundamentalsResponse {
    /**
     * Constructs a new <code>FundamentalsResponse</code>.
     * Array of Fundamentals Objects
     * @alias module:model/FundamentalsResponse
     */
    constructor() { 
        
        FundamentalsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FundamentalsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundamentalsResponse} obj Optional instance to populate.
     * @return {module:model/FundamentalsResponse} The populated <code>FundamentalsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundamentalsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Fundamental]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/Fundamental>} data
 */
FundamentalsResponse.prototype['data'] = undefined;






export default FundamentalsResponse;

