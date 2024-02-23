/**
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import BatchDataRequest from '../model/BatchDataRequest';
import BatchDataResponse from '../model/BatchDataResponse';
import BatchStatusResponse from '../model/BatchStatusResponse';
import ErrorDetail from '../model/ErrorDetail';

/**
* BatchProcessing service.
* @module api/BatchProcessingApi
*/
export default class BatchProcessingApi {

    /**
    * Constructs a new BatchProcessingApi. 
    * @alias module:api/BatchProcessingApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the response for a Batch Request
     * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {String} id Batch Request identifier.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BatchDataResponse} and HTTP response
     */
    getBatchDataWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getBatchData");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];

      let returnType = GetBatchDataResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/v1/batch-result', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the response for a Batch Request
     * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {String} id Batch Request identifier.
     * @return { Promise.< GetBatchDataResponseWrapper > } a Promise, with data of type {@link GetBatchDataResponseWrapper }
     */
    getBatchData(id) {
      return this.getBatchDataWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the status for a Batch Request
     * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {module:model/BatchDataRequest} batchDataRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BatchDataResponse} and HTTP response
     */
    getBatchDataWithPostWithHttpInfo(batchDataRequest) {
      let postBody = batchDataRequest;
      // verify the required parameter 'batchDataRequest' is set
      if (batchDataRequest === undefined || batchDataRequest === null) {
        throw new Error("Missing the required parameter 'batchDataRequest' when calling getBatchDataWithPost");
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

      let returnType = GetBatchDataWithPostResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/v1/batch-result', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status for a Batch Request
     * Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {module:model/BatchDataRequest} batchDataRequest 
     * @return { Promise.< GetBatchDataWithPostResponseWrapper > } a Promise, with data of type {@link GetBatchDataWithPostResponseWrapper }
     */
    getBatchDataWithPost(batchDataRequest) {
      return this.getBatchDataWithPostWithHttpInfo(batchDataRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the status for a Batch Request
     * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {String} id Batch Request identifier.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BatchStatusResponse} and HTTP response
     */
    getBatchStatusWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getBatchStatus");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = BatchStatusResponse;

      return this.apiClient.callApi(
        '/v1/batch-status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status for a Batch Request
     * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {String} id Batch Request identifier.
     * @return { Promise.< module:model/BatchStatusResponse > } a Promise, with data of type {@link module:model/BatchStatusResponse }
     */
    getBatchStatus(id) {
      return this.getBatchStatusWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the status for a Batch Request
     * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {module:model/BatchDataRequest} batchDataRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BatchStatusResponse} and HTTP response
     */
    getBatchStatusWithPostWithHttpInfo(batchDataRequest) {
      let postBody = batchDataRequest;
      // verify the required parameter 'batchDataRequest' is set
      if (batchDataRequest === undefined || batchDataRequest === null) {
        throw new Error("Missing the required parameter 'batchDataRequest' when calling getBatchStatusWithPost");
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


      let returnType = BatchStatusResponse;

      return this.apiClient.callApi(
        '/v1/batch-status', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the status for a Batch Request
     * Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 
     * @param {module:model/BatchDataRequest} batchDataRequest 
     * @return { Promise.< module:model/BatchStatusResponse > } a Promise, with data of type {@link module:model/BatchStatusResponse }
     */
    getBatchStatusWithPost(batchDataRequest) {
      return this.getBatchStatusWithPostWithHttpInfo(batchDataRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const GetBatchDataResponseWrapperTypeMap = {
  200: BatchDataResponse,
  202: BatchStatusResponse,
  404: ErrorDetail,

  _createResponseWrapper(statusCode, response) {
    return new GetBatchDataResponseWrapper(statusCode, response);
  }
};

const GetBatchDataWithPostResponseWrapperTypeMap = {
  200: BatchDataResponse,
  202: BatchStatusResponse,
  404: ErrorDetail,

  _createResponseWrapper(statusCode, response) {
    return new GetBatchDataWithPostResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support GET /v1/batch-result returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code BatchDataResponse }<br>Request Response Object when batch request has completed and response is created</li>
 * 
 *   <li>202 : {@code BatchStatusResponse }<br>Batch Request has not finished and the result has NOT been created.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     BatchDataResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetBatchDataResponseWrapper
 * @class
 */
export class GetBatchDataResponseWrapper {

  /**
   * @param {number} statusCode
   * @param {*} response
   */
  constructor(statusCode, response) {
    /**
     * @type {number}
     */
    this.statusCode = statusCode;

    /**
     * @type {*}
     */
    this.response = response;
  }

  
  /**
   * @returns { BatchDataResponse }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { BatchStatusResponse }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}

/**
 * Wrapper to support POST /v1/batch-result returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code BatchDataResponse }<br>Request Response Object when batch request has completed and response is created</li>
 * 
 *   <li>202 : {@code BatchStatusResponse }<br>Batch Request has not finished and the result has NOT been created.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     BatchDataResponse data200 = response.getResponse200();
 *     break;
 *   case 202:
 *     BatchStatusResponse data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:GetBatchDataWithPostResponseWrapper
 * @class
 */
export class GetBatchDataWithPostResponseWrapper {

  /**
   * @param {number} statusCode
   * @param {*} response
   */
  constructor(statusCode, response) {
    /**
     * @type {number}
     */
    this.statusCode = statusCode;

    /**
     * @type {*}
     */
    this.response = response;
  }

  
  /**
   * @returns { BatchDataResponse }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { BatchStatusResponse }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


