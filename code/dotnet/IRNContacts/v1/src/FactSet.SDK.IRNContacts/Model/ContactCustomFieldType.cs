/*
 * IRN API v1
 *
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNContacts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNContacts.Model
{
    /// <summary>
    /// Defines ContactCustomFieldType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ContactCustomFieldType
    {
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,

        /// <summary>
        /// Enum Text for value: Text
        /// </summary>
        [EnumMember(Value = "Text")]
        Text = 2,

        /// <summary>
        /// Enum Email for value: Email
        /// </summary>
        [EnumMember(Value = "Email")]
        Email = 3,

        /// <summary>
        /// Enum Link for value: Link
        /// </summary>
        [EnumMember(Value = "Link")]
        Link = 4,

        /// <summary>
        /// Enum SingleOptions for value: SingleOptions
        /// </summary>
        [EnumMember(Value = "SingleOptions")]
        SingleOptions = 5,

        /// <summary>
        /// Enum MultiOptions for value: MultiOptions
        /// </summary>
        [EnumMember(Value = "MultiOptions")]
        MultiOptions = 6,

        /// <summary>
        /// Enum Numeric for value: Numeric
        /// </summary>
        [EnumMember(Value = "Numeric")]
        Numeric = 7,

        /// <summary>
        /// Enum Date for value: Date
        /// </summary>
        [EnumMember(Value = "Date")]
        Date = 8

    }

}
