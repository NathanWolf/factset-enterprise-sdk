/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Upper bound.
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data_range_upper")]
    public partial class InlineResponse2007DataRangeUpper : IEquatable<InlineResponse2007DataRangeUpper>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007DataRangeUpper" /> class.
        /// </summary>
        /// <param name="level">level.</param>
        /// <param name="breach">breach.</param>
        /// <param name="distance">distance.</param>
        /// <param name="participationFactor">participationFactor.</param>
        public InlineResponse2007DataRangeUpper(InlineResponse2007DataRangeUpperLevel level = default(InlineResponse2007DataRangeUpperLevel), InlineResponse2007DataRangeUpperBreach breach = default(InlineResponse2007DataRangeUpperBreach), InlineResponse2007DataRangeUpperDistance distance = default(InlineResponse2007DataRangeUpperDistance), InlineResponse2007DataRangeUpperParticipationFactor participationFactor = default(InlineResponse2007DataRangeUpperParticipationFactor))
        {
            this.Level = level;
            this.Breach = breach;
            this.Distance = distance;
            this.ParticipationFactor = participationFactor;
        }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", EmitDefaultValue = false)]
        public InlineResponse2007DataRangeUpperLevel Level { get; set; }

        /// <summary>
        /// Gets or Sets Breach
        /// </summary>
        [DataMember(Name = "breach", EmitDefaultValue = false)]
        public InlineResponse2007DataRangeUpperBreach Breach { get; set; }

        /// <summary>
        /// Gets or Sets Distance
        /// </summary>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public InlineResponse2007DataRangeUpperDistance Distance { get; set; }

        /// <summary>
        /// Gets or Sets ParticipationFactor
        /// </summary>
        [DataMember(Name = "participationFactor", EmitDefaultValue = false)]
        public InlineResponse2007DataRangeUpperParticipationFactor ParticipationFactor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2007DataRangeUpper {\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Breach: ").Append(Breach).Append("\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  ParticipationFactor: ").Append(ParticipationFactor).Append("\n");
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
            return this.Equals(input as InlineResponse2007DataRangeUpper);
        }

        /// <summary>
        /// Returns true if InlineResponse2007DataRangeUpper instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007DataRangeUpper to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007DataRangeUpper input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.Breach == input.Breach ||
                    (this.Breach != null &&
                    this.Breach.Equals(input.Breach))
                ) && 
                (
                    this.Distance == input.Distance ||
                    (this.Distance != null &&
                    this.Distance.Equals(input.Distance))
                ) && 
                (
                    this.ParticipationFactor == input.ParticipationFactor ||
                    (this.ParticipationFactor != null &&
                    this.ParticipationFactor.Equals(input.ParticipationFactor))
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
                if (this.Level != null)
                {
                    hashCode = (hashCode * 59) + this.Level.GetHashCode();
                }
                if (this.Breach != null)
                {
                    hashCode = (hashCode * 59) + this.Breach.GetHashCode();
                }
                if (this.Distance != null)
                {
                    hashCode = (hashCode * 59) + this.Distance.GetHashCode();
                }
                if (this.ParticipationFactor != null)
                {
                    hashCode = (hashCode * 59) + this.ParticipationFactor.GetHashCode();
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
