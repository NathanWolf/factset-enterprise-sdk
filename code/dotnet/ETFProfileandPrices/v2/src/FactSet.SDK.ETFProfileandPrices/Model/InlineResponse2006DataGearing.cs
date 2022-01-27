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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// Gearing.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_data_gearing")]
    public partial class InlineResponse2006DataGearing : IEquatable<InlineResponse2006DataGearing>, IValidatableObject
    {
        /// <summary>
        /// Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExposureResetPeriodEnum
        {
            /// <summary>
            /// Enum Daily for value: Daily
            /// </summary>
            [EnumMember(Value = "Daily")]
            Daily = 1,

            /// <summary>
            /// Enum Variable for value: Variable
            /// </summary>
            [EnumMember(Value = "Variable")]
            Variable = 2,

            /// <summary>
            /// Enum None for value: None
            /// </summary>
            [EnumMember(Value = "None")]
            None = 3,

            /// <summary>
            /// Enum Monthly for value: Monthly
            /// </summary>
            [EnumMember(Value = "Monthly")]
            Monthly = 4,

            /// <summary>
            /// Enum Quarterly for value: Quarterly
            /// </summary>
            [EnumMember(Value = "Quarterly")]
            Quarterly = 5

        }


        /// <summary>
        /// Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions.</value>
        [DataMember(Name = "exposureResetPeriod", EmitDefaultValue = false)]
        public ExposureResetPeriodEnum? ExposureResetPeriod { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006DataGearing" /> class.
        /// </summary>
        /// <param name="isInverseFund">Flags ETPs that deliver short exposure to an index, including leveraged short exposure. This data is available for all the regions..</param>
        /// <param name="leverage">leverage.</param>
        /// <param name="exposureResetPeriod">Exposure reset frequency of leveraged and inverse ETPs, text and standardized value available. This data is available for all the regions..</param>
        public InlineResponse2006DataGearing(bool isInverseFund = default(bool), InlineResponse2006DataGearingLeverage leverage = default(InlineResponse2006DataGearingLeverage), ExposureResetPeriodEnum? exposureResetPeriod = default(ExposureResetPeriodEnum?))
        {
            this.IsInverseFund = isInverseFund;
            this.Leverage = leverage;
            this.ExposureResetPeriod = exposureResetPeriod;
        }

        /// <summary>
        /// Flags ETPs that deliver short exposure to an index, including leveraged short exposure. This data is available for all the regions.
        /// </summary>
        /// <value>Flags ETPs that deliver short exposure to an index, including leveraged short exposure. This data is available for all the regions.</value>
        [DataMember(Name = "isInverseFund", EmitDefaultValue = true)]
        public bool IsInverseFund { get; set; }

        /// <summary>
        /// Gets or Sets Leverage
        /// </summary>
        [DataMember(Name = "leverage", EmitDefaultValue = false)]
        public InlineResponse2006DataGearingLeverage Leverage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2006DataGearing {\n");
            sb.Append("  IsInverseFund: ").Append(IsInverseFund).Append("\n");
            sb.Append("  Leverage: ").Append(Leverage).Append("\n");
            sb.Append("  ExposureResetPeriod: ").Append(ExposureResetPeriod).Append("\n");
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
            return this.Equals(input as InlineResponse2006DataGearing);
        }

        /// <summary>
        /// Returns true if InlineResponse2006DataGearing instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006DataGearing to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006DataGearing input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IsInverseFund == input.IsInverseFund ||
                    this.IsInverseFund.Equals(input.IsInverseFund)
                ) && 
                (
                    this.Leverage == input.Leverage ||
                    (this.Leverage != null &&
                    this.Leverage.Equals(input.Leverage))
                ) && 
                (
                    this.ExposureResetPeriod == input.ExposureResetPeriod ||
                    this.ExposureResetPeriod.Equals(input.ExposureResetPeriod)
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
                hashCode = hashCode * 59 + this.IsInverseFund.GetHashCode();
                if (this.Leverage != null)
                    hashCode = hashCode * 59 + this.Leverage.GetHashCode();
                hashCode = hashCode * 59 + this.ExposureResetPeriod.GetHashCode();
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
