/**
 * Security-Modeling API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SMError from './SMError';

/**
 * The SMDeleteResponse model module.
 * @module model/SMDeleteResponse
 */
class SMDeleteResponse {
    /**
     * Constructs a new <code>SMDeleteResponse</code>.
     * @alias module:model/SMDeleteResponse
     */
    constructor() { 
        
        SMDeleteResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SMDeleteResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SMDeleteResponse} obj Optional instance to populate.
     * @return {module:model/SMDeleteResponse} The populated <code>SMDeleteResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SMDeleteResponse();

            if (data.hasOwnProperty('securityName')) {
                obj['securityName'] = ApiClient.convertToType(data['securityName'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [SMError]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} securityName
 */
SMDeleteResponse.prototype['securityName'] = undefined;

/**
 * @member {module:model/SMDeleteResponse.StatusEnum} status
 */
SMDeleteResponse.prototype['status'] = undefined;

/**
 * @member {Array.<module:model/SMError>} errors
 */
SMDeleteResponse.prototype['errors'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
SMDeleteResponse['StatusEnum'] = {

    /**
     * value: "success"
     * @const
     */
    "success": "success",

    /**
     * value: "failure"
     * @const
     */
    "failure": "failure"
};



export default SMDeleteResponse;

