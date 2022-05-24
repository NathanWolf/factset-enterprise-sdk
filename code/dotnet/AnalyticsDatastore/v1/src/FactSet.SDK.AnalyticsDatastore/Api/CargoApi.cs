/*
 * Analytics Datastore  API
 *
 * Allow clients to fetch precalculated Analytics through predeterministic URLs.
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
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.AnalyticsDatastore.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICargoApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.
        /// </summary>
        /// <remarks>
        /// STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <returns>List<string></returns>
        List<string> GetCargoEndpoint(string groupId, string objectId);

        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.
        /// </summary>
        /// <remarks>
        /// STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <returns>ApiResponse of List<string></returns>
        ApiResponse<List<string>> GetCargoEndpointWithHttpInfo(string groupId, string objectId);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICargoApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.
        /// </summary>
        /// <remarks>
        /// STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;string&gt;</returns>
        System.Threading.Tasks.Task<List<string>> GetCargoEndpointAsync(string groupId, string objectId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report.
        /// </summary>
        /// <remarks>
        /// STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List<string>)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<string>>> GetCargoEndpointWithHttpInfoAsync(string groupId, string objectId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICargoApi : ICargoApiSync, ICargoApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CargoApi : ICargoApi
    {
        private FactSet.SDK.AnalyticsDatastore.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetCargoEndpointResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(List<string>) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="CargoApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CargoApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CargoApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CargoApi(string basePath)
        {
            this.Configuration = FactSet.SDK.AnalyticsDatastore.Client.Configuration.MergeConfigurations(
                FactSet.SDK.AnalyticsDatastore.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.AnalyticsDatastore.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.AnalyticsDatastore.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.AnalyticsDatastore.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.AnalyticsDatastore.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CargoApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CargoApi(FactSet.SDK.AnalyticsDatastore.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.AnalyticsDatastore.Client.Configuration.MergeConfigurations(
                FactSet.SDK.AnalyticsDatastore.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.AnalyticsDatastore.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.AnalyticsDatastore.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.AnalyticsDatastore.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CargoApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public CargoApi(FactSet.SDK.AnalyticsDatastore.Client.ISynchronousClient client, FactSet.SDK.AnalyticsDatastore.Client.IAsynchronousClient asyncClient, FactSet.SDK.AnalyticsDatastore.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.AnalyticsDatastore.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.AnalyticsDatastore.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.AnalyticsDatastore.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.AnalyticsDatastore.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.AnalyticsDatastore.Client.ExceptionFactory ExceptionFactory
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
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report. STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </summary>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <returns>List<string></returns>
        public List<string> GetCargoEndpoint(string groupId, string objectId)
        {
            var localVarResponse = GetCargoEndpointWithHttpInfo(groupId, objectId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report. STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </summary>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <returns>ApiResponse of List&lt;string&gt;</returns>
        public ApiResponse<List<string>> GetCargoEndpointWithHttpInfo(string groupId, string objectId)
        {
            // verify the required parameter 'groupId' is set
            if (groupId == null)
            {
                throw new FactSet.SDK.AnalyticsDatastore.Client.ApiException(400, "Missing required parameter 'groupId' when calling CargoApi->GetCargoEndpoint");
            }

            // verify the required parameter 'objectId' is set
            if (objectId == null)
            {
                throw new FactSet.SDK.AnalyticsDatastore.Client.ApiException(400, "Missing required parameter 'objectId' when calling CargoApi->GetCargoEndpoint");
            }

            FactSet.SDK.AnalyticsDatastore.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.AnalyticsDatastore.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("groupId", FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.ParameterToString(groupId)); // path parameter
            localVarRequestOptions.PathParameters.Add("objectId", FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.ParameterToString(objectId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetCargoEndpointResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            List<string>>("/analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetCargoEndpoint", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report. STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </summary>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of List&lt;string&gt;</returns>
        public async System.Threading.Tasks.Task<List<string>>GetCargoEndpointAsync(string groupId, string objectId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetCargoEndpointWithHttpInfoAsync(groupId, objectId, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Cargo endpoint, gets an object given an ID. In this case ID retrieved from Swivel Location header, results in json response body of the report. STACH json response documentation: https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \&quot;accept-encoding\&quot;, with allowed values of \&quot;br\&quot; and \&quot;gzip\&quot;. If accept-encoding is passed, the response is compressed.
        /// </summary>
        /// <exception cref="FactSet.SDK.AnalyticsDatastore.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="groupId">The ID of the group</param>
        /// <param name="objectId">The ID of the object</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (List&lt;string&gt;)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<List<string>>> GetCargoEndpointWithHttpInfoAsync(string groupId, string objectId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'groupId' is set
            if (groupId == null)
            {
                throw new FactSet.SDK.AnalyticsDatastore.Client.ApiException(400, "Missing required parameter 'groupId' when calling CargoApi->GetCargoEndpoint");
            }

            // verify the required parameter 'objectId' is set
            if (objectId == null)
            {
                throw new FactSet.SDK.AnalyticsDatastore.Client.ApiException(400, "Missing required parameter 'objectId' when calling CargoApi->GetCargoEndpoint");
            }


            FactSet.SDK.AnalyticsDatastore.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.AnalyticsDatastore.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("groupId", FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.ParameterToString(groupId)); // path parameter
            localVarRequestOptions.PathParameters.Add("objectId", FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.ParameterToString(objectId)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.AnalyticsDatastore.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetCargoEndpointResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<List<string>>("/analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetCargoEndpoint", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
