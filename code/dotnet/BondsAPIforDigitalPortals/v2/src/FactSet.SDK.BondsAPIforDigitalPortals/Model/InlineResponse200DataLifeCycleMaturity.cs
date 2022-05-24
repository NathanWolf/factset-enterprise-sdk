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
    /// Maturity data.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_lifeCycle_maturity")]
    public partial class InlineResponse200DataLifeCycleMaturity : IEquatable<InlineResponse200DataLifeCycleMaturity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataLifeCycleMaturity" /> class.
        /// </summary>
        /// <param name="date">Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual..</param>
        /// <param name="isPerpetual">If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null..</param>
        /// <param name="isCallable">If true, the issuer may redeem the instrument prior to maturity..</param>
        public InlineResponse200DataLifeCycleMaturity(DateTime date = default(DateTime), bool isPerpetual = default(bool), bool isCallable = default(bool))
        {
            this.Date = date;
            this.IsPerpetual = isPerpetual;
            this.IsCallable = isCallable;
        }

        /// <summary>
        /// Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual.
        /// </summary>
        /// <value>Date of the instrument&#39;s maturity. The value is empty if the instrument is perpetual.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null.
        /// </summary>
        /// <value>If true, the instrument is perpetual, i.e. it does not mature, therefore the attribute &#x60;date&#x60; is null.</value>
        [DataMember(Name = "isPerpetual", EmitDefaultValue = true)]
        public bool IsPerpetual { get; set; }

        /// <summary>
        /// If true, the issuer may redeem the instrument prior to maturity.
        /// </summary>
        /// <value>If true, the issuer may redeem the instrument prior to maturity.</value>
        [DataMember(Name = "isCallable", EmitDefaultValue = true)]
        public bool IsCallable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200DataLifeCycleMaturity {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  IsPerpetual: ").Append(IsPerpetual).Append("\n");
            sb.Append("  IsCallable: ").Append(IsCallable).Append("\n");
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
            return this.Equals(input as InlineResponse200DataLifeCycleMaturity);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataLifeCycleMaturity instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataLifeCycleMaturity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataLifeCycleMaturity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.IsPerpetual == input.IsPerpetual ||
                    this.IsPerpetual.Equals(input.IsPerpetual)
                ) && 
                (
                    this.IsCallable == input.IsCallable ||
                    this.IsCallable.Equals(input.IsCallable)
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
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsPerpetual.GetHashCode();
                hashCode = (hashCode * 59) + this.IsCallable.GetHashCode();
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
