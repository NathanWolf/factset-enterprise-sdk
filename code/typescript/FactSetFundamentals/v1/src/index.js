/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Category from './model/Category';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import Fundamental from './model/Fundamental';
import FundamentalsRequest from './model/FundamentalsRequest';
import FundamentalsResponse from './model/FundamentalsResponse';
import Metric from './model/Metric';
import MetricsRequest from './model/MetricsRequest';
import MetricsResponse from './model/MetricsResponse';
import Periodicity from './model/Periodicity';
import Restated from './model/Restated';
import Subcategory from './model/Subcategory';

import DataItemsApi from './api/DataItemsApi';
import FactSetFundamentalsApi from './api/FactSetFundamentalsApi';


/**
* FactSet Fundamentals client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetfundamentals = require('index'); // See note below*.
* var xxxSvc = new factsetfundamentals.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetfundamentals.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetfundamentals.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetfundamentals.Yyy(); // Construct a model instance.
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
     * The Category model constructor.
     * @property {module:model/Category}
     */
    Category,

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
     * The Fundamental model constructor.
     * @property {module:model/Fundamental}
     */
    Fundamental,

    /**
     * The FundamentalsRequest model constructor.
     * @property {module:model/FundamentalsRequest}
     */
    FundamentalsRequest,

    /**
     * The FundamentalsResponse model constructor.
     * @property {module:model/FundamentalsResponse}
     */
    FundamentalsResponse,

    /**
     * The Metric model constructor.
     * @property {module:model/Metric}
     */
    Metric,

    /**
     * The MetricsRequest model constructor.
     * @property {module:model/MetricsRequest}
     */
    MetricsRequest,

    /**
     * The MetricsResponse model constructor.
     * @property {module:model/MetricsResponse}
     */
    MetricsResponse,

    /**
     * The Periodicity model constructor.
     * @property {module:model/Periodicity}
     */
    Periodicity,

    /**
     * The Restated model constructor.
     * @property {module:model/Restated}
     */
    Restated,

    /**
     * The Subcategory model constructor.
     * @property {module:model/Subcategory}
     */
    Subcategory,

    /**
    * The DataItemsApi service constructor.
    * @property {module:api/DataItemsApi}
    */
    DataItemsApi,

    /**
    * The FactSetFundamentalsApi service constructor.
    * @property {module:api/FactSetFundamentalsApi}
    */
    FactSetFundamentalsApi,

};
