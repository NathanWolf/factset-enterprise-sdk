/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ActiveJobIDs model module.
 * @module model/ActiveJobIDs
 * @version 0.20.1
 */
class ActiveJobIDs {
    /**
     * Constructs a new <code>ActiveJobIDs</code>.
     * Array of active jobs ids associated with the account
     * @alias module:model/ActiveJobIDs
     */
    constructor() { 
        
        ActiveJobIDs.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ActiveJobIDs</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ActiveJobIDs} obj Optional instance to populate.
     * @return {module:model/ActiveJobIDs} The populated <code>ActiveJobIDs</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ActiveJobIDs();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} id
 */
ActiveJobIDs.prototype['id'] = undefined;






export default ActiveJobIDs;

