/**
 * PA Engine API
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


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import LinkedPATemplateParametersRoot from '../model/LinkedPATemplateParametersRoot';
import LinkedPATemplatePostSummaryRoot from '../model/LinkedPATemplatePostSummaryRoot';
import LinkedPATemplateRoot from '../model/LinkedPATemplateRoot';
import LinkedPATemplateSummaryRoot from '../model/LinkedPATemplateSummaryRoot';
import LinkedPATemplateUpdateParametersRoot from '../model/LinkedPATemplateUpdateParametersRoot';

/**
* LinkedPATemplates service.
* @module api/LinkedPATemplatesApi
* @version 0.9.0
*/
export default class LinkedPATemplatesApi {

    /**
    * Constructs a new LinkedPATemplatesApi. 
    * @alias module:api/LinkedPATemplatesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create a linked PA template
     * This endpoint creates a template from an **existing portfolio analysis tile**, allowing the user to replicate and fetch reports settings.    Remarks:    *   Mandatory fields are required to be passed in POST requests and Optional fields are not necessary.       If no mandatory fields are passed, then we can use the template as a component and skip the component creation.        *   Mandatory, optional and locked fields can be  \"accounts\", \"benchmarks\", \"groups\", \"columns\", \"dates\", \"currencyisocode\" and \"componentdetail\".    *   We cannot override the Locked fields when creating the Component.    *   Mandatory and locked strings are mutually exclusive.    *   Multi-horizon frequencies are not supported through this endpoint.
     * @param {module:model/LinkedPATemplateParametersRoot} linkedPATemplateParametersRoot Request Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LinkedPATemplatePostSummaryRoot} and HTTP response
     */
    createLinkedPATemplatesWithHttpInfo(linkedPATemplateParametersRoot) {
      let postBody = linkedPATemplateParametersRoot;
      // verify the required parameter 'linkedPATemplateParametersRoot' is set
      if (linkedPATemplateParametersRoot === undefined || linkedPATemplateParametersRoot === null) {
        throw new Error("Missing the required parameter 'linkedPATemplateParametersRoot' when calling createLinkedPATemplates");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = LinkedPATemplatePostSummaryRoot;
      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/linked-templates', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a linked PA template
     * This endpoint creates a template from an **existing portfolio analysis tile**, allowing the user to replicate and fetch reports settings.    Remarks:    *   Mandatory fields are required to be passed in POST requests and Optional fields are not necessary.       If no mandatory fields are passed, then we can use the template as a component and skip the component creation.        *   Mandatory, optional and locked fields can be  \"accounts\", \"benchmarks\", \"groups\", \"columns\", \"dates\", \"currencyisocode\" and \"componentdetail\".    *   We cannot override the Locked fields when creating the Component.    *   Mandatory and locked strings are mutually exclusive.    *   Multi-horizon frequencies are not supported through this endpoint.
     * @param {module:model/LinkedPATemplateParametersRoot} linkedPATemplateParametersRoot Request Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LinkedPATemplatePostSummaryRoot}
     */
    createLinkedPATemplates(linkedPATemplateParametersRoot) {
      return this.createLinkedPATemplatesWithHttpInfo(linkedPATemplateParametersRoot)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete a linked PA template.
     * This endpoint deletes an existing linked PA template.
     * @param {String} id Unique identifier for a linked PA template
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteLinkedPATemplatesWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteLinkedPATemplates");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = null;
      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/linked-templates/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete a linked PA template.
     * This endpoint deletes an existing linked PA template.
     * @param {String} id Unique identifier for a linked PA template
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    deleteLinkedPATemplates(id) {
      return this.deleteLinkedPATemplatesWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get linked PA templates
     * This endpoint returns the list of linked PA templates in given path.
     * @param {Object} opts Optional parameters
     * @param {String} opts.directory Get linked PA templates in path. (default to 'Personal:LinkedPATemplates/')
     * @param {String} opts.documentDirectory Get linked PA templates for documents in document path
     * @param {String} opts.documentName Get linked PA templates for documents by document name
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LinkedPATemplateSummaryRoot} and HTTP response
     */
    getLinkedPATemplatesWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'directory': opts['directory'],
        'documentDirectory': opts['documentDirectory'],
        'documentName': opts['documentName']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = LinkedPATemplateSummaryRoot;
      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/linked-templates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get linked PA templates
     * This endpoint returns the list of linked PA templates in given path.
     * @param {Object} opts Optional parameters
     * @param {String} opts.directory Get linked PA templates in path. (default to 'Personal:LinkedPATemplates/')
     * @param {String} opts.documentDirectory Get linked PA templates for documents in document path
     * @param {String} opts.documentName Get linked PA templates for documents by document name
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LinkedPATemplateSummaryRoot}
     */
    getLinkedPATemplates(opts) {
      return this.getLinkedPATemplatesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get linked PA template by id
     * This endpoint fetches the linked PA template settings.
     * @param {String} id Unique identifier for a linked PA template
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LinkedPATemplateRoot} and HTTP response
     */
    getLinkedPATemplatesByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getLinkedPATemplatesById");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = LinkedPATemplateRoot;
      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/linked-templates/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get linked PA template by id
     * This endpoint fetches the linked PA template settings.
     * @param {String} id Unique identifier for a linked PA template
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LinkedPATemplateRoot}
     */
    getLinkedPATemplatesById(id) {
      return this.getLinkedPATemplatesByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Update a linked PA template
     * This endpoint allows the user to change the request body and description from an existing template.    Remarks:    *   Mandatory fields are required to be passed in POST requests and Optional fields are not necessary.       If no mandatory fields are passed, then we can use the template as a component and skip the component creation.        *   Mandatory, optional and locked fields can be  \"accounts\", \"benchmarks\", \"groups\", \"columns\", \"dates\", \"currencyisocode\" and \"componentdetail\".    *   We cannot override the Locked fields when creating the Component.    *   Mandatory and locked strings are mutually exclusive.    *   Multi-horizon frequencies are not supported through this endpoint.
     * @param {String} id Unique identifier for a linked PA template
     * @param {module:model/LinkedPATemplateUpdateParametersRoot} linkedPATemplateUpdateParametersRoot Request Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/LinkedPATemplatePostSummaryRoot} and HTTP response
     */
    updateLinkedPATemplatesWithHttpInfo(id, linkedPATemplateUpdateParametersRoot) {
      let postBody = linkedPATemplateUpdateParametersRoot;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling updateLinkedPATemplates");
      }
      // verify the required parameter 'linkedPATemplateUpdateParametersRoot' is set
      if (linkedPATemplateUpdateParametersRoot === undefined || linkedPATemplateUpdateParametersRoot === null) {
        throw new Error("Missing the required parameter 'linkedPATemplateUpdateParametersRoot' when calling updateLinkedPATemplates");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = LinkedPATemplatePostSummaryRoot;
      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/linked-templates/{id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Update a linked PA template
     * This endpoint allows the user to change the request body and description from an existing template.    Remarks:    *   Mandatory fields are required to be passed in POST requests and Optional fields are not necessary.       If no mandatory fields are passed, then we can use the template as a component and skip the component creation.        *   Mandatory, optional and locked fields can be  \"accounts\", \"benchmarks\", \"groups\", \"columns\", \"dates\", \"currencyisocode\" and \"componentdetail\".    *   We cannot override the Locked fields when creating the Component.    *   Mandatory and locked strings are mutually exclusive.    *   Multi-horizon frequencies are not supported through this endpoint.
     * @param {String} id Unique identifier for a linked PA template
     * @param {module:model/LinkedPATemplateUpdateParametersRoot} linkedPATemplateUpdateParametersRoot Request Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/LinkedPATemplatePostSummaryRoot}
     */
    updateLinkedPATemplates(id, linkedPATemplateUpdateParametersRoot) {
      return this.updateLinkedPATemplatesWithHttpInfo(id, linkedPATemplateUpdateParametersRoot)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}
