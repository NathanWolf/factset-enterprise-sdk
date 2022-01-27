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
import InlineResponse2003InstrumentComplianceGermany from './InlineResponse2003InstrumentComplianceGermany';

/**
 * The InlineResponse2003InstrumentCompliance model module.
 * @module model/InlineResponse2003InstrumentCompliance
 * @version 0.9.0
 */
class InlineResponse2003InstrumentCompliance {
    /**
     * Constructs a new <code>InlineResponse2003InstrumentCompliance</code>.
     * Compliance properties.
     * @alias module:model/InlineResponse2003InstrumentCompliance
     */
    constructor() { 
        
        InlineResponse2003InstrumentCompliance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003InstrumentCompliance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003InstrumentCompliance} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003InstrumentCompliance} The populated <code>InlineResponse2003InstrumentCompliance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003InstrumentCompliance();

            if (data.hasOwnProperty('germany')) {
                obj['germany'] = InlineResponse2003InstrumentComplianceGermany.constructFromObject(data['germany']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2003InstrumentComplianceGermany} germany
 */
InlineResponse2003InstrumentCompliance.prototype['germany'] = undefined;






export default InlineResponse2003InstrumentCompliance;

