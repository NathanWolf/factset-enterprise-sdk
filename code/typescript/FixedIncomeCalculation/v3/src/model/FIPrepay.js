/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FIPrepay model module.
 * @module model/FIPrepay
 */
class FIPrepay {
    /**
     * Constructs a new <code>FIPrepay</code>.
     * @alias module:model/FIPrepay
     */
    constructor() { 
        
        FIPrepay.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIPrepay</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIPrepay} obj Optional instance to populate.
     * @return {module:model/FIPrepay} The populated <code>FIPrepay</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIPrepay();

            if (data.hasOwnProperty('prepayName')) {
                obj['prepayName'] = ApiClient.convertToType(data['prepayName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Prepay Name
 * @member {String} prepayName
 */
FIPrepay.prototype['prepayName'] = undefined;






export default FIPrepay;

