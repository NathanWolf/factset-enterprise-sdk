package com.factset.sdk.QuotesAPIforDigitalPortals.api;

import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiResponse;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20031;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20032;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20033;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20034;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20035;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20036;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20037;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20038;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20039;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20040;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20041;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CategoryApi {
  private ApiClient apiClient;

  public CategoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CategoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
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
   * List of entitled category datasets.
   * List of entitled category datasets.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20035
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20035 getCategoryDatasetList(java.util.Set<String> attributes, String language) throws ApiException {
    return getCategoryDatasetListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of entitled category datasets.
   * List of entitled category datasets.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20035&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20035> getCategoryDatasetListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/category/dataset/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20035> localVarReturnType = new GenericType<InlineResponse20035>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryDatasetList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Details of a category.
   * Details of a category.
   * @param id Identifier of a category. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20031
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20031 getCategoryGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getCategoryGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details of a category.
   * Details of a category.
   * @param id Identifier of a category. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20031&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20031> getCategoryGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCategoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/category/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20031> localVarReturnType = new GenericType<InlineResponse20031>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of instruments where a specific dataset has assigned a given category.
   * List of instruments where a specific dataset has assigned a given category.
   * @param idCategory Identifier of a category. (required)
   * @param idCategoryDataset Identifier of a category dataset. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20036
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20036 getCategoryInstrumentList(BigDecimal idCategory, BigDecimal idCategoryDataset, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getCategoryInstrumentListWithHttpInfo(idCategory, idCategoryDataset, attributes, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of instruments where a specific dataset has assigned a given category.
   * List of instruments where a specific dataset has assigned a given category.
   * @param idCategory Identifier of a category. (required)
   * @param idCategoryDataset Identifier of a category dataset. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20036&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20036> getCategoryInstrumentListWithHttpInfo(BigDecimal idCategory, BigDecimal idCategoryDataset, java.util.Set<String> attributes, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'idCategory' is set
    if (idCategory == null) {
      throw new ApiException(400, "Missing the required parameter 'idCategory' when calling getCategoryInstrumentList");
    }
    
    // verify the required parameter 'idCategoryDataset' is set
    if (idCategoryDataset == null) {
      throw new ApiException(400, "Missing the required parameter 'idCategoryDataset' when calling getCategoryInstrumentList");
    }
    
    // create path and map variables
    String localVarPath = "/category/instrument/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idCategory", idCategory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idCategoryDataset", idCategoryDataset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20036> localVarReturnType = new GenericType<InlineResponse20036>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryInstrumentList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Details of a category level.
   * Details of a category level.
   * @param id Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20037
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20037 getCategoryLevelGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getCategoryLevelGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details of a category level.
   * Details of a category level.
   * @param id Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20037&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20037> getCategoryLevelGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCategoryLevelGet");
    }
    
    // create path and map variables
    String localVarPath = "/category/level/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20037> localVarReturnType = new GenericType<InlineResponse20037>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryLevelGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of categories.
   * List of categories.
   * @param ids List of categories belonging to the same category system. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20032
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20032 getCategoryList(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, String language) throws ApiException {
    return getCategoryListWithHttpInfo(ids, attributes, language).getData();
  }

  /**
   * List of categories.
   * List of categories.
   * @param ids List of categories belonging to the same category system. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20032&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20032> getCategoryListWithHttpInfo(java.util.Set<BigDecimal> ids, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getCategoryList");
    }
    
    // create path and map variables
    String localVarPath = "/category/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20032> localVarReturnType = new GenericType<InlineResponse20032>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of categories assigned to a category level.
   * List of categories assigned to a category level.
   * @param id Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20033
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20033 getCategoryListByLevel(BigDecimal id, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getCategoryListByLevelWithHttpInfo(id, attributes, language, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of categories assigned to a category level.
   * List of categories assigned to a category level.
   * @param id Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20033&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20033> getCategoryListByLevelWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCategoryListByLevel");
    }
    
    // create path and map variables
    String localVarPath = "/category/listByLevel";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20033> localVarReturnType = new GenericType<InlineResponse20033>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryListByLevel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of categories assigned to a category system.
   * List of categories assigned to a category system.
   * @param id Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return InlineResponse20034
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20034 getCategoryListBySystem(BigDecimal id, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    return getCategoryListBySystemWithHttpInfo(id, attributes, language, paginationOffset, paginationLimit).getData();
  }

  /**
   * List of categories assigned to a category system.
   * List of categories assigned to a category system.
   * @param id Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @param paginationOffset Non-negative number of entries to skip, or 0 (default). (optional, default to 0.0)
   * @param paginationLimit Non-negative maximum number of entries to return. (optional, default to 20.0)
   * @return ApiResponse&lt;InlineResponse20034&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20034> getCategoryListBySystemWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language, BigDecimal paginationOffset, BigDecimal paginationLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCategoryListBySystem");
    }
    
    // create path and map variables
    String localVarPath = "/category/listBySystem";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationOffset", paginationOffset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_paginationLimit", paginationLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20034> localVarReturnType = new GenericType<InlineResponse20034>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryListBySystem", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Path from the first level to the level of a specific category.
   * Path from the first level to the level of a specific category.
   * @param id Identifier of a category. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20038
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20038 getCategoryPathGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getCategoryPathGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Path from the first level to the level of a specific category.
   * Path from the first level to the level of a specific category.
   * @param id Identifier of a category. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20038&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20038> getCategoryPathGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCategoryPathGet");
    }
    
    // create path and map variables
    String localVarPath = "/category/path/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20038> localVarReturnType = new GenericType<InlineResponse20038>() {};

    return apiClient.invokeAPI("CategoryApi.getCategoryPathGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Details of an entitled category system.
   * Details of an entitled category system.
   * @param id Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20039
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20039 getCategorySystemGet(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    return getCategorySystemGetWithHttpInfo(id, attributes, language).getData();
  }

  /**
   * Details of an entitled category system.
   * Details of an entitled category system.
   * @param id Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. (required)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20039&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20039> getCategorySystemGetWithHttpInfo(BigDecimal id, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCategorySystemGet");
    }
    
    // create path and map variables
    String localVarPath = "/category/system/get";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20039> localVarReturnType = new GenericType<InlineResponse20039>() {};

    return apiClient.invokeAPI("CategoryApi.getCategorySystemGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of entitled category systems.
   * List of entitled category systems.
   * @param idType Filter for a specific category system type. See endpoint &#x60;/category/system/type/list&#x60; for valid values. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20040
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20040 getCategorySystemList(BigDecimal idType, java.util.Set<String> attributes, String language) throws ApiException {
    return getCategorySystemListWithHttpInfo(idType, attributes, language).getData();
  }

  /**
   * List of entitled category systems.
   * List of entitled category systems.
   * @param idType Filter for a specific category system type. See endpoint &#x60;/category/system/type/list&#x60; for valid values. (optional)
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20040&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20040> getCategorySystemListWithHttpInfo(BigDecimal idType, java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/category/system/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idType", idType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20040> localVarReturnType = new GenericType<InlineResponse20040>() {};

    return apiClient.invokeAPI("CategoryApi.getCategorySystemList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List of category system types.
   * List of category system types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return InlineResponse20041
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse20041 getCategorySystemTypeList(java.util.Set<String> attributes, String language) throws ApiException {
    return getCategorySystemTypeListWithHttpInfo(attributes, language).getData();
  }

  /**
   * List of category system types.
   * List of category system types.
   * @param attributes Limit the attributes returned in the response to the specified set. (optional)
   * @param language ISO 639-1 code of the language. (optional)
   * @return ApiResponse&lt;InlineResponse20041&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse20041> getCategorySystemTypeListWithHttpInfo(java.util.Set<String> attributes, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/category/system/type/list";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "_attributes", attributes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "_language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<InlineResponse20041> localVarReturnType = new GenericType<InlineResponse20041>() {};

    return apiClient.invokeAPI("CategoryApi.getCategorySystemTypeList", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
