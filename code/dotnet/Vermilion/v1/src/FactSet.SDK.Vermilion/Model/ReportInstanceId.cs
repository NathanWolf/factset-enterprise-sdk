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
    /// ReportInstanceId
    /// </summary>
    [DataContract(Name = "ReportInstanceId")]
    public partial class ReportInstanceId : IEquatable<ReportInstanceId>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportInstanceId" /> class.
        /// </summary>
        /// <param name="reportInstanceId">reportInstanceId.</param>
        public ReportInstanceId(int reportInstanceId = default(int))
        {
            this._ReportInstanceId = reportInstanceId;
        }

        /// <summary>
        /// Gets or Sets _ReportInstanceId
        /// </summary>
        [DataMember(Name = "reportInstanceId", EmitDefaultValue = false)]
        public int _ReportInstanceId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReportInstanceId {\n");
            sb.Append("  _ReportInstanceId: ").Append(_ReportInstanceId).Append("\n");
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
            return this.Equals(input as ReportInstanceId);
        }

        /// <summary>
        /// Returns true if ReportInstanceId instances are equal
        /// </summary>
        /// <param name="input">Instance of ReportInstanceId to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReportInstanceId input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._ReportInstanceId == input._ReportInstanceId ||
                    this._ReportInstanceId.Equals(input._ReportInstanceId)
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
                hashCode = (hashCode * 59) + this._ReportInstanceId.GetHashCode();
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
