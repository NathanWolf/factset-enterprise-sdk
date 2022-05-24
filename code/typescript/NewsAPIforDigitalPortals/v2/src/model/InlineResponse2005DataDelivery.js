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
 * The InlineResponse2005DataDelivery model module.
 * @module model/InlineResponse2005DataDelivery
 * @version 0.10.0
 */
class InlineResponse2005DataDelivery {
    /**
     * Constructs a new <code>InlineResponse2005DataDelivery</code>.
     * Delivery of the distributor.
     * @alias module:model/InlineResponse2005DataDelivery
     */
    constructor() { 
        
        InlineResponse2005DataDelivery.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataDelivery</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataDelivery} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataDelivery} The populated <code>InlineResponse2005DataDelivery</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataDelivery();

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
 * Identifier of the delivery.
 * @member {Number} id
 */
InlineResponse2005DataDelivery.prototype['id'] = undefined;

/**
 * Name of the delivery.
 * @member {String} name
 */
InlineResponse2005DataDelivery.prototype['name'] = undefined;






export default InlineResponse2005DataDelivery;

