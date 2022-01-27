/*
 * Vault API
 *
 * Allow clients to fetch Vault Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.Vault.Client;
using FactSet.SDK.Vault.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.Vault.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDocumentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Vault documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>DocumentDirectories</returns>
        DocumentDirectories GetVaultDocuments(string path);

        /// <summary>
        /// Get Vault documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>ApiResponse of DocumentDirectories</returns>
        ApiResponse<DocumentDirectories> GetVaultDocumentsWithHttpInfo(string path);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDocumentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Vault documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectories</returns>
        System.Threading.Tasks.Task<DocumentDirectories> GetVaultDocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Vault documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectories)</returns>
        System.Threading.Tasks.Task<ApiResponse<DocumentDirectories>> GetVaultDocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDocumentsApi : IDocumentsApiSync, IDocumentsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DocumentsApi : IDocumentsApi
    {
        private FactSet.SDK.Vault.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DocumentsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DocumentsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.Vault.Client.Configuration.MergeConfigurations(
                FactSet.SDK.Vault.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.Vault.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.Vault.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.Vault.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.Vault.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DocumentsApi(FactSet.SDK.Vault.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.Vault.Client.Configuration.MergeConfigurations(
                FactSet.SDK.Vault.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.Vault.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.Vault.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.Vault.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DocumentsApi(FactSet.SDK.Vault.Client.ISynchronousClient client, FactSet.SDK.Vault.Client.IAsynchronousClient asyncClient, FactSet.SDK.Vault.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.Vault.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.Vault.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.Vault.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.Vault.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.Vault.Client.ExceptionFactory ExceptionFactory
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
        /// Get Vault documents and sub-directories in a directory This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>DocumentDirectories</returns>
        public DocumentDirectories GetVaultDocuments(string path)
        {
            FactSet.SDK.Vault.Client.ApiResponse<DocumentDirectories> localVarResponse = GetVaultDocumentsWithHttpInfo(path);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault documents and sub-directories in a directory This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>ApiResponse of DocumentDirectories</returns>
        public FactSet.SDK.Vault.Client.ApiResponse<DocumentDirectories> GetVaultDocumentsWithHttpInfo(string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'path' when calling DocumentsApi->GetVaultDocuments");

            FactSet.SDK.Vault.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vault.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.Vault.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vault.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Get<DocumentDirectories>("/analytics/lookups/v2/engines/vault/documents/{path}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultDocuments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Vault documents and sub-directories in a directory This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectories</returns>
        public async System.Threading.Tasks.Task<DocumentDirectories> GetVaultDocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.Vault.Client.ApiResponse<DocumentDirectories> localVarResponse = await GetVaultDocumentsWithHttpInfoAsync(path, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault documents and sub-directories in a directory This endpoint looks up all Vault documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectories)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.Vault.Client.ApiResponse<DocumentDirectories>> GetVaultDocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'path' is set
            if (path == null)
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'path' when calling DocumentsApi->GetVaultDocuments");


            FactSet.SDK.Vault.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vault.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.Vault.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vault.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.GetAsync<DocumentDirectories>("/analytics/lookups/v2/engines/vault/documents/{path}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultDocuments", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
