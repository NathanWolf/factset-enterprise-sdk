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
    /// Validation parameters.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_validation")]
    public partial class DebtInstrumentNotationScreenerSearchDataValidation : IEquatable<DebtInstrumentNotationScreenerSearchDataValidation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataValidation" /> class.
        /// </summary>
        /// <param name="onlyActive">If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months. (default to true).</param>
        /// <param name="onlyNotSuspended">If &#x60;true&#x60;, only notations not suspended from trading will be returned. (default to false).</param>
        /// <param name="prices">prices.</param>
        /// <param name="valueUnit">valueUnit.</param>
        /// <param name="market">market.</param>
        /// <param name="instrumentSelectionList">instrumentSelectionList.</param>
        /// <param name="notationSelectionList">notationSelectionList.</param>
        /// <param name="categorization">categorization.</param>
        public DebtInstrumentNotationScreenerSearchDataValidation(bool onlyActive = true, bool onlyNotSuspended = false, DebtInstrumentNotationScreenerSearchDataValidationPrices prices = default(DebtInstrumentNotationScreenerSearchDataValidationPrices), DebtInstrumentNotationScreenerSearchDataValidationValueUnit valueUnit = default(DebtInstrumentNotationScreenerSearchDataValidationValueUnit), DebtInstrumentNotationScreenerSearchDataValidationMarket market = default(DebtInstrumentNotationScreenerSearchDataValidationMarket), DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList = default(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList), DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList = default(DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList), DebtInstrumentNotationScreenerSearchDataValidationCategorization categorization = default(DebtInstrumentNotationScreenerSearchDataValidationCategorization))
        {
            this.OnlyActive = onlyActive;
            this.OnlyNotSuspended = onlyNotSuspended;
            this.Prices = prices;
            this.ValueUnit = valueUnit;
            this.Market = market;
            this.InstrumentSelectionList = instrumentSelectionList;
            this.NotationSelectionList = notationSelectionList;
            this.Categorization = categorization;
        }

        /// <summary>
        /// If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
        /// </summary>
        /// <value>If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.</value>
        [DataMember(Name = "onlyActive", EmitDefaultValue = true)]
        public bool OnlyActive { get; set; }

        /// <summary>
        /// If &#x60;true&#x60;, only notations not suspended from trading will be returned.
        /// </summary>
        /// <value>If &#x60;true&#x60;, only notations not suspended from trading will be returned.</value>
        [DataMember(Name = "onlyNotSuspended", EmitDefaultValue = true)]
        public bool OnlyNotSuspended { get; set; }

        /// <summary>
        /// Gets or Sets Prices
        /// </summary>
        [DataMember(Name = "prices", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationPrices Prices { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationMarket Market { get; set; }

        /// <summary>
        /// Gets or Sets InstrumentSelectionList
        /// </summary>
        [DataMember(Name = "instrumentSelectionList", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList InstrumentSelectionList { get; set; }

        /// <summary>
        /// Gets or Sets NotationSelectionList
        /// </summary>
        [DataMember(Name = "notationSelectionList", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList NotationSelectionList { get; set; }

        /// <summary>
        /// Gets or Sets Categorization
        /// </summary>
        [DataMember(Name = "categorization", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationCategorization Categorization { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataValidation {\n");
            sb.Append("  OnlyActive: ").Append(OnlyActive).Append("\n");
            sb.Append("  OnlyNotSuspended: ").Append(OnlyNotSuspended).Append("\n");
            sb.Append("  Prices: ").Append(Prices).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  InstrumentSelectionList: ").Append(InstrumentSelectionList).Append("\n");
            sb.Append("  NotationSelectionList: ").Append(NotationSelectionList).Append("\n");
            sb.Append("  Categorization: ").Append(Categorization).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataValidation);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataValidation instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataValidation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataValidation input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OnlyActive == input.OnlyActive ||
                    this.OnlyActive.Equals(input.OnlyActive)
                ) && 
                (
                    this.OnlyNotSuspended == input.OnlyNotSuspended ||
                    this.OnlyNotSuspended.Equals(input.OnlyNotSuspended)
                ) && 
                (
                    this.Prices == input.Prices ||
                    (this.Prices != null &&
                    this.Prices.Equals(input.Prices))
                ) && 
                (
                    this.ValueUnit == input.ValueUnit ||
                    (this.ValueUnit != null &&
                    this.ValueUnit.Equals(input.ValueUnit))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.InstrumentSelectionList == input.InstrumentSelectionList ||
                    (this.InstrumentSelectionList != null &&
                    this.InstrumentSelectionList.Equals(input.InstrumentSelectionList))
                ) && 
                (
                    this.NotationSelectionList == input.NotationSelectionList ||
                    (this.NotationSelectionList != null &&
                    this.NotationSelectionList.Equals(input.NotationSelectionList))
                ) && 
                (
                    this.Categorization == input.Categorization ||
                    (this.Categorization != null &&
                    this.Categorization.Equals(input.Categorization))
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
                hashCode = hashCode * 59 + this.OnlyActive.GetHashCode();
                hashCode = hashCode * 59 + this.OnlyNotSuspended.GetHashCode();
                if (this.Prices != null)
                    hashCode = hashCode * 59 + this.Prices.GetHashCode();
                if (this.ValueUnit != null)
                    hashCode = hashCode * 59 + this.ValueUnit.GetHashCode();
                if (this.Market != null)
                    hashCode = hashCode * 59 + this.Market.GetHashCode();
                if (this.InstrumentSelectionList != null)
                    hashCode = hashCode * 59 + this.InstrumentSelectionList.GetHashCode();
                if (this.NotationSelectionList != null)
                    hashCode = hashCode * 59 + this.NotationSelectionList.GetHashCode();
                if (this.Categorization != null)
                    hashCode = hashCode * 59 + this.Categorization.GetHashCode();
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
