/*
 * FactSet Options API
 *
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetOptions.Client;
using FactSet.SDK.FactSetOptions.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetOptions.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IReferenceApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Returns option security dates such as expiration and trade.
        /// </summary>
        /// <remarks>
        /// Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <returns>OptionsDatesResponse</returns>
        OptionsDatesResponse GetOptionsDatesForList(OptionsDatesRequest optionsDatesRequest);

        /// <summary>
        /// Returns option security dates such as expiration and trade.
        /// </summary>
        /// <remarks>
        /// Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <returns>ApiResponse of OptionsDatesResponse</returns>
        ApiResponse<OptionsDatesResponse> GetOptionsDatesForListWithHttpInfo(OptionsDatesRequest optionsDatesRequest);
        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more
        /// </summary>
        /// <remarks>
        /// Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <returns>OptionsReferencesResponse</returns>
        OptionsReferencesResponse GetOptionsReferencesForList(OptionsReferencesRequest optionsReferencesRequest);

        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more
        /// </summary>
        /// <remarks>
        /// Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <returns>ApiResponse of OptionsReferencesResponse</returns>
        ApiResponse<OptionsReferencesResponse> GetOptionsReferencesForListWithHttpInfo(OptionsReferencesRequest optionsReferencesRequest);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IReferenceApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Returns option security dates such as expiration and trade.
        /// </summary>
        /// <remarks>
        /// Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of OptionsDatesResponse</returns>
        System.Threading.Tasks.Task<OptionsDatesResponse> GetOptionsDatesForListAsync(OptionsDatesRequest optionsDatesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns option security dates such as expiration and trade.
        /// </summary>
        /// <remarks>
        /// Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (OptionsDatesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<OptionsDatesResponse>> GetOptionsDatesForListWithHttpInfoAsync(OptionsDatesRequest optionsDatesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more
        /// </summary>
        /// <remarks>
        /// Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of OptionsReferencesResponse</returns>
        System.Threading.Tasks.Task<OptionsReferencesResponse> GetOptionsReferencesForListAsync(OptionsReferencesRequest optionsReferencesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more
        /// </summary>
        /// <remarks>
        /// Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (OptionsReferencesResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<OptionsReferencesResponse>> GetOptionsReferencesForListWithHttpInfoAsync(OptionsReferencesRequest optionsReferencesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IReferenceApi : IReferenceApiSync, IReferenceApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ReferenceApi : IReferenceApi
    {
        private FactSet.SDK.FactSetOptions.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetOptionsDatesForListResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(OptionsDatesResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };
        private static readonly Dictionary<HttpStatusCode, System.Type> GetOptionsReferencesForListResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(OptionsReferencesResponse) },
            { (HttpStatusCode)400, typeof(ErrorResponse) },
            { (HttpStatusCode)401, typeof(ErrorResponse) },
            { (HttpStatusCode)403, typeof(ErrorResponse) },
            { (HttpStatusCode)415, typeof(ErrorResponse) },
            { (HttpStatusCode)500, typeof(ErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="ReferenceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ReferenceApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ReferenceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ReferenceApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetOptions.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetOptions.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetOptions.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetOptions.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetOptions.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetOptions.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ReferenceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ReferenceApi(FactSet.SDK.FactSetOptions.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetOptions.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetOptions.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetOptions.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetOptions.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetOptions.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ReferenceApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ReferenceApi(FactSet.SDK.FactSetOptions.Client.ISynchronousClient client, FactSet.SDK.FactSetOptions.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetOptions.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetOptions.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetOptions.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetOptions.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public FactSet.SDK.FactSetOptions.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetOptions.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Returns option security dates such as expiration and trade. Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <returns>OptionsDatesResponse</returns>
        public OptionsDatesResponse GetOptionsDatesForList(OptionsDatesRequest optionsDatesRequest)
        {
            var localVarResponse = GetOptionsDatesForListWithHttpInfo(optionsDatesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns option security dates such as expiration and trade. Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <returns>ApiResponse of OptionsDatesResponse</returns>
        public ApiResponse<OptionsDatesResponse> GetOptionsDatesForListWithHttpInfo(OptionsDatesRequest optionsDatesRequest)
        {
            // verify the required parameter 'optionsDatesRequest' is set
            if (optionsDatesRequest == null)
            {
                throw new FactSet.SDK.FactSetOptions.Client.ApiException(400, "Missing required parameter 'optionsDatesRequest' when calling ReferenceApi->GetOptionsDatesForList");
            }

            FactSet.SDK.FactSetOptions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetOptions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = optionsDatesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetOptions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            localVarRequestOptions.ResponseTypeDictionary = GetOptionsDatesForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            OptionsDatesResponse>("/factset-options/v1/dates", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetOptionsDatesForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns option security dates such as expiration and trade. Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of OptionsDatesResponse</returns>
        public async System.Threading.Tasks.Task<OptionsDatesResponse>GetOptionsDatesForListAsync(OptionsDatesRequest optionsDatesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetOptionsDatesForListWithHttpInfoAsync(optionsDatesRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns option security dates such as expiration and trade. Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsDatesRequest"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (OptionsDatesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<OptionsDatesResponse>> GetOptionsDatesForListWithHttpInfoAsync(OptionsDatesRequest optionsDatesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'optionsDatesRequest' is set
            if (optionsDatesRequest == null)
            {
                throw new FactSet.SDK.FactSetOptions.Client.ApiException(400, "Missing required parameter 'optionsDatesRequest' when calling ReferenceApi->GetOptionsDatesForList");
            }


            FactSet.SDK.FactSetOptions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetOptions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = optionsDatesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetOptions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            localVarRequestOptions.ResponseTypeDictionary = GetOptionsDatesForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<OptionsDatesResponse>("/factset-options/v1/dates", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetOptionsDatesForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <returns>OptionsReferencesResponse</returns>
        public OptionsReferencesResponse GetOptionsReferencesForList(OptionsReferencesRequest optionsReferencesRequest)
        {
            var localVarResponse = GetOptionsReferencesForListWithHttpInfo(optionsReferencesRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <returns>ApiResponse of OptionsReferencesResponse</returns>
        public ApiResponse<OptionsReferencesResponse> GetOptionsReferencesForListWithHttpInfo(OptionsReferencesRequest optionsReferencesRequest)
        {
            // verify the required parameter 'optionsReferencesRequest' is set
            if (optionsReferencesRequest == null)
            {
                throw new FactSet.SDK.FactSetOptions.Client.ApiException(400, "Missing required parameter 'optionsReferencesRequest' when calling ReferenceApi->GetOptionsReferencesForList");
            }

            FactSet.SDK.FactSetOptions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetOptions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = optionsReferencesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetOptions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            localVarRequestOptions.ResponseTypeDictionary = GetOptionsReferencesForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            OptionsReferencesResponse>("/factset-options/v1/references", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetOptionsReferencesForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of OptionsReferencesResponse</returns>
        public async System.Threading.Tasks.Task<OptionsReferencesResponse>GetOptionsReferencesForListAsync(OptionsReferencesRequest optionsReferencesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetOptionsReferencesForListWithHttpInfoAsync(optionsReferencesRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns basic reference details for the options such as currency, exchange, symbols, flags and more Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supproted with exchange ISO \&quot;USA\&quot;* 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetOptions.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="optionsReferencesRequest">Options Reference Request Body</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (OptionsReferencesResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<OptionsReferencesResponse>> GetOptionsReferencesForListWithHttpInfoAsync(OptionsReferencesRequest optionsReferencesRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'optionsReferencesRequest' is set
            if (optionsReferencesRequest == null)
            {
                throw new FactSet.SDK.FactSetOptions.Client.ApiException(400, "Missing required parameter 'optionsReferencesRequest' when calling ReferenceApi->GetOptionsReferencesForList");
            }


            FactSet.SDK.FactSetOptions.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetOptions.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetOptions.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = optionsReferencesRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetOptions.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            localVarRequestOptions.ResponseTypeDictionary = GetOptionsReferencesForListResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<OptionsReferencesResponse>("/factset-options/v1/references", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetOptionsReferencesForList", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
