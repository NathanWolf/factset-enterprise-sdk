/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
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
import FrequencyRoot from '../model/FrequencyRoot';

/**
* Frequencies service.
* @module api/FrequenciesApi
* @version 0.20.0
*/
export default class FrequenciesApi {

    /**
    * Constructs a new FrequenciesApi. 
    * @alias module:api/FrequenciesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get PA frequencies
     * This endpoint lists all the frequencies that can be applied to a PA calculation.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FrequencyRoot} and HTTP response
     */
    getPAFrequenciesWithHttpInfo() {
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


      let returnType = FrequencyRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/frequencies', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA frequencies
     * This endpoint lists all the frequencies that can be applied to a PA calculation.
     * @return { Promise.< module:model/FrequencyRoot > } a Promise, with data of type {@link module:model/FrequencyRoot }
     */
    getPAFrequencies() {
      return this.getPAFrequenciesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





