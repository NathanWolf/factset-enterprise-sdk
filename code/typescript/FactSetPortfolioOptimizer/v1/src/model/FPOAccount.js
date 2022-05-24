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
import OptimizerAccountOverrides from './OptimizerAccountOverrides';
import PaDoc from './PaDoc';

/**
 * The FPOAccount model module.
 * @module model/FPOAccount
 * @version 0.8.2
 */
class FPOAccount {
    /**
     * Constructs a new <code>FPOAccount</code>.
     * @alias module:model/FPOAccount
     * @param padocument {module:model/PaDoc} 
     */
    constructor(padocument) { 
        
        FPOAccount.initialize(this, padocument);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, padocument) { 
        obj['padocument'] = padocument;
    }

    /**
     * Constructs a <code>FPOAccount</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FPOAccount} obj Optional instance to populate.
     * @return {module:model/FPOAccount} The populated <code>FPOAccount</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FPOAccount();

            if (data.hasOwnProperty('padocument')) {
                obj['padocument'] = PaDoc.constructFromObject(data['padocument']);
            }
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
 * @member {module:model/PaDoc} padocument
 */
FPOAccount.prototype['padocument'] = undefined;

/**
 * Account path
 * @member {String} id
 */
FPOAccount.prototype['id'] = undefined;

/**
 * @member {module:model/OptimizerAccountOverrides} overrides
 */
FPOAccount.prototype['overrides'] = undefined;






export default FPOAccount;

