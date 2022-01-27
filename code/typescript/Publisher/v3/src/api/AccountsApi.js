/**
 * Publisher API
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import AccountDirectoriesRoot from '../model/AccountDirectoriesRoot';

/**
* Accounts service.
* @module api/AccountsApi
* @version 0.9.0
*/
export default class AccountsApi {

    /**
    * Constructs a new AccountsApi. 
    * @alias module:api/AccountsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get accounts and sub-directories in a directory
     * This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
     * @param {String} path The directory to get the accounts and sub-directories in
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/AccountDirectoriesRoot} and HTTP response
     */
    getAccountsWithHttpInfo(path) {
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling getAccounts");
      }

      let pathParams = {
        'path': path
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
      let returnType = AccountDirectoriesRoot;
      return this.apiClient.callApi(
        '/analytics/lookups/v3/accounts/{path}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get accounts and sub-directories in a directory
     * This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
     * @param {String} path The directory to get the accounts and sub-directories in
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/AccountDirectoriesRoot}
     */
    getAccounts(path) {
      return this.getAccountsWithHttpInfo(path)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
