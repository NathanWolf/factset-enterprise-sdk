/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse2005DataLifeCycleIssue model module.
 * @module model/InlineResponse2005DataLifeCycleIssue
 * @version 0.10.0
 */
class InlineResponse2005DataLifeCycleIssue {
    /**
     * Constructs a new <code>InlineResponse2005DataLifeCycleIssue</code>.
     * Date range of the issue date.
     * @alias module:model/InlineResponse2005DataLifeCycleIssue
     */
    constructor() { 
        
        InlineResponse2005DataLifeCycleIssue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataLifeCycleIssue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataLifeCycleIssue} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataLifeCycleIssue} The populated <code>InlineResponse2005DataLifeCycleIssue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataLifeCycleIssue();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = ApiClient.convertToType(data['minimum'], 'Date');
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = ApiClient.convertToType(data['maximum'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Minimum date.
 * @member {Date} minimum
 */
InlineResponse2005DataLifeCycleIssue.prototype['minimum'] = undefined;

/**
 * Maximum date.
 * @member {Date} maximum
 */
InlineResponse2005DataLifeCycleIssue.prototype['maximum'] = undefined;






export default InlineResponse2005DataLifeCycleIssue;

