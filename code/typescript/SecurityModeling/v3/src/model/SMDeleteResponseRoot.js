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
import SMDeleteResponse from './SMDeleteResponse';

/**
 * The SMDeleteResponseRoot model module.
 * @module model/SMDeleteResponseRoot
 */
class SMDeleteResponseRoot {
    /**
     * Constructs a new <code>SMDeleteResponseRoot</code>.
     * @alias module:model/SMDeleteResponseRoot
     * @param data {Array.<module:model/SMDeleteResponse>} 
     */
    constructor(data) { 
        
        SMDeleteResponseRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>SMDeleteResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SMDeleteResponseRoot} obj Optional instance to populate.
     * @return {module:model/SMDeleteResponseRoot} The populated <code>SMDeleteResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SMDeleteResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [SMDeleteResponse]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/SMDeleteResponse>} data
 */
SMDeleteResponseRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
SMDeleteResponseRoot.prototype['meta'] = undefined;






export default SMDeleteResponseRoot;

