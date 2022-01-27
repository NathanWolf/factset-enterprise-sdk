/**
 * SPAR Engine API
 * Allow clients to fetch SPAR Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import AccountDirectories from './model/AccountDirectories';
import Calculation from './model/Calculation';
import CalculationStatus from './model/CalculationStatus';
import CalculationStatusSummary from './model/CalculationStatusSummary';
import CalculationUnitStatus from './model/CalculationUnitStatus';
import ComponentSummary from './model/ComponentSummary';
import DocumentDirectories from './model/DocumentDirectories';
import Frequency from './model/Frequency';
import PACalculationColumn from './model/PACalculationColumn';
import PACalculationGroup from './model/PACalculationGroup';
import PACalculationParameters from './model/PACalculationParameters';
import PADateParameters from './model/PADateParameters';
import PAIdentifier from './model/PAIdentifier';
import PubCalculationParameters from './model/PubCalculationParameters';
import PubDateParameters from './model/PubDateParameters';
import PubIdentifier from './model/PubIdentifier';
import SPARBenchmark from './model/SPARBenchmark';
import SPARCalculationParameters from './model/SPARCalculationParameters';
import SPARDateParameters from './model/SPARDateParameters';
import SPARIdentifier from './model/SPARIdentifier';
import VaultCalculationParameters from './model/VaultCalculationParameters';
import VaultDateParameters from './model/VaultDateParameters';
import VaultIdentifier from './model/VaultIdentifier';
import AccountsApi from './api/AccountsApi';
import CalculationsApi from './api/CalculationsApi';
import ComponentsApi from './api/ComponentsApi';
import DocumentsApi from './api/DocumentsApi';
import FrequenciesApi from './api/FrequenciesApi';
import SPARBenchmarkApi from './api/SPARBenchmarkApi';


/**
* Allow_clients_to_fetch_SPAR_Engine_Analytics_through_APIs_.<br>
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
* @version 0.8.0
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
     * The Calculation model constructor.
     * @property {module:model/Calculation}
     */
    Calculation,

    /**
     * The CalculationStatus model constructor.
     * @property {module:model/CalculationStatus}
     */
    CalculationStatus,

    /**
     * The CalculationStatusSummary model constructor.
     * @property {module:model/CalculationStatusSummary}
     */
    CalculationStatusSummary,

    /**
     * The CalculationUnitStatus model constructor.
     * @property {module:model/CalculationUnitStatus}
     */
    CalculationUnitStatus,

    /**
     * The ComponentSummary model constructor.
     * @property {module:model/ComponentSummary}
     */
    ComponentSummary,

    /**
     * The DocumentDirectories model constructor.
     * @property {module:model/DocumentDirectories}
     */
    DocumentDirectories,

    /**
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

    /**
     * The PACalculationColumn model constructor.
     * @property {module:model/PACalculationColumn}
     */
    PACalculationColumn,

    /**
     * The PACalculationGroup model constructor.
     * @property {module:model/PACalculationGroup}
     */
    PACalculationGroup,

    /**
     * The PACalculationParameters model constructor.
     * @property {module:model/PACalculationParameters}
     */
    PACalculationParameters,

    /**
     * The PADateParameters model constructor.
     * @property {module:model/PADateParameters}
     */
    PADateParameters,

    /**
     * The PAIdentifier model constructor.
     * @property {module:model/PAIdentifier}
     */
    PAIdentifier,

    /**
     * The PubCalculationParameters model constructor.
     * @property {module:model/PubCalculationParameters}
     */
    PubCalculationParameters,

    /**
     * The PubDateParameters model constructor.
     * @property {module:model/PubDateParameters}
     */
    PubDateParameters,

    /**
     * The PubIdentifier model constructor.
     * @property {module:model/PubIdentifier}
     */
    PubIdentifier,

    /**
     * The SPARBenchmark model constructor.
     * @property {module:model/SPARBenchmark}
     */
    SPARBenchmark,

    /**
     * The SPARCalculationParameters model constructor.
     * @property {module:model/SPARCalculationParameters}
     */
    SPARCalculationParameters,

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
     * The VaultCalculationParameters model constructor.
     * @property {module:model/VaultCalculationParameters}
     */
    VaultCalculationParameters,

    /**
     * The VaultDateParameters model constructor.
     * @property {module:model/VaultDateParameters}
     */
    VaultDateParameters,

    /**
     * The VaultIdentifier model constructor.
     * @property {module:model/VaultIdentifier}
     */
    VaultIdentifier,

    /**
    * The AccountsApi service constructor.
    * @property {module:api/AccountsApi}
    */
    AccountsApi,

    /**
    * The CalculationsApi service constructor.
    * @property {module:api/CalculationsApi}
    */
    CalculationsApi,

    /**
    * The ComponentsApi service constructor.
    * @property {module:api/ComponentsApi}
    */
    ComponentsApi,

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
    * The SPARBenchmarkApi service constructor.
    * @property {module:api/SPARBenchmarkApi}
    */
    SPARBenchmarkApi
};
