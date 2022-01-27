/**
 * QRE API
 * TBD
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import FileUploadStatus from '../model/FileUploadStatus';

/**
* Files service.
* @module api/FilesApi
* @version 0.9.0
*/
export default class FilesApi {

    /**
    * Constructs a new FilesApi. 
    * @alias module:api/FilesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Starts a file upload
     * This endpoint takes a file and uploads it
     * @param {String} server The server to upload the file to. Either `interactive` or `batch`.
     * @param {String} file The file name to upload the file to. Existing directory can be specified.
     * @param {Object} opts Optional parameters
     * @param {File} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FileUploadStatus} and HTTP response
     */
    analyticsQuantQreV1FilesServerFilePostWithHttpInfo(server, file, opts) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'server' is set
      if (server === undefined || server === null) {
        throw new Error("Missing the required parameter 'server' when calling analyticsQuantQreV1FilesServerFilePost");
      }
      // verify the required parameter 'file' is set
      if (file === undefined || file === null) {
        throw new Error("Missing the required parameter 'file' when calling analyticsQuantQreV1FilesServerFilePost");
      }

      let pathParams = {
        'server': server,
        'file': file
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['*'];
      let accepts = ['application/json'];
      let returnType = FileUploadStatus;
      return this.apiClient.callApi(
        '/analytics/quant/qre/v1/files/{server}/{file}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Starts a file upload
     * This endpoint takes a file and uploads it
     * @param {String} server The server to upload the file to. Either `interactive` or `batch`.
     * @param {String} file The file name to upload the file to. Existing directory can be specified.
     * @param {Object} opts Optional parameters
     * @param {File} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/FileUploadStatus}
     */
    analyticsQuantQreV1FilesServerFilePost(server, file, opts) {
      return this.analyticsQuantQreV1FilesServerFilePostWithHttpInfo(server, file, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get upload status by id
     * This is the endpoint to check on the progress of a previous upload request.
     * @param {String} id From url, provided by location header or response body in the upload start endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FileUploadStatus} and HTTP response
     */
    analyticsQuantQreV1FilesUploadsIdGetWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling analyticsQuantQreV1FilesUploadsIdGet");
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
      let accepts = ['application/json'];
      let returnType = FileUploadStatus;
      return this.apiClient.callApi(
        '/analytics/quant/qre/v1/files/uploads/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get upload status by id
     * This is the endpoint to check on the progress of a previous upload request.
     * @param {String} id From url, provided by location header or response body in the upload start endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/FileUploadStatus}
     */
    analyticsQuantQreV1FilesUploadsIdGet(id) {
      return this.analyticsQuantQreV1FilesUploadsIdGetWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
