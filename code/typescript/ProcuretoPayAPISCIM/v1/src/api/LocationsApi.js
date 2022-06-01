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


import ApiClient from "../ApiClient";
import Error from '../model/Error';
import LocationResource from '../model/LocationResource';
import LocationResourceList from '../model/LocationResourceList';
import Patch from '../model/Patch';

/**
* Locations service.
* @module api/LocationsApi
* @version 0.20.1
*/
export default class LocationsApi {

    /**
    * Constructs a new LocationsApi. 
    * @alias module:api/LocationsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get a list of locations.
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings.
     * @param {Number} opts.startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
     * @param {Number} opts.count Maximum resource count. The server will not return more resources than this value, although it may return fewer.
     * @param {String} opts.attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.
     * @param {String} opts.excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LocationResourceList} and HTTP response
     */
    locationsGetWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'filter': opts['filter'],
        'startIndex': opts['startIndex'],
        'count': opts['count'],
        'attributes': opts['attributes'],
        'excludedAttributes': opts['excludedAttributes']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/scim+json'];


      let returnType = LocationResourceList;

      return this.apiClient.callApi(
        '/Locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a list of locations.
     * @param {Object} opts Optional parameters
     * @param {String} opts.filter Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings.
     * @param {Number} opts.startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
     * @param {Number} opts.count Maximum resource count. The server will not return more resources than this value, although it may return fewer.
     * @param {String} opts.attributes Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter.
     * @param {String} opts.excludedAttributes Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter.
     * @return { Promise.< module:model/LocationResourceList > } a Promise, with data of type {@link module:model/LocationResourceList }
     */
    locationsGet(opts) {
      return this.locationsGetWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get a location.
     * @param {String} id ID of resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LocationResource} and HTTP response
     */
    locationsIdGetWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling locationsIdGet");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/scim+json'];


      let returnType = LocationResource;

      return this.apiClient.callApi(
        '/Locations/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a location.
     * @param {String} id ID of resource.
     * @return { Promise.< module:model/LocationResource > } a Promise, with data of type {@link module:model/LocationResource }
     */
    locationsIdGet(id) {
      return this.locationsIdGetWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Patch a location (add, replace, or remove attributes of a location.)
     * @param {String} id ID of resource.
     * @param {Object} opts Optional parameters
     * @param {module:model/Patch} opts.patch 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LocationResource} and HTTP response
     */
    locationsIdPatchWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = opts['patch'];
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling locationsIdPatch");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/scim+json'];
      let accepts = ['application/scim+json'];


      let returnType = LocationResource;

      return this.apiClient.callApi(
        '/Locations/{id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Patch a location (add, replace, or remove attributes of a location.)
     * @param {String} id ID of resource.
     * @param {Object} opts Optional parameters
     * @param {module:model/Patch} opts.patch 
     * @return { Promise.< module:model/LocationResource > } a Promise, with data of type {@link module:model/LocationResource }
     */
    locationsIdPatch(id, opts) {
      return this.locationsIdPatchWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Replace a location.
     * @param {String} id ID of resource.
     * @param {module:model/LocationResource} locationResource Location resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LocationResource} and HTTP response
     */
    locationsIdPutWithHttpInfo(id, locationResource) {
      let postBody = locationResource;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling locationsIdPut");
      }
      // verify the required parameter 'locationResource' is set
      if (locationResource === undefined || locationResource === null) {
        throw new Error("Missing the required parameter 'locationResource' when calling locationsIdPut");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/scim+json'];
      let accepts = ['application/scim+json'];


      let returnType = LocationResource;

      return this.apiClient.callApi(
        '/Locations/{id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Replace a location.
     * @param {String} id ID of resource.
     * @param {module:model/LocationResource} locationResource Location resource.
     * @return { Promise.< module:model/LocationResource > } a Promise, with data of type {@link module:model/LocationResource }
     */
    locationsIdPut(id, locationResource) {
      return this.locationsIdPutWithHttpInfo(id, locationResource)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





