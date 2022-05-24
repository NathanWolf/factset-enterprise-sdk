/**
 * Engines API
 * Allow clients to fetch Engines Analytics through APIs.
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
import OptimalPortfolio from './OptimalPortfolio';
import OptimizerOptimalHoldings from './OptimizerOptimalHoldings';
import OptimizerTradesList from './OptimizerTradesList';

/**
 * The OptimizerOutputTypes model module.
 * @module model/OptimizerOutputTypes
 * @version 0.8.2
 */
class OptimizerOutputTypes {
    /**
     * Constructs a new <code>OptimizerOutputTypes</code>.
     * @alias module:model/OptimizerOutputTypes
     */
    constructor() { 
        
        OptimizerOutputTypes.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerOutputTypes</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerOutputTypes} obj Optional instance to populate.
     * @return {module:model/OptimizerOutputTypes} The populated <code>OptimizerOutputTypes</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerOutputTypes();

            if (data.hasOwnProperty('trades')) {
                obj['trades'] = OptimizerTradesList.constructFromObject(data['trades']);
            }
            if (data.hasOwnProperty('optimal')) {
                obj['optimal'] = OptimizerOptimalHoldings.constructFromObject(data['optimal']);
            }
            if (data.hasOwnProperty('account')) {
                obj['account'] = OptimalPortfolio.constructFromObject(data['account']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerTradesList} trades
 */
OptimizerOutputTypes.prototype['trades'] = undefined;

/**
 * @member {module:model/OptimizerOptimalHoldings} optimal
 */
OptimizerOutputTypes.prototype['optimal'] = undefined;

/**
 * @member {module:model/OptimalPortfolio} account
 */
OptimizerOutputTypes.prototype['account'] = undefined;






export default OptimizerOutputTypes;

