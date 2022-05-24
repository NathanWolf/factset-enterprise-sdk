/*
 * Axioma Equity API
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
using FactSet.SDK.AxiomaEquityOptimizer.Client;
using FactSet.SDK.AxiomaEquityOptimizer.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.AxiomaEquityOptimizer.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICurrenciesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get currencies
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the currencies that can be applied to any calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>CurrencyRoot</returns>
        CurrencyRoot GetCurrencies();

        /// <summary>
        /// Get currencies
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the currencies that can be applied to any calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of CurrencyRoot</returns>
        ApiResponse<CurrencyRoot> GetCurrenciesWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICurrenciesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get currencies
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the currencies that can be applied to any calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CurrencyRoot</returns>
        System.Threading.Tasks.Task<CurrencyRoot> GetCurrenciesAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get currencies
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the currencies that can be applied to any calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CurrencyRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<CurrencyRoot>> GetCurrenciesWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICurrenciesApi : ICurrenciesApiSync, ICurrenciesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CurrenciesApi : ICurrenciesApi
    {
        private FactSet.SDK.AxiomaEquityOptimizer.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetCurrenciesResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(CurrencyRoot) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="CurrenciesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CurrenciesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CurrenciesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CurrenciesApi(string basePath)
        {
            this.Configuration = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.AxiomaEquityOptimizer.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CurrenciesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CurrenciesApi(FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.MergeConfigurations(
                FactSet.SDK.AxiomaEquityOptimizer.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.AxiomaEquityOptimizer.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CurrenciesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public CurrenciesApi(FactSet.SDK.AxiomaEquityOptimizer.Client.ISynchronousClient client, FactSet.SDK.AxiomaEquityOptimizer.Client.IAsynchronousClient asyncClient, FactSet.SDK.AxiomaEquityOptimizer.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.AxiomaEquityOptimizer.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.AxiomaEquityOptimizer.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.AxiomaEquityOptimizer.Client.ExceptionFactory ExceptionFactory
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
        /// Get currencies This endpoint lists all the currencies that can be applied to any calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>CurrencyRoot</returns>
        public CurrencyRoot GetCurrencies()
        {
            var localVarResponse = GetCurrenciesWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get currencies This endpoint lists all the currencies that can be applied to any calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of CurrencyRoot</returns>
        public ApiResponse<CurrencyRoot> GetCurrenciesWithHttpInfo()
        {
            FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetCurrenciesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            CurrencyRoot>("/analytics/lookups/v3/currencies", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetCurrencies", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get currencies This endpoint lists all the currencies that can be applied to any calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of CurrencyRoot</returns>
        public async System.Threading.Tasks.Task<CurrencyRoot>GetCurrenciesAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetCurrenciesWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get currencies This endpoint lists all the currencies that can be applied to any calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.AxiomaEquityOptimizer.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (CurrencyRoot)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<CurrencyRoot>> GetCurrenciesWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.AxiomaEquityOptimizer.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.AxiomaEquityOptimizer.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetCurrenciesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<CurrencyRoot>("/analytics/lookups/v3/currencies", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetCurrencies", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
