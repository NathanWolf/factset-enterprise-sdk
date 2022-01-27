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
 * The InlineResponse2007DataDistributor model module.
 * @module model/InlineResponse2007DataDistributor
 * @version 0.9.0
 */
class InlineResponse2007DataDistributor {
    /**
     * Constructs a new <code>InlineResponse2007DataDistributor</code>.
     * Distributor of the publisher.
     * @alias module:model/InlineResponse2007DataDistributor
     */
    constructor() { 
        
        InlineResponse2007DataDistributor.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataDistributor</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataDistributor} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataDistributor} The populated <code>InlineResponse2007DataDistributor</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataDistributor();

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
 * Identifier of the distributor.
 * @member {Number} id
 */
InlineResponse2007DataDistributor.prototype['id'] = undefined;

/**
 * Name of the distributor.
 * @member {String} name
 */
InlineResponse2007DataDistributor.prototype['name'] = undefined;






export default InlineResponse2007DataDistributor;

