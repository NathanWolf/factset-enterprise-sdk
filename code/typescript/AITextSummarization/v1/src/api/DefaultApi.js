/**
 * AI Text Summarization
 * AI Text Summarization
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
import BadRequestResponse from '../model/BadRequestResponse';
import InternalServerErrorResponse from '../model/InternalServerErrorResponse';
import Request from '../model/Request';
import SuccessResponse from '../model/SuccessResponse';

/**
* Default service.
* @module api/DefaultApi
* @version 0.20.0
*/
export default class DefaultApi {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * GET request that returns the full headline and summary results from the initial POST requests
     * Endpoint that returns the full headline and summary results from the initial POST requests.
     * @param {String} resultId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SuccessResponse} and HTTP response
     */
    getResultV1ResultResultIdWithHttpInfo(resultId) {
      let postBody = null;
      // verify the required parameter 'resultId' is set
      if (resultId === undefined || resultId === null) {
        throw new Error("Missing the required parameter 'resultId' when calling getResultV1ResultResultId");
      }

      let pathParams = {
        'result_id': resultId
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


      let returnType = SuccessResponse;

      return this.apiClient.callApi(
        '/v1/result/{result_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * GET request that returns the full headline and summary results from the initial POST requests
     * Endpoint that returns the full headline and summary results from the initial POST requests.
     * @param {String} resultId 
     * @return { Promise.< module:model/SuccessResponse > } a Promise, with data of type {@link module:model/SuccessResponse }
     */
    getResultV1ResultResultId(resultId) {
      return this.getResultV1ResultResultIdWithHttpInfo(resultId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * POST request to create a 2-3 sentence summary from input text
     * Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.
     * @param {module:model/Request} payload 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link String} and HTTP response
     */
    postHeadlineAndSummaryV1HeadlineAndSummaryWithHttpInfo(payload) {
      let postBody = payload;
      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling postHeadlineAndSummaryV1HeadlineAndSummary");
      }

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
      let accepts = ['application/json'];


      let returnType = 'String';

      return this.apiClient.callApi(
        '/v1/headline-and-summary', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * POST request to create a 2-3 sentence summary from input text
     * Endpoint for initiating a processing job to create a 2-3 sentence summary from input text.
     * @param {module:model/Request} payload 
     * @return { Promise.< String > } a Promise, with data of type {@link String }
     */
    postHeadlineAndSummaryV1HeadlineAndSummary(payload) {
      return this.postHeadlineAndSummaryV1HeadlineAndSummaryWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * POST request to create a headline from input text
     * Endpoint for initiating a processing job to create a headline from input text.
     * @param {module:model/Request} payload 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link String} and HTTP response
     */
    postHeadlineV1HeadlineWithHttpInfo(payload) {
      let postBody = payload;
      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling postHeadlineV1Headline");
      }

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
      let accepts = ['application/json'];


      let returnType = 'String';

      return this.apiClient.callApi(
        '/v1/headline', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * POST request to create a headline from input text
     * Endpoint for initiating a processing job to create a headline from input text.
     * @param {module:model/Request} payload 
     * @return { Promise.< String > } a Promise, with data of type {@link String }
     */
    postHeadlineV1Headline(payload) {
      return this.postHeadlineV1HeadlineWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * POST request to create a headline and summary from input text
     * Endpoint for initiating a processing job to create a headline and summary from input text.
     * @param {module:model/Request} payload 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link String} and HTTP response
     */
    postSummaryV1SummaryWithHttpInfo(payload) {
      let postBody = payload;
      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling postSummaryV1Summary");
      }

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
      let accepts = ['application/json'];


      let returnType = 'String';

      return this.apiClient.callApi(
        '/v1/summary', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * POST request to create a headline and summary from input text
     * Endpoint for initiating a processing job to create a headline and summary from input text.
     * @param {module:model/Request} payload 
     * @return { Promise.< String > } a Promise, with data of type {@link String }
     */
    postSummaryV1Summary(payload) {
      return this.postSummaryV1SummaryWithHttpInfo(payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





