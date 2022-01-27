/*
 * IRN API v1
 *
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.IRNConfiguration.Client;
using FactSet.SDK.IRNConfiguration.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.IRNConfiguration.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUsersApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get all assigned FactSet users
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;UserConfigDto&gt;</returns>
        List<UserConfigDto> V1UsersGet();

        /// <summary>
        /// Get all assigned FactSet users
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;UserConfigDto&gt;</returns>
        ApiResponse<List<UserConfigDto>> V1UsersGetWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUsersApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get all assigned FactSet users
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;UserConfigDto&gt;</returns>
        System.Threading.Tasks.Task<List<UserConfigDto>> V1UsersGetAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get all assigned FactSet users
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;UserConfigDto&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<UserConfigDto>>> V1UsersGetWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUsersApi : IUsersApiSync, IUsersApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class UsersApi : IUsersApi
    {
        private FactSet.SDK.IRNConfiguration.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UsersApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UsersApi(string basePath)
        {
            this.Configuration = FactSet.SDK.IRNConfiguration.Client.Configuration.MergeConfigurations(
                FactSet.SDK.IRNConfiguration.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.IRNConfiguration.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.IRNConfiguration.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.IRNConfiguration.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.IRNConfiguration.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UsersApi(FactSet.SDK.IRNConfiguration.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.IRNConfiguration.Client.Configuration.MergeConfigurations(
                FactSet.SDK.IRNConfiguration.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.IRNConfiguration.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.IRNConfiguration.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.IRNConfiguration.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UsersApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public UsersApi(FactSet.SDK.IRNConfiguration.Client.ISynchronousClient client, FactSet.SDK.IRNConfiguration.Client.IAsynchronousClient asyncClient, FactSet.SDK.IRNConfiguration.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.IRNConfiguration.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.IRNConfiguration.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.IRNConfiguration.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.IRNConfiguration.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.IRNConfiguration.Client.ExceptionFactory ExceptionFactory
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
        /// Get all assigned FactSet users 
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;UserConfigDto&gt;</returns>
        public List<UserConfigDto> V1UsersGet()
        {
            FactSet.SDK.IRNConfiguration.Client.ApiResponse<List<UserConfigDto>> localVarResponse = V1UsersGetWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get all assigned FactSet users 
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;UserConfigDto&gt;</returns>
        public FactSet.SDK.IRNConfiguration.Client.ApiResponse<List<UserConfigDto>> V1UsersGetWithHttpInfo()
        {
            FactSet.SDK.IRNConfiguration.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.IRNConfiguration.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.IRNConfiguration.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.IRNConfiguration.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.IRNConfiguration.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Get<List<UserConfigDto>>("/v1/users", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("V1UsersGet", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get all assigned FactSet users 
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;UserConfigDto&gt;</returns>
        public async System.Threading.Tasks.Task<List<UserConfigDto>> V1UsersGetAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.IRNConfiguration.Client.ApiResponse<List<UserConfigDto>> localVarResponse = await V1UsersGetWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get all assigned FactSet users 
        /// </summary>
        /// <exception cref="FactSet.SDK.IRNConfiguration.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;UserConfigDto&gt;)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.IRNConfiguration.Client.ApiResponse<List<UserConfigDto>>> V1UsersGetWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.IRNConfiguration.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.IRNConfiguration.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.IRNConfiguration.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.IRNConfiguration.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.IRNConfiguration.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.GetAsync<List<UserConfigDto>>("/v1/users", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("V1UsersGet", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
