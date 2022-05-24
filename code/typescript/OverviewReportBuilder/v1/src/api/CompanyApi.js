/**
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import ErrorResponse from '../model/ErrorResponse';
import PeerListResponse from '../model/PeerListResponse';
import ProfileResponse from '../model/ProfileResponse';
import StachTableResponse from '../model/StachTableResponse';

/**
* Company service.
* @module api/CompanyApi
* @version 0.20.0
*/
export default class CompanyApi {

    /**
    * Constructs a new CompanyApi. 
    * @alias module:api/CompanyApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Current Capitalization
     * @param {String} id Company ticker
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/StachTableResponse} and HTTP response
     */
    currentCapGetWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling currentCapGet");
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


      let returnType = StachTableResponse;

      return this.apiClient.callApi(
        '/current-cap', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Current Capitalization
     * @param {String} id Company ticker
     * @return { Promise.< module:model/StachTableResponse > } a Promise, with data of type {@link module:model/StachTableResponse }
     */
    currentCapGet(id) {
      return this.currentCapGetWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Financial / Estimate Highlights
     * @param {String} id Company ticker
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/StachTableResponse} and HTTP response
     */
    financialHighlightsGetWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling financialHighlightsGet");
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


      let returnType = StachTableResponse;

      return this.apiClient.callApi(
        '/financial-highlights', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Financial / Estimate Highlights
     * @param {String} id Company ticker
     * @return { Promise.< module:model/StachTableResponse > } a Promise, with data of type {@link module:model/StachTableResponse }
     */
    financialHighlightsGet(id) {
      return this.financialHighlightsGetWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Overview Profile
     * @param {String} id Company ticker
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ProfileResponse} and HTTP response
     */
    getProfileProfileWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getProfileProfile");
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


      let returnType = ProfileResponse;

      return this.apiClient.callApi(
        '/profile', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Overview Profile
     * @param {String} id Company ticker
     * @return { Promise.< module:model/ProfileResponse > } a Promise, with data of type {@link module:model/ProfileResponse }
     */
    getProfileProfile(id) {
      return this.getProfileProfileWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Peer List
     * @param {String} id Company ticker
     * @param {Object} opts Optional parameters
     * @param {Number} opts.topn Limits the number of peers returned.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeerListResponse} and HTTP response
     */
    peerListGetWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling peerListGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        'topn': opts['topn']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = PeerListResponse;

      return this.apiClient.callApi(
        '/peer-list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Peer List
     * @param {String} id Company ticker
     * @param {Object} opts Optional parameters
     * @param {Number} opts.topn Limits the number of peers returned.
     * @return { Promise.< module:model/PeerListResponse > } a Promise, with data of type {@link module:model/PeerListResponse }
     */
    peerListGet(id, opts) {
      return this.peerListGetWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Transactions
     * @param {String} id Company ticker
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/StachTableResponse} and HTTP response
     */
    transactionsGetWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling transactionsGet");
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


      let returnType = StachTableResponse;

      return this.apiClient.callApi(
        '/transactions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Transactions
     * @param {String} id Company ticker
     * @return { Promise.< module:model/StachTableResponse > } a Promise, with data of type {@link module:model/StachTableResponse }
     */
    transactionsGet(id) {
      return this.transactionsGetWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





