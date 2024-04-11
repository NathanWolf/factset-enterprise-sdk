/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ScimGroupMember model module.
 * @module model/ScimGroupMember
 */
class ScimGroupMember {
    /**
     * Constructs a new <code>ScimGroupMember</code>.
     * @alias module:model/ScimGroupMember
     */
    constructor() { 
        
        ScimGroupMember.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScimGroupMember</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScimGroupMember} obj Optional instance to populate.
     * @return {module:model/ScimGroupMember} The populated <code>ScimGroupMember</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScimGroupMember();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('$ref')) {
                obj['$ref'] = ApiClient.convertToType(data['$ref'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} value
 */
ScimGroupMember.prototype['value'] = undefined;

/**
 * A callback link which can be used to get the information of the group
 * @member {String} $ref
 */
ScimGroupMember.prototype['$ref'] = undefined;

/**
 * @member {String} type
 */
ScimGroupMember.prototype['type'] = undefined;






export default ScimGroupMember;

