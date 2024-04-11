/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// DataSourceDTO
    /// </summary>
    [DataContract(Name = "DataSourceDTO")]
    public partial class DataSourceDTO : IEquatable<DataSourceDTO>, IValidatableObject
    {
        /// <summary>
        /// Defines DsType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DsTypeEnum
        {
            /// <summary>
            /// Enum AUTOMATIC for value: AUTOMATIC
            /// </summary>
            [EnumMember(Value = "AUTOMATIC")]
            AUTOMATIC = 1,

            /// <summary>
            /// Enum MANUAL for value: MANUAL
            /// </summary>
            [EnumMember(Value = "MANUAL")]
            MANUAL = 2,

            /// <summary>
            /// Enum FILTER for value: FILTER
            /// </summary>
            [EnumMember(Value = "FILTER")]
            FILTER = 3

        }


        /// <summary>
        /// Gets or Sets DsType
        /// </summary>
        [DataMember(Name = "dsType", EmitDefaultValue = false)]
        public DsTypeEnum? DsType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DataSourceDTO" /> class.
        /// </summary>
        /// <param name="dataSourceId">dataSourceId.</param>
        /// <param name="name">name.</param>
        /// <param name="code">code.</param>
        /// <param name="dsType">dsType.</param>
        /// <param name="entities">entities.</param>
        /// <param name="outputRecordSet">outputRecordSet.</param>
        /// <param name="releaseTag">releaseTag.</param>
        /// <param name="defaultDataSourceName">defaultDataSourceName.</param>
        /// <param name="dataPreview">dataPreview.</param>
        /// <param name="lastUpdatedBy">lastUpdatedBy.</param>
        /// <param name="lastUpdated">lastUpdated.</param>
        public DataSourceDTO(int dataSourceId = default(int), string name = default(string), string code = default(string), DsTypeEnum? dsType = default(DsTypeEnum?), List<EntityDTO> entities = default(List<EntityDTO>), string outputRecordSet = default(string), string releaseTag = default(string), string defaultDataSourceName = default(string), string dataPreview = default(string), string lastUpdatedBy = default(string), decimal lastUpdated = default(decimal))
        {
            this.DataSourceId = dataSourceId;
            this.Name = name;
            this.Code = code;
            this.DsType = dsType;
            this.Entities = entities;
            this.OutputRecordSet = outputRecordSet;
            this.ReleaseTag = releaseTag;
            this.DefaultDataSourceName = defaultDataSourceName;
            this.DataPreview = dataPreview;
            this.LastUpdatedBy = lastUpdatedBy;
            this.LastUpdated = lastUpdated;
        }

        /// <summary>
        /// Gets or Sets DataSourceId
        /// </summary>
        [DataMember(Name = "dataSourceId", EmitDefaultValue = false)]
        public int DataSourceId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Entities
        /// </summary>
        [DataMember(Name = "entities", EmitDefaultValue = false)]
        public List<EntityDTO> Entities { get; set; }

        /// <summary>
        /// Gets or Sets OutputRecordSet
        /// </summary>
        [DataMember(Name = "outputRecordSet", EmitDefaultValue = false)]
        public string OutputRecordSet { get; set; }

        /// <summary>
        /// Gets or Sets ReleaseTag
        /// </summary>
        [DataMember(Name = "releaseTag", EmitDefaultValue = false)]
        public string ReleaseTag { get; set; }

        /// <summary>
        /// Gets or Sets DefaultDataSourceName
        /// </summary>
        [DataMember(Name = "defaultDataSourceName", EmitDefaultValue = false)]
        public string DefaultDataSourceName { get; set; }

        /// <summary>
        /// Gets or Sets DataPreview
        /// </summary>
        [DataMember(Name = "dataPreview", EmitDefaultValue = false)]
        public string DataPreview { get; set; }

        /// <summary>
        /// Gets or Sets LastUpdatedBy
        /// </summary>
        [DataMember(Name = "lastUpdatedBy", EmitDefaultValue = false)]
        public string LastUpdatedBy { get; set; }

        /// <summary>
        /// Gets or Sets LastUpdated
        /// </summary>
        [DataMember(Name = "lastUpdated", EmitDefaultValue = false)]
        public decimal LastUpdated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DataSourceDTO {\n");
            sb.Append("  DataSourceId: ").Append(DataSourceId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  DsType: ").Append(DsType).Append("\n");
            sb.Append("  Entities: ").Append(Entities).Append("\n");
            sb.Append("  OutputRecordSet: ").Append(OutputRecordSet).Append("\n");
            sb.Append("  ReleaseTag: ").Append(ReleaseTag).Append("\n");
            sb.Append("  DefaultDataSourceName: ").Append(DefaultDataSourceName).Append("\n");
            sb.Append("  DataPreview: ").Append(DataPreview).Append("\n");
            sb.Append("  LastUpdatedBy: ").Append(LastUpdatedBy).Append("\n");
            sb.Append("  LastUpdated: ").Append(LastUpdated).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as DataSourceDTO);
        }

        /// <summary>
        /// Returns true if DataSourceDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of DataSourceDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DataSourceDTO input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DataSourceId == input.DataSourceId ||
                    this.DataSourceId.Equals(input.DataSourceId)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.DsType == input.DsType ||
                    this.DsType.Equals(input.DsType)
                ) && 
                (
                    this.Entities == input.Entities ||
                    this.Entities != null &&
                    input.Entities != null &&
                    this.Entities.SequenceEqual(input.Entities)
                ) && 
                (
                    this.OutputRecordSet == input.OutputRecordSet ||
                    (this.OutputRecordSet != null &&
                    this.OutputRecordSet.Equals(input.OutputRecordSet))
                ) && 
                (
                    this.ReleaseTag == input.ReleaseTag ||
                    (this.ReleaseTag != null &&
                    this.ReleaseTag.Equals(input.ReleaseTag))
                ) && 
                (
                    this.DefaultDataSourceName == input.DefaultDataSourceName ||
                    (this.DefaultDataSourceName != null &&
                    this.DefaultDataSourceName.Equals(input.DefaultDataSourceName))
                ) && 
                (
                    this.DataPreview == input.DataPreview ||
                    (this.DataPreview != null &&
                    this.DataPreview.Equals(input.DataPreview))
                ) && 
                (
                    this.LastUpdatedBy == input.LastUpdatedBy ||
                    (this.LastUpdatedBy != null &&
                    this.LastUpdatedBy.Equals(input.LastUpdatedBy))
                ) && 
                (
                    this.LastUpdated == input.LastUpdated ||
                    this.LastUpdated.Equals(input.LastUpdated)
                );
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
                hashCode = (hashCode * 59) + this.DataSourceId.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DsType.GetHashCode();
                if (this.Entities != null)
                {
                    hashCode = (hashCode * 59) + this.Entities.GetHashCode();
                }
                if (this.OutputRecordSet != null)
                {
                    hashCode = (hashCode * 59) + this.OutputRecordSet.GetHashCode();
                }
                if (this.ReleaseTag != null)
                {
                    hashCode = (hashCode * 59) + this.ReleaseTag.GetHashCode();
                }
                if (this.DefaultDataSourceName != null)
                {
                    hashCode = (hashCode * 59) + this.DefaultDataSourceName.GetHashCode();
                }
                if (this.DataPreview != null)
                {
                    hashCode = (hashCode * 59) + this.DataPreview.GetHashCode();
                }
                if (this.LastUpdatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.LastUpdatedBy.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.LastUpdated.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
