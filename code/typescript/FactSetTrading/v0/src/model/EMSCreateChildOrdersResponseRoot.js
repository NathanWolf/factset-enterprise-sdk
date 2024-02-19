/**
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EMSCreateChildOrdersResponse from './EMSCreateChildOrdersResponse';

/**
 * The EMSCreateChildOrdersResponseRoot model module.
 * @module model/EMSCreateChildOrdersResponseRoot
 */
class EMSCreateChildOrdersResponseRoot {
    /**
     * Constructs a new <code>EMSCreateChildOrdersResponseRoot</code>.
     * EMS Response
     * @alias module:model/EMSCreateChildOrdersResponseRoot
     * @param data {module:model/EMSCreateChildOrdersResponse} 
     */
    constructor(data) { 
        
        EMSCreateChildOrdersResponseRoot.initialize(this, data);
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
     * Constructs a <code>EMSCreateChildOrdersResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSCreateChildOrdersResponseRoot} obj Optional instance to populate.
     * @return {module:model/EMSCreateChildOrdersResponseRoot} The populated <code>EMSCreateChildOrdersResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSCreateChildOrdersResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = EMSCreateChildOrdersResponse.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/EMSCreateChildOrdersResponse} data
 */
EMSCreateChildOrdersResponseRoot.prototype['data'] = undefined;






export default EMSCreateChildOrdersResponseRoot;

