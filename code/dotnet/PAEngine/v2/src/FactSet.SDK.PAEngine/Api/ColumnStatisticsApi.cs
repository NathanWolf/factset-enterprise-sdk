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
    public interface IColumnStatisticsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get PA column statistics
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the column statistics that can be applied to a PA column.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Dictionary<string, ColumnStatistic></returns>
        Dictionary<string, ColumnStatistic> GetPAColumnStatistics();

        /// <summary>
        /// Get PA column statistics
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the column statistics that can be applied to a PA column.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Dictionary<string, ColumnStatistic></returns>
        ApiResponse<Dictionary<string, ColumnStatistic>> GetPAColumnStatisticsWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IColumnStatisticsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get PA column statistics
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the column statistics that can be applied to a PA column.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Dictionary&lt;string, ColumnStatistic&gt;</returns>
        System.Threading.Tasks.Task<Dictionary<string, ColumnStatistic>> GetPAColumnStatisticsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get PA column statistics
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the column statistics that can be applied to a PA column.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Dictionary<string, ColumnStatistic>)</returns>
        System.Threading.Tasks.Task<ApiResponse<Dictionary<string, ColumnStatistic>>> GetPAColumnStatisticsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IColumnStatisticsApi : IColumnStatisticsApiSync, IColumnStatisticsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ColumnStatisticsApi : IColumnStatisticsApi
    {
        private FactSet.SDK.PAEngine.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetPAColumnStatisticsResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(Dictionary<string, ColumnStatistic>) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="ColumnStatisticsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ColumnStatisticsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ColumnStatisticsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ColumnStatisticsApi(string basePath)
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
        /// Initializes a new instance of the <see cref="ColumnStatisticsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ColumnStatisticsApi(FactSet.SDK.PAEngine.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="ColumnStatisticsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ColumnStatisticsApi(FactSet.SDK.PAEngine.Client.ISynchronousClient client, FactSet.SDK.PAEngine.Client.IAsynchronousClient asyncClient, FactSet.SDK.PAEngine.Client.IReadableConfiguration configuration)
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
        /// Get PA column statistics This endpoint lists all the column statistics that can be applied to a PA column.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Dictionary<string, ColumnStatistic></returns>
        public Dictionary<string, ColumnStatistic> GetPAColumnStatistics()
        {
            var localVarResponse = GetPAColumnStatisticsWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get PA column statistics This endpoint lists all the column statistics that can be applied to a PA column.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of Dictionary&lt;string, ColumnStatistic&gt;</returns>
        public ApiResponse<Dictionary<string, ColumnStatistic>> GetPAColumnStatisticsWithHttpInfo()
        {
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

            localVarRequestOptions.ResponseTypeDictionary = GetPAColumnStatisticsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            Dictionary<string, ColumnStatistic>>("/analytics/lookups/v2/engines/pa/columnstatistics", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPAColumnStatistics", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get PA column statistics This endpoint lists all the column statistics that can be applied to a PA column.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Dictionary&lt;string, ColumnStatistic&gt;</returns>
        public async System.Threading.Tasks.Task<Dictionary<string, ColumnStatistic>>GetPAColumnStatisticsAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetPAColumnStatisticsWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get PA column statistics This endpoint lists all the column statistics that can be applied to a PA column.
        /// </summary>
        /// <exception cref="FactSet.SDK.PAEngine.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, ColumnStatistic&gt;)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Dictionary<string, ColumnStatistic>>> GetPAColumnStatisticsWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

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


            localVarRequestOptions.ResponseTypeDictionary = GetPAColumnStatisticsResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Dictionary<string, ColumnStatistic>>("/analytics/lookups/v2/engines/pa/columnstatistics", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetPAColumnStatistics", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
