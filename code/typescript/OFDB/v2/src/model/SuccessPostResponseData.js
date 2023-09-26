/**
 * OFDB API
 * OFDB API
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
 * The SuccessPostResponseData model module.
 * @module model/SuccessPostResponseData
 */
class SuccessPostResponseData {
    /**
     * Constructs a new <code>SuccessPostResponseData</code>.
     * @alias module:model/SuccessPostResponseData
     */
    constructor() { 
        
        SuccessPostResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SuccessPostResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SuccessPostResponseData} obj Optional instance to populate.
     * @return {module:model/SuccessPostResponseData} The populated <code>SuccessPostResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SuccessPostResponseData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }


}

/**
 * id of the newly created resource
 * @member {String} id
 */
SuccessPostResponseData.prototype['id'] = undefined;






export default SuccessPostResponseData;

