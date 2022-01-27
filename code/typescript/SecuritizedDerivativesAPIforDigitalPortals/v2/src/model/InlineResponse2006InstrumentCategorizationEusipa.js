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
import InlineResponse2006InstrumentCategorizationDdvLevel1 from './InlineResponse2006InstrumentCategorizationDdvLevel1';
import InlineResponse2006InstrumentCategorizationDdvLevel2 from './InlineResponse2006InstrumentCategorizationDdvLevel2';
import InlineResponse2006InstrumentCategorizationDdvLevel3 from './InlineResponse2006InstrumentCategorizationDdvLevel3';

/**
 * The InlineResponse2006InstrumentCategorizationEusipa model module.
 * @module model/InlineResponse2006InstrumentCategorizationEusipa
 * @version 0.9.0
 */
class InlineResponse2006InstrumentCategorizationEusipa {
    /**
     * Constructs a new <code>InlineResponse2006InstrumentCategorizationEusipa</code>.
     * Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (id&#x3D;18) covers all securitized derivatives.
     * @alias module:model/InlineResponse2006InstrumentCategorizationEusipa
     */
    constructor() { 
        
        InlineResponse2006InstrumentCategorizationEusipa.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006InstrumentCategorizationEusipa</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006InstrumentCategorizationEusipa} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006InstrumentCategorizationEusipa} The populated <code>InlineResponse2006InstrumentCategorizationEusipa</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006InstrumentCategorizationEusipa();

            if (data.hasOwnProperty('level1')) {
                obj['level1'] = InlineResponse2006InstrumentCategorizationDdvLevel1.constructFromObject(data['level1']);
            }
            if (data.hasOwnProperty('level2')) {
                obj['level2'] = InlineResponse2006InstrumentCategorizationDdvLevel2.constructFromObject(data['level2']);
            }
            if (data.hasOwnProperty('level3')) {
                obj['level3'] = InlineResponse2006InstrumentCategorizationDdvLevel3.constructFromObject(data['level3']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2006InstrumentCategorizationDdvLevel1} level1
 */
InlineResponse2006InstrumentCategorizationEusipa.prototype['level1'] = undefined;

/**
 * @member {module:model/InlineResponse2006InstrumentCategorizationDdvLevel2} level2
 */
InlineResponse2006InstrumentCategorizationEusipa.prototype['level2'] = undefined;

/**
 * @member {module:model/InlineResponse2006InstrumentCategorizationDdvLevel3} level3
 */
InlineResponse2006InstrumentCategorizationEusipa.prototype['level3'] = undefined;






export default InlineResponse2006InstrumentCategorizationEusipa;

