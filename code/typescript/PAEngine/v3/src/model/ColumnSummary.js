/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ColumnSummary model module.
 * @module model/ColumnSummary
 * @version 0.9.0
 */
class ColumnSummary {
    /**
     * Constructs a new <code>ColumnSummary</code>.
     * Column settings (name, directory, category)
     * @alias module:model/ColumnSummary
     */
    constructor() { 
        
        ColumnSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ColumnSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColumnSummary} obj Optional instance to populate.
     * @return {module:model/ColumnSummary} The populated <code>ColumnSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColumnSummary();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('directory')) {
                obj['directory'] = ApiClient.convertToType(data['directory'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Column Name
 * @member {String} name
 */
ColumnSummary.prototype['name'] = undefined;

/**
 * Column Directory
 * @member {String} directory
 */
ColumnSummary.prototype['directory'] = undefined;

/**
 * Column Category
 * @member {String} category
 */
ColumnSummary.prototype['category'] = undefined;






export default ColumnSummary;

