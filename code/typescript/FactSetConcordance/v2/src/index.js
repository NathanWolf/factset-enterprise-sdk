/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p>   
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import CreateUniverseRequest from './model/CreateUniverseRequest';
import EntityDecisionsResponse from './model/EntityDecisionsResponse';
import EntityMapping from './model/EntityMapping';
import EntityMappingDeleteRequest from './model/EntityMappingDeleteRequest';
import EntityMappingDeleteResponse from './model/EntityMappingDeleteResponse';
import EntityMappingRequest from './model/EntityMappingRequest';
import EntityMappingResponse from './model/EntityMappingResponse';
import EntityMatch from './model/EntityMatch';
import EntityMatchRequest from './model/EntityMatchRequest';
import EntityMatchRequestInput from './model/EntityMatchRequestInput';
import EntityMatchesResponse from './model/EntityMatchesResponse';
import EntityResponse from './model/EntityResponse';
import EntityTaskResponse from './model/EntityTaskResponse';
import EntityTaskStatus from './model/EntityTaskStatus';
import EntityTaskStatusResponse from './model/EntityTaskStatusResponse';
import EntityUniverseRequest from './model/EntityUniverseRequest';
import EntityUniverseResponse from './model/EntityUniverseResponse';
import EntityUniverseStatisticsResponse from './model/EntityUniverseStatisticsResponse';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import MapStatus from './model/MapStatus';
import PeopleDecisions from './model/PeopleDecisions';
import PeopleDecisionsResponse from './model/PeopleDecisionsResponse';
import PeopleMapping from './model/PeopleMapping';
import PeopleMappingDeleteResponse from './model/PeopleMappingDeleteResponse';
import PeopleMappingRequest from './model/PeopleMappingRequest';
import PeopleMappingResponse from './model/PeopleMappingResponse';
import PeopleMatch from './model/PeopleMatch';
import PeopleMatchRequest from './model/PeopleMatchRequest';
import PeopleMatchRequestInput from './model/PeopleMatchRequestInput';
import PeopleMatchesResponse from './model/PeopleMatchesResponse';
import PeopleTask from './model/PeopleTask';
import PeopleTaskResponse from './model/PeopleTaskResponse';
import PeopleTaskStatus from './model/PeopleTaskStatus';
import PeopleTaskStatusResponse from './model/PeopleTaskStatusResponse';
import PeopleUniverseRequest from './model/PeopleUniverseRequest';
import PeopleUniverseResponse from './model/PeopleUniverseResponse';
import SnowflakeEntityMappingRequest from './model/SnowflakeEntityMappingRequest';
import SnowflakeEntityMappingResponse from './model/SnowflakeEntityMappingResponse';
import SnowflakeEntityMatchRequest from './model/SnowflakeEntityMatchRequest';
import SnowflakeEntityMatchResponse from './model/SnowflakeEntityMatchResponse';
import Universe from './model/Universe';
import UniverseMeta from './model/UniverseMeta';
import UniverseMetaResponse from './model/UniverseMetaResponse';
import UniverseStatistics from './model/UniverseStatistics';
import UniverseStatisticsResponse from './model/UniverseStatisticsResponse';
import UniversesResponse from './model/UniversesResponse';
import UpdateUniverseRequest from './model/UpdateUniverseRequest';

import EntityMatchApi from './api/EntityMatchApi';
import EntityMatchBulkApi from './api/EntityMatchBulkApi';
import MappingsApi from './api/MappingsApi';
import PeopleMappingApi from './api/PeopleMappingApi';
import PeopleMatchApi from './api/PeopleMatchApi';
import PeopleMatchBulkApi from './api/PeopleMatchBulkApi';
import SnowflakeApi from './api/SnowflakeApi';
import UniversesApi from './api/UniversesApi';


/**
* FactSet Concordance client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetconcordance = require('index'); // See note below*.
* var xxxSvc = new factsetconcordance.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetconcordance.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new factsetconcordance.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetconcordance.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The CreateUniverseRequest model constructor.
     * @property {module:model/CreateUniverseRequest}
     */
    CreateUniverseRequest,

    /**
     * The EntityDecisionsResponse model constructor.
     * @property {module:model/EntityDecisionsResponse}
     */
    EntityDecisionsResponse,

    /**
     * The EntityMapping model constructor.
     * @property {module:model/EntityMapping}
     */
    EntityMapping,

    /**
     * The EntityMappingDeleteRequest model constructor.
     * @property {module:model/EntityMappingDeleteRequest}
     */
    EntityMappingDeleteRequest,

    /**
     * The EntityMappingDeleteResponse model constructor.
     * @property {module:model/EntityMappingDeleteResponse}
     */
    EntityMappingDeleteResponse,

    /**
     * The EntityMappingRequest model constructor.
     * @property {module:model/EntityMappingRequest}
     */
    EntityMappingRequest,

    /**
     * The EntityMappingResponse model constructor.
     * @property {module:model/EntityMappingResponse}
     */
    EntityMappingResponse,

    /**
     * The EntityMatch model constructor.
     * @property {module:model/EntityMatch}
     */
    EntityMatch,

    /**
     * The EntityMatchRequest model constructor.
     * @property {module:model/EntityMatchRequest}
     */
    EntityMatchRequest,

    /**
     * The EntityMatchRequestInput model constructor.
     * @property {module:model/EntityMatchRequestInput}
     */
    EntityMatchRequestInput,

    /**
     * The EntityMatchesResponse model constructor.
     * @property {module:model/EntityMatchesResponse}
     */
    EntityMatchesResponse,

    /**
     * The EntityResponse model constructor.
     * @property {module:model/EntityResponse}
     */
    EntityResponse,

    /**
     * The EntityTaskResponse model constructor.
     * @property {module:model/EntityTaskResponse}
     */
    EntityTaskResponse,

    /**
     * The EntityTaskStatus model constructor.
     * @property {module:model/EntityTaskStatus}
     */
    EntityTaskStatus,

    /**
     * The EntityTaskStatusResponse model constructor.
     * @property {module:model/EntityTaskStatusResponse}
     */
    EntityTaskStatusResponse,

    /**
     * The EntityUniverseRequest model constructor.
     * @property {module:model/EntityUniverseRequest}
     */
    EntityUniverseRequest,

    /**
     * The EntityUniverseResponse model constructor.
     * @property {module:model/EntityUniverseResponse}
     */
    EntityUniverseResponse,

    /**
     * The EntityUniverseStatisticsResponse model constructor.
     * @property {module:model/EntityUniverseStatisticsResponse}
     */
    EntityUniverseStatisticsResponse,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The ErrorResponseSubErrors model constructor.
     * @property {module:model/ErrorResponseSubErrors}
     */
    ErrorResponseSubErrors,

    /**
     * The MapStatus model constructor.
     * @property {module:model/MapStatus}
     */
    MapStatus,

    /**
     * The PeopleDecisions model constructor.
     * @property {module:model/PeopleDecisions}
     */
    PeopleDecisions,

    /**
     * The PeopleDecisionsResponse model constructor.
     * @property {module:model/PeopleDecisionsResponse}
     */
    PeopleDecisionsResponse,

    /**
     * The PeopleMapping model constructor.
     * @property {module:model/PeopleMapping}
     */
    PeopleMapping,

    /**
     * The PeopleMappingDeleteResponse model constructor.
     * @property {module:model/PeopleMappingDeleteResponse}
     */
    PeopleMappingDeleteResponse,

    /**
     * The PeopleMappingRequest model constructor.
     * @property {module:model/PeopleMappingRequest}
     */
    PeopleMappingRequest,

    /**
     * The PeopleMappingResponse model constructor.
     * @property {module:model/PeopleMappingResponse}
     */
    PeopleMappingResponse,

    /**
     * The PeopleMatch model constructor.
     * @property {module:model/PeopleMatch}
     */
    PeopleMatch,

    /**
     * The PeopleMatchRequest model constructor.
     * @property {module:model/PeopleMatchRequest}
     */
    PeopleMatchRequest,

    /**
     * The PeopleMatchRequestInput model constructor.
     * @property {module:model/PeopleMatchRequestInput}
     */
    PeopleMatchRequestInput,

    /**
     * The PeopleMatchesResponse model constructor.
     * @property {module:model/PeopleMatchesResponse}
     */
    PeopleMatchesResponse,

    /**
     * The PeopleTask model constructor.
     * @property {module:model/PeopleTask}
     */
    PeopleTask,

    /**
     * The PeopleTaskResponse model constructor.
     * @property {module:model/PeopleTaskResponse}
     */
    PeopleTaskResponse,

    /**
     * The PeopleTaskStatus model constructor.
     * @property {module:model/PeopleTaskStatus}
     */
    PeopleTaskStatus,

    /**
     * The PeopleTaskStatusResponse model constructor.
     * @property {module:model/PeopleTaskStatusResponse}
     */
    PeopleTaskStatusResponse,

    /**
     * The PeopleUniverseRequest model constructor.
     * @property {module:model/PeopleUniverseRequest}
     */
    PeopleUniverseRequest,

    /**
     * The PeopleUniverseResponse model constructor.
     * @property {module:model/PeopleUniverseResponse}
     */
    PeopleUniverseResponse,

    /**
     * The SnowflakeEntityMappingRequest model constructor.
     * @property {module:model/SnowflakeEntityMappingRequest}
     */
    SnowflakeEntityMappingRequest,

    /**
     * The SnowflakeEntityMappingResponse model constructor.
     * @property {module:model/SnowflakeEntityMappingResponse}
     */
    SnowflakeEntityMappingResponse,

    /**
     * The SnowflakeEntityMatchRequest model constructor.
     * @property {module:model/SnowflakeEntityMatchRequest}
     */
    SnowflakeEntityMatchRequest,

    /**
     * The SnowflakeEntityMatchResponse model constructor.
     * @property {module:model/SnowflakeEntityMatchResponse}
     */
    SnowflakeEntityMatchResponse,

    /**
     * The Universe model constructor.
     * @property {module:model/Universe}
     */
    Universe,

    /**
     * The UniverseMeta model constructor.
     * @property {module:model/UniverseMeta}
     */
    UniverseMeta,

    /**
     * The UniverseMetaResponse model constructor.
     * @property {module:model/UniverseMetaResponse}
     */
    UniverseMetaResponse,

    /**
     * The UniverseStatistics model constructor.
     * @property {module:model/UniverseStatistics}
     */
    UniverseStatistics,

    /**
     * The UniverseStatisticsResponse model constructor.
     * @property {module:model/UniverseStatisticsResponse}
     */
    UniverseStatisticsResponse,

    /**
     * The UniversesResponse model constructor.
     * @property {module:model/UniversesResponse}
     */
    UniversesResponse,

    /**
     * The UpdateUniverseRequest model constructor.
     * @property {module:model/UpdateUniverseRequest}
     */
    UpdateUniverseRequest,

    /**
    * The EntityMatchApi service constructor.
    * @property {module:api/EntityMatchApi}
    */
    EntityMatchApi,

    /**
    * The EntityMatchBulkApi service constructor.
    * @property {module:api/EntityMatchBulkApi}
    */
    EntityMatchBulkApi,

    /**
    * The MappingsApi service constructor.
    * @property {module:api/MappingsApi}
    */
    MappingsApi,

    /**
    * The PeopleMappingApi service constructor.
    * @property {module:api/PeopleMappingApi}
    */
    PeopleMappingApi,

    /**
    * The PeopleMatchApi service constructor.
    * @property {module:api/PeopleMatchApi}
    */
    PeopleMatchApi,

    /**
    * The PeopleMatchBulkApi service constructor.
    * @property {module:api/PeopleMatchBulkApi}
    */
    PeopleMatchBulkApi,

    /**
    * The SnowflakeApi service constructor.
    * @property {module:api/SnowflakeApi}
    */
    SnowflakeApi,

    /**
    * The UniversesApi service constructor.
    * @property {module:api/UniversesApi}
    */
    UniversesApi,

};
