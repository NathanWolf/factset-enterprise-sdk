/**
 * SPAR Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AccountDirectories from './model/AccountDirectories';
import AccountDirectoriesRoot from './model/AccountDirectoriesRoot';
import CalculationMeta from './model/CalculationMeta';
import CalculationStatus from './model/CalculationStatus';
import CalculationStatusMeta from './model/CalculationStatusMeta';
import CalculationStatusRoot from './model/CalculationStatusRoot';
import CalculationUnitStatus from './model/CalculationUnitStatus';
import CalculationUnitStatusMeta from './model/CalculationUnitStatusMeta';
import ClientErrorResponse from './model/ClientErrorResponse';
import ComponentSummary from './model/ComponentSummary';
import ComponentSummaryRoot from './model/ComponentSummaryRoot';
import Currency from './model/Currency';
import CurrencyRoot from './model/CurrencyRoot';
import DocumentDirectories from './model/DocumentDirectories';
import DocumentDirectoriesRoot from './model/DocumentDirectoriesRoot';
import Error from './model/Error';
import ErrorSource from './model/ErrorSource';
import Frequency from './model/Frequency';
import FrequencyRoot from './model/FrequencyRoot';
import ObjectRoot from './model/ObjectRoot';
import ReturnType from './model/ReturnType';
import SPARAccounts from './model/SPARAccounts';
import SPARAccountsRoot from './model/SPARAccountsRoot';
import SPARBenchmark from './model/SPARBenchmark';
import SPARBenchmarkRoot from './model/SPARBenchmarkRoot';
import SPARCalculationParameters from './model/SPARCalculationParameters';
import SPARCalculationParametersRoot from './model/SPARCalculationParametersRoot';
import SPARDateParameters from './model/SPARDateParameters';
import SPARIdentifier from './model/SPARIdentifier';

import AccountsApi from './api/AccountsApi';
import BenchmarksApi from './api/BenchmarksApi';
import ComponentsApi from './api/ComponentsApi';
import CurrenciesApi from './api/CurrenciesApi';
import DocumentsApi from './api/DocumentsApi';
import FrequenciesApi from './api/FrequenciesApi';
import SPARCalculationsApi from './api/SPARCalculationsApi';
import PostAndCalculateResponseWrapper from './api/SPARCalculationsApi';
import PutAndCalculateResponseWrapper from './api/SPARCalculationsApi';


/**
* SPAR Engine client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var sparengine = require('index'); // See note below*.
* var xxxSvc = new sparengine.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new sparengine.Yyy(); // Construct a model instance.
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
* var xxxSvc = new sparengine.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new sparengine.Yyy(); // Construct a model instance.
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
     * The AccountDirectories model constructor.
     * @property {module:model/AccountDirectories}
     */
    AccountDirectories,

    /**
     * The AccountDirectoriesRoot model constructor.
     * @property {module:model/AccountDirectoriesRoot}
     */
    AccountDirectoriesRoot,

    /**
     * The CalculationMeta model constructor.
     * @property {module:model/CalculationMeta}
     */
    CalculationMeta,

    /**
     * The CalculationStatus model constructor.
     * @property {module:model/CalculationStatus}
     */
    CalculationStatus,

    /**
     * The CalculationStatusMeta model constructor.
     * @property {module:model/CalculationStatusMeta}
     */
    CalculationStatusMeta,

    /**
     * The CalculationStatusRoot model constructor.
     * @property {module:model/CalculationStatusRoot}
     */
    CalculationStatusRoot,

    /**
     * The CalculationUnitStatus model constructor.
     * @property {module:model/CalculationUnitStatus}
     */
    CalculationUnitStatus,

    /**
     * The CalculationUnitStatusMeta model constructor.
     * @property {module:model/CalculationUnitStatusMeta}
     */
    CalculationUnitStatusMeta,

    /**
     * The ClientErrorResponse model constructor.
     * @property {module:model/ClientErrorResponse}
     */
    ClientErrorResponse,

    /**
     * The ComponentSummary model constructor.
     * @property {module:model/ComponentSummary}
     */
    ComponentSummary,

    /**
     * The ComponentSummaryRoot model constructor.
     * @property {module:model/ComponentSummaryRoot}
     */
    ComponentSummaryRoot,

    /**
     * The Currency model constructor.
     * @property {module:model/Currency}
     */
    Currency,

    /**
     * The CurrencyRoot model constructor.
     * @property {module:model/CurrencyRoot}
     */
    CurrencyRoot,

    /**
     * The DocumentDirectories model constructor.
     * @property {module:model/DocumentDirectories}
     */
    DocumentDirectories,

    /**
     * The DocumentDirectoriesRoot model constructor.
     * @property {module:model/DocumentDirectoriesRoot}
     */
    DocumentDirectoriesRoot,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorSource model constructor.
     * @property {module:model/ErrorSource}
     */
    ErrorSource,

    /**
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

    /**
     * The FrequencyRoot model constructor.
     * @property {module:model/FrequencyRoot}
     */
    FrequencyRoot,

    /**
     * The ObjectRoot model constructor.
     * @property {module:model/ObjectRoot}
     */
    ObjectRoot,

    /**
     * The ReturnType model constructor.
     * @property {module:model/ReturnType}
     */
    ReturnType,

    /**
     * The SPARAccounts model constructor.
     * @property {module:model/SPARAccounts}
     */
    SPARAccounts,

    /**
     * The SPARAccountsRoot model constructor.
     * @property {module:model/SPARAccountsRoot}
     */
    SPARAccountsRoot,

    /**
     * The SPARBenchmark model constructor.
     * @property {module:model/SPARBenchmark}
     */
    SPARBenchmark,

    /**
     * The SPARBenchmarkRoot model constructor.
     * @property {module:model/SPARBenchmarkRoot}
     */
    SPARBenchmarkRoot,

    /**
     * The SPARCalculationParameters model constructor.
     * @property {module:model/SPARCalculationParameters}
     */
    SPARCalculationParameters,

    /**
     * The SPARCalculationParametersRoot model constructor.
     * @property {module:model/SPARCalculationParametersRoot}
     */
    SPARCalculationParametersRoot,

    /**
     * The SPARDateParameters model constructor.
     * @property {module:model/SPARDateParameters}
     */
    SPARDateParameters,

    /**
     * The SPARIdentifier model constructor.
     * @property {module:model/SPARIdentifier}
     */
    SPARIdentifier,

    /**
    * The AccountsApi service constructor.
    * @property {module:api/AccountsApi}
    */
    AccountsApi,

    /**
    * The BenchmarksApi service constructor.
    * @property {module:api/BenchmarksApi}
    */
    BenchmarksApi,

    /**
    * The ComponentsApi service constructor.
    * @property {module:api/ComponentsApi}
    */
    ComponentsApi,

    /**
    * The CurrenciesApi service constructor.
    * @property {module:api/CurrenciesApi}
    */
    CurrenciesApi,

    /**
    * The DocumentsApi service constructor.
    * @property {module:api/DocumentsApi}
    */
    DocumentsApi,

    /**
    * The FrequenciesApi service constructor.
    * @property {module:api/FrequenciesApi}
    */
    FrequenciesApi,

    /**
    * The SPARCalculationsApi service constructor.
    * @property {module:api/SPARCalculationsApi}
    */
    SPARCalculationsApi,

    /**
    * The PostAndCalculate response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    PostAndCalculateResponseWrapper,

    /**
    * The PutAndCalculate response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    PutAndCalculateResponseWrapper,

};
