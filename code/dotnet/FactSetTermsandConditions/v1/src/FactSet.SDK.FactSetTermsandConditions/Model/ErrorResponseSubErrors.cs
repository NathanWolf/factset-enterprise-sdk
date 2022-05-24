/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTermsandConditions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTermsandConditions.Model
{
    /// <summary>
    /// subErrors related to the error message. Null if not applicable.
    /// </summary>
    [DataContract(Name = "errorResponse_subErrors")]
    public partial class ErrorResponseSubErrors : IEquatable<ErrorResponseSubErrors>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ErrorResponseSubErrors" /> class.
        /// </summary>
        /// <param name="_object">the operation ID.</param>
        /// <param name="field">Parameter Field Name.</param>
        /// <param name="message">Error message.</param>
        /// <param name="rejectedValue">Rejected Values in an Array.</param>
        public ErrorResponseSubErrors(string _object = default(string), string field = default(string), string message = default(string), List<string> rejectedValue = default(List<string>))
        {
            this.Object = _object;
            this.Field = field;
            this.Message = message;
            this.RejectedValue = rejectedValue;
        }

        /// <summary>
        /// the operation ID
        /// </summary>
        /// <value>the operation ID</value>
        [DataMember(Name = "object", EmitDefaultValue = false)]
        public string Object { get; set; }

        /// <summary>
        /// Parameter Field Name
        /// </summary>
        /// <value>Parameter Field Name</value>
        [DataMember(Name = "field", EmitDefaultValue = false)]
        public string Field { get; set; }

        /// <summary>
        /// Error message
        /// </summary>
        /// <value>Error message</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Rejected Values in an Array
        /// </summary>
        /// <value>Rejected Values in an Array</value>
        [DataMember(Name = "rejectedValue", EmitDefaultValue = false)]
        public List<string> RejectedValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ErrorResponseSubErrors {\n");
            sb.Append("  Object: ").Append(Object).Append("\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  RejectedValue: ").Append(RejectedValue).Append("\n");
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
            return this.Equals(input as ErrorResponseSubErrors);
        }

        /// <summary>
        /// Returns true if ErrorResponseSubErrors instances are equal
        /// </summary>
        /// <param name="input">Instance of ErrorResponseSubErrors to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorResponseSubErrors input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Object == input.Object ||
                    (this.Object != null &&
                    this.Object.Equals(input.Object))
                ) && 
                (
                    this.Field == input.Field ||
                    (this.Field != null &&
                    this.Field.Equals(input.Field))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.RejectedValue == input.RejectedValue ||
                    this.RejectedValue != null &&
                    input.RejectedValue != null &&
                    this.RejectedValue.SequenceEqual(input.RejectedValue)
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
                if (this.Object != null)
                {
                    hashCode = (hashCode * 59) + this.Object.GetHashCode();
                }
                if (this.Field != null)
                {
                    hashCode = (hashCode * 59) + this.Field.GetHashCode();
                }
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                if (this.RejectedValue != null)
                {
                    hashCode = (hashCode * 59) + this.RejectedValue.GetHashCode();
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
