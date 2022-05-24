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
import InlineResponse200DataTradingAverage from './InlineResponse200DataTradingAverage';
import InlineResponse200DataTradingMedian from './InlineResponse200DataTradingMedian';

/**
 * The InlineResponse200DataTrading model module.
 * @module model/InlineResponse200DataTrading
 * @version 0.10.0
 */
class InlineResponse200DataTrading {
    /**
     * Constructs a new <code>InlineResponse200DataTrading</code>.
     * Trading.
     * @alias module:model/InlineResponse200DataTrading
     */
    constructor() { 
        
        InlineResponse200DataTrading.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataTrading</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataTrading} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataTrading} The populated <code>InlineResponse200DataTrading</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataTrading();

            if (data.hasOwnProperty('average')) {
                obj['average'] = InlineResponse200DataTradingAverage.constructFromObject(data['average']);
            }
            if (data.hasOwnProperty('median')) {
                obj['median'] = InlineResponse200DataTradingMedian.constructFromObject(data['median']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse200DataTradingAverage} average
 */
InlineResponse200DataTrading.prototype['average'] = undefined;

/**
 * @member {module:model/InlineResponse200DataTradingMedian} median
 */
InlineResponse200DataTrading.prototype['median'] = undefined;






export default InlineResponse200DataTrading;

