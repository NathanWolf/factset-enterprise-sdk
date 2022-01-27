/*
 * FactSet Symbology API
 *
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.Symbology.Client;
using FactSet.SDK.Symbology.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.Symbology.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBloombergFIGIApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <returns>BloombergTranslationResponse</returns>
        BloombergTranslationResponse BatchTranslateBloomberg(BloombergTranslationRequest bloombergTranslationRequest);

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <returns>ApiResponse of BloombergTranslationResponse</returns>
        ApiResponse<BloombergTranslationResponse> BatchTranslateBloombergWithHttpInfo(BloombergTranslationRequest bloombergTranslationRequest);
        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <returns>BloombergTranslationResponse</returns>
        BloombergTranslationResponse TranslateBloomberg(List<string> ids);

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <returns>ApiResponse of BloombergTranslationResponse</returns>
        ApiResponse<BloombergTranslationResponse> TranslateBloombergWithHttpInfo(List<string> ids);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBloombergFIGIApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BloombergTranslationResponse</returns>
        System.Threading.Tasks.Task<BloombergTranslationResponse> BatchTranslateBloombergAsync(BloombergTranslationRequest bloombergTranslationRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BloombergTranslationResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<BloombergTranslationResponse>> BatchTranslateBloombergWithHttpInfoAsync(BloombergTranslationRequest bloombergTranslationRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BloombergTranslationResponse</returns>
        System.Threading.Tasks.Task<BloombergTranslationResponse> TranslateBloombergAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers.
        /// </summary>
        /// <remarks>
        /// Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </remarks>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BloombergTranslationResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<BloombergTranslationResponse>> TranslateBloombergWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IBloombergFIGIApi : IBloombergFIGIApiSync, IBloombergFIGIApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class BloombergFIGIApi : IBloombergFIGIApi
    {
        private FactSet.SDK.Symbology.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="BloombergFIGIApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BloombergFIGIApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BloombergFIGIApi"/> class.
        /// </summary>
        /// <returns></returns>
        public BloombergFIGIApi(string basePath)
        {
            this.Configuration = FactSet.SDK.Symbology.Client.Configuration.MergeConfigurations(
                FactSet.SDK.Symbology.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.Symbology.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.Symbology.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.Symbology.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.Symbology.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BloombergFIGIApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public BloombergFIGIApi(FactSet.SDK.Symbology.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.Symbology.Client.Configuration.MergeConfigurations(
                FactSet.SDK.Symbology.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.Symbology.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.Symbology.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.Symbology.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BloombergFIGIApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public BloombergFIGIApi(FactSet.SDK.Symbology.Client.ISynchronousClient client, FactSet.SDK.Symbology.Client.IAsynchronousClient asyncClient, FactSet.SDK.Symbology.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.Symbology.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.Symbology.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.Symbology.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.Symbology.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.Symbology.Client.ExceptionFactory ExceptionFactory
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
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <returns>BloombergTranslationResponse</returns>
        public BloombergTranslationResponse BatchTranslateBloomberg(BloombergTranslationRequest bloombergTranslationRequest)
        {
            FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse> localVarResponse = BatchTranslateBloombergWithHttpInfo(bloombergTranslationRequest);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <returns>ApiResponse of BloombergTranslationResponse</returns>
        public FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse> BatchTranslateBloombergWithHttpInfo(BloombergTranslationRequest bloombergTranslationRequest)
        {
            // verify the required parameter 'bloombergTranslationRequest' is set
            if (bloombergTranslationRequest == null)
                throw new FactSet.SDK.Symbology.Client.ApiException(400, "Missing required parameter 'bloombergTranslationRequest' when calling BloombergFIGIApi->BatchTranslateBloomberg");

            FactSet.SDK.Symbology.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Symbology.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = bloombergTranslationRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Symbology.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Post<BloombergTranslationResponse>("/symbology/v2/bloomberg", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("BatchTranslateBloomberg", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BloombergTranslationResponse</returns>
        public async System.Threading.Tasks.Task<BloombergTranslationResponse> BatchTranslateBloombergAsync(BloombergTranslationRequest bloombergTranslationRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse> localVarResponse = await BatchTranslateBloombergWithHttpInfoAsync(bloombergTranslationRequest, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, and regional identifiers from Bloomberg. &lt;p&gt;This method is best for requesting **large universes** of &#x60;ids&#x60;.&lt;/p&gt;&lt;p&gt;**This endpoint is included with all other Content API packages.**&lt;/p&gt;
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="bloombergTranslationRequest">Request Body for Bloomberg FIGIs.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BloombergTranslationResponse)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse>> BatchTranslateBloombergWithHttpInfoAsync(BloombergTranslationRequest bloombergTranslationRequest, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'bloombergTranslationRequest' is set
            if (bloombergTranslationRequest == null)
                throw new FactSet.SDK.Symbology.Client.ApiException(400, "Missing required parameter 'bloombergTranslationRequest' when calling BloombergFIGIApi->BatchTranslateBloomberg");


            FactSet.SDK.Symbology.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Symbology.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.Data = bloombergTranslationRequest;

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Symbology.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.PostAsync<BloombergTranslationResponse>("/symbology/v2/bloomberg", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("BatchTranslateBloomberg", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <returns>BloombergTranslationResponse</returns>
        public BloombergTranslationResponse TranslateBloomberg(List<string> ids)
        {
            FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse> localVarResponse = TranslateBloombergWithHttpInfo(ids);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <returns>ApiResponse of BloombergTranslationResponse</returns>
        public FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse> TranslateBloombergWithHttpInfo(List<string> ids)
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new FactSet.SDK.Symbology.Client.ApiException(400, "Missing required parameter 'ids' when calling BloombergFIGIApi->TranslateBloomberg");

            FactSet.SDK.Symbology.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Symbology.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Symbology.Client.ClientUtils.ParameterToMultiMap("csv", "ids", ids));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Symbology.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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
            var localVarResponse = this.Client.Get<BloombergTranslationResponse>("/symbology/v2/bloomberg", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("TranslateBloomberg", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of BloombergTranslationResponse</returns>
        public async System.Threading.Tasks.Task<BloombergTranslationResponse> TranslateBloombergAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse> localVarResponse = await TranslateBloombergWithHttpInfoAsync(ids, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Translate market security symbols into Bloomberg Identifiers. Returns the current security, composite, regional Bloomberg (FIGI) unique identifiers.
        /// </summary>
        /// <exception cref="FactSet.SDK.Symbology.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="ids">Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (BloombergTranslationResponse)</returns>
        public async System.Threading.Tasks.Task<FactSet.SDK.Symbology.Client.ApiResponse<BloombergTranslationResponse>> TranslateBloombergWithHttpInfoAsync(List<string> ids, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'ids' is set
            if (ids == null)
                throw new FactSet.SDK.Symbology.Client.ApiException(400, "Missing required parameter 'ids' when calling BloombergFIGIApi->TranslateBloomberg");


            FactSet.SDK.Symbology.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.Symbology.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };


            var localVarContentType = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = FactSet.SDK.Symbology.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.Symbology.Client.ClientUtils.ParameterToMultiMap("csv", "ids", ids));

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.Symbology.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            var localVarResponse = await this.AsynchronousClient.GetAsync<BloombergTranslationResponse>("/symbology/v2/bloomberg", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("TranslateBloomberg", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
