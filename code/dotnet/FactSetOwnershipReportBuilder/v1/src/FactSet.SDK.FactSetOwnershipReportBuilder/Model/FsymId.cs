/*
 * FactSet Ownership API
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
using OpenAPIDateConverter = FactSet.SDK.FactSetOwnershipReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetOwnershipReportBuilder.Model
{
    /// <summary>
    /// FsymId
    /// </summary>
    [DataContract(Name = "fsymId")]
    public partial class FsymId : IEquatable<FsymId>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FsymId" /> class.
        /// </summary>
        /// <param name="fsymId">fsymId.</param>
        public FsymId(FsymIdFsymId fsymId = default(FsymIdFsymId))
        {
            this._FsymId = fsymId;
        }

        /// <summary>
        /// Gets or Sets _FsymId
        /// </summary>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public FsymIdFsymId _FsymId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FsymId {\n");
            sb.Append("  _FsymId: ").Append(_FsymId).Append("\n");
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
            return this.Equals(input as FsymId);
        }

        /// <summary>
        /// Returns true if FsymId instances are equal
        /// </summary>
        /// <param name="input">Instance of FsymId to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FsymId input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._FsymId == input._FsymId ||
                    (this._FsymId != null &&
                    this._FsymId.Equals(input._FsymId))
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
                if (this._FsymId != null)
                {
                    hashCode = (hashCode * 59) + this._FsymId.GetHashCode();
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
