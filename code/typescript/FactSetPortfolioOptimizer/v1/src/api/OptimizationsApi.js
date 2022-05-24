/**
 * Engines API
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import FPOOptimizationParameters from '../model/FPOOptimizationParameters';

/**
* Optimizations service.
* @module api/OptimizationsApi
* @version 0.8.2
*/
export default class OptimizationsApi {

    /**
    * Constructs a new OptimizationsApi. 
    * @alias module:api/OptimizationsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancel FPO optimization by id
     * This is the endpoint to cancel a previously submitted optimization. Instead of doing a GET on the polling URL, cancel the request by doing a DELETE.
     * @param {String} id from url, provided from the location header in the Run Optimization endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    cancelFPOOptimizationByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling cancelFPOOptimizationById");
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
      let accepts = [];


      let returnType = null;

      return this.apiClient.callApi(
        '/analytics/engines/fpo/v1/optimizations/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cancel FPO optimization by id
     * This is the endpoint to cancel a previously submitted optimization. Instead of doing a GET on the polling URL, cancel the request by doing a DELETE.
     * @param {String} id from url, provided from the location header in the Run Optimization endpoint
     * @return { Promise } a Promise
     */
    cancelFPOOptimizationById(id) {
      return this.cancelFPOOptimizationByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get FPO optimization by id
     * This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.
     * @param {String} id from url, provided from the location header in the Run Optimization endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getFPOOptimizationByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getFPOOptimizationById");
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
      let accepts = [];


      let returnType = null;

      return this.apiClient.callApi(
        '/analytics/engines/fpo/v1/optimizations/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get FPO optimization by id
     * This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, the body of the response will contain result in JSON.  Otherwise, the optimization is still running and the X-FactSet-Api-PickUp-Progress header will contain a progress percentage.
     * @param {String} id from url, provided from the location header in the Run Optimization endpoint
     * @return { Promise } a Promise
     */
    getFPOOptimizationById(id) {
      return this.getFPOOptimizationByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Run FPO optimization
     * This endpoint runs FPO optimization specified in the POST body parameters.  It must be used first before polling or cancelling endpoints.  A successful response will contain the URL to poll for the result of the optimization.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.
     * @param {Object} opts Optional parameters
     * @param {module:model/FPOOptimizationParameters} opts.fPOOptimizationParameters 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    runFPOOptimizationWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['fPOOptimizationParameters'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = [];


      let returnType = null;

      return this.apiClient.callApi(
        '/analytics/engines/fpo/v1/optimizations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Run FPO optimization
     * This endpoint runs FPO optimization specified in the POST body parameters.  It must be used first before polling or cancelling endpoints.  A successful response will contain the URL to poll for the result of the optimization.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.
     * @param {Object} opts Optional parameters
     * @param {module:model/FPOOptimizationParameters} opts.fPOOptimizationParameters 
     * @return { Promise } a Promise
     */
    runFPOOptimization(opts) {
      return this.runFPOOptimizationWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





