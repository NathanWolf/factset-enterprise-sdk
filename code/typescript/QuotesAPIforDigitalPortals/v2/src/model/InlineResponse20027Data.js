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
 * The InlineResponse20027Data model module.
 * @module model/InlineResponse20027Data
 * @version 0.9.0
 */
class InlineResponse20027Data {
    /**
     * Constructs a new <code>InlineResponse20027Data</code>.
     * @alias module:model/InlineResponse20027Data
     */
    constructor() { 
        
        InlineResponse20027Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20027Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20027Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20027Data} The populated <code>InlineResponse20027Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20027Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('isoCode')) {
                obj['isoCode'] = ApiClient.convertToType(data['isoCode'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a currency.
 * @member {Number} id
 */
InlineResponse20027Data.prototype['id'] = undefined;

/**
 * Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency.
 * @member {String} code
 */
InlineResponse20027Data.prototype['code'] = undefined;

/**
 * ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency.
 * @member {String} isoCode
 */
InlineResponse20027Data.prototype['isoCode'] = undefined;

/**
 * Name of the currency.
 * @member {String} name
 */
InlineResponse20027Data.prototype['name'] = undefined;

/**
 * Type of the currency.
 * @member {module:model/InlineResponse20027Data.TypeEnum} type
 */
InlineResponse20027Data.prototype['type'] = undefined;

/**
 * Indicates whether the currency is active.
 * @member {Boolean} active
 */
InlineResponse20027Data.prototype['active'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20027Data['TypeEnum'] = {

    /**
     * value: "main"
     * @const
     */
    "main": "main",

    /**
     * value: "fractional"
     * @const
     */
    "fractional": "fractional"
};



export default InlineResponse20027Data;

