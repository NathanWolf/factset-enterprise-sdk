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

/**
 * The PortfolioTransactionDeleteDataNotation model module.
 * @module model/PortfolioTransactionDeleteDataNotation
 * @version 0.9.0
 */
class PortfolioTransactionDeleteDataNotation {
    /**
     * Constructs a new <code>PortfolioTransactionDeleteDataNotation</code>.
     * Notation of the transaction.
     * @alias module:model/PortfolioTransactionDeleteDataNotation
     * @param id {String} Identifier of the notation
     */
    constructor(id) { 
        
        PortfolioTransactionDeleteDataNotation.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>PortfolioTransactionDeleteDataNotation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PortfolioTransactionDeleteDataNotation} obj Optional instance to populate.
     * @return {module:model/PortfolioTransactionDeleteDataNotation} The populated <code>PortfolioTransactionDeleteDataNotation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PortfolioTransactionDeleteDataNotation();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation
 * @member {String} id
 */
PortfolioTransactionDeleteDataNotation.prototype['id'] = undefined;






export default PortfolioTransactionDeleteDataNotation;

