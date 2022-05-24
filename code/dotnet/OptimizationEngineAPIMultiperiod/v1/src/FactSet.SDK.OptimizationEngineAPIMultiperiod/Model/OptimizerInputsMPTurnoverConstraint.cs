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
    /// OptimizerInputsMPTurnoverConstraint
    /// </summary>
    [DataContract(Name = "optimizer.inputs.MPTurnoverConstraint")]
    public partial class OptimizerInputsMPTurnoverConstraint : IEquatable<OptimizerInputsMPTurnoverConstraint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsMPTurnoverConstraint" /> class.
        /// </summary>
        /// <param name="constraint">constraint.</param>
        /// <param name="onPeriods">onPeriods.</param>
        /// <param name="acrossPeriods">acrossPeriods.</param>
        public OptimizerInputsMPTurnoverConstraint(OptimizerInputsTurnoverConstraint constraint = default(OptimizerInputsTurnoverConstraint), OptimizerInputsOnPeriods onPeriods = default(OptimizerInputsOnPeriods), OptimizerInputsAcrossPeriods acrossPeriods = default(OptimizerInputsAcrossPeriods))
        {
            this.Constraint = constraint;
            this.OnPeriods = onPeriods;
            this.AcrossPeriods = acrossPeriods;
        }

        /// <summary>
        /// Gets or Sets Constraint
        /// </summary>
        [DataMember(Name = "constraint", EmitDefaultValue = false)]
        public OptimizerInputsTurnoverConstraint Constraint { get; set; }

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
            sb.Append("class OptimizerInputsMPTurnoverConstraint {\n");
            sb.Append("  Constraint: ").Append(Constraint).Append("\n");
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
            return this.Equals(input as OptimizerInputsMPTurnoverConstraint);
        }

        /// <summary>
        /// Returns true if OptimizerInputsMPTurnoverConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsMPTurnoverConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsMPTurnoverConstraint input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Constraint == input.Constraint ||
                    (this.Constraint != null &&
                    this.Constraint.Equals(input.Constraint))
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
                if (this.Constraint != null)
                {
                    hashCode = (hashCode * 59) + this.Constraint.GetHashCode();
                }
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
