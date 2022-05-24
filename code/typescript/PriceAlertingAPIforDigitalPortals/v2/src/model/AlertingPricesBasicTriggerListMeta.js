/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AlertingPricesBasicTriggerListMetaPagination from './AlertingPricesBasicTriggerListMetaPagination';

/**
 * The AlertingPricesBasicTriggerListMeta model module.
 * @module model/AlertingPricesBasicTriggerListMeta
 * @version 0.10.0
 */
class AlertingPricesBasicTriggerListMeta {
    /**
     * Constructs a new <code>AlertingPricesBasicTriggerListMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/AlertingPricesBasicTriggerListMeta
     */
    constructor() { 
        
        AlertingPricesBasicTriggerListMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AlertingPricesBasicTriggerListMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AlertingPricesBasicTriggerListMeta} obj Optional instance to populate.
     * @return {module:model/AlertingPricesBasicTriggerListMeta} The populated <code>AlertingPricesBasicTriggerListMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AlertingPricesBasicTriggerListMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = AlertingPricesBasicTriggerListMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
AlertingPricesBasicTriggerListMeta.prototype['attributes'] = undefined;

/**
 * @member {module:model/AlertingPricesBasicTriggerListMetaPagination} pagination
 */
AlertingPricesBasicTriggerListMeta.prototype['pagination'] = undefined;






export default AlertingPricesBasicTriggerListMeta;

