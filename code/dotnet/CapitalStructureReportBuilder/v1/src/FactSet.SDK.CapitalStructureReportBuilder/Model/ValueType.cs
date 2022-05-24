/*
 * FactSet Capital Structure Report Builder API
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
using OpenAPIDateConverter = FactSet.SDK.CapitalStructureReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CapitalStructureReportBuilder.Model
{
    /// <summary>
    /// ValueType
    /// </summary>
    [DataContract(Name = "valueType")]
    public partial class ValueType : IEquatable<ValueType>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ValueType" /> class.
        /// </summary>
        /// <param name="valueType">valueType.</param>
        public ValueType(ValueTypeValueType valueType = default(ValueTypeValueType))
        {
            this._ValueType = valueType;
        }

        /// <summary>
        /// Gets or Sets _ValueType
        /// </summary>
        [DataMember(Name = "valueType", EmitDefaultValue = false)]
        public ValueTypeValueType _ValueType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ValueType {\n");
            sb.Append("  _ValueType: ").Append(_ValueType).Append("\n");
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
            return this.Equals(input as ValueType);
        }

        /// <summary>
        /// Returns true if ValueType instances are equal
        /// </summary>
        /// <param name="input">Instance of ValueType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ValueType input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._ValueType == input._ValueType ||
                    (this._ValueType != null &&
                    this._ValueType.Equals(input._ValueType))
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
                if (this._ValueType != null)
                {
                    hashCode = (hashCode * 59) + this._ValueType.GetHashCode();
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
