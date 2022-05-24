/**
 * Exchange DataFeed Snapshot
 * FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import DFSnapshotResponse from './model/DFSnapshotResponse';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import Fields from './model/Fields';
import Specialfield from './model/Specialfield';

import SnapshotApi from './api/SnapshotApi';


/**
* Exchange DataFeed Snapshot API - Symbol List client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var exchangedatafeedsnapshotapisymbollist = require('index'); // See note below*.
* var xxxSvc = new exchangedatafeedsnapshotapisymbollist.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new exchangedatafeedsnapshotapisymbollist.Yyy(); // Construct a model instance.
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
* var xxxSvc = new exchangedatafeedsnapshotapisymbollist.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new exchangedatafeedsnapshotapisymbollist.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 0.20.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The DFSnapshotResponse model constructor.
     * @property {module:model/DFSnapshotResponse}
     */
    DFSnapshotResponse,

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
     * The Fields model constructor.
     * @property {module:model/Fields}
     */
    Fields,

    /**
     * The Specialfield model constructor.
     * @property {module:model/Specialfield}
     */
    Specialfield,

    /**
    * The SnapshotApi service constructor.
    * @property {module:api/SnapshotApi}
    */
    SnapshotApi,

};
