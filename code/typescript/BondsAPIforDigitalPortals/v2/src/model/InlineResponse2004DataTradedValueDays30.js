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
import InlineResponse2004DataTradedValueDays30Average from './InlineResponse2004DataTradedValueDays30Average';
import InlineResponse2004DataTradedValueDays30Sum from './InlineResponse2004DataTradedValueDays30Sum';

/**
 * The InlineResponse2004DataTradedValueDays30 model module.
 * @module model/InlineResponse2004DataTradedValueDays30
 * @version 0.9.0
 */
class InlineResponse2004DataTradedValueDays30 {
    /**
     * Constructs a new <code>InlineResponse2004DataTradedValueDays30</code>.
     * Cash flow for the time range 30 trading days.
     * @alias module:model/InlineResponse2004DataTradedValueDays30
     */
    constructor() { 
        
        InlineResponse2004DataTradedValueDays30.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataTradedValueDays30</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataTradedValueDays30} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataTradedValueDays30} The populated <code>InlineResponse2004DataTradedValueDays30</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataTradedValueDays30();

            if (data.hasOwnProperty('sum')) {
                obj['sum'] = InlineResponse2004DataTradedValueDays30Sum.constructFromObject(data['sum']);
            }
            if (data.hasOwnProperty('average')) {
                obj['average'] = InlineResponse2004DataTradedValueDays30Average.constructFromObject(data['average']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2004DataTradedValueDays30Sum} sum
 */
InlineResponse2004DataTradedValueDays30.prototype['sum'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataTradedValueDays30Average} average
 */
InlineResponse2004DataTradedValueDays30.prototype['average'] = undefined;






export default InlineResponse2004DataTradedValueDays30;

