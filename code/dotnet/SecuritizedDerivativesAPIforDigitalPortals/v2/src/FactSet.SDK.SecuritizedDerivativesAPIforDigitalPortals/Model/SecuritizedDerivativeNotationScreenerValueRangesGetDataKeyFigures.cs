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
    /// Key figures specific to securitized derivatives; based on ask prices.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures" /> class.
        /// </summary>
        /// <param name="bonusYield">bonusYield.</param>
        /// <param name="sidewaysYield">sidewaysYield.</param>
        /// <param name="maximumYield">maximumYield.</param>
        /// <param name="agio">agio.</param>
        /// <param name="discount">discount.</param>
        /// <param name="breakEven">breakEven.</param>
        /// <param name="spread">spread.</param>
        /// <param name="delta">delta.</param>
        /// <param name="thetaOneWeek">thetaOneWeek.</param>
        /// <param name="vega">vega.</param>
        /// <param name="leverage">leverage.</param>
        /// <param name="omega">omega.</param>
        /// <param name="impliedVolatility">impliedVolatility.</param>
        /// <param name="intrinsicValue">intrinsicValue.</param>
        /// <param name="timeValue">timeValue.</param>
        /// <param name="outperformancePoint">outperformancePoint.</param>
        /// <param name="parity">parity.</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYield bonusYield = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYield), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield sidewaysYield = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYield maximumYield = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYield), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgio agio = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgio), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscount discount = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscount), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEven breakEven = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEven), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpread spread = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpread), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta delta = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek thetaOneWeek = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVega vega = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVega), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresLeverage leverage = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresLeverage), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega omega = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresImpliedVolatility impliedVolatility = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresImpliedVolatility), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresIntrinsicValue intrinsicValue = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresIntrinsicValue), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresTimeValue timeValue = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresTimeValue), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOutperformancePoint outperformancePoint = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOutperformancePoint), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresParity parity = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresParity))
        {
            this.BonusYield = bonusYield;
            this.SidewaysYield = sidewaysYield;
            this.MaximumYield = maximumYield;
            this.Agio = agio;
            this.Discount = discount;
            this.BreakEven = breakEven;
            this.Spread = spread;
            this.Delta = delta;
            this.ThetaOneWeek = thetaOneWeek;
            this.Vega = vega;
            this.Leverage = leverage;
            this.Omega = omega;
            this.ImpliedVolatility = impliedVolatility;
            this.IntrinsicValue = intrinsicValue;
            this.TimeValue = timeValue;
            this.OutperformancePoint = outperformancePoint;
            this.Parity = parity;
        }

        /// <summary>
        /// Gets or Sets BonusYield
        /// </summary>
        [DataMember(Name = "bonusYield", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYield BonusYield { get; set; }

        /// <summary>
        /// Gets or Sets SidewaysYield
        /// </summary>
        [DataMember(Name = "sidewaysYield", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield SidewaysYield { get; set; }

        /// <summary>
        /// Gets or Sets MaximumYield
        /// </summary>
        [DataMember(Name = "maximumYield", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresMaximumYield MaximumYield { get; set; }

        /// <summary>
        /// Gets or Sets Agio
        /// </summary>
        [DataMember(Name = "agio", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresAgio Agio { get; set; }

        /// <summary>
        /// Gets or Sets Discount
        /// </summary>
        [DataMember(Name = "discount", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDiscount Discount { get; set; }

        /// <summary>
        /// Gets or Sets BreakEven
        /// </summary>
        [DataMember(Name = "breakEven", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBreakEven BreakEven { get; set; }

        /// <summary>
        /// Gets or Sets Spread
        /// </summary>
        [DataMember(Name = "spread", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSpread Spread { get; set; }

        /// <summary>
        /// Gets or Sets Delta
        /// </summary>
        [DataMember(Name = "delta", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta Delta { get; set; }

        /// <summary>
        /// Gets or Sets ThetaOneWeek
        /// </summary>
        [DataMember(Name = "thetaOneWeek", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek ThetaOneWeek { get; set; }

        /// <summary>
        /// Gets or Sets Vega
        /// </summary>
        [DataMember(Name = "vega", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresVega Vega { get; set; }

        /// <summary>
        /// Gets or Sets Leverage
        /// </summary>
        [DataMember(Name = "leverage", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresLeverage Leverage { get; set; }

        /// <summary>
        /// Gets or Sets Omega
        /// </summary>
        [DataMember(Name = "omega", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega Omega { get; set; }

        /// <summary>
        /// Gets or Sets ImpliedVolatility
        /// </summary>
        [DataMember(Name = "impliedVolatility", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresImpliedVolatility ImpliedVolatility { get; set; }

        /// <summary>
        /// Gets or Sets IntrinsicValue
        /// </summary>
        [DataMember(Name = "intrinsicValue", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresIntrinsicValue IntrinsicValue { get; set; }

        /// <summary>
        /// Gets or Sets TimeValue
        /// </summary>
        [DataMember(Name = "timeValue", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresTimeValue TimeValue { get; set; }

        /// <summary>
        /// Gets or Sets OutperformancePoint
        /// </summary>
        [DataMember(Name = "outperformancePoint", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOutperformancePoint OutperformancePoint { get; set; }

        /// <summary>
        /// Gets or Sets Parity
        /// </summary>
        [DataMember(Name = "parity", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresParity Parity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures {\n");
            sb.Append("  BonusYield: ").Append(BonusYield).Append("\n");
            sb.Append("  SidewaysYield: ").Append(SidewaysYield).Append("\n");
            sb.Append("  MaximumYield: ").Append(MaximumYield).Append("\n");
            sb.Append("  Agio: ").Append(Agio).Append("\n");
            sb.Append("  Discount: ").Append(Discount).Append("\n");
            sb.Append("  BreakEven: ").Append(BreakEven).Append("\n");
            sb.Append("  Spread: ").Append(Spread).Append("\n");
            sb.Append("  Delta: ").Append(Delta).Append("\n");
            sb.Append("  ThetaOneWeek: ").Append(ThetaOneWeek).Append("\n");
            sb.Append("  Vega: ").Append(Vega).Append("\n");
            sb.Append("  Leverage: ").Append(Leverage).Append("\n");
            sb.Append("  Omega: ").Append(Omega).Append("\n");
            sb.Append("  ImpliedVolatility: ").Append(ImpliedVolatility).Append("\n");
            sb.Append("  IntrinsicValue: ").Append(IntrinsicValue).Append("\n");
            sb.Append("  TimeValue: ").Append(TimeValue).Append("\n");
            sb.Append("  OutperformancePoint: ").Append(OutperformancePoint).Append("\n");
            sb.Append("  Parity: ").Append(Parity).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BonusYield == input.BonusYield ||
                    (this.BonusYield != null &&
                    this.BonusYield.Equals(input.BonusYield))
                ) && 
                (
                    this.SidewaysYield == input.SidewaysYield ||
                    (this.SidewaysYield != null &&
                    this.SidewaysYield.Equals(input.SidewaysYield))
                ) && 
                (
                    this.MaximumYield == input.MaximumYield ||
                    (this.MaximumYield != null &&
                    this.MaximumYield.Equals(input.MaximumYield))
                ) && 
                (
                    this.Agio == input.Agio ||
                    (this.Agio != null &&
                    this.Agio.Equals(input.Agio))
                ) && 
                (
                    this.Discount == input.Discount ||
                    (this.Discount != null &&
                    this.Discount.Equals(input.Discount))
                ) && 
                (
                    this.BreakEven == input.BreakEven ||
                    (this.BreakEven != null &&
                    this.BreakEven.Equals(input.BreakEven))
                ) && 
                (
                    this.Spread == input.Spread ||
                    (this.Spread != null &&
                    this.Spread.Equals(input.Spread))
                ) && 
                (
                    this.Delta == input.Delta ||
                    (this.Delta != null &&
                    this.Delta.Equals(input.Delta))
                ) && 
                (
                    this.ThetaOneWeek == input.ThetaOneWeek ||
                    (this.ThetaOneWeek != null &&
                    this.ThetaOneWeek.Equals(input.ThetaOneWeek))
                ) && 
                (
                    this.Vega == input.Vega ||
                    (this.Vega != null &&
                    this.Vega.Equals(input.Vega))
                ) && 
                (
                    this.Leverage == input.Leverage ||
                    (this.Leverage != null &&
                    this.Leverage.Equals(input.Leverage))
                ) && 
                (
                    this.Omega == input.Omega ||
                    (this.Omega != null &&
                    this.Omega.Equals(input.Omega))
                ) && 
                (
                    this.ImpliedVolatility == input.ImpliedVolatility ||
                    (this.ImpliedVolatility != null &&
                    this.ImpliedVolatility.Equals(input.ImpliedVolatility))
                ) && 
                (
                    this.IntrinsicValue == input.IntrinsicValue ||
                    (this.IntrinsicValue != null &&
                    this.IntrinsicValue.Equals(input.IntrinsicValue))
                ) && 
                (
                    this.TimeValue == input.TimeValue ||
                    (this.TimeValue != null &&
                    this.TimeValue.Equals(input.TimeValue))
                ) && 
                (
                    this.OutperformancePoint == input.OutperformancePoint ||
                    (this.OutperformancePoint != null &&
                    this.OutperformancePoint.Equals(input.OutperformancePoint))
                ) && 
                (
                    this.Parity == input.Parity ||
                    (this.Parity != null &&
                    this.Parity.Equals(input.Parity))
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
                if (this.BonusYield != null)
                {
                    hashCode = (hashCode * 59) + this.BonusYield.GetHashCode();
                }
                if (this.SidewaysYield != null)
                {
                    hashCode = (hashCode * 59) + this.SidewaysYield.GetHashCode();
                }
                if (this.MaximumYield != null)
                {
                    hashCode = (hashCode * 59) + this.MaximumYield.GetHashCode();
                }
                if (this.Agio != null)
                {
                    hashCode = (hashCode * 59) + this.Agio.GetHashCode();
                }
                if (this.Discount != null)
                {
                    hashCode = (hashCode * 59) + this.Discount.GetHashCode();
                }
                if (this.BreakEven != null)
                {
                    hashCode = (hashCode * 59) + this.BreakEven.GetHashCode();
                }
                if (this.Spread != null)
                {
                    hashCode = (hashCode * 59) + this.Spread.GetHashCode();
                }
                if (this.Delta != null)
                {
                    hashCode = (hashCode * 59) + this.Delta.GetHashCode();
                }
                if (this.ThetaOneWeek != null)
                {
                    hashCode = (hashCode * 59) + this.ThetaOneWeek.GetHashCode();
                }
                if (this.Vega != null)
                {
                    hashCode = (hashCode * 59) + this.Vega.GetHashCode();
                }
                if (this.Leverage != null)
                {
                    hashCode = (hashCode * 59) + this.Leverage.GetHashCode();
                }
                if (this.Omega != null)
                {
                    hashCode = (hashCode * 59) + this.Omega.GetHashCode();
                }
                if (this.ImpliedVolatility != null)
                {
                    hashCode = (hashCode * 59) + this.ImpliedVolatility.GetHashCode();
                }
                if (this.IntrinsicValue != null)
                {
                    hashCode = (hashCode * 59) + this.IntrinsicValue.GetHashCode();
                }
                if (this.TimeValue != null)
                {
                    hashCode = (hashCode * 59) + this.TimeValue.GetHashCode();
                }
                if (this.OutperformancePoint != null)
                {
                    hashCode = (hashCode * 59) + this.OutperformancePoint.GetHashCode();
                }
                if (this.Parity != null)
                {
                    hashCode = (hashCode * 59) + this.Parity.GetHashCode();
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
