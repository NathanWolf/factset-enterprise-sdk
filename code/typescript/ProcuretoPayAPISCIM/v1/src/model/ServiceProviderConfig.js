/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ServiceProviderConfigAuthenticationSchemes from './ServiceProviderConfigAuthenticationSchemes';
import ServiceProviderConfigBulk from './ServiceProviderConfigBulk';
import ServiceProviderConfigChangePassword from './ServiceProviderConfigChangePassword';
import ServiceProviderConfigEtag from './ServiceProviderConfigEtag';
import ServiceProviderConfigFilter from './ServiceProviderConfigFilter';
import ServiceProviderConfigPatch from './ServiceProviderConfigPatch';
import ServiceProviderConfigSort from './ServiceProviderConfigSort';

/**
 * The ServiceProviderConfig model module.
 * @module model/ServiceProviderConfig
 * @version 0.20.1
 */
class ServiceProviderConfig {
    /**
     * Constructs a new <code>ServiceProviderConfig</code>.
     * @alias module:model/ServiceProviderConfig
     * @param patch {module:model/ServiceProviderConfigPatch} 
     * @param bulk {module:model/ServiceProviderConfigBulk} 
     * @param filter {module:model/ServiceProviderConfigFilter} 
     * @param changePassword {module:model/ServiceProviderConfigChangePassword} 
     * @param sort {module:model/ServiceProviderConfigSort} 
     * @param etag {module:model/ServiceProviderConfigEtag} 
     * @param authenticationSchemes {module:model/ServiceProviderConfigAuthenticationSchemes} 
     */
    constructor(patch, bulk, filter, changePassword, sort, etag, authenticationSchemes) { 
        
        ServiceProviderConfig.initialize(this, patch, bulk, filter, changePassword, sort, etag, authenticationSchemes);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, patch, bulk, filter, changePassword, sort, etag, authenticationSchemes) { 
        obj['patch'] = patch;
        obj['bulk'] = bulk;
        obj['filter'] = filter;
        obj['changePassword'] = changePassword;
        obj['sort'] = sort;
        obj['etag'] = etag;
        obj['authenticationSchemes'] = authenticationSchemes;
    }

    /**
     * Constructs a <code>ServiceProviderConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ServiceProviderConfig} obj Optional instance to populate.
     * @return {module:model/ServiceProviderConfig} The populated <code>ServiceProviderConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ServiceProviderConfig();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('documentationUri')) {
                obj['documentationUri'] = ApiClient.convertToType(data['documentationUri'], 'String');
            }
            if (data.hasOwnProperty('patch')) {
                obj['patch'] = ServiceProviderConfigPatch.constructFromObject(data['patch']);
            }
            if (data.hasOwnProperty('bulk')) {
                obj['bulk'] = ServiceProviderConfigBulk.constructFromObject(data['bulk']);
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = ServiceProviderConfigFilter.constructFromObject(data['filter']);
            }
            if (data.hasOwnProperty('changePassword')) {
                obj['changePassword'] = ServiceProviderConfigChangePassword.constructFromObject(data['changePassword']);
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ServiceProviderConfigSort.constructFromObject(data['sort']);
            }
            if (data.hasOwnProperty('etag')) {
                obj['etag'] = ServiceProviderConfigEtag.constructFromObject(data['etag']);
            }
            if (data.hasOwnProperty('authenticationSchemes')) {
                obj['authenticationSchemes'] = ServiceProviderConfigAuthenticationSchemes.constructFromObject(data['authenticationSchemes']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} schemas
 */
ServiceProviderConfig.prototype['schemas'] = undefined;

/**
 * An HTTP-addressable URL pointing to the service provider's human-consumable help documentation.
 * @member {String} documentationUri
 */
ServiceProviderConfig.prototype['documentationUri'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigPatch} patch
 */
ServiceProviderConfig.prototype['patch'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigBulk} bulk
 */
ServiceProviderConfig.prototype['bulk'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigFilter} filter
 */
ServiceProviderConfig.prototype['filter'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigChangePassword} changePassword
 */
ServiceProviderConfig.prototype['changePassword'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigSort} sort
 */
ServiceProviderConfig.prototype['sort'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigEtag} etag
 */
ServiceProviderConfig.prototype['etag'] = undefined;

/**
 * @member {module:model/ServiceProviderConfigAuthenticationSchemes} authenticationSchemes
 */
ServiceProviderConfig.prototype['authenticationSchemes'] = undefined;






export default ServiceProviderConfig;

