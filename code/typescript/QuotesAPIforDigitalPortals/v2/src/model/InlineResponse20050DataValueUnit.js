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

/**
 * The InlineResponse20050DataValueUnit model module.
 * @module model/InlineResponse20050DataValueUnit
 * @version 0.9.0
 */
class InlineResponse20050DataValueUnit {
    /**
     * Constructs a new <code>InlineResponse20050DataValueUnit</code>.
     * Value unit of the component, provided also if there is no notation for the component.  See endpoint &#x60;/basic/valueUnit/list&#x60; for possible values.
     * @alias module:model/InlineResponse20050DataValueUnit
     */
    constructor() { 
        
        InlineResponse20050DataValueUnit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20050DataValueUnit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20050DataValueUnit} obj Optional instance to populate.
     * @return {module:model/InlineResponse20050DataValueUnit} The populated <code>InlineResponse20050DataValueUnit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20050DataValueUnit();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the value unit.
 * @member {Number} id
 */
InlineResponse20050DataValueUnit.prototype['id'] = undefined;

/**
 * Code of the value unit.
 * @member {String} code
 */
InlineResponse20050DataValueUnit.prototype['code'] = undefined;






export default InlineResponse20050DataValueUnit;

