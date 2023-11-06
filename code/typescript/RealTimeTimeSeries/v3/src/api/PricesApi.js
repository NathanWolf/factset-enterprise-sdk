/**
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import InlineResponse20010 from '../model/InlineResponse20010';
import InlineResponse2005 from '../model/InlineResponse2005';
import InlineResponse2006 from '../model/InlineResponse2006';
import InlineResponse2007 from '../model/InlineResponse2007';
import InlineResponse2008 from '../model/InlineResponse2008';
import InlineResponse2009 from '../model/InlineResponse2009';
import PostPricesTimeSeriesEodListRequest from '../model/PostPricesTimeSeriesEodListRequest';
import PostPricesTimeSeriesEodSubsampleGetRequest from '../model/PostPricesTimeSeriesEodSubsampleGetRequest';
import PostPricesTimeSeriesEodSubsampleListRequest from '../model/PostPricesTimeSeriesEodSubsampleListRequest';
import PostPricesTimeSeriesIntradayListRequest from '../model/PostPricesTimeSeriesIntradayListRequest';
import PostPricesTimeSeriesIntradaySubsampleGetRequest from '../model/PostPricesTimeSeriesIntradaySubsampleGetRequest';
import PostPricesTimeSeriesIntradaySubsampleListRequest from '../model/PostPricesTimeSeriesIntradaySubsampleListRequest';

/**
* Prices service.
* @module api/PricesApi
*/
export default class PricesApi {

    /**
    * Constructs a new PricesApi. 
    * @alias module:api/PricesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * End-of-day time series data for a notation.
     * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesEodListRequest} postPricesTimeSeriesEodListRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2005} and HTTP response
     */
    postPricesTimeSeriesEodListWithHttpInfo(postPricesTimeSeriesEodListRequest) {
      let postBody = postPricesTimeSeriesEodListRequest;
      // verify the required parameter 'postPricesTimeSeriesEodListRequest' is set
      if (postPricesTimeSeriesEodListRequest === undefined || postPricesTimeSeriesEodListRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTimeSeriesEodListRequest' when calling postPricesTimeSeriesEodList");
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


      let returnType = InlineResponse2005;

      return this.apiClient.callApi(
        '/prices/timeSeries/eod/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * End-of-day time series data for a notation.
     * End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesEodListRequest} postPricesTimeSeriesEodListRequest Request Body
     * @return { Promise.< module:model/InlineResponse2005 > } a Promise, with data of type {@link module:model/InlineResponse2005 }
     */
    postPricesTimeSeriesEodList(postPricesTimeSeriesEodListRequest) {
      return this.postPricesTimeSeriesEodListWithHttpInfo(postPricesTimeSeriesEodListRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Single subsample end-of-day data for a notation.
     * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
     * @param {module:model/PostPricesTimeSeriesEodSubsampleGetRequest} postPricesTimeSeriesEodSubsampleGetRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2006} and HTTP response
     */
    postPricesTimeSeriesEodSubsampleGetWithHttpInfo(postPricesTimeSeriesEodSubsampleGetRequest) {
      let postBody = postPricesTimeSeriesEodSubsampleGetRequest;
      // verify the required parameter 'postPricesTimeSeriesEodSubsampleGetRequest' is set
      if (postPricesTimeSeriesEodSubsampleGetRequest === undefined || postPricesTimeSeriesEodSubsampleGetRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTimeSeriesEodSubsampleGetRequest' when calling postPricesTimeSeriesEodSubsampleGet");
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


      let returnType = InlineResponse2006;

      return this.apiClient.callApi(
        '/prices/timeSeries/eod/subsample/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Single subsample end-of-day data for a notation.
     * Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.
     * @param {module:model/PostPricesTimeSeriesEodSubsampleGetRequest} postPricesTimeSeriesEodSubsampleGetRequest Request Body
     * @return { Promise.< module:model/InlineResponse2006 > } a Promise, with data of type {@link module:model/InlineResponse2006 }
     */
    postPricesTimeSeriesEodSubsampleGet(postPricesTimeSeriesEodSubsampleGetRequest) {
      return this.postPricesTimeSeriesEodSubsampleGetWithHttpInfo(postPricesTimeSeriesEodSubsampleGetRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Subsampled end-of-day time series data for a notation.
     * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesEodSubsampleListRequest} postPricesTimeSeriesEodSubsampleListRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2007} and HTTP response
     */
    postPricesTimeSeriesEodSubsampleListWithHttpInfo(postPricesTimeSeriesEodSubsampleListRequest) {
      let postBody = postPricesTimeSeriesEodSubsampleListRequest;
      // verify the required parameter 'postPricesTimeSeriesEodSubsampleListRequest' is set
      if (postPricesTimeSeriesEodSubsampleListRequest === undefined || postPricesTimeSeriesEodSubsampleListRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTimeSeriesEodSubsampleListRequest' when calling postPricesTimeSeriesEodSubsampleList");
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


      let returnType = InlineResponse2007;

      return this.apiClient.callApi(
        '/prices/timeSeries/eod/subsample/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Subsampled end-of-day time series data for a notation.
     * Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesEodSubsampleListRequest} postPricesTimeSeriesEodSubsampleListRequest Request Body
     * @return { Promise.< module:model/InlineResponse2007 > } a Promise, with data of type {@link module:model/InlineResponse2007 }
     */
    postPricesTimeSeriesEodSubsampleList(postPricesTimeSeriesEodSubsampleListRequest) {
      return this.postPricesTimeSeriesEodSubsampleListWithHttpInfo(postPricesTimeSeriesEodSubsampleListRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Intraday time series data for a notation.
     * Intraday time series data for a notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesIntradayListRequest} postPricesTimeSeriesIntradayListRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2008} and HTTP response
     */
    postPricesTimeSeriesIntradayListWithHttpInfo(postPricesTimeSeriesIntradayListRequest) {
      let postBody = postPricesTimeSeriesIntradayListRequest;
      // verify the required parameter 'postPricesTimeSeriesIntradayListRequest' is set
      if (postPricesTimeSeriesIntradayListRequest === undefined || postPricesTimeSeriesIntradayListRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTimeSeriesIntradayListRequest' when calling postPricesTimeSeriesIntradayList");
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


      let returnType = InlineResponse2008;

      return this.apiClient.callApi(
        '/prices/timeSeries/intraday/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Intraday time series data for a notation.
     * Intraday time series data for a notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesIntradayListRequest} postPricesTimeSeriesIntradayListRequest Request Body
     * @return { Promise.< module:model/InlineResponse2008 > } a Promise, with data of type {@link module:model/InlineResponse2008 }
     */
    postPricesTimeSeriesIntradayList(postPricesTimeSeriesIntradayListRequest) {
      return this.postPricesTimeSeriesIntradayListWithHttpInfo(postPricesTimeSeriesIntradayListRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Single subsample intraday data for a notation.
     * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
     * @param {module:model/PostPricesTimeSeriesIntradaySubsampleGetRequest} postPricesTimeSeriesIntradaySubsampleGetRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2009} and HTTP response
     */
    postPricesTimeSeriesIntradaySubsampleGetWithHttpInfo(postPricesTimeSeriesIntradaySubsampleGetRequest) {
      let postBody = postPricesTimeSeriesIntradaySubsampleGetRequest;
      // verify the required parameter 'postPricesTimeSeriesIntradaySubsampleGetRequest' is set
      if (postPricesTimeSeriesIntradaySubsampleGetRequest === undefined || postPricesTimeSeriesIntradaySubsampleGetRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTimeSeriesIntradaySubsampleGetRequest' when calling postPricesTimeSeriesIntradaySubsampleGet");
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


      let returnType = InlineResponse2009;

      return this.apiClient.callApi(
        '/prices/timeSeries/intraday/subsample/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Single subsample intraday data for a notation.
     * Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.
     * @param {module:model/PostPricesTimeSeriesIntradaySubsampleGetRequest} postPricesTimeSeriesIntradaySubsampleGetRequest Request Body
     * @return { Promise.< module:model/InlineResponse2009 > } a Promise, with data of type {@link module:model/InlineResponse2009 }
     */
    postPricesTimeSeriesIntradaySubsampleGet(postPricesTimeSeriesIntradaySubsampleGetRequest) {
      return this.postPricesTimeSeriesIntradaySubsampleGetWithHttpInfo(postPricesTimeSeriesIntradaySubsampleGetRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Subsampled intraday time series data for a notation.
     * Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesIntradaySubsampleListRequest} postPricesTimeSeriesIntradaySubsampleListRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20010} and HTTP response
     */
    postPricesTimeSeriesIntradaySubsampleListWithHttpInfo(postPricesTimeSeriesIntradaySubsampleListRequest) {
      let postBody = postPricesTimeSeriesIntradaySubsampleListRequest;
      // verify the required parameter 'postPricesTimeSeriesIntradaySubsampleListRequest' is set
      if (postPricesTimeSeriesIntradaySubsampleListRequest === undefined || postPricesTimeSeriesIntradaySubsampleListRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTimeSeriesIntradaySubsampleListRequest' when calling postPricesTimeSeriesIntradaySubsampleList");
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


      let returnType = InlineResponse20010;

      return this.apiClient.callApi(
        '/prices/timeSeries/intraday/subsample/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Subsampled intraday time series data for a notation.
     * Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTimeSeriesIntradaySubsampleListRequest} postPricesTimeSeriesIntradaySubsampleListRequest Request Body
     * @return { Promise.< module:model/InlineResponse20010 > } a Promise, with data of type {@link module:model/InlineResponse20010 }
     */
    postPricesTimeSeriesIntradaySubsampleList(postPricesTimeSeriesIntradaySubsampleListRequest) {
      return this.postPricesTimeSeriesIntradaySubsampleListWithHttpInfo(postPricesTimeSeriesIntradaySubsampleListRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





