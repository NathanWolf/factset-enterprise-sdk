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
import AlertingPricesBasicTriggerListData from './model/AlertingPricesBasicTriggerListData';
import AlertingPricesBasicTriggerListDataFilter from './model/AlertingPricesBasicTriggerListDataFilter';
import AlertingPricesBasicTriggerListDataFilterStatus from './model/AlertingPricesBasicTriggerListDataFilterStatus';
import AlertingPricesBasicTriggerListMeta from './model/AlertingPricesBasicTriggerListMeta';
import AlertingPricesBasicTriggerListMetaPagination from './model/AlertingPricesBasicTriggerListMetaPagination';
import CursorBasedPaginationOutputObject from './model/CursorBasedPaginationOutputObject';
import CursorBasedPaginationOutputObjectWithoutTotal from './model/CursorBasedPaginationOutputObjectWithoutTotal';
import ErrorMetaObject from './model/ErrorMetaObject';
import InlineObject from './model/InlineObject';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import InlineResponse2001Data from './model/InlineResponse2001Data';
import InlineResponse2001Meta from './model/InlineResponse2001Meta';
import InlineResponse2001Trigger from './model/InlineResponse2001Trigger';
import InlineResponse2001TriggerPrice from './model/InlineResponse2001TriggerPrice';
import InlineResponse2001TriggerStatus from './model/InlineResponse2001TriggerStatus';
import InlineResponse2002 from './model/InlineResponse2002';
import InlineResponse2002Data from './model/InlineResponse2002Data';
import InlineResponse2003 from './model/InlineResponse2003';
import InlineResponse2003Data from './model/InlineResponse2003Data';
import InlineResponse2003Range from './model/InlineResponse2003Range';
import InlineResponse200Data from './model/InlineResponse200Data';
import InlineResponse200DataPrice from './model/InlineResponse200DataPrice';
import InlineResponse200DataTrigger from './model/InlineResponse200DataTrigger';
import InlineResponse200DataTriggerNotation from './model/InlineResponse200DataTriggerNotation';
import InlineResponse200DataTriggerPrice from './model/InlineResponse200DataTriggerPrice';
import InlineResponse200DataTriggerRange from './model/InlineResponse200DataTriggerRange';
import InlineResponse200DataTriggerStatus from './model/InlineResponse200DataTriggerStatus';
import InlineResponse200Meta from './model/InlineResponse200Meta';
import OffsetBasedPaginationOutputObject from './model/OffsetBasedPaginationOutputObject';
import OffsetBasedPaginationOutputObjectWithoutTotal from './model/OffsetBasedPaginationOutputObjectWithoutTotal';
import PartialOutputObject from './model/PartialOutputObject';
import StatusObject from './model/StatusObject';
import AlertingApi from './api/AlertingApi';


/**
* JS API client generated by OpenAPI Generator.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var pricealertingapifordigitalportals = require('index'); // See note below*.
* var xxxSvc = new pricealertingapifordigitalportals.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new pricealertingapifordigitalportals.Yyy(); // Construct a model instance.
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
* var xxxSvc = new pricealertingapifordigitalportals.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new pricealertingapifordigitalportals.Yyy(); // Construct a model instance.
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
     * The AlertingPricesBasicTriggerListData model constructor.
     * @property {module:model/AlertingPricesBasicTriggerListData}
     */
    AlertingPricesBasicTriggerListData,

    /**
     * The AlertingPricesBasicTriggerListDataFilter model constructor.
     * @property {module:model/AlertingPricesBasicTriggerListDataFilter}
     */
    AlertingPricesBasicTriggerListDataFilter,

    /**
     * The AlertingPricesBasicTriggerListDataFilterStatus model constructor.
     * @property {module:model/AlertingPricesBasicTriggerListDataFilterStatus}
     */
    AlertingPricesBasicTriggerListDataFilterStatus,

    /**
     * The AlertingPricesBasicTriggerListMeta model constructor.
     * @property {module:model/AlertingPricesBasicTriggerListMeta}
     */
    AlertingPricesBasicTriggerListMeta,

    /**
     * The AlertingPricesBasicTriggerListMetaPagination model constructor.
     * @property {module:model/AlertingPricesBasicTriggerListMetaPagination}
     */
    AlertingPricesBasicTriggerListMetaPagination,

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
     * The InlineResponse2001Data model constructor.
     * @property {module:model/InlineResponse2001Data}
     */
    InlineResponse2001Data,

    /**
     * The InlineResponse2001Meta model constructor.
     * @property {module:model/InlineResponse2001Meta}
     */
    InlineResponse2001Meta,

    /**
     * The InlineResponse2001Trigger model constructor.
     * @property {module:model/InlineResponse2001Trigger}
     */
    InlineResponse2001Trigger,

    /**
     * The InlineResponse2001TriggerPrice model constructor.
     * @property {module:model/InlineResponse2001TriggerPrice}
     */
    InlineResponse2001TriggerPrice,

    /**
     * The InlineResponse2001TriggerStatus model constructor.
     * @property {module:model/InlineResponse2001TriggerStatus}
     */
    InlineResponse2001TriggerStatus,

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
     * The InlineResponse2003Range model constructor.
     * @property {module:model/InlineResponse2003Range}
     */
    InlineResponse2003Range,

    /**
     * The InlineResponse200Data model constructor.
     * @property {module:model/InlineResponse200Data}
     */
    InlineResponse200Data,

    /**
     * The InlineResponse200DataPrice model constructor.
     * @property {module:model/InlineResponse200DataPrice}
     */
    InlineResponse200DataPrice,

    /**
     * The InlineResponse200DataTrigger model constructor.
     * @property {module:model/InlineResponse200DataTrigger}
     */
    InlineResponse200DataTrigger,

    /**
     * The InlineResponse200DataTriggerNotation model constructor.
     * @property {module:model/InlineResponse200DataTriggerNotation}
     */
    InlineResponse200DataTriggerNotation,

    /**
     * The InlineResponse200DataTriggerPrice model constructor.
     * @property {module:model/InlineResponse200DataTriggerPrice}
     */
    InlineResponse200DataTriggerPrice,

    /**
     * The InlineResponse200DataTriggerRange model constructor.
     * @property {module:model/InlineResponse200DataTriggerRange}
     */
    InlineResponse200DataTriggerRange,

    /**
     * The InlineResponse200DataTriggerStatus model constructor.
     * @property {module:model/InlineResponse200DataTriggerStatus}
     */
    InlineResponse200DataTriggerStatus,

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
     * The StatusObject model constructor.
     * @property {module:model/StatusObject}
     */
    StatusObject,

    /**
    * The AlertingApi service constructor.
    * @property {module:api/AlertingApi}
    */
    AlertingApi
};
