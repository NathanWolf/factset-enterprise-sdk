/**
 * Vault API
 * Allow clients to fetch Vault Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import DocumentDirectories from '../model/DocumentDirectories';

/**
* Documents service.
* @module api/DocumentsApi
* @version 0.8.0
*/
export default class DocumentsApi {

    /**
    * Constructs a new DocumentsApi. 
    * @alias module:api/DocumentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get Vault documents and sub-directories in a directory
     * This endpoint looks up all Vault documents and sub-directories in a given directory.
     * @param {String} path The directory to get the documents in
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/DocumentDirectories} and HTTP response
     */
    getVaultDocumentsWithHttpInfo(path) {
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling getVaultDocuments");
      }

      let pathParams = {
        'path': path
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DocumentDirectories;
      return this.apiClient.callApi(
        '/analytics/lookups/v2/engines/vault/documents/{path}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Vault documents and sub-directories in a directory
     * This endpoint looks up all Vault documents and sub-directories in a given directory.
     * @param {String} path The directory to get the documents in
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/DocumentDirectories}
     */
    getVaultDocuments(path) {
      return this.getVaultDocumentsWithHttpInfo(path)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
