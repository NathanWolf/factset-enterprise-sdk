/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ErrorObject model module.
 * @module model/ErrorObject
 */
class ErrorObject {
    /**
     * Constructs a new <code>ErrorObject</code>.
     * error
     * @alias module:model/ErrorObject
     */
    constructor() { 
        
        ErrorObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorObject} obj Optional instance to populate.
     * @return {module:model/ErrorObject} The populated <code>ErrorObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A UUID for this particular occurrence of the problem.
 * @member {String} id
 */
ErrorObject.prototype['id'] = undefined;

/**
 * status
 * @member {String} code
 */
ErrorObject.prototype['code'] = undefined;

/**
 * The plain text error message
 * @member {String} title
 */
ErrorObject.prototype['title'] = undefined;






export default ErrorObject;

