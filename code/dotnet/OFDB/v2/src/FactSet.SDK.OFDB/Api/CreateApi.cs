/*
 * OFDB API
 *
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.OFDB.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICreateApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <returns>InlineResponse202</returns>
        InlineResponse202 CreateDatabase(DatabaseSchema databaseSchema = default(DatabaseSchema));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <returns>ApiResponse of InlineResponse202</returns>
        ApiResponse<InlineResponse202> CreateDatabaseWithHttpInfo(DatabaseSchema databaseSchema = default(DatabaseSchema));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICreateApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse202</returns>
        System.Threading.Tasks.Task<InlineResponse202> CreateDatabaseAsync(DatabaseSchema databaseSchema = default(DatabaseSchema), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </remarks>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse202)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse202>> CreateDatabaseWithHttpInfoAsync(DatabaseSchema databaseSchema = default(DatabaseSchema), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICreateApi : ICreateApiSync, ICreateApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CreateApi : ICreateApi
    {
        private FactSet.SDK.OFDB.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> CreateDatabaseResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)202, typeof(InlineResponse202) },
            { (HttpStatusCode)400, typeof(InlineResponse400) },
            { (HttpStatusCode)403, typeof(InlineResponse403) },
            { (HttpStatusCode)404, typeof(InlineResponse403) },
            { (HttpStatusCode)406, typeof(InlineResponse403) },
            { (HttpStatusCode)429, typeof(InlineResponse403) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CreateApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CreateApi(string basePath)
        {
            this.Configuration = FactSet.SDK.OFDB.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OFDB.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.OFDB.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.OFDB.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OFDB.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.OFDB.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CreateApi(FactSet.SDK.OFDB.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.OFDB.Client.Configuration.MergeConfigurations(
                FactSet.SDK.OFDB.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.OFDB.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.OFDB.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.OFDB.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CreateApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public CreateApi(FactSet.SDK.OFDB.Client.ISynchronousClient client, FactSet.SDK.OFDB.Client.IAsynchronousClient asyncClient, FactSet.SDK.OFDB.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.OFDB.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.OFDB.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.OFDB.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.OFDB.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.OFDB.Client.ExceptionFactory ExceptionFactory
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
        ///  Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </summary>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <returns>InlineResponse202</returns>
        public InlineResponse202 CreateDatabase(DatabaseSchema databaseSchema = default(DatabaseSchema))
        {
            var localVarResponse = CreateDatabaseWithHttpInfo(databaseSchema);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </summary>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <returns>ApiResponse of InlineResponse202</returns>
        public ApiResponse<InlineResponse202> CreateDatabaseWithHttpInfo(DatabaseSchema databaseSchema = default(DatabaseSchema))
        {
            FactSet.SDK.OFDB.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OFDB.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.OFDB.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OFDB.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = databaseSchema;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OFDB.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = CreateDatabaseResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Post<
            InlineResponse202>("/database", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateDatabase", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        ///  Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </summary>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of InlineResponse202</returns>
        public async System.Threading.Tasks.Task<InlineResponse202>CreateDatabaseAsync(DatabaseSchema databaseSchema = default(DatabaseSchema), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await CreateDatabaseWithHttpInfoAsync(databaseSchema, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Creates a 2d or 3d database(OFDB). Users will note that not every field requires all the parameters listed in the schema. Please review FactSet data types on the OA for further guidance.
        /// </summary>
        /// <exception cref="FactSet.SDK.OFDB.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="databaseSchema"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (InlineResponse202)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse202>> CreateDatabaseWithHttpInfoAsync(DatabaseSchema databaseSchema = default(DatabaseSchema), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.OFDB.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.OFDB.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.OFDB.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.OFDB.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.Data = databaseSchema;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.OFDB.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = CreateDatabaseResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<InlineResponse202>("/database", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateDatabase", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
