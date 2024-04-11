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
    /// DataSourceInstance
    /// </summary>
    [DataContract(Name = "DataSourceInstance")]
    public partial class DataSourceInstance : IEquatable<DataSourceInstance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DataSourceInstance" /> class.
        /// </summary>
        /// <param name="dstInstanceId">dstInstanceId.</param>
        /// <param name="dstInstanceType">dstInstanceType.</param>
        /// <param name="rows">rows.</param>
        public DataSourceInstance(int dstInstanceId = default(int), string dstInstanceType = default(string), List<DataSourceInstanceRows> rows = default(List<DataSourceInstanceRows>))
        {
            this.DstInstanceId = dstInstanceId;
            this.DstInstanceType = dstInstanceType;
            this.Rows = rows;
        }

        /// <summary>
        /// Gets or Sets DstInstanceId
        /// </summary>
        [DataMember(Name = "dstInstanceId", EmitDefaultValue = false)]
        public int DstInstanceId { get; set; }

        /// <summary>
        /// Gets or Sets DstInstanceType
        /// </summary>
        [DataMember(Name = "dstInstanceType", EmitDefaultValue = false)]
        public string DstInstanceType { get; set; }

        /// <summary>
        /// Gets or Sets Rows
        /// </summary>
        [DataMember(Name = "rows", EmitDefaultValue = false)]
        public List<DataSourceInstanceRows> Rows { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DataSourceInstance {\n");
            sb.Append("  DstInstanceId: ").Append(DstInstanceId).Append("\n");
            sb.Append("  DstInstanceType: ").Append(DstInstanceType).Append("\n");
            sb.Append("  Rows: ").Append(Rows).Append("\n");
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
            return this.Equals(input as DataSourceInstance);
        }

        /// <summary>
        /// Returns true if DataSourceInstance instances are equal
        /// </summary>
        /// <param name="input">Instance of DataSourceInstance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DataSourceInstance input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DstInstanceId == input.DstInstanceId ||
                    this.DstInstanceId.Equals(input.DstInstanceId)
                ) && 
                (
                    this.DstInstanceType == input.DstInstanceType ||
                    (this.DstInstanceType != null &&
                    this.DstInstanceType.Equals(input.DstInstanceType))
                ) && 
                (
                    this.Rows == input.Rows ||
                    this.Rows != null &&
                    input.Rows != null &&
                    this.Rows.SequenceEqual(input.Rows)
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
                hashCode = (hashCode * 59) + this.DstInstanceId.GetHashCode();
                if (this.DstInstanceType != null)
                {
                    hashCode = (hashCode * 59) + this.DstInstanceType.GetHashCode();
                }
                if (this.Rows != null)
                {
                    hashCode = (hashCode * 59) + this.Rows.GetHashCode();
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
