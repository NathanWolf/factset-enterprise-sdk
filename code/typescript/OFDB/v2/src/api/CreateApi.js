/**
 * OFDB API
 * OFDB API
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
import CreateDatabase from '../model/CreateDatabase';
import DatabaseSchema from '../model/DatabaseSchema';
import InlineResponse202 from '../model/InlineResponse202';
import InlineResponse400 from '../model/InlineResponse400';
import InlineResponse403 from '../model/InlineResponse403';
import InlineResponse404 from '../model/InlineResponse404';
import InlineResponse406 from '../model/InlineResponse406';
import InlineResponse429 from '../model/InlineResponse429';

/**
* Create service.
* @module api/CreateApi
*/
export default class CreateApi {

    /**
    * Constructs a new CreateApi. 
    * @alias module:api/CreateApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Creates a 2d or 3d database(OFDB)
     * @param {Object} opts Optional parameters
     * @param {module:model/DatabaseSchema} opts.databaseSchema 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CreateDatabase} and HTTP response
     */
    createDatabaseWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['databaseSchema'];

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


      let returnType = CreateDatabase;

      return this.apiClient.callApi(
        '/database', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Creates a 2d or 3d database(OFDB)
     * @param {Object} opts Optional parameters
     * @param {module:model/DatabaseSchema} opts.databaseSchema 
     * @return { Promise.< module:model/CreateDatabase > } a Promise, with data of type {@link module:model/CreateDatabase }
     */
    createDatabase(opts) {
      return this.createDatabaseWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





