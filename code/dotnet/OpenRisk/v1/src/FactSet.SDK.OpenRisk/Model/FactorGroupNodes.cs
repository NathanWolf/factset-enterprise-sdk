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
    /// FactorGroupNodes
    /// </summary>
    [JsonConverter(typeof(FactorGroupNodesJsonConverter))]
    [DataContract(Name = "FactorGroupNodes")]
    public partial class FactorGroupNodes : AbstractOpenAPISchema, IEquatable<FactorGroupNodes>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FactorGroupNodes" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of FactorGroup.</param>
        public FactorGroupNodes(FactorGroup actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FactorGroupNodes" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RiskModelFactor.</param>
        public FactorGroupNodes(RiskModelFactor actualInstance)
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
                if (value is FactorGroup)
                {
                    this._actualInstance = value;
                }
                else if (value is RiskModelFactor)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: FactorGroup, RiskModelFactor");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `FactorGroup`. If the actual instance is not `FactorGroup`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of FactorGroup</returns>
        public FactorGroup GetFactorGroup()
        {
            return (FactorGroup)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RiskModelFactor`. If the actual instance is not `RiskModelFactor`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RiskModelFactor</returns>
        public RiskModelFactor GetRiskModelFactor()
        {
            return (RiskModelFactor)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FactorGroupNodes {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, FactorGroupNodes.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of FactorGroupNodes
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of FactorGroupNodes</returns>
        public static FactorGroupNodes FromJson(string jsonString)
        {
            FactorGroupNodes newFactorGroupNodes = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newFactorGroupNodes;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                var hasAdditionalProperties = !(typeof(FactorGroup).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<FactorGroup>(
                    jsonString,
                    hasAdditionalProperties ? FactorGroupNodes.AdditionalPropertiesSerializerSettings : FactorGroupNodes.SerializerSettings
                );
                newFactorGroupNodes = new FactorGroupNodes(parsedValue);
                matchedTypes.Add("FactorGroup");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into FactorGroup: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(RiskModelFactor).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<RiskModelFactor>(
                    jsonString,
                    hasAdditionalProperties ? FactorGroupNodes.AdditionalPropertiesSerializerSettings : FactorGroupNodes.SerializerSettings
                );
                newFactorGroupNodes = new FactorGroupNodes(parsedValue);
                matchedTypes.Add("RiskModelFactor");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RiskModelFactor: {1}", jsonString, exception.ToString()));
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
            return newFactorGroupNodes;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as FactorGroupNodes);
        }

        /// <summary>
        /// Returns true if FactorGroupNodes instances are equal
        /// </summary>
        /// <param name="input">Instance of FactorGroupNodes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FactorGroupNodes input)
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
    /// Custom JSON converter for FactorGroupNodes
    /// </summary>
    public class FactorGroupNodesJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(FactorGroupNodes).GetMethod("ToJson").Invoke(value, null)));
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
                return FactorGroupNodes.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
