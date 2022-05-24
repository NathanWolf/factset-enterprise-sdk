/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorResponseSubErrors from './ErrorResponseSubErrors';

/**
 * The ErrorResponse model module.
 * @module model/ErrorResponse
 * @version 0.20.0
 */
class ErrorResponse {
    /**
     * Constructs a new <code>ErrorResponse</code>.
     * @alias module:model/ErrorResponse
     */
    constructor() { 
        
        ErrorResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
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

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Date');
            }
            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('subErrors')) {
                obj['subErrors'] = ErrorResponseSubErrors.constructFromObject(data['subErrors']);
            }
        }
        return obj;
    }


}

/**
 * status
 * @member {String} status
 */
ErrorResponse.prototype['status'] = undefined;

/**
 * timestamp in YYYY-MM-DD HH:MM:SS.SSS
 * @member {Date} timestamp
 */
ErrorResponse.prototype['timestamp'] = undefined;

/**
 * The Endpoint path {package}/version/{endpoint}
 * @member {String} path
 */
ErrorResponse.prototype['path'] = undefined;

/**
 * The plain text error message
 * @member {String} message
 */
ErrorResponse.prototype['message'] = undefined;

/**
 * @member {module:model/ErrorResponseSubErrors} subErrors
 */
ErrorResponse.prototype['subErrors'] = undefined;






export default ErrorResponse;

