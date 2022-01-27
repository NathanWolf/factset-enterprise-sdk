/*
 * Northfield Portfolio API
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
using FactSet.SDK.NorthfieldPortfolioOptimizer.Client;
using FactSet.SDK.NorthfieldPortfolioOptimizer.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.NorthfieldPortfolioOptimizer.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAccountsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get accounts and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <returns>AccountDirectoriesRoot</returns>
        AccountDirectoriesRoot GetAccounts(string path);

        /// <summary>
        /// Get accounts and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <returns>ApiResponse of AccountDirectoriesRoot</returns>
        ApiResponse<AccountDirectoriesRoot> GetAccountsWithHttpInfo(string path);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAccountsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get accounts and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AccountDirectoriesRoot</returns>
        System.Threading.Tasks.Task<AccountDirectoriesRoot> GetAccountsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get accounts and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AccountDirectoriesRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<AccountDirectoriesRoot>> GetAccountsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAccountsApi : IAccountsApiSync, IAccountsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class AccountsApi : IAccountsApi
    {
        private FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="AccountsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AccountsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AccountsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AccountsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.NorthfieldPortfolioOptimizer.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AccountsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public AccountsApi(FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.NorthfieldPortfolioOptimizer.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AccountsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public AccountsApi(FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ISynchronousClient client, FactSet.SDK.NorthfieldPortfolioOptimizer.Client.IAsynchronousClient asyncClient, FactSet.SDK.NorthfieldPortfolioOptimizer.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.NorthfieldPortfolioOptimizer.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.NorthfieldPortfolioOptimizer.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ExceptionFactory ExceptionFactory
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
        /// Get accounts and sub-directories in a directory This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <returns>AccountDirectoriesRoot</returns>
        public AccountDirectoriesRoot GetAccounts(string path)
        {
            FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiResponse<AccountDirectoriesRoot> localVarResponse = GetAccountsWithHttpInfo(path);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get accounts and sub-directories in a directory This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <returns>ApiResponse of AccountDirectoriesRoot</returns>
        public FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiResponse<AccountDirectoriesRoot> GetAccountsWithHttpInfo(string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException(400, "Missing required parameter 'path' when calling AccountsApi->GetAccounts");

            FactSet.SDK.NorthfieldPortfolioOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Get<AccountDirectoriesRoot>("/analytics/lookups/v3/accounts/{path}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAccounts", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get accounts and sub-directories in a directory This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of AccountDirectoriesRoot</returns>
        public async System.Threading.Tasks.Task<AccountDirectoriesRoot> GetAccountsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiResponse<AccountDirectoriesRoot> localVarResponse = await GetAccountsWithHttpInfoAsync(path, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get accounts and sub-directories in a directory This endpoint looks up all ACCT and ACTM files and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the accounts and sub-directories in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (AccountDirectoriesRoot)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiResponse<AccountDirectoriesRoot>> GetAccountsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ApiException(400, "Missing required parameter 'path' when calling AccountsApi->GetAccounts");


            FactSet.SDK.NorthfieldPortfolioOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.NorthfieldPortfolioOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.NorthfieldPortfolioOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.GetAsync<AccountDirectoriesRoot>("/analytics/lookups/v3/accounts/{path}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAccounts", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
