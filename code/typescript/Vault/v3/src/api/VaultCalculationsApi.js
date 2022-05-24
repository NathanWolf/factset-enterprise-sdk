/**
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CalculationStatusRoot from '../model/CalculationStatusRoot';
import ClientErrorResponse from '../model/ClientErrorResponse';
import ObjectRoot from '../model/ObjectRoot';
import VaultCalculationParametersRoot from '../model/VaultCalculationParametersRoot';

/**
* VaultCalculations service.
* @module api/VaultCalculationsApi
* @version 0.20.0
*/
export default class VaultCalculationsApi {

    /**
    * Constructs a new VaultCalculationsApi. 
    * @alias module:api/VaultCalculationsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Cancel Vault calculation by id
     * This is the endpoint to cancel a previously submitted calculation.
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
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
      let accepts = ['text/plain', 'application/json', 'text/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/analytics/engines/vault/v3/calculations/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Cancel Vault calculation by id
     * This is the endpoint to cancel a previously submitted calculation.
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @return { Promise } a Promise
     */
    cancelCalculationById(id) {
      return this.cancelCalculationByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get Vault calculation parameters by id
     * This is the endpoint that returns the calculation parameters passed for a calculation.
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/VaultCalculationParametersRoot} and HTTP response
     */
    getCalculationParametersWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getCalculationParameters");
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


      let returnType = VaultCalculationParametersRoot;

      return this.apiClient.callApi(
        '/analytics/engines/vault/v3/calculations/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Vault calculation parameters by id
     * This is the endpoint that returns the calculation parameters passed for a calculation.
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @return { Promise.< module:model/VaultCalculationParametersRoot > } a Promise, with data of type {@link module:model/VaultCalculationParametersRoot }
     */
    getCalculationParameters(id) {
      return this.getCalculationParametersWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get Vault calculation status by id
     * This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the location header will point to the result url.
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CalculationStatusRoot} and HTTP response
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


      let returnType = CalculationStatusRoot;

      return this.apiClient.callApi(
        '/analytics/engines/vault/v3/calculations/{id}/status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Vault calculation status by id
     * This is the endpoint to check on the progress of a previously requested calculation.  If the calculation has finished computing, the location header will point to the result url.
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @return { Promise.< module:model/CalculationStatusRoot > } a Promise, with data of type {@link module:model/CalculationStatusRoot }
     */
    getCalculationStatusById(id) {
      return this.getCalculationStatusByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get Vault calculation result by id
     * This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.
     * @param {String} id from url, provided from the location header in the Get Vault calculation status by id endpoint
     * @param {String} unitId from url, provided from the location header in the Get Vault calculation status by id endpoint
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ObjectRoot} and HTTP response
     */
    getCalculationUnitResultByIdWithHttpInfo(id, unitId) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getCalculationUnitResultById");
      }
      // verify the required parameter 'unitId' is set
      if (unitId === undefined || unitId === null) {
        throw new Error("Missing the required parameter 'unitId' when calling getCalculationUnitResultById");
      }

      let pathParams = {
        'id': id,
        'unitId': unitId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/x-protobuf'];


      let returnType = ObjectRoot;

      return this.apiClient.callApi(
        '/analytics/engines/vault/v3/calculations/{id}/units/{unitId}/result', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get Vault calculation result by id
     * This is the endpoint to get the result of a previously requested calculation.  If the calculation has finished computing, the body of the response will contain the requested document in JSON.
     * @param {String} id from url, provided from the location header in the Get Vault calculation status by id endpoint
     * @param {String} unitId from url, provided from the location header in the Get Vault calculation status by id endpoint
     * @return { Promise.< module:model/ObjectRoot > } a Promise, with data of type {@link module:model/ObjectRoot }
     */
    getCalculationUnitResultById(id, unitId) {
      return this.getCalculationUnitResultByIdWithHttpInfo(id, unitId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create and Run Vault calculation
     * This endpoint runs the Vault calculation specified in the POST body parameters.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration's min and max date range
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds when only one unit is passed in the POST body.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts max-stale.
     * @param {module:model/VaultCalculationParametersRoot} opts.vaultCalculationParametersRoot Calculation Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CalculationStatusRoot} and HTTP response
     */
    postAndCalculateWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['vaultCalculationParametersRoot'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'X-FactSet-Api-Long-Running-Deadline': opts['xFactSetApiLongRunningDeadline'],
        'Cache-Control': opts['cacheControl']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json', 'application/x-protobuf'];

      let returnType = PostAndCalculateResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/analytics/engines/vault/v3/calculations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create and Run Vault calculation
     * This endpoint runs the Vault calculation specified in the POST body parameters.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration's min and max date range
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds when only one unit is passed in the POST body.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts max-stale.
     * @param {module:model/VaultCalculationParametersRoot} opts.vaultCalculationParametersRoot Calculation Parameters
     * @return { Promise.< PostAndCalculateResponseWrapper > } a Promise, with data of type {@link PostAndCalculateResponseWrapper }
     */
    postAndCalculate(opts) {
      return this.postAndCalculateWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create or Update Vault calculation and run it.
     * This endpoint updates and run the Vault calculation specified in the PUT body parameters. This also allows creating new Vault calculations with custom ids.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration's min and max date range
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds when only one unit is passed in the PUT body.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts max-stale.
     * @param {module:model/VaultCalculationParametersRoot} opts.vaultCalculationParametersRoot Calculation Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CalculationStatusRoot} and HTTP response
     */
    putAndCalculateWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = opts['vaultCalculationParametersRoot'];
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling putAndCalculate");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
        'X-FactSet-Api-Long-Running-Deadline': opts['xFactSetApiLongRunningDeadline'],
        'Cache-Control': opts['cacheControl']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json', 'application/x-protobuf'];

      let returnType = PutAndCalculateResponseWrapperTypeMap;
      
      return this.apiClient.callApi(
        '/analytics/engines/vault/v3/calculations/{id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create or Update Vault calculation and run it.
     * This endpoint updates and run the Vault calculation specified in the PUT body parameters. This also allows creating new Vault calculations with custom ids.  It can take one or more units as input.    Remarks:    *   Start and and end date must be within the configuration's min and max date range
     * @param {String} id from url, provided from the location header in the Create and Run Vault calculation endpoint
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xFactSetApiLongRunningDeadline Long running deadline in seconds when only one unit is passed in the PUT body.
     * @param {String} opts.cacheControl Standard HTTP header.  Accepts max-stale.
     * @param {module:model/VaultCalculationParametersRoot} opts.vaultCalculationParametersRoot Calculation Parameters
     * @return { Promise.< PutAndCalculateResponseWrapper > } a Promise, with data of type {@link PutAndCalculateResponseWrapper }
     */
    putAndCalculate(id, opts) {
      return this.putAndCalculateWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}


const PostAndCalculateResponseWrapperTypeMap = {
  200: CalculationStatusRoot,
  201: ObjectRoot,
  202: CalculationStatusRoot,
  400: ClientErrorResponse,
  404: ClientErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new PostAndCalculateResponseWrapper(statusCode, response);
  }
};

const PutAndCalculateResponseWrapperTypeMap = {
  200: CalculationStatusRoot,
  201: ObjectRoot,
  202: CalculationStatusRoot,
  400: ClientErrorResponse,
  404: ClientErrorResponse,
  409: ClientErrorResponse,

  _createResponseWrapper(statusCode, response) {
    return new PutAndCalculateResponseWrapper(statusCode, response);
  }
};



/**
 * Wrapper to support POST /analytics/engines/vault/v3/calculations returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code CalculationStatusRoot }<br>Expected response, if the calculation has one unit and is completed with an error.</li>
 * 
 *   <li>201 : {@code ObjectRoot }<br>Expected response if the calculation has one unit and is completed in a short span, returns JSON in the format specified in the Calculation parameters.</li>
 * 
 *   <li>202 : {@code CalculationStatusRoot }<br>Expected response, contains the poll URL in the Location header.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     CalculationStatusRoot data200 = response.getResponse200();
 *     break;
 *   case 201:
 *     ObjectRoot data201 = response.getResponse201();
 *     break;
 *   case 202:
 *     CalculationStatusRoot data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:PostAndCalculateResponseWrapper
 * @class
 */
export class PostAndCalculateResponseWrapper {

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
   * @returns { CalculationStatusRoot }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { ObjectRoot }
   */
  getResponse201() {
    if (this.statusCode !== 201) {
      throw new Error("Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { CalculationStatusRoot }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}

/**
 * Wrapper to support PUT /analytics/engines/vault/v3/calculations/{id} returning different types
 * per status code.
 *
 * <p>
 * Responses:
 * <ul>
 *   <li>200 : {@code CalculationStatusRoot }<br>Expected response, if the calculation has one unit and is completed with an error.</li>
 * 
 *   <li>201 : {@code ObjectRoot }<br>Expected response if the calculation has one unit and is completed in a short span, returns JSON in the format specified in the Calculation parameters.</li>
 * 
 *   <li>202 : {@code CalculationStatusRoot }<br>Expected response, contains the poll URL in the Location header.</li>
 * </ul>
 *
 * </p>
 * Example:
 * <pre>{@code
 * const response = ...;
 * switch (response.statusCode) {
 *   case 200:
 *     CalculationStatusRoot data200 = response.getResponse200();
 *     break;
 *   case 201:
 *     ObjectRoot data201 = response.getResponse201();
 *     break;
 *   case 202:
 *     CalculationStatusRoot data202 = response.getResponse202();
 *     break;
 *  }
 * }</pre>
 *
 * @alias module:PutAndCalculateResponseWrapper
 * @class
 */
export class PutAndCalculateResponseWrapper {

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
   * @returns { CalculationStatusRoot }
   */
  getResponse200() {
    if (this.statusCode !== 200) {
      throw new Error("Invalid response getter called. getResponse200 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { ObjectRoot }
   */
  getResponse201() {
    if (this.statusCode !== 201) {
      throw new Error("Invalid response getter called. getResponse201 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
  /**
   * @returns { CalculationStatusRoot }
   */
  getResponse202() {
    if (this.statusCode !== 202) {
      throw new Error("Invalid response getter called. getResponse202 can't return a " + this.statusCode + " response");
    }

    return this.response;
  }
  
}


