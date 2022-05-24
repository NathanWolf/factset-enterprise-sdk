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
 * The InlineResponse20064DataMarket model module.
 * @module model/InlineResponse20064DataMarket
 * @version 0.9.2
 */
class InlineResponse20064DataMarket {
    /**
     * Constructs a new <code>InlineResponse20064DataMarket</code>.
     * Market of the notation.
     * @alias module:model/InlineResponse20064DataMarket
     */
    constructor() { 
        
        InlineResponse20064DataMarket.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20064DataMarket</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20064DataMarket} obj Optional instance to populate.
     * @return {module:model/InlineResponse20064DataMarket} The populated <code>InlineResponse20064DataMarket</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20064DataMarket();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the market.
 * @member {Number} id
 */
InlineResponse20064DataMarket.prototype['id'] = undefined;

/**
 * Name of the market.
 * @member {String} name
 */
InlineResponse20064DataMarket.prototype['name'] = undefined;






export default InlineResponse20064DataMarket;

