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
    /// Maturity data.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_lifeCycle_maturity")]
    public partial class InlineResponse2004LifeCycleMaturity : IEquatable<InlineResponse2004LifeCycleMaturity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004LifeCycleMaturity" /> class.
        /// </summary>
        /// <param name="perpetual">Indicates whether the securitized derivative is perpetual, i.e. it does not mature (&#x60;true&#x60;), or is not perpetual (&#x60;false&#x60;)..</param>
        public InlineResponse2004LifeCycleMaturity(bool perpetual = default(bool))
        {
            this.Perpetual = perpetual;
        }

        /// <summary>
        /// Indicates whether the securitized derivative is perpetual, i.e. it does not mature (&#x60;true&#x60;), or is not perpetual (&#x60;false&#x60;).
        /// </summary>
        /// <value>Indicates whether the securitized derivative is perpetual, i.e. it does not mature (&#x60;true&#x60;), or is not perpetual (&#x60;false&#x60;).</value>
        [DataMember(Name = "perpetual", EmitDefaultValue = true)]
        public bool Perpetual { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004LifeCycleMaturity {\n");
            sb.Append("  Perpetual: ").Append(Perpetual).Append("\n");
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
            return this.Equals(input as InlineResponse2004LifeCycleMaturity);
        }

        /// <summary>
        /// Returns true if InlineResponse2004LifeCycleMaturity instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004LifeCycleMaturity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004LifeCycleMaturity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Perpetual == input.Perpetual ||
                    this.Perpetual.Equals(input.Perpetual)
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
                hashCode = (hashCode * 59) + this.Perpetual.GetHashCode();
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
