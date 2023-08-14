/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ClientErrorResponse from '../model/ClientErrorResponse';
import TemplatedPAComponentParametersRoot from '../model/TemplatedPAComponentParametersRoot';
import TemplatedPAComponentPostSummaryRoot from '../model/TemplatedPAComponentPostSummaryRoot';
import TemplatedPAComponentRoot from '../model/TemplatedPAComponentRoot';
import TemplatedPAComponentSummaryRoot from '../model/TemplatedPAComponentSummaryRoot';
import TemplatedPAComponentUpdateParametersRoot from '../model/TemplatedPAComponentUpdateParametersRoot';

/**
* TemplatedPAComponents service.
* @module api/TemplatedPAComponentsApi
*/
export default class TemplatedPAComponentsApi {

    /**
    * Constructs a new TemplatedPAComponentsApi. 
    * @alias module:api/TemplatedPAComponentsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Create templated PA component
     * This endpoint creates new component based off of linked PA template or unlinked PA template.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data). Default holdings mode value is B&H.    *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is 'securities'.      Additionally, while 'groupsall' returns all the group levels in the PA component,      setting componentdetail to 'groups' only returns the expanded or collapsed group levels within the PA component.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding gouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.
     * @param {module:model/TemplatedPAComponentParametersRoot} templatedPAComponentParametersRoot Request Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/TemplatedPAComponentPostSummaryRoot} and HTTP response
     */
    createTemplatedPAComponentsWithHttpInfo(templatedPAComponentParametersRoot) {
      let postBody = templatedPAComponentParametersRoot;
      // verify the required parameter 'templatedPAComponentParametersRoot' is set
      if (templatedPAComponentParametersRoot === undefined || templatedPAComponentParametersRoot === null) {
        throw new Error("Missing the required parameter 'templatedPAComponentParametersRoot' when calling createTemplatedPAComponents");
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
      let accepts = ['text/plain', 'application/json', 'text/json'];


      let returnType = TemplatedPAComponentPostSummaryRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/templated-components', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create templated PA component
     * This endpoint creates new component based off of linked PA template or unlinked PA template.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data). Default holdings mode value is B&H.    *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is 'securities'.      Additionally, while 'groupsall' returns all the group levels in the PA component,      setting componentdetail to 'groups' only returns the expanded or collapsed group levels within the PA component.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding gouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.
     * @param {module:model/TemplatedPAComponentParametersRoot} templatedPAComponentParametersRoot Request Parameters
     * @return { Promise.< module:model/TemplatedPAComponentPostSummaryRoot > } a Promise, with data of type {@link module:model/TemplatedPAComponentPostSummaryRoot }
     */
    createTemplatedPAComponents(templatedPAComponentParametersRoot) {
      return this.createTemplatedPAComponentsWithHttpInfo(templatedPAComponentParametersRoot)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Delete templated PA component
     * This endpoint deletes an existing templated PA component
     * @param {String} id Unique identifier for a templated PA component
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    deleteTemplatedPAComponentsWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteTemplatedPAComponents");
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
        '/analytics/engines/pa/v3/templated-components/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Delete templated PA component
     * This endpoint deletes an existing templated PA component
     * @param {String} id Unique identifier for a templated PA component
     * @return { Promise } a Promise
     */
    deleteTemplatedPAComponents(id) {
      return this.deleteTemplatedPAComponentsWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get templated PA component by id
     * This endpoint fetches the templated PA component settings.
     * @param {String} id Unique identifier for a templated PA component
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/TemplatedPAComponentRoot} and HTTP response
     */
    getTemplatedPAComponentByIdWithHttpInfo(id) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getTemplatedPAComponentById");
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


      let returnType = TemplatedPAComponentRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/templated-components/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get templated PA component by id
     * This endpoint fetches the templated PA component settings.
     * @param {String} id Unique identifier for a templated PA component
     * @return { Promise.< module:model/TemplatedPAComponentRoot > } a Promise, with data of type {@link module:model/TemplatedPAComponentRoot }
     */
    getTemplatedPAComponentById(id) {
      return this.getTemplatedPAComponentByIdWithHttpInfo(id)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get templated PA components in path
     * This endpoint returns the list of templated PA components in path.
     * @param {String} directory Get templated PA components in path
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/TemplatedPAComponentSummaryRoot} and HTTP response
     */
    getTemplatedPAComponentsInPathWithHttpInfo(directory) {
      let postBody = null;
      // verify the required parameter 'directory' is set
      if (directory === undefined || directory === null) {
        throw new Error("Missing the required parameter 'directory' when calling getTemplatedPAComponentsInPath");
      }

      let pathParams = {
      };
      let queryParams = {
        'directory': directory
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = TemplatedPAComponentSummaryRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/templated-components', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get templated PA components in path
     * This endpoint returns the list of templated PA components in path.
     * @param {String} directory Get templated PA components in path
     * @return { Promise.< module:model/TemplatedPAComponentSummaryRoot > } a Promise, with data of type {@link module:model/TemplatedPAComponentSummaryRoot }
     */
    getTemplatedPAComponentsInPath(directory) {
      return this.getTemplatedPAComponentsInPathWithHttpInfo(directory)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Update templated PA component
     * This endpoint allows the user to change the request body from an existing templated PA component.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data). Default holdings mode value is B&H.     *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is 'securities'.      Additionally, while 'groupsall' returns all the group levels in the PA component,      setting componentdetail to 'groups' only returns the expanded or collapsed group levels within the PA component.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding gouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.
     * @param {String} id Unique identifier for a templated PA component
     * @param {module:model/TemplatedPAComponentUpdateParametersRoot} templatedPAComponentUpdateParametersRoot Request Parameters
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/TemplatedPAComponentPostSummaryRoot} and HTTP response
     */
    updateTemplatedPAComponentsWithHttpInfo(id, templatedPAComponentUpdateParametersRoot) {
      let postBody = templatedPAComponentUpdateParametersRoot;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling updateTemplatedPAComponents");
      }
      // verify the required parameter 'templatedPAComponentUpdateParametersRoot' is set
      if (templatedPAComponentUpdateParametersRoot === undefined || templatedPAComponentUpdateParametersRoot === null) {
        throw new Error("Missing the required parameter 'templatedPAComponentUpdateParametersRoot' when calling updateTemplatedPAComponents");
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


      let returnType = TemplatedPAComponentPostSummaryRoot;

      return this.apiClient.callApi(
        '/analytics/engines/pa/v3/templated-components/{id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Update templated PA component
     * This endpoint allows the user to change the request body from an existing templated PA component.    Remarks:    *   Any settings in the POST body will act as a one-time override over the settings saved in the PA template.    *   Account identifiers must have .ACCT or .ACTM extension or BENCH: prefix. Holdings mode can be optionally set for every account.       Possible values for holdings mode are B&H (Buy and Hold), TBR (Transaction based returns), OMS (Order Management System),       VLT (Vaulted returns) or EXT (External Returns Data). Default holdings mode value is B&H.     *   Multi-horizon frequencies are not supported through this endpoint.    *   Componentdetail supports securities, groups, groupsall, and totals levels of granularity. However, if no value is passed, the default value is 'securities'.      Additionally, while 'groupsall' returns all the group levels in the PA component,      setting componentdetail to 'groups' only returns the expanded or collapsed group levels within the PA component.    *   If we are overriding the grouping with a frequency, we will be overriding the grouping saved to the original component and also overriding       the default frequency of the Beginning of Period to whatever we pass in the request body.        *   If we are overriding gouping frequency without overriding the group id it will not be applied to the default groupings saved to the original component.
     * @param {String} id Unique identifier for a templated PA component
     * @param {module:model/TemplatedPAComponentUpdateParametersRoot} templatedPAComponentUpdateParametersRoot Request Parameters
     * @return { Promise.< module:model/TemplatedPAComponentPostSummaryRoot > } a Promise, with data of type {@link module:model/TemplatedPAComponentPostSummaryRoot }
     */
    updateTemplatedPAComponents(id, templatedPAComponentUpdateParametersRoot) {
      return this.updateTemplatedPAComponentsWithHttpInfo(id, templatedPAComponentUpdateParametersRoot)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





