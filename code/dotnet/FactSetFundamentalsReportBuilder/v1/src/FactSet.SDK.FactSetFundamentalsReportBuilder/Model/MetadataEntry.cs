/*
 * FactSet Fundamentals Report Builder
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentalsReportBuilder.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.FactSetFundamentalsReportBuilder.Model
{
    /// <summary>
    /// Restricted metadata entries. Restricts the possible key in the following STACH schema: - RowOrganizedPackage.CellDetail.CellMetadataEntry - RowOrganizedPackage.HeaderCellDetail.CellMetadataEntry - RowOrganizedPackage.MapOfMetadata.ItemsEntry - RowOrganizedPackage.Row.RowMetadataEntry - RowOrganizedPackage.TableData.TableMetadataEntry  And sets restrictions on the possible values for a MetadataItem. 
    /// </summary>
    [JsonConverter(typeof(MetadataEntryJsonConverter))]
    [DataContract(Name = "MetadataEntry")]
    public partial class MetadataEntry : AbstractOpenAPISchema, IEquatable<MetadataEntry>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="Category" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Category.</param>
        public MetadataEntry(Category actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="CurrencyCode" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CurrencyCode.</param>
        public MetadataEntry(CurrencyCode actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="CurrencySymbol" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CurrencySymbol.</param>
        public MetadataEntry(CurrencySymbol actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="Description" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Description.</param>
        public MetadataEntry(Description actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="Frequency" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Frequency.</param>
        public MetadataEntry(Frequency actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="MetricFundamentals" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of MetricFundamentals.</param>
        public MetadataEntry(MetricFundamentals actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="ReportStatus" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ReportStatus.</param>
        public MetadataEntry(ReportStatus actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="Scale" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Scale.</param>
        public MetadataEntry(Scale actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MetadataEntry" /> class
        /// with the <see cref="ValueType" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ValueType.</param>
        public MetadataEntry(ValueType actualInstance)
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
                if (value.GetType() == typeof(Category))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CurrencyCode))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(CurrencySymbol))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(Description))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(Frequency))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(MetricFundamentals))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(ReportStatus))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(Scale))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(ValueType))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Category, CurrencyCode, CurrencySymbol, Description, Frequency, MetricFundamentals, ReportStatus, Scale, ValueType");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Category`. If the actual instance is not `Category`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Category</returns>
        public Category GetCategory()
        {
            return (Category)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CurrencyCode`. If the actual instance is not `CurrencyCode`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CurrencyCode</returns>
        public CurrencyCode GetCurrencyCode()
        {
            return (CurrencyCode)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CurrencySymbol`. If the actual instance is not `CurrencySymbol`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CurrencySymbol</returns>
        public CurrencySymbol GetCurrencySymbol()
        {
            return (CurrencySymbol)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Description`. If the actual instance is not `Description`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Description</returns>
        public Description GetDescription()
        {
            return (Description)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Frequency`. If the actual instance is not `Frequency`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Frequency</returns>
        public Frequency GetFrequency()
        {
            return (Frequency)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `MetricFundamentals`. If the actual instance is not `MetricFundamentals`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of MetricFundamentals</returns>
        public MetricFundamentals GetMetricFundamentals()
        {
            return (MetricFundamentals)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ReportStatus`. If the actual instance is not `ReportStatus`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ReportStatus</returns>
        public ReportStatus GetReportStatus()
        {
            return (ReportStatus)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Scale`. If the actual instance is not `Scale`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Scale</returns>
        public Scale GetScale()
        {
            return (Scale)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ValueType`. If the actual instance is not `ValueType`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ValueType</returns>
        public ValueType GetValueType()
        {
            return (ValueType)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MetadataEntry {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, MetadataEntry.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of MetadataEntry
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of MetadataEntry</returns>
        public static MetadataEntry FromJson(string jsonString)
        {
            MetadataEntry newMetadataEntry = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newMetadataEntry;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Category).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Category>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Category>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Category");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Category: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CurrencyCode).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<CurrencyCode>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<CurrencyCode>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CurrencyCode");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CurrencyCode: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(CurrencySymbol).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<CurrencySymbol>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<CurrencySymbol>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("CurrencySymbol");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CurrencySymbol: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Description).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Description>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Description>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Description");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Description: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Frequency).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Frequency>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Frequency>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Frequency");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Frequency: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(MetricFundamentals).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<MetricFundamentals>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<MetricFundamentals>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("MetricFundamentals");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into MetricFundamentals: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(ReportStatus).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<ReportStatus>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<ReportStatus>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("ReportStatus");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ReportStatus: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(Scale).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Scale>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<Scale>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("Scale");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Scale: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(ValueType).GetProperty("AdditionalProperties") == null)
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<ValueType>(jsonString, MetadataEntry.SerializerSettings));
                }
                else
                {
                    newMetadataEntry = new MetadataEntry(JsonConvert.DeserializeObject<ValueType>(jsonString, MetadataEntry.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("ValueType");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ValueType: {1}", jsonString, exception.ToString()));
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
            return newMetadataEntry;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as MetadataEntry);
        }

        /// <summary>
        /// Returns true if MetadataEntry instances are equal
        /// </summary>
        /// <param name="input">Instance of MetadataEntry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MetadataEntry input)
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
    /// Custom JSON converter for MetadataEntry
    /// </summary>
    public class MetadataEntryJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(MetadataEntry).GetMethod("ToJson").Invoke(value, null)));
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
                return MetadataEntry.FromJson(JObject.Load(reader).ToString(Formatting.None));
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
