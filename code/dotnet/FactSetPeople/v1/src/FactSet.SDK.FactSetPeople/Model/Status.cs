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
    /// Select only Jobs with a certain status primary, active, or inactive.
    /// </summary>
    /// <value>Select only Jobs with a certain status primary, active, or inactive.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Status
    {
        /// <summary>
        /// Enum ALL for value: ALL
        /// </summary>
        [EnumMember(Value = "ALL")]
        ALL = 1,

        /// <summary>
        /// Enum PRIMARY for value: PRIMARY
        /// </summary>
        [EnumMember(Value = "PRIMARY")]
        PRIMARY = 2,

        /// <summary>
        /// Enum ACTIVE for value: ACTIVE
        /// </summary>
        [EnumMember(Value = "ACTIVE")]
        ACTIVE = 3,

        /// <summary>
        /// Enum INACTIVE for value: INACTIVE
        /// </summary>
        [EnumMember(Value = "INACTIVE")]
        INACTIVE = 4

    }

}
