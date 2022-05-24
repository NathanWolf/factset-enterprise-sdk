/**
 * PA Engine API
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
import ColumnSummary from './ColumnSummary';

/**
 * The ColumnSummaryRoot model module.
 * @module model/ColumnSummaryRoot
 * @version 0.20.0
 */
class ColumnSummaryRoot {
    /**
     * Constructs a new <code>ColumnSummaryRoot</code>.
     * @alias module:model/ColumnSummaryRoot
     * @param data {Object.<String, module:model/ColumnSummary>} 
     */
    constructor(data) { 
        
        ColumnSummaryRoot.initialize(this, data);
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
     * Constructs a <code>ColumnSummaryRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColumnSummaryRoot} obj Optional instance to populate.
     * @return {module:model/ColumnSummaryRoot} The populated <code>ColumnSummaryRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColumnSummaryRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': ColumnSummary});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/ColumnSummary>} data
 */
ColumnSummaryRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
ColumnSummaryRoot.prototype['meta'] = undefined;






export default ColumnSummaryRoot;

