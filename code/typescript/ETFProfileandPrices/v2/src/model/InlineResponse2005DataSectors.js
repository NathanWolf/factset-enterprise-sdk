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
 * The InlineResponse2005DataSectors model module.
 * @module model/InlineResponse2005DataSectors
 * @version 0.9.0
 */
class InlineResponse2005DataSectors {
    /**
     * Constructs a new <code>InlineResponse2005DataSectors</code>.
     * @alias module:model/InlineResponse2005DataSectors
     */
    constructor() { 
        
        InlineResponse2005DataSectors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataSectors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataSectors} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataSectors} The populated <code>InlineResponse2005DataSectors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataSectors();

            if (data.hasOwnProperty('sector')) {
                obj['sector'] = ApiClient.convertToType(data['sector'], 'String');
            }
            if (data.hasOwnProperty('weight')) {
                obj['weight'] = ApiClient.convertToType(data['weight'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Name of the sector.
 * @member {String} sector
 */
InlineResponse2005DataSectors.prototype['sector'] = undefined;

/**
 * Consolidate weight of the position within the ETP by sector(s).
 * @member {Number} weight
 */
InlineResponse2005DataSectors.prototype['weight'] = undefined;






export default InlineResponse2005DataSectors;

