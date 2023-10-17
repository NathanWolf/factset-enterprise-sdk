/**
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import InlineResponse20089 from '../model/InlineResponse20089';
import InlineResponse20090 from '../model/InlineResponse20090';
import InlineResponse20091 from '../model/InlineResponse20091';
import InlineResponse20092 from '../model/InlineResponse20092';
import InlineResponse20093 from '../model/InlineResponse20093';
import InlineResponse20094 from '../model/InlineResponse20094';
import InlineResponse20095 from '../model/InlineResponse20095';
import InlineResponse20096 from '../model/InlineResponse20096';
import PostPricesTradingScheduleEventListRequest from '../model/PostPricesTradingScheduleEventListRequest';

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
     * Most recent bid and ask prices (best bid / offer) for a notation.
     * Most recent bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Minimum number of milliseconds at which updates are send. (default to 5000)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20091} and HTTP response
     */
    getPricesBidAskGetWithHttpInfo(identifier, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifier' is set
      if (identifier === undefined || identifier === null) {
        throw new Error("Missing the required parameter 'identifier' when calling getPricesBidAskGet");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getPricesBidAskGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifier': identifier,
        'identifierType': identifierType,
        'quality': opts['quality'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_subscriptionMinimumInterval': opts['subscriptionMinimumInterval']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20091;

      return this.apiClient.callApi(
        '/prices/bidAsk/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Most recent bid and ask prices (best bid / offer) for a notation.
     * Most recent bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Minimum number of milliseconds at which updates are send. (default to 5000)
     * @return { Promise.< module:model/InlineResponse20091 > } a Promise, with data of type {@link module:model/InlineResponse20091 }
     */
    getPricesBidAskGet(identifier, identifierType, opts) {
      return this.getPricesBidAskGetWithHttpInfo(identifier, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Most recent bid and ask prices (best bid / offer) for a list of notations.
     * Most recent bid and ask prices (best bid / offer) for a list of notations.
     * @param {Array.<String>} identifiers 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Boolean} opts.sameQuality  (default to true)
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20092} and HTTP response
     */
    getPricesBidAskListWithHttpInfo(identifiers, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifiers' is set
      if (identifiers === undefined || identifiers === null) {
        throw new Error("Missing the required parameter 'identifiers' when calling getPricesBidAskList");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getPricesBidAskList");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifiers': this.apiClient.buildCollectionParam(identifiers, 'csv'),
        'identifierType': identifierType,
        'quality': opts['quality'],
        'sameQuality': opts['sameQuality'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20092;

      return this.apiClient.callApi(
        '/prices/bidAsk/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Most recent bid and ask prices (best bid / offer) for a list of notations.
     * Most recent bid and ask prices (best bid / offer) for a list of notations.
     * @param {Array.<String>} identifiers 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Boolean} opts.sameQuality  (default to true)
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse20092 > } a Promise, with data of type {@link module:model/InlineResponse20092 }
     */
    getPricesBidAskList(identifiers, identifierType, opts) {
      return this.getPricesBidAskListWithHttpInfo(identifiers, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Overview of trading on the most recent trading day, including the latest price, for a notation.
     * Overview of trading on the most recent trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Minimum number of milliseconds at which updates are sent. (default to 5000)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20089} and HTTP response
     */
    getPricesGetWithHttpInfo(identifier, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifier' is set
      if (identifier === undefined || identifier === null) {
        throw new Error("Missing the required parameter 'identifier' when calling getPricesGet");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getPricesGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifier': identifier,
        'identifierType': identifierType,
        'quality': opts['quality'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_subscriptionMinimumInterval': opts['subscriptionMinimumInterval']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20089;

      return this.apiClient.callApi(
        '/prices/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Overview of trading on the most recent trading day, including the latest price, for a notation.
     * Overview of trading on the most recent trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Minimum number of milliseconds at which updates are sent. (default to 5000)
     * @return { Promise.< module:model/InlineResponse20089 > } a Promise, with data of type {@link module:model/InlineResponse20089 }
     */
    getPricesGet(identifier, identifierType, opts) {
      return this.getPricesGetWithHttpInfo(identifier, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
     * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
     * @param {Array.<String>} identifiers 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Boolean} opts.sameQuality  (default to true)
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20090} and HTTP response
     */
    getPricesListWithHttpInfo(identifiers, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifiers' is set
      if (identifiers === undefined || identifiers === null) {
        throw new Error("Missing the required parameter 'identifiers' when calling getPricesList");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getPricesList");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifiers': this.apiClient.buildCollectionParam(identifiers, 'csv'),
        'identifierType': identifierType,
        'quality': opts['quality'],
        'sameQuality': opts['sameQuality'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20090;

      return this.apiClient.callApi(
        '/prices/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
     * Overview of trading on the most recent trading day, including the latest price, for a list of notations.
     * @param {Array.<String>} identifiers 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'DLY')
     * @param {Boolean} opts.sameQuality  (default to true)
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse20090 > } a Promise, with data of type {@link module:model/InlineResponse20090 }
     */
    getPricesList(identifiers, identifierType, opts) {
      return this.getPricesListWithHttpInfo(identifiers, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Orderbook aggregated by price.
     * Orderbook aggregated by price.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'RLT')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (default to 5000)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20093} and HTTP response
     */
    getPricesOrderbookAggregatedGetWithHttpInfo(identifier, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifier' is set
      if (identifier === undefined || identifier === null) {
        throw new Error("Missing the required parameter 'identifier' when calling getPricesOrderbookAggregatedGet");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getPricesOrderbookAggregatedGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifier': identifier,
        'identifierType': identifierType,
        'quality': opts['quality'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_subscriptionMinimumInterval': opts['subscriptionMinimumInterval']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20093;

      return this.apiClient.callApi(
        '/prices/orderbook/aggregated/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Orderbook aggregated by price.
     * Orderbook aggregated by price.
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'RLT')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (default to 5000)
     * @return { Promise.< module:model/InlineResponse20093 > } a Promise, with data of type {@link module:model/InlineResponse20093 }
     */
    getPricesOrderbookAggregatedGet(identifier, identifierType, opts) {
      return this.getPricesOrderbookAggregatedGetWithHttpInfo(identifier, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Full orderbook
     * Full orderbook
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'RLT')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (default to 5000)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20094} and HTTP response
     */
    getPricesOrderbookFullGetWithHttpInfo(identifier, identifierType, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'identifier' is set
      if (identifier === undefined || identifier === null) {
        throw new Error("Missing the required parameter 'identifier' when calling getPricesOrderbookFullGet");
      }
      // verify the required parameter 'identifierType' is set
      if (identifierType === undefined || identifierType === null) {
        throw new Error("Missing the required parameter 'identifierType' when calling getPricesOrderbookFullGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'identifier': identifier,
        'identifierType': identifierType,
        'quality': opts['quality'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_subscriptionMinimumInterval': opts['subscriptionMinimumInterval']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20094;

      return this.apiClient.callApi(
        '/prices/orderbook/full/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Full orderbook
     * Full orderbook
     * @param {String} identifier 
     * @param {module:model/String} identifierType 
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.quality  (default to 'RLT')
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {module:model/Number} opts.subscriptionMinimumInterval Non-negative number of milliseconds to throttle the update rate. (default to 5000)
     * @return { Promise.< module:model/InlineResponse20094 > } a Promise, with data of type {@link module:model/InlineResponse20094 }
     */
    getPricesOrderbookFullGet(identifier, identifierType, opts) {
      return this.getPricesOrderbookFullGetWithHttpInfo(identifier, identifierType, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Trading schedule event types.
     * Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20096} and HTTP response
     */
    getPricesTradingScheduleEventTypeListWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20096;

      return this.apiClient.callApi(
        '/prices/tradingSchedule/event/type/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Trading schedule event types.
     * Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse20096 > } a Promise, with data of type {@link module:model/InlineResponse20096 }
     */
    getPricesTradingScheduleEventTypeList(opts) {
      return this.getPricesTradingScheduleEventTypeListWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Sequence of market-related events.
     * Sequence of market-related events like the opening time or closing time of a market of a specific notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTradingScheduleEventListRequest} postPricesTradingScheduleEventListRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20095} and HTTP response
     */
    postPricesTradingScheduleEventListWithHttpInfo(postPricesTradingScheduleEventListRequest) {
      let postBody = postPricesTradingScheduleEventListRequest;
      // verify the required parameter 'postPricesTradingScheduleEventListRequest' is set
      if (postPricesTradingScheduleEventListRequest === undefined || postPricesTradingScheduleEventListRequest === null) {
        throw new Error("Missing the required parameter 'postPricesTradingScheduleEventListRequest' when calling postPricesTradingScheduleEventList");
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


      let returnType = InlineResponse20095;

      return this.apiClient.callApi(
        '/prices/tradingSchedule/event/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Sequence of market-related events.
     * Sequence of market-related events like the opening time or closing time of a market of a specific notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.
     * @param {module:model/PostPricesTradingScheduleEventListRequest} postPricesTradingScheduleEventListRequest Request Body
     * @return { Promise.< module:model/InlineResponse20095 > } a Promise, with data of type {@link module:model/InlineResponse20095 }
     */
    postPricesTradingScheduleEventList(postPricesTradingScheduleEventListRequest) {
      return this.postPricesTradingScheduleEventListWithHttpInfo(postPricesTradingScheduleEventListRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





