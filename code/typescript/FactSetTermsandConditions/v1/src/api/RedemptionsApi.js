/**
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import RedemptionPricesRequest from '../model/RedemptionPricesRequest';
import RedemptionPricesResponse from '../model/RedemptionPricesResponse';

/**
* Redemptions service.
* @module api/RedemptionsApi
* @version 0.9.0
*/
export default class RedemptionsApi {

    /**
    * Constructs a new RedemptionsApi. 
    * @alias module:api/RedemptionsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Return Redemption Prices for a Fixed Income security.
     * Returns Redemption Prices for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @param {module:model/String} categories Filters the list of Redemption Prices Categories -   * **CALL** = Call prices.   * **PUT** = Put prices.   * **SF** = Sinking Fund prices. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/RedemptionPricesResponse} and HTTP response
     */
    getFixedIncomeRedemptionPricesWithHttpInfo(ids, categories) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getFixedIncomeRedemptionPrices");
      }
      // verify the required parameter 'categories' is set
      if (categories === undefined || categories === null) {
        throw new Error("Missing the required parameter 'categories' when calling getFixedIncomeRedemptionPrices");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'categories': categories
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = RedemptionPricesResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/redemption-prices', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Redemption Prices for a Fixed Income security.
     * Returns Redemption Prices for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @param {module:model/String} categories Filters the list of Redemption Prices Categories -   * **CALL** = Call prices.   * **PUT** = Put prices.   * **SF** = Sinking Fund prices. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/RedemptionPricesResponse}
     */
    getFixedIncomeRedemptionPrices(ids, categories) {
      return this.getFixedIncomeRedemptionPricesWithHttpInfo(ids, categories)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Redemption Prices for a list of Fixed Income securities.
     * Returns Redemption Prices for a list of Fixed Income securities. 
     * @param {module:model/RedemptionPricesRequest} redemptionPricesRequest Request object for Fixed Income Redemption Prices.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/RedemptionPricesResponse} and HTTP response
     */
    getFixedIncomeRedemptionPricesForListWithHttpInfo(redemptionPricesRequest) {
      let postBody = redemptionPricesRequest;
      // verify the required parameter 'redemptionPricesRequest' is set
      if (redemptionPricesRequest === undefined || redemptionPricesRequest === null) {
        throw new Error("Missing the required parameter 'redemptionPricesRequest' when calling getFixedIncomeRedemptionPricesForList");
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
      let returnType = RedemptionPricesResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/redemption-prices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Redemption Prices for a list of Fixed Income securities.
     * Returns Redemption Prices for a list of Fixed Income securities. 
     * @param {module:model/RedemptionPricesRequest} redemptionPricesRequest Request object for Fixed Income Redemption Prices.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/RedemptionPricesResponse}
     */
    getFixedIncomeRedemptionPricesForList(redemptionPricesRequest) {
      return this.getFixedIncomeRedemptionPricesForListWithHttpInfo(redemptionPricesRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
