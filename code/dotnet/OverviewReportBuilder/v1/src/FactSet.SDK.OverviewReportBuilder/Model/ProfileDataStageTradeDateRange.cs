/*
 * FactSet Overview Report Builder API
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// ProfileDataStageTradeDateRange
    /// </summary>
    [DataContract(Name = "ProfileData_stage_tradeDateRange")]
    public partial class ProfileDataStageTradeDateRange : IEquatable<ProfileDataStageTradeDateRange>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProfileDataStageTradeDateRange" /> class.
        /// </summary>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        public ProfileDataStageTradeDateRange(ProfileDataBusinessIndustry start = default(ProfileDataBusinessIndustry), ProfileDataBusinessIndustry end = default(ProfileDataBusinessIndustry))
        {
            this.Start = start;
            this.End = end;
        }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name = "start", EmitDefaultValue = false)]
        public ProfileDataBusinessIndustry Start { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        public ProfileDataBusinessIndustry End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ProfileDataStageTradeDateRange {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as ProfileDataStageTradeDateRange);
        }

        /// <summary>
        /// Returns true if ProfileDataStageTradeDateRange instances are equal
        /// </summary>
        /// <param name="input">Instance of ProfileDataStageTradeDateRange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProfileDataStageTradeDateRange input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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
