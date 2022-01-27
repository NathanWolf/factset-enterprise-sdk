/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types. various market symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN,  SEDOL, Tickers, and Bloomberg FIGIs.   Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly  harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time. Additionally, the Symbology API provides  translation of market ids into Bloomberg FIGI. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CusipHistoryTranslation model module.
 * @module model/CusipHistoryTranslation
 * @version 0.8.0
 */
class CusipHistoryTranslation {
    /**
     * Constructs a new <code>CusipHistoryTranslation</code>.
     * CUISP history Translation data object.
     * @alias module:model/CusipHistoryTranslation
     */
    constructor() { 
        
        CusipHistoryTranslation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CusipHistoryTranslation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CusipHistoryTranslation} obj Optional instance to populate.
     * @return {module:model/CusipHistoryTranslation} The populated <code>CusipHistoryTranslation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CusipHistoryTranslation();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('cusip')) {
                obj['cusip'] = ApiClient.convertToType(data['cusip'], 'String');
            }
            if (data.hasOwnProperty('cusipEffectiveStartDate')) {
                obj['cusipEffectiveStartDate'] = ApiClient.convertToType(data['cusipEffectiveStartDate'], 'Date');
            }
            if (data.hasOwnProperty('cusipEffectiveEndDate')) {
                obj['cusipEffectiveEndDate'] = ApiClient.convertToType(data['cusipEffectiveEndDate'], 'Date');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymId
 */
CusipHistoryTranslation.prototype['fsymId'] = undefined;

/**
 * Proper Name of company or issuer.
 * @member {String} name
 */
CusipHistoryTranslation.prototype['name'] = undefined;

/**
 * CUSIP with Check Digit
 * @member {String} cusip
 */
CusipHistoryTranslation.prototype['cusip'] = undefined;

/**
 * CUSIP effective start date in YYYY-MM-DD format.
 * @member {Date} cusipEffectiveStartDate
 */
CusipHistoryTranslation.prototype['cusipEffectiveStartDate'] = undefined;

/**
 * CUSIP effective end date in YYYY-MM-DD format. Null if still active.
 * @member {Date} cusipEffectiveEndDate
 */
CusipHistoryTranslation.prototype['cusipEffectiveEndDate'] = undefined;

/**
 * Identifier specified in the request
 * @member {String} requestId
 */
CusipHistoryTranslation.prototype['requestId'] = undefined;






export default CusipHistoryTranslation;

