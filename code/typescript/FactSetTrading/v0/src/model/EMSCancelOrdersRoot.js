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
import EMSCancelOrders from './EMSCancelOrders';

/**
 * The EMSCancelOrdersRoot model module.
 * @module model/EMSCancelOrdersRoot
 */
class EMSCancelOrdersRoot {
    /**
     * Constructs a new <code>EMSCancelOrdersRoot</code>.
     * @alias module:model/EMSCancelOrdersRoot
     */
    constructor() { 
        
        EMSCancelOrdersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EMSCancelOrdersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSCancelOrdersRoot} obj Optional instance to populate.
     * @return {module:model/EMSCancelOrdersRoot} The populated <code>EMSCancelOrdersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSCancelOrdersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = EMSCancelOrders.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/EMSCancelOrders} data
 */
EMSCancelOrdersRoot.prototype['data'] = undefined;






export default EMSCancelOrdersRoot;

