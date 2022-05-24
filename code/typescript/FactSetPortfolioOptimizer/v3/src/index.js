/**
 * FPO API
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
import CalculationInfo from './model/CalculationInfo';
import CalculationInfoRoot from './model/CalculationInfoRoot';
import ClientErrorResponse from './model/ClientErrorResponse';
import Currency from './model/Currency';
import CurrencyRoot from './model/CurrencyRoot';
import DocumentDirectories from './model/DocumentDirectories';
import DocumentDirectoriesRoot from './model/DocumentDirectoriesRoot';
import Error from './model/Error';
import ErrorSource from './model/ErrorSource';
import FPOAccount from './model/FPOAccount';
import FPOOptimizationParameters from './model/FPOOptimizationParameters';
import FPOOptimizationParametersRoot from './model/FPOOptimizationParametersRoot';
import ObjectRoot from './model/ObjectRoot';
import OptimalPortfolio from './model/OptimalPortfolio';
import Optimization from './model/Optimization';
import OptimizerAccountOverrides from './model/OptimizerAccountOverrides';
import OptimizerOptimalHoldings from './model/OptimizerOptimalHoldings';
import OptimizerOutputTypes from './model/OptimizerOutputTypes';
import OptimizerStrategy from './model/OptimizerStrategy';
import OptimizerStrategyOverrides from './model/OptimizerStrategyOverrides';
import OptimizerTradesList from './model/OptimizerTradesList';
import PaDoc from './model/PaDoc';

import AccountsApi from './api/AccountsApi';
import CurrenciesApi from './api/CurrenciesApi';
import FPOOptimizerApi from './api/FPOOptimizerApi';
import PostAndOptimizeResponseWrapper from './api/FPOOptimizerApi';
import PutAndOptimizeResponseWrapper from './api/FPOOptimizerApi';
import StrategyDocumentsApi from './api/StrategyDocumentsApi';


/**
* FactSet Portfolio Optimizer client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetportfoliooptimizer = require('index'); // See note below*.
* var xxxSvc = new factsetportfoliooptimizer.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetportfoliooptimizer.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetportfoliooptimizer.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetportfoliooptimizer.Yyy(); // Construct a model instance.
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
     * The CalculationInfo model constructor.
     * @property {module:model/CalculationInfo}
     */
    CalculationInfo,

    /**
     * The CalculationInfoRoot model constructor.
     * @property {module:model/CalculationInfoRoot}
     */
    CalculationInfoRoot,

    /**
     * The ClientErrorResponse model constructor.
     * @property {module:model/ClientErrorResponse}
     */
    ClientErrorResponse,

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
     * The FPOAccount model constructor.
     * @property {module:model/FPOAccount}
     */
    FPOAccount,

    /**
     * The FPOOptimizationParameters model constructor.
     * @property {module:model/FPOOptimizationParameters}
     */
    FPOOptimizationParameters,

    /**
     * The FPOOptimizationParametersRoot model constructor.
     * @property {module:model/FPOOptimizationParametersRoot}
     */
    FPOOptimizationParametersRoot,

    /**
     * The ObjectRoot model constructor.
     * @property {module:model/ObjectRoot}
     */
    ObjectRoot,

    /**
     * The OptimalPortfolio model constructor.
     * @property {module:model/OptimalPortfolio}
     */
    OptimalPortfolio,

    /**
     * The Optimization model constructor.
     * @property {module:model/Optimization}
     */
    Optimization,

    /**
     * The OptimizerAccountOverrides model constructor.
     * @property {module:model/OptimizerAccountOverrides}
     */
    OptimizerAccountOverrides,

    /**
     * The OptimizerOptimalHoldings model constructor.
     * @property {module:model/OptimizerOptimalHoldings}
     */
    OptimizerOptimalHoldings,

    /**
     * The OptimizerOutputTypes model constructor.
     * @property {module:model/OptimizerOutputTypes}
     */
    OptimizerOutputTypes,

    /**
     * The OptimizerStrategy model constructor.
     * @property {module:model/OptimizerStrategy}
     */
    OptimizerStrategy,

    /**
     * The OptimizerStrategyOverrides model constructor.
     * @property {module:model/OptimizerStrategyOverrides}
     */
    OptimizerStrategyOverrides,

    /**
     * The OptimizerTradesList model constructor.
     * @property {module:model/OptimizerTradesList}
     */
    OptimizerTradesList,

    /**
     * The PaDoc model constructor.
     * @property {module:model/PaDoc}
     */
    PaDoc,

    /**
    * The AccountsApi service constructor.
    * @property {module:api/AccountsApi}
    */
    AccountsApi,

    /**
    * The CurrenciesApi service constructor.
    * @property {module:api/CurrenciesApi}
    */
    CurrenciesApi,

    /**
    * The FPOOptimizerApi service constructor.
    * @property {module:api/FPOOptimizerApi}
    */
    FPOOptimizerApi,

    /**
    * The PostAndOptimize response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    PostAndOptimizeResponseWrapper,

    /**
    * The PutAndOptimize response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    PutAndOptimizeResponseWrapper,

    /**
    * The StrategyDocumentsApi service constructor.
    * @property {module:api/StrategyDocumentsApi}
    */
    StrategyDocumentsApi,

};
