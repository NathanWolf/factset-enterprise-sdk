/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.1.0
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
    /// Used for ADF job types only. Will determine the frequency between the start and end dates.
    /// </summary>
    /// <value>Used for ADF job types only. Will determine the frequency between the start and end dates.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Frequency
    {
        /// <summary>
        /// Enum Daily for value: daily
        /// </summary>
        [EnumMember(Value = "daily")]
        Daily = 1,

        /// <summary>
        /// Enum Monthly for value: monthly
        /// </summary>
        [EnumMember(Value = "monthly")]
        Monthly = 2,

        /// <summary>
        /// Enum Weekly for value: weekly
        /// </summary>
        [EnumMember(Value = "weekly")]
        Weekly = 3

    }

}
