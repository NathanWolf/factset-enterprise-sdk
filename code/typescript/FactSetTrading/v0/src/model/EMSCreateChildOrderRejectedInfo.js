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

/**
 * The EMSCreateChildOrderRejectedInfo model module.
 * @module model/EMSCreateChildOrderRejectedInfo
 */
class EMSCreateChildOrderRejectedInfo {
    /**
     * Constructs a new <code>EMSCreateChildOrderRejectedInfo</code>.
     * @alias module:model/EMSCreateChildOrderRejectedInfo
     */
    constructor() { 
        
        EMSCreateChildOrderRejectedInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EMSCreateChildOrderRejectedInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSCreateChildOrderRejectedInfo} obj Optional instance to populate.
     * @return {module:model/EMSCreateChildOrderRejectedInfo} The populated <code>EMSCreateChildOrderRejectedInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSCreateChildOrderRejectedInfo();

            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('basketId')) {
                obj['basketId'] = ApiClient.convertToType(data['basketId'], 'String');
            }
            if (data.hasOwnProperty('ticketId')) {
                obj['ticketId'] = ApiClient.convertToType(data['ticketId'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Reason for rejection
 * @member {String} message
 */
EMSCreateChildOrderRejectedInfo.prototype['message'] = undefined;

/**
 * Unique identifier assigned to basket order
 * @member {String} basketId
 */
EMSCreateChildOrderRejectedInfo.prototype['basketId'] = undefined;

/**
 * Ticket Id for the child order
 * @member {String} ticketId
 */
EMSCreateChildOrderRejectedInfo.prototype['ticketId'] = undefined;

/**
 * Ticker symbol
 * @member {String} symbol
 */
EMSCreateChildOrderRejectedInfo.prototype['symbol'] = undefined;






export default EMSCreateChildOrderRejectedInfo;

