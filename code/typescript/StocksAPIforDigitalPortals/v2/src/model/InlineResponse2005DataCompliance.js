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
import InlineResponse2005DataComplianceFrance from './InlineResponse2005DataComplianceFrance';

/**
 * The InlineResponse2005DataCompliance model module.
 * @module model/InlineResponse2005DataCompliance
 * @version 0.9.0
 */
class InlineResponse2005DataCompliance {
    /**
     * Constructs a new <code>InlineResponse2005DataCompliance</code>.
     * Compliance properties. A given compliance property may appear in combination with other compliance properties. The attribute &#x60;count&#x60; represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).
     * @alias module:model/InlineResponse2005DataCompliance
     */
    constructor() { 
        
        InlineResponse2005DataCompliance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataCompliance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataCompliance} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataCompliance} The populated <code>InlineResponse2005DataCompliance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataCompliance();

            if (data.hasOwnProperty('france')) {
                obj['france'] = ApiClient.convertToType(data['france'], [InlineResponse2005DataComplianceFrance]);
            }
        }
        return obj;
    }


}

/**
 * Compliance properties in accordance with the French law.
 * @member {Array.<module:model/InlineResponse2005DataComplianceFrance>} france
 */
InlineResponse2005DataCompliance.prototype['france'] = undefined;






export default InlineResponse2005DataCompliance;

