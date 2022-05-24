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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Criteria that filter the items in the response list; only items that match all of the criteria are returned.
    /// </summary>
    [DataContract(Name = "_instrument_rating_grade_list_data_filter")]
    public partial class InstrumentRatingGradeListDataFilter : IEquatable<InstrumentRatingGradeListDataFilter>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstrumentRatingGradeListDataFilter" /> class.
        /// </summary>
        /// <param name="ratingSystem">ratingSystem.</param>
        public InstrumentRatingGradeListDataFilter(InstrumentRatingGradeListDataFilterRatingSystem ratingSystem = default(InstrumentRatingGradeListDataFilterRatingSystem))
        {
            this.RatingSystem = ratingSystem;
        }

        /// <summary>
        /// Gets or Sets RatingSystem
        /// </summary>
        [DataMember(Name = "ratingSystem", EmitDefaultValue = false)]
        public InstrumentRatingGradeListDataFilterRatingSystem RatingSystem { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InstrumentRatingGradeListDataFilter {\n");
            sb.Append("  RatingSystem: ").Append(RatingSystem).Append("\n");
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
            return this.Equals(input as InstrumentRatingGradeListDataFilter);
        }

        /// <summary>
        /// Returns true if InstrumentRatingGradeListDataFilter instances are equal
        /// </summary>
        /// <param name="input">Instance of InstrumentRatingGradeListDataFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstrumentRatingGradeListDataFilter input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RatingSystem == input.RatingSystem ||
                    (this.RatingSystem != null &&
                    this.RatingSystem.Equals(input.RatingSystem))
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
                if (this.RatingSystem != null)
                {
                    hashCode = (hashCode * 59) + this.RatingSystem.GetHashCode();
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
