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
 * The InlineResponse2005DataMarket model module.
 * @module model/InlineResponse2005DataMarket
 * @version 0.9.2
 */
class InlineResponse2005DataMarket {
    /**
     * Constructs a new <code>InlineResponse2005DataMarket</code>.
     * @alias module:model/InlineResponse2005DataMarket
     */
    constructor() { 
        
        InlineResponse2005DataMarket.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataMarket</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataMarket} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataMarket} The populated <code>InlineResponse2005DataMarket</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataMarket();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a market.
 * @member {Number} id
 */
InlineResponse2005DataMarket.prototype['id'] = undefined;

/**
 * Name of the market.
 * @member {String} name
 */
InlineResponse2005DataMarket.prototype['name'] = undefined;

/**
 * Number of notations.
 * @member {Number} count
 */
InlineResponse2005DataMarket.prototype['count'] = undefined;






export default InlineResponse2005DataMarket;

