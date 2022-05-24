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
 * The InlineResponse20036FsymSecurity model module.
 * @module model/InlineResponse20036FsymSecurity
 * @version 0.9.2
 */
class InlineResponse20036FsymSecurity {
    /**
     * Constructs a new <code>InlineResponse20036FsymSecurity</code>.
     * Security-level identifier.
     * @alias module:model/InlineResponse20036FsymSecurity
     */
    constructor() { 
        
        InlineResponse20036FsymSecurity.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20036FsymSecurity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20036FsymSecurity} obj Optional instance to populate.
     * @return {module:model/InlineResponse20036FsymSecurity} The populated <code>InlineResponse20036FsymSecurity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20036FsymSecurity();

            if (data.hasOwnProperty('permanentIdentifier')) {
                obj['permanentIdentifier'] = ApiClient.convertToType(data['permanentIdentifier'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
 * @member {String} permanentIdentifier
 */
InlineResponse20036FsymSecurity.prototype['permanentIdentifier'] = undefined;






export default InlineResponse20036FsymSecurity;

