/**
 * AI Text Summarization
 * AI Text Summarization
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InternalServerErrorResponse model module.
 * @module model/InternalServerErrorResponse
 * @version 0.20.0
 */
class InternalServerErrorResponse {
    /**
     * Constructs a new <code>InternalServerErrorResponse</code>.
     * @alias module:model/InternalServerErrorResponse
     */
    constructor() { 
        
        InternalServerErrorResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InternalServerErrorResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InternalServerErrorResponse} obj Optional instance to populate.
     * @return {module:model/InternalServerErrorResponse} The populated <code>InternalServerErrorResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InternalServerErrorResponse();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Type of exception that occured.
 * @member {String} type
 */
InternalServerErrorResponse.prototype['type'] = undefined;

/**
 * The route for which the exception occured.
 * @member {String} status
 */
InternalServerErrorResponse.prototype['status'] = undefined;

/**
 * The verbose message for the exception.
 * @member {String} message
 */
InternalServerErrorResponse.prototype['message'] = undefined;






export default InternalServerErrorResponse;

