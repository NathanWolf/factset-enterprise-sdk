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
 * The ErrorResponseSubErrors model module.
 * @module model/ErrorResponseSubErrors
 * @version 0.8.2
 */
class ErrorResponseSubErrors {
    /**
     * Constructs a new <code>ErrorResponseSubErrors</code>.
     * subErrors related to the error message. Null if not applicable.
     * @alias module:model/ErrorResponseSubErrors
     */
    constructor() { 
        
        ErrorResponseSubErrors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorResponseSubErrors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorResponseSubErrors} obj Optional instance to populate.
     * @return {module:model/ErrorResponseSubErrors} The populated <code>ErrorResponseSubErrors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorResponseSubErrors();

            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('field')) {
                obj['field'] = ApiClient.convertToType(data['field'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('rejectedValue')) {
                obj['rejectedValue'] = ApiClient.convertToType(data['rejectedValue'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * the operation ID
 * @member {String} object
 */
ErrorResponseSubErrors.prototype['object'] = undefined;

/**
 * Parameter Field Name
 * @member {String} field
 */
ErrorResponseSubErrors.prototype['field'] = undefined;

/**
 * Error message
 * @member {String} message
 */
ErrorResponseSubErrors.prototype['message'] = undefined;

/**
 * Rejected Values in an Array
 * @member {Array.<String>} rejectedValue
 */
ErrorResponseSubErrors.prototype['rejectedValue'] = undefined;






export default ErrorResponseSubErrors;

