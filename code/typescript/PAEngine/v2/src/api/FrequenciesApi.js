/**
 * PA Engine API
 * Allow clients to fetch PA Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Frequency from '../model/Frequency';

/**
* Frequencies service.
* @module api/FrequenciesApi
* @version 0.8.2
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
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Object.<String, module:model/{String: Frequency}>} and HTTP response
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


      let returnType = {'String': Frequency};

      return this.apiClient.callApi(
        '/analytics/lookups/v2/engines/pa/frequencies', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA frequencies
     * This endpoint lists all the frequencies that can be applied to a PA calculation.
     * @return { Promise.< Object.<String, module:model/{String: Frequency}> > } a Promise, with data of type {@link Object.<String, module:model/{String: Frequency}> }
     */
    getPAFrequencies() {
      return this.getPAFrequenciesWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





