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
 * The InlineResponse2004Nsin model module.
 * @module model/InlineResponse2004Nsin
 * @version 0.9.2
 */
class InlineResponse2004Nsin {
    /**
     * Constructs a new <code>InlineResponse2004Nsin</code>.
     * NSIN data of the notation.
     * @alias module:model/InlineResponse2004Nsin
     */
    constructor() { 
        
        InlineResponse2004Nsin.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Nsin</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Nsin} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Nsin} The populated <code>InlineResponse2004Nsin</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Nsin();

            if (data.hasOwnProperty('sedol')) {
                obj['sedol'] = ApiClient.convertToType(data['sedol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The SEDOL or IDII for the notation.
 * @member {String} sedol
 */
InlineResponse2004Nsin.prototype['sedol'] = undefined;






export default InlineResponse2004Nsin;

