/**
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: cpd-hyd-engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";

/**
* View service.
* @module api/ViewApi
* @version 0.9.2
*/
export default class ViewApi {

    /**
    * Constructs a new ViewApi. 
    * @alias module:api/ViewApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Returns the data in the database(OFDB, OMS_OFDB, ECONOFDB) for the mentioned Symbol or Date. Atleast one parameter(Symbol/Date) is required. For a range of dates symbol parameter is mandatory.
     * @param {String} path Encode database path
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Returns data for the symbol mentioned. e.g:sym1
     * @param {String} opts.date Return data for the specific date or range of dates mentioned.e.g:[date1,date2]
     * @param {String} opts.filterFields Can specify the fields on which you want to perform field filter operations e.g: [\"PRICE\",\"SECTOR\"]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
     * @param {String} opts.filterOps Can specify the field filter operations which you want to perform e.g: [\"LT\", \"GTEQ\", \"CT\"] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \"CT\" : contains  \"SW\" : starts-with  \"EW\" : ends-with   \"EQ\" : equals  For NUMERIC type fields:  \"GT\" : greater than  \"GTEQ\" : greater than or equals  \"LT\" : lesser than  \"LTEQ\" : lesser than or equals  \"EQ\" : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided. 
     * @param {String} opts.filterValues Can specify the field filter values of the field filter operations e.g: [100, 20, \"AB\"] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
     * @param {String} opts.filterDatesOps Can specify the date filter operations which you want to perform e.g: [\"LT\", \"GTEQ\"].  The available date filter operations are :  \"GT\" : after  \"GTEQ\" : after or equals  \"LT\" : before  \"LTEQ\" : before or equals  \"EQ\" : equals\"  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
     * @param {String} opts.filterDatesValues Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
     * @param {String} opts.filterSymbolsOps Can specify the symbol filter operations which you want to perform e.g: [\"CT\", \"SW\"].  The available symbol filter operations are:  \"SW\" : starts-with  \"EW\" : ends-with  \"CT\" : contains  \"EQ\" : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided. 
     * @param {String} opts.filterSymbolsValues Can specify the symbol filter values of the date filter operations e.g: [\"ab\", \"xy\"] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided. 
     * @param {String} opts.sortFieldName Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn't exist in the OFDB is requested
     * @param {module:model/String} opts.sortFieldOrder Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    getDatabaseWithHttpInfo(path, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling getDatabase");
      }

      let pathParams = {
        'path': path
      };
      let queryParams = {
        'symbol': opts['symbol'],
        'date': opts['date'],
        'filterFields': opts['filterFields'],
        'filterOps': opts['filterOps'],
        'filterValues': opts['filterValues'],
        'filterDatesOps': opts['filterDatesOps'],
        'filterDatesValues': opts['filterDatesValues'],
        'filterSymbolsOps': opts['filterSymbolsOps'],
        'filterSymbolsValues': opts['filterSymbolsValues'],
        'sortFieldName': opts['sortFieldName'],
        'sortFieldOrder': opts['sortFieldOrder']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/v1/database/{path}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the data in the database(OFDB, OMS_OFDB, ECONOFDB) for the mentioned Symbol or Date. Atleast one parameter(Symbol/Date) is required. For a range of dates symbol parameter is mandatory.
     * @param {String} path Encode database path
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Returns data for the symbol mentioned. e.g:sym1
     * @param {String} opts.date Return data for the specific date or range of dates mentioned.e.g:[date1,date2]
     * @param {String} opts.filterFields Can specify the fields on which you want to perform field filter operations e.g: [\"PRICE\",\"SECTOR\"]  Note:  The request will respond with 400 1. If fields which are not present on OFDB are given. 2. If filterOps or filterValues query parameters are missing    when filterFields is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
     * @param {String} opts.filterOps Can specify the field filter operations which you want to perform e.g: [\"LT\", \"GTEQ\", \"CT\"] in respective order of values in filterFields query parameter.  The available field filter operations are :  For CHAR type fields:  \"CT\" : contains  \"SW\" : starts-with  \"EW\" : ends-with   \"EQ\" : equals  For NUMERIC type fields:  \"GT\" : greater than  \"GTEQ\" : greater than or equals  \"LT\" : lesser than  \"LTEQ\" : lesser than or equals  \"EQ\" : equals  Note:  The request will respond with 400  1. If operations other than the above mentioned are provided. 2. If numeric operations are given to char type fields instead of char operations. 3. If char operations are given to numeric type fields instead of numeric operations. 4. If filterFields or filterValues query parameters are missing    when filterOps is present. 5. If number of values given for filterOps,      filterFields, filterValues are different 6. If exactly one of symbol or date query parameter is not provided. 
     * @param {String} opts.filterValues Can specify the field filter values of the field filter operations e.g: [100, 20, \"AB\"] in respective order of values in filterFields and filterOps query parameters .  Note:   The request will respond with 400 1. If char values are given to numeric type fields. 2. If filterFields or filterOps query parameters are missing    when filterValues is present. 3. If number of values given for filterOps,      filterFields, filterValues are different 4. If exactly one of symbol or date query parameter is not provided. 
     * @param {String} opts.filterDatesOps Can specify the date filter operations which you want to perform e.g: [\"LT\", \"GTEQ\"].  The available date filter operations are :  \"GT\" : after  \"GTEQ\" : after or equals  \"LT\" : before  \"LTEQ\" : before or equals  \"EQ\" : equals\"  Note:  The request will respond with 400  1. If operations other than the above mentioned are given. 2. If filterDatesValues query parameter is missing when filterDatesOps is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
     * @param {String} opts.filterDatesValues Can specify the date filter values of the date filter operations e.g: [20200505, 20200303] in respective order of values in filterDatesOps query parameter.  Note:  The request will respond with 400 1. If invalid date values are given 2. If filterDatesOps query parameter is missing when filterDatesValues is present. 3. If number of values given for filterDatesOps and filterDatesValues differ. 4. If symbol query parameter is not provided. 
     * @param {String} opts.filterSymbolsOps Can specify the symbol filter operations which you want to perform e.g: [\"CT\", \"SW\"].  The available symbol filter operations are:  \"SW\" : starts-with  \"EW\" : ends-with  \"CT\" : contains  \"EQ\" : equals  Note:  The request will respond with 400 1. If operations other than the above mentioned are given. 2. If filterSymbolsValues query parameter is missing when filterSymbolsOps is present. 3. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 4. If date query parameter is not provided. 
     * @param {String} opts.filterSymbolsValues Can specify the symbol filter values of the date filter operations e.g: [\"ab\", \"xy\"] in respective order of values in filterSymbolsOps query parameter.  Note: The request will respond with 400 1. If filterSymbolsOps query parameter is missing when filterSymbolsValues is present. 2. If number of values given for filterSymbolsOps and filterSymbolsValues differ. 3. If date query parameter is not provided. 
     * @param {String} opts.sortFieldName Can specify the name of field with respect to which user wants to sort data   Note: The request will respond with 400, If a field which doesn't exist in the OFDB is requested
     * @param {module:model/String} opts.sortFieldOrder Can specify the order in which user wants to sort data with respect to sortFieldName query parameter   Note: The request will respond with 400, If value other than asc or desc is requested
     * @return { Promise } a Promise
     */
    getDatabase(path, opts) {
      return this.getDatabaseWithHttpInfo(path, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns all the dates in the database(OFDB, OMS_OFDB, ECONOFDB)
     * @param {String} path Encode database path
     * @param {Object} opts Optional parameters
     * @param {String} opts.between Returns list of dates which are between [start,end], dates should be in the respective order of start and end
     * @param {String} opts.equals Returns the date which matches given date
     * @param {String} opts.before Returns list of dates which are before mentioned date
     * @param {String} opts.after Returns list of dates which are after mentioned date
     * @param {module:model/String} opts.orderBy Returns dates in the mentioned sorted order, should provide asc or desc
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<Number>} and HTTP response
     */
    v1DatabasePathDatesGetWithHttpInfo(path, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling v1DatabasePathDatesGet");
      }

      let pathParams = {
        'path': path
      };
      let queryParams = {
        'between': opts['between'],
        'equals': opts['equals'],
        'before': opts['before'],
        'after': opts['after'],
        'orderBy': opts['orderBy']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ['Number'];

      return this.apiClient.callApi(
        '/v1/database/{path}/dates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns all the dates in the database(OFDB, OMS_OFDB, ECONOFDB)
     * @param {String} path Encode database path
     * @param {Object} opts Optional parameters
     * @param {String} opts.between Returns list of dates which are between [start,end], dates should be in the respective order of start and end
     * @param {String} opts.equals Returns the date which matches given date
     * @param {String} opts.before Returns list of dates which are before mentioned date
     * @param {String} opts.after Returns list of dates which are after mentioned date
     * @param {module:model/String} opts.orderBy Returns dates in the mentioned sorted order, should provide asc or desc
     * @return { Promise.< Array.<Number> > } a Promise, with data of type {@link Array.<Number> }
     */
    v1DatabasePathDatesGet(path, opts) {
      return this.v1DatabasePathDatesGetWithHttpInfo(path, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns all the fields in the database(OFDB, OMS_OFDB, ECONOFDB)
     * @param {String} path Encode database path
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<Object>} and HTTP response
     */
    v1DatabasePathFieldsGetWithHttpInfo(path) {
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling v1DatabasePathFieldsGet");
      }

      let pathParams = {
        'path': path
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [Object];

      return this.apiClient.callApi(
        '/v1/database/{path}/fields', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns all the fields in the database(OFDB, OMS_OFDB, ECONOFDB)
     * @param {String} path Encode database path
     * @return { Promise.< Array.<Object> > } a Promise, with data of type {@link Array.<Object> }
     */
    v1DatabasePathFieldsGet(path) {
      return this.v1DatabasePathFieldsGetWithHttpInfo(path)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns all the symbols in the database(OFDB, OMS_OFDB, ECONOFDB)
     * @param {String} path Encode database path
     * @param {Object} opts Optional parameters
     * @param {String} opts.startsWith Returns list of symbols which starts with mentioned string
     * @param {String} opts.endsWith Returns list of symbols which ends with mentioned string
     * @param {String} opts.contains Returns list of symbols which contains mentioned string
     * @param {String} opts.equals Returns symbol which matches mentioned string
     * @param {module:model/String} opts.orderBy Returns symbols in the mentioned sorted order, should provide asc or desc
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<String>} and HTTP response
     */
    v1DatabasePathSymbolsGetWithHttpInfo(path, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'path' is set
      if (path === undefined || path === null) {
        throw new Error("Missing the required parameter 'path' when calling v1DatabasePathSymbolsGet");
      }

      let pathParams = {
        'path': path
      };
      let queryParams = {
        'startsWith': opts['startsWith'],
        'endsWith': opts['endsWith'],
        'contains': opts['contains'],
        'equals': opts['equals'],
        'orderBy': opts['orderBy']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ['String'];

      return this.apiClient.callApi(
        '/v1/database/{path}/symbols', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns all the symbols in the database(OFDB, OMS_OFDB, ECONOFDB)
     * @param {String} path Encode database path
     * @param {Object} opts Optional parameters
     * @param {String} opts.startsWith Returns list of symbols which starts with mentioned string
     * @param {String} opts.endsWith Returns list of symbols which ends with mentioned string
     * @param {String} opts.contains Returns list of symbols which contains mentioned string
     * @param {String} opts.equals Returns symbol which matches mentioned string
     * @param {module:model/String} opts.orderBy Returns symbols in the mentioned sorted order, should provide asc or desc
     * @return { Promise.< Array.<String> > } a Promise, with data of type {@link Array.<String> }
     */
    v1DatabasePathSymbolsGet(path, opts) {
      return this.v1DatabasePathSymbolsGetWithHttpInfo(path, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





