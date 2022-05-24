/*
 * Publisher API
 *
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.Publisher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Publisher.Model
{
    /// <summary>
    /// CalculationStatus
    /// </summary>
    [DataContract(Name = "CalculationStatus")]
    public partial class CalculationStatus : IEquatable<CalculationStatus>, IValidatableObject
    {
        /// <summary>
        /// Defines Status
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Queued for value: Queued
            /// </summary>
            [EnumMember(Value = "Queued")]
            Queued = 1,

            /// <summary>
            /// Enum Executing for value: Executing
            /// </summary>
            [EnumMember(Value = "Executing")]
            Executing = 2,

            /// <summary>
            /// Enum Completed for value: Completed
            /// </summary>
            [EnumMember(Value = "Completed")]
            Completed = 3,

            /// <summary>
            /// Enum Cancelled for value: Cancelled
            /// </summary>
            [EnumMember(Value = "Cancelled")]
            Cancelled = 4

        }


        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CalculationStatus" /> class.
        /// </summary>
        /// <param name="status">status.</param>
        /// <param name="units">Number of calculation units in batch..</param>
        /// <param name="pa">List of statuses for PA calculation units..</param>
        /// <param name="spar">List of statuses for SPAR calculation units..</param>
        /// <param name="vault">List of statuses for Vault calculation units..</param>
        /// <param name="pub">List of statuses for Publisher calculation units..</param>
        public CalculationStatus(StatusEnum? status = default(StatusEnum?), int units = default(int), Dictionary<string, CalculationUnitStatus> pa = default(Dictionary<string, CalculationUnitStatus>), Dictionary<string, CalculationUnitStatus> spar = default(Dictionary<string, CalculationUnitStatus>), Dictionary<string, CalculationUnitStatus> vault = default(Dictionary<string, CalculationUnitStatus>), Dictionary<string, CalculationUnitStatus> pub = default(Dictionary<string, CalculationUnitStatus>))
        {
            this.Status = status;
            this.Units = units;
            this.Pa = pa;
            this.Spar = spar;
            this.Vault = vault;
            this.Pub = pub;
        }

        /// <summary>
        /// Number of calculation units in batch.
        /// </summary>
        /// <value>Number of calculation units in batch.</value>
        [DataMember(Name = "units", EmitDefaultValue = false)]
        public int Units { get; set; }

        /// <summary>
        /// List of statuses for PA calculation units.
        /// </summary>
        /// <value>List of statuses for PA calculation units.</value>
        [DataMember(Name = "pa", EmitDefaultValue = false)]
        public Dictionary<string, CalculationUnitStatus> Pa { get; set; }

        /// <summary>
        /// List of statuses for SPAR calculation units.
        /// </summary>
        /// <value>List of statuses for SPAR calculation units.</value>
        [DataMember(Name = "spar", EmitDefaultValue = false)]
        public Dictionary<string, CalculationUnitStatus> Spar { get; set; }

        /// <summary>
        /// List of statuses for Vault calculation units.
        /// </summary>
        /// <value>List of statuses for Vault calculation units.</value>
        [DataMember(Name = "vault", EmitDefaultValue = false)]
        public Dictionary<string, CalculationUnitStatus> Vault { get; set; }

        /// <summary>
        /// List of statuses for Publisher calculation units.
        /// </summary>
        /// <value>List of statuses for Publisher calculation units.</value>
        [DataMember(Name = "pub", EmitDefaultValue = false)]
        public Dictionary<string, CalculationUnitStatus> Pub { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CalculationStatus {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Units: ").Append(Units).Append("\n");
            sb.Append("  Pa: ").Append(Pa).Append("\n");
            sb.Append("  Spar: ").Append(Spar).Append("\n");
            sb.Append("  Vault: ").Append(Vault).Append("\n");
            sb.Append("  Pub: ").Append(Pub).Append("\n");
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
            return this.Equals(input as CalculationStatus);
        }

        /// <summary>
        /// Returns true if CalculationStatus instances are equal
        /// </summary>
        /// <param name="input">Instance of CalculationStatus to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CalculationStatus input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.Units == input.Units ||
                    this.Units.Equals(input.Units)
                ) && 
                (
                    this.Pa == input.Pa ||
                    this.Pa != null &&
                    input.Pa != null &&
                    this.Pa.SequenceEqual(input.Pa)
                ) && 
                (
                    this.Spar == input.Spar ||
                    this.Spar != null &&
                    input.Spar != null &&
                    this.Spar.SequenceEqual(input.Spar)
                ) && 
                (
                    this.Vault == input.Vault ||
                    this.Vault != null &&
                    input.Vault != null &&
                    this.Vault.SequenceEqual(input.Vault)
                ) && 
                (
                    this.Pub == input.Pub ||
                    this.Pub != null &&
                    input.Pub != null &&
                    this.Pub.SequenceEqual(input.Pub)
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
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                hashCode = (hashCode * 59) + this.Units.GetHashCode();
                if (this.Pa != null)
                {
                    hashCode = (hashCode * 59) + this.Pa.GetHashCode();
                }
                if (this.Spar != null)
                {
                    hashCode = (hashCode * 59) + this.Spar.GetHashCode();
                }
                if (this.Vault != null)
                {
                    hashCode = (hashCode * 59) + this.Vault.GetHashCode();
                }
                if (this.Pub != null)
                {
                    hashCode = (hashCode * 59) + this.Pub.GetHashCode();
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
