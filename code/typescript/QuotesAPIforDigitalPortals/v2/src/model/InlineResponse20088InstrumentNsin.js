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
 * The InlineResponse20088InstrumentNsin model module.
 * @module model/InlineResponse20088InstrumentNsin
 * @version 0.9.0
 */
class InlineResponse20088InstrumentNsin {
    /**
     * Constructs a new <code>InlineResponse20088InstrumentNsin</code>.
     * NSIN data of the instrument.
     * @alias module:model/InlineResponse20088InstrumentNsin
     */
    constructor() { 
        
        InlineResponse20088InstrumentNsin.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20088InstrumentNsin</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20088InstrumentNsin} obj Optional instance to populate.
     * @return {module:model/InlineResponse20088InstrumentNsin} The populated <code>InlineResponse20088InstrumentNsin</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20088InstrumentNsin();

            if (data.hasOwnProperty('wkn')) {
                obj['wkn'] = ApiClient.convertToType(data['wkn'], 'String');
            }
            if (data.hasOwnProperty('valor')) {
                obj['valor'] = ApiClient.convertToType(data['valor'], 'String');
            }
            if (data.hasOwnProperty('cusip')) {
                obj['cusip'] = ApiClient.convertToType(data['cusip'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.
 * @member {String} wkn
 */
InlineResponse20088InstrumentNsin.prototype['wkn'] = undefined;

/**
 * The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.
 * @member {String} valor
 */
InlineResponse20088InstrumentNsin.prototype['valor'] = undefined;

/**
 * The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.
 * @member {String} cusip
 */
InlineResponse20088InstrumentNsin.prototype['cusip'] = undefined;






export default InlineResponse20088InstrumentNsin;

