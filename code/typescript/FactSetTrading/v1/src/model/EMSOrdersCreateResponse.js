/**
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EMSOrderMetadata from './EMSOrderMetadata';

/**
 * The EMSOrdersCreateResponse model module.
 * @module model/EMSOrdersCreateResponse
 * @version 0.20.0
 */
class EMSOrdersCreateResponse {
    /**
     * Constructs a new <code>EMSOrdersCreateResponse</code>.
     * @alias module:model/EMSOrdersCreateResponse
     */
    constructor() { 
        
        EMSOrdersCreateResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EMSOrdersCreateResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSOrdersCreateResponse} obj Optional instance to populate.
     * @return {module:model/EMSOrdersCreateResponse} The populated <code>EMSOrdersCreateResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSOrdersCreateResponse();

            if (data.hasOwnProperty('accepted')) {
                obj['accepted'] = ApiClient.convertToType(data['accepted'], {'String': EMSOrderMetadata});
            }
            if (data.hasOwnProperty('rejected')) {
                obj['rejected'] = ApiClient.convertToType(data['rejected'], {'String': EMSOrderMetadata});
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/EMSOrderMetadata>} accepted
 */
EMSOrdersCreateResponse.prototype['accepted'] = undefined;

/**
 * @member {Object.<String, module:model/EMSOrderMetadata>} rejected
 */
EMSOrdersCreateResponse.prototype['rejected'] = undefined;






export default EMSOrdersCreateResponse;

