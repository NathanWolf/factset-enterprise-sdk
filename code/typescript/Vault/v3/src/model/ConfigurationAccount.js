/**
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ConfigurationAccount model module.
 * @module model/ConfigurationAccount
 * @version 0.20.0
 */
class ConfigurationAccount {
    /**
     * Constructs a new <code>ConfigurationAccount</code>.
     * @alias module:model/ConfigurationAccount
     */
    constructor() { 
        
        ConfigurationAccount.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConfigurationAccount</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConfigurationAccount} obj Optional instance to populate.
     * @return {module:model/ConfigurationAccount} The populated <code>ConfigurationAccount</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigurationAccount();

            if (data.hasOwnProperty('benchmarkCode')) {
                obj['benchmarkCode'] = ApiClient.convertToType(data['benchmarkCode'], 'String');
            }
            if (data.hasOwnProperty('benchmarkName')) {
                obj['benchmarkName'] = ApiClient.convertToType(data['benchmarkName'], 'String');
            }
            if (data.hasOwnProperty('maxEndDate')) {
                obj['maxEndDate'] = ApiClient.convertToType(data['maxEndDate'], 'String');
            }
            if (data.hasOwnProperty('minStartDate')) {
                obj['minStartDate'] = ApiClient.convertToType(data['minStartDate'], 'String');
            }
            if (data.hasOwnProperty('lockingDate')) {
                obj['lockingDate'] = ApiClient.convertToType(data['lockingDate'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Benchmark code.
 * @member {String} benchmarkCode
 */
ConfigurationAccount.prototype['benchmarkCode'] = undefined;

/**
 * Benchmark name.
 * @member {String} benchmarkName
 */
ConfigurationAccount.prototype['benchmarkName'] = undefined;

/**
 * Maximum end date.
 * @member {String} maxEndDate
 */
ConfigurationAccount.prototype['maxEndDate'] = undefined;

/**
 * Minimum start date.
 * @member {String} minStartDate
 */
ConfigurationAccount.prototype['minStartDate'] = undefined;

/**
 * Locking date.
 * @member {String} lockingDate
 */
ConfigurationAccount.prototype['lockingDate'] = undefined;

/**
 * Account name.
 * @member {String} name
 */
ConfigurationAccount.prototype['name'] = undefined;






export default ConfigurationAccount;

