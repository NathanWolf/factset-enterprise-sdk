/*
 * Engines API
 *
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.AxiomaEquityOptimizer.Client;
using FactSet.SDK.AxiomaEquityOptimizer.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.AxiomaEquityOptimizer.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IStrategyDocumentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>DocumentDirectories</returns>
        DocumentDirectories GetAxiomaEquityStrategyDocuments(string path);

        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>ApiResponse of DocumentDirectories</returns>
        ApiResponse<DocumentDirectories> GetAxiomaEquityStrategyDocumentsWithHttpInfo(string path);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IStrategyDocumentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectories</returns>
        System.Threading.Tasks.Task<DocumentDirectories> GetAxiomaEquityStrategyDocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectories)</returns>
        System.Threading.Tasks.Task<ApiResponse<DocumentDirectories>> GetAxiomaEquityStrategyDocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IStrategyDocumentsApi : IStrategyDocumentsApiSync, IStrategyDocumentsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class StrategyDocumentsApi : IStrategyDocumentsApi
    {
        private FactSet.SDK.AxiomaEquityOptimizer.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="StrategyDocumentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public StrategyDocumentsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="StrategyDocumentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public StrategyDocumentsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.AxiomaEquityOptimizer.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="StrategyDocumentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public StrategyDocumentsApi(FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.AxiomaEquityOptimizer.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="StrategyDocumentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public StrategyDocumentsApi(FactSet.SDK.AxiomaEquityOptimizer.Client.ISynchronousClient client, FactSet.SDK.AxiomaEquityOptimizer.Client.IAsynchronousClient asyncClient, FactSet.SDK.AxiomaEquityOptimizer.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.AxiomaEquityOptimizer.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.ExceptionFactory ExceptionFactory
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
        /// Get Axioma Equity strategy documents and sub-directories in a directory This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>DocumentDirectories</returns>
        public DocumentDirectories GetAxiomaEquityStrategyDocuments(string path)
        {
            FactSet.SDK.AxiomaEquityOptimizer.Client.ApiResponse<DocumentDirectories> localVarResponse = GetAxiomaEquityStrategyDocumentsWithHttpInfo(path);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>ApiResponse of DocumentDirectories</returns>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.ApiResponse<DocumentDirectories> GetAxiomaEquityStrategyDocumentsWithHttpInfo(string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException(400, "Missing required parameter 'path' when calling StrategyDocumentsApi->GetAxiomaEquityStrategyDocuments");

            FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null)
            {
                var token = this.Configuration.OAuth2Client.GetAccessTokenAsync().Result;
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<DocumentDirectories>("/analytics/engines/axp/v1/strategies/{path}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAxiomaEquityStrategyDocuments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectories</returns>
        public async System.Threading.Tasks.Task<DocumentDirectories> GetAxiomaEquityStrategyDocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.AxiomaEquityOptimizer.Client.ApiResponse<DocumentDirectories> localVarResponse = await GetAxiomaEquityStrategyDocumentsWithHttpInfoAsync(path, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Axioma Equity strategy documents and sub-directories in a directory This endpoint looks up all Axioma Equity strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectories)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.AxiomaEquityOptimizer.Client.ApiResponse<DocumentDirectories>> GetAxiomaEquityStrategyDocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException(400, "Missing required parameter 'path' when calling StrategyDocumentsApi->GetAxiomaEquityStrategyDocuments");


            FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }
            // authentication (FactSetOAuth2) required
            // oauth required
            if (!string.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + this.Configuration.AccessToken);
            }

            // FactSet Authentication Client required
            if (this.Configuration.OAuth2Client != null) {
                var token = await this.Configuration.OAuth2Client.GetAccessTokenAsync();
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Bearer " + token);
            }


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.GetAsync<DocumentDirectories>("/analytics/engines/axp/v1/strategies/{path}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAxiomaEquityStrategyDocuments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
