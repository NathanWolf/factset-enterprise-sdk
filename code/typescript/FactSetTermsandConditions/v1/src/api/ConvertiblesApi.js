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
import ConvertibleDetailsResponse from '../model/ConvertibleDetailsResponse';
import ConvertibleHistoryResponse from '../model/ConvertibleHistoryResponse';
import ConvertibleTriggersResponse from '../model/ConvertibleTriggersResponse';
import ErrorResponse from '../model/ErrorResponse';
import TermsAndConditionsScalarRequest from '../model/TermsAndConditionsScalarRequest';

/**
* Convertibles service.
* @module api/ConvertiblesApi
* @version 0.9.0
*/
export default class ConvertiblesApi {

    /**
    * Constructs a new ConvertiblesApi. 
    * @alias module:api/ConvertiblesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Return Convertible Details for a list of Convertible Fixed Income securities.
     * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConvertibleDetailsResponse} and HTTP response
     */
    getConvertibleDetailsWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getConvertibleDetails");
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
      let returnType = ConvertibleDetailsResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/convertible-details', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Convertible Details for a list of Convertible Fixed Income securities.
     * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConvertibleDetailsResponse}
     */
    getConvertibleDetails(ids) {
      return this.getConvertibleDetailsWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Convertible Details data for a large list of Fixed Income securities.
     * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Convertible Details.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConvertibleDetailsResponse} and HTTP response
     */
    getConvertibleDetailsForListWithHttpInfo(termsAndConditionsScalarRequest) {
      let postBody = termsAndConditionsScalarRequest;
      // verify the required parameter 'termsAndConditionsScalarRequest' is set
      if (termsAndConditionsScalarRequest === undefined || termsAndConditionsScalarRequest === null) {
        throw new Error("Missing the required parameter 'termsAndConditionsScalarRequest' when calling getConvertibleDetailsForList");
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
      let returnType = ConvertibleDetailsResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/convertible-details', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Convertible Details data for a large list of Fixed Income securities.
     * Returns Convertible Details for a list of securities, such as -   * Convertible Currency   * Convertible Effective Date   * Convertible Notice Days Max and Min   * Convertible Payment Form   * Convertible Payment Details   * Convertible Payment Form Election   * Convertible Price Method   * Convertible Type   * Convertibles Ratio   * More 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Convertible Details.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConvertibleDetailsResponse}
     */
    getConvertibleDetailsForList(termsAndConditionsScalarRequest) {
      return this.getConvertibleDetailsForListWithHttpInfo(termsAndConditionsScalarRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Convertible History data for a list of Fixed Income securities.
     * Returns Convertible History data for the Fixed Income security, including - * Convertibles Price * Convertibles Effective Date 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConvertibleHistoryResponse} and HTTP response
     */
    getConvertibleHistoryWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getConvertibleHistory");
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
      let returnType = ConvertibleHistoryResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/convertible-history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Convertible History data for a list of Fixed Income securities.
     * Returns Convertible History data for the Fixed Income security, including - * Convertibles Price * Convertibles Effective Date 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConvertibleHistoryResponse}
     */
    getConvertibleHistory(ids) {
      return this.getConvertibleHistoryWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Convertible History data for a large list of Fixed Income securities.
     * Returns Convertible History data for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Issue Size.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConvertibleHistoryResponse} and HTTP response
     */
    getConvertibleHistoryForListWithHttpInfo(termsAndConditionsScalarRequest) {
      let postBody = termsAndConditionsScalarRequest;
      // verify the required parameter 'termsAndConditionsScalarRequest' is set
      if (termsAndConditionsScalarRequest === undefined || termsAndConditionsScalarRequest === null) {
        throw new Error("Missing the required parameter 'termsAndConditionsScalarRequest' when calling getConvertibleHistoryForList");
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
      let returnType = ConvertibleHistoryResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/convertible-history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Convertible History data for a large list of Fixed Income securities.
     * Returns Convertible History data for a list of Fixed Income securities. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Issue Size.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConvertibleHistoryResponse}
     */
    getConvertibleHistoryForList(termsAndConditionsScalarRequest) {
      return this.getConvertibleHistoryForListWithHttpInfo(termsAndConditionsScalarRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Convertible Triggers data for a list of Fixed Income securities.
     * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConvertibleTriggersResponse} and HTTP response
     */
    getConvertibleTriggersWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getConvertibleTriggers");
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
      let returnType = ConvertibleTriggersResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/convertible-triggers', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Convertible Triggers data for a list of Fixed Income securities.
     * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
     * @param {Array.<String>} ids List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConvertibleTriggersResponse}
     */
    getConvertibleTriggers(ids) {
      return this.getConvertibleTriggersWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Return Convertible Trigger data for a large list of Fixed Income securities.
     * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Issue Size.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ConvertibleTriggersResponse} and HTTP response
     */
    getConvertibleTriggersForListWithHttpInfo(termsAndConditionsScalarRequest) {
      let postBody = termsAndConditionsScalarRequest;
      // verify the required parameter 'termsAndConditionsScalarRequest' is set
      if (termsAndConditionsScalarRequest === undefined || termsAndConditionsScalarRequest === null) {
        throw new Error("Missing the required parameter 'termsAndConditionsScalarRequest' when calling getConvertibleTriggersForList");
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
      let returnType = ConvertibleTriggersResponse;
      return this.apiClient.callApi(
        '/factset-terms-and-conditions/v1/convertible-triggers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return Convertible Trigger data for a large list of Fixed Income securities.
     * Returns Convertible Triggers data for the Fixed Income security including the Convertible Trigger Id, Event, and Description. 
     * @param {module:model/TermsAndConditionsScalarRequest} termsAndConditionsScalarRequest Request object for Fixed Income Issue Size.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ConvertibleTriggersResponse}
     */
    getConvertibleTriggersForList(termsAndConditionsScalarRequest) {
      return this.getConvertibleTriggersForListWithHttpInfo(termsAndConditionsScalarRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
