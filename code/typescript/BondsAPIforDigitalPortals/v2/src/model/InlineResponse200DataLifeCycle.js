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
import InlineResponse200DataLifeCycleMaturity from './InlineResponse200DataLifeCycleMaturity';

/**
 * The InlineResponse200DataLifeCycle model module.
 * @module model/InlineResponse200DataLifeCycle
 * @version 0.9.0
 */
class InlineResponse200DataLifeCycle {
    /**
     * Constructs a new <code>InlineResponse200DataLifeCycle</code>.
     * Important dates of the instrument.
     * @alias module:model/InlineResponse200DataLifeCycle
     */
    constructor() { 
        
        InlineResponse200DataLifeCycle.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200DataLifeCycle</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200DataLifeCycle} obj Optional instance to populate.
     * @return {module:model/InlineResponse200DataLifeCycle} The populated <code>InlineResponse200DataLifeCycle</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200DataLifeCycle();

            if (data.hasOwnProperty('issue')) {
                obj['issue'] = ApiClient.convertToType(data['issue'], 'Date');
            }
            if (data.hasOwnProperty('maturity')) {
                obj['maturity'] = InlineResponse200DataLifeCycleMaturity.constructFromObject(data['maturity']);
            }
        }
        return obj;
    }


}

/**
 * Date of the issue.
 * @member {Date} issue
 */
InlineResponse200DataLifeCycle.prototype['issue'] = undefined;

/**
 * @member {module:model/InlineResponse200DataLifeCycleMaturity} maturity
 */
InlineResponse200DataLifeCycle.prototype['maturity'] = undefined;






export default InlineResponse200DataLifeCycle;

