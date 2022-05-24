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
 * The ComponentSummary model module.
 * @module model/ComponentSummary
 * @version 0.20.0
 */
class ComponentSummary {
    /**
     * Constructs a new <code>ComponentSummary</code>.
     * @alias module:model/ComponentSummary
     */
    constructor() { 
        
        ComponentSummary.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComponentSummary</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComponentSummary} obj Optional instance to populate.
     * @return {module:model/ComponentSummary} The populated <code>ComponentSummary</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComponentSummary();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Component name.
 * @member {String} name
 */
ComponentSummary.prototype['name'] = undefined;

/**
 * Component category.
 * @member {String} category
 */
ComponentSummary.prototype['category'] = undefined;






export default ComponentSummary;

