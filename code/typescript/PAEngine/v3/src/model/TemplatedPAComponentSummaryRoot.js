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
import TemplatedPAComponentSummary from './TemplatedPAComponentSummary';

/**
 * The TemplatedPAComponentSummaryRoot model module.
 * @module model/TemplatedPAComponentSummaryRoot
 * @version 0.20.0
 */
class TemplatedPAComponentSummaryRoot {
    /**
     * Constructs a new <code>TemplatedPAComponentSummaryRoot</code>.
     * @alias module:model/TemplatedPAComponentSummaryRoot
     * @param data {Object.<String, module:model/TemplatedPAComponentSummary>} 
     */
    constructor(data) { 
        
        TemplatedPAComponentSummaryRoot.initialize(this, data);
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
     * Constructs a <code>TemplatedPAComponentSummaryRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TemplatedPAComponentSummaryRoot} obj Optional instance to populate.
     * @return {module:model/TemplatedPAComponentSummaryRoot} The populated <code>TemplatedPAComponentSummaryRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TemplatedPAComponentSummaryRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': TemplatedPAComponentSummary});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/TemplatedPAComponentSummary>} data
 */
TemplatedPAComponentSummaryRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
TemplatedPAComponentSummaryRoot.prototype['meta'] = undefined;






export default TemplatedPAComponentSummaryRoot;

