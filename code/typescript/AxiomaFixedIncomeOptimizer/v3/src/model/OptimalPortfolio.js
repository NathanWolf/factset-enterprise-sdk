/**
 * AFI Optimizer API
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
 * The OptimalPortfolio model module.
 * @module model/OptimalPortfolio
 * @version 0.20.0
 */
class OptimalPortfolio {
    /**
     * Constructs a new <code>OptimalPortfolio</code>.
     * @alias module:model/OptimalPortfolio
     */
    constructor() { 
        
        OptimalPortfolio.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimalPortfolio</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimalPortfolio} obj Optional instance to populate.
     * @return {module:model/OptimalPortfolio} The populated <code>OptimalPortfolio</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimalPortfolio();

            if (data.hasOwnProperty('acctName')) {
                obj['acctName'] = ApiClient.convertToType(data['acctName'], 'String');
            }
            if (data.hasOwnProperty('excludeZero')) {
                obj['excludeZero'] = ApiClient.convertToType(data['excludeZero'], 'Boolean');
            }
            if (data.hasOwnProperty('archiveDate')) {
                obj['archiveDate'] = ApiClient.convertToType(data['archiveDate'], 'String');
            }
            if (data.hasOwnProperty('ifAcctExists')) {
                obj['ifAcctExists'] = ApiClient.convertToType(data['ifAcctExists'], 'String');
            }
            if (data.hasOwnProperty('ifOfdbDateExists')) {
                obj['ifOfdbDateExists'] = ApiClient.convertToType(data['ifOfdbDateExists'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Account path
 * @member {String} acctName
 */
OptimalPortfolio.prototype['acctName'] = undefined;

/**
 * Exclude zero
 * @member {Boolean} excludeZero
 */
OptimalPortfolio.prototype['excludeZero'] = undefined;

/**
 * Archive date
 * @member {String} archiveDate
 */
OptimalPortfolio.prototype['archiveDate'] = undefined;

/**
 * Archive action if account exists
 * @member {module:model/OptimalPortfolio.IfAcctExistsEnum} ifAcctExists
 */
OptimalPortfolio.prototype['ifAcctExists'] = undefined;

/**
 * Action if ofdb date exists
 * @member {module:model/OptimalPortfolio.IfOfdbDateExistsEnum} ifOfdbDateExists
 */
OptimalPortfolio.prototype['ifOfdbDateExists'] = undefined;





/**
 * Allowed values for the <code>ifAcctExists</code> property.
 * @enum {String}
 * @readonly
 */
OptimalPortfolio['IfAcctExistsEnum'] = {

    /**
     * value: "abort"
     * @const
     */
    "abort": "abort",

    /**
     * value: "overwrite"
     * @const
     */
    "overwrite": "overwrite",

    /**
     * value: "appendDate"
     * @const
     */
    "appendDate": "appendDate"
};


/**
 * Allowed values for the <code>ifOfdbDateExists</code> property.
 * @enum {String}
 * @readonly
 */
OptimalPortfolio['IfOfdbDateExistsEnum'] = {

    /**
     * value: "abort"
     * @const
     */
    "abort": "abort",

    /**
     * value: "replaceDate"
     * @const
     */
    "replaceDate": "replaceDate",

    /**
     * value: "appendSecurities"
     * @const
     */
    "appendSecurities": "appendSecurities"
};



export default OptimalPortfolio;

