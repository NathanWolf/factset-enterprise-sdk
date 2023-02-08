/*
 * SPAR Engine API
 *
 * Allow clients to fetch SPAR Engine Analytics through APIs.
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
using FactSet.SDK.SPAREngine.Client;
using FactSet.SDK.SPAREngine.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.SPAREngine.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDocumentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>DocumentDirectories</returns>
        DocumentDirectories GetSPAR3Documents(string path);

        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>ApiResponse of DocumentDirectories</returns>
        ApiResponse<DocumentDirectories> GetSPAR3DocumentsWithHttpInfo(string path);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDocumentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectories</returns>
        System.Threading.Tasks.Task<DocumentDirectories> GetSPAR3DocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory
        /// </summary>
        /// <remarks>
        /// This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </remarks>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectories)</returns>
        System.Threading.Tasks.Task<ApiResponse<DocumentDirectories>> GetSPAR3DocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
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
        private FactSet.SDK.SPAREngine.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetSPAR3DocumentsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(DocumentDirectories) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

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
            this.Configuration = FactSet.SDK.SPAREngine.Client.Configuration.MergeConfigurations(
                FactSet.SDK.SPAREngine.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.SPAREngine.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.SPAREngine.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.SPAREngine.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.SPAREngine.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DocumentsApi(FactSet.SDK.SPAREngine.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.SPAREngine.Client.Configuration.MergeConfigurations(
                FactSet.SDK.SPAREngine.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.SPAREngine.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.SPAREngine.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.SPAREngine.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DocumentsApi(FactSet.SDK.SPAREngine.Client.ISynchronousClient client, FactSet.SDK.SPAREngine.Client.IAsynchronousClient asyncClient, FactSet.SDK.SPAREngine.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.SPAREngine.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.SPAREngine.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.SPAREngine.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.SPAREngine.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.SPAREngine.Client.ExceptionFactory ExceptionFactory
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
        /// Gets SPAR3 documents and sub-directories in a directory This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>DocumentDirectories</returns>
        public DocumentDirectories GetSPAR3Documents(string path)
        {
            var localVarResponse = GetSPAR3DocumentsWithHttpInfo(path);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <returns>ApiResponse of DocumentDirectories</returns>
        public ApiResponse<DocumentDirectories> GetSPAR3DocumentsWithHttpInfo(string path)
        {
            // verify the required parameter 'path' is set
            if (path == null)
            {
                throw new FactSet.SDK.SPAREngine.Client.ApiException(400, "Missing required parameter 'path' when calling DocumentsApi->GetSPAR3Documents");
            }

            FactSet.SDK.SPAREngine.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.SPAREngine.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.SPAREngine.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.SPAREngine.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.SPAREngine.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.SPAREngine.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetSPAR3DocumentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            DocumentDirectories>("/analytics/lookups/v2/engines/spar/documents/{path}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetSPAR3Documents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DocumentDirectories</returns>
        public async System.Threading.Tasks.Task<DocumentDirectories>GetSPAR3DocumentsAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetSPAR3DocumentsWithHttpInfoAsync(path, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Gets SPAR3 documents and sub-directories in a directory This endpoint looks up all SPAR3 documents and sub-directories in a given directory.
        /// </summary>
        /// <exception cref="FactSet.SDK.SPAREngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="path">The directory to get the documents in</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DocumentDirectories)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<DocumentDirectories>> GetSPAR3DocumentsWithHttpInfoAsync(string path, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'path' is set
            if (path == null)
            {
                throw new FactSet.SDK.SPAREngine.Client.ApiException(400, "Missing required parameter 'path' when calling DocumentsApi->GetSPAR3Documents");
            }


            FactSet.SDK.SPAREngine.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.SPAREngine.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.SPAREngine.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.SPAREngine.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("path", FactSet.SDK.SPAREngine.Client.ClientUtils.ParameterToString(path)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.SPAREngine.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetSPAR3DocumentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<DocumentDirectories>("/analytics/lookups/v2/engines/spar/documents/{path}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetSPAR3Documents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
