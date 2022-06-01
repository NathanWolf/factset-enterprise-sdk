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
import ErrorResponse from '../model/ErrorResponse';
import PeopleMatchRequest from '../model/PeopleMatchRequest';
import PeopleMatchesResponse from '../model/PeopleMatchesResponse';

/**
* PeopleMatch service.
* @module api/PeopleMatchApi
* @version 0.20.1
*/
export default class PeopleMatchApi {

    /**
    * Constructs a new PeopleMatchApi. 
    * @alias module:api/PeopleMatchApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Find potential people matches given a person's name.People matches can be retrieved using person's name and other attributes like firstname, middlename and lastname.
     * Finds the best people candidates matching the given name. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to  names. Otherwise, use the \"People Match - Bulk\" workflow to submit larger universes of names to be concorded via a file.</p><p> 
     * @param {String} entity Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match.
     * @param {Object} opts Optional parameters
     * @param {String} opts.personName Name of Person to match.
     * @param {String} opts.salutation Title in person's name. This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.firstName First name of person. This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.middleName Middle name of person.This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.lastName Last name of person. This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.suffix Suffix in person's name. This parameter should not be provided when the person name is provided as the input.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleMatchesResponse} and HTTP response
     */
    getPeopleMatchWithHttpInfo(entity, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'entity' is set
      if (entity === undefined || entity === null) {
        throw new Error("Missing the required parameter 'entity' when calling getPeopleMatch");
      }

      let pathParams = {
      };
      let queryParams = {
        'personName': opts['personName'],
        'salutation': opts['salutation'],
        'firstName': opts['firstName'],
        'middleName': opts['middleName'],
        'lastName': opts['lastName'],
        'suffix': opts['suffix'],
        'entity': entity
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = PeopleMatchesResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-match', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Find potential people matches given a person's name.People matches can be retrieved using person's name and other attributes like firstname, middlename and lastname.
     * Finds the best people candidates matching the given name. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to  names. Otherwise, use the \"People Match - Bulk\" workflow to submit larger universes of names to be concorded via a file.</p><p> 
     * @param {String} entity Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match.
     * @param {Object} opts Optional parameters
     * @param {String} opts.personName Name of Person to match.
     * @param {String} opts.salutation Title in person's name. This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.firstName First name of person. This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.middleName Middle name of person.This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.lastName Last name of person. This parameter should not be provided when the person name is provided as the input.
     * @param {String} opts.suffix Suffix in person's name. This parameter should not be provided when the person name is provided as the input.
     * @return { Promise.< module:model/PeopleMatchesResponse > } a Promise, with data of type {@link module:model/PeopleMatchesResponse }
     */
    getPeopleMatch(entity, opts) {
      return this.getPeopleMatchWithHttpInfo(entity, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Find potential people matches given a person's name.
     * Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a `universeId` is provided, any match for an input including a `clientId` will be saved to that universe. 
     * @param {module:model/PeopleMatchRequest} peopleMatchRequest A request to People match.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleMatchesResponse} and HTTP response
     */
    getPeopleMatchForListWithHttpInfo(peopleMatchRequest) {
      let postBody = peopleMatchRequest;
      // verify the required parameter 'peopleMatchRequest' is set
      if (peopleMatchRequest === undefined || peopleMatchRequest === null) {
        throw new Error("Missing the required parameter 'peopleMatchRequest' when calling getPeopleMatchForList");
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
      let contentTypes = ['application/json;charset=utf-8'];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = PeopleMatchesResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-match', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Find potential people matches given a person's name.
     * Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a `universeId` is provided, any match for an input including a `clientId` will be saved to that universe. 
     * @param {module:model/PeopleMatchRequest} peopleMatchRequest A request to People match.
     * @return { Promise.< module:model/PeopleMatchesResponse > } a Promise, with data of type {@link module:model/PeopleMatchesResponse }
     */
    getPeopleMatchForList(peopleMatchRequest) {
      return this.getPeopleMatchForListWithHttpInfo(peopleMatchRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





