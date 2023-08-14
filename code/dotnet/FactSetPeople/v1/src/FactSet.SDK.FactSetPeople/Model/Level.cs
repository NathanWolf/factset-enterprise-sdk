/*
 * FactSet People API
 *
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.2.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPeople.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPeople.Model
{
    /// <summary>
    /// Select the level of detail only main Jobs or include other Jobs at a company.
    /// </summary>
    /// <value>Select the level of detail only main Jobs or include other Jobs at a company.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Level
    {
        /// <summary>
        /// Enum SUMMARY for value: SUMMARY
        /// </summary>
        [EnumMember(Value = "SUMMARY")]
        SUMMARY = 1,

        /// <summary>
        /// Enum DETAIL for value: DETAIL
        /// </summary>
        [EnumMember(Value = "DETAIL")]
        DETAIL = 2

    }

}
