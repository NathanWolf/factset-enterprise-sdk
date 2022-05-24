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
import InlineResponse2005DataKeyFiguresVegaEffective from './InlineResponse2005DataKeyFiguresVegaEffective';
import InlineResponse2005DataKeyFiguresVegaUnadjusted from './InlineResponse2005DataKeyFiguresVegaUnadjusted';

/**
 * The InlineResponse2005DataKeyFiguresVega model module.
 * @module model/InlineResponse2005DataKeyFiguresVega
 * @version 0.10.0
 */
class InlineResponse2005DataKeyFiguresVega {
    /**
     * Constructs a new <code>InlineResponse2005DataKeyFiguresVega</code>.
     * Value ranges related to the vega.
     * @alias module:model/InlineResponse2005DataKeyFiguresVega
     */
    constructor() { 
        
        InlineResponse2005DataKeyFiguresVega.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataKeyFiguresVega</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataKeyFiguresVega} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataKeyFiguresVega} The populated <code>InlineResponse2005DataKeyFiguresVega</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataKeyFiguresVega();

            if (data.hasOwnProperty('effective')) {
                obj['effective'] = InlineResponse2005DataKeyFiguresVegaEffective.constructFromObject(data['effective']);
            }
            if (data.hasOwnProperty('unadjusted')) {
                obj['unadjusted'] = InlineResponse2005DataKeyFiguresVegaUnadjusted.constructFromObject(data['unadjusted']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresVegaEffective} effective
 */
InlineResponse2005DataKeyFiguresVega.prototype['effective'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresVegaUnadjusted} unadjusted
 */
InlineResponse2005DataKeyFiguresVega.prototype['unadjusted'] = undefined;






export default InlineResponse2005DataKeyFiguresVega;

