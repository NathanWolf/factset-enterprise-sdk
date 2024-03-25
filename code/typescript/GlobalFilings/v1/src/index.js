/**
 * Global Filings API
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The reference endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
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
import ErrorExample from './model/ErrorExample';
import ErrorResponse from './model/ErrorResponse';
import InvestmentResearch from './model/InvestmentResearch';
import InvestmentResearchMeta from './model/InvestmentResearchMeta';
import InvestmentResearchMetaPagination from './model/InvestmentResearchMetaPagination';
import InvestmentResearchObject from './model/InvestmentResearchObject';
import ResponseCategies from './model/ResponseCategies';
import ResponseCategoriesObject from './model/ResponseCategoriesObject';
import ResponseCount from './model/ResponseCount';
import ResponseCountObject from './model/ResponseCountObject';
import ResponseFormtype from './model/ResponseFormtype';
import ResponseFormtypeObject from './model/ResponseFormtypeObject';
import ResponseSources from './model/ResponseSources';
import ResponseSourcesObject from './model/ResponseSourcesObject';
import ResponseSourcesObjectSourcesObject from './model/ResponseSourcesObjectSourcesObject';
import ResponseTime from './model/ResponseTime';
import ResponseTimeObject from './model/ResponseTimeObject';

import FilingsAPIApi from './api/FilingsAPIApi';


/**
* Global Filings client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var globalfilings = require('index'); // See note below*.
* var xxxSvc = new globalfilings.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new globalfilings.Yyy(); // Construct a model instance.
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
* var xxxSvc = new globalfilings.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new globalfilings.Yyy(); // Construct a model instance.
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
     * The ErrorExample model constructor.
     * @property {module:model/ErrorExample}
     */
    ErrorExample,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The InvestmentResearch model constructor.
     * @property {module:model/InvestmentResearch}
     */
    InvestmentResearch,

    /**
     * The InvestmentResearchMeta model constructor.
     * @property {module:model/InvestmentResearchMeta}
     */
    InvestmentResearchMeta,

    /**
     * The InvestmentResearchMetaPagination model constructor.
     * @property {module:model/InvestmentResearchMetaPagination}
     */
    InvestmentResearchMetaPagination,

    /**
     * The InvestmentResearchObject model constructor.
     * @property {module:model/InvestmentResearchObject}
     */
    InvestmentResearchObject,

    /**
     * The ResponseCategies model constructor.
     * @property {module:model/ResponseCategies}
     */
    ResponseCategies,

    /**
     * The ResponseCategoriesObject model constructor.
     * @property {module:model/ResponseCategoriesObject}
     */
    ResponseCategoriesObject,

    /**
     * The ResponseCount model constructor.
     * @property {module:model/ResponseCount}
     */
    ResponseCount,

    /**
     * The ResponseCountObject model constructor.
     * @property {module:model/ResponseCountObject}
     */
    ResponseCountObject,

    /**
     * The ResponseFormtype model constructor.
     * @property {module:model/ResponseFormtype}
     */
    ResponseFormtype,

    /**
     * The ResponseFormtypeObject model constructor.
     * @property {module:model/ResponseFormtypeObject}
     */
    ResponseFormtypeObject,

    /**
     * The ResponseSources model constructor.
     * @property {module:model/ResponseSources}
     */
    ResponseSources,

    /**
     * The ResponseSourcesObject model constructor.
     * @property {module:model/ResponseSourcesObject}
     */
    ResponseSourcesObject,

    /**
     * The ResponseSourcesObjectSourcesObject model constructor.
     * @property {module:model/ResponseSourcesObjectSourcesObject}
     */
    ResponseSourcesObjectSourcesObject,

    /**
     * The ResponseTime model constructor.
     * @property {module:model/ResponseTime}
     */
    ResponseTime,

    /**
     * The ResponseTimeObject model constructor.
     * @property {module:model/ResponseTimeObject}
     */
    ResponseTimeObject,

    /**
    * The FilingsAPIApi service constructor.
    * @property {module:api/FilingsAPIApi}
    */
    FilingsAPIApi,

};
