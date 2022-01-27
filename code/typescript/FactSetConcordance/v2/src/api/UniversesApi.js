/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CreateUniverseRequest from '../model/CreateUniverseRequest';
import EntityUniverseStatisticsResponse from '../model/EntityUniverseStatisticsResponse';
import ErrorResponse from '../model/ErrorResponse';
import UniverseMetaResponse from '../model/UniverseMetaResponse';
import UniversesResponse from '../model/UniversesResponse';
import UpdateUniverseRequest from '../model/UpdateUniverseRequest';

/**
* Universes service.
* @module api/UniversesApi
* @version 0.9.0
*/
export default class UniversesApi {

    /**
    * Constructs a new UniversesApi. 
    * @alias module:api/UniversesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get statistics on a given universe
     * Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 
     * @param {Number} universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityUniverseStatisticsResponse} and HTTP response
     */
    getEntityUniverseStatisticsWithHttpInfo(universeId) {
      let postBody = null;
      // verify the required parameter 'universeId' is set
      if (universeId === undefined || universeId === null) {
        throw new Error("Missing the required parameter 'universeId' when calling getEntityUniverseStatistics");
      }

      let pathParams = {
      };
      let queryParams = {
        'universeId': universeId
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = EntityUniverseStatisticsResponse;
      return this.apiClient.callApi(
        '/factset-concordance/v2/entity-universe-statistics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get statistics on a given universe
     * Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings 
     * @param {Number} universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/EntityUniverseStatisticsResponse}
     */
    getEntityUniverseStatistics(universeId) {
      return this.getEntityUniverseStatisticsWithHttpInfo(universeId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create a new universe
     * Create a new universe that is distinct from any existing universe 
     * @param {module:model/CreateUniverseRequest} createUniverseRequest A request to create a user's universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UniverseMetaResponse} and HTTP response
     */
    getUniverseForListWithHttpInfo(createUniverseRequest) {
      let postBody = createUniverseRequest;
      // verify the required parameter 'createUniverseRequest' is set
      if (createUniverseRequest === undefined || createUniverseRequest === null) {
        throw new Error("Missing the required parameter 'createUniverseRequest' when calling getUniverseForList");
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
      let returnType = UniverseMetaResponse;
      return this.apiClient.callApi(
        '/factset-concordance/v2/universe', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a new universe
     * Create a new universe that is distinct from any existing universe 
     * @param {module:model/CreateUniverseRequest} createUniverseRequest A request to create a user's universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UniverseMetaResponse}
     */
    getUniverseForList(createUniverseRequest) {
      return this.getUniverseForListWithHttpInfo(createUniverseRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Fetch metadata for universes
     * Fetch information on active universes for the current user. Optionally filter for a specific universe given a `universeId` 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UniversesResponse} and HTTP response
     */
    getUniversesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'universeId': opts['universeId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = UniversesResponse;
      return this.apiClient.callApi(
        '/factset-concordance/v2/universes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fetch metadata for universes
     * Fetch information on active universes for the current user. Optionally filter for a specific universe given a `universeId` 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UniversesResponse}
     */
    getUniverses(opts) {
      return this.getUniversesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Update metadata for an existing universe
     * Update metadata for an existing universe 
     * @param {module:model/UpdateUniverseRequest} updateUniverseRequest A request to update a user's universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/UniverseMetaResponse} and HTTP response
     */
    getUpdateUniverseForListWithHttpInfo(updateUniverseRequest) {
      let postBody = updateUniverseRequest;
      // verify the required parameter 'updateUniverseRequest' is set
      if (updateUniverseRequest === undefined || updateUniverseRequest === null) {
        throw new Error("Missing the required parameter 'updateUniverseRequest' when calling getUpdateUniverseForList");
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
      let returnType = UniverseMetaResponse;
      return this.apiClient.callApi(
        '/factset-concordance/v2/update-universe', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Update metadata for an existing universe
     * Update metadata for an existing universe 
     * @param {module:model/UpdateUniverseRequest} updateUniverseRequest A request to update a user's universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/UniverseMetaResponse}
     */
    getUpdateUniverseForList(updateUniverseRequest) {
      return this.getUpdateUniverseForListWithHttpInfo(updateUniverseRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
