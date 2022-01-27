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
import UnlinkedPATemplateSummary from './UnlinkedPATemplateSummary';

/**
 * The UnlinkedPATemplateSummaryRoot model module.
 * @module model/UnlinkedPATemplateSummaryRoot
 * @version 0.9.0
 */
class UnlinkedPATemplateSummaryRoot {
    /**
     * Constructs a new <code>UnlinkedPATemplateSummaryRoot</code>.
     * @alias module:model/UnlinkedPATemplateSummaryRoot
     * @param data {Object.<String, module:model/UnlinkedPATemplateSummary>} 
     */
    constructor(data) { 
        
        UnlinkedPATemplateSummaryRoot.initialize(this, data);
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
     * Constructs a <code>UnlinkedPATemplateSummaryRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnlinkedPATemplateSummaryRoot} obj Optional instance to populate.
     * @return {module:model/UnlinkedPATemplateSummaryRoot} The populated <code>UnlinkedPATemplateSummaryRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnlinkedPATemplateSummaryRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': UnlinkedPATemplateSummary});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/UnlinkedPATemplateSummary>} data
 */
UnlinkedPATemplateSummaryRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
UnlinkedPATemplateSummaryRoot.prototype['meta'] = undefined;






export default UnlinkedPATemplateSummaryRoot;

