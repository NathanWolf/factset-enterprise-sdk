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
import SnowflakeEntityMatchRequest from '../model/SnowflakeEntityMatchRequest';
import SnowflakeEntityMatchResponse from '../model/SnowflakeEntityMatchResponse';

/**
* Snowflake service.
* @module api/SnowflakeApi
* @version 0.20.1
*/
export default class SnowflakeApi {

    /**
    * Constructs a new SnowflakeApi. 
    * @alias module:api/SnowflakeApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
     * Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
     * @param {module:model/SnowflakeEntityMatchRequest} snowflakeEntityMatchRequest A request to match an entity name and its attributes within Snowflake.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/SnowflakeEntityMatchResponse} and HTTP response
     */
    getSnowflakeEntityMatchForListWithHttpInfo(snowflakeEntityMatchRequest) {
      let postBody = snowflakeEntityMatchRequest;
      // verify the required parameter 'snowflakeEntityMatchRequest' is set
      if (snowflakeEntityMatchRequest === undefined || snowflakeEntityMatchRequest === null) {
        throw new Error("Missing the required parameter 'snowflakeEntityMatchRequest' when calling getSnowflakeEntityMatchForList");
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


      let returnType = SnowflakeEntityMatchResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/snowflake-entity-match', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
     * Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.* 
     * @param {module:model/SnowflakeEntityMatchRequest} snowflakeEntityMatchRequest A request to match an entity name and its attributes within Snowflake.
     * @return { Promise.< module:model/SnowflakeEntityMatchResponse > } a Promise, with data of type {@link module:model/SnowflakeEntityMatchResponse }
     */
    getSnowflakeEntityMatchForList(snowflakeEntityMatchRequest) {
      return this.getSnowflakeEntityMatchForListWithHttpInfo(snowflakeEntityMatchRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





