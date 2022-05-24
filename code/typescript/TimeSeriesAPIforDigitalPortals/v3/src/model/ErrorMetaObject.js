/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StatusObject from './StatusObject';

/**
 * The ErrorMetaObject model module.
 * @module model/ErrorMetaObject
 * @version 0.10.0
 */
class ErrorMetaObject {
    /**
     * Constructs a new <code>ErrorMetaObject</code>.
     * @alias module:model/ErrorMetaObject
     */
    constructor() { 
        
        ErrorMetaObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ErrorMetaObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ErrorMetaObject} obj Optional instance to populate.
     * @return {module:model/ErrorMetaObject} The populated <code>ErrorMetaObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ErrorMetaObject();

            if (data.hasOwnProperty('status')) {
                obj['status'] = StatusObject.constructFromObject(data['status']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StatusObject} status
 */
ErrorMetaObject.prototype['status'] = undefined;






export default ErrorMetaObject;

