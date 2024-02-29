/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ErrorItem from './ErrorItem';
import StatCalculationLevel from './StatCalculationLevel';
import StatCalculationSettings from './StatCalculationSettings';
import StatResultValue from './StatResultValue';
import SuccessResponseMeta from './SuccessResponseMeta';

/**
 * The InlineResponse2003 model module.
 * @module model/InlineResponse2003
 */
class InlineResponse2003 {
    /**
     * Constructs a new <code>InlineResponse2003</code>.
     * @alias module:model/InlineResponse2003
     * @param meta {module:model/SuccessResponseMeta} 
     * @param data {Array.<Object>} Calculation results aligned to the input list of requested risk statistics
     */
    constructor(meta, data) { 
        
        InlineResponse2003.initialize(this, meta, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, meta, data) { 
        obj['meta'] = meta;
        obj['data'] = data;
    }

    /**
     * Constructs a <code>InlineResponse2003</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003} The populated <code>InlineResponse2003</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = SuccessResponseMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SuccessResponseMeta} meta
 */
InlineResponse2003.prototype['meta'] = undefined;

/**
 * Calculation results aligned to the input list of requested risk statistics
 * @member {Array.<Object>} data
 */
InlineResponse2003.prototype['data'] = undefined;






export default InlineResponse2003;

