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
import InlineResponse2004DataTradedValueDays30 from './InlineResponse2004DataTradedValueDays30';

/**
 * The InlineResponse2004DataTradedValue model module.
 * @module model/InlineResponse2004DataTradedValue
 * @version 0.10.0
 */
class InlineResponse2004DataTradedValue {
    /**
     * Constructs a new <code>InlineResponse2004DataTradedValue</code>.
     * Value ranges of the cash flow for all transactions over a given time range. The currency is the currency of denomination (see attribute &#x60;issue.volume.currency&#x60;). Not available, if the parameter &#x60;issue.volume.currency.restrict.ids&#x60; has not been set to a single currency.
     * @alias module:model/InlineResponse2004DataTradedValue
     */
    constructor() { 
        
        InlineResponse2004DataTradedValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataTradedValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataTradedValue} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataTradedValue} The populated <code>InlineResponse2004DataTradedValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataTradedValue();

            if (data.hasOwnProperty('days30')) {
                obj['days30'] = InlineResponse2004DataTradedValueDays30.constructFromObject(data['days30']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004DataTradedValueDays30} days30
 */
InlineResponse2004DataTradedValue.prototype['days30'] = undefined;






export default InlineResponse2004DataTradedValue;

