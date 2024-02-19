/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
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
import Level1RequestBody from './Level1RequestBody';

/**
 * The LeveloneRequest model module.
 * @module model/LeveloneRequest
 */
class LeveloneRequest {
    /**
     * Constructs a new <code>LeveloneRequest</code>.
     * Level1 request body elements
     * @alias module:model/LeveloneRequest
     * @param data {module:model/Level1RequestBody} 
     */
    constructor(data) { 
        
        LeveloneRequest.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>LeveloneRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LeveloneRequest} obj Optional instance to populate.
     * @return {module:model/LeveloneRequest} The populated <code>LeveloneRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LeveloneRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = Level1RequestBody.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Level1RequestBody} data
 */
LeveloneRequest.prototype['data'] = undefined;






export default LeveloneRequest;

