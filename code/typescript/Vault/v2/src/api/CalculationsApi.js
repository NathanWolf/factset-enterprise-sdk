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
import Calculation from '../model/Calculation';
import CalculationStatus from '../model/CalculationStatus';
import CalculationStatusSummary from '../model/CalculationStatusSummary';

/**
* Calculations service.
* @module api/CalculationsApi
* @version 0.8.0
*/
export default class CalculationsApi {

    /**
    * Constructs a new CalculationsApi. 
    * @alias module:api/CalculationsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancel calculation by id
     * This is the endpoint to cancel a previously submitted calculation request.  Instead of doing a GET on the getCalculationById URL, cancel the calculation by doing a DELETE.  All individual calculation units within the calculation will be canceled if they have not already finished.
     * @param {String} id From url, provided from the location header in the Run Multiple Calculations endpoint.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    cancelCalculationByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling cancelCalculationById");
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
        '/analytics/engines/v2/calculations/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cancel calculation by id
     * This is the endpoint to cancel a previously submitted calculation request.  Instead of doing a GET on the getCalculationById URL, cancel the calculation by doing a DELETE.  All individual calculation units within the calculation will be canceled if they have not already finished.
     * @param {String} id From url, provided from the location header in the Run Multiple Calculations endpoint.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    cancelCalculationById(id) {
      return this.cancelCalculationByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get calculation status by id
     * This is the endpoint to check on the progress of a previous calculation request.  Response body contains status information of the entire request and each individual calculation unit.
     * @param {String} id From url, provided from the location header in the Run Multiple Calculations endpoint.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CalculationStatus} and HTTP response
     */
    getCalculationStatusByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getCalculationStatusById");
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
      let returnType = CalculationStatus;
      return this.apiClient.callApi(
        '/analytics/engines/v2/calculations/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get calculation status by id
     * This is the endpoint to check on the progress of a previous calculation request.  Response body contains status information of the entire request and each individual calculation unit.
     * @param {String} id From url, provided from the location header in the Run Multiple Calculations endpoint.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/CalculationStatus}
     */
    getCalculationStatusById(id) {
      return this.getCalculationStatusByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all calculation statuses
     * This endpoints returns all active calculation requests.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Object.<String, module:model/{String: CalculationStatusSummary}>} and HTTP response
     */
    getCalculationStatusSummariesWithHttpInfo() {
      let postBody = null;

      let pathParams = {
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
      let returnType = {'String': CalculationStatusSummary};
      return this.apiClient.callApi(
        '/analytics/engines/v2/calculations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all calculation statuses
     * This endpoints returns all active calculation requests.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Object.<String, module:model/{String: CalculationStatusSummary}>}
     */
    getCalculationStatusSummaries() {
      return this.getCalculationStatusSummariesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Run calculation
     * This endpoint creates a new calculation and runs the set of calculation units specified in the POST body.  This must be used first before get status or cancelling endpoints with a calculation id.   A successful response will contain the URL to check the status of the calculation request.    Remarks:  * Maximum 500 units allowed across all simultaneous calculations. (Refer API documentation for more information)                * Any settings in POST body will act as a one-time override over the settings saved in the PA/SPAR/Vault template.
     * @param {Object} opts Optional parameters
     * @param {module:model/Calculation} opts.calculation 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    runCalculationWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['calculation'];

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
        '/analytics/engines/v2/calculations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Run calculation
     * This endpoint creates a new calculation and runs the set of calculation units specified in the POST body.  This must be used first before get status or cancelling endpoints with a calculation id.   A successful response will contain the URL to check the status of the calculation request.    Remarks:  * Maximum 500 units allowed across all simultaneous calculations. (Refer API documentation for more information)                * Any settings in POST body will act as a one-time override over the settings saved in the PA/SPAR/Vault template.
     * @param {Object} opts Optional parameters
     * @param {module:model/Calculation} opts.calculation 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    runCalculation(opts) {
      return this.runCalculationWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
