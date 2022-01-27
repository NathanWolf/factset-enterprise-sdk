/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import FICalculationParameters from './model/FICalculationParameters';
import FIJobSettings from './model/FIJobSettings';
import FISecurity from './model/FISecurity';
import FICalculationsApi from './api/FICalculationsApi';


/**
* Allow_clients_to_fetch_Analytics_through_APIs_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var fixedincomecalculation = require('index'); // See note below*.
* var xxxSvc = new fixedincomecalculation.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new fixedincomecalculation.Yyy(); // Construct a model instance.
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
* var xxxSvc = new fixedincomecalculation.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new fixedincomecalculation.Yyy(); // Construct a model instance.
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
     * The FICalculationParameters model constructor.
     * @property {module:model/FICalculationParameters}
     */
    FICalculationParameters,

    /**
     * The FIJobSettings model constructor.
     * @property {module:model/FIJobSettings}
     */
    FIJobSettings,

    /**
     * The FISecurity model constructor.
     * @property {module:model/FISecurity}
     */
    FISecurity,

    /**
    * The FICalculationsApi service constructor.
    * @property {module:api/FICalculationsApi}
    */
    FICalculationsApi
};
