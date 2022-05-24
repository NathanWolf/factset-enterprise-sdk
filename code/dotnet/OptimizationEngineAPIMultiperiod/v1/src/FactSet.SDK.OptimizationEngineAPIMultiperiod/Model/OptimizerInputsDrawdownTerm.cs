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
    /// OptimizerInputsDrawdownTerm
    /// </summary>
    [DataContract(Name = "optimizer.inputs.DrawdownTerm")]
    public partial class OptimizerInputsDrawdownTerm : IEquatable<OptimizerInputsDrawdownTerm>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsDrawdownTerm" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="multiplier">multiplier.</param>
        /// <param name="direction">direction.</param>
        /// <param name="confidenceLevel">confidenceLevel.</param>
        public OptimizerInputsDrawdownTerm(string name = default(string), OptimizerInputsValue multiplier = default(OptimizerInputsValue), OptimizerInputsEObjectiveTermDirectionEnum direction = default(OptimizerInputsEObjectiveTermDirectionEnum), double confidenceLevel = default(double))
        {
            this.Name = name;
            this.Multiplier = multiplier;
            this.Direction = direction;
            this.ConfidenceLevel = confidenceLevel;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Multiplier
        /// </summary>
        [DataMember(Name = "multiplier", EmitDefaultValue = false)]
        public OptimizerInputsValue Multiplier { get; set; }

        /// <summary>
        /// Gets or Sets Direction
        /// </summary>
        [DataMember(Name = "direction", EmitDefaultValue = false)]
        public OptimizerInputsEObjectiveTermDirectionEnum Direction { get; set; }

        /// <summary>
        /// Gets or Sets ConfidenceLevel
        /// </summary>
        [DataMember(Name = "confidence_level", EmitDefaultValue = false)]
        public double ConfidenceLevel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsDrawdownTerm {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Multiplier: ").Append(Multiplier).Append("\n");
            sb.Append("  Direction: ").Append(Direction).Append("\n");
            sb.Append("  ConfidenceLevel: ").Append(ConfidenceLevel).Append("\n");
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
            return this.Equals(input as OptimizerInputsDrawdownTerm);
        }

        /// <summary>
        /// Returns true if OptimizerInputsDrawdownTerm instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsDrawdownTerm to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsDrawdownTerm input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Multiplier == input.Multiplier ||
                    (this.Multiplier != null &&
                    this.Multiplier.Equals(input.Multiplier))
                ) && 
                (
                    this.Direction == input.Direction ||
                    (this.Direction != null &&
                    this.Direction.Equals(input.Direction))
                ) && 
                (
                    this.ConfidenceLevel == input.ConfidenceLevel ||
                    this.ConfidenceLevel.Equals(input.ConfidenceLevel)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Multiplier != null)
                {
                    hashCode = (hashCode * 59) + this.Multiplier.GetHashCode();
                }
                if (this.Direction != null)
                {
                    hashCode = (hashCode * 59) + this.Direction.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ConfidenceLevel.GetHashCode();
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
