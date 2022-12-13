/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse200Components model module.
 * @module model/InlineResponse200Components
 */
class InlineResponse200Components {
    /**
     * Constructs a new <code>InlineResponse200Components</code>.
     * @alias module:model/InlineResponse200Components
     * @param securitySchemes {Object} 
     */
    constructor(securitySchemes) { 
        
        InlineResponse200Components.initialize(this, securitySchemes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, securitySchemes) { 
        obj['securitySchemes'] = securitySchemes;
    }

    /**
     * Constructs a <code>InlineResponse200Components</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200Components} obj Optional instance to populate.
     * @return {module:model/InlineResponse200Components} The populated <code>InlineResponse200Components</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200Components();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], Object);
            }
            if (data.hasOwnProperty('securitySchemes')) {
                obj['securitySchemes'] = ApiClient.convertToType(data['securitySchemes'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} schemas
 */
InlineResponse200Components.prototype['schemas'] = undefined;

/**
 * @member {Object} securitySchemes
 */
InlineResponse200Components.prototype['securitySchemes'] = undefined;






export default InlineResponse200Components;

