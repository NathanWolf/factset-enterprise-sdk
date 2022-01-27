/**
 * Classifications API
 * The Classifications API gives access to various Industry Classifications for a given list of securities. Beginning first with GICS Direct, the service will then expand to offering NAICS, SIC, RBICS, and more.  
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
import GicsRequest from '../model/GicsRequest';
import GicsResponse from '../model/GicsResponse';

/**
* GICS service.
* @module api/GICSApi
* @version 0.9.0
*/
export default class GICSApi {

    /**
    * Constructs a new GICSApi. 
    * @alias module:api/GICSApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets the GICS Direct Classifications
     * Gets the The **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](http://us.spindices.com/resource-center/index-policies/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Requested start date expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate Requested End Date for Range expressed in YYYY-MM-DD format.
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (default to 'M')
     * @param {module:model/String} opts.calendar Calendar of data returned. SEVENDAY includes weekends. (default to 'FIVEDAY')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GicsResponse} and HTTP response
     */
    getGicsWithHttpInfo(ids, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'ids' is set
      if (ids === undefined || ids === null) {
        throw new Error("Missing the required parameter 'ids' when calling getGics");
      }

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(ids, 'csv'),
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'frequency': opts['frequency'],
        'calendar': opts['calendar']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GicsResponse;
      return this.apiClient.callApi(
        '/classifications/v1/gics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets the GICS Direct Classifications
     * Gets the The **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](http://us.spindices.com/resource-center/index-policies/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
     * @param {Array.<String>} ids The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     * @param {Object} opts Optional parameters
     * @param {String} opts.startDate Requested start date expressed in YYYY-MM-DD format.
     * @param {String} opts.endDate Requested End Date for Range expressed in YYYY-MM-DD format.
     * @param {module:model/String} opts.frequency Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (default to 'M')
     * @param {module:model/String} opts.calendar Calendar of data returned. SEVENDAY includes weekends. (default to 'FIVEDAY')
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/GicsResponse}
     */
    getGics(ids, opts) {
      return this.getGicsWithHttpInfo(ids, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns the GICS classifications for the requested 'ids' and date range.
     * Gets the The **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](http://us.spindices.com/resource-center/index-policies/) home pages. Coverage includes over 37,000 secutries. *Licencing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
     * @param {module:model/GicsRequest} gicsRequest Requests GICS Classifications for the given identifier and date range.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/GicsResponse} and HTTP response
     */
    postGicsWithHttpInfo(gicsRequest) {
      let postBody = gicsRequest;
      // verify the required parameter 'gicsRequest' is set
      if (gicsRequest === undefined || gicsRequest === null) {
        throw new Error("Missing the required parameter 'gicsRequest' when calling postGics");
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
      let returnType = GicsResponse;
      return this.apiClient.callApi(
        '/classifications/v1/gics', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Returns the GICS classifications for the requested 'ids' and date range.
     * Gets the The **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](http://us.spindices.com/resource-center/index-policies/) home pages. Coverage includes over 37,000 secutries. *Licencing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 
     * @param {module:model/GicsRequest} gicsRequest Requests GICS Classifications for the given identifier and date range.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/GicsResponse}
     */
    postGics(gicsRequest) {
      return this.postGicsWithHttpInfo(gicsRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
