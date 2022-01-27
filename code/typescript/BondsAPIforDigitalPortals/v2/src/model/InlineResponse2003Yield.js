/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse2003Yield model module.
 * @module model/InlineResponse2003Yield
 * @version 0.9.0
 */
class InlineResponse2003Yield {
    /**
     * Constructs a new <code>InlineResponse2003Yield</code>.
     * Yield-related key figures.
     * @alias module:model/InlineResponse2003Yield
     */
    constructor() { 
        
        InlineResponse2003Yield.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003Yield</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003Yield} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003Yield} The populated <code>InlineResponse2003Yield</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003Yield();

            if (data.hasOwnProperty('current')) {
                obj['current'] = ApiClient.convertToType(data['current'], 'Number');
            }
            if (data.hasOwnProperty('toMaturity')) {
                obj['toMaturity'] = ApiClient.convertToType(data['toMaturity'], 'Number');
            }
            if (data.hasOwnProperty('spread')) {
                obj['spread'] = ApiClient.convertToType(data['spread'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Current yield, which is the next annual interest payment divided by the price. If the coupon period is different than a year, the interest payment is annualized.
 * @member {Number} current
 */
InlineResponse2003Yield.prototype['current'] = undefined;

/**
 * Yield to maturity, which is the annual rate of return, assuming the instrument is held until maturity.
 * @member {Number} toMaturity
 */
InlineResponse2003Yield.prototype['toMaturity'] = undefined;

/**
 * Credit spread, which is the difference in yield to maturity between a highest-quality debt instrument, also called a benchmark bond, and the debt instrument. See endpoint `/instrument/benchmark/list` for the benchmark bond.
 * @member {Number} spread
 */
InlineResponse2003Yield.prototype['spread'] = undefined;






export default InlineResponse2003Yield;

