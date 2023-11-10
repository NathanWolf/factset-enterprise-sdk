/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// Selects the Event Category to include in the response.   * **CASH_DIVS** &#x3D; Cash Dividends   * **STOCK_DIST** &#x3D; Stock Distributions   * **SPINOFFS** &#x3D; Spin Offs   * **RIGHTS** &#x3D; Rights Issue   * **SPLITS** &#x3D; Splits   * **ALL** &#x3D; Returns all Event Types. If left blank the service will default to ALL. 
    /// </summary>
    /// <value>Selects the Event Category to include in the response.   * **CASH_DIVS** &#x3D; Cash Dividends   * **STOCK_DIST** &#x3D; Stock Distributions   * **SPINOFFS** &#x3D; Spin Offs   * **RIGHTS** &#x3D; Rights Issue   * **SPLITS** &#x3D; Splits   * **ALL** &#x3D; Returns all Event Types. If left blank the service will default to ALL. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EventCategory
    {
        /// <summary>
        /// Enum CASHDIVS for value: CASH_DIVS
        /// </summary>
        [EnumMember(Value = "CASH_DIVS")]
        CASHDIVS = 1,

        /// <summary>
        /// Enum STOCKDIST for value: STOCK_DIST
        /// </summary>
        [EnumMember(Value = "STOCK_DIST")]
        STOCKDIST = 2,

        /// <summary>
        /// Enum RIGHTS for value: RIGHTS
        /// </summary>
        [EnumMember(Value = "RIGHTS")]
        RIGHTS = 3,

        /// <summary>
        /// Enum SPINOFFS for value: SPINOFFS
        /// </summary>
        [EnumMember(Value = "SPINOFFS")]
        SPINOFFS = 4,

        /// <summary>
        /// Enum SPLITS for value: SPLITS
        /// </summary>
        [EnumMember(Value = "SPLITS")]
        SPLITS = 5,

        /// <summary>
        /// Enum ALL for value: ALL
        /// </summary>
        [EnumMember(Value = "ALL")]
        ALL = 6

    }

}
