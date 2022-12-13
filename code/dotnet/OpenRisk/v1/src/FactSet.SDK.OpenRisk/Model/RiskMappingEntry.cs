/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// Either risk model covered security resolution or uncovered security reason
    /// </summary>
    [JsonConverter(typeof(RiskMappingEntryJsonConverter))]
    [DataContract(Name = "RiskMappingEntry")]
    public partial class RiskMappingEntry : AbstractOpenAPISchema, IEquatable<RiskMappingEntry>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskMappingEntry" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of MappedSecurityInfo.</param>
        public RiskMappingEntry(MappedSecurityInfo actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="RiskMappingEntry" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RiskExclusionInfo.</param>
        public RiskMappingEntry(RiskExclusionInfo actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value is MappedSecurityInfo)
                {
                    this._actualInstance = value;
                }
                else if (value is RiskExclusionInfo)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: MappedSecurityInfo, RiskExclusionInfo");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `MappedSecurityInfo`. If the actual instance is not `MappedSecurityInfo`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of MappedSecurityInfo</returns>
        public MappedSecurityInfo GetMappedSecurityInfo()
        {
            return (MappedSecurityInfo)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RiskExclusionInfo`. If the actual instance is not `RiskExclusionInfo`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RiskExclusionInfo</returns>
        public RiskExclusionInfo GetRiskExclusionInfo()
        {
            return (RiskExclusionInfo)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RiskMappingEntry {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, RiskMappingEntry.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of RiskMappingEntry
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of RiskMappingEntry</returns>
        public static RiskMappingEntry FromJson(string jsonString)
        {
            RiskMappingEntry newRiskMappingEntry = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newRiskMappingEntry;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                var hasAdditionalProperties = !(typeof(MappedSecurityInfo).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<MappedSecurityInfo>(
                    jsonString,
                    hasAdditionalProperties ? RiskMappingEntry.AdditionalPropertiesSerializerSettings : RiskMappingEntry.SerializerSettings
                );
                newRiskMappingEntry = new RiskMappingEntry(parsedValue);
                matchedTypes.Add("MappedSecurityInfo");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into MappedSecurityInfo: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(RiskExclusionInfo).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<RiskExclusionInfo>(
                    jsonString,
                    hasAdditionalProperties ? RiskMappingEntry.AdditionalPropertiesSerializerSettings : RiskMappingEntry.SerializerSettings
                );
                newRiskMappingEntry = new RiskMappingEntry(parsedValue);
                matchedTypes.Add("RiskExclusionInfo");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RiskExclusionInfo: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newRiskMappingEntry;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as RiskMappingEntry);
        }

        /// <summary>
        /// Returns true if RiskMappingEntry instances are equal
        /// </summary>
        /// <param name="input">Instance of RiskMappingEntry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RiskMappingEntry input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for RiskMappingEntry
    /// </summary>
    public class RiskMappingEntryJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(RiskMappingEntry).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return RiskMappingEntry.FromJson(JToken.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
