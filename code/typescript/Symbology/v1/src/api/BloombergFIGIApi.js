/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types. various market symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN,  SEDOL, Tickers, and Bloomberg FIGIs.   Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly  harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time. Additionally, the Symbology API provides  translation of market ids into Bloomberg FIGI. 
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
import BloombergTranslationRequest from '../model/BloombergTranslationRequest';
import BloombergTranslationResponse from '../model/BloombergTranslationResponse';
import ErrorResponse from '../model/ErrorResponse';

/**
* BloombergFIGI service.
* @module api/BloombergFIGIApi
* @version 0.8.0
*/
export default class BloombergFIGIApi {

    /**
    * Constructs a new BloombergFIGIApi. 
    * @alias module:api/BloombergFIGIApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Translate market security symbols into Bloomberg Identifiers.
     * Returns the current security, composite, and regional identifiers from Bloomberg. <p>This method is best for requesting **large universes** of `ids`.</p><p>**This endpoint is included with all other Content API packages.**</p>
     * @param {module:model/BloombergTranslationRequest} bloombergTranslationRequest Request Body for Bloomberg FIGIs.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BloombergTranslationResponse} and HTTP response
     */
    batchTranslateBloombergWithHttpInfo(bloombergTranslationRequest) {
      let postBody = bloombergTranslationRequest;
      // verify the required parameter 'bloombergTranslationRequest' is set
      if (bloombergTranslationRequest === undefined || bloombergTranslationRequest === null) {
        throw new Error("Missing the required parameter 'bloombergTranslationRequest' when calling batchTranslateBloomberg");
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
      let returnType = BloombergTranslationResponse;
      return this.apiClient.callApi(
        '/symbology/v1/bloomberg', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate market security symbols into Bloomberg Identifiers.
     * Returns the current security, composite, and regional identifiers from Bloomberg. <p>This method is best for requesting **large universes** of `ids`.</p><p>**This endpoint is included with all other Content API packages.**</p>
     * @param {module:model/BloombergTranslationRequest} bloombergTranslationRequest Request Body for Bloomberg FIGIs.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BloombergTranslationResponse}
     */
    batchTranslateBloomberg(bloombergTranslationRequest) {
      return this.batchTranslateBloombergWithHttpInfo(bloombergTranslationRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Translate FactSet symbols into Bloomberg Identifiers.
     * Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/BloombergTranslationResponse} and HTTP response
     */
    translateBloombergWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling translateBloomberg");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = BloombergTranslationResponse;
      return this.apiClient.callApi(
        '/symbology/v1/bloomberg', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate FactSet symbols into Bloomberg Identifiers.
     * Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/BloombergTranslationResponse}
     */
    translateBloomberg(ids) {
      return this.translateBloombergWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
