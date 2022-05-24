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
 * The InlineResponse2005DataIssuerJuristicPerson model module.
 * @module model/InlineResponse2005DataIssuerJuristicPerson
 * @version 0.10.0
 */
class InlineResponse2005DataIssuerJuristicPerson {
    /**
     * Constructs a new <code>InlineResponse2005DataIssuerJuristicPerson</code>.
     * @alias module:model/InlineResponse2005DataIssuerJuristicPerson
     */
    constructor() { 
        
        InlineResponse2005DataIssuerJuristicPerson.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataIssuerJuristicPerson</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataIssuerJuristicPerson} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataIssuerJuristicPerson} The populated <code>InlineResponse2005DataIssuerJuristicPerson</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataIssuerJuristicPerson();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of an issuer.
 * @member {Number} id
 */
InlineResponse2005DataIssuerJuristicPerson.prototype['id'] = undefined;

/**
 * Name of the issuer.
 * @member {String} name
 */
InlineResponse2005DataIssuerJuristicPerson.prototype['name'] = undefined;

/**
 * Number of notations
 * @member {Number} count
 */
InlineResponse2005DataIssuerJuristicPerson.prototype['count'] = undefined;






export default InlineResponse2005DataIssuerJuristicPerson;

