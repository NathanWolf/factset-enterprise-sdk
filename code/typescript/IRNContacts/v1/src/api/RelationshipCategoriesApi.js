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
import RelationshipCategoryDto from '../model/RelationshipCategoryDto';
import RelationshipCategoryListDto from '../model/RelationshipCategoryListDto';
import RelationshipCategorySaveDto from '../model/RelationshipCategorySaveDto';

/**
* RelationshipCategories service.
* @module api/RelationshipCategoriesApi
* @version 0.9.0
*/
export default class RelationshipCategoriesApi {

    /**
    * Constructs a new RelationshipCategoriesApi. 
    * @alias module:api/RelationshipCategoriesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get list of the relationship categories configured in your group
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/RelationshipCategoryDto>} and HTTP response
     */
    v1RelationshipCategoriesGetWithHttpInfo() {
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
      let returnType = [RelationshipCategoryDto];
      return this.apiClient.callApi(
        '/v1/relationship-categories', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get list of the relationship categories configured in your group
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/RelationshipCategoryDto>}
     */
    v1RelationshipCategoriesGet() {
      return this.v1RelationshipCategoriesGetWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create a relationship category
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to save
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link String} and HTTP response
     */
    v1RelationshipCategoriesPostWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['relationshipCategorySaveDto'];

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
        '/v1/relationship-categories', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a relationship category
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to save
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link String}
     */
    v1RelationshipCategoriesPost(opts) {
      return this.v1RelationshipCategoriesPostWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a relationship category
     * @param {String} relationshipCategoryId relationshipCategoryId to delete associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    v1RelationshipCategoriesRelationshipCategoryIdDeleteWithHttpInfo(relationshipCategoryId) {
      let postBody = null;
      // verify the required parameter 'relationshipCategoryId' is set
      if (relationshipCategoryId === undefined || relationshipCategoryId === null) {
        throw new Error("Missing the required parameter 'relationshipCategoryId' when calling v1RelationshipCategoriesRelationshipCategoryIdDelete");
      }

      let pathParams = {
        'relationshipCategoryId': relationshipCategoryId
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
        '/v1/relationship-categories/{relationshipCategoryId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a relationship category
     * @param {String} relationshipCategoryId relationshipCategoryId to delete associated record
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    v1RelationshipCategoriesRelationshipCategoryIdDelete(relationshipCategoryId) {
      return this.v1RelationshipCategoriesRelationshipCategoryIdDeleteWithHttpInfo(relationshipCategoryId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Edit a relationship category
     * @param {String} relationshipCategoryId relationshipCategoryId to update associated record
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    v1RelationshipCategoriesRelationshipCategoryIdPutWithHttpInfo(relationshipCategoryId, opts) {
      opts = opts || {};
      let postBody = opts['relationshipCategorySaveDto'];
      // verify the required parameter 'relationshipCategoryId' is set
      if (relationshipCategoryId === undefined || relationshipCategoryId === null) {
        throw new Error("Missing the required parameter 'relationshipCategoryId' when calling v1RelationshipCategoriesRelationshipCategoryIdPut");
      }

      let pathParams = {
        'relationshipCategoryId': relationshipCategoryId
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
        '/v1/relationship-categories/{relationshipCategoryId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Edit a relationship category
     * @param {String} relationshipCategoryId relationshipCategoryId to update associated record
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategorySaveDto} opts.relationshipCategorySaveDto RelationshipCategorySaveDto object to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    v1RelationshipCategoriesRelationshipCategoryIdPut(relationshipCategoryId, opts) {
      return this.v1RelationshipCategoriesRelationshipCategoryIdPutWithHttpInfo(relationshipCategoryId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Reorder relationship categories
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategoryListDto} opts.relationshipCategoryListDto List of Guid
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    v1RelationshipCategoriesReorderPostWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['relationshipCategoryListDto'];

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
      let returnType = null;
      return this.apiClient.callApi(
        '/v1/relationship-categories/reorder', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Reorder relationship categories
     * @param {Object} opts Optional parameters
     * @param {module:model/RelationshipCategoryListDto} opts.relationshipCategoryListDto List of Guid
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    v1RelationshipCategoriesReorderPost(opts) {
      return this.v1RelationshipCategoriesReorderPostWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
