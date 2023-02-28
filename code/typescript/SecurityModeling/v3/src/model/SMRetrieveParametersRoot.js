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
import SMRetrieveParameters from './SMRetrieveParameters';

/**
 * The SMRetrieveParametersRoot model module.
 * @module model/SMRetrieveParametersRoot
 */
class SMRetrieveParametersRoot {
    /**
     * Constructs a new <code>SMRetrieveParametersRoot</code>.
     * @alias module:model/SMRetrieveParametersRoot
     * @param data {Array.<module:model/SMRetrieveParameters>} 
     */
    constructor(data) { 
        
        SMRetrieveParametersRoot.initialize(this, data);
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
     * Constructs a <code>SMRetrieveParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SMRetrieveParametersRoot} obj Optional instance to populate.
     * @return {module:model/SMRetrieveParametersRoot} The populated <code>SMRetrieveParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SMRetrieveParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [SMRetrieveParameters]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/SMRetrieveParameters>} data
 */
SMRetrieveParametersRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
SMRetrieveParametersRoot.prototype['meta'] = undefined;






export default SMRetrieveParametersRoot;

