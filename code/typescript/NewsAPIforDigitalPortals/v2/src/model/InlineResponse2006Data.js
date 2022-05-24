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
import InlineResponse2005DataDelivery from './InlineResponse2005DataDelivery';

/**
 * The InlineResponse2006Data model module.
 * @module model/InlineResponse2006Data
 * @version 0.10.0
 */
class InlineResponse2006Data {
    /**
     * Constructs a new <code>InlineResponse2006Data</code>.
     * @alias module:model/InlineResponse2006Data
     */
    constructor() { 
        
        InlineResponse2006Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006Data} The populated <code>InlineResponse2006Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('delivery')) {
                obj['delivery'] = InlineResponse2005DataDelivery.constructFromObject(data['delivery']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the distributor.
 * @member {Number} id
 */
InlineResponse2006Data.prototype['id'] = undefined;

/**
 * Name of the distributor.
 * @member {String} name
 */
InlineResponse2006Data.prototype['name'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataDelivery} delivery
 */
InlineResponse2006Data.prototype['delivery'] = undefined;






export default InlineResponse2006Data;

