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
import InlineResponse20070DataNotation from './InlineResponse20070DataNotation';

/**
 * The InlineResponse20070DataListing model module.
 * @module model/InlineResponse20070DataListing
 * @version 0.9.0
 */
class InlineResponse20070DataListing {
    /**
     * Constructs a new <code>InlineResponse20070DataListing</code>.
     * @alias module:model/InlineResponse20070DataListing
     */
    constructor() { 
        
        InlineResponse20070DataListing.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20070DataListing</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20070DataListing} obj Optional instance to populate.
     * @return {module:model/InlineResponse20070DataListing} The populated <code>InlineResponse20070DataListing</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20070DataListing();

            if (data.hasOwnProperty('notation')) {
                obj['notation'] = InlineResponse20070DataNotation.constructFromObject(data['notation']);
            }
            if (data.hasOwnProperty('isPrimary')) {
                obj['isPrimary'] = ApiClient.convertToType(data['isPrimary'], 'Boolean');
            }
            if (data.hasOwnProperty('permanentIdentifier')) {
                obj['permanentIdentifier'] = ApiClient.convertToType(data['permanentIdentifier'], 'String');
            }
            if (data.hasOwnProperty('tickerExchange')) {
                obj['tickerExchange'] = ApiClient.convertToType(data['tickerExchange'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20070DataNotation} notation
 */
InlineResponse20070DataListing.prototype['notation'] = undefined;

/**
 * Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (`true`) or not (`false`).
 * @member {Boolean} isPrimary
 */
InlineResponse20070DataListing.prototype['isPrimary'] = undefined;

/**
 * FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L).
 * @member {String} permanentIdentifier
 */
InlineResponse20070DataListing.prototype['permanentIdentifier'] = undefined;

/**
 * FactSet market symbol of the notation, usually consisting of the ticker (e.g. \"FDS\" for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS).
 * @member {String} tickerExchange
 */
InlineResponse20070DataListing.prototype['tickerExchange'] = undefined;






export default InlineResponse20070DataListing;

