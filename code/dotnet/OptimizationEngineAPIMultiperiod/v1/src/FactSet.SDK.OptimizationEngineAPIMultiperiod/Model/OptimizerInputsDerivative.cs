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
    /// OptimizerInputsDerivative
    /// </summary>
    [DataContract(Name = "optimizer.inputs.Derivative")]
    public partial class OptimizerInputsDerivative : IEquatable<OptimizerInputsDerivative>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsDerivative" /> class.
        /// </summary>
        /// <param name="offsetIndex">Index of the offset. E.g. CASH_USD_FUT for Futures or 2nd leg for Forwards. -1 if no offset generated.</param>
        /// <param name="future">future.</param>
        /// <param name="forward">Nothing else is needed for forwards..</param>
        public OptimizerInputsDerivative(int offsetIndex = default(int), OptimizerInputsDerivativeFuture future = default(OptimizerInputsDerivativeFuture), bool forward = default(bool))
        {
            this.OffsetIndex = offsetIndex;
            this.Future = future;
            this.Forward = forward;
        }

        /// <summary>
        /// Index of the offset. E.g. CASH_USD_FUT for Futures or 2nd leg for Forwards. -1 if no offset generated
        /// </summary>
        /// <value>Index of the offset. E.g. CASH_USD_FUT for Futures or 2nd leg for Forwards. -1 if no offset generated</value>
        [DataMember(Name = "offset_index", EmitDefaultValue = false)]
        public int OffsetIndex { get; set; }

        /// <summary>
        /// Gets or Sets Future
        /// </summary>
        [DataMember(Name = "future", EmitDefaultValue = false)]
        public OptimizerInputsDerivativeFuture Future { get; set; }

        /// <summary>
        /// Nothing else is needed for forwards.
        /// </summary>
        /// <value>Nothing else is needed for forwards.</value>
        [DataMember(Name = "forward", EmitDefaultValue = true)]
        public bool Forward { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsDerivative {\n");
            sb.Append("  OffsetIndex: ").Append(OffsetIndex).Append("\n");
            sb.Append("  Future: ").Append(Future).Append("\n");
            sb.Append("  Forward: ").Append(Forward).Append("\n");
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
            return this.Equals(input as OptimizerInputsDerivative);
        }

        /// <summary>
        /// Returns true if OptimizerInputsDerivative instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsDerivative to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsDerivative input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OffsetIndex == input.OffsetIndex ||
                    this.OffsetIndex.Equals(input.OffsetIndex)
                ) && 
                (
                    this.Future == input.Future ||
                    (this.Future != null &&
                    this.Future.Equals(input.Future))
                ) && 
                (
                    this.Forward == input.Forward ||
                    this.Forward.Equals(input.Forward)
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
                hashCode = (hashCode * 59) + this.OffsetIndex.GetHashCode();
                if (this.Future != null)
                {
                    hashCode = (hashCode * 59) + this.Future.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Forward.GetHashCode();
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
