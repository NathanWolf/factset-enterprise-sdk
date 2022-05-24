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
    /// Describes the potential loss associated with the investment product an investor shall be willing to accept.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_targetMarket_abilityToBearLosses")]
    public partial class InlineResponse20062DataTargetMarketAbilityToBearLosses : IEquatable<InlineResponse20062DataTargetMarketAbilityToBearLosses>, IValidatableObject
    {
        /// <summary>
        /// Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum NoCapitalLossEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.</value>
        [DataMember(Name = "noCapitalLoss", EmitDefaultValue = false)]
        public NoCapitalLossEnum? NoCapitalLoss { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors able to bear limited capital loss.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors able to bear limited capital loss.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LimitedCapitalLossEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors able to bear limited capital loss.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors able to bear limited capital loss.</value>
        [DataMember(Name = "limitedCapitalLoss", EmitDefaultValue = false)]
        public LimitedCapitalLossEnum? LimitedCapitalLoss { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors able to bear total capital loss.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors able to bear total capital loss.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum NoCapitalGuaranteeEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors able to bear total capital loss.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors able to bear total capital loss.</value>
        [DataMember(Name = "noCapitalGuarantee", EmitDefaultValue = false)]
        public NoCapitalGuaranteeEnum? NoCapitalGuarantee { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LossBeyondCapitalEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.</value>
        [DataMember(Name = "lossBeyondCapital", EmitDefaultValue = false)]
        public LossBeyondCapitalEnum? LossBeyondCapital { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataTargetMarketAbilityToBearLosses" /> class.
        /// </summary>
        /// <param name="noCapitalLoss">Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible..</param>
        /// <param name="limitedCapitalLoss">Indicates whether the investment product is suitable for investors able to bear limited capital loss..</param>
        /// <param name="noCapitalGuarantee">Indicates whether the investment product is suitable for investors able to bear total capital loss..</param>
        /// <param name="lossBeyondCapital">Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital..</param>
        /// <param name="maximumCapitalLoss">Maximum loss of the invested capital assumed the investment product is held until maturity..</param>
        public InlineResponse20062DataTargetMarketAbilityToBearLosses(NoCapitalLossEnum? noCapitalLoss = default(NoCapitalLossEnum?), LimitedCapitalLossEnum? limitedCapitalLoss = default(LimitedCapitalLossEnum?), NoCapitalGuaranteeEnum? noCapitalGuarantee = default(NoCapitalGuaranteeEnum?), LossBeyondCapitalEnum? lossBeyondCapital = default(LossBeyondCapitalEnum?), decimal maximumCapitalLoss = default(decimal))
        {
            this.NoCapitalLoss = noCapitalLoss;
            this.LimitedCapitalLoss = limitedCapitalLoss;
            this.NoCapitalGuarantee = noCapitalGuarantee;
            this.LossBeyondCapital = lossBeyondCapital;
            this.MaximumCapitalLoss = maximumCapitalLoss;
        }

        /// <summary>
        /// Maximum loss of the invested capital assumed the investment product is held until maturity.
        /// </summary>
        /// <value>Maximum loss of the invested capital assumed the investment product is held until maturity.</value>
        [DataMember(Name = "maximumCapitalLoss", EmitDefaultValue = false)]
        public decimal MaximumCapitalLoss { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataTargetMarketAbilityToBearLosses {\n");
            sb.Append("  NoCapitalLoss: ").Append(NoCapitalLoss).Append("\n");
            sb.Append("  LimitedCapitalLoss: ").Append(LimitedCapitalLoss).Append("\n");
            sb.Append("  NoCapitalGuarantee: ").Append(NoCapitalGuarantee).Append("\n");
            sb.Append("  LossBeyondCapital: ").Append(LossBeyondCapital).Append("\n");
            sb.Append("  MaximumCapitalLoss: ").Append(MaximumCapitalLoss).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataTargetMarketAbilityToBearLosses);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataTargetMarketAbilityToBearLosses instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataTargetMarketAbilityToBearLosses to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataTargetMarketAbilityToBearLosses input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NoCapitalLoss == input.NoCapitalLoss ||
                    this.NoCapitalLoss.Equals(input.NoCapitalLoss)
                ) && 
                (
                    this.LimitedCapitalLoss == input.LimitedCapitalLoss ||
                    this.LimitedCapitalLoss.Equals(input.LimitedCapitalLoss)
                ) && 
                (
                    this.NoCapitalGuarantee == input.NoCapitalGuarantee ||
                    this.NoCapitalGuarantee.Equals(input.NoCapitalGuarantee)
                ) && 
                (
                    this.LossBeyondCapital == input.LossBeyondCapital ||
                    this.LossBeyondCapital.Equals(input.LossBeyondCapital)
                ) && 
                (
                    this.MaximumCapitalLoss == input.MaximumCapitalLoss ||
                    this.MaximumCapitalLoss.Equals(input.MaximumCapitalLoss)
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
                hashCode = (hashCode * 59) + this.NoCapitalLoss.GetHashCode();
                hashCode = (hashCode * 59) + this.LimitedCapitalLoss.GetHashCode();
                hashCode = (hashCode * 59) + this.NoCapitalGuarantee.GetHashCode();
                hashCode = (hashCode * 59) + this.LossBeyondCapital.GetHashCode();
                hashCode = (hashCode * 59) + this.MaximumCapitalLoss.GetHashCode();
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
