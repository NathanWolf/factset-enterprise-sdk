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
 * The InlineResponse2004InstrumentIndustryClassificationRbicsLevel4 model module.
 * @module model/InlineResponse2004InstrumentIndustryClassificationRbicsLevel4
 * @version 0.9.2
 */
class InlineResponse2004InstrumentIndustryClassificationRbicsLevel4 {
    /**
     * Constructs a new <code>InlineResponse2004InstrumentIndustryClassificationRbicsLevel4</code>.
     * Industry group level of classification.
     * @alias module:model/InlineResponse2004InstrumentIndustryClassificationRbicsLevel4
     */
    constructor() { 
        
        InlineResponse2004InstrumentIndustryClassificationRbicsLevel4.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004InstrumentIndustryClassificationRbicsLevel4</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004InstrumentIndustryClassificationRbicsLevel4} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004InstrumentIndustryClassificationRbicsLevel4} The populated <code>InlineResponse2004InstrumentIndustryClassificationRbicsLevel4</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004InstrumentIndustryClassificationRbicsLevel4();

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
 * Identifier of the category.
 * @member {Number} id
 */
InlineResponse2004InstrumentIndustryClassificationRbicsLevel4.prototype['id'] = undefined;

/**
 * Name of the category.
 * @member {String} name
 */
InlineResponse2004InstrumentIndustryClassificationRbicsLevel4.prototype['name'] = undefined;






export default InlineResponse2004InstrumentIndustryClassificationRbicsLevel4;

