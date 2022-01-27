/**
 * Classifications API
 * The Classifications API gives access to various Industry Classifications for a given list of securities. Beginning first with GICS Direct, the service will then expand to offering NAICS, SIC, RBICS, and more.  
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
import Calendar from './model/Calendar';
import ErrorResponse from './model/ErrorResponse';
import ErrorResponseSubErrors from './model/ErrorResponseSubErrors';
import Frequency from './model/Frequency';
import Gics from './model/Gics';
import GicsRequest from './model/GicsRequest';
import GicsResponse from './model/GicsResponse';
import GICSApi from './api/GICSApi';


/**
* The_Classifications_API_gives_access_to_various_Industry_Classifications_for_a_given_list_of_securities__Beginning_first_with_GICS_Direct_the_service_will_then_expand_to_offering_NAICS_SIC_RBICS_and_more__.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var classifications = require('index'); // See note below*.
* var xxxSvc = new classifications.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new classifications.Yyy(); // Construct a model instance.
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
* var xxxSvc = new classifications.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new classifications.Yyy(); // Construct a model instance.
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
     * The Calendar model constructor.
     * @property {module:model/Calendar}
     */
    Calendar,

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
     * The Frequency model constructor.
     * @property {module:model/Frequency}
     */
    Frequency,

    /**
     * The Gics model constructor.
     * @property {module:model/Gics}
     */
    Gics,

    /**
     * The GicsRequest model constructor.
     * @property {module:model/GicsRequest}
     */
    GicsRequest,

    /**
     * The GicsResponse model constructor.
     * @property {module:model/GicsResponse}
     */
    GicsResponse,

    /**
    * The GICSApi service constructor.
    * @property {module:api/GICSApi}
    */
    GICSApi
};
