/*
 * FactSet Options API
 *
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetOptions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetOptions.Model
{
    /// <summary>
    /// Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods.
    /// </summary>
    /// <value>Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Calendar
    {
        /// <summary>
        /// Enum FIVEDAY for value: FIVEDAY
        /// </summary>
        [EnumMember(Value = "FIVEDAY")]
        FIVEDAY = 1,

        /// <summary>
        /// Enum SEVENDAY for value: SEVENDAY
        /// </summary>
        [EnumMember(Value = "SEVENDAY")]
        SEVENDAY = 2,

        /// <summary>
        /// Enum LOCAL for value: LOCAL
        /// </summary>
        [EnumMember(Value = "LOCAL")]
        LOCAL = 3

    }

}
