/**
 * Barra Portfolio Optimizer API
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
 * The ConstraintAction model module.
 * @module model/ConstraintAction
 * @version 0.9.0
 */
class ConstraintAction {
    /**
     * Constructs a new <code>ConstraintAction</code>.
     * @alias module:model/ConstraintAction
     */
    constructor() { 
        
        ConstraintAction.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConstraintAction</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConstraintAction} obj Optional instance to populate.
     * @return {module:model/ConstraintAction} The populated <code>ConstraintAction</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConstraintAction();

            if (data.hasOwnProperty('item1')) {
                obj['item1'] = ApiClient.convertToType(data['item1'], 'String');
            }
            if (data.hasOwnProperty('item2')) {
                obj['item2'] = ApiClient.convertToType(data['item2'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} item1
 */
ConstraintAction.prototype['item1'] = undefined;

/**
 * @member {module:model/ConstraintAction.Item2Enum} item2
 */
ConstraintAction.prototype['item2'] = undefined;





/**
 * Allowed values for the <code>item2</code> property.
 * @enum {String}
 * @readonly
 */
ConstraintAction['Item2Enum'] = {

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



export default ConstraintAction;

