/**
 * Axioma Equity API
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
import OptimizerAccountOverrides from './OptimizerAccountOverrides';

/**
 * The OptimizerAccount model module.
 * @module model/OptimizerAccount
 * @version 0.20.0
 */
class OptimizerAccount {
    /**
     * Constructs a new <code>OptimizerAccount</code>.
     * @alias module:model/OptimizerAccount
     */
    constructor() { 
        
        OptimizerAccount.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerAccount</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerAccount} obj Optional instance to populate.
     * @return {module:model/OptimizerAccount} The populated <code>OptimizerAccount</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerAccount();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('overrides')) {
                obj['overrides'] = OptimizerAccountOverrides.constructFromObject(data['overrides']);
            }
        }
        return obj;
    }


}

/**
 * Account path
 * @member {String} id
 */
OptimizerAccount.prototype['id'] = undefined;

/**
 * @member {module:model/OptimizerAccountOverrides} overrides
 */
OptimizerAccount.prototype['overrides'] = undefined;






export default OptimizerAccount;

