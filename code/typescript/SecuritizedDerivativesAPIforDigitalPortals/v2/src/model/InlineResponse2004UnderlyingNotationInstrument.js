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
 * The InlineResponse2004UnderlyingNotationInstrument model module.
 * @module model/InlineResponse2004UnderlyingNotationInstrument
 * @version 0.9.0
 */
class InlineResponse2004UnderlyingNotationInstrument {
    /**
     * Constructs a new <code>InlineResponse2004UnderlyingNotationInstrument</code>.
     * Instrument of the underlying.
     * @alias module:model/InlineResponse2004UnderlyingNotationInstrument
     */
    constructor() { 
        
        InlineResponse2004UnderlyingNotationInstrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004UnderlyingNotationInstrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004UnderlyingNotationInstrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004UnderlyingNotationInstrument} The populated <code>InlineResponse2004UnderlyingNotationInstrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004UnderlyingNotationInstrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('typeComposite')) {
                obj['typeComposite'] = ApiClient.convertToType(data['typeComposite'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse2004UnderlyingNotationInstrument.prototype['id'] = undefined;

/**
 * Type of composite instrument, in case the underlying is a composite instrument.
 * @member {module:model/InlineResponse2004UnderlyingNotationInstrument.TypeCompositeEnum} typeComposite
 */
InlineResponse2004UnderlyingNotationInstrument.prototype['typeComposite'] = undefined;





/**
 * Allowed values for the <code>typeComposite</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2004UnderlyingNotationInstrument['TypeCompositeEnum'] = {

    /**
     * value: "basket"
     * @const
     */
    "basket": "basket",

    /**
     * value: "alphaStructure"
     * @const
     */
    "alphaStructure": "alphaStructure",

    /**
     * value: "futuresSpread"
     * @const
     */
    "futuresSpread": "futuresSpread",

    /**
     * value: "factorIndex"
     * @const
     */
    "factorIndex": "factorIndex"
};



export default InlineResponse2004UnderlyingNotationInstrument;

