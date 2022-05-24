/**
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import OptimizerInputsNumberOfSellsConstraint from './OptimizerInputsNumberOfSellsConstraint';
import OptimizerInputsOnPeriods from './OptimizerInputsOnPeriods';

/**
 * The OptimizerInputsMPNumberOfSellsConstraint model module.
 * @module model/OptimizerInputsMPNumberOfSellsConstraint
 * @version 0.20.0
 */
class OptimizerInputsMPNumberOfSellsConstraint {
    /**
     * Constructs a new <code>OptimizerInputsMPNumberOfSellsConstraint</code>.
     * @alias module:model/OptimizerInputsMPNumberOfSellsConstraint
     */
    constructor() { 
        
        OptimizerInputsMPNumberOfSellsConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsMPNumberOfSellsConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsMPNumberOfSellsConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsMPNumberOfSellsConstraint} The populated <code>OptimizerInputsMPNumberOfSellsConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsMPNumberOfSellsConstraint();

            if (data.hasOwnProperty('constraint')) {
                obj['constraint'] = OptimizerInputsNumberOfSellsConstraint.constructFromObject(data['constraint']);
            }
            if (data.hasOwnProperty('on_periods')) {
                obj['on_periods'] = OptimizerInputsOnPeriods.constructFromObject(data['on_periods']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OptimizerInputsNumberOfSellsConstraint} constraint
 */
OptimizerInputsMPNumberOfSellsConstraint.prototype['constraint'] = undefined;

/**
 * @member {module:model/OptimizerInputsOnPeriods} on_periods
 */
OptimizerInputsMPNumberOfSellsConstraint.prototype['on_periods'] = undefined;






export default OptimizerInputsMPNumberOfSellsConstraint;

