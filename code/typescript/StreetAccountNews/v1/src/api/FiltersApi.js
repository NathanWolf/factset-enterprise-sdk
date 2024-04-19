/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
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
import Error from '../model/Error';
import FilterCategoriesResponse from '../model/FilterCategoriesResponse';
import FilterRegionsResponse from '../model/FilterRegionsResponse';
import FilterResponse from '../model/FilterResponse';
import FilterSectorsResponse from '../model/FilterSectorsResponse';
import FilterTopicResponse from '../model/FilterTopicResponse';
import FilterWatchlistsResponse from '../model/FilterWatchlistsResponse';

/**
* Filters service.
* @module api/FiltersApi
*/
export default class FiltersApi {

    /**
    * Constructs a new FiltersApi. 
    * @alias module:api/FiltersApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve all StreetAccount filters
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FilterResponse} and HTTP response
     */
    getStreetAccountFiltersWithHttpInfo(opts) {
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


      let returnType = FilterResponse;

      return this.apiClient.callApi(
        '/filters', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all StreetAccount filters
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return { Promise.< module:model/FilterResponse > } a Promise, with data of type {@link module:model/FilterResponse }
     */
    getStreetAccountFilters(opts) {
      return this.getStreetAccountFiltersWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all StreetAccount filter categories
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FilterCategoriesResponse} and HTTP response
     */
    getStreetAccountFiltersCategoriesWithHttpInfo(opts) {
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


      let returnType = FilterCategoriesResponse;

      return this.apiClient.callApi(
        '/filters/categories', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all StreetAccount filter categories
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return { Promise.< module:model/FilterCategoriesResponse > } a Promise, with data of type {@link module:model/FilterCategoriesResponse }
     */
    getStreetAccountFiltersCategories(opts) {
      return this.getStreetAccountFiltersCategoriesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all StreetAccount filter regions
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter Regions. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FilterRegionsResponse} and HTTP response
     */
    getStreetAccountFiltersRegionsWithHttpInfo(opts) {
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


      let returnType = FilterRegionsResponse;

      return this.apiClient.callApi(
        '/filters/regions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all StreetAccount filter regions
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter Regions. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return { Promise.< module:model/FilterRegionsResponse > } a Promise, with data of type {@link module:model/FilterRegionsResponse }
     */
    getStreetAccountFiltersRegions(opts) {
      return this.getStreetAccountFiltersRegionsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all StreetAccount filter sectors
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FilterSectorsResponse} and HTTP response
     */
    getStreetAccountFiltersSectorsWithHttpInfo(opts) {
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


      let returnType = FilterSectorsResponse;

      return this.apiClient.callApi(
        '/filters/sectors', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all StreetAccount filter sectors
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter Sectors. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return { Promise.< module:model/FilterSectorsResponse > } a Promise, with data of type {@link module:model/FilterSectorsResponse }
     */
    getStreetAccountFiltersSectors(opts) {
      return this.getStreetAccountFiltersSectorsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all StreetAccount filter topics
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FilterTopicResponse} and HTTP response
     */
    getStreetAccountFiltersTopicsWithHttpInfo(opts) {
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


      let returnType = FilterTopicResponse;

      return this.apiClient.callApi(
        '/filters/topics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all StreetAccount filter topics
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return { Promise.< module:model/FilterTopicResponse > } a Promise, with data of type {@link module:model/FilterTopicResponse }
     */
    getStreetAccountFiltersTopics(opts) {
      return this.getStreetAccountFiltersTopicsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Retrieve all StreetAccount filter watchlists
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FilterWatchlistsResponse} and HTTP response
     */
    getStreetAccountFiltersWatchlistsWithHttpInfo(opts) {
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


      let returnType = FilterWatchlistsResponse;

      return this.apiClient.callApi(
        '/filters/watchlists', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve all StreetAccount filter watchlists
     * If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.attributes Pass a list of filters to return the respective type of filter Watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _atrributes are specified, all filters will be returned in the response (this is the default response). 
     * @return { Promise.< module:model/FilterWatchlistsResponse > } a Promise, with data of type {@link module:model/FilterWatchlistsResponse }
     */
    getStreetAccountFiltersWatchlists(opts) {
      return this.getStreetAccountFiltersWatchlistsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





