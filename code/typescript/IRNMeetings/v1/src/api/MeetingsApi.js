/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CreateMeetingDto from '../model/CreateMeetingDto';
import MeetingDto from '../model/MeetingDto';
import MeetingSummaryDto from '../model/MeetingSummaryDto';
import NewItemDto from '../model/NewItemDto';
import ProblemDetails from '../model/ProblemDetails';
import UpdateMeetingDto from '../model/UpdateMeetingDto';

/**
* Meetings service.
* @module api/MeetingsApi
* @version 0.20.0
*/
export default class MeetingsApi {

    /**
    * Constructs a new MeetingsApi. 
    * @alias module:api/MeetingsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a meeting
     * @param {Object} opts Optional parameters
     * @param {module:model/CreateMeetingDto} opts.createMeetingDto Note: The organizer property is deprecated in favor of organizerId
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createMeetingWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['createMeetingDto'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = NewItemDto;

      return this.apiClient.callApi(
        '/v1/meetings', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a meeting
     * @param {Object} opts Optional parameters
     * @param {module:model/CreateMeetingDto} opts.createMeetingDto Note: The organizer property is deprecated in favor of organizerId
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createMeeting(opts) {
      return this.createMeetingWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a Meeting
     * @param {String} meetingId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteMeetingWithHttpInfo(meetingId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling deleteMeeting");
      }

      let pathParams = {
        'meetingId': meetingId
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


      let returnType = null;

      return this.apiClient.callApi(
        '/v1/meetings/{meetingId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a Meeting
     * @param {String} meetingId 
     * @return { Promise } a Promise
     */
    deleteMeeting(meetingId) {
      return this.deleteMeetingWithHttpInfo(meetingId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get details of a meeting
     * @param {String} meetingId Meeting Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/MeetingDto} and HTTP response
     */
    getMeetingWithHttpInfo(meetingId) {
      let postBody = null;
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling getMeeting");
      }

      let pathParams = {
        'meetingId': meetingId
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


      let returnType = MeetingDto;

      return this.apiClient.callApi(
        '/v1/meetings/{meetingId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details of a meeting
     * @param {String} meetingId Meeting Id
     * @return { Promise.< module:model/MeetingDto > } a Promise, with data of type {@link module:model/MeetingDto }
     */
    getMeeting(meetingId) {
      return this.getMeetingWithHttpInfo(meetingId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all the meetings in the specified date range filtered on the given identifiers
     * @param {Object} opts Optional parameters
     * @param {String} opts.start StartDate
     * @param {String} opts.end EndDate
     * @param {Array.<String>} opts.identifiers Set of identifiers to filter on
     * @param {Number} opts.limit Limit on the number of meetings retrieved
     * @param {String} opts.modifiedSince Only return meetings which have been modified or created since a particular time
     * @param {Boolean} opts.xIRNIncludeDeleted Includes deleted meetings in results when set to true (default to false)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/MeetingSummaryDto>} and HTTP response
     */
    getMeetingsWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'start': opts['start'],
        'end': opts['end'],
        'identifiers': this.apiClient.buildCollectionParam(opts['identifiers'], 'multi'),
        'limit': opts['limit'],
        'modifiedSince': opts['modifiedSince']
      };
      let headerParams = {
        'X-IRN-Include-Deleted': opts['xIRNIncludeDeleted']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [MeetingSummaryDto];

      return this.apiClient.callApi(
        '/v1/meetings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the meetings in the specified date range filtered on the given identifiers
     * @param {Object} opts Optional parameters
     * @param {String} opts.start StartDate
     * @param {String} opts.end EndDate
     * @param {Array.<String>} opts.identifiers Set of identifiers to filter on
     * @param {Number} opts.limit Limit on the number of meetings retrieved
     * @param {String} opts.modifiedSince Only return meetings which have been modified or created since a particular time
     * @param {Boolean} opts.xIRNIncludeDeleted Includes deleted meetings in results when set to true (default to false)
     * @return { Promise.< Array.<module:model/MeetingSummaryDto> > } a Promise, with data of type {@link Array.<module:model/MeetingSummaryDto> }
     */
    getMeetings(opts) {
      return this.getMeetingsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Update meeting
     * @param {String} meetingId Meeting Id
     * @param {Object} opts Optional parameters
     * @param {module:model/UpdateMeetingDto} opts.updateMeetingDto Meeting details to update. Note: The organizer property is deprecated in favor of organizerId
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    updateMeetingWithHttpInfo(meetingId, opts) {
      opts = opts || {};
      let postBody = opts['updateMeetingDto'];
      // verify the required parameter 'meetingId' is set
      if (meetingId === undefined || meetingId === null) {
        throw new Error("Missing the required parameter 'meetingId' when calling updateMeeting");
      }

      let pathParams = {
        'meetingId': meetingId
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = null;

      return this.apiClient.callApi(
        '/v1/meetings/{meetingId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Update meeting
     * @param {String} meetingId Meeting Id
     * @param {Object} opts Optional parameters
     * @param {module:model/UpdateMeetingDto} opts.updateMeetingDto Meeting details to update. Note: The organizer property is deprecated in favor of organizerId
     * @return { Promise } a Promise
     */
    updateMeeting(meetingId, opts) {
      return this.updateMeetingWithHttpInfo(meetingId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





