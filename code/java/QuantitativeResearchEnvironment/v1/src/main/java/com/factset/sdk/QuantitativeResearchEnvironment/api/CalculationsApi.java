package com.factset.sdk.QuantitativeResearchEnvironment.api;

import com.factset.sdk.QuantitativeResearchEnvironment.ApiException;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiClient;
import com.factset.sdk.QuantitativeResearchEnvironment.ApiResponse;
import com.factset.sdk.QuantitativeResearchEnvironment.Configuration;
import com.factset.sdk.QuantitativeResearchEnvironment.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.QuantitativeResearchEnvironment.models.Calculation;
import com.factset.sdk.QuantitativeResearchEnvironment.models.CalculationStatus;
import java.io.File;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CalculationsApi {
  private ApiClient apiClient;

  public CalculationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CalculationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

    private static final Map<Integer, GenericType> analyticsQuantQreV1CalculationsIdGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    analyticsQuantQreV1CalculationsIdGetResponseTypeMap.put(200, new GenericType<CalculationStatus>(){});
    analyticsQuantQreV1CalculationsIdGetResponseTypeMap.put(202, new GenericType<CalculationStatus>(){});
  }
  private static final Map<Integer, GenericType> analyticsQuantQreV1CalculationsIdLogGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    analyticsQuantQreV1CalculationsIdLogGetResponseTypeMap.put(200, new GenericType<File>(){});
  }
  private static final Map<Integer, GenericType> analyticsQuantQreV1CalculationsIdOutputGetResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    analyticsQuantQreV1CalculationsIdOutputGetResponseTypeMap.put(200, new GenericType<File>(){});
  }
  private static final Map<Integer, GenericType> analyticsQuantQreV1CalculationsPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    analyticsQuantQreV1CalculationsPostResponseTypeMap.put(202, new GenericType<CalculationStatus>(){});
  }

   


  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get calculation status by id
   * This is the endpoint to check on the progress of a previous calculation request.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return CalculationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public CalculationStatus analyticsQuantQreV1CalculationsIdGet(String id) throws ApiException {
    return analyticsQuantQreV1CalculationsIdGetWithHttpInfo(id).getData();
  }

  /**
   * Get calculation status by id
   * This is the endpoint to check on the progress of a previous calculation request.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return ApiResponse&lt;CalculationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<CalculationStatus> analyticsQuantQreV1CalculationsIdGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsQuantQreV1CalculationsIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/qre/v1/calculations/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CalculationStatus
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.analyticsQuantQreV1CalculationsIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, analyticsQuantQreV1CalculationsIdGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get calculation log for a specific calculation
   * This endpoint returns the log from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Log from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no log is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public File analyticsQuantQreV1CalculationsIdLogGet(String id) throws ApiException {
    return analyticsQuantQreV1CalculationsIdLogGetWithHttpInfo(id).getData();
  }

  /**
   * Get calculation log for a specific calculation
   * This endpoint returns the log from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Log from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no log is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<File> analyticsQuantQreV1CalculationsIdLogGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsQuantQreV1CalculationsIdLogGet");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/qre/v1/calculations/{id}/log"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.analyticsQuantQreV1CalculationsIdLogGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, analyticsQuantQreV1CalculationsIdLogGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get calculation output for a specific calculation
   * This endpoint returns the specified output from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Output from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no output is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public File analyticsQuantQreV1CalculationsIdOutputGet(String id) throws ApiException {
    return analyticsQuantQreV1CalculationsIdOutputGetWithHttpInfo(id).getData();
  }

  /**
   * Get calculation output for a specific calculation
   * This endpoint returns the specified output from the calculation.
   * @param id From url, provided by location header or response body in the calculation start endpoint (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected response. Signals that the calculation is finished. Output from the calculation is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  </td></tr>
       <tr><td> 202 </td><td> Expected response. Signals that the calculation is still in progress and no output is returned. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<File> analyticsQuantQreV1CalculationsIdOutputGetWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsQuantQreV1CalculationsIdOutputGet");
    }
    
    // create path and map variables
    String localVarPath = "/analytics/quant/qre/v1/calculations/{id}/output"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        File
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.analyticsQuantQreV1CalculationsIdOutputGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, analyticsQuantQreV1CalculationsIdOutputGetResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Starts a new script calculation
   * This endpoint takes a python script and starts executing it within QRE
   * @param calculation  (optional)
   * @return CalculationStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Expected response, contains the relative URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body provided </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public CalculationStatus analyticsQuantQreV1CalculationsPost(Calculation calculation) throws ApiException {
    return analyticsQuantQreV1CalculationsPostWithHttpInfo(calculation).getData();
  }

  /**
   * Starts a new script calculation
   * This endpoint takes a python script and starts executing it within QRE
   * @param calculation  (optional)
   * @return ApiResponse&lt;CalculationStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Expected response, contains the relative URL in the Location header to check the status of the calculation. </td><td>  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 400 </td><td> Invalid request body provided </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 500 </td><td> Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
       <tr><td> 503 </td><td> Request timeout. Retry the request later </td><td>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  </td></tr>
     </table>
   */
  public ApiResponse<CalculationStatus> analyticsQuantQreV1CalculationsPostWithHttpInfo(Calculation calculation) throws ApiException {
    Object localVarPostBody = calculation;
    
    // create path and map variables
    String localVarPath = "/analytics/quant/qre/v1/calculations";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        CalculationStatus
      
    > apiResponse = apiClient.invokeAPI("CalculationsApi.analyticsQuantQreV1CalculationsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, analyticsQuantQreV1CalculationsPostResponseTypeMap, false);

    return apiResponse;

  }
}
