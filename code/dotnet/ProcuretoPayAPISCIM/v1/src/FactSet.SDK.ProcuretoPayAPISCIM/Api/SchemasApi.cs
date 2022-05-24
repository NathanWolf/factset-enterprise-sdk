/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.ProcuretoPayAPISCIM.Client;
using FactSet.SDK.ProcuretoPayAPISCIM.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISchemasApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get a list of schemas.
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <returns>SchemaList</returns>
        SchemaList SchemasGet(int? startIndex = default(int?), int? count = default(int?));

        /// <summary>
        /// Get a list of schemas.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <returns>ApiResponse of SchemaList</returns>
        ApiResponse<SchemaList> SchemasGetWithHttpInfo(int? startIndex = default(int?), int? count = default(int?));
        /// <summary>
        /// Get a schema.
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <returns>Schema</returns>
        Schema SchemasIdGet(string id);

        /// <summary>
        /// Get a schema.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <returns>ApiResponse of Schema</returns>
        ApiResponse<Schema> SchemasIdGetWithHttpInfo(string id);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISchemasApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get a list of schemas.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SchemaList</returns>
        System.Threading.Tasks.Task<SchemaList> SchemasGetAsync(int? startIndex = default(int?), int? count = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get a list of schemas.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SchemaList)</returns>
        System.Threading.Tasks.Task<ApiResponse<SchemaList>> SchemasGetWithHttpInfoAsync(int? startIndex = default(int?), int? count = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get a schema.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Schema</returns>
        System.Threading.Tasks.Task<Schema> SchemasIdGetAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get a schema.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Schema)</returns>
        System.Threading.Tasks.Task<ApiResponse<Schema>> SchemasIdGetWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ISchemasApi : ISchemasApiSync, ISchemasApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class SchemasApi : ISchemasApi
    {
        private FactSet.SDK.ProcuretoPayAPISCIM.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> SchemasGetResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(SchemaList) },
            { (HttpStatusCode)401, typeof(Error) },
            { (HttpStatusCode)403, typeof(Error) },
            { (HttpStatusCode)500, typeof(Error) },
        };
        private static readonly Dictionary<HttpStatusCode, System.Type> SchemasIdGetResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(Schema) },
            { (HttpStatusCode)401, typeof(Error) },
            { (HttpStatusCode)404, typeof(Error) },
            { (HttpStatusCode)500, typeof(Error) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="SchemasApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SchemasApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SchemasApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SchemasApi(string basePath)
        {
            this.Configuration = FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration.MergeConfigurations(
                FactSet.SDK.ProcuretoPayAPISCIM.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SchemasApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public SchemasApi(FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration.MergeConfigurations(
                FactSet.SDK.ProcuretoPayAPISCIM.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="SchemasApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public SchemasApi(FactSet.SDK.ProcuretoPayAPISCIM.Client.ISynchronousClient client, FactSet.SDK.ProcuretoPayAPISCIM.Client.IAsynchronousClient asyncClient, FactSet.SDK.ProcuretoPayAPISCIM.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.ProcuretoPayAPISCIM.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.ProcuretoPayAPISCIM.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.ProcuretoPayAPISCIM.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.ProcuretoPayAPISCIM.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.ProcuretoPayAPISCIM.Client.ExceptionFactory ExceptionFactory
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
        /// Get a list of schemas. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <returns>SchemaList</returns>
        public SchemaList SchemasGet(int? startIndex = default(int?), int? count = default(int?))
        {
            var localVarResponse = SchemasGetWithHttpInfo(startIndex, count);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a list of schemas. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <returns>ApiResponse of SchemaList</returns>
        public ApiResponse<SchemaList> SchemasGetWithHttpInfo(int? startIndex = default(int?), int? count = default(int?))
        {
            FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/scim+json"
            };

            var localVarContentType = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (startIndex != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.ParameterToMultiMap("", "startIndex", startIndex));
            }
            if (count != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.ParameterToMultiMap("", "count", count));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = SchemasGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            SchemaList>("/Schemas", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SchemasGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get a list of schemas. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of SchemaList</returns>
        public async System.Threading.Tasks.Task<SchemaList>SchemasGetAsync(int? startIndex = default(int?), int? count = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await SchemasGetWithHttpInfoAsync(startIndex, count, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a list of schemas. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="startIndex">Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)</param>
        /// <param name="count">Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (SchemaList)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<SchemaList>> SchemasGetWithHttpInfoAsync(int? startIndex = default(int?), int? count = default(int?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/scim+json"
            };

            var localVarContentType = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (startIndex != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.ParameterToMultiMap("", "startIndex", startIndex));
            }
            if (count != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.ParameterToMultiMap("", "count", count));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = SchemasGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<SchemaList>("/Schemas", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SchemasGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get a schema. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <returns>Schema</returns>
        public Schema SchemasIdGet(string id)
        {
            var localVarResponse = SchemasIdGetWithHttpInfo(id);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a schema. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <returns>ApiResponse of Schema</returns>
        public ApiResponse<Schema> SchemasIdGetWithHttpInfo(string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException(400, "Missing required parameter 'id' when calling SchemasApi->SchemasIdGet");
            }

            FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/scim+json"
            };

            var localVarContentType = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = SchemasIdGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            Schema>("/Schemas/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SchemasIdGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get a schema. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Schema</returns>
        public async System.Threading.Tasks.Task<Schema>SchemasIdGetAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await SchemasIdGetWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a schema. 
        /// </summary>
        /// <exception cref="FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of resource.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Schema)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<Schema>> SchemasIdGetWithHttpInfoAsync(string id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.ProcuretoPayAPISCIM.Client.ApiException(400, "Missing required parameter 'id' when calling SchemasApi->SchemasIdGet");
            }


            FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.ProcuretoPayAPISCIM.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/scim+json"
            };

            var localVarContentType = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.ProcuretoPayAPISCIM.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = SchemasIdGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Schema>("/Schemas/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SchemasIdGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
