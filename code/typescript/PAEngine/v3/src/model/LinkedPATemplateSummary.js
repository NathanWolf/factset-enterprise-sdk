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
 * The LinkedPATemplateSummary model module.
 * @module model/LinkedPATemplateSummary
 * @version 0.9.0
 */
class LinkedPATemplateSummary {
    /**
     * Constructs a new <code>LinkedPATemplateSummary</code>.
     * @alias module:model/LinkedPATemplateSummary
     */
    constructor() { 
        
        LinkedPATemplateSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LinkedPATemplateSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LinkedPATemplateSummary} obj Optional instance to populate.
     * @return {module:model/LinkedPATemplateSummary} The populated <code>LinkedPATemplateSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LinkedPATemplateSummary();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('parentComponentId')) {
                obj['parentComponentId'] = ApiClient.convertToType(data['parentComponentId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Template description.
 * @member {String} description
 */
LinkedPATemplateSummary.prototype['description'] = undefined;

/**
 * Template name.
 * @member {String} name
 */
LinkedPATemplateSummary.prototype['name'] = undefined;

/**
 * Template parent tile.
 * @member {String} parentComponentId
 */
LinkedPATemplateSummary.prototype['parentComponentId'] = undefined;






export default LinkedPATemplateSummary;

