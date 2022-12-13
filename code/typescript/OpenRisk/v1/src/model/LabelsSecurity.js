/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InputToResultSecurityIndexMapping from './InputToResultSecurityIndexMapping';
import ResultToInputSecurityIndexMapping from './ResultToInputSecurityIndexMapping';

/**
 * The LabelsSecurity model module.
 * @module model/LabelsSecurity
 */
class LabelsSecurity {
    /**
     * Constructs a new <code>LabelsSecurity</code>.
     * Labels relevant to calculation-levels with &#39;Security&#39; in the name
     * @alias module:model/LabelsSecurity
     * @param ids {Array.<String>} Security IDs aligned to the calculated output. Often this will merge the individual holdings arrays into a single array.
     */
    constructor(ids) { 
        
        LabelsSecurity.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>LabelsSecurity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LabelsSecurity} obj Optional instance to populate.
     * @return {module:model/LabelsSecurity} The populated <code>LabelsSecurity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LabelsSecurity();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('indicesInputToResult')) {
                obj['indicesInputToResult'] = InputToResultSecurityIndexMapping.constructFromObject(data['indicesInputToResult']);
            }
            if (data.hasOwnProperty('indicesResultToInput')) {
                obj['indicesResultToInput'] = ResultToInputSecurityIndexMapping.constructFromObject(data['indicesResultToInput']);
            }
        }
        return obj;
    }


}

/**
 * Security IDs aligned to the calculated output. Often this will merge the individual holdings arrays into a single array.
 * @member {Array.<String>} ids
 */
LabelsSecurity.prototype['ids'] = undefined;

/**
 * @member {module:model/InputToResultSecurityIndexMapping} indicesInputToResult
 */
LabelsSecurity.prototype['indicesInputToResult'] = undefined;

/**
 * @member {module:model/ResultToInputSecurityIndexMapping} indicesResultToInput
 */
LabelsSecurity.prototype['indicesResultToInput'] = undefined;






export default LabelsSecurity;

