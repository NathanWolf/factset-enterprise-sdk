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
import CreateNoteDto from '../model/CreateNoteDto';
import NewItemDto from '../model/NewItemDto';
import NoteDto from '../model/NoteDto';
import NoteSummaryDto from '../model/NoteSummaryDto';
import ProblemDetails from '../model/ProblemDetails';
import UpdateNoteDto from '../model/UpdateNoteDto';

/**
* Notes service.
* @module api/NotesApi
*/
export default class NotesApi {

    /**
    * Constructs a new NotesApi. 
    * @alias module:api/NotesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a note
     * @param {module:model/CreateNoteDto} createNoteDto 
     * @param {Object} opts Optional parameters
     * @param {String} opts.xIRNContributorUsername 
     * @param {String} opts.xIRNContributorSerial 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NewItemDto} and HTTP response
     */
    createNoteWithHttpInfo(createNoteDto, opts) {
      opts = opts || {};
      let postBody = createNoteDto;
      // verify the required parameter 'createNoteDto' is set
      if (createNoteDto === undefined || createNoteDto === null) {
        throw new Error("Missing the required parameter 'createNoteDto' when calling createNote");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'X-IRN-Contributor-Username': opts['xIRNContributorUsername'],
        'X-IRN-Contributor-Serial': opts['xIRNContributorSerial']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json-patch+json', 'application/json', 'text/json', 'application/_*+json'];
      let accepts = ['application/json'];


      let returnType = NewItemDto;

      return this.apiClient.callApi(
        '/v1/notes', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a note
     * @param {module:model/CreateNoteDto} createNoteDto 
     * @param {Object} opts Optional parameters
     * @param {String} opts.xIRNContributorUsername 
     * @param {String} opts.xIRNContributorSerial 
     * @return { Promise.< module:model/NewItemDto > } a Promise, with data of type {@link module:model/NewItemDto }
     */
    createNote(createNoteDto, opts) {
      return this.createNoteWithHttpInfo(createNoteDto, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a Note
     * @param {String} noteId 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteNoteWithHttpInfo(noteId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling deleteNote");
      }

      let pathParams = {
        'noteId': noteId
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
        '/v1/notes/{noteId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a Note
     * @param {String} noteId 
     * @return { Promise } a Promise
     */
    deleteNote(noteId) {
      return this.deleteNoteWithHttpInfo(noteId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get details of a note
     * @param {String} noteId Note Id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/NoteDto} and HTTP response
     */
    getNoteWithHttpInfo(noteId) {
      let postBody = null;
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling getNote");
      }

      let pathParams = {
        'noteId': noteId
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


      let returnType = NoteDto;

      return this.apiClient.callApi(
        '/v1/notes/{noteId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get details of a note
     * @param {String} noteId Note Id
     * @return { Promise.< module:model/NoteDto > } a Promise, with data of type {@link module:model/NoteDto }
     */
    getNote(noteId) {
      return this.getNoteWithHttpInfo(noteId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get all the notes in the specified date range filtered on the given identifiers
     * @param {Object} opts Optional parameters
     * @param {String} opts.start StartDate
     * @param {String} opts.end EndDate
     * @param {Array.<String>} opts.identifiers Set of identifiers to filter on
     * @param {Array.<String>} opts.authors Set of authors to filter on
     * @param {Array.<String>} opts.subjects Set of subjects to filter on
     * @param {Array.<String>} opts.recommendations Set of recommendations to filter on
     * @param {Array.<String>} opts.sentiments Set of sentiments to filter on
     * @param {Number} opts.limit Limit on the number of notes retrieved
     * @param {Number} opts.offset Fetch notes after the offset
     * @param {String} opts.modifiedSince Only return notes which have been modified or created since a particular time
     * @param {Array.<String>} opts.states Set of states to filter on
     * @param {Boolean} opts.filterOnRelatedSymbols Include notes whose related symbols match the identifier filter (default to false)
     * @param {Boolean} opts.includeRelatedEntities When set to true fetches notes tagged with all the entities related to identifiers param (default to false)
     * @param {Boolean} opts.xIRNIncludeDeleted  (default to false)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/NoteSummaryDto>} and HTTP response
     */
    getNotesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'start': opts['start'],
        'end': opts['end'],
        'identifiers': this.apiClient.buildCollectionParam(opts['identifiers'], 'multi'),
        'authors': this.apiClient.buildCollectionParam(opts['authors'], 'multi'),
        'subjects': this.apiClient.buildCollectionParam(opts['subjects'], 'multi'),
        'recommendations': this.apiClient.buildCollectionParam(opts['recommendations'], 'multi'),
        'sentiments': this.apiClient.buildCollectionParam(opts['sentiments'], 'multi'),
        'limit': opts['limit'],
        'offset': opts['offset'],
        'modifiedSince': opts['modifiedSince'],
        'states': this.apiClient.buildCollectionParam(opts['states'], 'multi'),
        'filterOnRelatedSymbols': opts['filterOnRelatedSymbols'],
        'includeRelatedEntities': opts['includeRelatedEntities']
      };
      let headerParams = {
        'X-IRN-Include-Deleted': opts['xIRNIncludeDeleted']
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = [NoteSummaryDto];

      return this.apiClient.callApi(
        '/v1/notes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get all the notes in the specified date range filtered on the given identifiers
     * @param {Object} opts Optional parameters
     * @param {String} opts.start StartDate
     * @param {String} opts.end EndDate
     * @param {Array.<String>} opts.identifiers Set of identifiers to filter on
     * @param {Array.<String>} opts.authors Set of authors to filter on
     * @param {Array.<String>} opts.subjects Set of subjects to filter on
     * @param {Array.<String>} opts.recommendations Set of recommendations to filter on
     * @param {Array.<String>} opts.sentiments Set of sentiments to filter on
     * @param {Number} opts.limit Limit on the number of notes retrieved
     * @param {Number} opts.offset Fetch notes after the offset
     * @param {String} opts.modifiedSince Only return notes which have been modified or created since a particular time
     * @param {Array.<String>} opts.states Set of states to filter on
     * @param {Boolean} opts.filterOnRelatedSymbols Include notes whose related symbols match the identifier filter (default to false)
     * @param {Boolean} opts.includeRelatedEntities When set to true fetches notes tagged with all the entities related to identifiers param (default to false)
     * @param {Boolean} opts.xIRNIncludeDeleted  (default to false)
     * @return { Promise.< Array.<module:model/NoteSummaryDto> > } a Promise, with data of type {@link Array.<module:model/NoteSummaryDto> }
     */
    getNotes(opts) {
      return this.getNotesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Update a note
     * @param {String} noteId Note Id
     * @param {Object} opts Optional parameters
     * @param {module:model/UpdateNoteDto} opts.updateNoteDto Note details to update
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    updateNoteWithHttpInfo(noteId, opts) {
      opts = opts || {};
      let postBody = opts['updateNoteDto'];
      // verify the required parameter 'noteId' is set
      if (noteId === undefined || noteId === null) {
        throw new Error("Missing the required parameter 'noteId' when calling updateNote");
      }

      let pathParams = {
        'noteId': noteId
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
        '/v1/notes/{noteId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Update a note
     * @param {String} noteId Note Id
     * @param {Object} opts Optional parameters
     * @param {module:model/UpdateNoteDto} opts.updateNoteDto Note details to update
     * @return { Promise } a Promise
     */
    updateNote(noteId, opts) {
      return this.updateNoteWithHttpInfo(noteId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





