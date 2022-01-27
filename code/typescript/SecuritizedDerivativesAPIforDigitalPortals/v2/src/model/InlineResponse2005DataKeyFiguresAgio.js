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
import InlineResponse2005DataKeyFiguresAgioAbsolute from './InlineResponse2005DataKeyFiguresAgioAbsolute';
import InlineResponse2005DataKeyFiguresAgioAnnualized from './InlineResponse2005DataKeyFiguresAgioAnnualized';
import InlineResponse2005DataKeyFiguresAgioRelative from './InlineResponse2005DataKeyFiguresAgioRelative';

/**
 * The InlineResponse2005DataKeyFiguresAgio model module.
 * @module model/InlineResponse2005DataKeyFiguresAgio
 * @version 0.9.0
 */
class InlineResponse2005DataKeyFiguresAgio {
    /**
     * Constructs a new <code>InlineResponse2005DataKeyFiguresAgio</code>.
     * Value ranges related to the agio.
     * @alias module:model/InlineResponse2005DataKeyFiguresAgio
     */
    constructor() { 
        
        InlineResponse2005DataKeyFiguresAgio.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataKeyFiguresAgio</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataKeyFiguresAgio} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataKeyFiguresAgio} The populated <code>InlineResponse2005DataKeyFiguresAgio</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataKeyFiguresAgio();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = InlineResponse2005DataKeyFiguresAgioAbsolute.constructFromObject(data['absolute']);
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = InlineResponse2005DataKeyFiguresAgioRelative.constructFromObject(data['relative']);
            }
            if (data.hasOwnProperty('annualized')) {
                obj['annualized'] = InlineResponse2005DataKeyFiguresAgioAnnualized.constructFromObject(data['annualized']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresAgioAbsolute} absolute
 */
InlineResponse2005DataKeyFiguresAgio.prototype['absolute'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresAgioRelative} relative
 */
InlineResponse2005DataKeyFiguresAgio.prototype['relative'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataKeyFiguresAgioAnnualized} annualized
 */
InlineResponse2005DataKeyFiguresAgio.prototype['annualized'] = undefined;






export default InlineResponse2005DataKeyFiguresAgio;

