/**
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: client.portfolio.data.engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse403Errors model module.
 * @module model/InlineResponse403Errors
 */
class InlineResponse403Errors {
    /**
     * Constructs a new <code>InlineResponse403Errors</code>.
     * @alias module:model/InlineResponse403Errors
     */
    constructor() { 
        
        InlineResponse403Errors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse403Errors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse403Errors} obj Optional instance to populate.
     * @return {module:model/InlineResponse403Errors} The populated <code>InlineResponse403Errors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse403Errors();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
InlineResponse403Errors.prototype['id'] = undefined;

/**
 * @member {String} title
 */
InlineResponse403Errors.prototype['title'] = undefined;

/**
 * @member {String} code
 * @default 'notAuthorized'
 */
InlineResponse403Errors.prototype['code'] = 'notAuthorized';






export default InlineResponse403Errors;

