/**
 * Open:FactSet - Partners
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AuthStatus from './model/AuthStatus';
import BeamEndpointsFiles from './model/BeamEndpointsFiles';
import BeamEndpointsResponse from './model/BeamEndpointsResponse';
import BiomarkersFiles from './model/BiomarkersFiles';
import BiomarkersResponse from './model/BiomarkersResponse';
import Bonds from './model/Bonds';
import CollaboratorsFiles from './model/CollaboratorsFiles';
import CollaboratorsResponse from './model/CollaboratorsResponse';
import DataFiles from './model/DataFiles';
import DataResponse from './model/DataResponse';
import DiseasesFiles from './model/DiseasesFiles';
import DiseasesResponse from './model/DiseasesResponse';
import ErrorExample from './model/ErrorExample';
import FullHistoryFiles from './model/FullHistoryFiles';
import FullHistoryResponse from './model/FullHistoryResponse';
import InterventionFiles from './model/InterventionFiles';
import InterventionResponse from './model/InterventionResponse';
import LinkUpResponse from './model/LinkUpResponse';
import LinkupFiles from './model/LinkupFiles';
import LuxResponse from './model/LuxResponse';
import Meta from './model/Meta';
import OrangePurpleFiles from './model/OrangePurpleFiles';
import OrangePurpleResponse from './model/OrangePurpleResponse';
import OrbitFiles from './model/OrbitFiles';
import OrbitHistoryFiles from './model/OrbitHistoryFiles';
import OrbitResponse from './model/OrbitResponse';
import OrbithistoryResponse from './model/OrbithistoryResponse';
import Pagination from './model/Pagination';
import PrimaryOutcomeFiles from './model/PrimaryOutcomeFiles';
import PrimaryOutcomeResponse from './model/PrimaryOutcomeResponse';
import ScriptsAsiaResponse from './model/ScriptsAsiaResponse';
import SponsorsFiles from './model/SponsorsFiles';
import SponsorsResponse from './model/SponsorsResponse';
import Transcripts from './model/Transcripts';

import LinkUpApi from './api/LinkUpApi';
import LuxembourgApi from './api/LuxembourgApi';
import OrbitApi from './api/OrbitApi';
import OzmosiApi from './api/OzmosiApi';
import ScriptsAsiaApi from './api/ScriptsAsiaApi';


/**
* Open:FactSet Partners - Documents client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var openfactsetpartnersdocuments = require('index'); // See note below*.
* var xxxSvc = new openfactsetpartnersdocuments.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new openfactsetpartnersdocuments.Yyy(); // Construct a model instance.
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
* var xxxSvc = new openfactsetpartnersdocuments.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new openfactsetpartnersdocuments.Yyy(); // Construct a model instance.
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
     * The AuthStatus model constructor.
     * @property {module:model/AuthStatus}
     */
    AuthStatus,

    /**
     * The BeamEndpointsFiles model constructor.
     * @property {module:model/BeamEndpointsFiles}
     */
    BeamEndpointsFiles,

    /**
     * The BeamEndpointsResponse model constructor.
     * @property {module:model/BeamEndpointsResponse}
     */
    BeamEndpointsResponse,

    /**
     * The BiomarkersFiles model constructor.
     * @property {module:model/BiomarkersFiles}
     */
    BiomarkersFiles,

    /**
     * The BiomarkersResponse model constructor.
     * @property {module:model/BiomarkersResponse}
     */
    BiomarkersResponse,

    /**
     * The Bonds model constructor.
     * @property {module:model/Bonds}
     */
    Bonds,

    /**
     * The CollaboratorsFiles model constructor.
     * @property {module:model/CollaboratorsFiles}
     */
    CollaboratorsFiles,

    /**
     * The CollaboratorsResponse model constructor.
     * @property {module:model/CollaboratorsResponse}
     */
    CollaboratorsResponse,

    /**
     * The DataFiles model constructor.
     * @property {module:model/DataFiles}
     */
    DataFiles,

    /**
     * The DataResponse model constructor.
     * @property {module:model/DataResponse}
     */
    DataResponse,

    /**
     * The DiseasesFiles model constructor.
     * @property {module:model/DiseasesFiles}
     */
    DiseasesFiles,

    /**
     * The DiseasesResponse model constructor.
     * @property {module:model/DiseasesResponse}
     */
    DiseasesResponse,

    /**
     * The ErrorExample model constructor.
     * @property {module:model/ErrorExample}
     */
    ErrorExample,

    /**
     * The FullHistoryFiles model constructor.
     * @property {module:model/FullHistoryFiles}
     */
    FullHistoryFiles,

    /**
     * The FullHistoryResponse model constructor.
     * @property {module:model/FullHistoryResponse}
     */
    FullHistoryResponse,

    /**
     * The InterventionFiles model constructor.
     * @property {module:model/InterventionFiles}
     */
    InterventionFiles,

    /**
     * The InterventionResponse model constructor.
     * @property {module:model/InterventionResponse}
     */
    InterventionResponse,

    /**
     * The LinkUpResponse model constructor.
     * @property {module:model/LinkUpResponse}
     */
    LinkUpResponse,

    /**
     * The LinkupFiles model constructor.
     * @property {module:model/LinkupFiles}
     */
    LinkupFiles,

    /**
     * The LuxResponse model constructor.
     * @property {module:model/LuxResponse}
     */
    LuxResponse,

    /**
     * The Meta model constructor.
     * @property {module:model/Meta}
     */
    Meta,

    /**
     * The OrangePurpleFiles model constructor.
     * @property {module:model/OrangePurpleFiles}
     */
    OrangePurpleFiles,

    /**
     * The OrangePurpleResponse model constructor.
     * @property {module:model/OrangePurpleResponse}
     */
    OrangePurpleResponse,

    /**
     * The OrbitFiles model constructor.
     * @property {module:model/OrbitFiles}
     */
    OrbitFiles,

    /**
     * The OrbitHistoryFiles model constructor.
     * @property {module:model/OrbitHistoryFiles}
     */
    OrbitHistoryFiles,

    /**
     * The OrbitResponse model constructor.
     * @property {module:model/OrbitResponse}
     */
    OrbitResponse,

    /**
     * The OrbithistoryResponse model constructor.
     * @property {module:model/OrbithistoryResponse}
     */
    OrbithistoryResponse,

    /**
     * The Pagination model constructor.
     * @property {module:model/Pagination}
     */
    Pagination,

    /**
     * The PrimaryOutcomeFiles model constructor.
     * @property {module:model/PrimaryOutcomeFiles}
     */
    PrimaryOutcomeFiles,

    /**
     * The PrimaryOutcomeResponse model constructor.
     * @property {module:model/PrimaryOutcomeResponse}
     */
    PrimaryOutcomeResponse,

    /**
     * The ScriptsAsiaResponse model constructor.
     * @property {module:model/ScriptsAsiaResponse}
     */
    ScriptsAsiaResponse,

    /**
     * The SponsorsFiles model constructor.
     * @property {module:model/SponsorsFiles}
     */
    SponsorsFiles,

    /**
     * The SponsorsResponse model constructor.
     * @property {module:model/SponsorsResponse}
     */
    SponsorsResponse,

    /**
     * The Transcripts model constructor.
     * @property {module:model/Transcripts}
     */
    Transcripts,

    /**
    * The LinkUpApi service constructor.
    * @property {module:api/LinkUpApi}
    */
    LinkUpApi,

    /**
    * The LuxembourgApi service constructor.
    * @property {module:api/LuxembourgApi}
    */
    LuxembourgApi,

    /**
    * The OrbitApi service constructor.
    * @property {module:api/OrbitApi}
    */
    OrbitApi,

    /**
    * The OzmosiApi service constructor.
    * @property {module:api/OzmosiApi}
    */
    OzmosiApi,

    /**
    * The ScriptsAsiaApi service constructor.
    * @property {module:api/ScriptsAsiaApi}
    */
    ScriptsAsiaApi,

};
