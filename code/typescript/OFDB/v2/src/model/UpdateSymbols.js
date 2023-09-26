/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateSymbolsData from './UpdateSymbolsData';

/**
 * The UpdateSymbols model module.
 * @module model/UpdateSymbols
 */
class UpdateSymbols {
    /**
     * Constructs a new <code>UpdateSymbols</code>.
     * Any arbitrary set of fields that are provided while creating the ofdb and their values.
     * @alias module:model/UpdateSymbols
     */
    constructor() { 
        
        UpdateSymbols.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateSymbols</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateSymbols} obj Optional instance to populate.
     * @return {module:model/UpdateSymbols} The populated <code>UpdateSymbols</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateSymbols();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [UpdateSymbolsData]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/UpdateSymbolsData>} data
 */
UpdateSymbols.prototype['data'] = undefined;






export default UpdateSymbols;

