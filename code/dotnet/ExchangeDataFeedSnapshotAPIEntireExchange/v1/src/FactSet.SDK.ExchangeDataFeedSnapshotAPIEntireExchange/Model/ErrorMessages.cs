/*
 * Exchange Snapshot API
 *
 * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange. Clients that need access to the DFSnapshot product for a custom watchlist snapped at a client specified interval should use this API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Model
{
    /// <summary>
    /// ErrorMessages
    /// </summary>
    [DataContract(Name = "Error-Messages")]
    public partial class ErrorMessages : IEquatable<ErrorMessages>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ErrorMessages" /> class.
        /// </summary>
        /// <param name="permissionError">Error message when user is not subscribed to the Exchange Snapshot API.</param>
        /// <param name="paramError">when the parameters passed in the query are incorrect or missing.</param>
        /// <param name="startDate">startDate must be &lt; 0.</param>
        /// <param name="endDate">endDate must be &lt; 0.</param>
        public ErrorMessages(string permissionError = default(string), string paramError = default(string), string startDate = default(string), string endDate = default(string))
        {
            this.PermissionError = permissionError;
            this.ParamError = paramError;
            this.StartDate = startDate;
            this.EndDate = endDate;
        }

        /// <summary>
        /// Error message when user is not subscribed to the Exchange Snapshot API
        /// </summary>
        /// <value>Error message when user is not subscribed to the Exchange Snapshot API</value>
        [DataMember(Name = "Permission Error", EmitDefaultValue = false)]
        public string PermissionError { get; set; }

        /// <summary>
        /// when the parameters passed in the query are incorrect or missing
        /// </summary>
        /// <value>when the parameters passed in the query are incorrect or missing</value>
        [DataMember(Name = "Param Error", EmitDefaultValue = false)]
        public string ParamError { get; set; }

        /// <summary>
        /// startDate must be &lt; 0
        /// </summary>
        /// <value>startDate must be &lt; 0</value>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        public string StartDate { get; set; }

        /// <summary>
        /// endDate must be &lt; 0
        /// </summary>
        /// <value>endDate must be &lt; 0</value>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ErrorMessages {\n");
            sb.Append("  PermissionError: ").Append(PermissionError).Append("\n");
            sb.Append("  ParamError: ").Append(ParamError).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
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
            return this.Equals(input as ErrorMessages);
        }

        /// <summary>
        /// Returns true if ErrorMessages instances are equal
        /// </summary>
        /// <param name="input">Instance of ErrorMessages to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorMessages input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PermissionError == input.PermissionError ||
                    (this.PermissionError != null &&
                    this.PermissionError.Equals(input.PermissionError))
                ) && 
                (
                    this.ParamError == input.ParamError ||
                    (this.ParamError != null &&
                    this.ParamError.Equals(input.ParamError))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
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
                if (this.PermissionError != null)
                {
                    hashCode = (hashCode * 59) + this.PermissionError.GetHashCode();
                }
                if (this.ParamError != null)
                {
                    hashCode = (hashCode * 59) + this.ParamError.GetHashCode();
                }
                if (this.StartDate != null)
                {
                    hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
                }
                if (this.EndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
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
