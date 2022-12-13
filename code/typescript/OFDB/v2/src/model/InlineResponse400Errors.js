/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse400Source from './InlineResponse400Source';

/**
 * The InlineResponse400Errors model module.
 * @module model/InlineResponse400Errors
 */
class InlineResponse400Errors {
    /**
     * Constructs a new <code>InlineResponse400Errors</code>.
     * @alias module:model/InlineResponse400Errors
     */
    constructor() { 
        
        InlineResponse400Errors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse400Errors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse400Errors} obj Optional instance to populate.
     * @return {module:model/InlineResponse400Errors} The populated <code>InlineResponse400Errors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse400Errors();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = InlineResponse400Source.constructFromObject(data['source']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
InlineResponse400Errors.prototype['id'] = undefined;

/**
 * @member {String} title
 */
InlineResponse400Errors.prototype['title'] = undefined;

/**
 * @member {String} code
 * @default 'parameterError'
 */
InlineResponse400Errors.prototype['code'] = 'parameterError';

/**
 * @member {module:model/InlineResponse400Source} source
 */
InlineResponse400Errors.prototype['source'] = undefined;






export default InlineResponse400Errors;

