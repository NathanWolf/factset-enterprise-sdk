/**
 * DSOTM API
 * Allow clients to send transactions data to FactSet.
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import Transactions from '../model/Transactions';

/**
* DSOTM service.
* @module api/DSOTMApi
*/
export default class DSOTMApi {

    /**
    * Constructs a new DSOTMApi. 
    * @alias module:api/DSOTMApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Push transactions data into FactSet.
     * This endpoint takes the transactions data and pushes them into FactSet.
     * @param {Object} opts Optional parameters
     * @param {module:model/Transactions} opts.transactions 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    sendTransactionsWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['transactions'];

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


      let returnType = null;

      return this.apiClient.callApi(
        '/transactions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Push transactions data into FactSet.
     * This endpoint takes the transactions data and pushes them into FactSet.
     * @param {Object} opts Optional parameters
     * @param {module:model/Transactions} opts.transactions 
     * @return { Promise } a Promise
     */
    sendTransactions(opts) {
      return this.sendTransactionsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





