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
import LinkedPATemplate from './LinkedPATemplate';

/**
 * The LinkedPATemplateRoot model module.
 * @module model/LinkedPATemplateRoot
 * @version 0.20.0
 */
class LinkedPATemplateRoot {
    /**
     * Constructs a new <code>LinkedPATemplateRoot</code>.
     * @alias module:model/LinkedPATemplateRoot
     * @param data {module:model/LinkedPATemplate} 
     */
    constructor(data) { 
        
        LinkedPATemplateRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>LinkedPATemplateRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LinkedPATemplateRoot} obj Optional instance to populate.
     * @return {module:model/LinkedPATemplateRoot} The populated <code>LinkedPATemplateRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LinkedPATemplateRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = LinkedPATemplate.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/LinkedPATemplate} data
 */
LinkedPATemplateRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
LinkedPATemplateRoot.prototype['meta'] = undefined;






export default LinkedPATemplateRoot;

