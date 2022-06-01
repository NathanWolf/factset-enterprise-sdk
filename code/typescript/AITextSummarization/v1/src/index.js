/**
 * AI Text Summarization
 * AI Text Summarization
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
import BadRequestResponse from './model/BadRequestResponse';
import InternalServerErrorResponse from './model/InternalServerErrorResponse';
import Request from './model/Request';
import SuccessResponse from './model/SuccessResponse';

import DefaultApi from './api/DefaultApi';


/**
* AI Text Summarization client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var aitextsummarization = require('index'); // See note below*.
* var xxxSvc = new aitextsummarization.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new aitextsummarization.Yyy(); // Construct a model instance.
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
* var xxxSvc = new aitextsummarization.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new aitextsummarization.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 0.20.1
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The BadRequestResponse model constructor.
     * @property {module:model/BadRequestResponse}
     */
    BadRequestResponse,

    /**
     * The InternalServerErrorResponse model constructor.
     * @property {module:model/InternalServerErrorResponse}
     */
    InternalServerErrorResponse,

    /**
     * The Request model constructor.
     * @property {module:model/Request}
     */
    Request,

    /**
     * The SuccessResponse model constructor.
     * @property {module:model/SuccessResponse}
     */
    SuccessResponse,

    /**
    * The DefaultApi service constructor.
    * @property {module:api/DefaultApi}
    */
    DefaultApi,

};
