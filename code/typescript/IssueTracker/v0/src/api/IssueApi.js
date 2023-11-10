/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CommentRequest from '../model/CommentRequest';
import ErrorResponse from '../model/ErrorResponse';
import IdResponse from '../model/IdResponse';
import Issue from '../model/Issue';
import IssueRequest from '../model/IssueRequest';

/**
* Issue service.
* @module api/IssueApi
*/
export default class IssueApi {

    /**
    * Constructs a new IssueApi. 
    * @alias module:api/IssueApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get the matched issue details
     * Retrieve the information of the client with the matching issue Id.
     * @param {String} id   ID of Issue Tracker issue
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Issue} and HTTP response
     */
    getIssueWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getIssue");
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


      let returnType = Issue;

      return this.apiClient.callApi(
        '/issues/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get the matched issue details
     * Retrieve the information of the client with the matching issue Id.
     * @param {String} id   ID of Issue Tracker issue
     * @return { Promise.< module:model/Issue > } a Promise, with data of type {@link module:model/Issue }
     */
    getIssue(id) {
      return this.getIssueWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Creates a Issue Tracker issue
     * Creates a new issue in Issue Tracker
     * @param {Object} opts Optional parameters
     * @param {module:model/IssueRequest} opts.issueRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/IdResponse} and HTTP response
     */
    postIssueWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['issueRequest'];

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


      let returnType = IdResponse;

      return this.apiClient.callApi(
        '/issues', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a Issue Tracker issue
     * Creates a new issue in Issue Tracker
     * @param {Object} opts Optional parameters
     * @param {module:model/IssueRequest} opts.issueRequest 
     * @return { Promise.< module:model/IdResponse > } a Promise, with data of type {@link module:model/IdResponse }
     */
    postIssue(opts) {
      return this.postIssueWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * post comment to Issue Tracker issue
     * Reply to the existing matched issue 
     * @param {String} id ID of Issue Tracker issue
     * @param {Object} opts Optional parameters
     * @param {module:model/CommentRequest} opts.commentRequest 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/IdResponse} and HTTP response
     */
    postReplyWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = opts['commentRequest'];
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling postReply");
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
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = IdResponse;

      return this.apiClient.callApi(
        '/issues/{id}/comments', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * post comment to Issue Tracker issue
     * Reply to the existing matched issue 
     * @param {String} id ID of Issue Tracker issue
     * @param {Object} opts Optional parameters
     * @param {module:model/CommentRequest} opts.commentRequest 
     * @return { Promise.< module:model/IdResponse > } a Promise, with data of type {@link module:model/IdResponse }
     */
    postReply(id, opts) {
      return this.postReplyWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





