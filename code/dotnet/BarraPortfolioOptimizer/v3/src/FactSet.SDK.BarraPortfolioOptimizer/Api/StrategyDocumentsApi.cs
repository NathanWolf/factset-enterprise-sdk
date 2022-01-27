/*
 * Barra Portfolio Optimizer API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.BarraPortfolioOptimizer.Client;
using FactSet.SDK.BarraPortfolioOptimizer.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.BarraPortfolioOptimizer.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IStrategyDocumentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>DocumentDirectoriesRoot</returns>
        DocumentDirectoriesRoot GetBarraStrategyDocuments(string path);

        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>ApiResponse of DocumentDirectoriesRoot</returns>
        ApiResponse<DocumentDirectoriesRoot> GetBarraStrategyDocumentsWithHttpInfo(string path);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IStrategyDocumentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectoriesRoot</returns>
        System.Threading.Tasks.Task<DocumentDirectoriesRoot> GetBarraStrategyDocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectoriesRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<DocumentDirectoriesRoot>> GetBarraStrategyDocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
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
        private FactSet.SDK.BarraPortfolioOptimizer.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

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
            this.Configuration = FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.BarraPortfolioOptimizer.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.BarraPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.BarraPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="StrategyDocumentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public StrategyDocumentsApi(FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.BarraPortfolioOptimizer.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.BarraPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.BarraPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="StrategyDocumentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public StrategyDocumentsApi(FactSet.SDK.BarraPortfolioOptimizer.Client.ISynchronousClient client, FactSet.SDK.BarraPortfolioOptimizer.Client.IAsynchronousClient asyncClient, FactSet.SDK.BarraPortfolioOptimizer.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.BarraPortfolioOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.BarraPortfolioOptimizer.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.BarraPortfolioOptimizer.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.BarraPortfolioOptimizer.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.BarraPortfolioOptimizer.Client.ExceptionFactory ExceptionFactory
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
        /// Get Barra strategy documents and sub-directories in a directory This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>DocumentDirectoriesRoot</returns>
        public DocumentDirectoriesRoot GetBarraStrategyDocuments(string path)
        {
            FactSet.SDK.BarraPortfolioOptimizer.Client.ApiResponse<DocumentDirectoriesRoot> localVarResponse = GetBarraStrategyDocumentsWithHttpInfo(path);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <returns>ApiResponse of DocumentDirectoriesRoot</returns>
        public FactSet.SDK.BarraPortfolioOptimizer.Client.ApiResponse<DocumentDirectoriesRoot> GetBarraStrategyDocumentsWithHttpInfo(string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException(400, "Missing required parameter 'path' when calling StrategyDocumentsApi->GetBarraStrategyDocuments");

            FactSet.SDK.BarraPortfolioOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.BarraPortfolioOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Get<DocumentDirectoriesRoot>("/analytics/engines/bpm/v3/strategies/{path}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBarraStrategyDocuments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectoriesRoot</returns>
        public async System.Threading.Tasks.Task<DocumentDirectoriesRoot> GetBarraStrategyDocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.BarraPortfolioOptimizer.Client.ApiResponse<DocumentDirectoriesRoot> localVarResponse = await GetBarraStrategyDocumentsWithHttpInfoAsync(path, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Barra strategy documents and sub-directories in a directory This endpoint looks up all Barra strategy documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the strategy documents and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectoriesRoot)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.BarraPortfolioOptimizer.Client.ApiResponse<DocumentDirectoriesRoot>> GetBarraStrategyDocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.BarraPortfolioOptimizer.Client.ApiException(400, "Missing required parameter 'path' when calling StrategyDocumentsApi->GetBarraStrategyDocuments");


            FactSet.SDK.BarraPortfolioOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.BarraPortfolioOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.BarraPortfolioOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.GetAsync<DocumentDirectoriesRoot>("/analytics/engines/bpm/v3/strategies/{path}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetBarraStrategyDocuments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
