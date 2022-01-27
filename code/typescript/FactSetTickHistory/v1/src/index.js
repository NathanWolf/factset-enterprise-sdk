/**
 * TickHistory
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Data from './model/Data';
import GetFilesErrorDetail from './model/GetFilesErrorDetail';
import GetFilesResponse from './model/GetFilesResponse';
import GetFilesStatus from './model/GetFilesStatus';
import Meta from './model/Meta';
import Pagination from './model/Pagination';
import Partial from './model/Partial';
import RequestFileErrorDetails from './model/RequestFileErrorDetails';
import RequestFilesResponse from './model/RequestFilesResponse';
import RequestFilestatus from './model/RequestFilestatus';
import GetFilesApi from './api/GetFilesApi';
import RequestFilesApi from './api/RequestFilesApi';


/**
* TickHistory_provides_dynamic_access_to_historical_tick_data_for_a_specific_security_for_specific_dates_or_date_range_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsettickhistory = require('index'); // See note below*.
* var xxxSvc = new factsettickhistory.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsettickhistory.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsettickhistory.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsettickhistory.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 0.9.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Data model constructor.
     * @property {module:model/Data}
     */
    Data,

    /**
     * The GetFilesErrorDetail model constructor.
     * @property {module:model/GetFilesErrorDetail}
     */
    GetFilesErrorDetail,

    /**
     * The GetFilesResponse model constructor.
     * @property {module:model/GetFilesResponse}
     */
    GetFilesResponse,

    /**
     * The GetFilesStatus model constructor.
     * @property {module:model/GetFilesStatus}
     */
    GetFilesStatus,

    /**
     * The Meta model constructor.
     * @property {module:model/Meta}
     */
    Meta,

    /**
     * The Pagination model constructor.
     * @property {module:model/Pagination}
     */
    Pagination,

    /**
     * The Partial model constructor.
     * @property {module:model/Partial}
     */
    Partial,

    /**
     * The RequestFileErrorDetails model constructor.
     * @property {module:model/RequestFileErrorDetails}
     */
    RequestFileErrorDetails,

    /**
     * The RequestFilesResponse model constructor.
     * @property {module:model/RequestFilesResponse}
     */
    RequestFilesResponse,

    /**
     * The RequestFilestatus model constructor.
     * @property {module:model/RequestFilestatus}
     */
    RequestFilestatus,

    /**
    * The GetFilesApi service constructor.
    * @property {module:api/GetFilesApi}
    */
    GetFilesApi,

    /**
    * The RequestFilesApi service constructor.
    * @property {module:api/RequestFilesApi}
    */
    RequestFilesApi
};
