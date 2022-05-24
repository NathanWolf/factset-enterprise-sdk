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
import CouponHistoryResponse from '../model/CouponHistoryResponse';
import CouponSchedulesResponse from '../model/CouponSchedulesResponse';
import ErrorResponse from '../model/ErrorResponse';
import TermsAndConditionsScalarRequest from '../model/TermsAndConditionsScalarRequest';

/**
* Coupons service.
* @module api/CouponsApi
* @version 0.20.0
*/
export default class CouponsApi {

    /**
    * Constructs a new CouponsApi. 
    * @alias module:api/CouponsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Return historical Coupon information for a Fixed Income security.
     * Returns historical Coupon information for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CouponHistoryResponse} and HTTP response
     */
    getCouponHistoryWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getCouponHistory");
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


      let returnType = CouponHistoryResponse;

      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/coupon-history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return historical Coupon information for a Fixed Income security.
     * Returns historical Coupon information for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return { Promise.< module:model/CouponHistoryResponse > } a Promise, with data of type {@link module:model/CouponHistoryResponse }
     */
    getCouponHistory(ids) {
      return this.getCouponHistoryWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return historical Coupon information for a list of Fixed Income securities.
     * Returns historical Coupon information for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Coupon History.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CouponHistoryResponse} and HTTP response
     */
    getCouponHistoryForListWithHttpInfo(termsAndConditionsScalarRequest) {
      let postBody = termsAndConditionsScalarRequest;
      // verify the required parameter 'termsAndConditionsScalarRequest' is set
      if (termsAndConditionsScalarRequest === undefined || termsAndConditionsScalarRequest === null) {
        throw new Error("Missing the required parameter 'termsAndConditionsScalarRequest' when calling getCouponHistoryForList");
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


      let returnType = CouponHistoryResponse;

      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/coupon-history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return historical Coupon information for a list of Fixed Income securities.
     * Returns historical Coupon information for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Coupon History.
     * @return { Promise.< module:model/CouponHistoryResponse > } a Promise, with data of type {@link module:model/CouponHistoryResponse }
     */
    getCouponHistoryForList(termsAndConditionsScalarRequest) {
      return this.getCouponHistoryForListWithHttpInfo(termsAndConditionsScalarRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Coupon Sechedules for a Fixed Income security.
     * Returns Coupon Schedules information for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CouponSchedulesResponse} and HTTP response
     */
    getCouponSchedulesWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getCouponSchedules");
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


      let returnType = CouponSchedulesResponse;

      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/coupon-schedules', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Coupon Sechedules for a Fixed Income security.
     * Returns Coupon Schedules information for the Fixed Income security. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return { Promise.< module:model/CouponSchedulesResponse > } a Promise, with data of type {@link module:model/CouponSchedulesResponse }
     */
    getCouponSchedules(ids) {
      return this.getCouponSchedulesWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Coupon Schedules information for a list of Fixed Income securities.
     * Returns historical Coupon Schedules information for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Coupon Schedules.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/CouponSchedulesResponse} and HTTP response
     */
    getCouponSchedulesForListWithHttpInfo(termsAndConditionsScalarRequest) {
      let postBody = termsAndConditionsScalarRequest;
      // verify the required parameter 'termsAndConditionsScalarRequest' is set
      if (termsAndConditionsScalarRequest === undefined || termsAndConditionsScalarRequest === null) {
        throw new Error("Missing the required parameter 'termsAndConditionsScalarRequest' when calling getCouponSchedulesForList");
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


      let returnType = CouponSchedulesResponse;

      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/coupon-schedules', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Coupon Schedules information for a list of Fixed Income securities.
     * Returns historical Coupon Schedules information for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Coupon Schedules.
     * @return { Promise.< module:model/CouponSchedulesResponse > } a Promise, with data of type {@link module:model/CouponSchedulesResponse }
     */
    getCouponSchedulesForList(termsAndConditionsScalarRequest) {
      return this.getCouponSchedulesForListWithHttpInfo(termsAndConditionsScalarRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





