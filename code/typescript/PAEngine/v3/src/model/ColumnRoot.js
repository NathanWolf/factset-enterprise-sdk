/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Column from './Column';

/**
 * The ColumnRoot model module.
 * @module model/ColumnRoot
 */
class ColumnRoot {
    /**
     * Constructs a new <code>ColumnRoot</code>.
     * @alias module:model/ColumnRoot
     * @param data {module:model/Column} 
     */
    constructor(data) { 
        
        ColumnRoot.initialize(this, data);
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
     * Constructs a <code>ColumnRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColumnRoot} obj Optional instance to populate.
     * @return {module:model/ColumnRoot} The populated <code>ColumnRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColumnRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = Column.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Column} data
 */
ColumnRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
ColumnRoot.prototype['meta'] = undefined;






export default ColumnRoot;

