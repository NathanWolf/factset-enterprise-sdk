/**
 * IRN API v1
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ProblemDetails from '../model/ProblemDetails';
import RelationshipDto from '../model/RelationshipDto';
import RelationshipSaveDto from '../model/RelationshipSaveDto';
import RelationshipType from '../model/RelationshipType';

/**
* Relationships service.
* @module api/RelationshipsApi
* @version 0.9.0
*/
export default class RelationshipsApi {

    /**
    * Constructs a new RelationshipsApi. 
    * @alias module:api/RelationshipsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get list of the relationships configured in your group
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipType} opts.type 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RelationshipDto>} and HTTP response
     */
    v1RelationshipsGetWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'type': opts['type']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [RelationshipDto];
      return this.apiClient.callApi(
        '/v1/relationships', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get list of the relationships configured in your group
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipType} opts.type 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RelationshipDto>}
     */
    v1RelationshipsGet(opts) {
      return this.v1RelationshipsGetWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create a relationship type
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipSaveDto} opts.relationshipSaveDto RelationshipSaveDto object to save
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link String} and HTTP response
     */
    v1RelationshipsPostWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['relationshipSaveDto'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];
      let returnType = 'String';
      return this.apiClient.callApi(
        '/v1/relationships', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a relationship type
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipSaveDto} opts.relationshipSaveDto RelationshipSaveDto object to save
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link String}
     */
    v1RelationshipsPost(opts) {
      return this.v1RelationshipsPostWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a relationship type
     * @param {String} relationshipId relationshipId to delete associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    v1RelationshipsRelationshipIdDeleteWithHttpInfo(relationshipId) {
      let postBody = null;
      // verify the required parameter 'relationshipId' is set
      if (relationshipId === undefined || relationshipId === null) {
        throw new Error("Missing the required parameter 'relationshipId' when calling v1RelationshipsRelationshipIdDelete");
      }

      let pathParams = {
        'relationshipId': relationshipId
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
      let returnType = null;
      return this.apiClient.callApi(
        '/v1/relationships/{relationshipId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a relationship type
     * @param {String} relationshipId relationshipId to delete associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    v1RelationshipsRelationshipIdDelete(relationshipId) {
      return this.v1RelationshipsRelationshipIdDeleteWithHttpInfo(relationshipId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Edit a relationship type
     * @param {String} relationshipId relationshipId to update associated record
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipSaveDto} opts.relationshipSaveDto RelationshipSaveDto object to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    v1RelationshipsRelationshipIdPutWithHttpInfo(relationshipId, opts) {
      opts = opts || {};
      let postBody = opts['relationshipSaveDto'];
      // verify the required parameter 'relationshipId' is set
      if (relationshipId === undefined || relationshipId === null) {
        throw new Error("Missing the required parameter 'relationshipId' when calling v1RelationshipsRelationshipIdPut");
      }

      let pathParams = {
        'relationshipId': relationshipId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/v1/relationships/{relationshipId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Edit a relationship type
     * @param {String} relationshipId relationshipId to update associated record
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipSaveDto} opts.relationshipSaveDto RelationshipSaveDto object to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    v1RelationshipsRelationshipIdPut(relationshipId, opts) {
      return this.v1RelationshipsRelationshipIdPutWithHttpInfo(relationshipId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
