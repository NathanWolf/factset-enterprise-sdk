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
import InlineResponse2002DataCountries from './InlineResponse2002DataCountries';

/**
 * The InlineResponse2002Data model module.
 * @module model/InlineResponse2002Data
 * @version 0.10.0
 */
class InlineResponse2002Data {
    /**
     * Constructs a new <code>InlineResponse2002Data</code>.
     * ETP country allocation data.
     * @alias module:model/InlineResponse2002Data
     */
    constructor() { 
        
        InlineResponse2002Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2002Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2002Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2002Data} The populated <code>InlineResponse2002Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2002Data();

            if (data.hasOwnProperty('reportDate')) {
                obj['reportDate'] = ApiClient.convertToType(data['reportDate'], 'Date');
            }
            if (data.hasOwnProperty('countries')) {
                obj['countries'] = ApiClient.convertToType(data['countries'], [InlineResponse2002DataCountries]);
            }
        }
        return obj;
    }


}

/**
 * Reporting date for the allocations.
 * @member {Date} reportDate
 */
InlineResponse2002Data.prototype['reportDate'] = undefined;

/**
 * List of allocations by country.
 * @member {Array.<module:model/InlineResponse2002DataCountries>} countries
 */
InlineResponse2002Data.prototype['countries'] = undefined;






export default InlineResponse2002Data;

