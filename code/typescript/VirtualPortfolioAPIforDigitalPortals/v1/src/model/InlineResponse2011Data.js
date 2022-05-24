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
 * The InlineResponse2011Data model module.
 * @module model/InlineResponse2011Data
 * @version 0.9.2
 */
class InlineResponse2011Data {
    /**
     * Constructs a new <code>InlineResponse2011Data</code>.
     * @alias module:model/InlineResponse2011Data
     */
    constructor() { 
        
        InlineResponse2011Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2011Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2011Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2011Data} The populated <code>InlineResponse2011Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2011Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the transaction.
 * @member {String} id
 */
InlineResponse2011Data.prototype['id'] = undefined;






export default InlineResponse2011Data;

