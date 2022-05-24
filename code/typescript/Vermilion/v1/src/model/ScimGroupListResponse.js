/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
import ScimGroup from './ScimGroup';

/**
 * The ScimGroupListResponse model module.
 * @module model/ScimGroupListResponse
 * @version 0.9.0
 */
class ScimGroupListResponse {
    /**
     * Constructs a new <code>ScimGroupListResponse</code>.
     * @alias module:model/ScimGroupListResponse
     */
    constructor() { 
        
        ScimGroupListResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScimGroupListResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScimGroupListResponse} obj Optional instance to populate.
     * @return {module:model/ScimGroupListResponse} The populated <code>ScimGroupListResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScimGroupListResponse();

            if (data.hasOwnProperty('totalResults')) {
                obj['totalResults'] = ApiClient.convertToType(data['totalResults'], 'Number');
            }
            if (data.hasOwnProperty('itemsPerPage')) {
                obj['itemsPerPage'] = ApiClient.convertToType(data['itemsPerPage'], 'Number');
            }
            if (data.hasOwnProperty('startIndex')) {
                obj['startIndex'] = ApiClient.convertToType(data['startIndex'], 'Number');
            }
            if (data.hasOwnProperty('Resources')) {
                obj['Resources'] = ApiClient.convertToType(data['Resources'], [ScimGroup]);
            }
        }
        return obj;
    }


}

/**
 * @member {Number} totalResults
 */
ScimGroupListResponse.prototype['totalResults'] = undefined;

/**
 * @member {Number} itemsPerPage
 */
ScimGroupListResponse.prototype['itemsPerPage'] = undefined;

/**
 * @member {Number} startIndex
 */
ScimGroupListResponse.prototype['startIndex'] = undefined;

/**
 * @member {Array.<module:model/ScimGroup>} Resources
 */
ScimGroupListResponse.prototype['Resources'] = undefined;






export default ScimGroupListResponse;

