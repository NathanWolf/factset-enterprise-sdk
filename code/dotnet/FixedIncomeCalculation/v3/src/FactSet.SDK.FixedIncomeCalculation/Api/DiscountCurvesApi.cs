/*
 * FI API
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
using FactSet.SDK.FixedIncomeCalculation.Client;
using FactSet.SDK.FixedIncomeCalculation.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FixedIncomeCalculation.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDiscountCurvesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get Discount Curves
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <returns>FIDiscountCurveInfoRoot</returns>
        FIDiscountCurveInfoRoot GetAllFIDiscountCurves(string currency = default(string));

        /// <summary>
        /// Get Discount Curves
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <returns>ApiResponse of FIDiscountCurveInfoRoot</returns>
        ApiResponse<FIDiscountCurveInfoRoot> GetAllFIDiscountCurvesWithHttpInfo(string currency = default(string));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDiscountCurvesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get Discount Curves
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of FIDiscountCurveInfoRoot</returns>
        System.Threading.Tasks.Task<FIDiscountCurveInfoRoot> GetAllFIDiscountCurvesAsync(string currency = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get Discount Curves
        /// </summary>
        /// <remarks>
        /// This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </remarks>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (FIDiscountCurveInfoRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<FIDiscountCurveInfoRoot>> GetAllFIDiscountCurvesWithHttpInfoAsync(string currency = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDiscountCurvesApi : IDiscountCurvesApiSync, IDiscountCurvesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DiscountCurvesApi : IDiscountCurvesApi
    {
        private FactSet.SDK.FixedIncomeCalculation.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> GetAllFIDiscountCurvesResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(FIDiscountCurveInfoRoot) },
            { (HttpStatusCode)404, typeof(ClientErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="DiscountCurvesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DiscountCurvesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DiscountCurvesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DiscountCurvesApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FixedIncomeCalculation.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FixedIncomeCalculation.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FixedIncomeCalculation.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FixedIncomeCalculation.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FixedIncomeCalculation.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FixedIncomeCalculation.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DiscountCurvesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DiscountCurvesApi(FactSet.SDK.FixedIncomeCalculation.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FixedIncomeCalculation.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FixedIncomeCalculation.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FixedIncomeCalculation.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FixedIncomeCalculation.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FixedIncomeCalculation.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DiscountCurvesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DiscountCurvesApi(FactSet.SDK.FixedIncomeCalculation.Client.ISynchronousClient client, FactSet.SDK.FixedIncomeCalculation.Client.IAsynchronousClient asyncClient, FactSet.SDK.FixedIncomeCalculation.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FixedIncomeCalculation.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FixedIncomeCalculation.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FixedIncomeCalculation.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FixedIncomeCalculation.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FixedIncomeCalculation.Client.ExceptionFactory ExceptionFactory
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
        /// Get Discount Curves This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <returns>FIDiscountCurveInfoRoot</returns>
        public FIDiscountCurveInfoRoot GetAllFIDiscountCurves(string currency = default(string))
        {
            var localVarResponse = GetAllFIDiscountCurvesWithHttpInfo(currency);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Discount Curves This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <returns>ApiResponse of FIDiscountCurveInfoRoot</returns>
        public ApiResponse<FIDiscountCurveInfoRoot> GetAllFIDiscountCurvesWithHttpInfo(string currency = default(string))
        {
            FactSet.SDK.FixedIncomeCalculation.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FixedIncomeCalculation.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (currency != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.ParameterToMultiMap("", "currency", currency));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetAllFIDiscountCurvesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            FIDiscountCurveInfoRoot>("/analytics/engines/fi/v3/discount-curves", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllFIDiscountCurves", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get Discount Curves This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of FIDiscountCurveInfoRoot</returns>
        public async System.Threading.Tasks.Task<FIDiscountCurveInfoRoot>GetAllFIDiscountCurvesAsync(string currency = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetAllFIDiscountCurvesWithHttpInfoAsync(currency, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Discount Curves This endpoint lists all the discount curves that can be applied to a FI calculation.
        /// </summary>
        /// <exception cref="FactSet.SDK.FixedIncomeCalculation.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="currency"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (FIDiscountCurveInfoRoot)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<FIDiscountCurveInfoRoot>> GetAllFIDiscountCurvesWithHttpInfoAsync(string currency = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.FixedIncomeCalculation.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FixedIncomeCalculation.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (currency != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.ParameterToMultiMap("", "currency", currency));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FixedIncomeCalculation.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetAllFIDiscountCurvesResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<FIDiscountCurveInfoRoot>("/analytics/engines/fi/v3/discount-curves", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllFIDiscountCurves", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
