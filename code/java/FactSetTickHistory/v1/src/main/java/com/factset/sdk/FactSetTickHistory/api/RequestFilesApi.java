package com.factset.sdk.FactSetTickHistory.api;

import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiResponse;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.Pair;

import javax.ws.rs.core.GenericType;

import org.threeten.bp.LocalDate;
import com.factset.sdk.FactSetTickHistory.models.RequestFilesResponse;
import com.factset.sdk.FactSetTickHistory.models.RequestFilestatus;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestFilesApi {
  private ApiClient apiClient;

  public RequestFilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RequestFilesApi(ApiClient apiClient) {
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
   * Returns the requestId and status
   * Try it Out - references a Sandbox environment to simulate live reponses.&lt;/p&gt; **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.&lt;/p&gt; PROD has data from 20120101 to current date &amp;&lt;/p&gt; **available IDs is limited to..**&lt;/p&gt; US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA&lt;/p&gt; ASX - CBA-ASX, BHP-ASX&lt;/p&gt; LSE - HSBA-LON, VOD-LON&lt;/p&gt; Tokyo - 7203-TKS, 4307-TKS&lt;/p&gt; Shenzhen OR Shanghai - 300782-SHE, 300792-SHE&lt;/p&gt; Swiss - NESN-SWX, COTN-SWX&lt;/p&gt; Singapore - J36-SES &amp;&lt;/p&gt; Hong Kong - 700-HKG&lt;/p&gt;
   * @param startDate The date for (or from which) the data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** (required)
   * @param endDate The date to which data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** (required)
   * @param ticker any ticker. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request (optional)
   * @param isoCode iso_code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; (optional)
   * @param fields Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\&quot;&gt;Output fileds list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** (optional, default to *)
   * @return RequestFilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successs </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public RequestFilesResponse v1RequestFilesGet(LocalDate startDate, LocalDate endDate, String ticker, String isoCode, String fields) throws ApiException {
    return v1RequestFilesGetWithHttpInfo(startDate, endDate, ticker, isoCode, fields).getData();
  }

  /**
   * Returns the requestId and status
   * Try it Out - references a Sandbox environment to simulate live reponses.&lt;/p&gt; **In Sandbox** data available from 20210101 to 20210131. Current date data is not available.&lt;/p&gt; PROD has data from 20120101 to current date &amp;&lt;/p&gt; **available IDs is limited to..**&lt;/p&gt; US Equity - IBM-USA, F-USA, AAPL-USA, GOOG-USA&lt;/p&gt; ASX - CBA-ASX, BHP-ASX&lt;/p&gt; LSE - HSBA-LON, VOD-LON&lt;/p&gt; Tokyo - 7203-TKS, 4307-TKS&lt;/p&gt; Shenzhen OR Shanghai - 300782-SHE, 300792-SHE&lt;/p&gt; Swiss - NESN-SWX, COTN-SWX&lt;/p&gt; Singapore - J36-SES &amp;&lt;/p&gt; Hong Kong - 700-HKG&lt;/p&gt;
   * @param startDate The date for (or from which) the data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** (required)
   * @param endDate The date to which data is required&lt;/p&gt; **In Sandbox, data available from 1st to 31st Jan&#39;21 only** (required)
   * @param ticker any ticker. &lt;p&gt;**Either ticker(s) + iso_code  (OR) product is allowed**&lt;/p&gt; **NOTE**:Only one identifier can be requested per request (optional)
   * @param isoCode iso_code. &lt;p&gt;ticker(s) + iso_code&lt;/p&gt; &lt;p&gt;**Does not support multiple iso_codes**&lt;/p&gt; (optional)
   * @param fields Fields for which data is requested. Refer &lt;a href&#x3D; \&quot;https://developer.factset.com/api-catalog/tick-history-api#apiDocumentation\&quot;&gt;Output fileds list&lt;/a&gt;. for available fields.&lt;/p&gt; **In trial default&#x3D;all fields** (optional, default to *)
   * @return ApiResponse&lt;RequestFilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successs </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RequestFilesResponse> v1RequestFilesGetWithHttpInfo(LocalDate startDate, LocalDate endDate, String ticker, String isoCode, String fields) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling v1RequestFilesGet");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling v1RequestFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/request-files";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "iso_code", isoCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };

    GenericType<RequestFilesResponse> localVarReturnType = new GenericType<RequestFilesResponse>() {};

    return apiClient.invokeAPI("RequestFilesApi.v1RequestFilesGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
