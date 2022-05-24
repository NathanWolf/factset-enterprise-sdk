/**
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: signals.api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorItem from './ErrorItem';

/**
 * The ErrorResponse model module.
 * @module model/ErrorResponse
 * @version 0.20.0
 */
class ErrorResponse {
    /**
     * Constructs a new <code>ErrorResponse</code>.
     * @alias module:model/ErrorResponse
     * @param message {String} A short description of the error.
     */
    constructor(message) { 
        
        ErrorResponse.initialize(this, message);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, message) { 
        obj['message'] = message;
    }

    /**
     * Constructs a <code>ErrorResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorResponse} obj Optional instance to populate.
     * @return {module:model/ErrorResponse} The populated <code>ErrorResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorResponse();

            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [ErrorItem]);
            }
        }
        return obj;
    }


}

/**
 * A short description of the error.
 * @member {String} message
 */
ErrorResponse.prototype['message'] = undefined;

/**
 * Optional list of errors. e.g. Validation errors for multiple parameters
 * @member {Array.<module:model/ErrorItem>} errors
 */
ErrorResponse.prototype['errors'] = undefined;






export default ErrorResponse;

