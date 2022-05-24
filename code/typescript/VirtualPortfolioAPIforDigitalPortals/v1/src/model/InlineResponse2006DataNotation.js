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
import InlineResponse2006DataNotationPrice from './InlineResponse2006DataNotationPrice';

/**
 * The InlineResponse2006DataNotation model module.
 * @module model/InlineResponse2006DataNotation
 * @version 0.9.2
 */
class InlineResponse2006DataNotation {
    /**
     * Constructs a new <code>InlineResponse2006DataNotation</code>.
     * Notation of the transaction establishing the position, i.e. its first transaction.
     * @alias module:model/InlineResponse2006DataNotation
     */
    constructor() { 
        
        InlineResponse2006DataNotation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006DataNotation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006DataNotation} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006DataNotation} The populated <code>InlineResponse2006DataNotation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006DataNotation();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = InlineResponse2006DataNotationPrice.constructFromObject(data['price']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse2006DataNotation.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataNotationPrice} price
 */
InlineResponse2006DataNotation.prototype['price'] = undefined;






export default InlineResponse2006DataNotation;

