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
import ClientErrorResponse from '../model/ClientErrorResponse';
import PAPricingSourceRoot from '../model/PAPricingSourceRoot';

/**
* PricingSources service.
* @module api/PricingSourcesApi
* @version 0.20.0
*/
export default class PricingSourcesApi {

    /**
    * Constructs a new PricingSourcesApi. 
    * @alias module:api/PricingSourcesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get PA pricing sources
     * This endpoint lists all the PA pricing sources that can be applied to a PA calculation.
     * @param {Object} opts Optional parameters
     * @param {String} opts.name PA pricing sources name (default to '')
     * @param {String} opts.category PA pricing sources category (default to '')
     * @param {String} opts.directory The directory to get the PA pricing sources in (default to '')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PAPricingSourceRoot} and HTTP response
     */
    getPAPricingSourcesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'name': opts['name'],
        'category': opts['category'],
        'directory': opts['directory']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = PAPricingSourceRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/pricing-sources', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get PA pricing sources
     * This endpoint lists all the PA pricing sources that can be applied to a PA calculation.
     * @param {Object} opts Optional parameters
     * @param {String} opts.name PA pricing sources name (default to '')
     * @param {String} opts.category PA pricing sources category (default to '')
     * @param {String} opts.directory The directory to get the PA pricing sources in (default to '')
     * @return { Promise.< module:model/PAPricingSourceRoot > } a Promise, with data of type {@link module:model/PAPricingSourceRoot }
     */
    getPAPricingSources(opts) {
      return this.getPAPricingSourcesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





