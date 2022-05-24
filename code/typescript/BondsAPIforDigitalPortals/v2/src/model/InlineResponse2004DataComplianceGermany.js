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
import InlineResponse2004DataLifeCycleMaturityPerpetual from './InlineResponse2004DataLifeCycleMaturityPerpetual';

/**
 * The InlineResponse2004DataComplianceGermany model module.
 * @module model/InlineResponse2004DataComplianceGermany
 * @version 0.10.0
 */
class InlineResponse2004DataComplianceGermany {
    /**
     * Constructs a new <code>InlineResponse2004DataComplianceGermany</code>.
     * Compliance properties in accordance with the German law.
     * @alias module:model/InlineResponse2004DataComplianceGermany
     */
    constructor() { 
        
        InlineResponse2004DataComplianceGermany.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004DataComplianceGermany</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004DataComplianceGermany} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004DataComplianceGermany} The populated <code>InlineResponse2004DataComplianceGermany</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004DataComplianceGermany();

            if (data.hasOwnProperty('trusteeEligible')) {
                obj['trusteeEligible'] = ApiClient.convertToType(data['trusteeEligible'], [InlineResponse2004DataLifeCycleMaturityPerpetual]);
            }
        }
        return obj;
    }


}

/**
 * Indicates whether debt instruments eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code) are among the results. The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.
 * @member {Array.<module:model/InlineResponse2004DataLifeCycleMaturityPerpetual>} trusteeEligible
 */
InlineResponse2004DataComplianceGermany.prototype['trusteeEligible'] = undefined;






export default InlineResponse2004DataComplianceGermany;

