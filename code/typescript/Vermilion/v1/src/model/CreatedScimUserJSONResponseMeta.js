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
 * The CreatedScimUserJSONResponseMeta model module.
 * @module model/CreatedScimUserJSONResponseMeta
 */
class CreatedScimUserJSONResponseMeta {
    /**
     * Constructs a new <code>CreatedScimUserJSONResponseMeta</code>.
     * @alias module:model/CreatedScimUserJSONResponseMeta
     */
    constructor() { 
        
        CreatedScimUserJSONResponseMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreatedScimUserJSONResponseMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreatedScimUserJSONResponseMeta} obj Optional instance to populate.
     * @return {module:model/CreatedScimUserJSONResponseMeta} The populated <code>CreatedScimUserJSONResponseMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreatedScimUserJSONResponseMeta();

            if (data.hasOwnProperty('resourceType')) {
                obj['resourceType'] = ApiClient.convertToType(data['resourceType'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'String');
            }
            if (data.hasOwnProperty('lastModified')) {
                obj['lastModified'] = ApiClient.convertToType(data['lastModified'], 'String');
            }
            if (data.hasOwnProperty('location')) {
                obj['location'] = ApiClient.convertToType(data['location'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} resourceType
 */
CreatedScimUserJSONResponseMeta.prototype['resourceType'] = undefined;

/**
 * @member {String} created
 */
CreatedScimUserJSONResponseMeta.prototype['created'] = undefined;

/**
 * @member {String} lastModified
 */
CreatedScimUserJSONResponseMeta.prototype['lastModified'] = undefined;

/**
 * @member {String} location
 */
CreatedScimUserJSONResponseMeta.prototype['location'] = undefined;






export default CreatedScimUserJSONResponseMeta;

