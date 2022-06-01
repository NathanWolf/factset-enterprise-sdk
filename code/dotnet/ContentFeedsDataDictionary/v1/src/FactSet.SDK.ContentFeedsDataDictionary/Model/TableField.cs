/*
 * CTS Data Dictionary API
 *
 * An API for interacting with CTS Data Dictionary.
 *
 * The version of the OpenAPI document: 0.2
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
using OpenAPIDateConverter = FactSet.SDK.ContentFeedsDataDictionary.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ContentFeedsDataDictionary.Model
{
    /// <summary>
    /// TableField
    /// </summary>
    [DataContract(Name = "TableField")]
    public partial class TableField : IEquatable<TableField>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TableField" /> class.
        /// </summary>
        /// <param name="id">Unique identifier for a combination of table and data field.</param>
        /// <param name="dataItemId">Unique identifier for the data item.</param>
        /// <param name="name">Name of the data field.</param>
        /// <param name="dataType">Data type of the data field.</param>
        /// <param name="position">Column position of the data field within the table.</param>
        /// <param name="isPrimaryKey">Flag indicating if the data field is a primary key..</param>
        /// <param name="nullable">Flag indicating if a data field is nullable.</param>
        /// <param name="hasCodeDependency">Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code..</param>
        /// <param name="monetary">Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies.</param>
        /// <param name="splitAffected">Flag indicating if the data field contained in this TableField can be affected by splits.</param>
        /// <param name="unitFactor">Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value.</param>
        /// <param name="description">A description of the data field within the context of its table.</param>
        public TableField(string id = default(string), string dataItemId = default(string), string name = default(string), string dataType = default(string), int position = default(int), bool isPrimaryKey = default(bool), bool nullable = default(bool), bool hasCodeDependency = default(bool), bool monetary = default(bool), bool splitAffected = default(bool), string unitFactor = default(string), string description = default(string))
        {
            this.Id = id;
            this.DataItemId = dataItemId;
            this.Name = name;
            this.DataType = dataType;
            this.Position = position;
            this.IsPrimaryKey = isPrimaryKey;
            this.Nullable = nullable;
            this.HasCodeDependency = hasCodeDependency;
            this.Monetary = monetary;
            this.SplitAffected = splitAffected;
            this.UnitFactor = unitFactor;
            this.Description = description;
        }

        /// <summary>
        /// Unique identifier for a combination of table and data field
        /// </summary>
        /// <value>Unique identifier for a combination of table and data field</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Unique identifier for the data item
        /// </summary>
        /// <value>Unique identifier for the data item</value>
        [DataMember(Name = "dataItemId", EmitDefaultValue = false)]
        public string DataItemId { get; set; }

        /// <summary>
        /// Name of the data field
        /// </summary>
        /// <value>Name of the data field</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Data type of the data field
        /// </summary>
        /// <value>Data type of the data field</value>
        [DataMember(Name = "dataType", EmitDefaultValue = false)]
        public string DataType { get; set; }

        /// <summary>
        /// Column position of the data field within the table
        /// </summary>
        /// <value>Column position of the data field within the table</value>
        [DataMember(Name = "position", EmitDefaultValue = false)]
        public int Position { get; set; }

        /// <summary>
        /// Flag indicating if the data field is a primary key.
        /// </summary>
        /// <value>Flag indicating if the data field is a primary key.</value>
        [DataMember(Name = "isPrimaryKey", EmitDefaultValue = true)]
        public bool IsPrimaryKey { get; set; }

        /// <summary>
        /// Flag indicating if a data field is nullable
        /// </summary>
        /// <value>Flag indicating if a data field is nullable</value>
        [DataMember(Name = "nullable", EmitDefaultValue = true)]
        public bool Nullable { get; set; }

        /// <summary>
        /// Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code.
        /// </summary>
        /// <value>Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code.</value>
        [DataMember(Name = "hasCodeDependency", EmitDefaultValue = true)]
        public bool HasCodeDependency { get; set; }

        /// <summary>
        /// Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies
        /// </summary>
        /// <value>Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies</value>
        [DataMember(Name = "monetary", EmitDefaultValue = true)]
        public bool Monetary { get; set; }

        /// <summary>
        /// Flag indicating if the data field contained in this TableField can be affected by splits
        /// </summary>
        /// <value>Flag indicating if the data field contained in this TableField can be affected by splits</value>
        [DataMember(Name = "splitAffected", EmitDefaultValue = true)]
        public bool SplitAffected { get; set; }

        /// <summary>
        /// Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value
        /// </summary>
        /// <value>Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value</value>
        [DataMember(Name = "unitFactor", EmitDefaultValue = false)]
        public string UnitFactor { get; set; }

        /// <summary>
        /// A description of the data field within the context of its table
        /// </summary>
        /// <value>A description of the data field within the context of its table</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TableField {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  DataItemId: ").Append(DataItemId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  IsPrimaryKey: ").Append(IsPrimaryKey).Append("\n");
            sb.Append("  Nullable: ").Append(Nullable).Append("\n");
            sb.Append("  HasCodeDependency: ").Append(HasCodeDependency).Append("\n");
            sb.Append("  Monetary: ").Append(Monetary).Append("\n");
            sb.Append("  SplitAffected: ").Append(SplitAffected).Append("\n");
            sb.Append("  UnitFactor: ").Append(UnitFactor).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return this.Equals(input as TableField);
        }

        /// <summary>
        /// Returns true if TableField instances are equal
        /// </summary>
        /// <param name="input">Instance of TableField to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TableField input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.DataItemId == input.DataItemId ||
                    (this.DataItemId != null &&
                    this.DataItemId.Equals(input.DataItemId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.DataType == input.DataType ||
                    (this.DataType != null &&
                    this.DataType.Equals(input.DataType))
                ) && 
                (
                    this.Position == input.Position ||
                    this.Position.Equals(input.Position)
                ) && 
                (
                    this.IsPrimaryKey == input.IsPrimaryKey ||
                    this.IsPrimaryKey.Equals(input.IsPrimaryKey)
                ) && 
                (
                    this.Nullable == input.Nullable ||
                    this.Nullable.Equals(input.Nullable)
                ) && 
                (
                    this.HasCodeDependency == input.HasCodeDependency ||
                    this.HasCodeDependency.Equals(input.HasCodeDependency)
                ) && 
                (
                    this.Monetary == input.Monetary ||
                    this.Monetary.Equals(input.Monetary)
                ) && 
                (
                    this.SplitAffected == input.SplitAffected ||
                    this.SplitAffected.Equals(input.SplitAffected)
                ) && 
                (
                    this.UnitFactor == input.UnitFactor ||
                    (this.UnitFactor != null &&
                    this.UnitFactor.Equals(input.UnitFactor))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.DataItemId != null)
                {
                    hashCode = (hashCode * 59) + this.DataItemId.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.DataType != null)
                {
                    hashCode = (hashCode * 59) + this.DataType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Position.GetHashCode();
                hashCode = (hashCode * 59) + this.IsPrimaryKey.GetHashCode();
                hashCode = (hashCode * 59) + this.Nullable.GetHashCode();
                hashCode = (hashCode * 59) + this.HasCodeDependency.GetHashCode();
                hashCode = (hashCode * 59) + this.Monetary.GetHashCode();
                hashCode = (hashCode * 59) + this.SplitAffected.GetHashCode();
                if (this.UnitFactor != null)
                {
                    hashCode = (hashCode * 59) + this.UnitFactor.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
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
