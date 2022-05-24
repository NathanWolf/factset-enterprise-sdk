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
    /// OptimizerInputsMPExpectedReturnTerm
    /// </summary>
    [DataContract(Name = "optimizer.inputs.MPExpectedReturnTerm")]
    public partial class OptimizerInputsMPExpectedReturnTerm : IEquatable<OptimizerInputsMPExpectedReturnTerm>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsMPExpectedReturnTerm" /> class.
        /// </summary>
        /// <param name="term">term.</param>
        /// <param name="termOn">termOn.</param>
        /// <param name="annualizationFactor">annualizationFactor.</param>
        /// <param name="onPeriods">onPeriods.</param>
        /// <param name="acrossPeriods">acrossPeriods.</param>
        public OptimizerInputsMPExpectedReturnTerm(OptimizerInputsExpectedReturnTerm term = default(OptimizerInputsExpectedReturnTerm), OptimizerInputsBoundSourceEnum termOn = default(OptimizerInputsBoundSourceEnum), double annualizationFactor = default(double), OptimizerInputsOnPeriods onPeriods = default(OptimizerInputsOnPeriods), OptimizerInputsAcrossPeriods acrossPeriods = default(OptimizerInputsAcrossPeriods))
        {
            this.Term = term;
            this.TermOn = termOn;
            this.AnnualizationFactor = annualizationFactor;
            this.OnPeriods = onPeriods;
            this.AcrossPeriods = acrossPeriods;
        }

        /// <summary>
        /// Gets or Sets Term
        /// </summary>
        [DataMember(Name = "term", EmitDefaultValue = false)]
        public OptimizerInputsExpectedReturnTerm Term { get; set; }

        /// <summary>
        /// Gets or Sets TermOn
        /// </summary>
        [DataMember(Name = "term_on", EmitDefaultValue = false)]
        public OptimizerInputsBoundSourceEnum TermOn { get; set; }

        /// <summary>
        /// Gets or Sets AnnualizationFactor
        /// </summary>
        [DataMember(Name = "annualization_factor", EmitDefaultValue = false)]
        public double AnnualizationFactor { get; set; }

        /// <summary>
        /// Gets or Sets OnPeriods
        /// </summary>
        [DataMember(Name = "on_periods", EmitDefaultValue = false)]
        public OptimizerInputsOnPeriods OnPeriods { get; set; }

        /// <summary>
        /// Gets or Sets AcrossPeriods
        /// </summary>
        [DataMember(Name = "across_periods", EmitDefaultValue = false)]
        public OptimizerInputsAcrossPeriods AcrossPeriods { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsMPExpectedReturnTerm {\n");
            sb.Append("  Term: ").Append(Term).Append("\n");
            sb.Append("  TermOn: ").Append(TermOn).Append("\n");
            sb.Append("  AnnualizationFactor: ").Append(AnnualizationFactor).Append("\n");
            sb.Append("  OnPeriods: ").Append(OnPeriods).Append("\n");
            sb.Append("  AcrossPeriods: ").Append(AcrossPeriods).Append("\n");
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
            return this.Equals(input as OptimizerInputsMPExpectedReturnTerm);
        }

        /// <summary>
        /// Returns true if OptimizerInputsMPExpectedReturnTerm instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsMPExpectedReturnTerm to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsMPExpectedReturnTerm input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Term == input.Term ||
                    (this.Term != null &&
                    this.Term.Equals(input.Term))
                ) && 
                (
                    this.TermOn == input.TermOn ||
                    (this.TermOn != null &&
                    this.TermOn.Equals(input.TermOn))
                ) && 
                (
                    this.AnnualizationFactor == input.AnnualizationFactor ||
                    this.AnnualizationFactor.Equals(input.AnnualizationFactor)
                ) && 
                (
                    this.OnPeriods == input.OnPeriods ||
                    (this.OnPeriods != null &&
                    this.OnPeriods.Equals(input.OnPeriods))
                ) && 
                (
                    this.AcrossPeriods == input.AcrossPeriods ||
                    (this.AcrossPeriods != null &&
                    this.AcrossPeriods.Equals(input.AcrossPeriods))
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
                if (this.Term != null)
                {
                    hashCode = (hashCode * 59) + this.Term.GetHashCode();
                }
                if (this.TermOn != null)
                {
                    hashCode = (hashCode * 59) + this.TermOn.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AnnualizationFactor.GetHashCode();
                if (this.OnPeriods != null)
                {
                    hashCode = (hashCode * 59) + this.OnPeriods.GetHashCode();
                }
                if (this.AcrossPeriods != null)
                {
                    hashCode = (hashCode * 59) + this.AcrossPeriods.GetHashCode();
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
