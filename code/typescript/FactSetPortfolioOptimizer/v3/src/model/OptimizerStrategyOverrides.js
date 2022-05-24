/**
 * FPO API
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

/**
 * The OptimizerStrategyOverrides model module.
 * @module model/OptimizerStrategyOverrides
 * @version 0.20.0
 */
class OptimizerStrategyOverrides {
    /**
     * Constructs a new <code>OptimizerStrategyOverrides</code>.
     * @alias module:model/OptimizerStrategyOverrides
     */
    constructor() { 
        
        OptimizerStrategyOverrides.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerStrategyOverrides</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerStrategyOverrides} obj Optional instance to populate.
     * @return {module:model/OptimizerStrategyOverrides} The populated <code>OptimizerStrategyOverrides</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerStrategyOverrides();

            if (data.hasOwnProperty('tax')) {
                obj['tax'] = ApiClient.convertToType(data['tax'], 'String');
            }
            if (data.hasOwnProperty('objective')) {
                obj['objective'] = ApiClient.convertToType(data['objective'], 'String');
            }
            if (data.hasOwnProperty('constraints')) {
                obj['constraints'] = ApiClient.convertToType(data['constraints'], {'String': 'String'});
            }
            if (data.hasOwnProperty('alpha')) {
                obj['alpha'] = ApiClient.convertToType(data['alpha'], 'String');
            }
            if (data.hasOwnProperty('transactionCost')) {
                obj['transactionCost'] = ApiClient.convertToType(data['transactionCost'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Tax
 * @member {String} tax
 */
OptimizerStrategyOverrides.prototype['tax'] = undefined;

/**
 * Objective
 * @member {String} objective
 */
OptimizerStrategyOverrides.prototype['objective'] = undefined;

/**
 * List of constraints
 * @member {Object.<String, module:model/OptimizerStrategyOverrides.InnerEnum>} constraints
 */
OptimizerStrategyOverrides.prototype['constraints'] = undefined;

/**
 * Alpha
 * @member {String} alpha
 */
OptimizerStrategyOverrides.prototype['alpha'] = undefined;

/**
 * Transaction cost
 * @member {String} transactionCost
 */
OptimizerStrategyOverrides.prototype['transactionCost'] = undefined;





/**
 * Allowed values for the <code>inner</code> property.
 * @enum {String}
 * @readonly
 */
OptimizerStrategyOverrides['InnerEnum'] = {

    /**
     * value: "Disable"
     * @const
     */
    "Disable": "Disable",

    /**
     * value: "Enable"
     * @const
     */
    "Enable": "Enable"
};



export default OptimizerStrategyOverrides;

