/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
import ErrorList from '../model/ErrorList';
import ReportDefinitionData from '../model/ReportDefinitionData';
import ReportDefinitionList from '../model/ReportDefinitionList';

/**
* Report service.
* @module api/ReportApi
*/
export default class ReportApi {

    /**
    * Constructs a new ReportApi. 
    * @alias module:api/ReportApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Gets all report definitions
     * Gets all report definitions the user has permissions for
     * @param {String} tenant The code of the tenancy
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.sort The column to sort on. Can add - to sort
     * @param {Number} opts.paginationLimit Non-negative maximum number of entries to return
     * @param {Number} opts.paginationOffset Non-negative number of entries to skip
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ReportDefinitionList} and HTTP response
     */
    getAllReportDefinitionsWithHttpInfo(tenant, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'tenant' is set
      if (tenant === undefined || tenant === null) {
        throw new Error("Missing the required parameter 'tenant' when calling getAllReportDefinitions");
      }

      let pathParams = {
        'tenant': tenant
      };
      let queryParams = {
        '_sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv'),
        '_paginationLimit': opts['paginationLimit'],
        '_paginationOffset': opts['paginationOffset']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = ReportDefinitionList;

      return this.apiClient.callApi(
        '/v1/{tenant}/reports', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets all report definitions
     * Gets all report definitions the user has permissions for
     * @param {String} tenant The code of the tenancy
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.sort The column to sort on. Can add - to sort
     * @param {Number} opts.paginationLimit Non-negative maximum number of entries to return
     * @param {Number} opts.paginationOffset Non-negative number of entries to skip
     * @return { Promise.< module:model/ReportDefinitionList > } a Promise, with data of type {@link module:model/ReportDefinitionList }
     */
    getAllReportDefinitions(tenant, opts) {
      return this.getAllReportDefinitionsWithHttpInfo(tenant, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Gets a report definition
     * Gets a report defintion based on the code specified
     * @param {String} tenant The code of the tenancy
     * @param {String} reportDefinitionCode The code of the report definition
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ReportDefinitionData} and HTTP response
     */
    getReportDefinitionByCodeWithHttpInfo(tenant, reportDefinitionCode) {
      let postBody = null;
      // verify the required parameter 'tenant' is set
      if (tenant === undefined || tenant === null) {
        throw new Error("Missing the required parameter 'tenant' when calling getReportDefinitionByCode");
      }
      // verify the required parameter 'reportDefinitionCode' is set
      if (reportDefinitionCode === undefined || reportDefinitionCode === null) {
        throw new Error("Missing the required parameter 'reportDefinitionCode' when calling getReportDefinitionByCode");
      }

      let pathParams = {
        'tenant': tenant,
        'reportDefinitionCode': reportDefinitionCode
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


      let returnType = ReportDefinitionData;

      return this.apiClient.callApi(
        '/v1/{tenant}/reports/{reportDefinitionCode}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Gets a report definition
     * Gets a report defintion based on the code specified
     * @param {String} tenant The code of the tenancy
     * @param {String} reportDefinitionCode The code of the report definition
     * @return { Promise.< module:model/ReportDefinitionData > } a Promise, with data of type {@link module:model/ReportDefinitionData }
     */
    getReportDefinitionByCode(tenant, reportDefinitionCode) {
      return this.getReportDefinitionByCodeWithHttpInfo(tenant, reportDefinitionCode)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





