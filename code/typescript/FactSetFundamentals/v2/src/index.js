/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Batch from './model/Batch';
import BatchErrorObject from './model/BatchErrorObject';
import BatchResult from './model/BatchResult';
import BatchResultResponse from './model/BatchResultResponse';
import BatchStatus from './model/BatchStatus';
import BatchStatusResponse from './model/BatchStatusResponse';
import ErrorObject from './model/ErrorObject';
import ErrorObjectLinks from './model/ErrorObjectLinks';
import ErrorResponse from './model/ErrorResponse';
import FiscalPeriod from './model/FiscalPeriod';
import Fundamental from './model/Fundamental';
import FundamentalRequestBody from './model/FundamentalRequestBody';
import FundamentalValue from './model/FundamentalValue';
import FundamentalsRequest from './model/FundamentalsRequest';
import FundamentalsResponse from './model/FundamentalsResponse';
import Metric from './model/Metric';
import MetricsResponse from './model/MetricsResponse';
import Periodicity from './model/Periodicity';
import Segment from './model/Segment';
import SegmentRequestBody from './model/SegmentRequestBody';
import SegmentType from './model/SegmentType';
import SegmentValue from './model/SegmentValue';
import SegmentsPeriodicity from './model/SegmentsPeriodicity';
import SegmentsRequest from './model/SegmentsRequest';
import SegmentsResponse from './model/SegmentsResponse';
import UpdateType from './model/UpdateType';

import BatchProcessingApi from './api/BatchProcessingApi';
import GetBatchDataResponseWrapper from './api/BatchProcessingApi';
import FactSetFundamentalsApi from './api/FactSetFundamentalsApi';
import GetFdsFundamentalsForListResponseWrapper from './api/FactSetFundamentalsApi';
import MetricsApi from './api/MetricsApi';
import SegmentsApi from './api/SegmentsApi';
import GetFdsSegmentsForListResponseWrapper from './api/SegmentsApi';


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
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Batch model constructor.
     * @property {module:model/Batch}
     */
    Batch,

    /**
     * The BatchErrorObject model constructor.
     * @property {module:model/BatchErrorObject}
     */
    BatchErrorObject,

    /**
     * The BatchResult model constructor.
     * @property {module:model/BatchResult}
     */
    BatchResult,

    /**
     * The BatchResultResponse model constructor.
     * @property {module:model/BatchResultResponse}
     */
    BatchResultResponse,

    /**
     * The BatchStatus model constructor.
     * @property {module:model/BatchStatus}
     */
    BatchStatus,

    /**
     * The BatchStatusResponse model constructor.
     * @property {module:model/BatchStatusResponse}
     */
    BatchStatusResponse,

    /**
     * The ErrorObject model constructor.
     * @property {module:model/ErrorObject}
     */
    ErrorObject,

    /**
     * The ErrorObjectLinks model constructor.
     * @property {module:model/ErrorObjectLinks}
     */
    ErrorObjectLinks,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The FiscalPeriod model constructor.
     * @property {module:model/FiscalPeriod}
     */
    FiscalPeriod,

    /**
     * The Fundamental model constructor.
     * @property {module:model/Fundamental}
     */
    Fundamental,

    /**
     * The FundamentalRequestBody model constructor.
     * @property {module:model/FundamentalRequestBody}
     */
    FundamentalRequestBody,

    /**
     * The FundamentalValue model constructor.
     * @property {module:model/FundamentalValue}
     */
    FundamentalValue,

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
     * The Segment model constructor.
     * @property {module:model/Segment}
     */
    Segment,

    /**
     * The SegmentRequestBody model constructor.
     * @property {module:model/SegmentRequestBody}
     */
    SegmentRequestBody,

    /**
     * The SegmentType model constructor.
     * @property {module:model/SegmentType}
     */
    SegmentType,

    /**
     * The SegmentValue model constructor.
     * @property {module:model/SegmentValue}
     */
    SegmentValue,

    /**
     * The SegmentsPeriodicity model constructor.
     * @property {module:model/SegmentsPeriodicity}
     */
    SegmentsPeriodicity,

    /**
     * The SegmentsRequest model constructor.
     * @property {module:model/SegmentsRequest}
     */
    SegmentsRequest,

    /**
     * The SegmentsResponse model constructor.
     * @property {module:model/SegmentsResponse}
     */
    SegmentsResponse,

    /**
     * The UpdateType model constructor.
     * @property {module:model/UpdateType}
     */
    UpdateType,

    /**
    * The BatchProcessingApi service constructor.
    * @property {module:api/BatchProcessingApi}
    */
    BatchProcessingApi,

    /**
    * The GetBatchData response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetBatchDataResponseWrapper,

    /**
    * The FactSetFundamentalsApi service constructor.
    * @property {module:api/FactSetFundamentalsApi}
    */
    FactSetFundamentalsApi,

    /**
    * The GetFdsFundamentalsForList response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetFdsFundamentalsForListResponseWrapper,

    /**
    * The MetricsApi service constructor.
    * @property {module:api/MetricsApi}
    */
    MetricsApi,

    /**
    * The SegmentsApi service constructor.
    * @property {module:api/SegmentsApi}
    */
    SegmentsApi,

    /**
    * The GetFdsSegmentsForList response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetFdsSegmentsForListResponseWrapper,

};
