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
import EntityMappingDeleteRequest from '../model/EntityMappingDeleteRequest';
import EntityMappingDeleteResponse from '../model/EntityMappingDeleteResponse';
import EntityMappingRequest from '../model/EntityMappingRequest';
import EntityResponse from '../model/EntityResponse';
import EntityUniverseRequest from '../model/EntityUniverseRequest';
import EntityUniverseResponse from '../model/EntityUniverseResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* Mappings service.
* @module api/MappingsApi
* @version 0.20.1
*/
export default class MappingsApi {

    /**
    * Constructs a new MappingsApi. 
    * @alias module:api/MappingsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Deletes mapping specified by the client.
     * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
     * @param {module:model/EntityMappingDeleteRequest} entityMappingDeleteRequest A request to delete entity mappings specified by the client
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityMappingDeleteResponse} and HTTP response
     */
    getEntityMappingDeleteForListWithHttpInfo(entityMappingDeleteRequest) {
      let postBody = entityMappingDeleteRequest;
      // verify the required parameter 'entityMappingDeleteRequest' is set
      if (entityMappingDeleteRequest === undefined || entityMappingDeleteRequest === null) {
        throw new Error("Missing the required parameter 'entityMappingDeleteRequest' when calling getEntityMappingDeleteForList");
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


      let returnType = EntityMappingDeleteResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/entity-mapping-delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Deletes mapping specified by the client.
     * Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required. 
     * @param {module:model/EntityMappingDeleteRequest} entityMappingDeleteRequest A request to delete entity mappings specified by the client
     * @return { Promise.< module:model/EntityMappingDeleteResponse > } a Promise, with data of type {@link module:model/EntityMappingDeleteResponse }
     */
    getEntityMappingDeleteForList(entityMappingDeleteRequest) {
      return this.getEntityMappingDeleteForListWithHttpInfo(entityMappingDeleteRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Saves a single-mapping specified by the client.
     * Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
     * @param {module:model/EntityMappingRequest} entityMappingRequest A request to create a single mapping.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityResponse} and HTTP response
     */
    getEntityMappingForListWithHttpInfo(entityMappingRequest) {
      let postBody = entityMappingRequest;
      // verify the required parameter 'entityMappingRequest' is set
      if (entityMappingRequest === undefined || entityMappingRequest === null) {
        throw new Error("Missing the required parameter 'entityMappingRequest' when calling getEntityMappingForList");
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


      let returnType = EntityResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/entity-mapping', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Saves a single-mapping specified by the client.
     * Saves a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required. 
     * @param {module:model/EntityMappingRequest} entityMappingRequest A request to create a single mapping.
     * @return { Promise.< module:model/EntityResponse > } a Promise, with data of type {@link module:model/EntityResponse }
     */
    getEntityMappingForList(entityMappingRequest) {
      return this.getEntityMappingForListWithHttpInfo(entityMappingRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all saved mappings within a requested universe
     * Retrieves all entity mappings within a requested universe. 
     * @param {Number} universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.clientId Filter by the clientId(s) created by the user in a previous mapping. 
     * @param {Array.<module:model/String>} opts.mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityUniverseResponse} and HTTP response
     */
    getEntityUniverseWithHttpInfo(universeId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'universeId' is set
      if (universeId === undefined || universeId === null) {
        throw new Error("Missing the required parameter 'universeId' when calling getEntityUniverse");
      }

      let pathParams = {
      };
      let queryParams = {
        'universeId': universeId,
        'clientId': this.apiClient.buildCollectionParam(opts['clientId'], 'csv'),
        'mapStatus': this.apiClient.buildCollectionParam(opts['mapStatus'], 'multi'),
        'offset': opts['offset'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = EntityUniverseResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/entity-universe', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all saved mappings within a requested universe
     * Retrieves all entity mappings within a requested universe. 
     * @param {Number} universeId Universe identifier. *To create a universe, use the `/universe' endpoint.*
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.clientId Filter by the clientId(s) created by the user in a previous mapping. 
     * @param {Array.<module:model/String>} opts.mapStatus Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @return { Promise.< module:model/EntityUniverseResponse > } a Promise, with data of type {@link module:model/EntityUniverseResponse }
     */
    getEntityUniverse(universeId, opts) {
      return this.getEntityUniverseWithHttpInfo(universeId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all saved mappings within a requested universe or large list of client ids
     * Retrieves all entity mappings that were saved in a given universe. Supports filtering by a large number of `clientId`s 
     * @param {module:model/EntityUniverseRequest} entityUniverseRequest A request to fetch all entities of a given universe
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityUniverseResponse} and HTTP response
     */
    getEntityUniverseForListWithHttpInfo(entityUniverseRequest) {
      let postBody = entityUniverseRequest;
      // verify the required parameter 'entityUniverseRequest' is set
      if (entityUniverseRequest === undefined || entityUniverseRequest === null) {
        throw new Error("Missing the required parameter 'entityUniverseRequest' when calling getEntityUniverseForList");
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


      let returnType = EntityUniverseResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/entity-universe', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all saved mappings within a requested universe or large list of client ids
     * Retrieves all entity mappings that were saved in a given universe. Supports filtering by a large number of `clientId`s 
     * @param {module:model/EntityUniverseRequest} entityUniverseRequest A request to fetch all entities of a given universe
     * @return { Promise.< module:model/EntityUniverseResponse > } a Promise, with data of type {@link module:model/EntityUniverseResponse }
     */
    getEntityUniverseForList(entityUniverseRequest) {
      return this.getEntityUniverseForListWithHttpInfo(entityUniverseRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





