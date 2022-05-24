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
import InlineResponse2005DataKeyFiguresBreakEvenDistanceAbsolute from './InlineResponse2005DataKeyFiguresBreakEvenDistanceAbsolute';
import InlineResponse2005DataKeyFiguresBreakEvenDistanceRelative from './InlineResponse2005DataKeyFiguresBreakEvenDistanceRelative';

/**
 * The InlineResponse2005DataKeyFiguresBreakEvenDistance model module.
 * @module model/InlineResponse2005DataKeyFiguresBreakEvenDistance
 * @version 0.10.0
 */
class InlineResponse2005DataKeyFiguresBreakEvenDistance {
    /**
     * Constructs a new <code>InlineResponse2005DataKeyFiguresBreakEvenDistance</code>.
     * Value ranges of the distance from the underlying level to the break-even point.
     * @alias module:model/InlineResponse2005DataKeyFiguresBreakEvenDistance
     */
    constructor() { 
        
        InlineResponse2005DataKeyFiguresBreakEvenDistance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataKeyFiguresBreakEvenDistance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataKeyFiguresBreakEvenDistance} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataKeyFiguresBreakEvenDistance} The populated <code>InlineResponse2005DataKeyFiguresBreakEvenDistance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataKeyFiguresBreakEvenDistance();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = InlineResponse2005DataKeyFiguresBreakEvenDistanceAbsolute.constructFromObject(data['absolute']);
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = InlineResponse2005DataKeyFiguresBreakEvenDistanceRelative.constructFromObject(data['relative']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresBreakEvenDistanceAbsolute} absolute
 */
InlineResponse2005DataKeyFiguresBreakEvenDistance.prototype['absolute'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresBreakEvenDistanceRelative} relative
 */
InlineResponse2005DataKeyFiguresBreakEvenDistance.prototype['relative'] = undefined;






export default InlineResponse2005DataKeyFiguresBreakEvenDistance;

