/*
 * fpo_mp_input
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.OptimizationEngineAPIMultiperiod.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OptimizationEngineAPIMultiperiod.Model
{
    /// <summary>
    /// VARDistributionDescription
    /// </summary>
    [DataContract(Name = "VAR.DistributionDescription")]
    public partial class VARDistributionDescription : IEquatable<VARDistributionDescription>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VARDistributionDescription" /> class.
        /// </summary>
        /// <param name="riskModel">riskModel.</param>
        /// <param name="factorGroup">factorGroup.</param>
        /// <param name="factors">factors.</param>
        /// <param name="distributionType">distributionType.</param>
        /// <param name="reportDate">reportDate.</param>
        /// <param name="reportCurrency">reportCurrency.</param>
        /// <param name="horizonInTradingDays">horizonInTradingDays.</param>
        /// <param name="returnDates">Only possibly defined for historical distributions.</param>
        public VARDistributionDescription(string riskModel = default(string), string factorGroup = default(string), List<string> factors = default(List<string>), VARDistributionType distributionType = default(VARDistributionType), int reportDate = default(int), string reportCurrency = default(string), float horizonInTradingDays = default(float), List<int> returnDates = default(List<int>))
        {
            this.RiskModel = riskModel;
            this.FactorGroup = factorGroup;
            this.Factors = factors;
            this.DistributionType = distributionType;
            this.ReportDate = reportDate;
            this.ReportCurrency = reportCurrency;
            this.HorizonInTradingDays = horizonInTradingDays;
            this.ReturnDates = returnDates;
        }

        /// <summary>
        /// Gets or Sets RiskModel
        /// </summary>
        [DataMember(Name = "riskModel", EmitDefaultValue = false)]
        public string RiskModel { get; set; }

        /// <summary>
        /// Gets or Sets FactorGroup
        /// </summary>
        [DataMember(Name = "factorGroup", EmitDefaultValue = false)]
        public string FactorGroup { get; set; }

        /// <summary>
        /// Gets or Sets Factors
        /// </summary>
        [DataMember(Name = "factors", EmitDefaultValue = false)]
        public List<string> Factors { get; set; }

        /// <summary>
        /// Gets or Sets DistributionType
        /// </summary>
        [DataMember(Name = "distributionType", EmitDefaultValue = false)]
        public VARDistributionType DistributionType { get; set; }

        /// <summary>
        /// Gets or Sets ReportDate
        /// </summary>
        [DataMember(Name = "reportDate", EmitDefaultValue = false)]
        public int ReportDate { get; set; }

        /// <summary>
        /// Gets or Sets ReportCurrency
        /// </summary>
        [DataMember(Name = "reportCurrency", EmitDefaultValue = false)]
        public string ReportCurrency { get; set; }

        /// <summary>
        /// Gets or Sets HorizonInTradingDays
        /// </summary>
        [DataMember(Name = "horizonInTradingDays", EmitDefaultValue = false)]
        public float HorizonInTradingDays { get; set; }

        /// <summary>
        /// Only possibly defined for historical distributions
        /// </summary>
        /// <value>Only possibly defined for historical distributions</value>
        [DataMember(Name = "returnDates", EmitDefaultValue = false)]
        public List<int> ReturnDates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VARDistributionDescription {\n");
            sb.Append("  RiskModel: ").Append(RiskModel).Append("\n");
            sb.Append("  FactorGroup: ").Append(FactorGroup).Append("\n");
            sb.Append("  Factors: ").Append(Factors).Append("\n");
            sb.Append("  DistributionType: ").Append(DistributionType).Append("\n");
            sb.Append("  ReportDate: ").Append(ReportDate).Append("\n");
            sb.Append("  ReportCurrency: ").Append(ReportCurrency).Append("\n");
            sb.Append("  HorizonInTradingDays: ").Append(HorizonInTradingDays).Append("\n");
            sb.Append("  ReturnDates: ").Append(ReturnDates).Append("\n");
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
            return this.Equals(input as VARDistributionDescription);
        }

        /// <summary>
        /// Returns true if VARDistributionDescription instances are equal
        /// </summary>
        /// <param name="input">Instance of VARDistributionDescription to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VARDistributionDescription input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RiskModel == input.RiskModel ||
                    (this.RiskModel != null &&
                    this.RiskModel.Equals(input.RiskModel))
                ) && 
                (
                    this.FactorGroup == input.FactorGroup ||
                    (this.FactorGroup != null &&
                    this.FactorGroup.Equals(input.FactorGroup))
                ) && 
                (
                    this.Factors == input.Factors ||
                    this.Factors != null &&
                    input.Factors != null &&
                    this.Factors.SequenceEqual(input.Factors)
                ) && 
                (
                    this.DistributionType == input.DistributionType ||
                    (this.DistributionType != null &&
                    this.DistributionType.Equals(input.DistributionType))
                ) && 
                (
                    this.ReportDate == input.ReportDate ||
                    this.ReportDate.Equals(input.ReportDate)
                ) && 
                (
                    this.ReportCurrency == input.ReportCurrency ||
                    (this.ReportCurrency != null &&
                    this.ReportCurrency.Equals(input.ReportCurrency))
                ) && 
                (
                    this.HorizonInTradingDays == input.HorizonInTradingDays ||
                    this.HorizonInTradingDays.Equals(input.HorizonInTradingDays)
                ) && 
                (
                    this.ReturnDates == input.ReturnDates ||
                    this.ReturnDates != null &&
                    input.ReturnDates != null &&
                    this.ReturnDates.SequenceEqual(input.ReturnDates)
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
                if (this.RiskModel != null)
                {
                    hashCode = (hashCode * 59) + this.RiskModel.GetHashCode();
                }
                if (this.FactorGroup != null)
                {
                    hashCode = (hashCode * 59) + this.FactorGroup.GetHashCode();
                }
                if (this.Factors != null)
                {
                    hashCode = (hashCode * 59) + this.Factors.GetHashCode();
                }
                if (this.DistributionType != null)
                {
                    hashCode = (hashCode * 59) + this.DistributionType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ReportDate.GetHashCode();
                if (this.ReportCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.ReportCurrency.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.HorizonInTradingDays.GetHashCode();
                if (this.ReturnDates != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnDates.GetHashCode();
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
