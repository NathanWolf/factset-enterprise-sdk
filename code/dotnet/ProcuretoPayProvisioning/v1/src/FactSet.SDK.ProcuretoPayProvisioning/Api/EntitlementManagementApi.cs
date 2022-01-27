/*
 * FactSet Procure to Pay API
 *
 * Allows for Provisioning and Entitlement of FactSet accounts.     Authentication is provided via FactSet's [API Key System](https://developer.factset.com/authentication)    Please note that the on-page \"Try it out\" features do not function. You must authorize against our API and make requests directly againt the endpoints.    
 *
 * The version of the OpenAPI document: 1S
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.ProcuretoPayProvisioning.Client;
using FactSet.SDK.ProcuretoPayProvisioning.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.ProcuretoPayProvisioning.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEntitlementManagementApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Adds listed productIds to an individual
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>InlineResponse202</returns>
        InlineResponse202 AddProductsPost(ManageProductIds manageProductIds = default(ManageProductIds));

        /// <summary>
        /// Adds listed productIds to an individual
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>ApiResponse of InlineResponse202</returns>
        ApiResponse<InlineResponse202> AddProductsPostWithHttpInfo(ManageProductIds manageProductIds = default(ManageProductIds));
        /// <summary>
        /// Removes listed productIds from an individual
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>InlineResponse202</returns>
        InlineResponse202 RemoveProductsPost(ManageProductIds manageProductIds = default(ManageProductIds));

        /// <summary>
        /// Removes listed productIds from an individual
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>ApiResponse of InlineResponse202</returns>
        ApiResponse<InlineResponse202> RemoveProductsPostWithHttpInfo(ManageProductIds manageProductIds = default(ManageProductIds));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEntitlementManagementApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Adds listed productIds to an individual
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse202</returns>
        System.Threading.Tasks.Task<InlineResponse202> AddProductsPostAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Adds listed productIds to an individual
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse202)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse202>> AddProductsPostWithHttpInfoAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Removes listed productIds from an individual
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse202</returns>
        System.Threading.Tasks.Task<InlineResponse202> RemoveProductsPostAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Removes listed productIds from an individual
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse202)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse202>> RemoveProductsPostWithHttpInfoAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEntitlementManagementApi : IEntitlementManagementApiSync, IEntitlementManagementApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class EntitlementManagementApi : IEntitlementManagementApi
    {
        private FactSet.SDK.ProcuretoPayProvisioning.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="EntitlementManagementApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EntitlementManagementApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EntitlementManagementApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EntitlementManagementApi(string basePath)
        {
            this.Configuration = FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration.MergeConfigurations(
                FactSet.SDK.ProcuretoPayProvisioning.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.ProcuretoPayProvisioning.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.ProcuretoPayProvisioning.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EntitlementManagementApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public EntitlementManagementApi(FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration.MergeConfigurations(
                FactSet.SDK.ProcuretoPayProvisioning.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.ProcuretoPayProvisioning.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.ProcuretoPayProvisioning.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EntitlementManagementApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public EntitlementManagementApi(FactSet.SDK.ProcuretoPayProvisioning.Client.ISynchronousClient client, FactSet.SDK.ProcuretoPayProvisioning.Client.IAsynchronousClient asyncClient, FactSet.SDK.ProcuretoPayProvisioning.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.ProcuretoPayProvisioning.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.ProcuretoPayProvisioning.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.ProcuretoPayProvisioning.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.ProcuretoPayProvisioning.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.ProcuretoPayProvisioning.Client.ExceptionFactory ExceptionFactory
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
        /// Adds listed productIds to an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>InlineResponse202</returns>
        public InlineResponse202 AddProductsPost(ManageProductIds manageProductIds = default(ManageProductIds))
        {
            FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202> localVarResponse = AddProductsPostWithHttpInfo(manageProductIds);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Adds listed productIds to an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>ApiResponse of InlineResponse202</returns>
        public FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202> AddProductsPostWithHttpInfo(ManageProductIds manageProductIds = default(ManageProductIds))
        {
            FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json; charset=utf-8",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = manageProductIds;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Post<InlineResponse202>("/addProducts", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("AddProductsPost", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Adds listed productIds to an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse202</returns>
        public async System.Threading.Tasks.Task<InlineResponse202> AddProductsPostAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202> localVarResponse = await AddProductsPostWithHttpInfoAsync(manageProductIds, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Adds listed productIds to an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse202)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202>> AddProductsPostWithHttpInfoAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json; charset=utf-8",
                "text/plain"
            };


            var localVarContentType = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = manageProductIds;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.PostAsync<InlineResponse202>("/addProducts", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("AddProductsPost", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Removes listed productIds from an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>InlineResponse202</returns>
        public InlineResponse202 RemoveProductsPost(ManageProductIds manageProductIds = default(ManageProductIds))
        {
            FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202> localVarResponse = RemoveProductsPostWithHttpInfo(manageProductIds);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Removes listed productIds from an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <returns>ApiResponse of InlineResponse202</returns>
        public FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202> RemoveProductsPostWithHttpInfo(ManageProductIds manageProductIds = default(ManageProductIds))
        {
            FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json; charset=utf-8",
                "text/plain"
            };

            var localVarContentType = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = manageProductIds;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Post<InlineResponse202>("/removeProducts", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("RemoveProductsPost", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Removes listed productIds from an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse202</returns>
        public async System.Threading.Tasks.Task<InlineResponse202> RemoveProductsPostAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202> localVarResponse = await RemoveProductsPostWithHttpInfoAsync(manageProductIds, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Removes listed productIds from an individual 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayProvisioning.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="manageProductIds"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse202)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.ProcuretoPayProvisioning.Client.ApiResponse<InlineResponse202>> RemoveProductsPostWithHttpInfoAsync(ManageProductIds manageProductIds = default(ManageProductIds), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayProvisioning.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json; charset=utf-8",
                "text/plain"
            };


            var localVarContentType = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = manageProductIds;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayProvisioning.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.PostAsync<InlineResponse202>("/removeProducts", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("RemoveProductsPost", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
