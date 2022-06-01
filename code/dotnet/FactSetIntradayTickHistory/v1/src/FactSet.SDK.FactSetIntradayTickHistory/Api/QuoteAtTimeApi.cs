/*
 * Tick History
 *
 *  <p>FactSet’s Tick History provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 19 tick history fields. Asset types integrated include equities, futures, options, fixed income, mutual funds, ETFs, indices, commodities, and FX rates.</p><p>Tick History provides dynamic access to tick data for a specific security intra-day or historically via standard HTTPS protocol. History is available for all quotes and trades for a trailing 6 months or 1-year, respectively. Quotes and trade data for Options is available for 30 days. Tick History data is also available in a separate end-of-day feed.</p>   
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.FactSetIntradayTickHistory.Client;
using FactSet.SDK.FactSetIntradayTickHistory.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.FactSetIntradayTickHistory.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IQuoteAtTimeApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Request returns a quote at the specified time
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <returns>TickhistoryResponse</returns>
        TickhistoryResponse TickHistoryQatGet(string id, string date = default(string), string time = default(string), string format = default(string));

        /// <summary>
        /// Request returns a quote at the specified time
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <returns>ApiResponse of TickhistoryResponse</returns>
        ApiResponse<TickhistoryResponse> TickHistoryQatGetWithHttpInfo(string id, string date = default(string), string time = default(string), string format = default(string));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IQuoteAtTimeApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Request returns a quote at the specified time
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of TickhistoryResponse</returns>
        System.Threading.Tasks.Task<TickhistoryResponse> TickHistoryQatGetAsync(string id, string date = default(string), string time = default(string), string format = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Request returns a quote at the specified time
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (TickhistoryResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<TickhistoryResponse>> TickHistoryQatGetWithHttpInfoAsync(string id, string date = default(string), string time = default(string), string format = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IQuoteAtTimeApi : IQuoteAtTimeApiSync, IQuoteAtTimeApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class QuoteAtTimeApi : IQuoteAtTimeApi
    {
        private FactSet.SDK.FactSetIntradayTickHistory.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
                private static readonly Dictionary<HttpStatusCode, System.Type> TickHistoryQatGetResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(TickhistoryResponse) },
            { (HttpStatusCode)401, typeof(Object) },
            { (HttpStatusCode)403, typeof(Object) },
            { (HttpStatusCode)405, typeof(Object) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
         

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="QuoteAtTimeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public QuoteAtTimeApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="QuoteAtTimeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public QuoteAtTimeApi(string basePath)
        {
            this.Configuration = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetIntradayTickHistory.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="QuoteAtTimeApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public QuoteAtTimeApi(FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.MergeConfigurations(
                FactSet.SDK.FactSetIntradayTickHistory.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="QuoteAtTimeApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public QuoteAtTimeApi(FactSet.SDK.FactSetIntradayTickHistory.Client.ISynchronousClient client, FactSet.SDK.FactSetIntradayTickHistory.Client.IAsynchronousClient asyncClient, FactSet.SDK.FactSetIntradayTickHistory.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.FactSetIntradayTickHistory.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.FactSetIntradayTickHistory.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.FactSetIntradayTickHistory.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.FactSetIntradayTickHistory.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.FactSetIntradayTickHistory.Client.ExceptionFactory ExceptionFactory
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
        /// Request returns a quote at the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <returns>TickhistoryResponse</returns>
        public TickhistoryResponse TickHistoryQatGet(string id, string date = default(string), string time = default(string), string format = default(string))
        {
            var localVarResponse = TickHistoryQatGetWithHttpInfo(id, date, time, format);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Request returns a quote at the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <returns>ApiResponse of TickhistoryResponse</returns>
        public ApiResponse<TickhistoryResponse> TickHistoryQatGetWithHttpInfo(string id, string date = default(string), string time = default(string), string format = default(string))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException(400, "Missing required parameter 'id' when calling QuoteAtTimeApi->TickHistoryQatGet");
            }

            FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "application/xml",
                "text/csv"
            };

            var localVarContentType = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "id", id));
            if (date != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "date", date));
            }
            if (time != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "time", time));
            }
            if (format != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "format", format));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = TickHistoryQatGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            TickhistoryResponse>("/TickHistory/qat", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("TickHistoryQatGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Request returns a quote at the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of TickhistoryResponse</returns>
        public async System.Threading.Tasks.Task<TickhistoryResponse>TickHistoryQatGetAsync(string id, string date = default(string), string time = default(string), string format = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await TickHistoryQatGetWithHttpInfoAsync(id, date, time, format, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Request returns a quote at the specified time 
        /// </summary>
        /// <exception cref="FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Requested symbol or security. The symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. **NOTE**: Only one identifier can be requested per request.&lt;P&gt;**TRY IT OUT** - Choose One from - BABA-USA,WALMEX-MX,7203-TKS,VOD-LON,NPN-JSE,MABAX,NZF,SPY-USA,AGG-USA,GLD-USA,AOR-USA,MNA-USA,UUP-USA,SP50-SPX,ESX-STX,XAO-ASX,WD-MSX,NG00-USA,GC00-USA,CC00-USA,C00-USA,FC00-USA,ER00-USA,EURUSD-FX1,USDMXN-FX1,AUDJPY-FX1,EURCZK-FX1,USDILS-FX1,USDZAR-FX1,US10YY-TU1,FDS#190621C00145000-USA,FDS#190621P00145000-USA</param>
        /// <param name="date">Request should be made in the format **YYYYMMDD**. The initial release only supports requests from completed trading days (optional)</param>
        /// <param name="time">Request should be made in the format **HHMMSSS**.HH- Hour, MM- Minutes, SS- Seconds (optional)</param>
        /// <param name="format">The format of the output file. TRY IT OUT Choose from JSON, CSV, CSV_NO_HEADER (optional, default to XML)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (TickhistoryResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<TickhistoryResponse>> TickHistoryQatGetWithHttpInfoAsync(string id, string date = default(string), string time = default(string), string format = default(string), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new FactSet.SDK.FactSetIntradayTickHistory.Client.ApiException(400, "Missing required parameter 'id' when calling QuoteAtTimeApi->TickHistoryQatGet");
            }


            FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.FactSetIntradayTickHistory.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json",
                "application/xml",
                "text/csv"
            };

            var localVarContentType = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "id", id));
            if (date != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "date", date));
            }
            if (time != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "time", time));
            }
            if (format != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.ParameterToMultiMap("", "format", format));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.FactSetIntradayTickHistory.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = TickHistoryQatGetResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<TickhistoryResponse>("/TickHistory/qat", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("TickHistoryQatGet", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
