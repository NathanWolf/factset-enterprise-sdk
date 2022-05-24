/*
 * Market Intelligence
 *
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.MarketIntelligence.Client;
using FactSet.SDK.MarketIntelligence.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.MarketIntelligence.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRetrieveRefreshedDataApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Retrieve data for desired report.
        /// </summary>
        /// <remarks>
        /// Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </remarks>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <returns>ReportDataHeader</returns>
        ReportDataHeader GetDataPollIdResultGet(string pollId);

        /// <summary>
        /// Retrieve data for desired report.
        /// </summary>
        /// <remarks>
        /// Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </remarks>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <returns>ApiResponse of ReportDataHeader</returns>
        ApiResponse<ReportDataHeader> GetDataPollIdResultGetWithHttpInfo(string pollId);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRetrieveRefreshedDataApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Retrieve data for desired report.
        /// </summary>
        /// <remarks>
        /// Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </remarks>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ReportDataHeader</returns>
        System.Threading.Tasks.Task<ReportDataHeader> GetDataPollIdResultGetAsync(string pollId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Retrieve data for desired report.
        /// </summary>
        /// <remarks>
        /// Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </remarks>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ReportDataHeader)</returns>
        System.Threading.Tasks.Task<ApiResponse<ReportDataHeader>> GetDataPollIdResultGetWithHttpInfoAsync(string pollId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRetrieveRefreshedDataApi : IRetrieveRefreshedDataApiSync, IRetrieveRefreshedDataApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class RetrieveRefreshedDataApi : IRetrieveRefreshedDataApi
    {
        private FactSet.SDK.MarketIntelligence.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetDataPollIdResultGetResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(ReportDataHeader) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="RetrieveRefreshedDataApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RetrieveRefreshedDataApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RetrieveRefreshedDataApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RetrieveRefreshedDataApi(string basePath)
        {
            this.Configuration = FactSet.SDK.MarketIntelligence.Client.Configuration.MergeConfigurations(
                FactSet.SDK.MarketIntelligence.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.MarketIntelligence.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.MarketIntelligence.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.MarketIntelligence.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.MarketIntelligence.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RetrieveRefreshedDataApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public RetrieveRefreshedDataApi(FactSet.SDK.MarketIntelligence.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.MarketIntelligence.Client.Configuration.MergeConfigurations(
                FactSet.SDK.MarketIntelligence.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.MarketIntelligence.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.MarketIntelligence.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.MarketIntelligence.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RetrieveRefreshedDataApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public RetrieveRefreshedDataApi(FactSet.SDK.MarketIntelligence.Client.ISynchronousClient client, FactSet.SDK.MarketIntelligence.Client.IAsynchronousClient asyncClient, FactSet.SDK.MarketIntelligence.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.MarketIntelligence.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.MarketIntelligence.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.MarketIntelligence.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.MarketIntelligence.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.MarketIntelligence.Client.ExceptionFactory ExceptionFactory
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
        /// Retrieve data for desired report. Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </summary>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <returns>ReportDataHeader</returns>
        public ReportDataHeader GetDataPollIdResultGet(string pollId)
        {
            var localVarResponse = GetDataPollIdResultGetWithHttpInfo(pollId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve data for desired report. Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </summary>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <returns>ApiResponse of ReportDataHeader</returns>
        public ApiResponse<ReportDataHeader> GetDataPollIdResultGetWithHttpInfo(string pollId)
        {
            // verify the required parameter 'pollId' is set
            if (pollId == null)
            {
                throw new FactSet.SDK.MarketIntelligence.Client.ApiException(400, "Missing required parameter 'pollId' when calling RetrieveRefreshedDataApi->GetDataPollIdResultGet");
            }

            FactSet.SDK.MarketIntelligence.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.MarketIntelligence.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.MarketIntelligence.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.MarketIntelligence.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("poll_id", FactSet.SDK.MarketIntelligence.Client.ClientUtils.ParameterToString(pollId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.MarketIntelligence.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetDataPollIdResultGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            ReportDataHeader>("/get-data/{poll_id}/result", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDataPollIdResultGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Retrieve data for desired report. Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </summary>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ReportDataHeader</returns>
        public async System.Threading.Tasks.Task<ReportDataHeader>GetDataPollIdResultGetAsync(string pollId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetDataPollIdResultGetWithHttpInfoAsync(pollId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Retrieve data for desired report. Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.
        /// </summary>
        /// <exception cref="FactSet.SDK.MarketIntelligence.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="pollId">example: 65ba6dd63fb366464646426d0b</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ReportDataHeader)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<ReportDataHeader>> GetDataPollIdResultGetWithHttpInfoAsync(string pollId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'pollId' is set
            if (pollId == null)
            {
                throw new FactSet.SDK.MarketIntelligence.Client.ApiException(400, "Missing required parameter 'pollId' when calling RetrieveRefreshedDataApi->GetDataPollIdResultGet");
            }


            FactSet.SDK.MarketIntelligence.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.MarketIntelligence.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.MarketIntelligence.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.MarketIntelligence.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("poll_id", FactSet.SDK.MarketIntelligence.Client.ClientUtils.ParameterToString(pollId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.MarketIntelligence.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetDataPollIdResultGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<ReportDataHeader>("/get-data/{poll_id}/result", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDataPollIdResultGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
