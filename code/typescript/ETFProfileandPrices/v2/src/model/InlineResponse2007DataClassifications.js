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
 * The InlineResponse2007DataClassifications model module.
 * @module model/InlineResponse2007DataClassifications
 * @version 0.10.0
 */
class InlineResponse2007DataClassifications {
    /**
     * Constructs a new <code>InlineResponse2007DataClassifications</code>.
     * @alias module:model/InlineResponse2007DataClassifications
     */
    constructor() { 
        
        InlineResponse2007DataClassifications.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataClassifications</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataClassifications} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataClassifications} The populated <code>InlineResponse2007DataClassifications</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataClassifications();

            if (data.hasOwnProperty('classification')) {
                obj['classification'] = ApiClient.convertToType(data['classification'], 'String');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Name of the classification.
 * @member {String} classification
 */
InlineResponse2007DataClassifications.prototype['classification'] = undefined;

/**
 * Weight (net) of the classification.
 * @member {Number} weight
 */
InlineResponse2007DataClassifications.prototype['weight'] = undefined;






export default InlineResponse2007DataClassifications;

