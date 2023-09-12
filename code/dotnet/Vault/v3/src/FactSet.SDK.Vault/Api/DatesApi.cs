/*
 * Vault API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
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
    public interface IDatesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Convert Vault dates to absolute format
        /// </summary>
        /// <remarks>
        /// This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <returns>DateParametersSummaryRoot</returns>
        DateParametersSummaryRoot ConvertVaultDatesToAbsoluteFormat(string enddate, string componentid, string account, string startdate = default(string));

        /// <summary>
        /// Convert Vault dates to absolute format
        /// </summary>
        /// <remarks>
        /// This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <returns>ApiResponse of DateParametersSummaryRoot</returns>
        ApiResponse<DateParametersSummaryRoot> ConvertVaultDatesToAbsoluteFormatWithHttpInfo(string enddate, string componentid, string account, string startdate = default(string));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDatesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Convert Vault dates to absolute format
        /// </summary>
        /// <remarks>
        /// This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DateParametersSummaryRoot</returns>
        System.Threading.Tasks.Task<DateParametersSummaryRoot> ConvertVaultDatesToAbsoluteFormatAsync(string enddate, string componentid, string account, string startdate = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Convert Vault dates to absolute format
        /// </summary>
        /// <remarks>
        /// This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DateParametersSummaryRoot)</returns>
        System.Threading.Tasks.Task<ApiResponse<DateParametersSummaryRoot>> ConvertVaultDatesToAbsoluteFormatWithHttpInfoAsync(string enddate, string componentid, string account, string startdate = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDatesApi : IDatesApiSync, IDatesApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DatesApi : IDatesApi
    {
        private FactSet.SDK.Vault.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> ConvertVaultDatesToAbsoluteFormatResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(DateParametersSummaryRoot) },
            { (HttpStatusCode)400, typeof(ClientErrorResponse) },
            { (HttpStatusCode)404, typeof(ClientErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="DatesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DatesApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DatesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DatesApi(string basePath)
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
        /// Initializes a new instance of the <see cref="DatesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DatesApi(FactSet.SDK.Vault.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="DatesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DatesApi(FactSet.SDK.Vault.Client.ISynchronousClient client, FactSet.SDK.Vault.Client.IAsynchronousClient asyncClient, FactSet.SDK.Vault.Client.IReadableConfiguration configuration)
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
        /// Convert Vault dates to absolute format This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <returns>DateParametersSummaryRoot</returns>
        public DateParametersSummaryRoot ConvertVaultDatesToAbsoluteFormat(string enddate, string componentid, string account, string startdate = default(string))
        {
            var localVarResponse = ConvertVaultDatesToAbsoluteFormatWithHttpInfo(enddate, componentid, account, startdate);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Convert Vault dates to absolute format This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <returns>ApiResponse of DateParametersSummaryRoot</returns>
        public ApiResponse<DateParametersSummaryRoot> ConvertVaultDatesToAbsoluteFormatWithHttpInfo(string enddate, string componentid, string account, string startdate = default(string))
        {
            // verify the required parameter 'enddate' is set
            if (enddate == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'enddate' when calling DatesApi->ConvertVaultDatesToAbsoluteFormat");
            }

            // verify the required parameter 'componentid' is set
            if (componentid == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'componentid' when calling DatesApi->ConvertVaultDatesToAbsoluteFormat");
            }

            // verify the required parameter 'account' is set
            if (account == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'account' when calling DatesApi->ConvertVaultDatesToAbsoluteFormat");
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

            if (startdate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "startdate", startdate));
            }
            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "enddate", enddate));
            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "componentid", componentid));
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

            localVarRequestOptions.ResponseTypeDictionary = ConvertVaultDatesToAbsoluteFormatResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            DateParametersSummaryRoot>("/analytics/engines/vault/v3/dates", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ConvertVaultDatesToAbsoluteFormat", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Convert Vault dates to absolute format This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of DateParametersSummaryRoot</returns>
        public async System.Threading.Tasks.Task<DateParametersSummaryRoot>ConvertVaultDatesToAbsoluteFormatAsync(string enddate, string componentid, string account, string startdate = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await ConvertVaultDatesToAbsoluteFormatWithHttpInfoAsync(enddate, componentid, account, startdate, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Convert Vault dates to absolute format This endpoint converts the given start and end dates in FactSet date format to yyyymmdd format for a Vault calculation. For more information on FactSet date format, please refer to the Vault API documentation under the &#39;API Documentation&#39; section in the developer portal.
        /// </summary>
        /// <exception cref="FactSet.SDK.Vault.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="enddate">End Date</param>
        /// <param name="componentid">Vault Component Id</param>
        /// <param name="account">Account</param>
        /// <param name="startdate">Start Date (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (DateParametersSummaryRoot)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<DateParametersSummaryRoot>> ConvertVaultDatesToAbsoluteFormatWithHttpInfoAsync(string enddate, string componentid, string account, string startdate = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'enddate' is set
            if (enddate == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'enddate' when calling DatesApi->ConvertVaultDatesToAbsoluteFormat");
            }

            // verify the required parameter 'componentid' is set
            if (componentid == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'componentid' when calling DatesApi->ConvertVaultDatesToAbsoluteFormat");
            }

            // verify the required parameter 'account' is set
            if (account == null)
            {
                throw new FactSet.SDK.Vault.Client.ApiException(400, "Missing required parameter 'account' when calling DatesApi->ConvertVaultDatesToAbsoluteFormat");
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

            if (startdate != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "startdate", startdate));
            }
            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "enddate", enddate));
            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Vault.Client.ClientUtils.ParameterToMultiMap("", "componentid", componentid));
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


            localVarRequestOptions.ResponseTypeDictionary = ConvertVaultDatesToAbsoluteFormatResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<DateParametersSummaryRoot>("/analytics/engines/vault/v3/dates", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ConvertVaultDatesToAbsoluteFormat", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
