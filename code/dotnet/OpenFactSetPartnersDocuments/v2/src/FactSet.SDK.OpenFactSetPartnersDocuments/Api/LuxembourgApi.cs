/*
 * Open:FactSet - Partners
 *
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.OpenFactSetPartnersDocuments.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILuxembourgApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg
        /// </summary>
        /// <remarks>
        /// Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <returns>LuxResponse</returns>
        LuxResponse GetLuxembourgGreenbondsDaily(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string));

        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg
        /// </summary>
        /// <remarks>
        /// Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <returns>ApiResponse of LuxResponse</returns>
        ApiResponse<LuxResponse> GetLuxembourgGreenbondsDailyWithHttpInfo(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILuxembourgApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg
        /// </summary>
        /// <remarks>
        /// Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of LuxResponse</returns>
        System.Threading.Tasks.Task<LuxResponse> GetLuxembourgGreenbondsDailyAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg
        /// </summary>
        /// <remarks>
        /// Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </remarks>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (LuxResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<LuxResponse>> GetLuxembourgGreenbondsDailyWithHttpInfoAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ILuxembourgApi : ILuxembourgApiSync, ILuxembourgApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class LuxembourgApi : ILuxembourgApi
    {
        private FactSet.SDK.OpenFactSetPartnersDocuments.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetLuxembourgGreenbondsDailyResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(LuxResponse) },
            { (HttpStatusCode)400, typeof(AuthStatus) },
            { (HttpStatusCode)401, typeof(AuthStatus) },
            { (HttpStatusCode)403, typeof(AuthStatus) },
            { (HttpStatusCode)500, typeof(AuthStatus) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="LuxembourgApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LuxembourgApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LuxembourgApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LuxembourgApi(string basePath)
        {
            this.Configuration = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenFactSetPartnersDocuments.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LuxembourgApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public LuxembourgApi(FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OpenFactSetPartnersDocuments.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="LuxembourgApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public LuxembourgApi(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ISynchronousClient client, FactSet.SDK.OpenFactSetPartnersDocuments.Client.IAsynchronousClient asyncClient, FactSet.SDK.OpenFactSetPartnersDocuments.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.OpenFactSetPartnersDocuments.Client.ExceptionFactory ExceptionFactory
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
        /// Returns daily files from Open:FactSet Partner - Luxembourg Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <returns>LuxResponse</returns>
        public LuxResponse GetLuxembourgGreenbondsDaily(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string))
        {
            var localVarResponse = GetLuxembourgGreenbondsDailyWithHttpInfo(sort, paginationLimit, paginationOffset, isin, preissuancePubDate, type);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <returns>ApiResponse of LuxResponse</returns>
        public ApiResponse<LuxResponse> GetLuxembourgGreenbondsDailyWithHttpInfo(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string))
        {
            FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (sort != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_sort", sort));
            }
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }
            if (isin != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "isin", isin));
            }
            if (preissuancePubDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "preissuancePubDate", preissuancePubDate));
            }
            if (type != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "type", type));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetLuxembourgGreenbondsDailyResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            LuxResponse>("/luxembourg/green-bonds/daily", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetLuxembourgGreenbondsDaily", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of LuxResponse</returns>
        public async System.Threading.Tasks.Task<LuxResponse>GetLuxembourgGreenbondsDailyAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetLuxembourgGreenbondsDailyWithHttpInfoAsync(sort, paginationLimit, paginationOffset, isin, preissuancePubDate, type, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Returns daily files from Open:FactSet Partner - Luxembourg Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 
        /// </summary>
        /// <exception cref="FactSet.SDK.OpenFactSetPartnersDocuments.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="sort">Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional, default to -startDate)</param>
        /// <param name="paginationLimit">Specifies the maximum number of results to return per result. (optional, default to 20)</param>
        /// <param name="paginationOffset">Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional, default to 0)</param>
        /// <param name="isin">Specifies the ISIN of the record.  (optional)</param>
        /// <param name="preissuancePubDate">The pre-issuance date of the record.  (optional)</param>
        /// <param name="type">Please input the value as **idMap** to get the symbology files     (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (LuxResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<LuxResponse>> GetLuxembourgGreenbondsDailyWithHttpInfoAsync(string sort = default(string), int? paginationLimit = default(int?), int? paginationOffset = default(int?), string isin = default(string), DateTime? preissuancePubDate = default(DateTime?), string type = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (sort != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_sort", sort));
            }
            if (paginationLimit != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationLimit", paginationLimit));
            }
            if (paginationOffset != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "_paginationOffset", paginationOffset));
            }
            if (isin != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "isin", isin));
            }
            if (preissuancePubDate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "preissuancePubDate", preissuancePubDate));
            }
            if (type != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.ParameterToMultiMap("", "type", type));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OpenFactSetPartnersDocuments.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetLuxembourgGreenbondsDailyResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<LuxResponse>("/luxembourg/green-bonds/daily", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetLuxembourgGreenbondsDaily", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
