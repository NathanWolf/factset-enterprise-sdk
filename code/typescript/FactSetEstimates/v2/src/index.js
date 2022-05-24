/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import Category from './model/Category';
import ConsensusEstimate from './model/ConsensusEstimate';
import ConsensusRatings from './model/ConsensusRatings';
import ConsensusRatingsRequest from './model/ConsensusRatingsRequest';
import ConsensusRatingsResponse from './model/ConsensusRatingsResponse';
import ConsensusResponse from './model/ConsensusResponse';
import DetailEstimate from './model/DetailEstimate';
import DetailRatings from './model/DetailRatings';
import DetailRatingsRequest from './model/DetailRatingsRequest';
import DetailRatingsResponse from './model/DetailRatingsResponse';
import DetailResponse from './model/DetailResponse';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import FixedConsensusRequest from './model/FixedConsensusRequest';
import FixedDetailRequest from './model/FixedDetailRequest';
import Frequency from './model/Frequency';
import Metric from './model/Metric';
import MetricsRequest from './model/MetricsRequest';
import MetricsResponse from './model/MetricsResponse';
import Periodicity from './model/Periodicity';
import PeriodicityDetail from './model/PeriodicityDetail';
import PeriodicitySurprise from './model/PeriodicitySurprise';
import RollingConsensusRequest from './model/RollingConsensusRequest';
import RollingDetailRequest from './model/RollingDetailRequest';
import SegmentType from './model/SegmentType';
import SegmentsEstimate from './model/SegmentsEstimate';
import SegmentsRequest from './model/SegmentsRequest';
import SegmentsResponse from './model/SegmentsResponse';
import Statistic from './model/Statistic';
import Subcategory from './model/Subcategory';
import Surprise from './model/Surprise';
import SurpriseRequest from './model/SurpriseRequest';
import SurpriseResponse from './model/SurpriseResponse';

import BrokerDetailApi from './api/BrokerDetailApi';
import ConsensusApi from './api/ConsensusApi';
import DataItemsApi from './api/DataItemsApi';
import RatingsApi from './api/RatingsApi';
import SegmentsApi from './api/SegmentsApi';
import SurpriseApi from './api/SurpriseApi';


/**
* FactSet Estimates client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetestimates = require('index'); // See note below*.
* var xxxSvc = new factsetestimates.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetestimates.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetestimates.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetestimates.Yyy(); // Construct a model instance.
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
     * The ConsensusEstimate model constructor.
     * @property {module:model/ConsensusEstimate}
     */
    ConsensusEstimate,

    /**
     * The ConsensusRatings model constructor.
     * @property {module:model/ConsensusRatings}
     */
    ConsensusRatings,

    /**
     * The ConsensusRatingsRequest model constructor.
     * @property {module:model/ConsensusRatingsRequest}
     */
    ConsensusRatingsRequest,

    /**
     * The ConsensusRatingsResponse model constructor.
     * @property {module:model/ConsensusRatingsResponse}
     */
    ConsensusRatingsResponse,

    /**
     * The ConsensusResponse model constructor.
     * @property {module:model/ConsensusResponse}
     */
    ConsensusResponse,

    /**
     * The DetailEstimate model constructor.
     * @property {module:model/DetailEstimate}
     */
    DetailEstimate,

    /**
     * The DetailRatings model constructor.
     * @property {module:model/DetailRatings}
     */
    DetailRatings,

    /**
     * The DetailRatingsRequest model constructor.
     * @property {module:model/DetailRatingsRequest}
     */
    DetailRatingsRequest,

    /**
     * The DetailRatingsResponse model constructor.
     * @property {module:model/DetailRatingsResponse}
     */
    DetailRatingsResponse,

    /**
     * The DetailResponse model constructor.
     * @property {module:model/DetailResponse}
     */
    DetailResponse,

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
     * The FixedConsensusRequest model constructor.
     * @property {module:model/FixedConsensusRequest}
     */
    FixedConsensusRequest,

    /**
     * The FixedDetailRequest model constructor.
     * @property {module:model/FixedDetailRequest}
     */
    FixedDetailRequest,

    /**
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

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
     * The PeriodicityDetail model constructor.
     * @property {module:model/PeriodicityDetail}
     */
    PeriodicityDetail,

    /**
     * The PeriodicitySurprise model constructor.
     * @property {module:model/PeriodicitySurprise}
     */
    PeriodicitySurprise,

    /**
     * The RollingConsensusRequest model constructor.
     * @property {module:model/RollingConsensusRequest}
     */
    RollingConsensusRequest,

    /**
     * The RollingDetailRequest model constructor.
     * @property {module:model/RollingDetailRequest}
     */
    RollingDetailRequest,

    /**
     * The SegmentType model constructor.
     * @property {module:model/SegmentType}
     */
    SegmentType,

    /**
     * The SegmentsEstimate model constructor.
     * @property {module:model/SegmentsEstimate}
     */
    SegmentsEstimate,

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
     * The Statistic model constructor.
     * @property {module:model/Statistic}
     */
    Statistic,

    /**
     * The Subcategory model constructor.
     * @property {module:model/Subcategory}
     */
    Subcategory,

    /**
     * The Surprise model constructor.
     * @property {module:model/Surprise}
     */
    Surprise,

    /**
     * The SurpriseRequest model constructor.
     * @property {module:model/SurpriseRequest}
     */
    SurpriseRequest,

    /**
     * The SurpriseResponse model constructor.
     * @property {module:model/SurpriseResponse}
     */
    SurpriseResponse,

    /**
    * The BrokerDetailApi service constructor.
    * @property {module:api/BrokerDetailApi}
    */
    BrokerDetailApi,

    /**
    * The ConsensusApi service constructor.
    * @property {module:api/ConsensusApi}
    */
    ConsensusApi,

    /**
    * The DataItemsApi service constructor.
    * @property {module:api/DataItemsApi}
    */
    DataItemsApi,

    /**
    * The RatingsApi service constructor.
    * @property {module:api/RatingsApi}
    */
    RatingsApi,

    /**
    * The SegmentsApi service constructor.
    * @property {module:api/SegmentsApi}
    */
    SegmentsApi,

    /**
    * The SurpriseApi service constructor.
    * @property {module:api/SurpriseApi}
    */
    SurpriseApi,

};
