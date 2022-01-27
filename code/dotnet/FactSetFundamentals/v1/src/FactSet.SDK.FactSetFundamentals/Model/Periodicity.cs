/*
 * FactSet Fundamentals API
 *
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFundamentals.Model
{
    /// <summary>
    /// Periodicity or frequency of the fiscal periods, where   * **ANN** &#x3D; Annual Original,   * **ANN_R** &#x3D; Annual Latest - *Includes Restatements*,   * **QTR** &#x3D; Quarterly,   * **QTR_R** &#x3D; Quarterly Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **LTM** &#x3D; Last Twelve Months,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and   * **YTD** &#x3D; Year-to-date 
    /// </summary>
    /// <value>Periodicity or frequency of the fiscal periods, where   * **ANN** &#x3D; Annual Original,   * **ANN_R** &#x3D; Annual Latest - *Includes Restatements*,   * **QTR** &#x3D; Quarterly,   * **QTR_R** &#x3D; Quarterly Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **LTM** &#x3D; Last Twelve Months,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and   * **YTD** &#x3D; Year-to-date </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Periodicity
    {
        /// <summary>
        /// Enum ANN for value: ANN
        /// </summary>
        [EnumMember(Value = "ANN")]
        ANN = 1,

        /// <summary>
        /// Enum ANNR for value: ANN_R
        /// </summary>
        [EnumMember(Value = "ANN_R")]
        ANNR = 2,

        /// <summary>
        /// Enum QTR for value: QTR
        /// </summary>
        [EnumMember(Value = "QTR")]
        QTR = 3,

        /// <summary>
        /// Enum QTRR for value: QTR_R
        /// </summary>
        [EnumMember(Value = "QTR_R")]
        QTRR = 4,

        /// <summary>
        /// Enum SEMI for value: SEMI
        /// </summary>
        [EnumMember(Value = "SEMI")]
        SEMI = 5,

        /// <summary>
        /// Enum LTM for value: LTM
        /// </summary>
        [EnumMember(Value = "LTM")]
        LTM = 6,

        /// <summary>
        /// Enum LTMSG for value: LTMSG
        /// </summary>
        [EnumMember(Value = "LTMSG")]
        LTMSG = 7,

        /// <summary>
        /// Enum YTD for value: YTD
        /// </summary>
        [EnumMember(Value = "YTD")]
        YTD = 8

    }

}
