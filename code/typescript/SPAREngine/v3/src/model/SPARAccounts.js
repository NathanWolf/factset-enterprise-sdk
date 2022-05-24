/**
 * SPAR Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ReturnType from './ReturnType';

/**
 * The SPARAccounts model module.
 * @module model/SPARAccounts
 * @version 0.20.0
 */
class SPARAccounts {
    /**
     * Constructs a new <code>SPARAccounts</code>.
     * @alias module:model/SPARAccounts
     */
    constructor() { 
        
        SPARAccounts.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SPARAccounts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SPARAccounts} obj Optional instance to populate.
     * @return {module:model/SPARAccounts} The populated <code>SPARAccounts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SPARAccounts();

            if (data.hasOwnProperty('returnsType')) {
                obj['returnsType'] = ApiClient.convertToType(data['returnsType'], [ReturnType]);
            }
        }
        return obj;
    }


}

/**
 * List of SPAR returnsType
 * @member {Array.<module:model/ReturnType>} returnsType
 */
SPARAccounts.prototype['returnsType'] = undefined;






export default SPARAccounts;

