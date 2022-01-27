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


import ApiClient from './ApiClient';
import CreateDatabaseResponse from './model/CreateDatabaseResponse';
import DatabaseSchema from './model/DatabaseSchema';
import InlineObject from './model/InlineObject';
import InlineObject1 from './model/InlineObject1';
import InlineObject2 from './model/InlineObject2';
import InlineObject3 from './model/InlineObject3';
import InlineObject4 from './model/InlineObject4';
import InlineObject5 from './model/InlineObject5';
import InlineResponse201 from './model/InlineResponse201';
import Ofdb from './model/Ofdb';
import SuccessPostResponse from './model/SuccessPostResponse';
import CreateApi from './api/CreateApi';
import ModifyApi from './api/ModifyApi';
import ViewApi from './api/ViewApi';


/**
* OFDB_api.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var ofdb = require('index'); // See note below*.
* var xxxSvc = new ofdb.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new ofdb.Yyy(); // Construct a model instance.
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
* var xxxSvc = new ofdb.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new ofdb.Yyy(); // Construct a model instance.
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
     * The CreateDatabaseResponse model constructor.
     * @property {module:model/CreateDatabaseResponse}
     */
    CreateDatabaseResponse,

    /**
     * The DatabaseSchema model constructor.
     * @property {module:model/DatabaseSchema}
     */
    DatabaseSchema,

    /**
     * The InlineObject model constructor.
     * @property {module:model/InlineObject}
     */
    InlineObject,

    /**
     * The InlineObject1 model constructor.
     * @property {module:model/InlineObject1}
     */
    InlineObject1,

    /**
     * The InlineObject2 model constructor.
     * @property {module:model/InlineObject2}
     */
    InlineObject2,

    /**
     * The InlineObject3 model constructor.
     * @property {module:model/InlineObject3}
     */
    InlineObject3,

    /**
     * The InlineObject4 model constructor.
     * @property {module:model/InlineObject4}
     */
    InlineObject4,

    /**
     * The InlineObject5 model constructor.
     * @property {module:model/InlineObject5}
     */
    InlineObject5,

    /**
     * The InlineResponse201 model constructor.
     * @property {module:model/InlineResponse201}
     */
    InlineResponse201,

    /**
     * The Ofdb model constructor.
     * @property {module:model/Ofdb}
     */
    Ofdb,

    /**
     * The SuccessPostResponse model constructor.
     * @property {module:model/SuccessPostResponse}
     */
    SuccessPostResponse,

    /**
    * The CreateApi service constructor.
    * @property {module:api/CreateApi}
    */
    CreateApi,

    /**
    * The ModifyApi service constructor.
    * @property {module:api/ModifyApi}
    */
    ModifyApi,

    /**
    * The ViewApi service constructor.
    * @property {module:api/ViewApi}
    */
    ViewApi
};
