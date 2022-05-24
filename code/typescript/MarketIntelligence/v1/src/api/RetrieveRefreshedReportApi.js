/**
 * Market Intelligence
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import FetchReportPollID from '../model/FetchReportPollID';

/**
* RetrieveRefreshedReport service.
* @module api/RetrieveRefreshedReportApi
* @version 0.20.0
*/
export default class RetrieveRefreshedReportApi {

    /**
    * Constructs a new RetrieveRefreshedReportApi. 
    * @alias module:api/RetrieveRefreshedReportApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Retrieve data for desired report.
     * Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.
     * @param {String} reportId example: 65ba6dd63fb366464646426d0b
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/FetchReportPollID} and HTTP response
     */
    getDataReportIdGetWithHttpInfo(reportId) {
      let postBody = null;
      // verify the required parameter 'reportId' is set
      if (reportId === undefined || reportId === null) {
        throw new Error("Missing the required parameter 'reportId' when calling getDataReportIdGet");
      }

      let pathParams = {
        'report_id': reportId
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


      let returnType = FetchReportPollID;

      return this.apiClient.callApi(
        '/get-data/{report_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Retrieve data for desired report.
     * Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.
     * @param {String} reportId example: 65ba6dd63fb366464646426d0b
     * @return { Promise.< module:model/FetchReportPollID > } a Promise, with data of type {@link module:model/FetchReportPollID }
     */
    getDataReportIdGet(reportId) {
      return this.getDataReportIdGetWithHttpInfo(reportId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





