/*
 * Global Filings API
 *
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The reference endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;

namespace FactSet.SDK.GlobalFilings.Client
{
    /// <summary>
    /// API Exception
    /// </summary>
    public class ApiException : Exception
    {
        /// <summary>
        /// Gets or sets the error code (HTTP status code)
        /// </summary>
        /// <value>The error code (HTTP status code).</value>
        public int ErrorCode { get; set; }

        /// <summary>
        /// Gets or sets the error content (body json object)
        /// </summary>
        /// <value>The error content (Http response body).</value>
        public object ErrorContent { get; private set; }

        /// <summary>
        /// Gets or sets the HTTP headers
        /// </summary>
        /// <value>HTTP headers</value>
        public Multimap<string, string> Headers { get; private set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        public ApiException() { }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        /// <param name="errorCode">HTTP status code.</param>
        /// <param name="message">Error message.</param>
        public ApiException(int errorCode, string message) : base(message)
        {
            this.ErrorCode = errorCode;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        /// <param name="errorCode">HTTP status code.</param>
        /// <param name="message">Error message.</param>
        /// <param name="errorContent">Error content.</param>
        /// <param name="headers">HTTP Headers.</param>
        public ApiException(int errorCode, string message, object errorContent = null, Multimap<string, string> headers = null) : base(message)
        {
            this.ErrorCode = errorCode;
            this.ErrorContent = errorContent;
            this.Headers = headers;
        }
    }

}
