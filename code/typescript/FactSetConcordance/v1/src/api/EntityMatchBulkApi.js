/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import EntityDecisionsResponse from '../model/EntityDecisionsResponse';
import EntityTaskResponse from '../model/EntityTaskResponse';
import EntityTaskStatusResponse from '../model/EntityTaskStatusResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* EntityMatchBulk service.
* @module api/EntityMatchBulkApi
* @version 0.8.2
*/
export default class EntityMatchBulkApi {

    /**
    * Constructs a new EntityMatchBulkApi. 
    * @alias module:api/EntityMatchBulkApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Input a file with names and attributes, creating a taskId.
     * Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a `taskId`. The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful. <p> **Number of ids is limited to 10,000 ids per upload file.** </p><p>This is the first step in the overall \"Bulk\" workflow. Use the /entity-task-status endpoint to check the status.</p> 
     * @param {String} taskName User defined name for the task that will be used to name the output files.
     * @param {File} inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. Only 10,001 rows are accepted, including the Header row. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
     * @param {String} clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
     * @param {String} nameColumn Header name of the column in the input file that contains the Entity Name to be matched. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.countryColumn Header Name of the column in the input file that contains the country's ISO Code. This is used to filter the candidates before taking a match decision. 
     * @param {String} opts.urlColumn Header Name of the column in the input file that contains the Entity's URL. URL corresponding to the entity name that is used when evaluating candidates for a match. 
     * @param {String} opts.stateColumn Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported. 
     * @param {Array.<String>} opts.includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
     * @param {Array.<String>} opts.excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within `inputFile`.** 
     * @param {Array.<String>} opts.includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
     * @param {Array.<String>} opts.excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityTaskResponse} and HTTP response
     */
    createEntityTaskWithHttpInfo(taskName, inputFile, clientIdColumn, nameColumn, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'taskName' is set
      if (taskName === undefined || taskName === null) {
        throw new Error("Missing the required parameter 'taskName' when calling createEntityTask");
      }
      // verify the required parameter 'inputFile' is set
      if (inputFile === undefined || inputFile === null) {
        throw new Error("Missing the required parameter 'inputFile' when calling createEntityTask");
      }
      // verify the required parameter 'clientIdColumn' is set
      if (clientIdColumn === undefined || clientIdColumn === null) {
        throw new Error("Missing the required parameter 'clientIdColumn' when calling createEntityTask");
      }
      // verify the required parameter 'nameColumn' is set
      if (nameColumn === undefined || nameColumn === null) {
        throw new Error("Missing the required parameter 'nameColumn' when calling createEntityTask");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'taskName': taskName,
        'inputFile': inputFile,
        'clientIdColumn': clientIdColumn,
        'nameColumn': nameColumn,
        'countryColumn': opts['countryColumn'],
        'urlColumn': opts['urlColumn'],
        'stateColumn': opts['stateColumn'],
        'includeEntityType': this.apiClient.buildCollectionParam(opts['includeEntityType'], 'csv'),
        'excludeEntityType': this.apiClient.buildCollectionParam(opts['excludeEntityType'], 'csv'),
        'includeEntitySubType': this.apiClient.buildCollectionParam(opts['includeEntitySubType'], 'csv'),
        'excludeEntitySubType': this.apiClient.buildCollectionParam(opts['excludeEntitySubType'], 'csv')
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = EntityTaskResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v1/entity-task', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Input a file with names and attributes, creating a taskId.
     * Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a `taskId`. The taskId is then used for reference in the *_/entity-task-status* and *_/entity-decisions* endpoints to receive results once the task is successful. <p> **Number of ids is limited to 10,000 ids per upload file.** </p><p>This is the first step in the overall \"Bulk\" workflow. Use the /entity-task-status endpoint to check the status.</p> 
     * @param {String} taskName User defined name for the task that will be used to name the output files.
     * @param {File} inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. Only 10,001 rows are accepted, including the Header row. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
     * @param {String} clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
     * @param {String} nameColumn Header name of the column in the input file that contains the Entity Name to be matched. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.countryColumn Header Name of the column in the input file that contains the country's ISO Code. This is used to filter the candidates before taking a match decision. 
     * @param {String} opts.urlColumn Header Name of the column in the input file that contains the Entity's URL. URL corresponding to the entity name that is used when evaluating candidates for a match. 
     * @param {String} opts.stateColumn Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported. 
     * @param {Array.<String>} opts.includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
     * @param {Array.<String>} opts.excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within `inputFile`.** 
     * @param {Array.<String>} opts.includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
     * @param {Array.<String>} opts.excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.** 
     * @return { Promise.< module:model/EntityTaskResponse > } a Promise, with data of type {@link module:model/EntityTaskResponse }
     */
    createEntityTask(taskName, inputFile, clientIdColumn, nameColumn, opts) {
      return this.createEntityTaskWithHttpInfo(taskName, inputFile, clientIdColumn, nameColumn, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get the decisions of matches for the requested taskId.
     * Retrieves the `Decision` objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the status of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). 
     * @param {Number} taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityDecisionsResponse} and HTTP response
     */
    getEntityDecisionsWithHttpInfo(taskId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'taskId' is set
      if (taskId === undefined || taskId === null) {
        throw new Error("Missing the required parameter 'taskId' when calling getEntityDecisions");
      }

      let pathParams = {
      };
      let queryParams = {
        'taskId': taskId,
        'offset': opts['offset'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = EntityDecisionsResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v1/entity-decisions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get the decisions of matches for the requested taskId.
     * Retrieves the `Decision` objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the status of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). 
     * @param {Number} taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @return { Promise.< module:model/EntityDecisionsResponse > } a Promise, with data of type {@link module:model/EntityDecisionsResponse }
     */
    getEntityDecisions(taskId, opts) {
      return this.getEntityDecisionsWithHttpInfo(taskId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets the status of the requested taskId or all tasks for a User
     * Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @param {Array.<module:model/String>} opts.status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EntityTaskStatusResponse} and HTTP response
     */
    getEntityTaskStatusWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'taskId': opts['taskId'],
        'offset': opts['offset'],
        'limit': opts['limit'],
        'status': this.apiClient.buildCollectionParam(opts['status'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = EntityTaskStatusResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v1/entity-task-status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets the status of the requested taskId or all tasks for a User
     * Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.taskId Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @param {Array.<module:model/String>} opts.status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @return { Promise.< module:model/EntityTaskStatusResponse > } a Promise, with data of type {@link module:model/EntityTaskStatusResponse }
     */
    getEntityTaskStatus(opts) {
      return this.getEntityTaskStatusWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





