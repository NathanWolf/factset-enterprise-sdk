/**
 * FactSet Exchange Traded Funds API
 * FactSet ETF data feeds provide complete and accurate security, fund and reference data across the universe of exchange-traded products. Data is sourced from ETF providers across the globe and includes more than 100 unique data points, resulting in comprehensive coverage to help you evaluate and construct ETFs, analyze potential trades, and perform fund research.<p> FactSet Reference and Analytics data uses FactSet's FCS, which categorizes exchange-traded products using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. ETF exposure details are presented on successively granular levels-  category, then focus, and then niche.</p> <p>Moreover, FactSet ETF Reference data captures over 100 unique data points and provides market-specific data if you wish to solely focus on U.S., Canadian, Australian, New Zealand, Singapore, Hong Kong or European exchanges. All data points are grouped in one of two levels, either as a Fund or as a Listing. However, FactSet ETF Analytics data is primarily available for U.S.-domiciled ETFs. A subset of reference data items are provided for European-domiciled funds. For a full breakout of regional availability and history, see Formula Definitions and Calculations.</p> 
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
import Category from '../model/Category';
import ErrorResponse from '../model/ErrorResponse';
import EtfReferenceDataRequest from '../model/EtfReferenceDataRequest';
import EtfReferenceDataResponse from '../model/EtfReferenceDataResponse';

/**
* Reference service.
* @module api/ReferenceApi
* @version 0.20.0
*/
export default class ReferenceApi {

    /**
    * Constructs a new ReferenceApi. 
    * @alias module:api/ReferenceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Return reference data for an ETF.
     * Returns reference data items for Exchange Traded Funds. 
     * @param {Array.<String>} ids The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.metrics List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint. 
     * @param {Array.<module:model/Category>} opts.categories Groupings of `metrics` data items. Supply a list of categories below to return collections of data items in response. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.| 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EtfReferenceDataResponse} and HTTP response
     */
    getEtfReferenceDataWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getEtfReferenceData");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'metrics': this.apiClient.buildCollectionParam(opts['metrics'], 'csv'),
        'categories': this.apiClient.buildCollectionParam(opts['categories'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = EtfReferenceDataResponse;

      return this.apiClient.callApi(
        '/factset-etf/v1/reference', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Return reference data for an ETF.
     * Returns reference data items for Exchange Traded Funds. 
     * @param {Array.<String>} ids The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.metrics List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint. 
     * @param {Array.<module:model/Category>} opts.categories Groupings of `metrics` data items. Supply a list of categories below to return collections of data items in response. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.| 
     * @return { Promise.< module:model/EtfReferenceDataResponse > } a Promise, with data of type {@link module:model/EtfReferenceDataResponse }
     */
    getEtfReferenceData(ids, opts) {
      return this.getEtfReferenceDataWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Fetch Reference Data for a large list of ETF securities.
     * Returns reference data items for a list of Exchange Traded Funds. 
     * @param {module:model/EtfReferenceDataRequest} etfReferenceDataRequest Request object for Exchange Traded Funds
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EtfReferenceDataResponse} and HTTP response
     */
    getEtfReferenceDataForListWithHttpInfo(etfReferenceDataRequest) {
      let postBody = etfReferenceDataRequest;
      // verify the required parameter 'etfReferenceDataRequest' is set
      if (etfReferenceDataRequest === undefined || etfReferenceDataRequest === null) {
        throw new Error("Missing the required parameter 'etfReferenceDataRequest' when calling getEtfReferenceDataForList");
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


      let returnType = EtfReferenceDataResponse;

      return this.apiClient.callApi(
        '/factset-etf/v1/reference', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Fetch Reference Data for a large list of ETF securities.
     * Returns reference data items for a list of Exchange Traded Funds. 
     * @param {module:model/EtfReferenceDataRequest} etfReferenceDataRequest Request object for Exchange Traded Funds
     * @return { Promise.< module:model/EtfReferenceDataResponse > } a Promise, with data of type {@link module:model/EtfReferenceDataResponse }
     */
    getEtfReferenceDataForList(etfReferenceDataRequest) {
      return this.getEtfReferenceDataForListWithHttpInfo(etfReferenceDataRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





