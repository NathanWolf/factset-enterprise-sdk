/**
 * NER API
 * Extract named entities and their FactSet entity IDs from given document text.
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Input from './model/Input';
import Request from './model/Request';
import Response from './model/Response';
import Tag from './model/Tag';
import EntitiesApi from './api/EntitiesApi';


/**
* Extract_named_entities_and_their_FactSet_entity_IDs_from_given_document_text_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetner = require('index'); // See note below*.
* var xxxSvc = new factsetner.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetner.Yyy(); // Construct a model instance.
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
* var xxxSvc = new factsetner.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetner.Yyy(); // Construct a model instance.
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
     * The Input model constructor.
     * @property {module:model/Input}
     */
    Input,

    /**
     * The Request model constructor.
     * @property {module:model/Request}
     */
    Request,

    /**
     * The Response model constructor.
     * @property {module:model/Response}
     */
    Response,

    /**
     * The Tag model constructor.
     * @property {module:model/Tag}
     */
    Tag,

    /**
    * The EntitiesApi service constructor.
    * @property {module:api/EntitiesApi}
    */
    EntitiesApi
};
