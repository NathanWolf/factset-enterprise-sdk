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
import Schema from '../model/Schema';
import SchemaList from '../model/SchemaList';

/**
* Schemas service.
* @module api/SchemasApi
* @version 0.20.1
*/
export default class SchemasApi {

    /**
    * Constructs a new SchemasApi. 
    * @alias module:api/SchemasApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get a list of schemas.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
     * @param {Number} opts.count Maximum resource count. The server will not return more resources than this value, although it may return fewer.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SchemaList} and HTTP response
     */
    schemasGetWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startIndex': opts['startIndex'],
        'count': opts['count']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/scim+json'];


      let returnType = SchemaList;

      return this.apiClient.callApi(
        '/Schemas', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a list of schemas.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startIndex Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
     * @param {Number} opts.count Maximum resource count. The server will not return more resources than this value, although it may return fewer.
     * @return { Promise.< module:model/SchemaList > } a Promise, with data of type {@link module:model/SchemaList }
     */
    schemasGet(opts) {
      return this.schemasGetWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get a schema.
     * @param {String} id ID of resource.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Schema} and HTTP response
     */
    schemasIdGetWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling schemasIdGet");
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


      let returnType = Schema;

      return this.apiClient.callApi(
        '/Schemas/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get a schema.
     * @param {String} id ID of resource.
     * @return { Promise.< module:model/Schema > } a Promise, with data of type {@link module:model/Schema }
     */
    schemasIdGet(id) {
      return this.schemasIdGetWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





