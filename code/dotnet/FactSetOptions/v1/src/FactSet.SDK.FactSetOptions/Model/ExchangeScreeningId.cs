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
    /// Controls the Option Universe Screen By Exchange. Screening across all Exchanges is not currently supported. |Exchange ISO|Exchange Name|Option Types Covered|Price Type Used in Greeks| |- --|- --|- --|- --| |ALLUSA_OPTS|U.S. Exchange (Composite) - All Historical Options|Equity, Index|Mid Bid/Ask| |USA_OPTS|U.S. Exchange (Composite) - Latest 1 Year|Equity, Index|Mid Bid/Ask| 
    /// </summary>
    /// <value>Controls the Option Universe Screen By Exchange. Screening across all Exchanges is not currently supported. |Exchange ISO|Exchange Name|Option Types Covered|Price Type Used in Greeks| |- --|- --|- --|- --| |ALLUSA_OPTS|U.S. Exchange (Composite) - All Historical Options|Equity, Index|Mid Bid/Ask| |USA_OPTS|U.S. Exchange (Composite) - Latest 1 Year|Equity, Index|Mid Bid/Ask| </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ExchangeScreeningId
    {
        /// <summary>
        /// Enum ALLUSAOPTS for value: ALLUSA_OPTS
        /// </summary>
        [EnumMember(Value = "ALLUSA_OPTS")]
        ALLUSAOPTS = 1,

        /// <summary>
        /// Enum USAOPTS for value: USA_OPTS
        /// </summary>
        [EnumMember(Value = "USA_OPTS")]
        USAOPTS = 2

    }

}
