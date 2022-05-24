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
 * The InlineResponse2007DataOperatingMIC model module.
 * @module model/InlineResponse2007DataOperatingMIC
 * @version 0.10.0
 */
class InlineResponse2007DataOperatingMIC {
    /**
     * Constructs a new <code>InlineResponse2007DataOperatingMIC</code>.
     * The operating MIC of the underlying. See endpoint &#x60;/basic/mic/operating/list&#x60; for possible values.
     * @alias module:model/InlineResponse2007DataOperatingMIC
     */
    constructor() { 
        
        InlineResponse2007DataOperatingMIC.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataOperatingMIC</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataOperatingMIC} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataOperatingMIC} The populated <code>InlineResponse2007DataOperatingMIC</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataOperatingMIC();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('isoCode')) {
                obj['isoCode'] = ApiClient.convertToType(data['isoCode'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the operating MIC.
 * @member {Number} id
 */
InlineResponse2007DataOperatingMIC.prototype['id'] = undefined;

/**
 * ISO 10383 code of the operating MIC.
 * @member {String} isoCode
 */
InlineResponse2007DataOperatingMIC.prototype['isoCode'] = undefined;

/**
 * English name of the operating MIC.
 * @member {String} name
 */
InlineResponse2007DataOperatingMIC.prototype['name'] = undefined;






export default InlineResponse2007DataOperatingMIC;

