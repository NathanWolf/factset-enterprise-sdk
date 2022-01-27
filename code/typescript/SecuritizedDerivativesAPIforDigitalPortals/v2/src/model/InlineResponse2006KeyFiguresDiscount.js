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
 * The InlineResponse2006KeyFiguresDiscount model module.
 * @module model/InlineResponse2006KeyFiguresDiscount
 * @version 0.9.0
 */
class InlineResponse2006KeyFiguresDiscount {
    /**
     * Constructs a new <code>InlineResponse2006KeyFiguresDiscount</code>.
     * Discount. It represents the difference between the ask price of the securitized derivative and the underlying level, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for discount certificates. For the value unit, see attribute &#x60;instrument.underlying.valueUnit.&#x60;
     * @alias module:model/InlineResponse2006KeyFiguresDiscount
     */
    constructor() { 
        
        InlineResponse2006KeyFiguresDiscount.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006KeyFiguresDiscount</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006KeyFiguresDiscount} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006KeyFiguresDiscount} The populated <code>InlineResponse2006KeyFiguresDiscount</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006KeyFiguresDiscount();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = ApiClient.convertToType(data['absolute'], 'Number');
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = ApiClient.convertToType(data['relative'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Discount in absolute terms.
 * @member {Number} absolute
 */
InlineResponse2006KeyFiguresDiscount.prototype['absolute'] = undefined;

/**
 * Discount relative to the underlying level.
 * @member {Number} relative
 */
InlineResponse2006KeyFiguresDiscount.prototype['relative'] = undefined;






export default InlineResponse2006KeyFiguresDiscount;

