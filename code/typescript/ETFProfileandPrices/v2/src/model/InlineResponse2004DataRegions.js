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
 * The InlineResponse2004DataRegions model module.
 * @module model/InlineResponse2004DataRegions
 * @version 0.9.0
 */
class InlineResponse2004DataRegions {
    /**
     * Constructs a new <code>InlineResponse2004DataRegions</code>.
     * @alias module:model/InlineResponse2004DataRegions
     */
    constructor() { 
        
        InlineResponse2004DataRegions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataRegions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataRegions} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataRegions} The populated <code>InlineResponse2004DataRegions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataRegions();

            if (data.hasOwnProperty('region')) {
                obj['region'] = ApiClient.convertToType(data['region'], 'String');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Name of the region.
 * @member {String} region
 */
InlineResponse2004DataRegions.prototype['region'] = undefined;

/**
 * Consolidate weight of the position within the ETP by region(s)..
 * @member {Number} weight
 */
InlineResponse2004DataRegions.prototype['weight'] = undefined;






export default InlineResponse2004DataRegions;

