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
    public interface IComponentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Vault component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a Vault component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <returns>VaultComponent</returns>
        VaultComponent GetVaultComponentById(string id);

        /// <summary>
        /// Get Vault component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a Vault component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <returns>ApiResponse of VaultComponent</returns>
        ApiResponse<VaultComponent> GetVaultComponentByIdWithHttpInfo(string id);
        /// <summary>
        /// Get Vault components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of Vault components in a given Vault document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>Dictionary<string, ComponentSummary></returns>
        Dictionary<string, ComponentSummary> GetVaultComponents(string document);

        /// <summary>
        /// Get Vault components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of Vault components in a given Vault document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>ApiResponse of Dictionary<string, ComponentSummary></returns>
        ApiResponse<Dictionary<string, ComponentSummary>> GetVaultComponentsWithHttpInfo(string document);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IComponentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Vault component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a Vault component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of VaultComponent</returns>
        System.Threading.Tasks.Task<VaultComponent> GetVaultComponentByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Vault component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a Vault component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (VaultComponent)</returns>
        System.Threading.Tasks.Task<ApiResponse<VaultComponent>> GetVaultComponentByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get Vault components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of Vault components in a given Vault document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Dictionary&lt;string, ComponentSummary&gt;</returns>
        System.Threading.Tasks.Task<Dictionary<string, ComponentSummary>> GetVaultComponentsAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Vault components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of Vault components in a given Vault document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Dictionary<string, ComponentSummary>)</returns>
        System.Threading.Tasks.Task<ApiResponse<Dictionary<string, ComponentSummary>>> GetVaultComponentsWithHttpInfoAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IComponentsApi : IComponentsApiSync, IComponentsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ComponentsApi : IComponentsApi
    {
        private FactSet.SDK.Vault.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetVaultComponentByIdResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(VaultComponent) },
        };
        private static readonly Dictionary<HttpStatusCode, System.Type> GetVaultComponentsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(Dictionary<string, ComponentSummary>) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="ComponentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ComponentsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ComponentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ComponentsApi(string basePath)
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
        /// Initializes a new instance of the <see cref="ComponentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ComponentsApi(FactSet.SDK.Vault.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="ComponentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ComponentsApi(FactSet.SDK.Vault.Client.ISynchronousClient client, FactSet.SDK.Vault.Client.IAsynchronousClient asyncClient, FactSet.SDK.Vault.Client.IReadableConfiguration configuration)
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
        /// Get Vault component by id This endpoint returns the default settings of a Vault component.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <returns>VaultComponent</returns>
        public VaultComponent GetVaultComponentById(string id)
        {
            var localVarResponse = GetVaultComponentByIdWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault component by id This endpoint returns the default settings of a Vault component.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <returns>ApiResponse of VaultComponent</returns>
        public ApiResponse<VaultComponent> GetVaultComponentByIdWithHttpInfo(string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'id' when calling ComponentsApi->GetVaultComponentById");
            }

            FactSet.SDK.Vault.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vault.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.Vault.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vault.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetVaultComponentByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            VaultComponent>("/analytics/lookups/v2/engines/vault/components/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultComponentById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Vault component by id This endpoint returns the default settings of a Vault component.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of VaultComponent</returns>
        public async System.Threading.Tasks.Task<VaultComponent>GetVaultComponentByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetVaultComponentByIdWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault component by id This endpoint returns the default settings of a Vault component.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a vault component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (VaultComponent)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<VaultComponent>> GetVaultComponentByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'id' when calling ComponentsApi->GetVaultComponentById");
            }


            FactSet.SDK.Vault.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vault.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.Vault.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vault.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetVaultComponentByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<VaultComponent>("/analytics/lookups/v2/engines/vault/components/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultComponentById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Vault components This endpoint returns the list of Vault components in a given Vault document.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>Dictionary<string, ComponentSummary></returns>
        public Dictionary<string, ComponentSummary> GetVaultComponents(string document)
        {
            var localVarResponse = GetVaultComponentsWithHttpInfo(document);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault components This endpoint returns the list of Vault components in a given Vault document.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>ApiResponse of Dictionary&lt;string, ComponentSummary&gt;</returns>
        public ApiResponse<Dictionary<string, ComponentSummary>> GetVaultComponentsWithHttpInfo(string document)
        {
            // verify the required parameter 'document' is set
            if (document == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'document' when calling ComponentsApi->GetVaultComponents");
            }

            FactSet.SDK.Vault.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vault.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "document", document));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vault.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetVaultComponentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            Dictionary<string, ComponentSummary>>("/analytics/lookups/v2/engines/vault/components", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultComponents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Vault components This endpoint returns the list of Vault components in a given Vault document.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Dictionary&lt;string, ComponentSummary&gt;</returns>
        public async System.Threading.Tasks.Task<Dictionary<string, ComponentSummary>>GetVaultComponentsAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetVaultComponentsWithHttpInfoAsync(document, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault components This endpoint returns the list of Vault components in a given Vault document.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, ComponentSummary&gt;)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Dictionary<string, ComponentSummary>>> GetVaultComponentsWithHttpInfoAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'document' is set
            if (document == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'document' when calling ComponentsApi->GetVaultComponents");
            }


            FactSet.SDK.Vault.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Vault.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.Vault.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "document", document));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Vault.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetVaultComponentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Dictionary<string, ComponentSummary>>("/analytics/lookups/v2/engines/vault/components", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultComponents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
