/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.PortfolioReportingBatcher.Client;
using FactSet.SDK.PortfolioReportingBatcher.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.PortfolioReportingBatcher.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRunsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// check the status for a particular run ID
        /// </summary>
        /// <remarks>
        /// Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <returns>IdStatus</returns>
        IdStatus CheckRunStatus(string id);

        /// <summary>
        /// check the status for a particular run ID
        /// </summary>
        /// <remarks>
        /// Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <returns>ApiResponse of IdStatus</returns>
        ApiResponse<IdStatus> CheckRunStatusWithHttpInfo(string id);
        /// <summary>
        /// trigger PRB jobs
        /// </summary>
        /// <remarks>
        /// Use this endpoint with with POST method to trigger PRB jobs.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <returns>StartJobRunResponse</returns>
        StartJobRunResponse StartJobRun(StartJobRoot startJobRoot = default(StartJobRoot));

        /// <summary>
        /// trigger PRB jobs
        /// </summary>
        /// <remarks>
        /// Use this endpoint with with POST method to trigger PRB jobs.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <returns>ApiResponse of StartJobRunResponse</returns>
        ApiResponse<StartJobRunResponse> StartJobRunWithHttpInfo(StartJobRoot startJobRoot = default(StartJobRoot));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRunsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// check the status for a particular run ID
        /// </summary>
        /// <remarks>
        /// Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of IdStatus</returns>
        System.Threading.Tasks.Task<IdStatus> CheckRunStatusAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// check the status for a particular run ID
        /// </summary>
        /// <remarks>
        /// Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (IdStatus)</returns>
        System.Threading.Tasks.Task<ApiResponse<IdStatus>> CheckRunStatusWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// trigger PRB jobs
        /// </summary>
        /// <remarks>
        /// Use this endpoint with with POST method to trigger PRB jobs.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of StartJobRunResponse</returns>
        System.Threading.Tasks.Task<StartJobRunResponse> StartJobRunAsync(StartJobRoot startJobRoot = default(StartJobRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// trigger PRB jobs
        /// </summary>
        /// <remarks>
        /// Use this endpoint with with POST method to trigger PRB jobs.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (StartJobRunResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<StartJobRunResponse>> StartJobRunWithHttpInfoAsync(StartJobRoot startJobRoot = default(StartJobRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IRunsApi : IRunsApiSync, IRunsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class RunsApi : IRunsApi
    {
        private FactSet.SDK.PortfolioReportingBatcher.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> CheckRunStatusResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(IdStatus) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> StartJobRunResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)202, typeof(StartJobRunResponse) },
            { (HttpStatusCode)400, typeof(ClientErrorResponse) },
            { (HttpStatusCode)404, typeof(ClientErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="RunsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RunsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RunsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.MergeConfigurations(
                FactSet.SDK.PortfolioReportingBatcher.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.PortfolioReportingBatcher.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public RunsApi(FactSet.SDK.PortfolioReportingBatcher.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.MergeConfigurations(
                FactSet.SDK.PortfolioReportingBatcher.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RunsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public RunsApi(FactSet.SDK.PortfolioReportingBatcher.Client.ISynchronousClient client, FactSet.SDK.PortfolioReportingBatcher.Client.IAsynchronousClient asyncClient, FactSet.SDK.PortfolioReportingBatcher.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.PortfolioReportingBatcher.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.PortfolioReportingBatcher.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.PortfolioReportingBatcher.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.PortfolioReportingBatcher.Client.ExceptionFactory ExceptionFactory
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
        /// check the status for a particular run ID Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <returns>IdStatus</returns>
        public IdStatus CheckRunStatus(string id)
        {
            var localVarResponse = CheckRunStatusWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// check the status for a particular run ID Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <returns>ApiResponse of IdStatus</returns>
        public ApiResponse<IdStatus> CheckRunStatusWithHttpInfo(string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.PortfolioReportingBatcher.Client.ApiException(400, "Missing required parameter 'id' when calling RunsApi->CheckRunStatus");
            }

            FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = CheckRunStatusResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            IdStatus>("/runs/{id}/status", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CheckRunStatus", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// check the status for a particular run ID Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of IdStatus</returns>
        public async System.Threading.Tasks.Task<IdStatus>CheckRunStatusAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await CheckRunStatusWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// check the status for a particular run ID Use this endpoint to check the status of a run using the id from the POST /runs endpoint
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">run id</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (IdStatus)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<IdStatus>> CheckRunStatusWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.PortfolioReportingBatcher.Client.ApiException(400, "Missing required parameter 'id' when calling RunsApi->CheckRunStatus");
            }


            FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = CheckRunStatusResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<IdStatus>("/runs/{id}/status", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CheckRunStatus", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// trigger PRB jobs Use this endpoint with with POST method to trigger PRB jobs.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <returns>StartJobRunResponse</returns>
        public StartJobRunResponse StartJobRun(StartJobRoot startJobRoot = default(StartJobRoot))
        {
            var localVarResponse = StartJobRunWithHttpInfo(startJobRoot);
            return localVarResponse.Data;
        }

        /// <summary>
        /// trigger PRB jobs Use this endpoint with with POST method to trigger PRB jobs.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <returns>ApiResponse of StartJobRunResponse</returns>
        public ApiResponse<StartJobRunResponse> StartJobRunWithHttpInfo(StartJobRoot startJobRoot = default(StartJobRoot))
        {
            FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = startJobRoot;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = StartJobRunResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            StartJobRunResponse>("/runs", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("StartJobRun", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// trigger PRB jobs Use this endpoint with with POST method to trigger PRB jobs.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of StartJobRunResponse</returns>
        public async System.Threading.Tasks.Task<StartJobRunResponse>StartJobRunAsync(StartJobRoot startJobRoot = default(StartJobRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await StartJobRunWithHttpInfoAsync(startJobRoot, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// trigger PRB jobs Use this endpoint with with POST method to trigger PRB jobs.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startJobRoot">The main object in the request body contains details for the job to be triggered. The \&quot;name\&quot; and \&quot;type\&quot; fields will uniquely identify the job and both must be provided. Other fields can be provided depending on the job&#39;s type. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (StartJobRunResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<StartJobRunResponse>> StartJobRunWithHttpInfoAsync(StartJobRoot startJobRoot = default(StartJobRoot), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = startJobRoot;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = StartJobRunResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<StartJobRunResponse>("/runs", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("StartJobRun", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
