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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data")]
    public partial class DebtInstrumentNotationScreenerSearchData : IEquatable<DebtInstrumentNotationScreenerSearchData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchData" /> class.
        /// </summary>
        /// <param name="validation">validation.</param>
        /// <param name="lifeCycle">lifeCycle.</param>
        /// <param name="subordinated">Restricts the result to debt instruments that are subordinated (&#x60;true&#x60;) or are not subordinated (&#x60;false&#x60;). In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated..</param>
        /// <param name="rating">rating.</param>
        /// <param name="issuer">issuer.</param>
        /// <param name="issue">issue.</param>
        /// <param name="tradingVolume">tradingVolume.</param>
        /// <param name="compliance">compliance.</param>
        /// <param name="coupon">coupon.</param>
        /// <param name="yield">yield.</param>
        /// <param name="macaulayDuration">macaulayDuration.</param>
        /// <param name="sensitivities">sensitivities.</param>
        /// <param name="tradedValue">tradedValue.</param>
        public DebtInstrumentNotationScreenerSearchData(DebtInstrumentNotationScreenerSearchDataValidation validation = default(DebtInstrumentNotationScreenerSearchDataValidation), DebtInstrumentNotationScreenerSearchDataLifeCycle lifeCycle = default(DebtInstrumentNotationScreenerSearchDataLifeCycle), bool subordinated = default(bool), DebtInstrumentNotationScreenerSearchDataRating rating = default(DebtInstrumentNotationScreenerSearchDataRating), DebtInstrumentNotationScreenerSearchDataIssuer issuer = default(DebtInstrumentNotationScreenerSearchDataIssuer), DebtInstrumentNotationScreenerSearchDataIssue issue = default(DebtInstrumentNotationScreenerSearchDataIssue), DebtInstrumentNotationScreenerSearchDataTradingVolume tradingVolume = default(DebtInstrumentNotationScreenerSearchDataTradingVolume), DebtInstrumentNotationScreenerSearchDataCompliance compliance = default(DebtInstrumentNotationScreenerSearchDataCompliance), DebtInstrumentNotationScreenerSearchDataCoupon coupon = default(DebtInstrumentNotationScreenerSearchDataCoupon), DebtInstrumentNotationScreenerSearchDataYield yield = default(DebtInstrumentNotationScreenerSearchDataYield), DebtInstrumentNotationScreenerSearchDataMacaulayDuration macaulayDuration = default(DebtInstrumentNotationScreenerSearchDataMacaulayDuration), DebtInstrumentNotationScreenerSearchDataSensitivities sensitivities = default(DebtInstrumentNotationScreenerSearchDataSensitivities), DebtInstrumentNotationScreenerSearchDataTradedValue tradedValue = default(DebtInstrumentNotationScreenerSearchDataTradedValue))
        {
            this.Validation = validation;
            this.LifeCycle = lifeCycle;
            this.Subordinated = subordinated;
            this.Rating = rating;
            this.Issuer = issuer;
            this.Issue = issue;
            this.TradingVolume = tradingVolume;
            this.Compliance = compliance;
            this.Coupon = coupon;
            this.Yield = yield;
            this.MacaulayDuration = macaulayDuration;
            this.Sensitivities = sensitivities;
            this.TradedValue = tradedValue;
        }

        /// <summary>
        /// Gets or Sets Validation
        /// </summary>
        [DataMember(Name = "validation", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidation Validation { get; set; }

        /// <summary>
        /// Gets or Sets LifeCycle
        /// </summary>
        [DataMember(Name = "lifeCycle", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataLifeCycle LifeCycle { get; set; }

        /// <summary>
        /// Restricts the result to debt instruments that are subordinated (&#x60;true&#x60;) or are not subordinated (&#x60;false&#x60;). In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.
        /// </summary>
        /// <value>Restricts the result to debt instruments that are subordinated (&#x60;true&#x60;) or are not subordinated (&#x60;false&#x60;). In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.</value>
        [DataMember(Name = "subordinated", EmitDefaultValue = true)]
        public bool Subordinated { get; set; }

        /// <summary>
        /// Gets or Sets Rating
        /// </summary>
        [DataMember(Name = "rating", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataRating Rating { get; set; }

        /// <summary>
        /// Gets or Sets Issuer
        /// </summary>
        [DataMember(Name = "issuer", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataIssuer Issuer { get; set; }

        /// <summary>
        /// Gets or Sets Issue
        /// </summary>
        [DataMember(Name = "issue", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataIssue Issue { get; set; }

        /// <summary>
        /// Gets or Sets TradingVolume
        /// </summary>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataTradingVolume TradingVolume { get; set; }

        /// <summary>
        /// Gets or Sets Compliance
        /// </summary>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataCompliance Compliance { get; set; }

        /// <summary>
        /// Gets or Sets Coupon
        /// </summary>
        [DataMember(Name = "coupon", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataCoupon Coupon { get; set; }

        /// <summary>
        /// Gets or Sets Yield
        /// </summary>
        [DataMember(Name = "yield", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataYield Yield { get; set; }

        /// <summary>
        /// Gets or Sets MacaulayDuration
        /// </summary>
        [DataMember(Name = "macaulayDuration", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataMacaulayDuration MacaulayDuration { get; set; }

        /// <summary>
        /// Gets or Sets Sensitivities
        /// </summary>
        [DataMember(Name = "sensitivities", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataSensitivities Sensitivities { get; set; }

        /// <summary>
        /// Gets or Sets TradedValue
        /// </summary>
        [DataMember(Name = "tradedValue", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataTradedValue TradedValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchData {\n");
            sb.Append("  Validation: ").Append(Validation).Append("\n");
            sb.Append("  LifeCycle: ").Append(LifeCycle).Append("\n");
            sb.Append("  Subordinated: ").Append(Subordinated).Append("\n");
            sb.Append("  Rating: ").Append(Rating).Append("\n");
            sb.Append("  Issuer: ").Append(Issuer).Append("\n");
            sb.Append("  Issue: ").Append(Issue).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
            sb.Append("  Coupon: ").Append(Coupon).Append("\n");
            sb.Append("  Yield: ").Append(Yield).Append("\n");
            sb.Append("  MacaulayDuration: ").Append(MacaulayDuration).Append("\n");
            sb.Append("  Sensitivities: ").Append(Sensitivities).Append("\n");
            sb.Append("  TradedValue: ").Append(TradedValue).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchData);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchData instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Validation == input.Validation ||
                    (this.Validation != null &&
                    this.Validation.Equals(input.Validation))
                ) && 
                (
                    this.LifeCycle == input.LifeCycle ||
                    (this.LifeCycle != null &&
                    this.LifeCycle.Equals(input.LifeCycle))
                ) && 
                (
                    this.Subordinated == input.Subordinated ||
                    this.Subordinated.Equals(input.Subordinated)
                ) && 
                (
                    this.Rating == input.Rating ||
                    (this.Rating != null &&
                    this.Rating.Equals(input.Rating))
                ) && 
                (
                    this.Issuer == input.Issuer ||
                    (this.Issuer != null &&
                    this.Issuer.Equals(input.Issuer))
                ) && 
                (
                    this.Issue == input.Issue ||
                    (this.Issue != null &&
                    this.Issue.Equals(input.Issue))
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    (this.TradingVolume != null &&
                    this.TradingVolume.Equals(input.TradingVolume))
                ) && 
                (
                    this.Compliance == input.Compliance ||
                    (this.Compliance != null &&
                    this.Compliance.Equals(input.Compliance))
                ) && 
                (
                    this.Coupon == input.Coupon ||
                    (this.Coupon != null &&
                    this.Coupon.Equals(input.Coupon))
                ) && 
                (
                    this.Yield == input.Yield ||
                    (this.Yield != null &&
                    this.Yield.Equals(input.Yield))
                ) && 
                (
                    this.MacaulayDuration == input.MacaulayDuration ||
                    (this.MacaulayDuration != null &&
                    this.MacaulayDuration.Equals(input.MacaulayDuration))
                ) && 
                (
                    this.Sensitivities == input.Sensitivities ||
                    (this.Sensitivities != null &&
                    this.Sensitivities.Equals(input.Sensitivities))
                ) && 
                (
                    this.TradedValue == input.TradedValue ||
                    (this.TradedValue != null &&
                    this.TradedValue.Equals(input.TradedValue))
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
                if (this.Validation != null)
                    hashCode = hashCode * 59 + this.Validation.GetHashCode();
                if (this.LifeCycle != null)
                    hashCode = hashCode * 59 + this.LifeCycle.GetHashCode();
                hashCode = hashCode * 59 + this.Subordinated.GetHashCode();
                if (this.Rating != null)
                    hashCode = hashCode * 59 + this.Rating.GetHashCode();
                if (this.Issuer != null)
                    hashCode = hashCode * 59 + this.Issuer.GetHashCode();
                if (this.Issue != null)
                    hashCode = hashCode * 59 + this.Issue.GetHashCode();
                if (this.TradingVolume != null)
                    hashCode = hashCode * 59 + this.TradingVolume.GetHashCode();
                if (this.Compliance != null)
                    hashCode = hashCode * 59 + this.Compliance.GetHashCode();
                if (this.Coupon != null)
                    hashCode = hashCode * 59 + this.Coupon.GetHashCode();
                if (this.Yield != null)
                    hashCode = hashCode * 59 + this.Yield.GetHashCode();
                if (this.MacaulayDuration != null)
                    hashCode = hashCode * 59 + this.MacaulayDuration.GetHashCode();
                if (this.Sensitivities != null)
                    hashCode = hashCode * 59 + this.Sensitivities.GetHashCode();
                if (this.TradedValue != null)
                    hashCode = hashCode * 59 + this.TradedValue.GetHashCode();
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
