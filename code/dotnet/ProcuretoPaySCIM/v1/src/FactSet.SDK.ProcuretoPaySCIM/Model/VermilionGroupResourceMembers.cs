/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPaySCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPaySCIM.Model
{
    /// <summary>
    /// VermilionGroupResourceMembers
    /// </summary>
    [DataContract(Name = "VermilionGroupResource_members")]
    public partial class VermilionGroupResourceMembers : IEquatable<VermilionGroupResourceMembers>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VermilionGroupResourceMembers" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VermilionGroupResourceMembers() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VermilionGroupResourceMembers" /> class.
        /// </summary>
        /// <param name="value">Identifier of the member of this Group. (required).</param>
        /// <param name="_ref">The uri corresponding to a SCIM resource that is a member of this Group..</param>
        /// <param name="display">A human-readable name for the Member.</param>
        /// <param name="type">A label indicating the type of resource, e.g. &#39;User&#39; or &#39;Group&#39;.</param>
        public VermilionGroupResourceMembers(string value = default(string), string _ref = default(string), string display = default(string), string type = default(string))
        {
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for VermilionGroupResourceMembers and cannot be null");
            }
            this.Value = value;
            this.Ref = _ref;
            this.Display = display;
            this.Type = type;
        }

        /// <summary>
        /// Identifier of the member of this Group.
        /// </summary>
        /// <value>Identifier of the member of this Group.</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// The uri corresponding to a SCIM resource that is a member of this Group.
        /// </summary>
        /// <value>The uri corresponding to a SCIM resource that is a member of this Group.</value>
        [DataMember(Name = "$ref", EmitDefaultValue = false)]
        public string Ref { get; set; }

        /// <summary>
        /// A human-readable name for the Member
        /// </summary>
        /// <value>A human-readable name for the Member</value>
        [DataMember(Name = "display", EmitDefaultValue = false)]
        public string Display { get; set; }

        /// <summary>
        /// A label indicating the type of resource, e.g. &#39;User&#39; or &#39;Group&#39;
        /// </summary>
        /// <value>A label indicating the type of resource, e.g. &#39;User&#39; or &#39;Group&#39;</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VermilionGroupResourceMembers {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Ref: ").Append(Ref).Append("\n");
            sb.Append("  Display: ").Append(Display).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as VermilionGroupResourceMembers);
        }

        /// <summary>
        /// Returns true if VermilionGroupResourceMembers instances are equal
        /// </summary>
        /// <param name="input">Instance of VermilionGroupResourceMembers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VermilionGroupResourceMembers input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Ref == input.Ref ||
                    (this.Ref != null &&
                    this.Ref.Equals(input.Ref))
                ) && 
                (
                    this.Display == input.Display ||
                    (this.Display != null &&
                    this.Display.Equals(input.Display))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Ref != null)
                {
                    hashCode = (hashCode * 59) + this.Ref.GetHashCode();
                }
                if (this.Display != null)
                {
                    hashCode = (hashCode * 59) + this.Display.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
