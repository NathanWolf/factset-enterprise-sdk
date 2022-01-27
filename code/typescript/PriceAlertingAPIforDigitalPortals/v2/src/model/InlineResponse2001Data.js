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
import InlineResponse2001Trigger from './InlineResponse2001Trigger';
import InlineResponse200DataPrice from './InlineResponse200DataPrice';

/**
 * The InlineResponse2001Data model module.
 * @module model/InlineResponse2001Data
 * @version 0.9.0
 */
class InlineResponse2001Data {
    /**
     * Constructs a new <code>InlineResponse2001Data</code>.
     * @alias module:model/InlineResponse2001Data
     */
    constructor() { 
        
        InlineResponse2001Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001Data} The populated <code>InlineResponse2001Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('creation')) {
                obj['creation'] = ApiClient.convertToType(data['creation'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = InlineResponse200DataPrice.constructFromObject(data['price']);
            }
            if (data.hasOwnProperty('trigger')) {
                obj['trigger'] = InlineResponse2001Trigger.constructFromObject(data['trigger']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the alert.
 * @member {String} id
 */
InlineResponse2001Data.prototype['id'] = undefined;

/**
 * Date and time when the alert was created.
 * @member {String} creation
 */
InlineResponse2001Data.prototype['creation'] = undefined;

/**
 * @member {module:model/InlineResponse200DataPrice} price
 */
InlineResponse2001Data.prototype['price'] = undefined;

/**
 * @member {module:model/InlineResponse2001Trigger} trigger
 */
InlineResponse2001Data.prototype['trigger'] = undefined;






export default InlineResponse2001Data;

