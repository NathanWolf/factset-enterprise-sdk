/*
 * PA Engine API
 *
 * Allow clients to fetch PA Engine Analytics through APIs.
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
using FactSet.SDK.PAEngine.Client;
using FactSet.SDK.PAEngine.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.PAEngine.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IComponentsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get PA component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a PA component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <returns>PAComponent</returns>
        PAComponent GetPAComponentById(string id);

        /// <summary>
        /// Get PA component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a PA component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <returns>ApiResponse of PAComponent</returns>
        ApiResponse<PAComponent> GetPAComponentByIdWithHttpInfo(string id);
        /// <summary>
        /// Get PA components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of PA components in a given PA document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>Dictionary<string, ComponentSummary></returns>
        Dictionary<string, ComponentSummary> GetPAComponents(string document);

        /// <summary>
        /// Get PA components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of PA components in a given PA document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>ApiResponse of Dictionary<string, ComponentSummary></returns>
        ApiResponse<Dictionary<string, ComponentSummary>> GetPAComponentsWithHttpInfo(string document);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IComponentsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get PA component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a PA component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PAComponent</returns>
        System.Threading.Tasks.Task<PAComponent> GetPAComponentByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get PA component by id
        /// </summary>
        /// <remarks>
        /// This endpoint returns the default settings of a PA component.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PAComponent)</returns>
        System.Threading.Tasks.Task<ApiResponse<PAComponent>> GetPAComponentByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get PA components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of PA components in a given PA document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Dictionary&lt;string, ComponentSummary&gt;</returns>
        System.Threading.Tasks.Task<Dictionary<string, ComponentSummary>> GetPAComponentsAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get PA components
        /// </summary>
        /// <remarks>
        /// This endpoint returns the list of PA components in a given PA document.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Dictionary<string, ComponentSummary>)</returns>
        System.Threading.Tasks.Task<ApiResponse<Dictionary<string, ComponentSummary>>> GetPAComponentsWithHttpInfoAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
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
        private FactSet.SDK.PAEngine.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetPAComponentByIdResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(PAComponent) },
        };

        private static readonly Dictionary<HttpStatusCode, System.Type> GetPAComponentsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
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
            this.Configuration = FactSet.SDK.PAEngine.Client.Configuration.MergeConfigurations(
                FactSet.SDK.PAEngine.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.PAEngine.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.PAEngine.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.PAEngine.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.PAEngine.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ComponentsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ComponentsApi(FactSet.SDK.PAEngine.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.PAEngine.Client.Configuration.MergeConfigurations(
                FactSet.SDK.PAEngine.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.PAEngine.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.PAEngine.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.PAEngine.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ComponentsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ComponentsApi(FactSet.SDK.PAEngine.Client.ISynchronousClient client, FactSet.SDK.PAEngine.Client.IAsynchronousClient asyncClient, FactSet.SDK.PAEngine.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.PAEngine.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.PAEngine.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.PAEngine.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.PAEngine.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.PAEngine.Client.ExceptionFactory ExceptionFactory
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
        /// Get PA component by id This endpoint returns the default settings of a PA component.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <returns>PAComponent</returns>
        public PAComponent GetPAComponentById(string id)
        {
            var localVarResponse = GetPAComponentByIdWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get PA component by id This endpoint returns the default settings of a PA component.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <returns>ApiResponse of PAComponent</returns>
        public ApiResponse<PAComponent> GetPAComponentByIdWithHttpInfo(string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.PAEngine.Client.ApiException(400, "Missing required parameter 'id' when calling ComponentsApi->GetPAComponentById");
            }

            FactSet.SDK.PAEngine.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PAEngine.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.PAEngine.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PAEngine.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetPAComponentByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            PAComponent>("/analytics/lookups/v2/engines/pa/components/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPAComponentById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get PA component by id This endpoint returns the default settings of a PA component.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of PAComponent</returns>
        public async System.Threading.Tasks.Task<PAComponent>GetPAComponentByIdAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPAComponentByIdWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get PA component by id This endpoint returns the default settings of a PA component.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Unique identifier for a PA component</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (PAComponent)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<PAComponent>> GetPAComponentByIdWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.PAEngine.Client.ApiException(400, "Missing required parameter 'id' when calling ComponentsApi->GetPAComponentById");
            }


            FactSet.SDK.PAEngine.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PAEngine.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.PAEngine.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PAEngine.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetPAComponentByIdResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<PAComponent>("/analytics/lookups/v2/engines/pa/components/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPAComponentById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get PA components This endpoint returns the list of PA components in a given PA document.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>Dictionary<string, ComponentSummary></returns>
        public Dictionary<string, ComponentSummary> GetPAComponents(string document)
        {
            var localVarResponse = GetPAComponentsWithHttpInfo(document);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get PA components This endpoint returns the list of PA components in a given PA document.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <returns>ApiResponse of Dictionary&lt;string, ComponentSummary&gt;</returns>
        public ApiResponse<Dictionary<string, ComponentSummary>> GetPAComponentsWithHttpInfo(string document)
        {
            // verify the required parameter 'document' is set
            if (document == null)
            {
                throw new FactSet.SDK.PAEngine.Client.ApiException(400, "Missing required parameter 'document' when calling ComponentsApi->GetPAComponents");
            }

            FactSet.SDK.PAEngine.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PAEngine.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.PAEngine.Client.ClientUtils.ParameterToMultiMap("", "document", document));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PAEngine.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetPAComponentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            Dictionary<string, ComponentSummary>>("/analytics/lookups/v2/engines/pa/components", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPAComponents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get PA components This endpoint returns the list of PA components in a given PA document.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Dictionary&lt;string, ComponentSummary&gt;</returns>
        public async System.Threading.Tasks.Task<Dictionary<string, ComponentSummary>>GetPAComponentsAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPAComponentsWithHttpInfoAsync(document, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get PA components This endpoint returns the list of PA components in a given PA document.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="document">Document Name</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, ComponentSummary&gt;)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Dictionary<string, ComponentSummary>>> GetPAComponentsWithHttpInfoAsync(string document, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'document' is set
            if (document == null)
            {
                throw new FactSet.SDK.PAEngine.Client.ApiException(400, "Missing required parameter 'document' when calling ComponentsApi->GetPAComponents");
            }


            FactSet.SDK.PAEngine.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PAEngine.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PAEngine.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.PAEngine.Client.ClientUtils.ParameterToMultiMap("", "document", document));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PAEngine.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetPAComponentsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Dictionary<string, ComponentSummary>>("/analytics/lookups/v2/engines/pa/components", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPAComponents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
