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
import OptimizerInputsConstraintGroup from './OptimizerInputsConstraintGroup';
import OptimizerInputsEConstraintLevelEnum from './OptimizerInputsEConstraintLevelEnum';
import OptimizerInputsValue from './OptimizerInputsValue';

/**
 * The OptimizerInputsNumberOfSellsConstraint model module.
 * @module model/OptimizerInputsNumberOfSellsConstraint
 * @version 0.20.0
 */
class OptimizerInputsNumberOfSellsConstraint {
    /**
     * Constructs a new <code>OptimizerInputsNumberOfSellsConstraint</code>.
     * 11
     * @alias module:model/OptimizerInputsNumberOfSellsConstraint
     */
    constructor() { 
        
        OptimizerInputsNumberOfSellsConstraint.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptimizerInputsNumberOfSellsConstraint</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptimizerInputsNumberOfSellsConstraint} obj Optional instance to populate.
     * @return {module:model/OptimizerInputsNumberOfSellsConstraint} The populated <code>OptimizerInputsNumberOfSellsConstraint</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptimizerInputsNumberOfSellsConstraint();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('max')) {
                obj['max'] = OptimizerInputsValue.constructFromObject(data['max']);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [OptimizerInputsConstraintGroup]);
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = OptimizerInputsEConstraintLevelEnum.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('hierarchy')) {
                obj['hierarchy'] = ApiClient.convertToType(data['hierarchy'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
OptimizerInputsNumberOfSellsConstraint.prototype['name'] = undefined;

/**
 * @member {module:model/OptimizerInputsValue} max
 */
OptimizerInputsNumberOfSellsConstraint.prototype['max'] = undefined;

/**
 * @member {Array.<module:model/OptimizerInputsConstraintGroup>} groups
 */
OptimizerInputsNumberOfSellsConstraint.prototype['groups'] = undefined;

/**
 * @member {module:model/OptimizerInputsEConstraintLevelEnum} level
 */
OptimizerInputsNumberOfSellsConstraint.prototype['level'] = undefined;

/**
 * @member {Number} hierarchy
 */
OptimizerInputsNumberOfSellsConstraint.prototype['hierarchy'] = undefined;






export default OptimizerInputsNumberOfSellsConstraint;

