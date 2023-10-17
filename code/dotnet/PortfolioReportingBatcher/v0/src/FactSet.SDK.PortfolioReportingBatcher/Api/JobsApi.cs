/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using FactSet.SDK.PortfolioReportingBatcher.Client;
using FactSet.SDK.PortfolioReportingBatcher.Model;
using FactSet.SDK.Utils.Authentication;

namespace FactSet.SDK.PortfolioReportingBatcher.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IJobsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get details for the given PRB job
        /// </summary>
        /// <remarks>
        /// Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <returns>JobDetailsResponse</returns>
        JobDetailsResponse GetDetailsForJob(JobTypes type, string name, List<string> attribute = default(List<string>));

        /// <summary>
        /// Get details for the given PRB job
        /// </summary>
        /// <remarks>
        /// Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <returns>ApiResponse of JobDetailsResponse</returns>
        ApiResponse<JobDetailsResponse> GetDetailsForJobWithHttpInfo(JobTypes type, string name, List<string> attribute = default(List<string>));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IJobsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get details for the given PRB job
        /// </summary>
        /// <remarks>
        /// Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of JobDetailsResponse</returns>
        System.Threading.Tasks.Task<JobDetailsResponse> GetDetailsForJobAsync(JobTypes type, string name, List<string> attribute = default(List<string>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get details for the given PRB job
        /// </summary>
        /// <remarks>
        /// Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </remarks>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (JobDetailsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<JobDetailsResponse>> GetDetailsForJobWithHttpInfoAsync(JobTypes type, string name, List<string> attribute = default(List<string>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IJobsApi : IJobsApiSync, IJobsApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class JobsApi : IJobsApi
    {
        private FactSet.SDK.PortfolioReportingBatcher.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        # region Response Type Disctionaries
        
        private static readonly Dictionary<HttpStatusCode, System.Type> GetDetailsForJobResponseTypeDictionary = new Dictionary<HttpStatusCode, System.Type>
        {
            { (HttpStatusCode)200, typeof(JobDetailsResponse) },
            { (HttpStatusCode)400, typeof(ClientErrorResponse) },
            { (HttpStatusCode)404, typeof(ClientErrorResponse) },
        };

        # endregion Response Type Disctionaries

        # region Api Response Objects
        

        # endregion Api Response Objects

        /// <summary>
        /// Initializes a new instance of the <see cref="JobsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public JobsApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="JobsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public JobsApi(string basePath)
        {
            this.Configuration = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.MergeConfigurations(
                FactSet.SDK.PortfolioReportingBatcher.Client.GlobalConfiguration.Instance,
                new FactSet.SDK.PortfolioReportingBatcher.Client.Configuration { BasePath = basePath }
            );
            this.Client = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="JobsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public JobsApi(FactSet.SDK.PortfolioReportingBatcher.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.MergeConfigurations(
                FactSet.SDK.PortfolioReportingBatcher.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new FactSet.SDK.PortfolioReportingBatcher.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="JobsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public JobsApi(FactSet.SDK.PortfolioReportingBatcher.Client.ISynchronousClient client, FactSet.SDK.PortfolioReportingBatcher.Client.IAsynchronousClient asyncClient, FactSet.SDK.PortfolioReportingBatcher.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = FactSet.SDK.PortfolioReportingBatcher.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public FactSet.SDK.PortfolioReportingBatcher.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public FactSet.SDK.PortfolioReportingBatcher.Client.ISynchronousClient Client { get; set; }

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
        public FactSet.SDK.PortfolioReportingBatcher.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public FactSet.SDK.PortfolioReportingBatcher.Client.ExceptionFactory ExceptionFactory
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
        /// Get details for the given PRB job Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <returns>JobDetailsResponse</returns>
        public JobDetailsResponse GetDetailsForJob(JobTypes type, string name, List<string> attribute = default(List<string>))
        {
            var localVarResponse = GetDetailsForJobWithHttpInfo(type, name, attribute);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get details for the given PRB job Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <returns>ApiResponse of JobDetailsResponse</returns>
        public ApiResponse<JobDetailsResponse> GetDetailsForJobWithHttpInfo(JobTypes type, string name, List<string> attribute = default(List<string>))
        {
            // verify the required parameter 'name' is set
            if (name == null)
            {
                throw new FactSet.SDK.PortfolioReportingBatcher.Client.ApiException(400, "Missing required parameter 'name' when calling JobsApi->GetDetailsForJob");
            }

            FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("type", FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToString(type)); // path parameter
            localVarRequestOptions.PathParameters.Add("name", FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToString(name)); // path parameter
            if (attribute != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToMultiMap("csv", "attribute", attribute));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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

            localVarRequestOptions.ResponseTypeDictionary = GetDetailsForJobResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = this.Client.Get<
            JobDetailsResponse>("/jobs/{type}/{name}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDetailsForJob", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }
            return localVarResponse;
        }

        /// <summary>
        /// Get details for the given PRB job Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of JobDetailsResponse</returns>
        public async System.Threading.Tasks.Task<JobDetailsResponse>GetDetailsForJobAsync(JobTypes type, string name, List<string> attribute = default(List<string>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            var localVarResponse = await GetDetailsForJobWithHttpInfoAsync(type, name, attribute, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get details for the given PRB job Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.
        /// </summary>
        /// <exception cref="FactSet.SDK.PortfolioReportingBatcher.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="type">The jobs type</param>
        /// <param name="name">The jobs name</param>
        /// <param name="attribute">The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (JobDetailsResponse)</returns>

        public async System.Threading.Tasks.Task<ApiResponse<JobDetailsResponse>> GetDetailsForJobWithHttpInfoAsync(JobTypes type, string name, List<string> attribute = default(List<string>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'name' is set
            if (name == null)
            {
                throw new FactSet.SDK.PortfolioReportingBatcher.Client.ApiException(400, "Missing required parameter 'name' when calling JobsApi->GetDetailsForJob");
            }


            FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions localVarRequestOptions = new FactSet.SDK.PortfolioReportingBatcher.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("type", FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToString(type)); // path parameter
            localVarRequestOptions.PathParameters.Add("name", FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToString(name)); // path parameter
            if (attribute != null)
            {
                localVarRequestOptions.QueryParameters.Add(FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.ParameterToMultiMap("csv", "attribute", attribute));
            }

            // authentication (FactSetApiKey) required
            // http basic authentication required
            if (!string.IsNullOrEmpty(this.Configuration.Username) || !string.IsNullOrEmpty(this.Configuration.Password) && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization"))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + FactSet.SDK.PortfolioReportingBatcher.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
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


            localVarRequestOptions.ResponseTypeDictionary = GetDetailsForJobResponseTypeDictionary;

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<JobDetailsResponse>("/jobs/{type}/{name}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetDetailsForJob", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
