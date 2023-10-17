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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.PortfolioReportingBatcher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PortfolioReportingBatcher.Model
{
    /// <summary>
    /// The status of the job as per the application
    /// </summary>
    /// <value>The status of the job as per the application</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PrbStatus
    {
        /// <summary>
        /// Enum Failed for value: failed
        /// </summary>
        [EnumMember(Value = "failed")]
        Failed = 1,

        /// <summary>
        /// Enum Pending for value: pending
        /// </summary>
        [EnumMember(Value = "pending")]
        Pending = 2,

        /// <summary>
        /// Enum Running for value: running
        /// </summary>
        [EnumMember(Value = "running")]
        Running = 3,

        /// <summary>
        /// Enum Soft for value: soft
        /// </summary>
        [EnumMember(Value = "soft")]
        Soft = 4,

        /// <summary>
        /// Enum Stopped for value: stopped
        /// </summary>
        [EnumMember(Value = "stopped")]
        Stopped = 5,

        /// <summary>
        /// Enum Success for value: success
        /// </summary>
        [EnumMember(Value = "success")]
        Success = 6,

        /// <summary>
        /// Enum Warning for value: warning
        /// </summary>
        [EnumMember(Value = "warning")]
        Warning = 7

    }

}
