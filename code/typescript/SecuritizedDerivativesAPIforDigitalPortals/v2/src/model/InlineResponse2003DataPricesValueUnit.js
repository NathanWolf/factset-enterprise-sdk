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
 * The InlineResponse2003DataPricesValueUnit model module.
 * @module model/InlineResponse2003DataPricesValueUnit
 * @version 0.10.0
 */
class InlineResponse2003DataPricesValueUnit {
    /**
     * Constructs a new <code>InlineResponse2003DataPricesValueUnit</code>.
     * Value unit of the notation of the securitized derivative, such as a main or a fractional currency for a per-unit-quoted securitized derivative, or percentages for a securitized derivative quoted in percent of the nominal (see attribute &#x60;nominal&#x60; in endpoint &#x60;/securitizedDerivative/get&#x60;). See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values.
     * @alias module:model/InlineResponse2003DataPricesValueUnit
     */
    constructor() { 
        
        InlineResponse2003DataPricesValueUnit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003DataPricesValueUnit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003DataPricesValueUnit} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003DataPricesValueUnit} The populated <code>InlineResponse2003DataPricesValueUnit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003DataPricesValueUnit();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the value unit.
 * @member {Number} id
 */
InlineResponse2003DataPricesValueUnit.prototype['id'] = undefined;

/**
 * Code of the value unit.
 * @member {String} code
 */
InlineResponse2003DataPricesValueUnit.prototype['code'] = undefined;






export default InlineResponse2003DataPricesValueUnit;

