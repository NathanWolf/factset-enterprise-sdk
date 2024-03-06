/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AccountsForJobAddProp model module.
 * @module model/AccountsForJobAddProp
 */
class AccountsForJobAddProp {
    /**
     * Constructs a new <code>AccountsForJobAddProp</code>.
     * The details of the account under the task in the object key
     * @alias module:model/AccountsForJobAddProp
     */
    constructor() { 
        
        AccountsForJobAddProp.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AccountsForJobAddProp</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AccountsForJobAddProp} obj Optional instance to populate.
     * @return {module:model/AccountsForJobAddProp} The populated <code>AccountsForJobAddProp</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AccountsForJobAddProp();

            if (data.hasOwnProperty('includeParent')) {
                obj['includeParent'] = ApiClient.convertToType(data['includeParent'], 'Boolean');
            }
            if (data.hasOwnProperty('isSplit')) {
                obj['isSplit'] = ApiClient.convertToType(data['isSplit'], 'Boolean');
            }
            if (data.hasOwnProperty('latestComponentsOnly')) {
                obj['latestComponentsOnly'] = ApiClient.convertToType(data['latestComponentsOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = ApiClient.convertToType(data['level'], 'String');
            }
            if (data.hasOwnProperty('portfolioId')) {
                obj['portfolioId'] = ApiClient.convertToType(data['portfolioId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true
 * @member {Boolean} includeParent
 */
AccountsForJobAddProp.prototype['includeParent'] = undefined;

/**
 * Indicates whether the portfolio's components if any would be treated as individual portfolios when the job is run
 * @member {Boolean} isSplit
 */
AccountsForJobAddProp.prototype['isSplit'] = undefined;

/**
 * When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \"Latest,\" it will not return components where the end date occurs before Latest.
 * @member {Boolean} latestComponentsOnly
 */
AccountsForJobAddProp.prototype['latestComponentsOnly'] = undefined;

/**
 * The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \"1\" means only the first level will be expanded. \"all\" will be the value if all levels are expanded down.
 * @member {String} level
 */
AccountsForJobAddProp.prototype['level'] = undefined;

/**
 * The full file path including portfolio name and type
 * @member {String} portfolioId
 */
AccountsForJobAddProp.prototype['portfolioId'] = undefined;






export default AccountsForJobAddProp;

