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
    /// Value ranges related to the volatility for different time ranges.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_volatility")]
    public partial class InlineResponse2005DataVolatility : IEquatable<InlineResponse2005DataVolatility>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataVolatility" /> class.
        /// </summary>
        /// <param name="week1">week1.</param>
        /// <param name="month1">month1.</param>
        /// <param name="months3">months3.</param>
        /// <param name="months6">months6.</param>
        /// <param name="year1">year1.</param>
        /// <param name="years3">years3.</param>
        /// <param name="years5">years5.</param>
        /// <param name="yearToDate">yearToDate.</param>
        public InlineResponse2005DataVolatility(InlineResponse2005DataPerformanceEndOfDayWeek1 week1 = default(InlineResponse2005DataPerformanceEndOfDayWeek1), InlineResponse2005DataPerformanceEndOfDayMonth1 month1 = default(InlineResponse2005DataPerformanceEndOfDayMonth1), InlineResponse2005DataPerformanceEndOfDayMonths3 months3 = default(InlineResponse2005DataPerformanceEndOfDayMonths3), InlineResponse2005DataPerformanceEndOfDayMonths6 months6 = default(InlineResponse2005DataPerformanceEndOfDayMonths6), InlineResponse2005DataPerformanceEndOfDayYear1 year1 = default(InlineResponse2005DataPerformanceEndOfDayYear1), InlineResponse2005DataPerformanceEndOfDayYears3 years3 = default(InlineResponse2005DataPerformanceEndOfDayYears3), InlineResponse2005DataPerformanceEndOfDayYears5 years5 = default(InlineResponse2005DataPerformanceEndOfDayYears5), InlineResponse2005DataPerformanceEndOfDayYearToDate yearToDate = default(InlineResponse2005DataPerformanceEndOfDayYearToDate))
        {
            this.Week1 = week1;
            this.Month1 = month1;
            this.Months3 = months3;
            this.Months6 = months6;
            this.Year1 = year1;
            this.Years3 = years3;
            this.Years5 = years5;
            this.YearToDate = yearToDate;
        }

        /// <summary>
        /// Gets or Sets Week1
        /// </summary>
        [DataMember(Name = "week1", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayWeek1 Week1 { get; set; }

        /// <summary>
        /// Gets or Sets Month1
        /// </summary>
        [DataMember(Name = "month1", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayMonth1 Month1 { get; set; }

        /// <summary>
        /// Gets or Sets Months3
        /// </summary>
        [DataMember(Name = "months3", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayMonths3 Months3 { get; set; }

        /// <summary>
        /// Gets or Sets Months6
        /// </summary>
        [DataMember(Name = "months6", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayMonths6 Months6 { get; set; }

        /// <summary>
        /// Gets or Sets Year1
        /// </summary>
        [DataMember(Name = "year1", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayYear1 Year1 { get; set; }

        /// <summary>
        /// Gets or Sets Years3
        /// </summary>
        [DataMember(Name = "years3", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayYears3 Years3 { get; set; }

        /// <summary>
        /// Gets or Sets Years5
        /// </summary>
        [DataMember(Name = "years5", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayYears5 Years5 { get; set; }

        /// <summary>
        /// Gets or Sets YearToDate
        /// </summary>
        [DataMember(Name = "yearToDate", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDayYearToDate YearToDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataVolatility {\n");
            sb.Append("  Week1: ").Append(Week1).Append("\n");
            sb.Append("  Month1: ").Append(Month1).Append("\n");
            sb.Append("  Months3: ").Append(Months3).Append("\n");
            sb.Append("  Months6: ").Append(Months6).Append("\n");
            sb.Append("  Year1: ").Append(Year1).Append("\n");
            sb.Append("  Years3: ").Append(Years3).Append("\n");
            sb.Append("  Years5: ").Append(Years5).Append("\n");
            sb.Append("  YearToDate: ").Append(YearToDate).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataVolatility);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataVolatility instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataVolatility to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataVolatility input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Week1 == input.Week1 ||
                    (this.Week1 != null &&
                    this.Week1.Equals(input.Week1))
                ) && 
                (
                    this.Month1 == input.Month1 ||
                    (this.Month1 != null &&
                    this.Month1.Equals(input.Month1))
                ) && 
                (
                    this.Months3 == input.Months3 ||
                    (this.Months3 != null &&
                    this.Months3.Equals(input.Months3))
                ) && 
                (
                    this.Months6 == input.Months6 ||
                    (this.Months6 != null &&
                    this.Months6.Equals(input.Months6))
                ) && 
                (
                    this.Year1 == input.Year1 ||
                    (this.Year1 != null &&
                    this.Year1.Equals(input.Year1))
                ) && 
                (
                    this.Years3 == input.Years3 ||
                    (this.Years3 != null &&
                    this.Years3.Equals(input.Years3))
                ) && 
                (
                    this.Years5 == input.Years5 ||
                    (this.Years5 != null &&
                    this.Years5.Equals(input.Years5))
                ) && 
                (
                    this.YearToDate == input.YearToDate ||
                    (this.YearToDate != null &&
                    this.YearToDate.Equals(input.YearToDate))
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
                if (this.Week1 != null)
                {
                    hashCode = (hashCode * 59) + this.Week1.GetHashCode();
                }
                if (this.Month1 != null)
                {
                    hashCode = (hashCode * 59) + this.Month1.GetHashCode();
                }
                if (this.Months3 != null)
                {
                    hashCode = (hashCode * 59) + this.Months3.GetHashCode();
                }
                if (this.Months6 != null)
                {
                    hashCode = (hashCode * 59) + this.Months6.GetHashCode();
                }
                if (this.Year1 != null)
                {
                    hashCode = (hashCode * 59) + this.Year1.GetHashCode();
                }
                if (this.Years3 != null)
                {
                    hashCode = (hashCode * 59) + this.Years3.GetHashCode();
                }
                if (this.Years5 != null)
                {
                    hashCode = (hashCode * 59) + this.Years5.GetHashCode();
                }
                if (this.YearToDate != null)
                {
                    hashCode = (hashCode * 59) + this.YearToDate.GetHashCode();
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
