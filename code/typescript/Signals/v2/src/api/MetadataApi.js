/**
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: signals.api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import SignalDefinition from '../model/SignalDefinition';
import SignalMetaData from '../model/SignalMetaData';

/**
* Metadata service.
* @module api/MetadataApi
* @version 0.20.0
*/
export default class MetadataApi {

    /**
    * Constructs a new MetadataApi. 
    * @alias module:api/MetadataApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Fetch a list of available signal categories
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SignalMetaData} and HTTP response
     */
    getCategoriesWithHttpInfo() {
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


      let returnType = SignalMetaData;

      return this.apiClient.callApi(
        '/categories', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fetch a list of available signal categories
     * @return { Promise.< module:model/SignalMetaData > } a Promise, with data of type {@link module:model/SignalMetaData }
     */
    getCategories() {
      return this.getCategoriesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Fetch a list of all active signals
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SignalMetaData} and HTTP response
     */
    getDataDictionaryWithHttpInfo() {
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


      let returnType = SignalMetaData;

      return this.apiClient.callApi(
        '/data-dictionary', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fetch a list of all active signals
     * @return { Promise.< module:model/SignalMetaData > } a Promise, with data of type {@link module:model/SignalMetaData }
     */
    getDataDictionary() {
      return this.getDataDictionaryWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Fetch the metadata and contract for the requested signal
     * @param {String} signalId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SignalDefinition} and HTTP response
     */
    getDataDictionaryByIdWithHttpInfo(signalId) {
      let postBody = null;
      // verify the required parameter 'signalId' is set
      if (signalId === undefined || signalId === null) {
        throw new Error("Missing the required parameter 'signalId' when calling getDataDictionaryById");
      }

      let pathParams = {
        'signalId': signalId
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


      let returnType = SignalDefinition;

      return this.apiClient.callApi(
        '/data-dictionary/{signalId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fetch the metadata and contract for the requested signal
     * @param {String} signalId 
     * @return { Promise.< module:model/SignalDefinition > } a Promise, with data of type {@link module:model/SignalDefinition }
     */
    getDataDictionaryById(signalId) {
      return this.getDataDictionaryByIdWithHttpInfo(signalId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Fetch a list of available signal themes
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SignalMetaData} and HTTP response
     */
    getThemesWithHttpInfo() {
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


      let returnType = SignalMetaData;

      return this.apiClient.callApi(
        '/themes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fetch a list of available signal themes
     * @return { Promise.< module:model/SignalMetaData > } a Promise, with data of type {@link module:model/SignalMetaData }
     */
    getThemes() {
      return this.getThemesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





