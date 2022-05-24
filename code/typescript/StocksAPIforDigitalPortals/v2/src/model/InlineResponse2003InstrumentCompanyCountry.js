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
 * The InlineResponse2003InstrumentCompanyCountry model module.
 * @module model/InlineResponse2003InstrumentCompanyCountry
 * @version 0.9.2
 */
class InlineResponse2003InstrumentCompanyCountry {
    /**
     * Constructs a new <code>InlineResponse2003InstrumentCompanyCountry</code>.
     * Country where the head office of the company is located. See endpoint &#x60;/basic/region/country/list&#x60; for possible values.
     * @alias module:model/InlineResponse2003InstrumentCompanyCountry
     */
    constructor() { 
        
        InlineResponse2003InstrumentCompanyCountry.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003InstrumentCompanyCountry</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003InstrumentCompanyCountry} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003InstrumentCompanyCountry} The populated <code>InlineResponse2003InstrumentCompanyCountry</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003InstrumentCompanyCountry();

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
 * Identifier of the country.
 * @member {Number} id
 */
InlineResponse2003InstrumentCompanyCountry.prototype['id'] = undefined;

/**
 * Name of the country.
 * @member {String} name
 */
InlineResponse2003InstrumentCompanyCountry.prototype['name'] = undefined;






export default InlineResponse2003InstrumentCompanyCountry;

