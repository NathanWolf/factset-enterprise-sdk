/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FactsetTranslationAdvanced from './FactsetTranslationAdvanced';

/**
 * The FactsetTranslationAdvancedResponse model module.
 * @module model/FactsetTranslationAdvancedResponse
 * @version 0.20.0
 */
class FactsetTranslationAdvancedResponse {
    /**
     * Constructs a new <code>FactsetTranslationAdvancedResponse</code>.
     * Response object for FactSet endpoint.
     * @alias module:model/FactsetTranslationAdvancedResponse
     */
    constructor() { 
        
        FactsetTranslationAdvancedResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactsetTranslationAdvancedResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactsetTranslationAdvancedResponse} obj Optional instance to populate.
     * @return {module:model/FactsetTranslationAdvancedResponse} The populated <code>FactsetTranslationAdvancedResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactsetTranslationAdvancedResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [FactsetTranslationAdvanced]);
            }
        }
        return obj;
    }


}

/**
 * Array of symbol translation objects.
 * @member {Array.<module:model/FactsetTranslationAdvanced>} data
 */
FactsetTranslationAdvancedResponse.prototype['data'] = undefined;






export default FactsetTranslationAdvancedResponse;

