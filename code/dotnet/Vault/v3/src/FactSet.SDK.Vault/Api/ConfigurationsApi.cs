/*
 * Vault API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
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
    public interface IConfigurationsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Vault configuration by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <returns>VaultConfigurationRoot</returns>
        VaultConfigurationRoot GetVaultConfigurationById(string id);

        /// <summary>
        /// Get Vault configuration by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <returns>ApiResponse of VaultConfigurationRoot</returns>
        ApiResponse<VaultConfigurationRoot> GetVaultConfigurationByIdWithHttpInfo(string id);
        /// <summary>
        /// Get Vault configurations
        /// </summary>
        /// <remarks>
        /// This endpoint returns all the Vault configurations saved in the provided account.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <returns>VaultConfigurationSummaryRoot</returns>
        VaultConfigurationSummaryRoot GetVaultConfigurations(string account);

        /// <summary>
        /// Get Vault configurations
        /// </summary>
        /// <remarks>
        /// This endpoint returns all the Vault configurations saved in the provided account.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <returns>ApiResponse of VaultConfigurationSummaryRoot</returns>
        ApiResponse<VaultConfigurationSummaryRoot> GetVaultConfigurationsWithHttpInfo(string account);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IConfigurationsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Vault configuration by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of VaultConfigurationRoot</returns>
        System.Threading.Tasks.Task<VaultConfigurationRoot> GetVaultConfigurationByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Vault configuration by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (VaultConfigurationRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<VaultConfigurationRoot>> GetVaultConfigurationByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get Vault configurations
        /// </summary>
        /// <remarks>
        /// This endpoint returns all the Vault configurations saved in the provided account.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of VaultConfigurationSummaryRoot</returns>
        System.Threading.Tasks.Task<VaultConfigurationSummaryRoot> GetVaultConfigurationsAsync(string account, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Vault configurations
        /// </summary>
        /// <remarks>
        /// This endpoint returns all the Vault configurations saved in the provided account.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (VaultConfigurationSummaryRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<VaultConfigurationSummaryRoot>> GetVaultConfigurationsWithHttpInfoAsync(string account, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IConfigurationsApi : IConfigurationsApiSync, IConfigurationsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ConfigurationsApi : IConfigurationsApi
    {
        private FactSet.SDK.Vault.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetVaultConfigurationByIdResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(VaultConfigurationRoot) },
            { (HttpStatusCode)400, typeof(ClientErrorResponse) },
            { (HttpStatusCode)404, typeof(ClientErrorResponse) },
        };
        private static readonly Dictionary<HttpStatusCode, System.Type> GetVaultConfigurationsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(VaultConfigurationSummaryRoot) },
            { (HttpStatusCode)400, typeof(ClientErrorResponse) },
            { (HttpStatusCode)404, typeof(ClientErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ConfigurationsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ConfigurationsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ConfigurationsApi(string basePath)
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
        /// Initializes a new instance of the <see cref="ConfigurationsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ConfigurationsApi(FactSet.SDK.Vault.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="ConfigurationsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ConfigurationsApi(FactSet.SDK.Vault.Client.ISynchronousClient client, FactSet.SDK.Vault.Client.IAsynchronousClient asyncClient, FactSet.SDK.Vault.Client.IReadableConfiguration configuration)
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
        /// Get Vault configuration by id This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <returns>VaultConfigurationRoot</returns>
        public VaultConfigurationRoot GetVaultConfigurationById(string id)
        {
            var localVarResponse = GetVaultConfigurationByIdWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault configuration by id This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <returns>ApiResponse of VaultConfigurationRoot</returns>
        public ApiResponse<VaultConfigurationRoot> GetVaultConfigurationByIdWithHttpInfo(string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'id' when calling ConfigurationsApi->GetVaultConfigurationById");
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

            localVarRequestOptions.ResponseTypeDictionary = GetVaultConfigurationByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            VaultConfigurationRoot>("/analytics/engines/vault/v3/configurations/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultConfigurationById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Vault configuration by id This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of VaultConfigurationRoot</returns>
        public async System.Threading.Tasks.Task<VaultConfigurationRoot>GetVaultConfigurationByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetVaultConfigurationByIdWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault configuration by id This endpoint returns details for a Vault configuration as well as a list of accounts it is used in.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Vault configuration id to get the details of</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (VaultConfigurationRoot)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<VaultConfigurationRoot>> GetVaultConfigurationByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'id' when calling ConfigurationsApi->GetVaultConfigurationById");
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


            localVarRequestOptions.ResponseTypeDictionary = GetVaultConfigurationByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<VaultConfigurationRoot>("/analytics/engines/vault/v3/configurations/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultConfigurationById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Vault configurations This endpoint returns all the Vault configurations saved in the provided account.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <returns>VaultConfigurationSummaryRoot</returns>
        public VaultConfigurationSummaryRoot GetVaultConfigurations(string account)
        {
            var localVarResponse = GetVaultConfigurationsWithHttpInfo(account);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault configurations This endpoint returns all the Vault configurations saved in the provided account.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <returns>ApiResponse of VaultConfigurationSummaryRoot</returns>
        public ApiResponse<VaultConfigurationSummaryRoot> GetVaultConfigurationsWithHttpInfo(string account)
        {
            // verify the required parameter 'account' is set
            if (account == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'account' when calling ConfigurationsApi->GetVaultConfigurations");
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

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "account", account));

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

            localVarRequestOptions.ResponseTypeDictionary = GetVaultConfigurationsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            VaultConfigurationSummaryRoot>("/analytics/engines/vault/v3/configurations", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultConfigurations", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Vault configurations This endpoint returns all the Vault configurations saved in the provided account.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of VaultConfigurationSummaryRoot</returns>
        public async System.Threading.Tasks.Task<VaultConfigurationSummaryRoot>GetVaultConfigurationsAsync(string account, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetVaultConfigurationsWithHttpInfoAsync(account, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Vault configurations This endpoint returns all the Vault configurations saved in the provided account.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="account">Required account query parameter to filter configurations for a specific account</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (VaultConfigurationSummaryRoot)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<VaultConfigurationSummaryRoot>> GetVaultConfigurationsWithHttpInfoAsync(string account, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'account' is set
            if (account == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'account' when calling ConfigurationsApi->GetVaultConfigurations");
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

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "account", account));

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


            localVarRequestOptions.ResponseTypeDictionary = GetVaultConfigurationsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<VaultConfigurationSummaryRoot>("/analytics/engines/vault/v3/configurations", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetVaultConfigurations", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
