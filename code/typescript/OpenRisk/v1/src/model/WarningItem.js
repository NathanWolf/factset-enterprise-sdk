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

/**
 * The WarningItem model module.
 * @module model/WarningItem
 */
class WarningItem {
    /**
     * Constructs a new <code>WarningItem</code>.
     * Warning information for a particular occurrence of a non-failure problem with human-readable details describing the cause
     * @alias module:model/WarningItem
     * @param id {String} UUID for the particular occurrence of the non-failure problem
     * @param code {String} Warning code for the non-failure problem type
     * @param title {String} Human-readable summary of the non-failure problem tied to the warning code and not specific to the particular occurrence of the problem
     */
    constructor(id, code, title) { 
        
        WarningItem.initialize(this, id, code, title);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, code, title) { 
        obj['id'] = id;
        obj['code'] = code;
        obj['title'] = title;
    }

    /**
     * Constructs a <code>WarningItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/WarningItem} obj Optional instance to populate.
     * @return {module:model/WarningItem} The populated <code>WarningItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WarningItem();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('detail')) {
                obj['detail'] = ApiClient.convertToType(data['detail'], 'String');
            }
        }
        return obj;
    }


}

/**
 * UUID for the particular occurrence of the non-failure problem
 * @member {String} id
 */
WarningItem.prototype['id'] = undefined;

/**
 * Warning code for the non-failure problem type
 * @member {String} code
 */
WarningItem.prototype['code'] = undefined;

/**
 * Human-readable summary of the non-failure problem tied to the warning code and not specific to the particular occurrence of the problem
 * @member {String} title
 */
WarningItem.prototype['title'] = undefined;

/**
 * Human-readable explanation of the non-failure problem specific to the particular occurrence
 * @member {String} detail
 */
WarningItem.prototype['detail'] = undefined;






export default WarningItem;

