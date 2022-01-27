/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import FactsetTranslationAdvancedRequest from '../model/FactsetTranslationAdvancedRequest';
import FactsetTranslationAdvancedResponse from '../model/FactsetTranslationAdvancedResponse';
import FactsetTranslationRequest from '../model/FactsetTranslationRequest';
import FactsetTranslationResponse from '../model/FactsetTranslationResponse';

/**
* FactSet service.
* @module api/FactSetApi
* @version 0.9.0
*/
export default class FactSetApi {

    /**
    * Constructs a new FactSetApi. 
    * @alias module:api/FactSetApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Translate market security symbols into FactSet Permanent Identifiers
     * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.
     * @param {module:model/FactsetTranslationRequest} factsetTranslationRequest Request Body for FactSet Symbology Translation
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FactsetTranslationResponse} and HTTP response
     */
    batchTranslateFactSetWithHttpInfo(factsetTranslationRequest) {
      let postBody = factsetTranslationRequest;
      // verify the required parameter 'factsetTranslationRequest' is set
      if (factsetTranslationRequest === undefined || factsetTranslationRequest === null) {
        throw new Error("Missing the required parameter 'factsetTranslationRequest' when calling batchTranslateFactSet");
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
      let returnType = FactsetTranslationResponse;
      return this.apiClient.callApi(
        '/symbology/v2/factset', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate market security symbols into FactSet Permanent Identifiers
     * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data.
     * @param {module:model/FactsetTranslationRequest} factsetTranslationRequest Request Body for FactSet Symbology Translation
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/FactsetTranslationResponse}
     */
    batchTranslateFactSet(factsetTranslationRequest) {
      return this.batchTranslateFactSetWithHttpInfo(factsetTranslationRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Translate advanced symbol types into FactSet Permanent Identifiers
     * FactSet Advanced Symbology gives your enhanced resolution capabilities to translate a wider variety of input ids. Using the `symbolType` parameter, you are able to resolve from the below list of advanced identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themseleves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody's Ratings Identifier (e.g. 0823736553) * SPR - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) * WKN - German Securities Identification (\"Wert\") (e.g. A0MU9T) Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 
     * @param {module:model/FactsetTranslationAdvancedRequest} factsetTranslationAdvancedRequest Request Body for FactSet Symbology Translation
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FactsetTranslationAdvancedResponse} and HTTP response
     */
    batchTranslateFactSetAdvancedWithHttpInfo(factsetTranslationAdvancedRequest) {
      let postBody = factsetTranslationAdvancedRequest;
      // verify the required parameter 'factsetTranslationAdvancedRequest' is set
      if (factsetTranslationAdvancedRequest === undefined || factsetTranslationAdvancedRequest === null) {
        throw new Error("Missing the required parameter 'factsetTranslationAdvancedRequest' when calling batchTranslateFactSetAdvanced");
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
      let returnType = FactsetTranslationAdvancedResponse;
      return this.apiClient.callApi(
        '/symbology/v2/factset-advanced', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate advanced symbol types into FactSet Permanent Identifiers
     * FactSet Advanced Symbology gives your enhanced resolution capabilities to translate a wider variety of input ids. Using the `symbolType` parameter, you are able to resolve from the below list of advanced identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themseleves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody's Ratings Identifier (e.g. 0823736553) * SPR - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) * WKN - German Securities Identification (\"Wert\") (e.g. A0MU9T) Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level 
     * @param {module:model/FactsetTranslationAdvancedRequest} factsetTranslationAdvancedRequest Request Body for FactSet Symbology Translation
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/FactsetTranslationAdvancedResponse}
     */
    batchTranslateFactSetAdvanced(factsetTranslationAdvancedRequest) {
      return this.batchTranslateFactSetAdvancedWithHttpInfo(factsetTranslationAdvancedRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Translate market security symbols into FactSet Permanent Identifiers.
     * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. 
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FactsetTranslationResponse} and HTTP response
     */
    translateFactsetWithHttpInfo(ids) {
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling translateFactset");
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
      let returnType = FactsetTranslationResponse;
      return this.apiClient.callApi(
        '/symbology/v2/factset', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate market security symbols into FactSet Permanent Identifiers.
     * Translate market security symbols into FactSet Permanent Security Identifiers. The permanent identifier provides a unique record key and a convenient way to link across content sets. Additionally, if your firm does not have licenses for the symbol systems (e.g., CUSIP, SEDOL, ISIN), the permanent identifier provides a way to deliver security and listing-level data. 
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/FactsetTranslationResponse}
     */
    translateFactset(ids) {
      return this.translateFactsetWithHttpInfo(ids)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Translate advanced symbol types into FactSet Permanent Identifiers
     * FactSet Advanced Symbology gives your enhanced resolution capabilities to translate a wider variety of input ids  Using the `symbolType` parameter, you are able to resolve from the below list of advanced identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themseleves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody's Ratings Identifier (e.g. 0823736553) * SPR - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) * WKN - German Securities Identification (\"Wert\") (e.g. A0MU9T) Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level    
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.symbolType Specifies the type of symbol being requested in the `ids` parameter. **This is only required when requesting to translate from the given symbolType to a FactSet Permanent Identifier. Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun & Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody's Ratings Identifier|Entity (-E)|   |SPR|S&P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\"Valor\") Identification|Security (-S)|   |WKN|German Securities Identification (\"Wert\")|Security (-S)|   |CRN|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  (default to '')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FactsetTranslationAdvancedResponse} and HTTP response
     */
    translateFactsetAdvancedWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling translateFactsetAdvanced");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'symbolType': opts['symbolType']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = FactsetTranslationAdvancedResponse;
      return this.apiClient.callApi(
        '/symbology/v2/factset-advanced', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Translate advanced symbol types into FactSet Permanent Identifiers
     * FactSet Advanced Symbology gives your enhanced resolution capabilities to translate a wider variety of input ids  Using the `symbolType` parameter, you are able to resolve from the below list of advanced identifier types into FactSet Permanent Identifiers. Any symbol types within this category MUST be declared by themseleves to appropriately resolve.  * BIC - Bank Identification Code (e.g. ABXXHKH1) * CIK - Edgar Central Index Keys (e.g. 0000100331) * CRD - Central Registration Depository (e.g. 149722) * DUNS - Dun & Bradstreet Data Universal Numbering System (e.g. 621513451) * EIN - Employer Identification Number (e.g. 953540776) * FITCH - Fitch Ratings Identifier (e.g. 47504) * LEI - Legal Entity Identifier (e.g. 549300A6K7JX8EX2QZ33) * MD - Moody's Ratings Identifier (e.g. 0823736553) * SPR - S&P Ratings Identifier (e.g. 301939) * VALOREN - Valoren (\"Valor\") Identification (e.g. 685558) * WKN - German Securities Identification (\"Wert\") (e.g. A0MU9T) Not providing a symbolType will use FactSet Advanced Unknown logic, allowing you to resolve a mix of ids across various input id types and asset classes (Equities, Debt Instruments, Companies, Portfolios, Market Listings, and more). Input Id Types include -  * FactSet Ticker, Ticker-Region, Ticker-Exchange * FactSet Permanent Identifiers (-R, -S, -L, -E) * CUSIP * SEDOL * ISIN * Bloomberg FIGI - Regional/Security/Listing Level * Bloomberg Ticker - Regional/Listing Level    
     * @param {Array.<String>} ids Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.symbolType Specifies the type of symbol being requested in the `ids` parameter. **This is only required when requesting to translate from the given symbolType to a FactSet Permanent Identifier. Only one symbolType is permitted per request, and all ids passed in request must be of the same type.** It is expected that not all fsym* types respond with values. Every response for valid translations will include at a minimum the fsymId and requestId.   |symbolType|Description|fsymId Default Perm Type|   |---|---|---|   |BIC|Bank Identification Codes|Entity (-E)|   |CIK|Edgar Central Index Key|Entity (-E)|   |CRD|Central Registration Depository|Entity (-E)|   |DUNS|Dun & Bradstreet Data Universal Numbering System|Entity (-E)|   |EIN|Employer Identification Number|Entity (-E)|   |FITCH|Fitch Ratings Identifier|Entity (-E)|   |LEI|Legal Entity Identifier|Entity (-E)|   |MD|Moody's Ratings Identifier|Entity (-E)|   |SPR|S&P Ratings Identifier|Entity (-E)|   |VALOREN|Valoren (\"Valor\") Identification|Security (-S)|   |WKN|German Securities Identification (\"Wert\")|Security (-S)|   |CRN|UK Company House Identifier|Entity(-E)|   |RSSD|Federal Reserve RSSD Identifier|Entity(-E)|  (default to '')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/FactsetTranslationAdvancedResponse}
     */
    translateFactsetAdvanced(ids, opts) {
      return this.translateFactsetAdvancedWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
