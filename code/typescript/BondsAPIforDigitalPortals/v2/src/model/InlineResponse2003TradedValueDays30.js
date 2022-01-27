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
 * The InlineResponse2003TradedValueDays30 model module.
 * @module model/InlineResponse2003TradedValueDays30
 * @version 0.9.0
 */
class InlineResponse2003TradedValueDays30 {
    /**
     * Constructs a new <code>InlineResponse2003TradedValueDays30</code>.
     * Cash flow for the time range 30 trading days.
     * @alias module:model/InlineResponse2003TradedValueDays30
     */
    constructor() { 
        
        InlineResponse2003TradedValueDays30.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003TradedValueDays30</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003TradedValueDays30} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003TradedValueDays30} The populated <code>InlineResponse2003TradedValueDays30</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003TradedValueDays30();

            if (data.hasOwnProperty('sum')) {
                obj['sum'] = ApiClient.convertToType(data['sum'], 'Number');
            }
            if (data.hasOwnProperty('average')) {
                obj['average'] = ApiClient.convertToType(data['average'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Sum of the cash flow.
 * @member {Number} sum
 */
InlineResponse2003TradedValueDays30.prototype['sum'] = undefined;

/**
 * Average daily cash flow.
 * @member {Number} average
 */
InlineResponse2003TradedValueDays30.prototype['average'] = undefined;






export default InlineResponse2003TradedValueDays30;

