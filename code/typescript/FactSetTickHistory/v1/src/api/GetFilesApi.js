/**
 * TickHistory
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
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
import GetFilesResponse from '../model/GetFilesResponse';
import GetFilesStatus from '../model/GetFilesStatus';

/**
* GetFiles service.
* @module api/GetFilesApi
* @version 0.20.0
*/
export default class GetFilesApi {

    /**
    * Constructs a new GetFilesApi. 
    * @alias module:api/GetFilesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the files from tickhistory endpoint for the specified date range
     * @param {String} requestId RequestId returned by request-files endpoint to poll and collect results of the query
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per response page (default to 20)
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (default to 0)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GetFilesResponse} and HTTP response
     */
    v1GetFilesGetWithHttpInfo(requestId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'requestId' is set
      if (requestId === undefined || requestId === null) {
        throw new Error("Missing the required parameter 'requestId' when calling v1GetFilesGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'requestId': requestId,
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = GetFilesResponse;

      return this.apiClient.callApi(
        '/v1/get-files', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the files from tickhistory endpoint for the specified date range
     * @param {String} requestId RequestId returned by request-files endpoint to poll and collect results of the query
     * @param {Object} opts Optional parameters
     * @param {Number} opts.paginationLimit Specifies the maximum number of results to return per response page (default to 20)
     * @param {Number} opts.paginationOffset Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (default to 0)
     * @return { Promise.< module:model/GetFilesResponse > } a Promise, with data of type {@link module:model/GetFilesResponse }
     */
    v1GetFilesGet(requestId, opts) {
      return this.v1GetFilesGetWithHttpInfo(requestId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





