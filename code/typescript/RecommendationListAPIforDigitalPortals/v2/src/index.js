/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import CursorBasedPaginationOutputObject from './model/CursorBasedPaginationOutputObject';
import CursorBasedPaginationOutputObjectWithoutTotal from './model/CursorBasedPaginationOutputObjectWithoutTotal';
import ErrorMetaObject from './model/ErrorMetaObject';
import InlineObject from './model/InlineObject';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import InlineResponse2001ActiveRange from './model/InlineResponse2001ActiveRange';
import InlineResponse2001Data from './model/InlineResponse2001Data';
import InlineResponse2002 from './model/InlineResponse2002';
import InlineResponse2002Data from './model/InlineResponse2002Data';
import InlineResponse2002DataInstrument from './model/InlineResponse2002DataInstrument';
import InlineResponse2002DataRecommendationList from './model/InlineResponse2002DataRecommendationList';
import InlineResponse2002DataTypes from './model/InlineResponse2002DataTypes';
import InlineResponse2003 from './model/InlineResponse2003';
import InlineResponse2003Data from './model/InlineResponse2003Data';
import InlineResponse2004 from './model/InlineResponse2004';
import InlineResponse2004Data from './model/InlineResponse2004Data';
import InlineResponse2005 from './model/InlineResponse2005';
import InlineResponse2005Data from './model/InlineResponse2005Data';
import InlineResponse2005Description from './model/InlineResponse2005Description';
import InlineResponse2005Notation from './model/InlineResponse2005Notation';
import InlineResponse2005NotationInstrument from './model/InlineResponse2005NotationInstrument';
import InlineResponse2005NotationInstrumentType from './model/InlineResponse2005NotationInstrumentType';
import InlineResponse2005NotationMarket from './model/InlineResponse2005NotationMarket';
import InlineResponse2005RecommendationClass from './model/InlineResponse2005RecommendationClass';
import InlineResponse200Data from './model/InlineResponse200Data';
import InlineResponse200DataActiveRange from './model/InlineResponse200DataActiveRange';
import InlineResponse200DataActiveRevision from './model/InlineResponse200DataActiveRevision';
import InlineResponse200DataActiveRevisionActiveRange from './model/InlineResponse200DataActiveRevisionActiveRange';
import InlineResponse200Meta from './model/InlineResponse200Meta';
import OffsetBasedPaginationOutputObject from './model/OffsetBasedPaginationOutputObject';
import OffsetBasedPaginationOutputObjectWithoutTotal from './model/OffsetBasedPaginationOutputObjectWithoutTotal';
import PartialOutputObject from './model/PartialOutputObject';
import RecommendationListRevisionListData from './model/RecommendationListRevisionListData';
import RecommendationListRevisionListDataActiveRange from './model/RecommendationListRevisionListDataActiveRange';
import RecommendationListRevisionListMeta from './model/RecommendationListRevisionListMeta';
import StatusObject from './model/StatusObject';
import RecommendationListApi from './api/RecommendationListApi';


/**
* JS API client generated by OpenAPI Generator.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var recommendationlistapifordigitalportals = require('index'); // See note below*.
* var xxxSvc = new recommendationlistapifordigitalportals.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new recommendationlistapifordigitalportals.Yyy(); // Construct a model instance.
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
* var xxxSvc = new recommendationlistapifordigitalportals.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new recommendationlistapifordigitalportals.Yyy(); // Construct a model instance.
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
     * The CursorBasedPaginationOutputObject model constructor.
     * @property {module:model/CursorBasedPaginationOutputObject}
     */
    CursorBasedPaginationOutputObject,

    /**
     * The CursorBasedPaginationOutputObjectWithoutTotal model constructor.
     * @property {module:model/CursorBasedPaginationOutputObjectWithoutTotal}
     */
    CursorBasedPaginationOutputObjectWithoutTotal,

    /**
     * The ErrorMetaObject model constructor.
     * @property {module:model/ErrorMetaObject}
     */
    ErrorMetaObject,

    /**
     * The InlineObject model constructor.
     * @property {module:model/InlineObject}
     */
    InlineObject,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
     * The InlineResponse2001 model constructor.
     * @property {module:model/InlineResponse2001}
     */
    InlineResponse2001,

    /**
     * The InlineResponse2001ActiveRange model constructor.
     * @property {module:model/InlineResponse2001ActiveRange}
     */
    InlineResponse2001ActiveRange,

    /**
     * The InlineResponse2001Data model constructor.
     * @property {module:model/InlineResponse2001Data}
     */
    InlineResponse2001Data,

    /**
     * The InlineResponse2002 model constructor.
     * @property {module:model/InlineResponse2002}
     */
    InlineResponse2002,

    /**
     * The InlineResponse2002Data model constructor.
     * @property {module:model/InlineResponse2002Data}
     */
    InlineResponse2002Data,

    /**
     * The InlineResponse2002DataInstrument model constructor.
     * @property {module:model/InlineResponse2002DataInstrument}
     */
    InlineResponse2002DataInstrument,

    /**
     * The InlineResponse2002DataRecommendationList model constructor.
     * @property {module:model/InlineResponse2002DataRecommendationList}
     */
    InlineResponse2002DataRecommendationList,

    /**
     * The InlineResponse2002DataTypes model constructor.
     * @property {module:model/InlineResponse2002DataTypes}
     */
    InlineResponse2002DataTypes,

    /**
     * The InlineResponse2003 model constructor.
     * @property {module:model/InlineResponse2003}
     */
    InlineResponse2003,

    /**
     * The InlineResponse2003Data model constructor.
     * @property {module:model/InlineResponse2003Data}
     */
    InlineResponse2003Data,

    /**
     * The InlineResponse2004 model constructor.
     * @property {module:model/InlineResponse2004}
     */
    InlineResponse2004,

    /**
     * The InlineResponse2004Data model constructor.
     * @property {module:model/InlineResponse2004Data}
     */
    InlineResponse2004Data,

    /**
     * The InlineResponse2005 model constructor.
     * @property {module:model/InlineResponse2005}
     */
    InlineResponse2005,

    /**
     * The InlineResponse2005Data model constructor.
     * @property {module:model/InlineResponse2005Data}
     */
    InlineResponse2005Data,

    /**
     * The InlineResponse2005Description model constructor.
     * @property {module:model/InlineResponse2005Description}
     */
    InlineResponse2005Description,

    /**
     * The InlineResponse2005Notation model constructor.
     * @property {module:model/InlineResponse2005Notation}
     */
    InlineResponse2005Notation,

    /**
     * The InlineResponse2005NotationInstrument model constructor.
     * @property {module:model/InlineResponse2005NotationInstrument}
     */
    InlineResponse2005NotationInstrument,

    /**
     * The InlineResponse2005NotationInstrumentType model constructor.
     * @property {module:model/InlineResponse2005NotationInstrumentType}
     */
    InlineResponse2005NotationInstrumentType,

    /**
     * The InlineResponse2005NotationMarket model constructor.
     * @property {module:model/InlineResponse2005NotationMarket}
     */
    InlineResponse2005NotationMarket,

    /**
     * The InlineResponse2005RecommendationClass model constructor.
     * @property {module:model/InlineResponse2005RecommendationClass}
     */
    InlineResponse2005RecommendationClass,

    /**
     * The InlineResponse200Data model constructor.
     * @property {module:model/InlineResponse200Data}
     */
    InlineResponse200Data,

    /**
     * The InlineResponse200DataActiveRange model constructor.
     * @property {module:model/InlineResponse200DataActiveRange}
     */
    InlineResponse200DataActiveRange,

    /**
     * The InlineResponse200DataActiveRevision model constructor.
     * @property {module:model/InlineResponse200DataActiveRevision}
     */
    InlineResponse200DataActiveRevision,

    /**
     * The InlineResponse200DataActiveRevisionActiveRange model constructor.
     * @property {module:model/InlineResponse200DataActiveRevisionActiveRange}
     */
    InlineResponse200DataActiveRevisionActiveRange,

    /**
     * The InlineResponse200Meta model constructor.
     * @property {module:model/InlineResponse200Meta}
     */
    InlineResponse200Meta,

    /**
     * The OffsetBasedPaginationOutputObject model constructor.
     * @property {module:model/OffsetBasedPaginationOutputObject}
     */
    OffsetBasedPaginationOutputObject,

    /**
     * The OffsetBasedPaginationOutputObjectWithoutTotal model constructor.
     * @property {module:model/OffsetBasedPaginationOutputObjectWithoutTotal}
     */
    OffsetBasedPaginationOutputObjectWithoutTotal,

    /**
     * The PartialOutputObject model constructor.
     * @property {module:model/PartialOutputObject}
     */
    PartialOutputObject,

    /**
     * The RecommendationListRevisionListData model constructor.
     * @property {module:model/RecommendationListRevisionListData}
     */
    RecommendationListRevisionListData,

    /**
     * The RecommendationListRevisionListDataActiveRange model constructor.
     * @property {module:model/RecommendationListRevisionListDataActiveRange}
     */
    RecommendationListRevisionListDataActiveRange,

    /**
     * The RecommendationListRevisionListMeta model constructor.
     * @property {module:model/RecommendationListRevisionListMeta}
     */
    RecommendationListRevisionListMeta,

    /**
     * The StatusObject model constructor.
     * @property {module:model/StatusObject}
     */
    StatusObject,

    /**
    * The RecommendationListApi service constructor.
    * @property {module:api/RecommendationListApi}
    */
    RecommendationListApi
};
