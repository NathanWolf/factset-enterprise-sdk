/*
 * Exchange Snapshot API
 *
 * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange. Clients that need access to the DFSnapshot product for a custom watchlist snapped at a client specified interval should use this API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Polly;
using RestSharp;

namespace FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Client
{
    /// <summary>
    /// Configuration class to set the polly retry policies to be applied to the requests.
    /// </summary>
    public static class RetryConfiguration
    {
        /// <summary>
        /// Retry policy
        /// </summary>
        public static Policy<IRestResponse> RetryPolicy { get; set; }

        /// <summary>
        /// Async retry policy
        /// </summary>
        public static AsyncPolicy<IRestResponse> AsyncRetryPolicy { get; set; }
    }
}
